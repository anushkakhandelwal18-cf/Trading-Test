package com.cloudframe.app.dto.o529351u;

/**
*  The class SavProviderArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavProviderArea extends SavProviderAreaSerialized { 
   

								private long savProviderTinNumber;
				private SavProviderTinNumber15 savProviderTinNumber15 = new SavProviderTinNumber15();
	
	/**
	* Constructor for SavProviderArea
	**/
    public SavProviderArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavProviderArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavProviderArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			savProviderTinNumber15.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of savProviderTinNumber
	 *	@return savProviderTinNumber
	 */
	public long getSavProviderTinNumber() throws CFException {
       if (isSavProviderTinNumberModified()) { 
           savProviderTinNumber = refreshSavProviderTinNumber();
        }
   		return savProviderTinNumber;
	}
	

	
	   
	/**
	 * 	Update SavProviderTinNumber with the passed value
	 *  Corresponding COBOL Variable is SAV-PROVIDER-TIN-NUMBER
	 *	@param number
	 */
	public void setSavProviderTinNumber(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    savProviderTinNumber = checkSavProviderTinNumberMaxLimit(number); 
		serializeSavProviderTinNumber(savProviderTinNumber);
	}
	

	/**
	 * 	Update SavProviderTinNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setSavProviderTinNumber(char[] value) throws CFException {
		 savProviderTinNumber = serializeSavProviderTinNumber(value);
	}
	/**
	 * 	Update SavProviderTinNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSavProviderTinNumberString(char[] value) throws CFException {
		 setSavProviderTinNumber(value);
	}
	/**
	 *	Returns the value of savProviderTinNumber15
	 *	@return savProviderTinNumber15
	 */   
	 public SavProviderTinNumber15 getSavProviderTinNumber15() {
   	return savProviderTinNumber15;
   }
   /**
	* 	Update SavProviderTinNumber15 with the passed value
	*   Corresponding COBOL Variable is SAV-PROVIDER-TIN-NUMBER-15
	*	@param value
	*/
   public void setSavProviderTinNumber15(char[] value) {
      savProviderTinNumber15.setString(value); 
   }   
    
     /**
	 * 	Update SavProviderTinNumber15 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavProviderTinNumber15(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savProviderTinNumber15.begin,savProviderTinNumber15.length());
   }
   
     /**
	 * 	Update SavProviderTinNumber15 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavProviderTinNumber15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savProviderTinNumber15.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavProviderTinNumber15 with another Field
	 *	@param value
	 */
   public void setSavProviderTinNumber15(Field source) {
   	replace(source,0,source.length(),savProviderTinNumber15.begin,savProviderTinNumber15.length());
   }  
   
     /**
	 * 	Update SavProviderTinNumber15 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavProviderTinNumber15(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savProviderTinNumber15.begin,savProviderTinNumber15.length());
   }
   
     /**
	 * 	Update SavProviderTinNumber15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavProviderTinNumber15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savProviderTinNumber15.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSavProviderAreaFieldLength() {
			return SAV_PROVIDER_AREA_LENGTH;
		}

}
  
