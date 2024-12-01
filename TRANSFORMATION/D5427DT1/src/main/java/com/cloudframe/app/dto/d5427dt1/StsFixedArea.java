package com.cloudframe.app.dto.d5427dt1;

/**
*  The class StsFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class StsFixedArea extends StsFixedAreaSerialized { 
   

						private char[] stsRespProgramName = Field.fillLowValue(8);

						private char[] stsRespCode = Field.fillLowValue(4);
				private StsResponseVars stsResponseVars = new StsResponseVars();
				private StsDsmCommonArea stsDsmCommonArea = new StsDsmCommonArea();
	
	/**
	* Constructor for StsFixedArea
	**/
    public StsFixedArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StsFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			stsResponseVars.setParent(this,getStartOffset() + 12);
	       			stsDsmCommonArea.setParent(this,getStartOffset() + 310);
    } 

	/**
	 *	Returns the value of stsRespProgramName
	 *	@return stsRespProgramName
	 */
   public char[] getStsRespProgramName() throws CFException{
     if (isStsRespProgramNameModified()) { 
        stsRespProgramName = refreshStsRespProgramName();
     }
   		return stsRespProgramName;
   }

  
	/**
	*  set variable stsRespProgramName
	*  Corresponding COBOL Variable is STS-RESP-PROGRAM-NAME
	*  @param value
	**/
   public void setStsRespProgramName(char[] value) {
      stsRespProgramName = checkStsRespProgramNameConstraints(value);
      serializeStsRespProgramName(stsRespProgramName);
   } 

     /**
	 * 	Update StsRespProgramName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsRespProgramName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsRespProgramName,stsRespProgramName.length);
   	
   }
   
   public void setStsRespProgramName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespProgramName,stsRespProgramName.length);
   	
   }
   
     /**
	 * 	Update StsRespProgramName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsRespProgramName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespProgramName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsRespProgramName with another Field
	 *	@param value
	 */
   public void setStsRespProgramName(Field source) {
       replace(source,0,source.length(),beginStsRespProgramName,STS_RESP_PROGRAM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update StsRespProgramName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsRespProgramName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsRespProgramName,STS_RESP_PROGRAM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update StsRespProgramName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsRespProgramName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespProgramName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsRespCode
	 *	@return stsRespCode
	 */
   public char[] getStsRespCode() throws CFException{
     if (isStsRespCodeModified()) { 
        stsRespCode = refreshStsRespCode();
     }
   		return stsRespCode;
   }

  
	/**
	*  set variable stsRespCode
	*  Corresponding COBOL Variable is STS-RESP-CODE
	*  @param value
	**/
   public void setStsRespCode(char[] value) {
      stsRespCode = checkStsRespCodeConstraints(value);
      serializeStsRespCode(stsRespCode);
   } 

     /**
	 * 	Update StsRespCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsRespCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsRespCode,stsRespCode.length);
   	
   }
   
   public void setStsRespCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespCode,stsRespCode.length);
   	
   }
   
     /**
	 * 	Update StsRespCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsRespCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsRespCode with another Field
	 *	@param value
	 */
   public void setStsRespCode(Field source) {
       replace(source,0,source.length(),beginStsRespCode,STS_RESP_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update StsRespCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsRespCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsRespCode,STS_RESP_CODE_LEN);
   	
   }
   
     /**
	 * 	Update StsRespCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsRespCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespCode+targetIndex,targetLen);
    
   }
	char[] stsRespCodeOk88Value = "0000".toCharArray();
	/**
	 *	Test condition "0000" for isStsRespCodeOk()
	 *	@return  Returns true if isStsRespCodeOk() is "0000"
	 */
   public boolean isStsRespCodeOk() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeOk88Value)  == 0  );
   }


	/**
	*  set values "0000"
	*/
   	public void setStsRespCodeOkTrue() {  			
    	setStsRespCode( stsRespCodeOk88Value);
   	}
	char[] stsRespCodeCommarea88Value = "9001".toCharArray();
	/**
	 *	Test condition "9001" for isStsRespCodeCommarea()
	 *	@return  Returns true if isStsRespCodeCommarea() is "9001"
	 */
   public boolean isStsRespCodeCommarea() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeCommarea88Value)  == 0  );
   }


	/**
	*  set values "9001"
	*/
   	public void setStsRespCodeCommareaTrue() {  			
    	setStsRespCode( stsRespCodeCommarea88Value);
   	}
	char[] stsRespCodeNullcont88Value = "9002".toCharArray();
	/**
	 *	Test condition "9002" for isStsRespCodeNullcont()
	 *	@return  Returns true if isStsRespCodeNullcont() is "9002"
	 */
   public boolean isStsRespCodeNullcont() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeNullcont88Value)  == 0  );
   }


	/**
	*  set values "9002"
	*/
   	public void setStsRespCodeNullcontTrue() {  			
    	setStsRespCode( stsRespCodeNullcont88Value);
   	}
	char[] stsRespCodeChanname88Value = "9003".toCharArray();
	/**
	 *	Test condition "9003" for isStsRespCodeChanname()
	 *	@return  Returns true if isStsRespCodeChanname() is "9003"
	 */
   public boolean isStsRespCodeChanname() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeChanname88Value)  == 0  );
   }


	/**
	*  set values "9003"
	*/
   	public void setStsRespCodeChannameTrue() {  			
    	setStsRespCode( stsRespCodeChanname88Value);
   	}
	char[] stsRespCodeCicsresp88Value = "9004".toCharArray();
	/**
	 *	Test condition "9004" for isStsRespCodeCicsresp()
	 *	@return  Returns true if isStsRespCodeCicsresp() is "9004"
	 */
   public boolean isStsRespCodeCicsresp() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeCicsresp88Value)  == 0  );
   }


	/**
	*  set values "9004"
	*/
   	public void setStsRespCodeCicsrespTrue() {  			
    	setStsRespCode( stsRespCodeCicsresp88Value);
   	}
	char[] stsRespCodeGetError88Value = "9005".toCharArray();
	/**
	 *	Test condition "9005" for isStsRespCodeGetError()
	 *	@return  Returns true if isStsRespCodeGetError() is "9005"
	 */
   public boolean isStsRespCodeGetError() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeGetError88Value)  == 0  );
   }


	/**
	*  set values "9005"
	*/
   	public void setStsRespCodeGetErrorTrue() {  			
    	setStsRespCode( stsRespCodeGetError88Value);
   	}
	char[] stsRespCodePutError88Value = "9006".toCharArray();
	/**
	 *	Test condition "9006" for isStsRespCodePutError()
	 *	@return  Returns true if isStsRespCodePutError() is "9006"
	 */
   public boolean isStsRespCodePutError() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodePutError88Value)  == 0  );
   }


	/**
	*  set values "9006"
	*/
   	public void setStsRespCodePutErrorTrue() {  			
    	setStsRespCode( stsRespCodePutError88Value);
   	}
	char[] stsRespCodeDb2Error88Value = "9010".toCharArray();
	/**
	 *	Test condition "9010" for isStsRespCodeDb2Error()
	 *	@return  Returns true if isStsRespCodeDb2Error() is "9010"
	 */
   public boolean isStsRespCodeDb2Error() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeDb2Error88Value)  == 0  );
   }


	/**
	*  set values "9010"
	*/
   	public void setStsRespCodeDb2ErrorTrue() {  			
    	setStsRespCode( stsRespCodeDb2Error88Value);
   	}
	char[] stsRespCodeProgramError88Value = "9901".toCharArray();
	/**
	 *	Test condition "9901" for isStsRespCodeProgramError()
	 *	@return  Returns true if isStsRespCodeProgramError() is "9901"
	 */
   public boolean isStsRespCodeProgramError() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeProgramError88Value)  == 0  );
   }


	/**
	*  set values "9901"
	*/
   	public void setStsRespCodeProgramErrorTrue() {  			
    	setStsRespCode( stsRespCodeProgramError88Value);
   	}
	char[] stsRespCodeCallException88Value = "9902".toCharArray();
	/**
	 *	Test condition "9902" for isStsRespCodeCallException()
	 *	@return  Returns true if isStsRespCodeCallException() is "9902"
	 */
   public boolean isStsRespCodeCallException() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeCallException88Value)  == 0  );
   }


	/**
	*  set values "9902"
	*/
   	public void setStsRespCodeCallExceptionTrue() {  			
    	setStsRespCode( stsRespCodeCallException88Value);
   	}
	char[] stsRespCodeTranAbend88Value = "9999".toCharArray();
	/**
	 *	Test condition "9999" for isStsRespCodeTranAbend()
	 *	@return  Returns true if isStsRespCodeTranAbend() is "9999"
	 */
   public boolean isStsRespCodeTranAbend() throws CFException {
      return (  compareChars( getStsRespCode() , stsRespCodeTranAbend88Value)  == 0  );
   }


	/**
	*  set values "9999"
	*/
   	public void setStsRespCodeTranAbendTrue() {  			
    	setStsRespCode( stsRespCodeTranAbend88Value);
   	}
	/**
	 *	Returns the value of stsResponseVars
	 *	@return stsResponseVars
	 */   
	 public StsResponseVars getStsResponseVars() {
   	return stsResponseVars;
   }
   /**
	* 	Update StsResponseVars with the passed value
	*   Corresponding COBOL Variable is STS-RESPONSE-VARS
	*	@param value
	*/
   public void setStsResponseVars(char[] value) {
      stsResponseVars.setString(value); 
   }   
    
     /**
	 * 	Update StsResponseVars 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStsResponseVars(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsResponseVars.begin,stsResponseVars.length());
   }
   
     /**
	 * 	Update StsResponseVars 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsResponseVars(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsResponseVars.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StsResponseVars with another Field
	 *	@param value
	 */
   public void setStsResponseVars(Field source) {
   	replace(source,0,source.length(),stsResponseVars.begin,stsResponseVars.length());
   }  
   
     /**
	 * 	Update StsResponseVars 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStsResponseVars(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsResponseVars.begin,stsResponseVars.length());
   }
   
     /**
	 * 	Update StsResponseVars 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsResponseVars(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsResponseVars.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of stsDsmCommonArea
	 *	@return stsDsmCommonArea
	 */   
	 public StsDsmCommonArea getStsDsmCommonArea() {
   	return stsDsmCommonArea;
   }
   /**
	* 	Update StsDsmCommonArea with the passed value
	*   Corresponding COBOL Variable is STS-DSM-COMMON-AREA
	*	@param value
	*/
   public void setStsDsmCommonArea(char[] value) {
      stsDsmCommonArea.setString(value); 
   }   
    
     /**
	 * 	Update StsDsmCommonArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStsDsmCommonArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmCommonArea.begin,stsDsmCommonArea.length());
   }
   
     /**
	 * 	Update StsDsmCommonArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmCommonArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmCommonArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StsDsmCommonArea with another Field
	 *	@param value
	 */
   public void setStsDsmCommonArea(Field source) {
   	replace(source,0,source.length(),stsDsmCommonArea.begin,stsDsmCommonArea.length());
   }  
   
     /**
	 * 	Update StsDsmCommonArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStsDsmCommonArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmCommonArea.begin,stsDsmCommonArea.length());
   }
   
     /**
	 * 	Update StsDsmCommonArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmCommonArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmCommonArea.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes StsFixedArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setStsRespProgramName(CONSTANTS.SPACE_8);
         setStsRespCode(CONSTANTS.SPACE_4);
          stsResponseVars.initialize();
     
          stsDsmCommonArea.initialize();
     
   }

		public static int getStsFixedAreaFieldLength() {
			return STS_FIXED_AREA_LENGTH;
		}

}
  
