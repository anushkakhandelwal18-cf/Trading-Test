package com.optum.uhg.app.dto.serialize.cf03secu;

/**
*  The class DfhcommareaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 20:31. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DfhcommareaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DfhcommareaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHCOMMAREA_LENGTH = 230;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsin01;
            protected  int beginSedol01;
            protected  int beginRic01;
            protected  int beginIntlkey01;
            protected  int beginCompany01;
            protected  int beginCountry01;
            protected  int beginCurrency1;
            protected  int beginIndustry01;
            protected  int beginSector01;
            protected  int beginFfmcapmilusd01;
            protected  int beginSectorweight01;
            protected  int beginSecErrorMsg;
	
	/**
	* Constructor for DfhcommareaSerialized
	**/
    public DfhcommareaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DfhcommareaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHCOMMAREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsin01 = getStartOffset() + 0;	// set offset for serialization
  
             beginSedol01 = getStartOffset() + 12;	// set offset for serialization
  
             beginRic01 = getStartOffset() + 20;	// set offset for serialization
  
             beginIntlkey01 = getStartOffset() + 30;	// set offset for serialization
  
             beginCompany01 = getStartOffset() + 38;	// set offset for serialization
  
             beginCountry01 = getStartOffset() + 78;	// set offset for serialization
  
             beginCurrency1 = getStartOffset() + 80;	// set offset for serialization
  
             beginIndustry01 = getStartOffset() + 83;	// set offset for serialization
  
             beginSector01 = getStartOffset() + 123;	// set offset for serialization
  
             beginFfmcapmilusd01 = getStartOffset() + 163;	// set offset for serialization
  
             beginSectorweight01 = getStartOffset() + 172;	// set offset for serialization
  
             beginSecErrorMsg = getStartOffset() + 180;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsin01Counter = -1;
     public boolean isIsin01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsin01Counter != sharedCounter;
         localIsin01Counter = sharedCounter; return hasModified;
     }
	protected static final int ISIN_01_LEN = 12;
	/**
	 * 	serialize this Isin01
	 */
   protected void serializeIsin01(char[] isin01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isin01,0,getStringValue(),beginIsin01,ISIN_01_LEN);
       localIsin01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsin01Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshIsin01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsin01() {	 
   		return (substring(getStringValue(),beginIsin01,beginIsin01 + ISIN_01_LEN));
   	}
     int localSedol01Counter = -1;
     public boolean isSedol01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSedol01Counter != sharedCounter;
         localSedol01Counter = sharedCounter; return hasModified;
     }
	protected static final int SEDOL_01_LEN = 8;
	/**
	 * 	serialize this Sedol01
	 */
   protected void serializeSedol01(char[] sedol01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sedol01,0,getStringValue(),beginSedol01,SEDOL_01_LEN);
       localSedol01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSedol01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSedol01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSedol01() {	 
   		return (substring(getStringValue(),beginSedol01,beginSedol01 + SEDOL_01_LEN));
   	}
     int localRic01Counter = -1;
     public boolean isRic01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRic01Counter != sharedCounter;
         localRic01Counter = sharedCounter; return hasModified;
     }
	protected static final int RIC_01_LEN = 10;
	/**
	 * 	serialize this Ric01
	 */
   protected void serializeRic01(char[] ric01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ric01,0,getStringValue(),beginRic01,RIC_01_LEN);
       localRic01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRic01Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRic01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRic01() {	 
   		return (substring(getStringValue(),beginRic01,beginRic01 + RIC_01_LEN));
   	}
     int localIntlkey01Counter = -1;
     public boolean isIntlkey01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIntlkey01Counter != sharedCounter;
         localIntlkey01Counter = sharedCounter; return hasModified;
     }
	protected static final int INTLKEY_01_LEN = 8;
	/**
	 * 	serialize this Intlkey01
	 */
   protected void serializeIntlkey01(char[] intlkey01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(intlkey01,0,getStringValue(),beginIntlkey01,INTLKEY_01_LEN);
       localIntlkey01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIntlkey01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIntlkey01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIntlkey01() {	 
   		return (substring(getStringValue(),beginIntlkey01,beginIntlkey01 + INTLKEY_01_LEN));
   	}
     int localCompany01Counter = -1;
     public boolean isCompany01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompany01Counter != sharedCounter;
         localCompany01Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPANY_01_LEN = 40;
	/**
	 * 	serialize this Company01
	 */
   protected void serializeCompany01(char[] company01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(company01,0,getStringValue(),beginCompany01,COMPANY_01_LEN);
       localCompany01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompany01Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshCompany01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompany01() {	 
   		return (substring(getStringValue(),beginCompany01,beginCompany01 + COMPANY_01_LEN));
   	}
     int localCountry01Counter = -1;
     public boolean isCountry01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountry01Counter != sharedCounter;
         localCountry01Counter = sharedCounter; return hasModified;
     }
	protected static final int COUNTRY_01_LEN = 2;
	/**
	 * 	serialize this Country01
	 */
   protected void serializeCountry01(char[] country01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(country01,0,getStringValue(),beginCountry01,COUNTRY_01_LEN);
       localCountry01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountry01Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCountry01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountry01() {	 
   		return (substring(getStringValue(),beginCountry01,beginCountry01 + COUNTRY_01_LEN));
   	}
     int localCurrency1Counter = -1;
     public boolean isCurrency1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrency1Counter != sharedCounter;
         localCurrency1Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENCY_1_LEN = 3;
	/**
	 * 	serialize this Currency1
	 */
   protected void serializeCurrency1(char[] currency1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currency1,0,getStringValue(),beginCurrency1,CURRENCY_1_LEN);
       localCurrency1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrency1Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrency1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrency1() {	 
   		return (substring(getStringValue(),beginCurrency1,beginCurrency1 + CURRENCY_1_LEN));
   	}
     int localIndustry01Counter = -1;
     public boolean isIndustry01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIndustry01Counter != sharedCounter;
         localIndustry01Counter = sharedCounter; return hasModified;
     }
	protected static final int INDUSTRY_01_LEN = 40;
	/**
	 * 	serialize this Industry01
	 */
   protected void serializeIndustry01(char[] industry01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(industry01,0,getStringValue(),beginIndustry01,INDUSTRY_01_LEN);
       localIndustry01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIndustry01Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshIndustry01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIndustry01() {	 
   		return (substring(getStringValue(),beginIndustry01,beginIndustry01 + INDUSTRY_01_LEN));
   	}
     int localSector01Counter = -1;
     public boolean isSector01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSector01Counter != sharedCounter;
         localSector01Counter = sharedCounter; return hasModified;
     }
	protected static final int SECTOR_01_LEN = 40;
	/**
	 * 	serialize this Sector01
	 */
   protected void serializeSector01(char[] sector01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sector01,0,getStringValue(),beginSector01,SECTOR_01_LEN);
       localSector01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSector01Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshSector01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSector01() {	 
   		return (substring(getStringValue(),beginSector01,beginSector01 + SECTOR_01_LEN));
   	}
     int localFfmcapmilusd01Counter = -1;
     public boolean isFfmcapmilusd01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFfmcapmilusd01Counter != sharedCounter;
         localFfmcapmilusd01Counter = sharedCounter; return hasModified;
     }
	protected static final int FFMCAPMILUSD_01_LEN = 9;
	/**
	 * 	serialize this Ffmcapmilusd01
	 */
   protected void serializeFfmcapmilusd01(char[] ffmcapmilusd01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ffmcapmilusd01,0,getStringValue(),beginFfmcapmilusd01,FFMCAPMILUSD_01_LEN);
       localFfmcapmilusd01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFfmcapmilusd01Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFfmcapmilusd01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFfmcapmilusd01() {	 
   		return (substring(getStringValue(),beginFfmcapmilusd01,beginFfmcapmilusd01 + FFMCAPMILUSD_01_LEN));
   	}
     int localSectorweight01Counter = -1;
     public boolean isSectorweight01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSectorweight01Counter != sharedCounter;
         localSectorweight01Counter = sharedCounter; return hasModified;
     }
	protected static final int SECTORWEIGHT_01_LEN = 8;
	/**
	 * 	serialize this Sectorweight01
	 */
   protected void serializeSectorweight01(char[] sectorweight01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sectorweight01,0,getStringValue(),beginSectorweight01,SECTORWEIGHT_01_LEN);
       localSectorweight01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSectorweight01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSectorweight01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSectorweight01() {	 
   		return (substring(getStringValue(),beginSectorweight01,beginSectorweight01 + SECTORWEIGHT_01_LEN));
   	}
     int localSecErrorMsgCounter = -1;
     public boolean isSecErrorMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecErrorMsgCounter != sharedCounter;
         localSecErrorMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int SEC_ERROR_MSG_LEN = 50;
	/**
	 * 	serialize this SecErrorMsg
	 */
   protected void serializeSecErrorMsg(char[] secErrorMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(secErrorMsg,0,getStringValue(),beginSecErrorMsg,SEC_ERROR_MSG_LEN);
       localSecErrorMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecErrorMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshSecErrorMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecErrorMsg() {	 
   		return (substring(getStringValue(),beginSecErrorMsg,beginSecErrorMsg + SEC_ERROR_MSG_LEN));
   	}




}
  
