package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvLstSrvcDtGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvLstSrvcDtGroup extends HvLstSrvcDtGroupSerialized { 
   

						private char[] hvLstSrvcDt = new char[10];
	
	/**
	* Constructor for HvLstSrvcDtGroup
	**/
    public HvLstSrvcDtGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvLstSrvcDtGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvLstSrvcDtGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvLstSrvcDt(("9999-12-31").toCharArray());
    } 

	/**
	 *	Returns the value of hvLstSrvcDt
	 *	@return hvLstSrvcDt
	 */
   public char[] getHvLstSrvcDt() throws CFException{
     if (isHvLstSrvcDtModified()) { 
        hvLstSrvcDt = refreshHvLstSrvcDt();
     }
   		return hvLstSrvcDt;
   }

  
	/**
	*  set variable hvLstSrvcDt
	*  Corresponding COBOL Variable is HV-LST-SRVC-DT
	*  @param value
	**/
   public void setHvLstSrvcDt(char[] value) {
      hvLstSrvcDt = checkHvLstSrvcDtConstraints(value);
      serializeHvLstSrvcDt(hvLstSrvcDt);
   } 

     /**
	 * 	Update HvLstSrvcDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvLstSrvcDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvLstSrvcDt,hvLstSrvcDt.length);
   	
   }
   
   public void setHvLstSrvcDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvLstSrvcDt,hvLstSrvcDt.length);
   	
   }
   
     /**
	 * 	Update HvLstSrvcDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvLstSrvcDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvLstSrvcDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvLstSrvcDt with another Field
	 *	@param value
	 */
   public void setHvLstSrvcDt(Field source) {
       replace(source,0,source.length(),beginHvLstSrvcDt,HV_LST_SRVC_DT_LEN);
   	
   }  
   
     /**
	 * 	Update HvLstSrvcDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvLstSrvcDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvLstSrvcDt,HV_LST_SRVC_DT_LEN);
   	
   }
   
     /**
	 * 	Update HvLstSrvcDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvLstSrvcDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvLstSrvcDt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvLstSrvcDtGroupFieldLength() {
			return HV_LST_SRVC_DT_GROUP_LENGTH;
		}

}
  
