package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class LinkAreaM51uSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LinkAreaM51uSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LinkAreaM51uSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LINK_AREA_M_51U_LENGTH = 9369;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUCcmNOSvcInd51;
            protected  int beginUSpiTblId51;
            protected  int beginUHcrProcessSw51;
            protected  int beginUHcrSpiSw51;
	
	/**
	* Constructor for LinkAreaM51uSerialized
	**/
    public LinkAreaM51uSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LinkAreaM51uSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LinkAreaM51uSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LinkAreaM51uSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2592); // serialize this field at offset 2592 by default 
    }
    
	/**
	* sets parent for this LinkAreaM51uSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2592 by default
    }    
	/**
	* initializes the field in LinkAreaM51uSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LINK_AREA_M_51U_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginUCcmNOSvcInd51 = getStartOffset() + 9357;	// set offset for serialization
  
             beginUSpiTblId51 = getStartOffset() + 9358;	// set offset for serialization
  
             beginUHcrProcessSw51 = getStartOffset() + 9365;	// set offset for serialization
  
             beginUHcrSpiSw51 = getStartOffset() + 9366;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUCcmNOSvcInd51Counter = -1;
     public boolean isUCcmNOSvcInd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUCcmNOSvcInd51Counter != sharedCounter;
         localUCcmNOSvcInd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_CCM_NOSVC_IND_51_LEN = 1;
	/**
	 * 	serialize this UCcmNOSvcInd51
	 */
   protected void serializeUCcmNOSvcInd51(char[] uCcmNOSvcInd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uCcmNOSvcInd51,0,getStringValue(),beginUCcmNOSvcInd51,U_CCM_NOSVC_IND_51_LEN);
       localUCcmNOSvcInd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUCcmNOSvcInd51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUCcmNOSvcInd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUCcmNOSvcInd51() {	 
   		return (substring(getStringValue(),beginUCcmNOSvcInd51,beginUCcmNOSvcInd51 + U_CCM_NOSVC_IND_51_LEN));
   	}
     int localUSpiTblId51Counter = -1;
     public boolean isUSpiTblId51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUSpiTblId51Counter != sharedCounter;
         localUSpiTblId51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_SPI_TBL_ID_51_LEN = 7;
	/**
	 * 	serialize this USpiTblId51
	 */
   protected void serializeUSpiTblId51(char[] uSpiTblId51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uSpiTblId51,0,getStringValue(),beginUSpiTblId51,U_SPI_TBL_ID_51_LEN);
       localUSpiTblId51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUSpiTblId51Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshUSpiTblId51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUSpiTblId51() {	 
   		return (substring(getStringValue(),beginUSpiTblId51,beginUSpiTblId51 + U_SPI_TBL_ID_51_LEN));
   	}
     int localUHcrProcessSw51Counter = -1;
     public boolean isUHcrProcessSw51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUHcrProcessSw51Counter != sharedCounter;
         localUHcrProcessSw51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_HCR_PROCESS_SW_51_LEN = 1;
	/**
	 * 	serialize this UHcrProcessSw51
	 */
   protected void serializeUHcrProcessSw51(char[] uHcrProcessSw51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uHcrProcessSw51,0,getStringValue(),beginUHcrProcessSw51,U_HCR_PROCESS_SW_51_LEN);
       localUHcrProcessSw51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUHcrProcessSw51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUHcrProcessSw51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUHcrProcessSw51() {	 
   		return (substring(getStringValue(),beginUHcrProcessSw51,beginUHcrProcessSw51 + U_HCR_PROCESS_SW_51_LEN));
   	}
     int localUHcrSpiSw51Counter = -1;
     public boolean isUHcrSpiSw51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUHcrSpiSw51Counter != sharedCounter;
         localUHcrSpiSw51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_HCR_SPI_SW_51_LEN = 3;
	/**
	 * 	serialize this UHcrSpiSw51
	 */
   protected void serializeUHcrSpiSw51(char[] uHcrSpiSw51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uHcrSpiSw51,0,getStringValue(),beginUHcrSpiSw51,U_HCR_SPI_SW_51_LEN);
       localUHcrSpiSw51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUHcrSpiSw51Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshUHcrSpiSw51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUHcrSpiSw51() {	 
   		return (substring(getStringValue(),beginUHcrSpiSw51,beginUHcrSpiSw51 + U_HCR_SPI_SW_51_LEN));
   	}




}
  
