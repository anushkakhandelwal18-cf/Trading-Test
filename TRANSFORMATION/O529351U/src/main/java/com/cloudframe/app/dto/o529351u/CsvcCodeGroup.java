package com.cloudframe.app.dto.o529351u;

/**
*  The class CsvcCodeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CsvcCodeGroup extends CsvcCodeGroupSerialized { 
   
					private CsvcCode csvcCode = new CsvcCode();
					private CsvcCodeA csvcCodeA = new CsvcCodeA();
	
	/**
	* Constructor for CsvcCodeGroup
	**/
    public CsvcCodeGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			csvcCode.setParent(this,getStartOffset() + 0);
	       			csvcCodeA.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of csvcCode
	 *	@return csvcCode
	 */   
	 public CsvcCode getCsvcCode() {
   	return csvcCode;
   }
   /**
	* 	Update CsvcCode with the passed value
	*   Corresponding COBOL Variable is CSVC-CODE
	*	@param value
	*/
   public void setCsvcCode(char[] value) {
      csvcCode.setString(value); 
   }   
    
     /**
	 * 	Update CsvcCode 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCsvcCode(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,csvcCode.begin,csvcCode.length());
   }
   
     /**
	 * 	Update CsvcCode 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsvcCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,csvcCode.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CsvcCode with another Field
	 *	@param value
	 */
   public void setCsvcCode(Field source) {
   	replace(source,0,source.length(),csvcCode.begin,csvcCode.length());
   }  
   
     /**
	 * 	Update CsvcCode 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCsvcCode(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,csvcCode.begin,csvcCode.length());
   }
   
     /**
	 * 	Update CsvcCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsvcCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,csvcCode.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of csvcCodeA
	 *	@return csvcCodeA
	 */   
	 public CsvcCodeA getCsvcCodeA() {
   	return csvcCodeA;
   }
   /**
	* 	Update CsvcCodeA with the passed value
	*   Corresponding COBOL Variable is CSVC-CODE-A
	*	@param value
	*/
   public void setCsvcCodeA(char[] value) {
      csvcCodeA.setString(value); 
   }   
    
     /**
	 * 	Update CsvcCodeA 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCsvcCodeA(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,csvcCodeA.begin,csvcCodeA.length());
   }
   
     /**
	 * 	Update CsvcCodeA 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsvcCodeA(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,csvcCodeA.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CsvcCodeA with another Field
	 *	@param value
	 */
   public void setCsvcCodeA(Field source) {
   	replace(source,0,source.length(),csvcCodeA.begin,csvcCodeA.length());
   }  
   
     /**
	 * 	Update CsvcCodeA 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCsvcCodeA(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,csvcCodeA.begin,csvcCodeA.length());
   }
   
     /**
	 * 	Update CsvcCodeA 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsvcCodeA(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,csvcCodeA.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCsvcCodeGroupFieldLength() {
			return CSVC_CODE_GROUP_LENGTH;
		}

}
  
