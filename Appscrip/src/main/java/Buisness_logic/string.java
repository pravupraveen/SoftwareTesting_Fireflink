
package Buisness_logic;

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


public class string implements Nlp {
    @InputParams({@InputParam(name = "intvalue", type = "java.lang.Integer")})
    @ReturnType(name = "svalue", type = "java.lang.String")

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
          Integer value = (Integer) attributes.get("intvalue");

   String a="";           
try {
	
	a=String.valueOf(value); 
	nlpResponseModel.setStatus(CommonConstants.pass);
	nlpResponseModel.setMessage("The Value is converted into string");
	
	
}
catch(Exception e) {
	nlpResponseModel.setStatus(CommonConstants.fail);
	nlpResponseModel.setMessage("The Value is Not converted into string");
	
}
          nlpResponseModel.getAttributes().put("svalue", a);
          return nlpResponseModel;
      }
  } 