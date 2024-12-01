package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvSrvcCatgyCdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvSrvcCatgyCdGroup extends HvSrvcCatgyCdGroupSerialized { 
   

						private char[] hvSrvcCatgyCd = new char[2];
	
	/**
	* Constructor for HvSrvcCatgyCdGroup
	**/
    public HvSrvcCatgyCdGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvSrvcCatgyCdGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSrvcCatgyCdGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvSrvcCatgyCd(fillSpace(2));
    } 

	/**
	 *	Returns the value of hvSrvcCatgyCd
	 *	@return hvSrvcCatgyCd
	 */
   public char[] getHvSrvcCatgyCd() throws CFException{
     if (isHvSrvcCatgyCdModified()) { 
        hvSrvcCatgyCd = refreshHvSrvcCatgyCd();
     }
   		return hvSrvcCatgyCd;
   }

  
	/**
	*  set variable hvSrvcCatgyCd
	*  Corresponding COBOL Variable is HV-SRVC-CATGY-CD
	*  @param value
	**/
   public void setHvSrvcCatgyCd(char[] value) {
      hvSrvcCatgyCd = checkHvSrvcCatgyCdConstraints(value);
      serializeHvSrvcCatgyCd(hvSrvcCatgyCd);
   } 

     /**
	 * 	Update HvSrvcCatgyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvSrvcCatgyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvSrvcCatgyCd,hvSrvcCatgyCd.length);
   	
   }
   
   public void setHvSrvcCatgyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvSrvcCatgyCd,hvSrvcCatgyCd.length);
   	
   }
   
     /**
	 * 	Update HvSrvcCatgyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSrvcCatgyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSrvcCatgyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvSrvcCatgyCd with another Field
	 *	@param value
	 */
   public void setHvSrvcCatgyCd(Field source) {
       replace(source,0,source.length(),beginHvSrvcCatgyCd,HV_SRVC_CATGY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update HvSrvcCatgyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvSrvcCatgyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvSrvcCatgyCd,HV_SRVC_CATGY_CD_LEN);
   	
   }
   
     /**
	 * 	Update HvSrvcCatgyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSrvcCatgyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvSrvcCatgyCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvSrvcCatgyCdGroupFieldLength() {
			return HV_SRVC_CATGY_CD_GROUP_LENGTH;
		}

}
  
