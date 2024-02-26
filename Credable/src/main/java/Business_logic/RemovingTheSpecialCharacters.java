package Business_logic;
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

import org.springframework.stereotype.Component;

@Component("LIC6730_PJT1001_PE_NLP767b8725-66a9-4131-9760-d7ddcff323e2")
public class RemovingTheSpecialCharacters implements Nlp {
    @InputParams({@InputParam(name = "SpecialChar", type = "java.lang.String"), @InputParam(name = "Value", type = "java.lang.String")})
    @ReturnType(name = "value", type = "java.lang.String")

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
          String SpecialChar = (String) attributes.get("SpecialChar");
          String Value = (String) attributes.get("Value");
          String value="";
       

      try {
    	value=  Value.replace(SpecialChar, "");
    		nlpResponseModel.setStatus(CommonConstants.pass);
			nlpResponseModel.setMessage("Successfully removed the Special Character Value");
      }catch(Exception e) {
    		nlpResponseModel.setStatus(CommonConstants.fail);
			nlpResponseModel.setMessage("Failed to remove the character the value");
    	  
      }

        
          nlpResponseModel.getAttributes().put("value", value);
          return nlpResponseModel;
      }
  } 