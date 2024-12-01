package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DderefIcnSufxCdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DderefIcnSufxCdGroup extends DderefIcnSufxCdGroupSerialized { 
   

						private char[] dderefIcnSufxCd = Field.fillLowValue(2);
	
	/**
	* Constructor for DderefIcnSufxCdGroup
	**/
    public DderefIcnSufxCdGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DderefIcnSufxCdGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefIcnSufxCdGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dderefIcnSufxCd
	 *	@return dderefIcnSufxCd
	 */
   public char[] getDderefIcnSufxCd() throws CFException{
     if (isDderefIcnSufxCdModified()) { 
        dderefIcnSufxCd = refreshDderefIcnSufxCd();
     }
   		return dderefIcnSufxCd;
   }

  
	/**
	*  set variable dderefIcnSufxCd
	*  Corresponding COBOL Variable is DDEREF-ICN-SUFX-CD
	*  @param value
	**/
   public void setDderefIcnSufxCd(char[] value) {
      dderefIcnSufxCd = checkDderefIcnSufxCdConstraints(value);
      serializeDderefIcnSufxCd(dderefIcnSufxCd);
   } 

     /**
	 * 	Update DderefIcnSufxCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDderefIcnSufxCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDderefIcnSufxCd,dderefIcnSufxCd.length);
   	
   }
   
   public void setDderefIcnSufxCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDderefIcnSufxCd,dderefIcnSufxCd.length);
   	
   }
   
     /**
	 * 	Update DderefIcnSufxCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefIcnSufxCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefIcnSufxCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DderefIcnSufxCd with another Field
	 *	@param value
	 */
   public void setDderefIcnSufxCd(Field source) {
       replace(source,0,source.length(),beginDderefIcnSufxCd,DDEREF_ICN_SUFX_CD_LEN);
   	
   }  
   
     /**
	 * 	Update DderefIcnSufxCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDderefIcnSufxCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDderefIcnSufxCd,DDEREF_ICN_SUFX_CD_LEN);
   	
   }
   
     /**
	 * 	Update DderefIcnSufxCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefIcnSufxCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefIcnSufxCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDderefIcnSufxCdGroupFieldLength() {
			return DDEREF_ICN_SUFX_CD_GROUP_LENGTH;
		}

}
  
