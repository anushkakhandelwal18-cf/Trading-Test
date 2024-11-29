package com.cloudframe.app.dto.serialize.trdpb006;

/**
*  The class PageHeaderSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-29 at 17:05. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PageHeaderSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PageHeaderSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PAGE_HEADER_LENGTH = 159;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPhHeaderFlg;
            protected  int beginPhCustomer;
            protected  int beginPhCustomerDesc;
            protected  int beginPhPagenum;
	
	/**
	* Constructor for PageHeaderSerialized
	**/
    public PageHeaderSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PageHeaderSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PAGE_HEADER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginPhHeaderFlg = getStartOffset() + 55;	// set offset for serialization
  
             beginPhCustomer = getStartOffset() + 87;	// set offset for serialization
  
  
             beginPhCustomerDesc = getStartOffset() + 102;	// set offset for serialization
  
  
  
             beginPhPagenum = getStartOffset() + 156;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPhHeaderFlgCounter = -1;
     public boolean isPhHeaderFlgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPhHeaderFlgCounter != sharedCounter;
         localPhHeaderFlgCounter = sharedCounter; return hasModified;
     }
	protected static final int PH_HEADER_FLG_LEN = 32;
	/**
	 * 	serialize this PhHeaderFlg
	 */
   protected void serializePhHeaderFlg(char[] phHeaderFlg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(phHeaderFlg,0,getStringValue(),beginPhHeaderFlg,PH_HEADER_FLG_LEN);
       localPhHeaderFlgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPhHeaderFlgConstraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
    /**
	 *	refreshPhHeaderFlg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPhHeaderFlg() {	 
   		return (substring(getStringValue(),beginPhHeaderFlg,beginPhHeaderFlg + PH_HEADER_FLG_LEN));
   	}
     int localPhCustomerCounter = -1;
     public boolean isPhCustomerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPhCustomerCounter != sharedCounter;
         localPhCustomerCounter = sharedCounter; return hasModified;
     }
	protected static final int PH_CUSTOMER_LEN = 12;
	/**
	 * 	serialize this PhCustomer
	 */
   protected void serializePhCustomer(char[] phCustomer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(phCustomer,0,getStringValue(),beginPhCustomer,PH_CUSTOMER_LEN);
       localPhCustomerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPhCustomerConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshPhCustomer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPhCustomer() {	 
   		return (substring(getStringValue(),beginPhCustomer,beginPhCustomer + PH_CUSTOMER_LEN));
   	}
     int localPhCustomerDescCounter = -1;
     public boolean isPhCustomerDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPhCustomerDescCounter != sharedCounter;
         localPhCustomerDescCounter = sharedCounter; return hasModified;
     }
	protected static final int PH_CUSTOMER_DESC_LEN = 30;
	/**
	 * 	serialize this PhCustomerDesc
	 */
   protected void serializePhCustomerDesc(char[] phCustomerDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(phCustomerDesc,0,getStringValue(),beginPhCustomerDesc,PH_CUSTOMER_DESC_LEN);
       localPhCustomerDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPhCustomerDescConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshPhCustomerDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPhCustomerDesc() {	 
   		return (substring(getStringValue(),beginPhCustomerDesc,beginPhCustomerDesc + PH_CUSTOMER_DESC_LEN));
   	}
     int localPhPagenumCounter = -1;
     public boolean isPhPagenumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPhPagenumCounter != sharedCounter;
         localPhPagenumCounter = sharedCounter; return hasModified;
     }
	protected static final int PH_PAGENUM_LEN = 3;
	/**
	 * 	serialize this PhPagenum
	 */
   protected void serializePhPagenum(char[] phPagenum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(phPagenum,0,getStringValue(),beginPhPagenum,PH_PAGENUM_LEN);
       localPhPagenumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPhPagenumConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshPhPagenum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPhPagenum() {	 
   		return (substring(getStringValue(),beginPhPagenum,beginPhPagenum + PH_PAGENUM_LEN));
   	}




}
  
