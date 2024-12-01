package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvSpiCtgyCd5Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvSpiCtgyCd5Group extends HvSpiCtgyCd5GroupSerialized { 
   

						private char[] hvSpiCtgyCd5 = new char[2];
	
	/**
	* Constructor for HvSpiCtgyCd5Group
	**/
    public HvSpiCtgyCd5Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvSpiCtgyCd5Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd5Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvSpiCtgyCd5(fillSpace(2));
    } 

	/**
	 *	Returns the value of hvSpiCtgyCd5
	 *	@return hvSpiCtgyCd5
	 */
   public char[] getHvSpiCtgyCd5() throws CFException{
     if (isHvSpiCtgyCd5Modified()) { 
        hvSpiCtgyCd5 = refreshHvSpiCtgyCd5();
     }
   		return hvSpiCtgyCd5;
   }

  
	/**
	*  set variable hvSpiCtgyCd5
	*  Corresponding COBOL Variable is HV-SPI-CTGY-CD-5
	*  @param value
	**/
   public void setHvSpiCtgyCd5(char[] value) {
      hvSpiCtgyCd5 = checkHvSpiCtgyCd5Constraints(value);
      serializeHvSpiCtgyCd5(hvSpiCtgyCd5);
   } 

     /**
	 * 	Update HvSpiCtgyCd5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvSpiCtgyCd5,hvSpiCtgyCd5.length);
   	
   }
   
   public void setHvSpiCtgyCd5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd5,hvSpiCtgyCd5.length);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvSpiCtgyCd5 with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd5(Field source) {
       replace(source,0,source.length(),beginHvSpiCtgyCd5,HV_SPI_CTGY_CD_5_LEN);
   	
   }  
   
     /**
	 * 	Update HvSpiCtgyCd5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvSpiCtgyCd5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd5,HV_SPI_CTGY_CD_5_LEN);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd5+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvSpiCtgyCd5GroupFieldLength() {
			return HV_SPI_CTGY_CD_5_GROUP_LENGTH;
		}

}
  
