package Buisness_logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tyss.optimize.common.util.CommonConstants;
import com.tyss.optimize.nlp.util.Nlp;
import com.tyss.optimize.nlp.util.NlpException;
import com.tyss.optimize.nlp.util.NlpRequestModel;
import com.tyss.optimize.nlp.util.NlpResponseModel;
import com.tyss.optimize.nlp.util.annotation.InputParam;
import com.tyss.optimize.nlp.util.annotation.InputParams;
import com.tyss.optimize.nlp.util.annotation.ReturnType;

public class Mob_mtm_Calculation implements Nlp {
	@InputParams({ @InputParam(name = "LTP", type = "java.lang.Double"),
	@InputParam(name = "Day/Net_mtm", type = "java.lang.String"),
	@InputParam(name = "Previous Close/Buy Rate", type = "java.lang.Double"),
	@InputParam(name = "Quantity", type = "java.lang.Double")})
	@ReturnType(name = "Assign this value to", type = "java.lang.Double")

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
		double num1 = (double) attributes.get("LTP");
		double num2 = (double) attributes.get("Previous Close/Buy Rate");
		String operation = (String) attributes.get("Day/Net_mtm");
		double num3 = (double) attributes.get("Quantity");
		double result=0;

		try {
			switch (operation) {
			case "Day MTM":
				result = (num1 - num2)*num3 ;
				nlpResponseModel.setMessage("The value for Day MTM " + result );
				nlpResponseModel.setStatus(CommonConstants.pass);
				break;
			case "Net MTM":
				result = (num1 - num2)*num3;
				nlpResponseModel.setMessage("The value for Net MTM " + result);
				nlpResponseModel.setStatus(CommonConstants.pass);
				break;
			
			default:
				nlpResponseModel.setMessage("Failed to fetch MtM value");
				nlpResponseModel.setStatus(CommonConstants.fail);
				break;
			}
		} catch (Exception e) {
			nlpResponseModel.setMessage("Failed to fetch MtM value");
			nlpResponseModel.setStatus(CommonConstants.fail);

		}

		nlpResponseModel.getAttributes().put("Assign this value to", result);
		return nlpResponseModel;
	}
}
