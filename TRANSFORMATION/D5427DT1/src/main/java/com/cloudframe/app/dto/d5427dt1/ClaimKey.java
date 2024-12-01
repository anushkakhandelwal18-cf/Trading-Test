package com.cloudframe.app.dto.d5427dt1;

/**
*  The class ClaimKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ClaimKey extends ClaimKeySerialized { 
   

						private char[] claimKeyFln = Field.fillLowValue(10);

						private char[] claimKeyIcn = Field.fillLowValue(10);

						private char[] claimKeySuffixCd = Field.fillLowValue(2);

						private char[] claimKeyProviderNo = Field.fillLowValue(15);

						private char[] claimKeyDraftNo = Field.fillLowValue(10);

						private char[] claimKeyHeaderCt = Field.fillLowValue(4);
	
	/**
	* Constructor for ClaimKey
	**/
    public ClaimKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of claimKeyFln
	 *	@return claimKeyFln
	 */
   public char[] getClaimKeyFln() throws CFException{
     if (isClaimKeyFlnModified()) { 
        claimKeyFln = refreshClaimKeyFln();
     }
   		return claimKeyFln;
   }

  
	/**
	*  set variable claimKeyFln
	*  Corresponding COBOL Variable is CLAIM-KEY-FLN
	*  @param value
	**/
   public void setClaimKeyFln(char[] value) {
      claimKeyFln = checkClaimKeyFlnConstraints(value);
      serializeClaimKeyFln(claimKeyFln);
   } 

     /**
	 * 	Update ClaimKeyFln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClaimKeyFln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClaimKeyFln,claimKeyFln.length);
   	
   }
   
   public void setClaimKeyFln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyFln,claimKeyFln.length);
   	
   }
   
     /**
	 * 	Update ClaimKeyFln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyFln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyFln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClaimKeyFln with another Field
	 *	@param value
	 */
   public void setClaimKeyFln(Field source) {
       replace(source,0,source.length(),beginClaimKeyFln,CLAIM_KEY_FLN_LEN);
   	
   }  
   
     /**
	 * 	Update ClaimKeyFln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClaimKeyFln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClaimKeyFln,CLAIM_KEY_FLN_LEN);
   	
   }
   
     /**
	 * 	Update ClaimKeyFln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyFln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyFln+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of claimKeyIcn
	 *	@return claimKeyIcn
	 */
   public char[] getClaimKeyIcn() throws CFException{
     if (isClaimKeyIcnModified()) { 
        claimKeyIcn = refreshClaimKeyIcn();
     }
   		return claimKeyIcn;
   }

  
	/**
	*  set variable claimKeyIcn
	*  Corresponding COBOL Variable is CLAIM-KEY-ICN
	*  @param value
	**/
   public void setClaimKeyIcn(char[] value) {
      claimKeyIcn = checkClaimKeyIcnConstraints(value);
      serializeClaimKeyIcn(claimKeyIcn);
   } 

     /**
	 * 	Update ClaimKeyIcn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClaimKeyIcn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClaimKeyIcn,claimKeyIcn.length);
   	
   }
   
   public void setClaimKeyIcn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyIcn,claimKeyIcn.length);
   	
   }
   
     /**
	 * 	Update ClaimKeyIcn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyIcn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyIcn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClaimKeyIcn with another Field
	 *	@param value
	 */
   public void setClaimKeyIcn(Field source) {
       replace(source,0,source.length(),beginClaimKeyIcn,CLAIM_KEY_ICN_LEN);
   	
   }  
   
     /**
	 * 	Update ClaimKeyIcn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClaimKeyIcn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClaimKeyIcn,CLAIM_KEY_ICN_LEN);
   	
   }
   
     /**
	 * 	Update ClaimKeyIcn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyIcn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyIcn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of claimKeySuffixCd
	 *	@return claimKeySuffixCd
	 */
   public char[] getClaimKeySuffixCd() throws CFException{
     if (isClaimKeySuffixCdModified()) { 
        claimKeySuffixCd = refreshClaimKeySuffixCd();
     }
   		return claimKeySuffixCd;
   }

  
	/**
	*  set variable claimKeySuffixCd
	*  Corresponding COBOL Variable is CLAIM-KEY-SUFFIX-CD
	*  @param value
	**/
   public void setClaimKeySuffixCd(char[] value) {
      claimKeySuffixCd = checkClaimKeySuffixCdConstraints(value);
      serializeClaimKeySuffixCd(claimKeySuffixCd);
   } 

     /**
	 * 	Update ClaimKeySuffixCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClaimKeySuffixCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClaimKeySuffixCd,claimKeySuffixCd.length);
   	
   }
   
   public void setClaimKeySuffixCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeySuffixCd,claimKeySuffixCd.length);
   	
   }
   
     /**
	 * 	Update ClaimKeySuffixCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeySuffixCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeySuffixCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClaimKeySuffixCd with another Field
	 *	@param value
	 */
   public void setClaimKeySuffixCd(Field source) {
       replace(source,0,source.length(),beginClaimKeySuffixCd,CLAIM_KEY_SUFFIX_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ClaimKeySuffixCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClaimKeySuffixCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClaimKeySuffixCd,CLAIM_KEY_SUFFIX_CD_LEN);
   	
   }
   
     /**
	 * 	Update ClaimKeySuffixCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeySuffixCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeySuffixCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of claimKeyProviderNo
	 *	@return claimKeyProviderNo
	 */
   public char[] getClaimKeyProviderNo() throws CFException{
     if (isClaimKeyProviderNoModified()) { 
        claimKeyProviderNo = refreshClaimKeyProviderNo();
     }
   		return claimKeyProviderNo;
   }

  
	/**
	*  set variable claimKeyProviderNo
	*  Corresponding COBOL Variable is CLAIM-KEY-PROVIDER-NO
	*  @param value
	**/
   public void setClaimKeyProviderNo(char[] value) {
      claimKeyProviderNo = checkClaimKeyProviderNoConstraints(value);
      serializeClaimKeyProviderNo(claimKeyProviderNo);
   } 

     /**
	 * 	Update ClaimKeyProviderNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClaimKeyProviderNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClaimKeyProviderNo,claimKeyProviderNo.length);
   	
   }
   
   public void setClaimKeyProviderNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyProviderNo,claimKeyProviderNo.length);
   	
   }
   
     /**
	 * 	Update ClaimKeyProviderNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyProviderNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyProviderNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClaimKeyProviderNo with another Field
	 *	@param value
	 */
   public void setClaimKeyProviderNo(Field source) {
       replace(source,0,source.length(),beginClaimKeyProviderNo,CLAIM_KEY_PROVIDER_NO_LEN);
   	
   }  
   
     /**
	 * 	Update ClaimKeyProviderNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClaimKeyProviderNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClaimKeyProviderNo,CLAIM_KEY_PROVIDER_NO_LEN);
   	
   }
   
     /**
	 * 	Update ClaimKeyProviderNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyProviderNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyProviderNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of claimKeyDraftNo
	 *	@return claimKeyDraftNo
	 */
   public char[] getClaimKeyDraftNo() throws CFException{
     if (isClaimKeyDraftNoModified()) { 
        claimKeyDraftNo = refreshClaimKeyDraftNo();
     }
   		return claimKeyDraftNo;
   }

  
	/**
	*  set variable claimKeyDraftNo
	*  Corresponding COBOL Variable is CLAIM-KEY-DRAFT-NO
	*  @param value
	**/
   public void setClaimKeyDraftNo(char[] value) {
      claimKeyDraftNo = checkClaimKeyDraftNoConstraints(value);
      serializeClaimKeyDraftNo(claimKeyDraftNo);
   } 

     /**
	 * 	Update ClaimKeyDraftNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClaimKeyDraftNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClaimKeyDraftNo,claimKeyDraftNo.length);
   	
   }
   
   public void setClaimKeyDraftNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyDraftNo,claimKeyDraftNo.length);
   	
   }
   
     /**
	 * 	Update ClaimKeyDraftNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyDraftNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyDraftNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClaimKeyDraftNo with another Field
	 *	@param value
	 */
   public void setClaimKeyDraftNo(Field source) {
       replace(source,0,source.length(),beginClaimKeyDraftNo,CLAIM_KEY_DRAFT_NO_LEN);
   	
   }  
   
     /**
	 * 	Update ClaimKeyDraftNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClaimKeyDraftNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClaimKeyDraftNo,CLAIM_KEY_DRAFT_NO_LEN);
   	
   }
   
     /**
	 * 	Update ClaimKeyDraftNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyDraftNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyDraftNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of claimKeyHeaderCt
	 *	@return claimKeyHeaderCt
	 */
   public char[] getClaimKeyHeaderCt() throws CFException{
     if (isClaimKeyHeaderCtModified()) { 
        claimKeyHeaderCt = refreshClaimKeyHeaderCt();
     }
   		return claimKeyHeaderCt;
   }

  
	/**
	*  set variable claimKeyHeaderCt
	*  Corresponding COBOL Variable is CLAIM-KEY-HEADER-CT
	*  @param value
	**/
   public void setClaimKeyHeaderCt(char[] value) {
      claimKeyHeaderCt = checkClaimKeyHeaderCtConstraints(value);
      serializeClaimKeyHeaderCt(claimKeyHeaderCt);
   } 

     /**
	 * 	Update ClaimKeyHeaderCt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClaimKeyHeaderCt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClaimKeyHeaderCt,claimKeyHeaderCt.length);
   	
   }
   
   public void setClaimKeyHeaderCt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyHeaderCt,claimKeyHeaderCt.length);
   	
   }
   
     /**
	 * 	Update ClaimKeyHeaderCt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyHeaderCt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyHeaderCt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClaimKeyHeaderCt with another Field
	 *	@param value
	 */
   public void setClaimKeyHeaderCt(Field source) {
       replace(source,0,source.length(),beginClaimKeyHeaderCt,CLAIM_KEY_HEADER_CT_LEN);
   	
   }  
   
     /**
	 * 	Update ClaimKeyHeaderCt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClaimKeyHeaderCt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClaimKeyHeaderCt,CLAIM_KEY_HEADER_CT_LEN);
   	
   }
   
     /**
	 * 	Update ClaimKeyHeaderCt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClaimKeyHeaderCt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClaimKeyHeaderCt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getClaimKeyFieldLength() {
			return CLAIM_KEY_LENGTH;
		}

}
  
