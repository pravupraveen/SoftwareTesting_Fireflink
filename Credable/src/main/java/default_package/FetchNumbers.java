package default_package;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

import com.tyss.optimize.common.util.CommonConstants;
import com.tyss.optimize.nlp.util.Nlp;
import com.tyss.optimize.nlp.util.NlpException;
import com.tyss.optimize.nlp.util.NlpRequestModel;
import com.tyss.optimize.nlp.util.NlpResponseModel;
import com.tyss.optimize.nlp.util.annotation.InputParam;
import com.tyss.optimize.nlp.util.annotation.InputParams;
import com.tyss.optimize.nlp.util.annotation.ReturnType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("LIC6730_PJT1001_PE_NLPf400a02c-ebe4-418a-8343-b357dd985e66")
public class FetchNumbers implements Nlp {
	@InputParams({ @InputParam(name = "Json Object", type = "org.json.simple.JSONObject") })
	@ReturnType(name = "Values", type = "java.lang.List<String>")

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
		List<String> values = new ArrayList<>();
		try {
			JSONObject jsonObject = (JSONObject) attributes.get("Json Object");
			String jsonString = jsonObject.toString();
			values.add(jsonString.replaceAll("[^0-9?]", ""));
			log.info("List is: {}", values.toString());
			nlpResponseModel.setStatus(CommonConstants.pass);
			nlpResponseModel.setMessage("Successfully fetched json values");
		} catch (Exception e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			log.error("Exception is: {}", sw);
			nlpResponseModel.setStatus(CommonConstants.fail);
			nlpResponseModel.setMessage("Failed to fetch json values");
		}
		nlpResponseModel.getAttributes().put("Values", values);
		return nlpResponseModel;
	}
}
