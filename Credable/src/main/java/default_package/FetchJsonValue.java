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

@Component("LIC6730_PJT1001_PE_NLPd943cb66-cc1e-4757-969c-69485dba5e4f")
public class FetchJsonValue implements Nlp {
	@InputParams({ @InputParam(name = "Json Key", type = "java.lang.String"),
			@InputParam(name = "Json Object", type = "org.json.simple.JSONObject") })
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
			String key = (String) attributes.get("Json Key");
			JSONObject jsonObject = (JSONObject) attributes.get("Json Object");
			String jsonString = jsonObject.toString();
			log.info("Input json string is: {}", jsonObject);
			String[] allComponents = jsonString.split(key);
			
			for (int i = 1; i < allComponents.length; i++) {
				String value = ((((allComponents[i].split(",")[0])).split(":")[1]).split(",")[0]).replaceAll("[\"&}&\\]&\\s+?]", "");
				log.info("Adding value: {}", value);
				values.add(value);
			}
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
