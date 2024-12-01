package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class ClaimKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ClaimKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ClaimKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CLAIM_KEY_LENGTH = 51;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginClaimKeyFln;
            protected  int beginClaimKeyIcn;
            protected  int beginClaimKeySuffixCd;
            protected  int beginClaimKeyProviderNo;
            protected  int beginClaimKeyDraftNo;
            protected  int beginClaimKeyHeaderCt;
	
	/**
	* Constructor for ClaimKeySerialized
	**/
    public ClaimKeySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ClaimKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CLAIM_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginClaimKeyFln = getStartOffset() + 0;	// set offset for serialization
  
             beginClaimKeyIcn = getStartOffset() + 10;	// set offset for serialization
  
             beginClaimKeySuffixCd = getStartOffset() + 20;	// set offset for serialization
  
             beginClaimKeyProviderNo = getStartOffset() + 22;	// set offset for serialization
  
             beginClaimKeyDraftNo = getStartOffset() + 37;	// set offset for serialization
  
             beginClaimKeyHeaderCt = getStartOffset() + 47;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localClaimKeyFlnCounter = -1;
     public boolean isClaimKeyFlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClaimKeyFlnCounter != sharedCounter;
         localClaimKeyFlnCounter = sharedCounter; return hasModified;
     }
	protected static final int CLAIM_KEY_FLN_LEN = 10;
	/**
	 * 	serialize this ClaimKeyFln
	 */
   protected void serializeClaimKeyFln(char[] claimKeyFln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(claimKeyFln,0,getStringValue(),beginClaimKeyFln,CLAIM_KEY_FLN_LEN);
       localClaimKeyFlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClaimKeyFlnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshClaimKeyFln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClaimKeyFln() {	 
   		return (substring(getStringValue(),beginClaimKeyFln,beginClaimKeyFln + CLAIM_KEY_FLN_LEN));
   	}
     int localClaimKeyIcnCounter = -1;
     public boolean isClaimKeyIcnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClaimKeyIcnCounter != sharedCounter;
         localClaimKeyIcnCounter = sharedCounter; return hasModified;
     }
	protected static final int CLAIM_KEY_ICN_LEN = 10;
	/**
	 * 	serialize this ClaimKeyIcn
	 */
   protected void serializeClaimKeyIcn(char[] claimKeyIcn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(claimKeyIcn,0,getStringValue(),beginClaimKeyIcn,CLAIM_KEY_ICN_LEN);
       localClaimKeyIcnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClaimKeyIcnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshClaimKeyIcn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClaimKeyIcn() {	 
   		return (substring(getStringValue(),beginClaimKeyIcn,beginClaimKeyIcn + CLAIM_KEY_ICN_LEN));
   	}
     int localClaimKeySuffixCdCounter = -1;
     public boolean isClaimKeySuffixCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClaimKeySuffixCdCounter != sharedCounter;
         localClaimKeySuffixCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CLAIM_KEY_SUFFIX_CD_LEN = 2;
	/**
	 * 	serialize this ClaimKeySuffixCd
	 */
   protected void serializeClaimKeySuffixCd(char[] claimKeySuffixCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(claimKeySuffixCd,0,getStringValue(),beginClaimKeySuffixCd,CLAIM_KEY_SUFFIX_CD_LEN);
       localClaimKeySuffixCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClaimKeySuffixCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshClaimKeySuffixCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClaimKeySuffixCd() {	 
   		return (substring(getStringValue(),beginClaimKeySuffixCd,beginClaimKeySuffixCd + CLAIM_KEY_SUFFIX_CD_LEN));
   	}
     int localClaimKeyProviderNoCounter = -1;
     public boolean isClaimKeyProviderNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClaimKeyProviderNoCounter != sharedCounter;
         localClaimKeyProviderNoCounter = sharedCounter; return hasModified;
     }
	protected static final int CLAIM_KEY_PROVIDER_NO_LEN = 15;
	/**
	 * 	serialize this ClaimKeyProviderNo
	 */
   protected void serializeClaimKeyProviderNo(char[] claimKeyProviderNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(claimKeyProviderNo,0,getStringValue(),beginClaimKeyProviderNo,CLAIM_KEY_PROVIDER_NO_LEN);
       localClaimKeyProviderNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClaimKeyProviderNoConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshClaimKeyProviderNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClaimKeyProviderNo() {	 
   		return (substring(getStringValue(),beginClaimKeyProviderNo,beginClaimKeyProviderNo + CLAIM_KEY_PROVIDER_NO_LEN));
   	}
     int localClaimKeyDraftNoCounter = -1;
     public boolean isClaimKeyDraftNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClaimKeyDraftNoCounter != sharedCounter;
         localClaimKeyDraftNoCounter = sharedCounter; return hasModified;
     }
	protected static final int CLAIM_KEY_DRAFT_NO_LEN = 10;
	/**
	 * 	serialize this ClaimKeyDraftNo
	 */
   protected void serializeClaimKeyDraftNo(char[] claimKeyDraftNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(claimKeyDraftNo,0,getStringValue(),beginClaimKeyDraftNo,CLAIM_KEY_DRAFT_NO_LEN);
       localClaimKeyDraftNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClaimKeyDraftNoConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshClaimKeyDraftNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClaimKeyDraftNo() {	 
   		return (substring(getStringValue(),beginClaimKeyDraftNo,beginClaimKeyDraftNo + CLAIM_KEY_DRAFT_NO_LEN));
   	}
     int localClaimKeyHeaderCtCounter = -1;
     public boolean isClaimKeyHeaderCtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClaimKeyHeaderCtCounter != sharedCounter;
         localClaimKeyHeaderCtCounter = sharedCounter; return hasModified;
     }
	protected static final int CLAIM_KEY_HEADER_CT_LEN = 4;
	/**
	 * 	serialize this ClaimKeyHeaderCt
	 */
   protected void serializeClaimKeyHeaderCt(char[] claimKeyHeaderCt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(claimKeyHeaderCt,0,getStringValue(),beginClaimKeyHeaderCt,CLAIM_KEY_HEADER_CT_LEN);
       localClaimKeyHeaderCtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClaimKeyHeaderCtConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshClaimKeyHeaderCt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClaimKeyHeaderCt() {	 
   		return (substring(getStringValue(),beginClaimKeyHeaderCt,beginClaimKeyHeaderCt + CLAIM_KEY_HEADER_CT_LEN));
   	}




}
  
