package BusinessLogics_Web;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import com.tyss.optimize.common.util.CommonConstants;
import com.tyss.optimize.nlp.util.Nlp;
import com.tyss.optimize.nlp.util.NlpException;
import com.tyss.optimize.nlp.util.NlpRequestModel;
import com.tyss.optimize.nlp.util.NlpResponseModel;
import com.tyss.optimize.nlp.util.annotation.InputParam;
import com.tyss.optimize.nlp.util.annotation.InputParams;
import com.tyss.optimize.nlp.util.annotation.ReturnType;
	
	  @Component(value="verifyPageContains")
	  public class DEMO implements Nlp {
	      private static final Object Url = null;
		@InputParams({@InputParam(name = "ExpectedUrl", type = "java.lang.String"), @InputParam(name = "casesensitive", type = "java.lang.Boolean")})
	      @ReturnType(name = "Matches", type = "java.lang.Boolean")
	
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
	          String expectedUrl = (String) attributes.get("ExpectedUrl");
	          Boolean casesensitive = (Boolean) attributes.get("casesensitive");
	
	          // Your program element business logic goes here ...
	
       	  Boolean matched=null;
	          try {
	        	  WebDriver driver=(WebDriver) nlpRequestModel.getDriver().getSpecificIDriver();
	        	  	String actualUrl=driver.getCurrentUrl();
				if(casesensitive) {
	      		  if(actualUrl.contains(expectedUrl)) {
	      			  matched=true;
	      			 nlpResponseModel.setMessage("Excepted Url and Actual Url are matched");
		        	  nlpResponseModel.setStatus(CommonConstants.pass);
		        
	      		  }
	      			  else {
	      				 matched=false;
	      				 nlpResponseModel.setMessage("Failed");
	   	        	  nlpResponseModel.setStatus(CommonConstants.fail);
	   	        
	      			  }
	      		  }
				
	      			  else {
	      				  if((actualUrl.toLowerCase()).contains(expectedUrl.toLowerCase())) {
	      					 matched=true;
	      					 nlpResponseModel.setMessage("Excepted Url and Actual Url are matched");
	      		        	  nlpResponseModel.setStatus(CommonConstants.pass);
	      				  }
	      				  else {
	      					 matched=false;
	      					 nlpResponseModel.setMessage("Failed");
	      		        	  nlpResponseModel.setStatus(CommonConstants.fail);
	      		        
	      			  }
	      				  
	      			  }
	        	 
	          }catch(Exception e) {
	        	  nlpResponseModel.setMessage("Failed to match Excepted Url and Actual Url");
	        	  nlpResponseModel.setStatus(CommonConstants.fail);
	         }
	          nlpResponseModel.getAttributes().put("Matches",matched);
	          return nlpResponseModel;
	      }
	  } 

