package com.cloudframe.app.dto.o529351u;

/**
*  The class CetCicsErrorTableRedefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CetCicsErrorTableRedefined01 extends CetCicsErrorTableRedefined01Serialized { 
   

						private char[] cetEibrcdByte3 = Field.fillLowValue(1);
	
	/**
	* Constructor for CetCicsErrorTableRedefined01
	**/
    public CetCicsErrorTableRedefined01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CetCicsErrorTableRedefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CetCicsErrorTableRedefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cetEibrcdByte3
	 *	@return cetEibrcdByte3
	 */
   public char[] getCetEibrcdByte3() throws CFException{
     if (isCetEibrcdByte3Modified()) { 
        cetEibrcdByte3 = refreshCetEibrcdByte3();
     }
   		return cetEibrcdByte3;
   }

  
	/**
	*  set variable cetEibrcdByte3
	*  Corresponding COBOL Variable is CET-EIBRCD-BYTE3
	*  @param value
	**/
   public void setCetEibrcdByte3(char[] value) {
      cetEibrcdByte3 = checkCetEibrcdByte3Constraints(value);
      serializeCetEibrcdByte3(cetEibrcdByte3);
   } 

     /**
	 * 	Update CetEibrcdByte3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCetEibrcdByte3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCetEibrcdByte3,cetEibrcdByte3.length);
   	
   }
   
   public void setCetEibrcdByte3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCetEibrcdByte3,cetEibrcdByte3.length);
   	
   }
   
     /**
	 * 	Update CetEibrcdByte3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCetEibrcdByte3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCetEibrcdByte3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CetEibrcdByte3 with another Field
	 *	@param value
	 */
   public void setCetEibrcdByte3(Field source) {
       replace(source,0,source.length(),beginCetEibrcdByte3,CET_EIBRCD_BYTE_3_LEN);
   	
   }  
   
     /**
	 * 	Update CetEibrcdByte3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCetEibrcdByte3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCetEibrcdByte3,CET_EIBRCD_BYTE_3_LEN);
   	
   }
   
     /**
	 * 	Update CetEibrcdByte3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCetEibrcdByte3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCetEibrcdByte3+targetIndex,targetLen);
    
   }
	char[] cetTermctlNostart88Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isCetTermctlNostart()
	 *	@return  Returns true if isCetTermctlNostart() is "6"
	 */
   public boolean isCetTermctlNostart() throws CFException {
      return (  compareChars( getCetEibrcdByte3() , cetTermctlNostart88Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setCetTermctlNostartTrue() {  			
    	setCetEibrcdByte3( cetTermctlNostart88Value);
   	}
	char[] cetTermctlNonval88Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isCetTermctlNonval()
	 *	@return  Returns true if isCetTermctlNonval() is "7"
	 */
   public boolean isCetTermctlNonval() throws CFException {
      return (  compareChars( getCetEibrcdByte3() , cetTermctlNonval88Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setCetTermctlNonvalTrue() {  			
    	setCetEibrcdByte3( cetTermctlNonval88Value);
   	}

	
	
	

		public static int getCetCicsErrorTableRedefined01FieldLength() {
			return CET_CICS_ERROR_TABLE_REDEFINED_01_LENGTH;
		}

}
  
