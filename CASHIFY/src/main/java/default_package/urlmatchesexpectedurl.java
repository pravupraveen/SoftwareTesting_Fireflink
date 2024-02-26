package default_package;

import com.tyss.optimize.common.util.CommonConstants;
import com.tyss.optimize.nlp.util.Nlp;
import com.tyss.optimize.nlp.util.NlpException;
import com.tyss.optimize.nlp.util.NlpRequestModel;
import com.tyss.optimize.nlp.util.NlpResponseModel;
import com.tyss.optimize.nlp.util.annotation.InputParam;
import com.tyss.optimize.nlp.util.annotation.InputParams;
import com.tyss.optimize.nlp.util.annotation.ReturnType;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component(value="DefaultNlp")
public class urlmatchesexpectedurl implements Nlp {
    @InputParams({@InputParam(name = "url", type = "java.lang.String"),
    	@InputParam(name = "caseSentitive", type = "java.lang.String")})
    @ReturnType(name = "isMatched", type = "java.lang.String")

      @Override
    public List<String> getTestParameters() throws NlpException {
      List<String> params = new ArrayList<>();
      return params;
  }
  
   @Override
  public StringBuilder getTestCode() throws NlpException {
      StringBuilder sb = new StringBuilder();
      return sb;
  }
    @Override
    public NlpResponseModel execute(NlpRequestModel nlpRequestModel) throws NlpException {
      
        NlpResponseModel nlpResponseModel = new NlpResponseModel();
        Map<String, Object> attributes = nlpRequestModel.getAttributes();
      String url=(String) attributes.get("url");
      boolean caseSensitive =(boolean) attributes.get("caseSentitive");
      Boolean isMatched=null;
    try {
    	WebDriver driver=(WebDriver) nlpRequestModel.getDriver().getSpecificIDriver();
    String	actualurl=driver.getCurrentUrl();
    if(caseSensitive == true) {
    	if(url.equalsIgnoreCase(actualurl)) {
    		isMatched =true;
    		nlpResponseModel.setMessage("Actualurl matched with Expected url");
    		nlpResponseModel.setStatus(CommonConstants.pass);
    	}else {
    		nlpResponseModel.setMessage("Actualurl doesnot matched with Expected url");
    		nlpResponseModel.setStatus(CommonConstants.fail);
    	}
    	}else {
    	if(url.equals(actualurl)) {
    		isMatched =true;
    		nlpResponseModel.setMessage("Actualurl matched with Expected url");
    		nlpResponseModel.setStatus(CommonConstants.pass);
    	}else {
    		isMatched =false;
    		nlpResponseModel.setMessage("Actualurl doesnot matched with Expected url");
    		nlpResponseModel.setStatus(CommonConstants.fail);
    	}		
    }
    }
    catch(Exception e) {
    	isMatched =false;
		nlpResponseModel.setMessage("Actualurl doesnot matched with Expected url");
		nlpResponseModel.setStatus(CommonConstants.fail);
    	
    }
    nlpResponseModel.getAttributes().put("isMatched", isMatched);
    return nlpResponseModel;
    
    }
} 

