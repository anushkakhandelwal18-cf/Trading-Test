package com.cloudframe.app.dto.d5427dt1;

/**
*  The class StsResponseVars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class StsResponseVars extends StsResponseVarsSerialized { 
   

						private char[] stsRespMessageType = Field.fillLowValue(1);

						private char[] stsRespAdditionalInfo1 = Field.fillLowValue(100);

						private char[] stsRespAdditionalInfo2 = Field.fillLowValue(100);

						private char[] stsRespDataValue = Field.fillLowValue(30);

								private long stsCicsresp;

								private long stsCicsresp2;

								private long stsEibtaskn;

								private long stsSqlcode;

						private char[] stsSqlstate = Field.fillLowValue(5);

						private char[] stsParagraph = Field.fillLowValue(30);
	
	/**
	* Constructor for StsResponseVars
	**/
    public StsResponseVars() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StsResponseVars. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsResponseVars(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of stsRespMessageType
	 *	@return stsRespMessageType
	 */
   public char[] getStsRespMessageType() throws CFException{
     if (isStsRespMessageTypeModified()) { 
        stsRespMessageType = refreshStsRespMessageType();
     }
   		return stsRespMessageType;
   }

  
	/**
	*  set variable stsRespMessageType
	*  Corresponding COBOL Variable is STS-RESP-MESSAGE-TYPE
	*  @param value
	**/
   public void setStsRespMessageType(char[] value) {
      stsRespMessageType = checkStsRespMessageTypeConstraints(value);
      serializeStsRespMessageType(stsRespMessageType);
   } 

     /**
	 * 	Update StsRespMessageType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsRespMessageType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsRespMessageType,stsRespMessageType.length);
   	
   }
   
   public void setStsRespMessageType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespMessageType,stsRespMessageType.length);
   	
   }
   
     /**
	 * 	Update StsRespMessageType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsRespMessageType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespMessageType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsRespMessageType with another Field
	 *	@param value
	 */
   public void setStsRespMessageType(Field source) {
       replace(source,0,source.length(),beginStsRespMessageType,STS_RESP_MESSAGE_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update StsRespMessageType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsRespMessageType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsRespMessageType,STS_RESP_MESSAGE_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update StsRespMessageType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsRespMessageType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespMessageType+targetIndex,targetLen);
    
   }
	char[] stsRespMessageAppl88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isStsRespMessageAppl()
	 *	@return  Returns true if isStsRespMessageAppl() is "A"
	 */
   public boolean isStsRespMessageAppl() throws CFException {
      return (  compareChars( getStsRespMessageType() , stsRespMessageAppl88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setStsRespMessageApplTrue() {  			
    	setStsRespMessageType( stsRespMessageAppl88Value);
   	}
	char[] stsRespMessageCics88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isStsRespMessageCics()
	 *	@return  Returns true if isStsRespMessageCics() is "C"
	 */
   public boolean isStsRespMessageCics() throws CFException {
      return (  compareChars( getStsRespMessageType() , stsRespMessageCics88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setStsRespMessageCicsTrue() {  			
    	setStsRespMessageType( stsRespMessageCics88Value);
   	}
	char[] stsRespMessageDb288Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isStsRespMessageDb2()
	 *	@return  Returns true if isStsRespMessageDb2() is "D"
	 */
   public boolean isStsRespMessageDb2() throws CFException {
      return (  compareChars( getStsRespMessageType() , stsRespMessageDb288Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setStsRespMessageDb2True() {  			
    	setStsRespMessageType( stsRespMessageDb288Value);
   	}
	char[] stsRespMessageMq88Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isStsRespMessageMq()
	 *	@return  Returns true if isStsRespMessageMq() is "M"
	 */
   public boolean isStsRespMessageMq() throws CFException {
      return (  compareChars( getStsRespMessageType() , stsRespMessageMq88Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setStsRespMessageMqTrue() {  			
    	setStsRespMessageType( stsRespMessageMq88Value);
   	}
	char[] stsRespMessageValid88Value1 = "A".toCharArray();
char[] stsRespMessageValid88Value2 = "C".toCharArray();
char[] stsRespMessageValid88Value3 = "D".toCharArray();
char[] stsRespMessageValid88Value4 = "M".toCharArray();

	/**
	 *	Test condition "A" "C" "D" "M" for isStsRespMessageValid()
	 *	@return  Returns true if isStsRespMessageValid() is "A" "C" "D" "M"
	 */
   public boolean isStsRespMessageValid() throws CFException {
      return (  compareChars( getStsRespMessageType() , stsRespMessageValid88Value1)  == 0  ||  compareChars( getStsRespMessageType() , stsRespMessageValid88Value2)  == 0  ||  compareChars( getStsRespMessageType() , stsRespMessageValid88Value3)  == 0  ||  compareChars( getStsRespMessageType() , stsRespMessageValid88Value4)  == 0  );
   }


	/**
	*  set values "A" "C" "D" "M"
	*/
   	public void setStsRespMessageValidTrue() {  			
    	setStsRespMessageType( stsRespMessageValid88Value1);
   	}
	/**
	 *	Returns the value of stsRespAdditionalInfo1
	 *	@return stsRespAdditionalInfo1
	 */
   public char[] getStsRespAdditionalInfo1() throws CFException{
     if (isStsRespAdditionalInfo1Modified()) { 
        stsRespAdditionalInfo1 = refreshStsRespAdditionalInfo1();
     }
   		return stsRespAdditionalInfo1;
   }

  
	/**
	*  set variable stsRespAdditionalInfo1
	*  Corresponding COBOL Variable is STS-RESP-ADDITIONAL-INFO-1
	*  @param value
	**/
   public void setStsRespAdditionalInfo1(char[] value) {
      stsRespAdditionalInfo1 = checkStsRespAdditionalInfo1Constraints(value);
      serializeStsRespAdditionalInfo1(stsRespAdditionalInfo1);
   } 

     /**
	 * 	Update StsRespAdditionalInfo1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsRespAdditionalInfo1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsRespAdditionalInfo1,stsRespAdditionalInfo1.length);
   	
   }
   
   public void setStsRespAdditionalInfo1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespAdditionalInfo1,stsRespAdditionalInfo1.length);
   	
   }
   
     /**
	 * 	Update StsRespAdditionalInfo1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsRespAdditionalInfo1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespAdditionalInfo1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsRespAdditionalInfo1 with another Field
	 *	@param value
	 */
   public void setStsRespAdditionalInfo1(Field source) {
       replace(source,0,source.length(),beginStsRespAdditionalInfo1,STS_RESP_ADDITIONAL_INFO_1_LEN);
   	
   }  
   
     /**
	 * 	Update StsRespAdditionalInfo1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsRespAdditionalInfo1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsRespAdditionalInfo1,STS_RESP_ADDITIONAL_INFO_1_LEN);
   	
   }
   
     /**
	 * 	Update StsRespAdditionalInfo1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsRespAdditionalInfo1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespAdditionalInfo1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsRespAdditionalInfo2
	 *	@return stsRespAdditionalInfo2
	 */
   public char[] getStsRespAdditionalInfo2() throws CFException{
     if (isStsRespAdditionalInfo2Modified()) { 
        stsRespAdditionalInfo2 = refreshStsRespAdditionalInfo2();
     }
   		return stsRespAdditionalInfo2;
   }

  
	/**
	*  set variable stsRespAdditionalInfo2
	*  Corresponding COBOL Variable is STS-RESP-ADDITIONAL-INFO-2
	*  @param value
	**/
   public void setStsRespAdditionalInfo2(char[] value) {
      stsRespAdditionalInfo2 = checkStsRespAdditionalInfo2Constraints(value);
      serializeStsRespAdditionalInfo2(stsRespAdditionalInfo2);
   } 

     /**
	 * 	Update StsRespAdditionalInfo2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsRespAdditionalInfo2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsRespAdditionalInfo2,stsRespAdditionalInfo2.length);
   	
   }
   
   public void setStsRespAdditionalInfo2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespAdditionalInfo2,stsRespAdditionalInfo2.length);
   	
   }
   
     /**
	 * 	Update StsRespAdditionalInfo2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsRespAdditionalInfo2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespAdditionalInfo2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsRespAdditionalInfo2 with another Field
	 *	@param value
	 */
   public void setStsRespAdditionalInfo2(Field source) {
       replace(source,0,source.length(),beginStsRespAdditionalInfo2,STS_RESP_ADDITIONAL_INFO_2_LEN);
   	
   }  
   
     /**
	 * 	Update StsRespAdditionalInfo2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsRespAdditionalInfo2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsRespAdditionalInfo2,STS_RESP_ADDITIONAL_INFO_2_LEN);
   	
   }
   
     /**
	 * 	Update StsRespAdditionalInfo2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsRespAdditionalInfo2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespAdditionalInfo2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsRespDataValue
	 *	@return stsRespDataValue
	 */
   public char[] getStsRespDataValue() throws CFException{
     if (isStsRespDataValueModified()) { 
        stsRespDataValue = refreshStsRespDataValue();
     }
   		return stsRespDataValue;
   }

  
	/**
	*  set variable stsRespDataValue
	*  Corresponding COBOL Variable is STS-RESP-DATA-VALUE
	*  @param value
	**/
   public void setStsRespDataValue(char[] value) {
      stsRespDataValue = checkStsRespDataValueConstraints(value);
      serializeStsRespDataValue(stsRespDataValue);
   } 

     /**
	 * 	Update StsRespDataValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsRespDataValue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsRespDataValue,stsRespDataValue.length);
   	
   }
   
   public void setStsRespDataValue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespDataValue,stsRespDataValue.length);
   	
   }
   
     /**
	 * 	Update StsRespDataValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsRespDataValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespDataValue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsRespDataValue with another Field
	 *	@param value
	 */
   public void setStsRespDataValue(Field source) {
       replace(source,0,source.length(),beginStsRespDataValue,STS_RESP_DATA_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update StsRespDataValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsRespDataValue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsRespDataValue,STS_RESP_DATA_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update StsRespDataValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsRespDataValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRespDataValue+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsCicsresp
	 *	@return stsCicsresp
	 */
	public long getStsCicsresp() throws CFException {
       if (isStsCicsrespModified()) { 
           stsCicsresp = refreshStsCicsresp();
        }
   		return stsCicsresp;
	}
	

	
	   
	/**
	 * 	Update StsCicsresp with the passed value
	 *  Corresponding COBOL Variable is STS-CICSRESP
	 *	@param number
	 */
	public void setStsCicsresp(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    stsCicsresp = checkStsCicsrespMaxLimit(number); 
		serializeStsCicsresp(stsCicsresp);
	}
	

	/**
	 * 	Update StsCicsresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setStsCicsresp(char[] value) throws CFException {
		 stsCicsresp = serializeStsCicsresp(value);
	}
	/**
	 * 	Update StsCicsresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStsCicsrespString(char[] value) throws CFException {
		 setStsCicsresp(value);
	}
	/**
	 *	Returns the value of stsCicsresp2
	 *	@return stsCicsresp2
	 */
	public long getStsCicsresp2() throws CFException {
       if (isStsCicsresp2Modified()) { 
           stsCicsresp2 = refreshStsCicsresp2();
        }
   		return stsCicsresp2;
	}
	

	
	   
	/**
	 * 	Update StsCicsresp2 with the passed value
	 *  Corresponding COBOL Variable is STS-CICSRESP2
	 *	@param number
	 */
	public void setStsCicsresp2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    stsCicsresp2 = checkStsCicsresp2MaxLimit(number); 
		serializeStsCicsresp2(stsCicsresp2);
	}
	

	/**
	 * 	Update StsCicsresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStsCicsresp2(char[] value) throws CFException {
		 stsCicsresp2 = serializeStsCicsresp2(value);
	}
	/**
	 * 	Update StsCicsresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStsCicsresp2String(char[] value) throws CFException {
		 setStsCicsresp2(value);
	}
	/**
	 *	Returns the value of stsEibtaskn
	 *	@return stsEibtaskn
	 */
	public long getStsEibtaskn() throws CFException {
       if (isStsEibtasknModified()) { 
           stsEibtaskn = refreshStsEibtaskn();
        }
   		return stsEibtaskn;
	}
	

	
	   
	/**
	 * 	Update StsEibtaskn with the passed value
	 *  Corresponding COBOL Variable is STS-EIBTASKN
	 *	@param number
	 */
	public void setStsEibtaskn(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    stsEibtaskn = checkStsEibtasknMaxLimit(number); 
		serializeStsEibtaskn(stsEibtaskn);
	}
	

	/**
	 * 	Update StsEibtaskn with the passed value
	 *	@param value (String or char[])
	 */
	public void setStsEibtaskn(char[] value) throws CFException {
		 stsEibtaskn = serializeStsEibtaskn(value);
	}
	/**
	 * 	Update StsEibtaskn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStsEibtasknString(char[] value) throws CFException {
		 setStsEibtaskn(value);
	}
	/**
	 *	Returns the value of stsSqlcode
	 *	@return stsSqlcode
	 */
	public long getStsSqlcode() throws CFException {
       if (isStsSqlcodeModified()) { 
           stsSqlcode = refreshStsSqlcode();
        }
   		return stsSqlcode;
	}
	

	
	   
	/**
	 * 	Update StsSqlcode with the passed value
	 *  Corresponding COBOL Variable is STS-SQLCODE
	 *	@param number
	 */
	public void setStsSqlcode(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    stsSqlcode = checkStsSqlcodeMaxLimit(number); 
		serializeStsSqlcode(stsSqlcode);
	}
	

	/**
	 * 	Update StsSqlcode with the passed value
	 *	@param value (String or char[])
	 */
	public void setStsSqlcode(char[] value) throws CFException {
		 stsSqlcode = serializeStsSqlcode(value);
	}
	/**
	 * 	Update StsSqlcode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStsSqlcodeString(char[] value) throws CFException {
		 setStsSqlcode(value);
	}
	/**
	 *	Returns the value of stsSqlstate
	 *	@return stsSqlstate
	 */
   public char[] getStsSqlstate() throws CFException{
     if (isStsSqlstateModified()) { 
        stsSqlstate = refreshStsSqlstate();
     }
   		return stsSqlstate;
   }

  
	/**
	*  set variable stsSqlstate
	*  Corresponding COBOL Variable is STS-SQLSTATE
	*  @param value
	**/
   public void setStsSqlstate(char[] value) {
      stsSqlstate = checkStsSqlstateConstraints(value);
      serializeStsSqlstate(stsSqlstate);
   } 

     /**
	 * 	Update StsSqlstate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsSqlstate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsSqlstate,stsSqlstate.length);
   	
   }
   
   public void setStsSqlstate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsSqlstate,stsSqlstate.length);
   	
   }
   
     /**
	 * 	Update StsSqlstate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsSqlstate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsSqlstate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsSqlstate with another Field
	 *	@param value
	 */
   public void setStsSqlstate(Field source) {
       replace(source,0,source.length(),beginStsSqlstate,STS_SQLSTATE_LEN);
   	
   }  
   
     /**
	 * 	Update StsSqlstate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsSqlstate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsSqlstate,STS_SQLSTATE_LEN);
   	
   }
   
     /**
	 * 	Update StsSqlstate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsSqlstate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsSqlstate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsParagraph
	 *	@return stsParagraph
	 */
   public char[] getStsParagraph() throws CFException{
     if (isStsParagraphModified()) { 
        stsParagraph = refreshStsParagraph();
     }
   		return stsParagraph;
   }

  
	/**
	*  set variable stsParagraph
	*  Corresponding COBOL Variable is STS-PARAGRAPH
	*  @param value
	**/
   public void setStsParagraph(char[] value) {
      stsParagraph = checkStsParagraphConstraints(value);
      serializeStsParagraph(stsParagraph);
   } 

     /**
	 * 	Update StsParagraph 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsParagraph(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsParagraph,stsParagraph.length);
   	
   }
   
   public void setStsParagraph(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsParagraph,stsParagraph.length);
   	
   }
   
     /**
	 * 	Update StsParagraph 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsParagraph(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsParagraph+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsParagraph with another Field
	 *	@param value
	 */
   public void setStsParagraph(Field source) {
       replace(source,0,source.length(),beginStsParagraph,STS_PARAGRAPH_LEN);
   	
   }  
   
     /**
	 * 	Update StsParagraph 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsParagraph(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsParagraph,STS_PARAGRAPH_LEN);
   	
   }
   
     /**
	 * 	Update StsParagraph 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsParagraph(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsParagraph+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes StsResponseVars
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setStsRespMessageType(CONSTANTS.SPACE);
         setStsRespAdditionalInfo1(CONSTANTS.SPACE_100);
         setStsRespAdditionalInfo2(CONSTANTS.SPACE_100);
         setStsRespDataValue(CONSTANTS.SPACE_30);
                     setStsCicsresp(0);
                     setStsCicsresp2(0);
                     setStsEibtaskn(0);
                     setStsSqlcode(0);
         setStsSqlstate(CONSTANTS.SPACE_5);
         setStsParagraph(CONSTANTS.SPACE_30);
   }

		public static int getStsResponseVarsFieldLength() {
			return STS_RESPONSE_VARS_LENGTH;
		}

}
  
