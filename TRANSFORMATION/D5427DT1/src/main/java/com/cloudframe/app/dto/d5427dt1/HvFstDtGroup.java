package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvFstDtGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvFstDtGroup extends HvFstDtGroupSerialized { 
   

						private char[] hvFstDt = new char[10];
	
	/**
	* Constructor for HvFstDtGroup
	**/
    public HvFstDtGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvFstDtGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvFstDtGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvFstDt(("0001-01-01").toCharArray());
    } 

	/**
	 *	Returns the value of hvFstDt
	 *	@return hvFstDt
	 */
   public char[] getHvFstDt() throws CFException{
     if (isHvFstDtModified()) { 
        hvFstDt = refreshHvFstDt();
     }
   		return hvFstDt;
   }

  
	/**
	*  set variable hvFstDt
	*  Corresponding COBOL Variable is HV-FST-DT
	*  @param value
	**/
   public void setHvFstDt(char[] value) {
      hvFstDt = checkHvFstDtConstraints(value);
      serializeHvFstDt(hvFstDt);
   } 

     /**
	 * 	Update HvFstDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvFstDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvFstDt,hvFstDt.length);
   	
   }
   
   public void setHvFstDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvFstDt,hvFstDt.length);
   	
   }
   
     /**
	 * 	Update HvFstDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvFstDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvFstDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvFstDt with another Field
	 *	@param value
	 */
   public void setHvFstDt(Field source) {
       replace(source,0,source.length(),beginHvFstDt,HV_FST_DT_LEN);
   	
   }  
   
     /**
	 * 	Update HvFstDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvFstDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvFstDt,HV_FST_DT_LEN);
   	
   }
   
     /**
	 * 	Update HvFstDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvFstDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvFstDt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvFstDtGroupFieldLength() {
			return HV_FST_DT_GROUP_LENGTH;
		}

}
  
