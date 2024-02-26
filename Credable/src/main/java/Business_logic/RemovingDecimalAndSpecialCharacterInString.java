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

@Component("LIC6730_PJT1001_PE_NLP0b77c10b-9213-44db-b478-90dc24f6e71d")
public class RemovingDecimalAndSpecialCharacterInString implements Nlp {
	@InputParams({ @InputParam(name = "value", type = "java.lang.String"),})
	@ReturnType(name = "returnValue", type = "java.lang.String")

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
		String value = (String) attributes.get("value");
		// String string2 = (String) attributes.get("string2");
		String numberString;
		String newNumberString2 = null;

		// Your program element business logic goes here ...
		try {
			numberString = value;
			newNumberString2 = numberString.replaceAll("[^\\d.]+\\.0$", "");
			nlpResponseModel.setStatus(CommonConstants.pass);
			nlpResponseModel.setMessage("Successfully removed the Special Character Value");

			
		} catch (Exception e) {
			nlpResponseModel.setStatus(CommonConstants.fail);
			nlpResponseModel.setMessage("Failed to remove the character in the value");
		}

		
		nlpResponseModel.getAttributes().put("returnValue", newNumberString2);
		return nlpResponseModel;
	}
}