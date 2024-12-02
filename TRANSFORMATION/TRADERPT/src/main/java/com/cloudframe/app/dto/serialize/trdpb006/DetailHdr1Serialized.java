package com.cloudframe.app.dto.serialize.trdpb006;

/**
*  The class DetailHdr1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 20:09. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DetailHdr1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DetailHdr1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DETAIL_HDR_1_LENGTH = 159;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDh1BuyerSeller;
	
	/**
	* Constructor for DetailHdr1Serialized
	**/
    public DetailHdr1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DetailHdr1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DETAIL_HDR_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginDh1BuyerSeller = getStartOffset() + 12;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localDh1BuyerSellerCounter = -1;
     public boolean isDh1BuyerSellerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDh1BuyerSellerCounter != sharedCounter;
         localDh1BuyerSellerCounter = sharedCounter; return hasModified;
     }
	protected static final int DH_1_BUYER_SELLER_LEN = 12;
	/**
	 * 	serialize this Dh1BuyerSeller
	 */
   protected void serializeDh1BuyerSeller(char[] dh1BuyerSeller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dh1BuyerSeller,0,getStringValue(),beginDh1BuyerSeller,DH_1_BUYER_SELLER_LEN);
       localDh1BuyerSellerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDh1BuyerSellerConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDh1BuyerSeller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDh1BuyerSeller() {	 
   		return (substring(getStringValue(),beginDh1BuyerSeller,beginDh1BuyerSeller + DH_1_BUYER_SELLER_LEN));
   	}




}
  
