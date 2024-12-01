package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvExtrNtfyNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvExtrNtfyNbrGroup extends HvExtrNtfyNbrGroupSerialized { 
   

						private char[] hvExtrNtfyNbr = new char[50];
	
	/**
	* Constructor for HvExtrNtfyNbrGroup
	**/
    public HvExtrNtfyNbrGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvExtrNtfyNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvExtrNtfyNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvExtrNtfyNbr(fillSpace(50));
    } 

	/**
	 *	Returns the value of hvExtrNtfyNbr
	 *	@return hvExtrNtfyNbr
	 */
   public char[] getHvExtrNtfyNbr() throws CFException{
     if (isHvExtrNtfyNbrModified()) { 
        hvExtrNtfyNbr = refreshHvExtrNtfyNbr();
     }
   		return hvExtrNtfyNbr;
   }

  
	/**
	*  set variable hvExtrNtfyNbr
	*  Corresponding COBOL Variable is HV-EXTR-NTFY-NBR
	*  @param value
	**/
   public void setHvExtrNtfyNbr(char[] value) {
      hvExtrNtfyNbr = checkHvExtrNtfyNbrConstraints(value);
      serializeHvExtrNtfyNbr(hvExtrNtfyNbr);
   } 

     /**
	 * 	Update HvExtrNtfyNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvExtrNtfyNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvExtrNtfyNbr,hvExtrNtfyNbr.length);
   	
   }
   
   public void setHvExtrNtfyNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvExtrNtfyNbr,hvExtrNtfyNbr.length);
   	
   }
   
     /**
	 * 	Update HvExtrNtfyNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvExtrNtfyNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvExtrNtfyNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvExtrNtfyNbr with another Field
	 *	@param value
	 */
   public void setHvExtrNtfyNbr(Field source) {
       replace(source,0,source.length(),beginHvExtrNtfyNbr,HV_EXTR_NTFY_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update HvExtrNtfyNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvExtrNtfyNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvExtrNtfyNbr,HV_EXTR_NTFY_NBR_LEN);
   	
   }
   
     /**
	 * 	Update HvExtrNtfyNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvExtrNtfyNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvExtrNtfyNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvExtrNtfyNbrGroupFieldLength() {
			return HV_EXTR_NTFY_NBR_GROUP_LENGTH;
		}

}
  
