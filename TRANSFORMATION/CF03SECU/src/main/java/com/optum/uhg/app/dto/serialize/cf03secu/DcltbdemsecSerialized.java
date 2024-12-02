package com.optum.uhg.app.dto.serialize.cf03secu;

/**
*  The class DcltbdemsecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 20:31. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbdemsecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbdemsecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBDEMSEC_LENGTH = 175;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsin;
            protected  int beginSedol;
            protected  int beginRic;
            protected  int beginIntlkey;
            protected  int beginCompany;
            protected  int beginCountry;
            protected  int beginIndustry;
            protected  int beginSector;
            protected  int beginFfmcapmilusd;
            protected  int beginSectorweight;
	
	/**
	* Constructor for DcltbdemsecSerialized
	**/
    public DcltbdemsecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbdemsecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBDEMSEC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsin = getStartOffset() + 0;	// set offset for serialization
  
             beginSedol = getStartOffset() + 12;	// set offset for serialization
  
             beginRic = getStartOffset() + 20;	// set offset for serialization
  
             beginIntlkey = getStartOffset() + 30;	// set offset for serialization
  
             beginCompany = getStartOffset() + 38;	// set offset for serialization
  
             beginCountry = getStartOffset() + 78;	// set offset for serialization
  
             beginIndustry = getStartOffset() + 83;	// set offset for serialization
  
             beginSector = getStartOffset() + 123;	// set offset for serialization
  
             beginFfmcapmilusd = getStartOffset() + 163;	// set offset for serialization
  
             beginSectorweight = getStartOffset() + 167;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsinCounter = -1;
     public boolean isIsinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsinCounter != sharedCounter;
         localIsinCounter = sharedCounter; return hasModified;
     }
	protected static final int ISIN_LEN = 12;
	/**
	 * 	serialize this Isin
	 */
   protected void serializeIsin(char[] isin) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isin,0,getStringValue(),beginIsin,ISIN_LEN);
       localIsinCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsinConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshIsin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsin() {	 
   		return (substring(getStringValue(),beginIsin,beginIsin + ISIN_LEN));
   	}
     int localSedolCounter = -1;
     public boolean isSedolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSedolCounter != sharedCounter;
         localSedolCounter = sharedCounter; return hasModified;
     }
	protected static final int SEDOL_LEN = 8;
	/**
	 * 	serialize this Sedol
	 */
   protected void serializeSedol(char[] sedol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sedol,0,getStringValue(),beginSedol,SEDOL_LEN);
       localSedolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSedolConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSedol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSedol() {	 
   		return (substring(getStringValue(),beginSedol,beginSedol + SEDOL_LEN));
   	}
     int localRicCounter = -1;
     public boolean isRicModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicCounter != sharedCounter;
         localRicCounter = sharedCounter; return hasModified;
     }
	protected static final int RIC_LEN = 10;
	/**
	 * 	serialize this Ric
	 */
   protected void serializeRic(char[] ric) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ric,0,getStringValue(),beginRic,RIC_LEN);
       localRicCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRic is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRic() {	 
   		return (substring(getStringValue(),beginRic,beginRic + RIC_LEN));
   	}
     int localIntlkeyCounter = -1;
     public boolean isIntlkeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIntlkeyCounter != sharedCounter;
         localIntlkeyCounter = sharedCounter; return hasModified;
     }
	protected static final int INTLKEY_LEN = 8;
	/**
	 * 	serialize this Intlkey
	 */
   protected void serializeIntlkey(char[] intlkey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(intlkey,0,getStringValue(),beginIntlkey,INTLKEY_LEN);
       localIntlkeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIntlkeyConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIntlkey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIntlkey() {	 
   		return (substring(getStringValue(),beginIntlkey,beginIntlkey + INTLKEY_LEN));
   	}
     int localCompanyCounter = -1;
     public boolean isCompanyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompanyCounter != sharedCounter;
         localCompanyCounter = sharedCounter; return hasModified;
     }
	protected static final int COMPANY_LEN = 40;
	/**
	 * 	serialize this Company
	 */
   protected void serializeCompany(char[] company) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(company,0,getStringValue(),beginCompany,COMPANY_LEN);
       localCompanyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompanyConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshCompany is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompany() {	 
   		return (substring(getStringValue(),beginCompany,beginCompany + COMPANY_LEN));
   	}
     int localCountryCounter = -1;
     public boolean isCountryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountryCounter != sharedCounter;
         localCountryCounter = sharedCounter; return hasModified;
     }
	protected static final int COUNTRY_LEN = 2;
	/**
	 * 	serialize this Country
	 */
   protected void serializeCountry(char[] country) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(country,0,getStringValue(),beginCountry,COUNTRY_LEN);
       localCountryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountryConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCountry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountry() {	 
   		return (substring(getStringValue(),beginCountry,beginCountry + COUNTRY_LEN));
   	}
     int localIndustryCounter = -1;
     public boolean isIndustryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIndustryCounter != sharedCounter;
         localIndustryCounter = sharedCounter; return hasModified;
     }
	protected static final int INDUSTRY_LEN = 40;
	/**
	 * 	serialize this Industry
	 */
   protected void serializeIndustry(char[] industry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(industry,0,getStringValue(),beginIndustry,INDUSTRY_LEN);
       localIndustryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIndustryConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshIndustry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIndustry() {	 
   		return (substring(getStringValue(),beginIndustry,beginIndustry + INDUSTRY_LEN));
   	}
     int localSectorCounter = -1;
     public boolean isSectorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSectorCounter != sharedCounter;
         localSectorCounter = sharedCounter; return hasModified;
     }
	protected static final int SECTOR_LEN = 40;
	/**
	 * 	serialize this Sector
	 */
   protected void serializeSector(char[] sector) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sector,0,getStringValue(),beginSector,SECTOR_LEN);
       localSectorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSectorConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshSector is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSector() {	 
   		return (substring(getStringValue(),beginSector,beginSector + SECTOR_LEN));
   	}
         int localFfmcapmilusdCounter = -1;
         public boolean isFfmcapmilusdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFfmcapmilusdCounter != sharedCounter;
            localFfmcapmilusdCounter = sharedCounter; return hasModified; 
         }
   protected static final int FFMCAPMILUSD_LEN = 4;
  	/**
	 * serializeFfmcapmilusd
	 */
	protected void serializeFfmcapmilusd(int ffmcapmilusd) {
           replaceValue( //  save the value as string
                   getBinaryString( ffmcapmilusd,FFMCAPMILUSD_LEN)
                  ,beginFfmcapmilusd
                  ,FFMCAPMILUSD_LEN
                 );
            localFfmcapmilusdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFfmcapmilusdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFfmcapmilusd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFfmcapmilusd() {	 
			return (getInt(beginFfmcapmilusd));
   	}
     int localSectorweightCounter = -1;
     public boolean isSectorweightModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSectorweightCounter != sharedCounter;
         localSectorweightCounter = sharedCounter; return hasModified;
     }
	protected static final int SECTORWEIGHT_LEN = 8;
	/**
	 * 	serialize this Sectorweight
	 */
   protected void serializeSectorweight(char[] sectorweight) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sectorweight,0,getStringValue(),beginSectorweight,SECTORWEIGHT_LEN);
       localSectorweightCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSectorweightConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSectorweight is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSectorweight() {	 
   		return (substring(getStringValue(),beginSectorweight,beginSectorweight + SECTORWEIGHT_LEN));
   	}




}
  
