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
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.springframework.stereotype.Component;

@Component("LIC10185_PJT1003_PE_NLPd08ee791-7111-40f1-8699-3efc45c90c0f")
public class ExtractPDF implements Nlp {
    @InputParams({@InputParam(name = "filePath", type = "java.lang.String")})
    @ReturnType(name = "Text", type = "java.lang.String")

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
          String pdfFileInText="";
          
         

          // Your program element business logic goes here ...
          try {
        	  
        	  String filePath = (String) attributes.get("filePath");
        	     try (PDDocument document = PDDocument.load(new File(filePath))) {

        	            document.getClass();

        	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
        	                stripper.setSortByPosition(true);

        	                PDFTextStripper tStripper = new PDFTextStripper();

        	                 pdfFileInText = tStripper.getText(document);
        	       }

        	            
        		nlpResponseModel.setMessage("PDF extracted successfully");
    			nlpResponseModel.setStatus(CommonConstants.pass);
        	  
          }
          catch (Exception e) {
        	  nlpResponseModel.setMessage("failed to Extract PDF");
  			nlpResponseModel.setStatus(CommonConstants.fail);
          }

        
          nlpResponseModel.getAttributes().put("Text", pdfFileInText);
          return nlpResponseModel;
      }
  } 


