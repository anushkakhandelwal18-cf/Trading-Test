package com.cloudframe.app.dto.d529351u;

/**
*  The class LstIcdKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class LstIcdKey extends LstIcdKeySerialized { 
   

						private char[] lstClmIcdInd = Field.fillLowValue(1);

						private char[] lstClmIcdPos = Field.fillLowValue(2);

						private char[] lstClmIcdSvc = Field.fillLowValue(6);

						private char[] lstClmIcdCau = Field.fillLowValue(1);
	
	/**
	* Constructor for LstIcdKey
	**/
    public LstIcdKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lstClmIcdInd
	 *	@return lstClmIcdInd
	 */
   public char[] getLstClmIcdInd() throws CFException{
     if (isLstClmIcdIndModified()) { 
        lstClmIcdInd = refreshLstClmIcdInd();
     }
   		return lstClmIcdInd;
   }

  
	/**
	*  set variable lstClmIcdInd
	*  Corresponding COBOL Variable is WS-LST-CLM-ICD-IND
	*  @param value
	**/
   public void setLstClmIcdInd(char[] value) {
      lstClmIcdInd = checkLstClmIcdIndConstraints(value);
      serializeLstClmIcdInd(lstClmIcdInd);
   } 

     /**
	 * 	Update LstClmIcdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLstClmIcdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLstClmIcdInd,lstClmIcdInd.length);
   	
   }
   
   public void setLstClmIcdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdInd,lstClmIcdInd.length);
   	
   }
   
     /**
	 * 	Update LstClmIcdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLstClmIcdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LstClmIcdInd with another Field
	 *	@param value
	 */
   public void setLstClmIcdInd(Field source) {
       replace(source,0,source.length(),beginLstClmIcdInd,LST_CLM_ICD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update LstClmIcdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLstClmIcdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLstClmIcdInd,LST_CLM_ICD_IND_LEN);
   	
   }
   
     /**
	 * 	Update LstClmIcdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLstClmIcdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lstClmIcdPos
	 *	@return lstClmIcdPos
	 */
   public char[] getLstClmIcdPos() throws CFException{
     if (isLstClmIcdPosModified()) { 
        lstClmIcdPos = refreshLstClmIcdPos();
     }
   		return lstClmIcdPos;
   }

  
	/**
	*  set variable lstClmIcdPos
	*  Corresponding COBOL Variable is WS-LST-CLM-ICD-POS
	*  @param value
	**/
   public void setLstClmIcdPos(char[] value) {
      lstClmIcdPos = checkLstClmIcdPosConstraints(value);
      serializeLstClmIcdPos(lstClmIcdPos);
   } 

     /**
	 * 	Update LstClmIcdPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLstClmIcdPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLstClmIcdPos,lstClmIcdPos.length);
   	
   }
   
   public void setLstClmIcdPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdPos,lstClmIcdPos.length);
   	
   }
   
     /**
	 * 	Update LstClmIcdPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLstClmIcdPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LstClmIcdPos with another Field
	 *	@param value
	 */
   public void setLstClmIcdPos(Field source) {
       replace(source,0,source.length(),beginLstClmIcdPos,LST_CLM_ICD_POS_LEN);
   	
   }  
   
     /**
	 * 	Update LstClmIcdPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLstClmIcdPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLstClmIcdPos,LST_CLM_ICD_POS_LEN);
   	
   }
   
     /**
	 * 	Update LstClmIcdPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLstClmIcdPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lstClmIcdSvc
	 *	@return lstClmIcdSvc
	 */
   public char[] getLstClmIcdSvc() throws CFException{
     if (isLstClmIcdSvcModified()) { 
        lstClmIcdSvc = refreshLstClmIcdSvc();
     }
   		return lstClmIcdSvc;
   }

  
	/**
	*  set variable lstClmIcdSvc
	*  Corresponding COBOL Variable is WS-LST-CLM-ICD-SVC
	*  @param value
	**/
   public void setLstClmIcdSvc(char[] value) {
      lstClmIcdSvc = checkLstClmIcdSvcConstraints(value);
      serializeLstClmIcdSvc(lstClmIcdSvc);
   } 

     /**
	 * 	Update LstClmIcdSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLstClmIcdSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLstClmIcdSvc,lstClmIcdSvc.length);
   	
   }
   
   public void setLstClmIcdSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdSvc,lstClmIcdSvc.length);
   	
   }
   
     /**
	 * 	Update LstClmIcdSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLstClmIcdSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LstClmIcdSvc with another Field
	 *	@param value
	 */
   public void setLstClmIcdSvc(Field source) {
       replace(source,0,source.length(),beginLstClmIcdSvc,LST_CLM_ICD_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update LstClmIcdSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLstClmIcdSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLstClmIcdSvc,LST_CLM_ICD_SVC_LEN);
   	
   }
   
     /**
	 * 	Update LstClmIcdSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLstClmIcdSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lstClmIcdCau
	 *	@return lstClmIcdCau
	 */
   public char[] getLstClmIcdCau() throws CFException{
     if (isLstClmIcdCauModified()) { 
        lstClmIcdCau = refreshLstClmIcdCau();
     }
   		return lstClmIcdCau;
   }

  
	/**
	*  set variable lstClmIcdCau
	*  Corresponding COBOL Variable is WS-LST-CLM-ICD-CAU
	*  @param value
	**/
   public void setLstClmIcdCau(char[] value) {
      lstClmIcdCau = checkLstClmIcdCauConstraints(value);
      serializeLstClmIcdCau(lstClmIcdCau);
   } 

     /**
	 * 	Update LstClmIcdCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLstClmIcdCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLstClmIcdCau,lstClmIcdCau.length);
   	
   }
   
   public void setLstClmIcdCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdCau,lstClmIcdCau.length);
   	
   }
   
     /**
	 * 	Update LstClmIcdCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLstClmIcdCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LstClmIcdCau with another Field
	 *	@param value
	 */
   public void setLstClmIcdCau(Field source) {
       replace(source,0,source.length(),beginLstClmIcdCau,LST_CLM_ICD_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update LstClmIcdCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLstClmIcdCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLstClmIcdCau,LST_CLM_ICD_CAU_LEN);
   	
   }
   
     /**
	 * 	Update LstClmIcdCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLstClmIcdCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLstClmIcdCau+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes LstIcdKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setLstClmIcdInd(CONSTANTS.SPACE);
         setLstClmIcdPos(CONSTANTS.SPACE_2);
         setLstClmIcdSvc(CONSTANTS.SPACE_6);
         setLstClmIcdCau(CONSTANTS.SPACE);
   }

		public static int getLstIcdKeyFieldLength() {
			return LST_ICD_KEY_LENGTH;
		}

}
  
