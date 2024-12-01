package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvSpiCtgyCd3Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvSpiCtgyCd3Group extends HvSpiCtgyCd3GroupSerialized { 
   

						private char[] hvSpiCtgyCd3 = new char[2];
	
	/**
	* Constructor for HvSpiCtgyCd3Group
	**/
    public HvSpiCtgyCd3Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvSpiCtgyCd3Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd3Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvSpiCtgyCd3(fillSpace(2));
    } 

	/**
	 *	Returns the value of hvSpiCtgyCd3
	 *	@return hvSpiCtgyCd3
	 */
   public char[] getHvSpiCtgyCd3() throws CFException{
     if (isHvSpiCtgyCd3Modified()) { 
        hvSpiCtgyCd3 = refreshHvSpiCtgyCd3();
     }
   		return hvSpiCtgyCd3;
   }

  
	/**
	*  set variable hvSpiCtgyCd3
	*  Corresponding COBOL Variable is HV-SPI-CTGY-CD-3
	*  @param value
	**/
   public void setHvSpiCtgyCd3(char[] value) {
      hvSpiCtgyCd3 = checkHvSpiCtgyCd3Constraints(value);
      serializeHvSpiCtgyCd3(hvSpiCtgyCd3);
   } 

     /**
	 * 	Update HvSpiCtgyCd3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvSpiCtgyCd3,hvSpiCtgyCd3.length);
   	
   }
   
   public void setHvSpiCtgyCd3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd3,hvSpiCtgyCd3.length);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvSpiCtgyCd3 with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd3(Field source) {
       replace(source,0,source.length(),beginHvSpiCtgyCd3,HV_SPI_CTGY_CD_3_LEN);
   	
   }  
   
     /**
	 * 	Update HvSpiCtgyCd3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvSpiCtgyCd3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd3,HV_SPI_CTGY_CD_3_LEN);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd3+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvSpiCtgyCd3GroupFieldLength() {
			return HV_SPI_CTGY_CD_3_GROUP_LENGTH;
		}

}
  
