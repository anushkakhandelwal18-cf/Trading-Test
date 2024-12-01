package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvFlnSrlNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvFlnSrlNbrGroup extends HvFlnSrlNbrGroupSerialized { 
   

						private char[] hvFlnSrlNbr = new char[5];
	
	/**
	* Constructor for HvFlnSrlNbrGroup
	**/
    public HvFlnSrlNbrGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvFlnSrlNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvFlnSrlNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvFlnSrlNbr(("00000").toCharArray());
    } 

	/**
	 *	Returns the value of hvFlnSrlNbr
	 *	@return hvFlnSrlNbr
	 */
   public char[] getHvFlnSrlNbr() throws CFException{
     if (isHvFlnSrlNbrModified()) { 
        hvFlnSrlNbr = refreshHvFlnSrlNbr();
     }
   		return hvFlnSrlNbr;
   }

  
	/**
	*  set variable hvFlnSrlNbr
	*  Corresponding COBOL Variable is HV-FLN-SRL-NBR
	*  @param value
	**/
   public void setHvFlnSrlNbr(char[] value) {
      hvFlnSrlNbr = checkHvFlnSrlNbrConstraints(value);
      serializeHvFlnSrlNbr(hvFlnSrlNbr);
   } 

     /**
	 * 	Update HvFlnSrlNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvFlnSrlNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvFlnSrlNbr,hvFlnSrlNbr.length);
   	
   }
   
   public void setHvFlnSrlNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvFlnSrlNbr,hvFlnSrlNbr.length);
   	
   }
   
     /**
	 * 	Update HvFlnSrlNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvFlnSrlNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvFlnSrlNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvFlnSrlNbr with another Field
	 *	@param value
	 */
   public void setHvFlnSrlNbr(Field source) {
       replace(source,0,source.length(),beginHvFlnSrlNbr,HV_FLN_SRL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update HvFlnSrlNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvFlnSrlNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvFlnSrlNbr,HV_FLN_SRL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update HvFlnSrlNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvFlnSrlNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvFlnSrlNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvFlnSrlNbrGroupFieldLength() {
			return HV_FLN_SRL_NBR_GROUP_LENGTH;
		}

}
  
