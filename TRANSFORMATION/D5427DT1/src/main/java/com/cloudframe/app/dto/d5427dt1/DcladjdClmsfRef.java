package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DcladjdClmsfRef is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DcladjdClmsfRef extends DcladjdClmsfRefSerialized { 
   

						private char[] drefInvnCtlNbr = Field.fillLowValue(10);

						private char[] drefPolNbr = Field.fillLowValue(6);

						private char[] drefEeId = Field.fillLowValue(10);

						private char[] drefDepnNbr = Field.fillLowValue(2);
	
	/**
	* Constructor for DcladjdClmsfRef
	**/
    public DcladjdClmsfRef() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of drefInvnCtlNbr
	 *	@return drefInvnCtlNbr
	 */
   public char[] getDrefInvnCtlNbr() throws CFException{
     if (isDrefInvnCtlNbrModified()) { 
        drefInvnCtlNbr = refreshDrefInvnCtlNbr();
     }
   		return drefInvnCtlNbr;
   }

  
	/**
	*  set variable drefInvnCtlNbr
	*  Corresponding COBOL Variable is DREF-INVN-CTL-NBR
	*  @param value
	**/
   public void setDrefInvnCtlNbr(char[] value) {
      drefInvnCtlNbr = checkDrefInvnCtlNbrConstraints(value);
      serializeDrefInvnCtlNbr(drefInvnCtlNbr);
   } 

     /**
	 * 	Update DrefInvnCtlNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrefInvnCtlNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrefInvnCtlNbr,drefInvnCtlNbr.length);
   	
   }
   
   public void setDrefInvnCtlNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrefInvnCtlNbr,drefInvnCtlNbr.length);
   	
   }
   
     /**
	 * 	Update DrefInvnCtlNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrefInvnCtlNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrefInvnCtlNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrefInvnCtlNbr with another Field
	 *	@param value
	 */
   public void setDrefInvnCtlNbr(Field source) {
       replace(source,0,source.length(),beginDrefInvnCtlNbr,DREF_INVN_CTL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update DrefInvnCtlNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrefInvnCtlNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrefInvnCtlNbr,DREF_INVN_CTL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update DrefInvnCtlNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrefInvnCtlNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrefInvnCtlNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of drefPolNbr
	 *	@return drefPolNbr
	 */
   public char[] getDrefPolNbr() throws CFException{
     if (isDrefPolNbrModified()) { 
        drefPolNbr = refreshDrefPolNbr();
     }
   		return drefPolNbr;
   }

  
	/**
	*  set variable drefPolNbr
	*  Corresponding COBOL Variable is DREF-POL-NBR
	*  @param value
	**/
   public void setDrefPolNbr(char[] value) {
      drefPolNbr = checkDrefPolNbrConstraints(value);
      serializeDrefPolNbr(drefPolNbr);
   } 

     /**
	 * 	Update DrefPolNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrefPolNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrefPolNbr,drefPolNbr.length);
   	
   }
   
   public void setDrefPolNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrefPolNbr,drefPolNbr.length);
   	
   }
   
     /**
	 * 	Update DrefPolNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrefPolNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrefPolNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrefPolNbr with another Field
	 *	@param value
	 */
   public void setDrefPolNbr(Field source) {
       replace(source,0,source.length(),beginDrefPolNbr,DREF_POL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update DrefPolNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrefPolNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrefPolNbr,DREF_POL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update DrefPolNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrefPolNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrefPolNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of drefEeId
	 *	@return drefEeId
	 */
   public char[] getDrefEeId() throws CFException{
     if (isDrefEeIdModified()) { 
        drefEeId = refreshDrefEeId();
     }
   		return drefEeId;
   }

  
	/**
	*  set variable drefEeId
	*  Corresponding COBOL Variable is DREF-EE-ID
	*  @param value
	**/
   public void setDrefEeId(char[] value) {
      drefEeId = checkDrefEeIdConstraints(value);
      serializeDrefEeId(drefEeId);
   } 

     /**
	 * 	Update DrefEeId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrefEeId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrefEeId,drefEeId.length);
   	
   }
   
   public void setDrefEeId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrefEeId,drefEeId.length);
   	
   }
   
     /**
	 * 	Update DrefEeId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrefEeId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrefEeId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrefEeId with another Field
	 *	@param value
	 */
   public void setDrefEeId(Field source) {
       replace(source,0,source.length(),beginDrefEeId,DREF_EE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update DrefEeId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrefEeId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrefEeId,DREF_EE_ID_LEN);
   	
   }
   
     /**
	 * 	Update DrefEeId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrefEeId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrefEeId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of drefDepnNbr
	 *	@return drefDepnNbr
	 */
   public char[] getDrefDepnNbr() throws CFException{
     if (isDrefDepnNbrModified()) { 
        drefDepnNbr = refreshDrefDepnNbr();
     }
   		return drefDepnNbr;
   }

  
	/**
	*  set variable drefDepnNbr
	*  Corresponding COBOL Variable is DREF-DEPN-NBR
	*  @param value
	**/
   public void setDrefDepnNbr(char[] value) {
      drefDepnNbr = checkDrefDepnNbrConstraints(value);
      serializeDrefDepnNbr(drefDepnNbr);
   } 

     /**
	 * 	Update DrefDepnNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrefDepnNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrefDepnNbr,drefDepnNbr.length);
   	
   }
   
   public void setDrefDepnNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrefDepnNbr,drefDepnNbr.length);
   	
   }
   
     /**
	 * 	Update DrefDepnNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrefDepnNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrefDepnNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrefDepnNbr with another Field
	 *	@param value
	 */
   public void setDrefDepnNbr(Field source) {
       replace(source,0,source.length(),beginDrefDepnNbr,DREF_DEPN_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update DrefDepnNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrefDepnNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrefDepnNbr,DREF_DEPN_NBR_LEN);
   	
   }
   
     /**
	 * 	Update DrefDepnNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrefDepnNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrefDepnNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcladjdClmsfRefFieldLength() {
			return DCLADJD_CLMSF_REF_LENGTH;
		}

}
  
