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
public class urlcontainsexpectedurl implements Nlp {
    @InputParams({@InputParam(name = "url", type = "java.lang.String")})

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
       String url=(String)attributes.get("url");
       try {
    	   WebDriver driver =(WebDriver) nlpRequestModel.getDriver().getSpecificIDriver();
    	   String actualUrl = driver.getCurrentUrl();
    	   if(actualUrl.contains(actualUrl)) {
    		   nlpResponseModel.setMessage("actualUrl contains Expected url");
    		   nlpResponseModel.setStatus(CommonConstants.pass);
    	   }
    	   else {
    		   nlpResponseModel.setMessage("actualUrl doesnot contains Expected url");
    		 nlpResponseModel.setStatus(CommonConstants.fail);
    	   }
       }
       catch(Exception e) {
    	   nlpResponseModel.setMessage("failed to fetch actual url");
    	   nlpResponseModel.setStatus(CommonConstants.fail);
    	   
       }
	return nlpResponseModel;
        
    }
}  
