package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvSpiCtgyCd4Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvSpiCtgyCd4Group extends HvSpiCtgyCd4GroupSerialized { 
   

						private char[] hvSpiCtgyCd4 = new char[2];
	
	/**
	* Constructor for HvSpiCtgyCd4Group
	**/
    public HvSpiCtgyCd4Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvSpiCtgyCd4Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd4Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvSpiCtgyCd4(fillSpace(2));
    } 

	/**
	 *	Returns the value of hvSpiCtgyCd4
	 *	@return hvSpiCtgyCd4
	 */
   public char[] getHvSpiCtgyCd4() throws CFException{
     if (isHvSpiCtgyCd4Modified()) { 
        hvSpiCtgyCd4 = refreshHvSpiCtgyCd4();
     }
   		return hvSpiCtgyCd4;
   }

  
	/**
	*  set variable hvSpiCtgyCd4
	*  Corresponding COBOL Variable is HV-SPI-CTGY-CD-4
	*  @param value
	**/
   public void setHvSpiCtgyCd4(char[] value) {
      hvSpiCtgyCd4 = checkHvSpiCtgyCd4Constraints(value);
      serializeHvSpiCtgyCd4(hvSpiCtgyCd4);
   } 

     /**
	 * 	Update HvSpiCtgyCd4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvSpiCtgyCd4,hvSpiCtgyCd4.length);
   	
   }
   
   public void setHvSpiCtgyCd4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd4,hvSpiCtgyCd4.length);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvSpiCtgyCd4 with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd4(Field source) {
       replace(source,0,source.length(),beginHvSpiCtgyCd4,HV_SPI_CTGY_CD_4_LEN);
   	
   }  
   
     /**
	 * 	Update HvSpiCtgyCd4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvSpiCtgyCd4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd4,HV_SPI_CTGY_CD_4_LEN);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvSpiCtgyCd4GroupFieldLength() {
			return HV_SPI_CTGY_CD_4_GROUP_LENGTH;
		}

}
  
