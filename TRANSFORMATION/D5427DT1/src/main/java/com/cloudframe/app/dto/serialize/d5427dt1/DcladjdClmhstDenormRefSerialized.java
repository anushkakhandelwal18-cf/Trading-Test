package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DcladjdClmhstDenormRefSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcladjdClmhstDenormRefSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcladjdClmhstDenormRefSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLADJD_CLMHST_DENORM_REF_LENGTH = 338;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefIcnSufxVersNbr;
	
	/**
	* Constructor for DcladjdClmhstDenormRefSerialized
	**/
    public DcladjdClmhstDenormRefSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcladjdClmhstDenormRefSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLADJD_CLMHST_DENORM_REF_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
             beginDderefIcnSufxVersNbr = getStartOffset() + 42;	// set offset for serialization
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localDderefIcnSufxVersNbrCounter = -1;
         public boolean isDderefIcnSufxVersNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDderefIcnSufxVersNbrCounter != sharedCounter;
            localDderefIcnSufxVersNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int DDEREF_ICN_SUFX_VERS_NBR_LEN = 2;
  	/**
	 * serializeDderefIcnSufxVersNbr
	 */
	protected void serializeDderefIcnSufxVersNbr(short dderefIcnSufxVersNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( dderefIcnSufxVersNbr,DDEREF_ICN_SUFX_VERS_NBR_LEN)
                  ,beginDderefIcnSufxVersNbr
                  ,DDEREF_ICN_SUFX_VERS_NBR_LEN
                 );
            localDderefIcnSufxVersNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDderefIcnSufxVersNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDderefIcnSufxVersNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDderefIcnSufxVersNbr() {	 
			return (getShort(beginDderefIcnSufxVersNbr));
   	}




}
  
