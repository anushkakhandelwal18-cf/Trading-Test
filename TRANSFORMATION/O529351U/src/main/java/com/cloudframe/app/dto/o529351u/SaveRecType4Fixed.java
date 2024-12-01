package com.cloudframe.app.dto.o529351u;

/**
*  The class SaveRecType4Fixed is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SaveRecType4Fixed extends SaveRecType4FixedSerialized { 
   
				private SavProviderInfo savProviderInfo = new SavProviderInfo();
				private SavHcdsInfo savHcdsInfo = new SavHcdsInfo();
				private SavMcdsInfo savMcdsInfo = new SavMcdsInfo();
	
	/**
	* Constructor for SaveRecType4Fixed
	**/
    public SaveRecType4Fixed() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SaveRecType4Fixed. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SaveRecType4Fixed(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			savProviderInfo.setParent(this,getStartOffset() + 58);
	       			savHcdsInfo.setParent(this,getStartOffset() + 589);
	       			savMcdsInfo.setParent(this,getStartOffset() + 589);
    } 

	/**
	 *	Returns the value of savProviderInfo
	 *	@return savProviderInfo
	 */   
	 public SavProviderInfo getSavProviderInfo() {
   	return savProviderInfo;
   }
   /**
	* 	Update SavProviderInfo with the passed value
	*   Corresponding COBOL Variable is SAV-PROVIDER-INFO
	*	@param value
	*/
   public void setSavProviderInfo(char[] value) {
      savProviderInfo.setString(value); 
   }   
    
     /**
	 * 	Update SavProviderInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavProviderInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savProviderInfo.begin,savProviderInfo.length());
   }
   
     /**
	 * 	Update SavProviderInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavProviderInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savProviderInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavProviderInfo with another Field
	 *	@param value
	 */
   public void setSavProviderInfo(Field source) {
   	replace(source,0,source.length(),savProviderInfo.begin,savProviderInfo.length());
   }  
   
     /**
	 * 	Update SavProviderInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavProviderInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savProviderInfo.begin,savProviderInfo.length());
   }
   
     /**
	 * 	Update SavProviderInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavProviderInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savProviderInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of savHcdsInfo
	 *	@return savHcdsInfo
	 */   
	 public SavHcdsInfo getSavHcdsInfo() {
   	return savHcdsInfo;
   }
   /**
	* 	Update SavHcdsInfo with the passed value
	*   Corresponding COBOL Variable is SAV-HCDS-INFO
	*	@param value
	*/
   public void setSavHcdsInfo(char[] value) {
      savHcdsInfo.setString(value); 
   }   
    
     /**
	 * 	Update SavHcdsInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavHcdsInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savHcdsInfo.begin,savHcdsInfo.length());
   }
   
     /**
	 * 	Update SavHcdsInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavHcdsInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savHcdsInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavHcdsInfo with another Field
	 *	@param value
	 */
   public void setSavHcdsInfo(Field source) {
   	replace(source,0,source.length(),savHcdsInfo.begin,savHcdsInfo.length());
   }  
   
     /**
	 * 	Update SavHcdsInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavHcdsInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savHcdsInfo.begin,savHcdsInfo.length());
   }
   
     /**
	 * 	Update SavHcdsInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavHcdsInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savHcdsInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of savMcdsInfo
	 *	@return savMcdsInfo
	 */   
	 public SavMcdsInfo getSavMcdsInfo() {
   	return savMcdsInfo;
   }
   /**
	* 	Update SavMcdsInfo with the passed value
	*   Corresponding COBOL Variable is SAV-MCDS-INFO
	*	@param value
	*/
   public void setSavMcdsInfo(char[] value) {
      savMcdsInfo.setString(value); 
   }   
    
     /**
	 * 	Update SavMcdsInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavMcdsInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savMcdsInfo.begin,savMcdsInfo.length());
   }
   
     /**
	 * 	Update SavMcdsInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavMcdsInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savMcdsInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavMcdsInfo with another Field
	 *	@param value
	 */
   public void setSavMcdsInfo(Field source) {
   	replace(source,0,source.length(),savMcdsInfo.begin,savMcdsInfo.length());
   }  
   
     /**
	 * 	Update SavMcdsInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavMcdsInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savMcdsInfo.begin,savMcdsInfo.length());
   }
   
     /**
	 * 	Update SavMcdsInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavMcdsInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savMcdsInfo.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSaveRecType4FixedFieldLength() {
			return SAVE_REC_TYPE_4_FIXED_LENGTH;
		}

}
  
