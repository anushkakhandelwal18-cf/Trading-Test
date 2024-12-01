package com.cloudframe.app.dto.o529351u;

/**
*  The class CetCicsErrorTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CetCicsErrorTable extends CetCicsErrorTableSerialized { 
   

						private char[] cetEibrcd = Field.fillLowValue(6);
	
	/**
	* Constructor for CetCicsErrorTable
	**/
    public CetCicsErrorTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CetCicsErrorTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CetCicsErrorTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cetEibrcd
	 *	@return cetEibrcd
	 */
   public char[] getCetEibrcd() throws CFException{
     if (isCetEibrcdModified()) { 
        cetEibrcd = refreshCetEibrcd();
     }
   		return cetEibrcd;
   }

  
	/**
	*  set variable cetEibrcd
	*  Corresponding COBOL Variable is CET-EIBRCD
	*  @param value
	**/
   public void setCetEibrcd(char[] value) {
      cetEibrcd = checkCetEibrcdConstraints(value);
      serializeCetEibrcd(cetEibrcd);
   } 

     /**
	 * 	Update CetEibrcd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCetEibrcd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCetEibrcd,cetEibrcd.length);
   	
   }
   
   public void setCetEibrcd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCetEibrcd,cetEibrcd.length);
   	
   }
   
     /**
	 * 	Update CetEibrcd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCetEibrcd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCetEibrcd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CetEibrcd with another Field
	 *	@param value
	 */
   public void setCetEibrcd(Field source) {
       replace(source,0,source.length(),beginCetEibrcd,CET_EIBRCD_LEN);
   	
   }  
   
     /**
	 * 	Update CetEibrcd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCetEibrcd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCetEibrcd,CET_EIBRCD_LEN);
   	
   }
   
     /**
	 * 	Update CetEibrcd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCetEibrcd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCetEibrcd+targetIndex,targetLen);
    
   }
	char[] cetNormalResponse88Value = fillLowValue(6);
	/**
	 *	Test condition new byte[] {(byte)0x00} for isCetNormalResponse()
	 *	@return  Returns true if isCetNormalResponse() is new byte[] {(byte)0x00}
	 */
   public boolean isCetNormalResponse() throws CFException {
      return (  compareChars( getCetEibrcd() , cetNormalResponse88Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00}
	*/
   	public void setCetNormalResponseTrue() {  			
    	setCetEibrcd( cetNormalResponse88Value);
   	}

	
	
	

		public static int getCetCicsErrorTableFieldLength() {
			return CET_CICS_ERROR_TABLE_LENGTH;
		}

}
  
