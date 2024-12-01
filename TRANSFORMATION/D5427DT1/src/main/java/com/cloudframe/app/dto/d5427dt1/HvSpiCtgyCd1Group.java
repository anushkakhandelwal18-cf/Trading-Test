package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvSpiCtgyCd1Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvSpiCtgyCd1Group extends HvSpiCtgyCd1GroupSerialized { 
   

						private char[] hvSpiCtgyCd1 = new char[2];
	
	/**
	* Constructor for HvSpiCtgyCd1Group
	**/
    public HvSpiCtgyCd1Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvSpiCtgyCd1Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd1Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvSpiCtgyCd1(fillSpace(2));
    } 

	/**
	 *	Returns the value of hvSpiCtgyCd1
	 *	@return hvSpiCtgyCd1
	 */
   public char[] getHvSpiCtgyCd1() throws CFException{
     if (isHvSpiCtgyCd1Modified()) { 
        hvSpiCtgyCd1 = refreshHvSpiCtgyCd1();
     }
   		return hvSpiCtgyCd1;
   }

  
	/**
	*  set variable hvSpiCtgyCd1
	*  Corresponding COBOL Variable is HV-SPI-CTGY-CD-1
	*  @param value
	**/
   public void setHvSpiCtgyCd1(char[] value) {
      hvSpiCtgyCd1 = checkHvSpiCtgyCd1Constraints(value);
      serializeHvSpiCtgyCd1(hvSpiCtgyCd1);
   } 

     /**
	 * 	Update HvSpiCtgyCd1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvSpiCtgyCd1,hvSpiCtgyCd1.length);
   	
   }
   
   public void setHvSpiCtgyCd1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd1,hvSpiCtgyCd1.length);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvSpiCtgyCd1 with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd1(Field source) {
       replace(source,0,source.length(),beginHvSpiCtgyCd1,HV_SPI_CTGY_CD_1_LEN);
   	
   }  
   
     /**
	 * 	Update HvSpiCtgyCd1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvSpiCtgyCd1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd1,HV_SPI_CTGY_CD_1_LEN);
   	
   }
   
     /**
	 * 	Update HvSpiCtgyCd1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSpiCtgyCd1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvSpiCtgyCd1GroupFieldLength() {
			return HV_SPI_CTGY_CD_1_GROUP_LENGTH;
		}

}
  
