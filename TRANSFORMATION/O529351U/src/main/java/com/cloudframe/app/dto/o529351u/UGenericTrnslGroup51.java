package com.cloudframe.app.dto.o529351u;

/**
*  The class UGenericTrnslGroup51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class UGenericTrnslGroup51 extends UGenericTrnslGroup51Serialized { 
   

						private char[] uGenericTrnsl51 = Field.fillLowValue(1);
	
	/**
	* Constructor for UGenericTrnslGroup51
	**/
    public UGenericTrnslGroup51() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for UGenericTrnslGroup51. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UGenericTrnslGroup51(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of uGenericTrnsl51
	 *	@return uGenericTrnsl51
	 */
   public char[] getUGenericTrnsl51() throws CFException{
     if (isUGenericTrnsl51Modified()) { 
        uGenericTrnsl51 = refreshUGenericTrnsl51();
     }
   		return uGenericTrnsl51;
   }

  
	/**
	*  set variable uGenericTrnsl51
	*  Corresponding COBOL Variable is LK-51U-GENERIC-TRNSL
	*  @param value
	**/
   public void setUGenericTrnsl51(char[] value) {
      uGenericTrnsl51 = checkUGenericTrnsl51Constraints(value);
      serializeUGenericTrnsl51(uGenericTrnsl51);
   } 

     /**
	 * 	Update UGenericTrnsl51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUGenericTrnsl51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUGenericTrnsl51,uGenericTrnsl51.length);
   	
   }
   
   public void setUGenericTrnsl51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUGenericTrnsl51,uGenericTrnsl51.length);
   	
   }
   
     /**
	 * 	Update UGenericTrnsl51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUGenericTrnsl51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUGenericTrnsl51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UGenericTrnsl51 with another Field
	 *	@param value
	 */
   public void setUGenericTrnsl51(Field source) {
       replace(source,0,source.length(),beginUGenericTrnsl51,U_GENERIC_TRNSL_51_LEN);
   	
   }  
   
     /**
	 * 	Update UGenericTrnsl51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUGenericTrnsl51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUGenericTrnsl51,U_GENERIC_TRNSL_51_LEN);
   	
   }
   
     /**
	 * 	Update UGenericTrnsl51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUGenericTrnsl51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUGenericTrnsl51+targetIndex,targetLen);
    
   }

	
	
	

		public static int getUGenericTrnslGroup51FieldLength() {
			return U_GENERIC_TRNSL_GROUP_51_LENGTH;
		}

}
  
