package com.cloudframe.app.dto.o529351u;

/**
*  The class SavMcdsChargeInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavMcdsChargeInfo extends SavMcdsChargeInfoSerialized { 
   

						private char[] savNatDrugCd = Field.fillLowValue(11);
				private SavFiller savFiller = new SavFiller();
	
	/**
	* Constructor for SavMcdsChargeInfo
	**/
    public SavMcdsChargeInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavMcdsChargeInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMcdsChargeInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			savFiller.setParent(this,getStartOffset() + 101);
    } 

	/**
	 *	Returns the value of savNatDrugCd
	 *	@return savNatDrugCd
	 */
   public char[] getSavNatDrugCd() throws CFException{
     if (isSavNatDrugCdModified()) { 
        savNatDrugCd = refreshSavNatDrugCd();
     }
   		return savNatDrugCd;
   }

  
	/**
	*  set variable savNatDrugCd
	*  Corresponding COBOL Variable is SAV-NAT-DRUG-CD
	*  @param value
	**/
   public void setSavNatDrugCd(char[] value) {
      savNatDrugCd = checkSavNatDrugCdConstraints(value);
      serializeSavNatDrugCd(savNatDrugCd);
   } 

     /**
	 * 	Update SavNatDrugCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavNatDrugCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavNatDrugCd,savNatDrugCd.length);
   	
   }
   
   public void setSavNatDrugCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavNatDrugCd,savNatDrugCd.length);
   	
   }
   
     /**
	 * 	Update SavNatDrugCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavNatDrugCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavNatDrugCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavNatDrugCd with another Field
	 *	@param value
	 */
   public void setSavNatDrugCd(Field source) {
       replace(source,0,source.length(),beginSavNatDrugCd,SAV_NAT_DRUG_CD_LEN);
   	
   }  
   
     /**
	 * 	Update SavNatDrugCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavNatDrugCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavNatDrugCd,SAV_NAT_DRUG_CD_LEN);
   	
   }
   
     /**
	 * 	Update SavNatDrugCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavNatDrugCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavNatDrugCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savFiller
	 *	@return savFiller
	 */   
	 public SavFiller getSavFiller() {
   	return savFiller;
   }
   /**
	* 	Update SavFiller with the passed value
	*   Corresponding COBOL Variable is SAV-FILLER
	*	@param value
	*/
   public void setSavFiller(char[] value) {
      savFiller.setString(value); 
   }   
    
     /**
	 * 	Update SavFiller 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavFiller(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savFiller.begin,savFiller.length());
   }
   
     /**
	 * 	Update SavFiller 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savFiller.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavFiller with another Field
	 *	@param value
	 */
   public void setSavFiller(Field source) {
   	replace(source,0,source.length(),savFiller.begin,savFiller.length());
   }  
   
     /**
	 * 	Update SavFiller 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavFiller(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savFiller.begin,savFiller.length());
   }
   
     /**
	 * 	Update SavFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savFiller.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSavMcdsChargeInfoFieldLength() {
			return SAV_MCDS_CHARGE_INFO_LENGTH;
		}

}
  
