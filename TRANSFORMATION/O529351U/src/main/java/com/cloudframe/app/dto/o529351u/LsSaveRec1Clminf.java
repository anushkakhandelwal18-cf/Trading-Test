package com.cloudframe.app.dto.o529351u;

/**
*  The class LsSaveRec1Clminf is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class LsSaveRec1Clminf extends LsSaveRec1ClminfSerialized { 
   
			private List<SavProviderArea> savProviderArea = new ArrayList<>();
    	
				private SavDiagnosisCodePoa savDiagnosisCodePoa = new SavDiagnosisCodePoa();

						private char[] savDiagCodePoa = Field.fillLowValue(54);
				private SavInputProcId savInputProcId = new SavInputProcId();

								private long savInputProcIdNum;

						private char[] savOncologyInd = new char[1];

						private char[] savReferingNpi = Field.fillLowValue(10);

						private char[] savAttendingNpi = Field.fillLowValue(10);
	
	/**
	* Constructor for LsSaveRec1Clminf
	**/
    public LsSaveRec1Clminf() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SAV_PROVIDER_AREA_SIZE;arrayIndex++) {
						savProviderArea.add(new SavProviderArea(this, beginSavProviderArea + 
						arrayIndex * SavProviderArea.getSavProviderAreaFieldLength()));
				}
	       			savDiagnosisCodePoa.setParent(this,getStartOffset() + 121);
	       			savInputProcId.setParent(this,getStartOffset() + 237);
	   	/*  end of offset */
								setSavOncologyInd(fillSpace(1));
    }


 

	/**
	 *	Returns the  value of savProviderArea
	 *  Corresponding COBOL Variable is SAV-PROVIDER-AREA
	 *	@return savProviderArea
	 */
   public List<SavProviderArea> getSavProviderArea() {
       return savProviderArea;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return savProviderArea
	 */
	public SavProviderArea getSavProviderArea(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSavProviderArea(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SAV_PROVIDER_AREA_SIZE) {
             	index = SAV_PROVIDER_AREA_SIZE -1; // can't exceed max array size
             	logger.trace("savProviderArea - Array index exceeded max Size {}, resetting it to max allowed",SAV_PROVIDER_AREA_SIZE); 
	    }
		if (index >= savProviderArea.size()) {
       		for (int fillIndex =  savProviderArea.size() -1; fillIndex < index;fillIndex++) {
		       savProviderArea.add(null);
		    }
			savProviderArea.set(index,
			   	   	new SavProviderArea(this,beginSavProviderArea + index * SavProviderArea.getSavProviderAreaFieldLength()) 
				                        ); 	
		} 
   	   SavProviderArea value = savProviderArea.get(index);
   	   if (value == null) {
   	      savProviderArea.set(index,
			   	   	new SavProviderArea(this,beginSavProviderArea + index * SavProviderArea.getSavProviderAreaFieldLength()) 
				                        ); 
		  value = savProviderArea.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SavProviderArea at index with the passed value
	 *  Corresponding COBOL Variable is SAV-PROVIDER-AREA
	 *  @param index
	 *	@param value
	 */
  public void setSavProviderArea(int index,char[] value) {
   	getSavProviderArea(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of savDiagnosisCodePoa
	 *	@return savDiagnosisCodePoa
	 */   
	 public SavDiagnosisCodePoa getSavDiagnosisCodePoa() {
   	return savDiagnosisCodePoa;
   }
   /**
	* 	Update SavDiagnosisCodePoa with the passed value
	*   Corresponding COBOL Variable is SAV-DIAGNOSIS-CODE-POA
	*	@param value
	*/
   public void setSavDiagnosisCodePoa(char[] value) {
      savDiagnosisCodePoa.setString(value); 
   }   
    
     /**
	 * 	Update SavDiagnosisCodePoa 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavDiagnosisCodePoa(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savDiagnosisCodePoa.begin,savDiagnosisCodePoa.length());
   }
   
     /**
	 * 	Update SavDiagnosisCodePoa 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavDiagnosisCodePoa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savDiagnosisCodePoa.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavDiagnosisCodePoa with another Field
	 *	@param value
	 */
   public void setSavDiagnosisCodePoa(Field source) {
   	replace(source,0,source.length(),savDiagnosisCodePoa.begin,savDiagnosisCodePoa.length());
   }  
   
     /**
	 * 	Update SavDiagnosisCodePoa 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavDiagnosisCodePoa(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savDiagnosisCodePoa.begin,savDiagnosisCodePoa.length());
   }
   
     /**
	 * 	Update SavDiagnosisCodePoa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavDiagnosisCodePoa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savDiagnosisCodePoa.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of savDiagCodePoa
	 *	@return savDiagCodePoa
	 */
   public char[] getSavDiagCodePoa() throws CFException{
     if (isSavDiagCodePoaModified()) { 
        savDiagCodePoa = refreshSavDiagCodePoa();
     }
   		return savDiagCodePoa;
   }

  
	/**
	*  set variable savDiagCodePoa
	*  Corresponding COBOL Variable is SAV-DIAG-CODE-POA
	*  @param value
	**/
   public void setSavDiagCodePoa(char[] value) {
      savDiagCodePoa = checkSavDiagCodePoaConstraints(value);
      serializeSavDiagCodePoa(savDiagCodePoa);
   } 

     /**
	 * 	Update SavDiagCodePoa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavDiagCodePoa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavDiagCodePoa,savDiagCodePoa.length);
   	
   }
   
   public void setSavDiagCodePoa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavDiagCodePoa,savDiagCodePoa.length);
   	
   }
   
     /**
	 * 	Update SavDiagCodePoa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavDiagCodePoa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavDiagCodePoa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavDiagCodePoa with another Field
	 *	@param value
	 */
   public void setSavDiagCodePoa(Field source) {
       replace(source,0,source.length(),beginSavDiagCodePoa,SAV_DIAG_CODE_POA_LEN);
   	
   }  
   
     /**
	 * 	Update SavDiagCodePoa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavDiagCodePoa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavDiagCodePoa,SAV_DIAG_CODE_POA_LEN);
   	
   }
   
     /**
	 * 	Update SavDiagCodePoa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavDiagCodePoa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavDiagCodePoa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savInputProcId
	 *	@return savInputProcId
	 */   
	 public SavInputProcId getSavInputProcId() {
   	return savInputProcId;
   }
   /**
	* 	Update SavInputProcId with the passed value
	*   Corresponding COBOL Variable is SAV-INPUT-PROC-ID
	*	@param value
	*/
   public void setSavInputProcId(char[] value) {
      savInputProcId.setString(value); 
   }   
    
     /**
	 * 	Update SavInputProcId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavInputProcId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savInputProcId.begin,savInputProcId.length());
   }
   
     /**
	 * 	Update SavInputProcId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavInputProcId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savInputProcId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavInputProcId with another Field
	 *	@param value
	 */
   public void setSavInputProcId(Field source) {
   	replace(source,0,source.length(),savInputProcId.begin,savInputProcId.length());
   }  
   
     /**
	 * 	Update SavInputProcId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavInputProcId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savInputProcId.begin,savInputProcId.length());
   }
   
     /**
	 * 	Update SavInputProcId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavInputProcId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savInputProcId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of savInputProcIdNum
	 *	@return savInputProcIdNum
	 */
	public long getSavInputProcIdNum() throws CFException {
       if (isSavInputProcIdNumModified()) { 
           savInputProcIdNum = refreshSavInputProcIdNum();
        }
   		return savInputProcIdNum;
	}
	

	
	   
	/**
	 * 	Update SavInputProcIdNum with the passed value
	 *  Corresponding COBOL Variable is SAV-INPUT-PROC-ID-NUM
	 *	@param number
	 */
	public void setSavInputProcIdNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    savInputProcIdNum = checkSavInputProcIdNumMaxLimit(number); 
		serializeSavInputProcIdNum(savInputProcIdNum);
	}
	

	/**
	 * 	Update SavInputProcIdNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setSavInputProcIdNum(char[] value) throws CFException {
		 savInputProcIdNum = serializeSavInputProcIdNum(value);
	}
	/**
	 * 	Update SavInputProcIdNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSavInputProcIdNumString(char[] value) throws CFException {
		 setSavInputProcIdNum(value);
	}
	/**
	 *	Returns the value of savOncologyInd
	 *	@return savOncologyInd
	 */
   public char[] getSavOncologyInd() throws CFException{
     if (isSavOncologyIndModified()) { 
        savOncologyInd = refreshSavOncologyInd();
     }
   		return savOncologyInd;
   }

  
	/**
	*  set variable savOncologyInd
	*  Corresponding COBOL Variable is SAV-ONCOLOGY-IND
	*  @param value
	**/
   public void setSavOncologyInd(char[] value) {
      savOncologyInd = checkSavOncologyIndConstraints(value);
      serializeSavOncologyInd(savOncologyInd);
   } 

     /**
	 * 	Update SavOncologyInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavOncologyInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavOncologyInd,savOncologyInd.length);
   	
   }
   
   public void setSavOncologyInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavOncologyInd,savOncologyInd.length);
   	
   }
   
     /**
	 * 	Update SavOncologyInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavOncologyInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavOncologyInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavOncologyInd with another Field
	 *	@param value
	 */
   public void setSavOncologyInd(Field source) {
       replace(source,0,source.length(),beginSavOncologyInd,SAV_ONCOLOGY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update SavOncologyInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavOncologyInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavOncologyInd,SAV_ONCOLOGY_IND_LEN);
   	
   }
   
     /**
	 * 	Update SavOncologyInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavOncologyInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavOncologyInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savReferingNpi
	 *	@return savReferingNpi
	 */
   public char[] getSavReferingNpi() throws CFException{
     if (isSavReferingNpiModified()) { 
        savReferingNpi = refreshSavReferingNpi();
     }
   		return savReferingNpi;
   }

  
	/**
	*  set variable savReferingNpi
	*  Corresponding COBOL Variable is SAV-REFERING-NPI
	*  @param value
	**/
   public void setSavReferingNpi(char[] value) {
      savReferingNpi = checkSavReferingNpiConstraints(value);
      serializeSavReferingNpi(savReferingNpi);
   } 

     /**
	 * 	Update SavReferingNpi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavReferingNpi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavReferingNpi,savReferingNpi.length);
   	
   }
   
   public void setSavReferingNpi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavReferingNpi,savReferingNpi.length);
   	
   }
   
     /**
	 * 	Update SavReferingNpi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavReferingNpi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavReferingNpi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavReferingNpi with another Field
	 *	@param value
	 */
   public void setSavReferingNpi(Field source) {
       replace(source,0,source.length(),beginSavReferingNpi,SAV_REFERING_NPI_LEN);
   	
   }  
   
     /**
	 * 	Update SavReferingNpi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavReferingNpi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavReferingNpi,SAV_REFERING_NPI_LEN);
   	
   }
   
     /**
	 * 	Update SavReferingNpi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavReferingNpi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavReferingNpi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savAttendingNpi
	 *	@return savAttendingNpi
	 */
   public char[] getSavAttendingNpi() throws CFException{
     if (isSavAttendingNpiModified()) { 
        savAttendingNpi = refreshSavAttendingNpi();
     }
   		return savAttendingNpi;
   }

  
	/**
	*  set variable savAttendingNpi
	*  Corresponding COBOL Variable is SAV-ATTENDING-NPI
	*  @param value
	**/
   public void setSavAttendingNpi(char[] value) {
      savAttendingNpi = checkSavAttendingNpiConstraints(value);
      serializeSavAttendingNpi(savAttendingNpi);
   } 

     /**
	 * 	Update SavAttendingNpi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavAttendingNpi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavAttendingNpi,savAttendingNpi.length);
   	
   }
   
   public void setSavAttendingNpi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavAttendingNpi,savAttendingNpi.length);
   	
   }
   
     /**
	 * 	Update SavAttendingNpi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavAttendingNpi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavAttendingNpi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavAttendingNpi with another Field
	 *	@param value
	 */
   public void setSavAttendingNpi(Field source) {
       replace(source,0,source.length(),beginSavAttendingNpi,SAV_ATTENDING_NPI_LEN);
   	
   }  
   
     /**
	 * 	Update SavAttendingNpi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavAttendingNpi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavAttendingNpi,SAV_ATTENDING_NPI_LEN);
   	
   }
   
     /**
	 * 	Update SavAttendingNpi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavAttendingNpi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavAttendingNpi+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLsSaveRec1ClminfFieldLength() {
			return LS_SAVE_REC_1_CLMINF_LENGTH;
		}

}
  
