package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvSpiCtgyCd2Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvSpiCtgyCd2Group extends HvSpiCtgyCd2GroupSerialized { 
   

						private char[] hvSpiCtgyCd2 = new char[2];
	
	/**
	* Constructor for HvSpiCtgyCd2Group
	**/
    public HvSpiCtgyCd2Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvSpiCtgyCd2Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd2Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvSpiCtgyCd2(fillSpace(2));
    } 

	/**
	 *	Returns the value of hvSpiCtgyCd2
	 *	@return hvSpiCtgyCd2
	 */
   public char[] getHvSpiCtgyCd2() throws CFException{
     if (isHvSpiCtgyCd2Modified()) { 
        hvSpiCtgyCd2 = refreshHvSpiCtgyCd2();
     }
   		return hvSpiCtgyCd2;
   }

  
	/**
	*  set variable hvSpiCtgyCd2
	*  Corresponding COBOL Variable is HV-SPI-CTGY-CD-2
	*  @param value
	**/
   public void setHvSpiCtgyCd2(char[] value) {
      hvSpiCtgyCd2 = checkHvSpiCtgyCd2Constraints(value);
      serializeHvSpiCtgyCd2(hvSpiCtgyCd2);
   } 

     /**
	 * 	Update HvSpiCtgyCd2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvSpiCtgyCd2,hvSpiCtgyCd2.length);
   	
   }
   
   public void setHvSpiCtgyCd2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd2,hvSpiCtgyCd2.length);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvSpiCtgyCd2 with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd2(Field source) {
       replace(source,0,source.length(),beginHvSpiCtgyCd2,HV_SPI_CTGY_CD_2_LEN);
   	
   }  
   
     /**
	 * 	Update HvSpiCtgyCd2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvSpiCtgyCd2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd2,HV_SPI_CTGY_CD_2_LEN);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvSpiCtgyCd2GroupFieldLength() {
			return HV_SPI_CTGY_CD_2_GROUP_LENGTH;
		}

}
  
