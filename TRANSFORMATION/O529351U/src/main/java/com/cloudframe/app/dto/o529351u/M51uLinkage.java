package com.cloudframe.app.dto.o529351u;

/**
*  The class M51uLinkage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.*;
import java.util.ArrayList;


public class M51uLinkage extends M51uLinkageSerialized { 
   

						private char[] uIcn51 = Field.fillLowValue(10);

						private char[] uIoRequest51 = Field.fillLowValue(1);

						private char[] uCauseCd51 = Field.fillLowValue(1);

						private char[] uProvType51 = Field.fillLowValue(2);

								private short uPlanVar51;

						private char[] uPolicyNo51 = Field.fillLowValue(6);
      private List<char[]> uDiagnosisCode51; 


						private char[] uIcdVerNbr51 = Field.fillLowValue(1);

						private char[] uMedicalClaim51 = Field.fillLowValue(1);

						private char[] uSourceInd51 = Field.fillLowValue(1);

								private long uEarliestDos51;

								private short uNbrOfLines51;
			private List<ULineData51> uLineData51 = new ArrayList<>();
    	

						private char[] uCpeDescCd51 = Field.fillLowValue(4);
			private List<UOutLineData51> uOutLineData51 = new ArrayList<>();
    	

						private char[] uStopAutoSw51 = Field.fillLowValue(1);

						private char[] uOutCauseCd51 = Field.fillLowValue(1);

								private short uSlotPlanVar51;

						private char[] uSlotPolicyNo51 = Field.fillLowValue(6);
	
	/**
	* Constructor for M51uLinkage
	**/
    public M51uLinkage() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for M51uLinkage. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public M51uLinkage(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of uIcn51
	 *	@return uIcn51
	 */
   public char[] getUIcn51() throws CFException{
     if (isUIcn51Modified()) { 
        uIcn51 = refreshUIcn51();
     }
   		return uIcn51;
   }

  
	/**
	*  set variable uIcn51
	*  Corresponding COBOL Variable is LK-51U-ICN
	*  @param value
	**/
   public void setUIcn51(char[] value) {
      uIcn51 = checkUIcn51Constraints(value);
      serializeUIcn51(uIcn51);
   } 

     /**
	 * 	Update UIcn51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUIcn51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUIcn51,uIcn51.length);
   	
   }
   
   public void setUIcn51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUIcn51,uIcn51.length);
   	
   }
   
     /**
	 * 	Update UIcn51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUIcn51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUIcn51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UIcn51 with another Field
	 *	@param value
	 */
   public void setUIcn51(Field source) {
       replace(source,0,source.length(),beginUIcn51,U_ICN_51_LEN);
   	
   }  
   
     /**
	 * 	Update UIcn51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUIcn51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUIcn51,U_ICN_51_LEN);
   	
   }
   
     /**
	 * 	Update UIcn51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUIcn51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUIcn51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uIoRequest51
	 *	@return uIoRequest51
	 */
   public char[] getUIoRequest51() throws CFException{
     if (isUIoRequest51Modified()) { 
        uIoRequest51 = refreshUIoRequest51();
     }
   		return uIoRequest51;
   }

  
	/**
	*  set variable uIoRequest51
	*  Corresponding COBOL Variable is LK-51U-IO-REQUEST
	*  @param value
	**/
   public void setUIoRequest51(char[] value) {
      uIoRequest51 = checkUIoRequest51Constraints(value);
      serializeUIoRequest51(uIoRequest51);
   } 

     /**
	 * 	Update UIoRequest51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUIoRequest51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUIoRequest51,uIoRequest51.length);
   	
   }
   
   public void setUIoRequest51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUIoRequest51,uIoRequest51.length);
   	
   }
   
     /**
	 * 	Update UIoRequest51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUIoRequest51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUIoRequest51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UIoRequest51 with another Field
	 *	@param value
	 */
   public void setUIoRequest51(Field source) {
       replace(source,0,source.length(),beginUIoRequest51,U_IO_REQUEST_51_LEN);
   	
   }  
   
     /**
	 * 	Update UIoRequest51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUIoRequest51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUIoRequest51,U_IO_REQUEST_51_LEN);
   	
   }
   
     /**
	 * 	Update UIoRequest51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUIoRequest51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUIoRequest51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uCauseCd51
	 *	@return uCauseCd51
	 */
   public char[] getUCauseCd51() throws CFException{
     if (isUCauseCd51Modified()) { 
        uCauseCd51 = refreshUCauseCd51();
     }
   		return uCauseCd51;
   }

  
	/**
	*  set variable uCauseCd51
	*  Corresponding COBOL Variable is LK-51U-CAUSE-CD
	*  @param value
	**/
   public void setUCauseCd51(char[] value) {
      uCauseCd51 = checkUCauseCd51Constraints(value);
      serializeUCauseCd51(uCauseCd51);
   } 

     /**
	 * 	Update UCauseCd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUCauseCd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUCauseCd51,uCauseCd51.length);
   	
   }
   
   public void setUCauseCd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUCauseCd51,uCauseCd51.length);
   	
   }
   
     /**
	 * 	Update UCauseCd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUCauseCd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUCauseCd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UCauseCd51 with another Field
	 *	@param value
	 */
   public void setUCauseCd51(Field source) {
       replace(source,0,source.length(),beginUCauseCd51,U_CAUSE_CD_51_LEN);
   	
   }  
   
     /**
	 * 	Update UCauseCd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUCauseCd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUCauseCd51,U_CAUSE_CD_51_LEN);
   	
   }
   
     /**
	 * 	Update UCauseCd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUCauseCd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUCauseCd51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uProvType51
	 *	@return uProvType51
	 */
   public char[] getUProvType51() throws CFException{
     if (isUProvType51Modified()) { 
        uProvType51 = refreshUProvType51();
     }
   		return uProvType51;
   }

  
	/**
	*  set variable uProvType51
	*  Corresponding COBOL Variable is LK-51U-PROV-TYPE
	*  @param value
	**/
   public void setUProvType51(char[] value) {
      uProvType51 = checkUProvType51Constraints(value);
      serializeUProvType51(uProvType51);
   } 

     /**
	 * 	Update UProvType51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUProvType51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUProvType51,uProvType51.length);
   	
   }
   
   public void setUProvType51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUProvType51,uProvType51.length);
   	
   }
   
     /**
	 * 	Update UProvType51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUProvType51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUProvType51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UProvType51 with another Field
	 *	@param value
	 */
   public void setUProvType51(Field source) {
       replace(source,0,source.length(),beginUProvType51,U_PROV_TYPE_51_LEN);
   	
   }  
   
     /**
	 * 	Update UProvType51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUProvType51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUProvType51,U_PROV_TYPE_51_LEN);
   	
   }
   
     /**
	 * 	Update UProvType51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUProvType51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUProvType51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uPlanVar51
	 *	@return uPlanVar51
	 */
	public short getUPlanVar51() throws CFException {
        if (isUPlanVar51Modified()) { 
           uPlanVar51 = refreshUPlanVar51();
        }
   		return uPlanVar51;
	}
	
	/**
	 * 	Update UPlanVar51 with the passed value
	 *  Corresponding COBOL Variable is LK-51U-PLAN-VAR
	 *	@param number
	 */
	public void setUPlanVar51(short number) {
	     // Truncate if the number is beyond +/- Max range
	    uPlanVar51 = checkUPlanVar51MaxLimit(number); 
		serializeUPlanVar51(uPlanVar51);
	}

	public void setUPlanVar51(int number) {
	    number = checkUPlanVar51MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUPlanVar51((short)number);
	}
	public void setUPlanVar51(long number) {
	    number = checkUPlanVar51MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUPlanVar51((short)number);
	}
	

	/**
	 *	Returns the value of uPolicyNo51
	 *	@return uPolicyNo51
	 */
   public char[] getUPolicyNo51() throws CFException{
     if (isUPolicyNo51Modified()) { 
        uPolicyNo51 = refreshUPolicyNo51();
     }
   		return uPolicyNo51;
   }

  
	/**
	*  set variable uPolicyNo51
	*  Corresponding COBOL Variable is LK-51U-POLICY-NO
	*  @param value
	**/
   public void setUPolicyNo51(char[] value) {
      uPolicyNo51 = checkUPolicyNo51Constraints(value);
      serializeUPolicyNo51(uPolicyNo51);
   } 

     /**
	 * 	Update UPolicyNo51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUPolicyNo51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUPolicyNo51,uPolicyNo51.length);
   	
   }
   
   public void setUPolicyNo51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUPolicyNo51,uPolicyNo51.length);
   	
   }
   
     /**
	 * 	Update UPolicyNo51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUPolicyNo51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUPolicyNo51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UPolicyNo51 with another Field
	 *	@param value
	 */
   public void setUPolicyNo51(Field source) {
       replace(source,0,source.length(),beginUPolicyNo51,U_POLICY_NO_51_LEN);
   	
   }  
   
     /**
	 * 	Update UPolicyNo51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUPolicyNo51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUPolicyNo51,U_POLICY_NO_51_LEN);
   	
   }
   
     /**
	 * 	Update UPolicyNo51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUPolicyNo51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUPolicyNo51+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of uDiagnosisCode51
	 *  Corresponding COBOL Variable is LK-51U-DIAGNOSIS-CODE
	 *	@return uDiagnosisCode51
	 */
	public List<char[]> getUDiagnosisCode51() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < U_DIAGNOSIS_CODE_51_SIZE;index++) {
        	list.add( getUDiagnosisCode51( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return uDiagnosisCode51
	 */
	public char[] getUDiagnosisCode51(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getUDiagnosisCode51(), resetting it to 0",index);
		    index = 0;
        } else if (index >= U_DIAGNOSIS_CODE_51_SIZE) {
             	index = U_DIAGNOSIS_CODE_51_SIZE -1; // can't exceed max array size
             	logger.trace("uDiagnosisCode51 - Array index exceeded max Size {}, resetting it to max allowed",U_DIAGNOSIS_CODE_51_SIZE); 
	    }
   	      return getCharArray( (beginUDiagnosisCode51 + index*U_DIAGNOSIS_CODE_51_LEN) , U_DIAGNOSIS_CODE_51_LEN );
    }
    
    
   public int  uDiagnosisCode51FieldLength() {
   	return U_DIAGNOSIS_CODE_51_LEN;
   }
   
	

  
  	/**
	 *	Update UDiagnosisCode51 with the passed value at a given index
	 *  Corresponding COBOL Variable is LK-51U-DIAGNOSIS-CODE
	 *  @param index
	 *	@param value
	 */
  public void setUDiagnosisCode51(int index,char[] value) {
   	setUDiagnosisCode51(index,value,true);
   }
   
   
   /**
	 *	Update UDiagnosisCode51 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setUDiagnosisCode51(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setUDiagnosisCode51(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 7)  {     
		       value = substring(value,0,7);
           }  else if (value.length < 7) {
		       value = pad(7, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(7).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeUDiagnosisCode51(index,value);		
       }
   }
   
	/**
	 *	Returns the value of uIcdVerNbr51
	 *	@return uIcdVerNbr51
	 */
   public char[] getUIcdVerNbr51() throws CFException{
     if (isUIcdVerNbr51Modified()) { 
        uIcdVerNbr51 = refreshUIcdVerNbr51();
     }
   		return uIcdVerNbr51;
   }

  
	/**
	*  set variable uIcdVerNbr51
	*  Corresponding COBOL Variable is LK-51U-ICD-VER-NBR
	*  @param value
	**/
   public void setUIcdVerNbr51(char[] value) {
      uIcdVerNbr51 = checkUIcdVerNbr51Constraints(value);
      serializeUIcdVerNbr51(uIcdVerNbr51);
   } 

     /**
	 * 	Update UIcdVerNbr51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUIcdVerNbr51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUIcdVerNbr51,uIcdVerNbr51.length);
   	
   }
   
   public void setUIcdVerNbr51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUIcdVerNbr51,uIcdVerNbr51.length);
   	
   }
   
     /**
	 * 	Update UIcdVerNbr51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUIcdVerNbr51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUIcdVerNbr51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UIcdVerNbr51 with another Field
	 *	@param value
	 */
   public void setUIcdVerNbr51(Field source) {
       replace(source,0,source.length(),beginUIcdVerNbr51,U_ICD_VER_NBR_51_LEN);
   	
   }  
   
     /**
	 * 	Update UIcdVerNbr51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUIcdVerNbr51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUIcdVerNbr51,U_ICD_VER_NBR_51_LEN);
   	
   }
   
     /**
	 * 	Update UIcdVerNbr51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUIcdVerNbr51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUIcdVerNbr51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uMedicalClaim51
	 *	@return uMedicalClaim51
	 */
   public char[] getUMedicalClaim51() throws CFException{
     if (isUMedicalClaim51Modified()) { 
        uMedicalClaim51 = refreshUMedicalClaim51();
     }
   		return uMedicalClaim51;
   }

  
	/**
	*  set variable uMedicalClaim51
	*  Corresponding COBOL Variable is LK-51U-MEDICAL-CLAIM
	*  @param value
	**/
   public void setUMedicalClaim51(char[] value) {
      uMedicalClaim51 = checkUMedicalClaim51Constraints(value);
      serializeUMedicalClaim51(uMedicalClaim51);
   } 

     /**
	 * 	Update UMedicalClaim51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUMedicalClaim51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUMedicalClaim51,uMedicalClaim51.length);
   	
   }
   
   public void setUMedicalClaim51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUMedicalClaim51,uMedicalClaim51.length);
   	
   }
   
     /**
	 * 	Update UMedicalClaim51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUMedicalClaim51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUMedicalClaim51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UMedicalClaim51 with another Field
	 *	@param value
	 */
   public void setUMedicalClaim51(Field source) {
       replace(source,0,source.length(),beginUMedicalClaim51,U_MEDICAL_CLAIM_51_LEN);
   	
   }  
   
     /**
	 * 	Update UMedicalClaim51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUMedicalClaim51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUMedicalClaim51,U_MEDICAL_CLAIM_51_LEN);
   	
   }
   
     /**
	 * 	Update UMedicalClaim51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUMedicalClaim51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUMedicalClaim51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uSourceInd51
	 *	@return uSourceInd51
	 */
   public char[] getUSourceInd51() throws CFException{
     if (isUSourceInd51Modified()) { 
        uSourceInd51 = refreshUSourceInd51();
     }
   		return uSourceInd51;
   }

  
	/**
	*  set variable uSourceInd51
	*  Corresponding COBOL Variable is LK-51U-SOURCE-IND
	*  @param value
	**/
   public void setUSourceInd51(char[] value) {
      uSourceInd51 = checkUSourceInd51Constraints(value);
      serializeUSourceInd51(uSourceInd51);
   } 

     /**
	 * 	Update USourceInd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUSourceInd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUSourceInd51,uSourceInd51.length);
   	
   }
   
   public void setUSourceInd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUSourceInd51,uSourceInd51.length);
   	
   }
   
     /**
	 * 	Update USourceInd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUSourceInd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUSourceInd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update USourceInd51 with another Field
	 *	@param value
	 */
   public void setUSourceInd51(Field source) {
       replace(source,0,source.length(),beginUSourceInd51,U_SOURCE_IND_51_LEN);
   	
   }  
   
     /**
	 * 	Update USourceInd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUSourceInd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUSourceInd51,U_SOURCE_IND_51_LEN);
   	
   }
   
     /**
	 * 	Update USourceInd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUSourceInd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUSourceInd51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uEarliestDos51
	 *	@return uEarliestDos51
	 */
	public long getUEarliestDos51() throws CFException {
       if (isUEarliestDos51Modified()) { 
           uEarliestDos51 = refreshUEarliestDos51();
        }
   		return uEarliestDos51;
	}
	

	
	   
	/**
	 * 	Update UEarliestDos51 with the passed value
	 *  Corresponding COBOL Variable is LK-51U-EARLIEST-DOS
	 *	@param number
	 */
	public void setUEarliestDos51(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    uEarliestDos51 = checkUEarliestDos51MaxLimit(number); 
		serializeUEarliestDos51(uEarliestDos51);
	}
	

	/**
	 * 	Update UEarliestDos51 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUEarliestDos51(char[] value) throws CFException {
		 uEarliestDos51 = serializeUEarliestDos51(value);
	}
	/**
	 * 	Update UEarliestDos51 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUEarliestDos51String(char[] value) throws CFException {
		 setUEarliestDos51(value);
	}
	public short getUNbrOfLines51() throws CFException {
        if (isUNbrOfLines51Modified()) { 
           uNbrOfLines51 = refreshUNbrOfLines51();
        }
   		return uNbrOfLines51;
	}
	
	/**
	 * 	Update UNbrOfLines51 with the passed value
	 *  Corresponding COBOL Variable is LK-51U-NBR-OF-LINES
	 *	@param number
	 */
	public void setUNbrOfLines51(short number) {
			uNbrOfLines51 = checkUNbrOfLines51MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeUNbrOfLines51(uNbrOfLines51);
	}

	public void setUNbrOfLines51(int number) {
	    number = checkUNbrOfLines51MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUNbrOfLines51((short)number);
	}
	public void setUNbrOfLines51(long number) {
	    number = checkUNbrOfLines51MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUNbrOfLines51((short)number);
	}
	

	/**
	 *	Returns the  value of uLineData51
	 *  Corresponding COBOL Variable is LK-51U-LINE-DATA
	 *	@return uLineData51
	 */
   public List<ULineData51> getULineData51() {
       return uLineData51;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return uLineData51
	 */
	public ULineData51 getULineData51(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getULineData51(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= U_LINE_DATA_51_SIZE) {
             	index = U_LINE_DATA_51_SIZE -1; // can't exceed max array size
             	logger.trace("uLineData51 - Array index exceeded max Size {}, resetting it to max allowed",U_LINE_DATA_51_SIZE); 
	    }
		if (index >= uLineData51.size()) {
       		for (int fillIndex =  uLineData51.size() -1; fillIndex < index;fillIndex++) {
		       uLineData51.add(null);
		    }
			uLineData51.set(index,
			   	   	new ULineData51(this,beginULineData51 + index * ULineData51.getULineData51FieldLength()) 
				                        ); 	
		} 
   	   ULineData51 value = uLineData51.get(index);
   	   if (value == null) {
   	      uLineData51.set(index,
			   	   	new ULineData51(this,beginULineData51 + index * ULineData51.getULineData51FieldLength()) 
				                        ); 
		  value = uLineData51.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update ULineData51 at index with the passed value
	 *  Corresponding COBOL Variable is LK-51U-LINE-DATA
	 *  @param index
	 *	@param value
	 */
  public void setULineData51(int index,char[] value) {
   	getULineData51(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of uCpeDescCd51
	 *	@return uCpeDescCd51
	 */
   public char[] getUCpeDescCd51() throws CFException{
     if (isUCpeDescCd51Modified()) { 
        uCpeDescCd51 = refreshUCpeDescCd51();
     }
   		return uCpeDescCd51;
   }

  
	/**
	*  set variable uCpeDescCd51
	*  Corresponding COBOL Variable is LK-51U-CPE-DESC-CD
	*  @param value
	**/
   public void setUCpeDescCd51(char[] value) {
      uCpeDescCd51 = checkUCpeDescCd51Constraints(value);
      serializeUCpeDescCd51(uCpeDescCd51);
   } 

     /**
	 * 	Update UCpeDescCd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUCpeDescCd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUCpeDescCd51,uCpeDescCd51.length);
   	
   }
   
   public void setUCpeDescCd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUCpeDescCd51,uCpeDescCd51.length);
   	
   }
   
     /**
	 * 	Update UCpeDescCd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUCpeDescCd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUCpeDescCd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UCpeDescCd51 with another Field
	 *	@param value
	 */
   public void setUCpeDescCd51(Field source) {
       replace(source,0,source.length(),beginUCpeDescCd51,U_CPE_DESC_CD_51_LEN);
   	
   }  
   
     /**
	 * 	Update UCpeDescCd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUCpeDescCd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUCpeDescCd51,U_CPE_DESC_CD_51_LEN);
   	
   }
   
     /**
	 * 	Update UCpeDescCd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUCpeDescCd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUCpeDescCd51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of uOutLineData51
	 *  Corresponding COBOL Variable is LK-51U-OUT-LINE-DATA
	 *	@return uOutLineData51
	 */
   public List<UOutLineData51> getUOutLineData51() {
       return uOutLineData51;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return uOutLineData51
	 */
	public UOutLineData51 getUOutLineData51(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getUOutLineData51(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= U_OUT_LINE_DATA_51_SIZE) {
             	index = U_OUT_LINE_DATA_51_SIZE -1; // can't exceed max array size
             	logger.trace("uOutLineData51 - Array index exceeded max Size {}, resetting it to max allowed",U_OUT_LINE_DATA_51_SIZE); 
	    }
		if (index >= uOutLineData51.size()) {
       		for (int fillIndex =  uOutLineData51.size() -1; fillIndex < index;fillIndex++) {
		       uOutLineData51.add(null);
		    }
			uOutLineData51.set(index,
			   	   	new UOutLineData51(this,beginUOutLineData51 + index * UOutLineData51.getUOutLineData51FieldLength()) 
				                        ); 	
		} 
   	   UOutLineData51 value = uOutLineData51.get(index);
   	   if (value == null) {
   	      uOutLineData51.set(index,
			   	   	new UOutLineData51(this,beginUOutLineData51 + index * UOutLineData51.getUOutLineData51FieldLength()) 
				                        ); 
		  value = uOutLineData51.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update UOutLineData51 at index with the passed value
	 *  Corresponding COBOL Variable is LK-51U-OUT-LINE-DATA
	 *  @param index
	 *	@param value
	 */
  public void setUOutLineData51(int index,char[] value) {
   	getUOutLineData51(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of uStopAutoSw51
	 *	@return uStopAutoSw51
	 */
   public char[] getUStopAutoSw51() throws CFException{
     if (isUStopAutoSw51Modified()) { 
        uStopAutoSw51 = refreshUStopAutoSw51();
     }
   		return uStopAutoSw51;
   }

  
	/**
	*  set variable uStopAutoSw51
	*  Corresponding COBOL Variable is LK-51U-STOP-AUTO-SW
	*  @param value
	**/
   public void setUStopAutoSw51(char[] value) {
      uStopAutoSw51 = checkUStopAutoSw51Constraints(value);
      serializeUStopAutoSw51(uStopAutoSw51);
   } 

     /**
	 * 	Update UStopAutoSw51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUStopAutoSw51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUStopAutoSw51,uStopAutoSw51.length);
   	
   }
   
   public void setUStopAutoSw51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUStopAutoSw51,uStopAutoSw51.length);
   	
   }
   
     /**
	 * 	Update UStopAutoSw51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUStopAutoSw51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUStopAutoSw51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UStopAutoSw51 with another Field
	 *	@param value
	 */
   public void setUStopAutoSw51(Field source) {
       replace(source,0,source.length(),beginUStopAutoSw51,U_STOP_AUTO_SW_51_LEN);
   	
   }  
   
     /**
	 * 	Update UStopAutoSw51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUStopAutoSw51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUStopAutoSw51,U_STOP_AUTO_SW_51_LEN);
   	
   }
   
     /**
	 * 	Update UStopAutoSw51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUStopAutoSw51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUStopAutoSw51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uOutCauseCd51
	 *	@return uOutCauseCd51
	 */
   public char[] getUOutCauseCd51() throws CFException{
     if (isUOutCauseCd51Modified()) { 
        uOutCauseCd51 = refreshUOutCauseCd51();
     }
   		return uOutCauseCd51;
   }

  
	/**
	*  set variable uOutCauseCd51
	*  Corresponding COBOL Variable is LK-51U-OUT-CAUSE-CD
	*  @param value
	**/
   public void setUOutCauseCd51(char[] value) {
      uOutCauseCd51 = checkUOutCauseCd51Constraints(value);
      serializeUOutCauseCd51(uOutCauseCd51);
   } 

     /**
	 * 	Update UOutCauseCd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUOutCauseCd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUOutCauseCd51,uOutCauseCd51.length);
   	
   }
   
   public void setUOutCauseCd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUOutCauseCd51,uOutCauseCd51.length);
   	
   }
   
     /**
	 * 	Update UOutCauseCd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUOutCauseCd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutCauseCd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UOutCauseCd51 with another Field
	 *	@param value
	 */
   public void setUOutCauseCd51(Field source) {
       replace(source,0,source.length(),beginUOutCauseCd51,U_OUT_CAUSE_CD_51_LEN);
   	
   }  
   
     /**
	 * 	Update UOutCauseCd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUOutCauseCd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUOutCauseCd51,U_OUT_CAUSE_CD_51_LEN);
   	
   }
   
     /**
	 * 	Update UOutCauseCd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUOutCauseCd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutCauseCd51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uSlotPlanVar51
	 *	@return uSlotPlanVar51
	 */
	public short getUSlotPlanVar51() throws CFException {
        if (isUSlotPlanVar51Modified()) { 
           uSlotPlanVar51 = refreshUSlotPlanVar51();
        }
   		return uSlotPlanVar51;
	}
	
	/**
	 * 	Update USlotPlanVar51 with the passed value
	 *  Corresponding COBOL Variable is LK-51U-SLOT-PLAN-VAR
	 *	@param number
	 */
	public void setUSlotPlanVar51(short number) {
	     // Truncate if the number is beyond +/- Max range
	    uSlotPlanVar51 = checkUSlotPlanVar51MaxLimit(number); 
		serializeUSlotPlanVar51(uSlotPlanVar51);
	}

	public void setUSlotPlanVar51(int number) {
	    number = checkUSlotPlanVar51MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUSlotPlanVar51((short)number);
	}
	public void setUSlotPlanVar51(long number) {
	    number = checkUSlotPlanVar51MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUSlotPlanVar51((short)number);
	}
	

	/**
	 *	Returns the value of uSlotPolicyNo51
	 *	@return uSlotPolicyNo51
	 */
   public char[] getUSlotPolicyNo51() throws CFException{
     if (isUSlotPolicyNo51Modified()) { 
        uSlotPolicyNo51 = refreshUSlotPolicyNo51();
     }
   		return uSlotPolicyNo51;
   }

  
	/**
	*  set variable uSlotPolicyNo51
	*  Corresponding COBOL Variable is LK-51U-SLOT-POLICY-NO
	*  @param value
	**/
   public void setUSlotPolicyNo51(char[] value) {
      uSlotPolicyNo51 = checkUSlotPolicyNo51Constraints(value);
      serializeUSlotPolicyNo51(uSlotPolicyNo51);
   } 

     /**
	 * 	Update USlotPolicyNo51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUSlotPolicyNo51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUSlotPolicyNo51,uSlotPolicyNo51.length);
   	
   }
   
   public void setUSlotPolicyNo51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUSlotPolicyNo51,uSlotPolicyNo51.length);
   	
   }
   
     /**
	 * 	Update USlotPolicyNo51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUSlotPolicyNo51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUSlotPolicyNo51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update USlotPolicyNo51 with another Field
	 *	@param value
	 */
   public void setUSlotPolicyNo51(Field source) {
       replace(source,0,source.length(),beginUSlotPolicyNo51,U_SLOT_POLICY_NO_51_LEN);
   	
   }  
   
     /**
	 * 	Update USlotPolicyNo51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUSlotPolicyNo51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUSlotPolicyNo51,U_SLOT_POLICY_NO_51_LEN);
   	
   }
   
     /**
	 * 	Update USlotPolicyNo51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUSlotPolicyNo51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUSlotPolicyNo51+targetIndex,targetLen);
    
   }

	
	
	

		public static int getM51uLinkageFieldLength() {
			return M_51U_LINKAGE_LENGTH;
		}

}
  
