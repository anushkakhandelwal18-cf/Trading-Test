package com.cloudframe.app.dto.o529351u;

/**
*  The class FeSpiRulesRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class FeSpiRulesRecord extends FeSpiRulesRecordSerialized { 
   
				private FesrKey01 fesrKey01 = new FesrKey01();
			private List<FesrFromCondPs> fesrFromCondPs = new ArrayList<>();
    	
			private List<FesrFromCondFrToSvc> fesrFromCondFrToSvc = new ArrayList<>();
    	
			private List<FesrFromCondPrvTyp> fesrFromCondPrvTyp = new ArrayList<>();
    	
			private List<FesrFromCondFrToIcd9> fesrFromCondFrToIcd9 = new ArrayList<>();
    	
			private List<FesrFromCondCause> fesrFromCondCause = new ArrayList<>();
    	
			private List<FesrIpaCode> fesrIpaCode = new ArrayList<>();
    	
	
	/**
	* Constructor for FeSpiRulesRecord
	**/
    public FeSpiRulesRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			fesrKey01.setParent(this,getStartOffset() + 0);
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_PS_SIZE;arrayIndex++) {
						fesrFromCondPs.add(new FesrFromCondPs(this, beginFesrFromCondPs + 
						arrayIndex * FesrFromCondPs.getFesrFromCondPsFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_FR_TO_SVC_SIZE;arrayIndex++) {
						fesrFromCondFrToSvc.add(new FesrFromCondFrToSvc(this, beginFesrFromCondFrToSvc + 
						arrayIndex * FesrFromCondFrToSvc.getFesrFromCondFrToSvcFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_PRV_TYP_SIZE;arrayIndex++) {
						fesrFromCondPrvTyp.add(new FesrFromCondPrvTyp(this, beginFesrFromCondPrvTyp + 
						arrayIndex * FesrFromCondPrvTyp.getFesrFromCondPrvTypFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_FR_TO_ICD_9_SIZE;arrayIndex++) {
						fesrFromCondFrToIcd9.add(new FesrFromCondFrToIcd9(this, beginFesrFromCondFrToIcd9 + 
						arrayIndex * FesrFromCondFrToIcd9.getFesrFromCondFrToIcd9FieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_CAUSE_SIZE;arrayIndex++) {
						fesrFromCondCause.add(new FesrFromCondCause(this, beginFesrFromCondCause + 
						arrayIndex * FesrFromCondCause.getFesrFromCondCauseFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_IPA_CODE_SIZE;arrayIndex++) {
						fesrIpaCode.add(new FesrIpaCode(this, beginFesrIpaCode + 
						arrayIndex * FesrIpaCode.getFesrIpaCodeFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fesrKey01
	 *	@return fesrKey01
	 */   
	 public FesrKey01 getFesrKey01() {
   	return fesrKey01;
   }
   /**
	* 	Update FesrKey01 with the passed value
	*   Corresponding COBOL Variable is FESR-KEY
	*	@param value
	*/
   public void setFesrKey01(char[] value) {
      fesrKey01.setString(value); 
   }   
    
     /**
	 * 	Update FesrKey01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFesrKey01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fesrKey01.begin,fesrKey01.length());
   }
   
     /**
	 * 	Update FesrKey01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrKey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fesrKey01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FesrKey01 with another Field
	 *	@param value
	 */
   public void setFesrKey01(Field source) {
   	replace(source,0,source.length(),fesrKey01.begin,fesrKey01.length());
   }  
   
     /**
	 * 	Update FesrKey01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFesrKey01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fesrKey01.begin,fesrKey01.length());
   }
   
     /**
	 * 	Update FesrKey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrKey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fesrKey01.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the  value of fesrFromCondPs
	 *  Corresponding COBOL Variable is FESR-FROM-COND-PS
	 *	@return fesrFromCondPs
	 */
   public List<FesrFromCondPs> getFesrFromCondPs() {
       return fesrFromCondPs;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return fesrFromCondPs
	 */
	public FesrFromCondPs getFesrFromCondPs(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getFesrFromCondPs(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= FESR_FROM_COND_PS_SIZE) {
             	index = FESR_FROM_COND_PS_SIZE -1; // can't exceed max array size
             	logger.trace("fesrFromCondPs - Array index exceeded max Size {}, resetting it to max allowed",FESR_FROM_COND_PS_SIZE); 
	    }
		if (index >= fesrFromCondPs.size()) {
       		for (int fillIndex =  fesrFromCondPs.size() -1; fillIndex < index;fillIndex++) {
		       fesrFromCondPs.add(null);
		    }
			fesrFromCondPs.set(index,
			   	   	new FesrFromCondPs(this,beginFesrFromCondPs + index * FesrFromCondPs.getFesrFromCondPsFieldLength()) 
				                        ); 	
		} 
   	   FesrFromCondPs value = fesrFromCondPs.get(index);
   	   if (value == null) {
   	      fesrFromCondPs.set(index,
			   	   	new FesrFromCondPs(this,beginFesrFromCondPs + index * FesrFromCondPs.getFesrFromCondPsFieldLength()) 
				                        ); 
		  value = fesrFromCondPs.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update FesrFromCondPs at index with the passed value
	 *  Corresponding COBOL Variable is FESR-FROM-COND-PS
	 *  @param index
	 *	@param value
	 */
  public void setFesrFromCondPs(int index,char[] value) {
   	getFesrFromCondPs(index).setString(value);
   }
   
	
	/**
	 *	Returns the  value of fesrFromCondFrToSvc
	 *  Corresponding COBOL Variable is FESR-FROM-COND-FR-TO-SVC
	 *	@return fesrFromCondFrToSvc
	 */
   public List<FesrFromCondFrToSvc> getFesrFromCondFrToSvc() {
       return fesrFromCondFrToSvc;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return fesrFromCondFrToSvc
	 */
	public FesrFromCondFrToSvc getFesrFromCondFrToSvc(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getFesrFromCondFrToSvc(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= FESR_FROM_COND_FR_TO_SVC_SIZE) {
             	index = FESR_FROM_COND_FR_TO_SVC_SIZE -1; // can't exceed max array size
             	logger.trace("fesrFromCondFrToSvc - Array index exceeded max Size {}, resetting it to max allowed",FESR_FROM_COND_FR_TO_SVC_SIZE); 
	    }
		if (index >= fesrFromCondFrToSvc.size()) {
       		for (int fillIndex =  fesrFromCondFrToSvc.size() -1; fillIndex < index;fillIndex++) {
		       fesrFromCondFrToSvc.add(null);
		    }
			fesrFromCondFrToSvc.set(index,
			   	   	new FesrFromCondFrToSvc(this,beginFesrFromCondFrToSvc + index * FesrFromCondFrToSvc.getFesrFromCondFrToSvcFieldLength()) 
				                        ); 	
		} 
   	   FesrFromCondFrToSvc value = fesrFromCondFrToSvc.get(index);
   	   if (value == null) {
   	      fesrFromCondFrToSvc.set(index,
			   	   	new FesrFromCondFrToSvc(this,beginFesrFromCondFrToSvc + index * FesrFromCondFrToSvc.getFesrFromCondFrToSvcFieldLength()) 
				                        ); 
		  value = fesrFromCondFrToSvc.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update FesrFromCondFrToSvc at index with the passed value
	 *  Corresponding COBOL Variable is FESR-FROM-COND-FR-TO-SVC
	 *  @param index
	 *	@param value
	 */
  public void setFesrFromCondFrToSvc(int index,char[] value) {
   	getFesrFromCondFrToSvc(index).setString(value);
   }
   
	
	/**
	 *	Returns the  value of fesrFromCondPrvTyp
	 *  Corresponding COBOL Variable is FESR-FROM-COND-PRV-TYP
	 *	@return fesrFromCondPrvTyp
	 */
   public List<FesrFromCondPrvTyp> getFesrFromCondPrvTyp() {
       return fesrFromCondPrvTyp;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return fesrFromCondPrvTyp
	 */
	public FesrFromCondPrvTyp getFesrFromCondPrvTyp(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getFesrFromCondPrvTyp(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= FESR_FROM_COND_PRV_TYP_SIZE) {
             	index = FESR_FROM_COND_PRV_TYP_SIZE -1; // can't exceed max array size
             	logger.trace("fesrFromCondPrvTyp - Array index exceeded max Size {}, resetting it to max allowed",FESR_FROM_COND_PRV_TYP_SIZE); 
	    }
		if (index >= fesrFromCondPrvTyp.size()) {
       		for (int fillIndex =  fesrFromCondPrvTyp.size() -1; fillIndex < index;fillIndex++) {
		       fesrFromCondPrvTyp.add(null);
		    }
			fesrFromCondPrvTyp.set(index,
			   	   	new FesrFromCondPrvTyp(this,beginFesrFromCondPrvTyp + index * FesrFromCondPrvTyp.getFesrFromCondPrvTypFieldLength()) 
				                        ); 	
		} 
   	   FesrFromCondPrvTyp value = fesrFromCondPrvTyp.get(index);
   	   if (value == null) {
   	      fesrFromCondPrvTyp.set(index,
			   	   	new FesrFromCondPrvTyp(this,beginFesrFromCondPrvTyp + index * FesrFromCondPrvTyp.getFesrFromCondPrvTypFieldLength()) 
				                        ); 
		  value = fesrFromCondPrvTyp.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update FesrFromCondPrvTyp at index with the passed value
	 *  Corresponding COBOL Variable is FESR-FROM-COND-PRV-TYP
	 *  @param index
	 *	@param value
	 */
  public void setFesrFromCondPrvTyp(int index,char[] value) {
   	getFesrFromCondPrvTyp(index).setString(value);
   }
   
	
	/**
	 *	Returns the  value of fesrFromCondFrToIcd9
	 *  Corresponding COBOL Variable is FESR-FROM-COND-FR-TO-ICD9
	 *	@return fesrFromCondFrToIcd9
	 */
   public List<FesrFromCondFrToIcd9> getFesrFromCondFrToIcd9() {
       return fesrFromCondFrToIcd9;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return fesrFromCondFrToIcd9
	 */
	public FesrFromCondFrToIcd9 getFesrFromCondFrToIcd9(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getFesrFromCondFrToIcd9(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= FESR_FROM_COND_FR_TO_ICD_9_SIZE) {
             	index = FESR_FROM_COND_FR_TO_ICD_9_SIZE -1; // can't exceed max array size
             	logger.trace("fesrFromCondFrToIcd9 - Array index exceeded max Size {}, resetting it to max allowed",FESR_FROM_COND_FR_TO_ICD_9_SIZE); 
	    }
		if (index >= fesrFromCondFrToIcd9.size()) {
       		for (int fillIndex =  fesrFromCondFrToIcd9.size() -1; fillIndex < index;fillIndex++) {
		       fesrFromCondFrToIcd9.add(null);
		    }
			fesrFromCondFrToIcd9.set(index,
			   	   	new FesrFromCondFrToIcd9(this,beginFesrFromCondFrToIcd9 + index * FesrFromCondFrToIcd9.getFesrFromCondFrToIcd9FieldLength()) 
				                        ); 	
		} 
   	   FesrFromCondFrToIcd9 value = fesrFromCondFrToIcd9.get(index);
   	   if (value == null) {
   	      fesrFromCondFrToIcd9.set(index,
			   	   	new FesrFromCondFrToIcd9(this,beginFesrFromCondFrToIcd9 + index * FesrFromCondFrToIcd9.getFesrFromCondFrToIcd9FieldLength()) 
				                        ); 
		  value = fesrFromCondFrToIcd9.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update FesrFromCondFrToIcd9 at index with the passed value
	 *  Corresponding COBOL Variable is FESR-FROM-COND-FR-TO-ICD9
	 *  @param index
	 *	@param value
	 */
  public void setFesrFromCondFrToIcd9(int index,char[] value) {
   	getFesrFromCondFrToIcd9(index).setString(value);
   }
   
	
	/**
	 *	Returns the  value of fesrFromCondCause
	 *  Corresponding COBOL Variable is FESR-FROM-COND-CAUSE
	 *	@return fesrFromCondCause
	 */
   public List<FesrFromCondCause> getFesrFromCondCause() {
       return fesrFromCondCause;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return fesrFromCondCause
	 */
	public FesrFromCondCause getFesrFromCondCause(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getFesrFromCondCause(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= FESR_FROM_COND_CAUSE_SIZE) {
             	index = FESR_FROM_COND_CAUSE_SIZE -1; // can't exceed max array size
             	logger.trace("fesrFromCondCause - Array index exceeded max Size {}, resetting it to max allowed",FESR_FROM_COND_CAUSE_SIZE); 
	    }
		if (index >= fesrFromCondCause.size()) {
       		for (int fillIndex =  fesrFromCondCause.size() -1; fillIndex < index;fillIndex++) {
		       fesrFromCondCause.add(null);
		    }
			fesrFromCondCause.set(index,
			   	   	new FesrFromCondCause(this,beginFesrFromCondCause + index * FesrFromCondCause.getFesrFromCondCauseFieldLength()) 
				                        ); 	
		} 
   	   FesrFromCondCause value = fesrFromCondCause.get(index);
   	   if (value == null) {
   	      fesrFromCondCause.set(index,
			   	   	new FesrFromCondCause(this,beginFesrFromCondCause + index * FesrFromCondCause.getFesrFromCondCauseFieldLength()) 
				                        ); 
		  value = fesrFromCondCause.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update FesrFromCondCause at index with the passed value
	 *  Corresponding COBOL Variable is FESR-FROM-COND-CAUSE
	 *  @param index
	 *	@param value
	 */
  public void setFesrFromCondCause(int index,char[] value) {
   	getFesrFromCondCause(index).setString(value);
   }
   
	
	/**
	 *	Returns the  value of fesrIpaCode
	 *  Corresponding COBOL Variable is FESR-IPA-CODE
	 *	@return fesrIpaCode
	 */
   public List<FesrIpaCode> getFesrIpaCode() {
       return fesrIpaCode;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return fesrIpaCode
	 */
	public FesrIpaCode getFesrIpaCode(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getFesrIpaCode(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= FESR_IPA_CODE_SIZE) {
             	index = FESR_IPA_CODE_SIZE -1; // can't exceed max array size
             	logger.trace("fesrIpaCode - Array index exceeded max Size {}, resetting it to max allowed",FESR_IPA_CODE_SIZE); 
	    }
		if (index >= fesrIpaCode.size()) {
       		for (int fillIndex =  fesrIpaCode.size() -1; fillIndex < index;fillIndex++) {
		       fesrIpaCode.add(null);
		    }
			fesrIpaCode.set(index,
			   	   	new FesrIpaCode(this,beginFesrIpaCode + index * FesrIpaCode.getFesrIpaCodeFieldLength()) 
				                        ); 	
		} 
   	   FesrIpaCode value = fesrIpaCode.get(index);
   	   if (value == null) {
   	      fesrIpaCode.set(index,
			   	   	new FesrIpaCode(this,beginFesrIpaCode + index * FesrIpaCode.getFesrIpaCodeFieldLength()) 
				                        ); 
		  value = fesrIpaCode.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update FesrIpaCode at index with the passed value
	 *  Corresponding COBOL Variable is FESR-IPA-CODE
	 *  @param index
	 *	@param value
	 */
  public void setFesrIpaCode(int index,char[] value) {
   	getFesrIpaCode(index).setString(value);
   }
   
	

	
	
	

		public static int getFeSpiRulesRecordFieldLength() {
			return FE_SPI_RULES_RECORD_LENGTH;
		}

}
  
