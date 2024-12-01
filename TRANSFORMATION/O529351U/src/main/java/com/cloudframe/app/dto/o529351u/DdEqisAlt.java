package com.cloudframe.app.dto.o529351u;

/**
*  The class DdEqisAlt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DdEqisAlt extends DdEqisAltSerialized { 
   

						private char[] eqiAltId = Field.fillLowValue(1);

						private char[] eqiAltFillerWs = new char[7];
	
	/**
	* Constructor for DdEqisAlt
	**/
    public DdEqisAlt() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setEqiAltFillerWs(("REQPT00").toCharArray());
    }


 

	/**
	 *	Returns the value of eqiAltId
	 *	@return eqiAltId
	 */
   public char[] getEqiAltId() throws CFException{
     if (isEqiAltIdModified()) { 
        eqiAltId = refreshEqiAltId();
     }
   		return eqiAltId;
   }

  
	/**
	*  set variable eqiAltId
	*  Corresponding COBOL Variable is WS-EQI-ALT-ID
	*  @param value
	**/
   public void setEqiAltId(char[] value) {
      eqiAltId = checkEqiAltIdConstraints(value);
      serializeEqiAltId(eqiAltId);
   } 

     /**
	 * 	Update EqiAltId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEqiAltId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEqiAltId,eqiAltId.length);
   	
   }
   
   public void setEqiAltId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEqiAltId,eqiAltId.length);
   	
   }
   
     /**
	 * 	Update EqiAltId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEqiAltId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEqiAltId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EqiAltId with another Field
	 *	@param value
	 */
   public void setEqiAltId(Field source) {
       replace(source,0,source.length(),beginEqiAltId,EQI_ALT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update EqiAltId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEqiAltId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEqiAltId,EQI_ALT_ID_LEN);
   	
   }
   
     /**
	 * 	Update EqiAltId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEqiAltId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEqiAltId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of eqiAltFillerWs
	 *	@return eqiAltFillerWs
	 */
   public char[] getEqiAltFillerWs() throws CFException{
     if (isEqiAltFillerWsModified()) { 
        eqiAltFillerWs = refreshEqiAltFillerWs();
     }
   		return eqiAltFillerWs;
   }

  
	/**
	*  set variable eqiAltFillerWs
	*  Corresponding COBOL Variable is WS-EQI-ALT-FILLER
	*  @param value
	**/
   public void setEqiAltFillerWs(char[] value) {
      eqiAltFillerWs = checkEqiAltFillerWsConstraints(value);
      serializeEqiAltFillerWs(eqiAltFillerWs);
   } 

     /**
	 * 	Update EqiAltFillerWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEqiAltFillerWs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEqiAltFillerWs,eqiAltFillerWs.length);
   	
   }
   
   public void setEqiAltFillerWs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEqiAltFillerWs,eqiAltFillerWs.length);
   	
   }
   
     /**
	 * 	Update EqiAltFillerWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEqiAltFillerWs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEqiAltFillerWs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EqiAltFillerWs with another Field
	 *	@param value
	 */
   public void setEqiAltFillerWs(Field source) {
       replace(source,0,source.length(),beginEqiAltFillerWs,EQI_ALT_FILLER_WS_LEN);
   	
   }  
   
     /**
	 * 	Update EqiAltFillerWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEqiAltFillerWs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEqiAltFillerWs,EQI_ALT_FILLER_WS_LEN);
   	
   }
   
     /**
	 * 	Update EqiAltFillerWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEqiAltFillerWs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEqiAltFillerWs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDdEqisAltFieldLength() {
			return DD_EQIS_ALT_LENGTH;
		}

}
  
