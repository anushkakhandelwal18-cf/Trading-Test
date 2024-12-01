package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvFlnJulianDtNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvFlnJulianDtNbrGroup extends HvFlnJulianDtNbrGroupSerialized { 
   

						private char[] hvFlnJulianDtNbr = new char[5];
	
	/**
	* Constructor for HvFlnJulianDtNbrGroup
	**/
    public HvFlnJulianDtNbrGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvFlnJulianDtNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvFlnJulianDtNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvFlnJulianDtNbr(("00000").toCharArray());
    } 

	/**
	 *	Returns the value of hvFlnJulianDtNbr
	 *	@return hvFlnJulianDtNbr
	 */
   public char[] getHvFlnJulianDtNbr() throws CFException{
     if (isHvFlnJulianDtNbrModified()) { 
        hvFlnJulianDtNbr = refreshHvFlnJulianDtNbr();
     }
   		return hvFlnJulianDtNbr;
   }

  
	/**
	*  set variable hvFlnJulianDtNbr
	*  Corresponding COBOL Variable is HV-FLN-JULIAN-DT-NBR
	*  @param value
	**/
   public void setHvFlnJulianDtNbr(char[] value) {
      hvFlnJulianDtNbr = checkHvFlnJulianDtNbrConstraints(value);
      serializeHvFlnJulianDtNbr(hvFlnJulianDtNbr);
   } 

     /**
	 * 	Update HvFlnJulianDtNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvFlnJulianDtNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvFlnJulianDtNbr,hvFlnJulianDtNbr.length);
   	
   }
   
   public void setHvFlnJulianDtNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvFlnJulianDtNbr,hvFlnJulianDtNbr.length);
   	
   }
   
     /**
	 * 	Update HvFlnJulianDtNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvFlnJulianDtNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvFlnJulianDtNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvFlnJulianDtNbr with another Field
	 *	@param value
	 */
   public void setHvFlnJulianDtNbr(Field source) {
       replace(source,0,source.length(),beginHvFlnJulianDtNbr,HV_FLN_JULIAN_DT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update HvFlnJulianDtNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvFlnJulianDtNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvFlnJulianDtNbr,HV_FLN_JULIAN_DT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update HvFlnJulianDtNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvFlnJulianDtNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvFlnJulianDtNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvFlnJulianDtNbrGroupFieldLength() {
			return HV_FLN_JULIAN_DT_NBR_GROUP_LENGTH;
		}

}
  
