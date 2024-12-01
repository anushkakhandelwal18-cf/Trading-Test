package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMaxClaimsDefault;
            protected  int beginMaxClaimsRequested;
            protected  int beginDt1ClaimKeyMax;
            protected  int beginDt1ClaimKeyCnt;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginMaxClaimsDefault = getStartOffset() + 0;	// set offset for serialization
  
             beginMaxClaimsRequested = getStartOffset() + 5;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginDt1ClaimKeyMax = getStartOffset() + 10;	// set offset for serialization
  
             beginDt1ClaimKeyCnt = getStartOffset() + 14;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localThisProgramCounter = -1;
     public boolean isThisProgramModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localThisProgramCounter != sharedCounter;
         localThisProgramCounter = sharedCounter; return hasModified;
     }

   protected char[] checkThisProgramConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localDt1ReqContainerNameCounter = -1;
     public boolean isDt1ReqContainerNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqContainerNameCounter != sharedCounter;
         localDt1ReqContainerNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt1ReqContainerNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
         int localDt1ReqContainerLengthCounter = -1;
         public boolean isDt1ReqContainerLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDt1ReqContainerLengthCounter != sharedCounter;
            localDt1ReqContainerLengthCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDt1ReqContainerLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localDt1RspContainerNameCounter = -1;
     public boolean isDt1RspContainerNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspContainerNameCounter != sharedCounter;
         localDt1RspContainerNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt1RspContainerNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
         int localDt1RspContainerLengthCounter = -1;
         public boolean isDt1RspContainerLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDt1RspContainerLengthCounter != sharedCounter;
            localDt1RspContainerLengthCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDt1RspContainerLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localDt1RspContainerLayoutCounter = -1;
     public boolean isDt1RspContainerLayoutModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspContainerLayoutCounter != sharedCounter;
         localDt1RspContainerLayoutCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt1RspContainerLayoutConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localDt1ClmContainerNameCounter = -1;
     public boolean isDt1ClmContainerNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmContainerNameCounter != sharedCounter;
         localDt1ClmContainerNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt1ClmContainerNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localDt1ClmContainerLayoutCounter = -1;
     public boolean isDt1ClmContainerLayoutModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmContainerLayoutCounter != sharedCounter;
         localDt1ClmContainerLayoutCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt1ClmContainerLayoutConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localDt1SrtContainerNameCounter = -1;
     public boolean isDt1SrtContainerNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtContainerNameCounter != sharedCounter;
         localDt1SrtContainerNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt1SrtContainerNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localDt1SrtContainerLayoutCounter = -1;
     public boolean isDt1SrtContainerLayoutModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtContainerLayoutCounter != sharedCounter;
         localDt1SrtContainerLayoutCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt1SrtContainerLayoutConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localStsContainerNameCounter = -1;
     public boolean isStsContainerNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsContainerNameCounter != sharedCounter;
         localStsContainerNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkStsContainerNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
         int localStsContainerLengthCounter = -1;
         public boolean isStsContainerLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStsContainerLengthCounter != sharedCounter;
            localStsContainerLengthCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkStsContainerLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localStsContainerLayoutCounter = -1;
     public boolean isStsContainerLayoutModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsContainerLayoutCounter != sharedCounter;
         localStsContainerLayoutCounter = sharedCounter; return hasModified;
     }

   protected char[] checkStsContainerLayoutConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTopsIcn10Counter = -1;
     public boolean isTopsIcn10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTopsIcn10Counter != sharedCounter;
         localTopsIcn10Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTopsIcn10Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDefaultDateCounter = -1;
     public boolean isDefaultDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDefaultDateCounter != sharedCounter;
         localDefaultDateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDefaultDateConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localDefaultDateDb2Counter = -1;
     public boolean isDefaultDateDb2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDefaultDateDb2Counter != sharedCounter;
         localDefaultDateDb2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDefaultDateDb2Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localFmtYyyyMmDdCounter = -1;
     public boolean isFmtYyyyMmDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFmtYyyyMmDdCounter != sharedCounter;
         localFmtYyyyMmDdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFmtYyyyMmDdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localFmtYydddCounter = -1;
     public boolean isFmtYydddModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFmtYydddCounter != sharedCounter;
         localFmtYydddCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFmtYydddConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
     int localCeedaysCounter = -1;
     public boolean isCeedaysModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCeedaysCounter != sharedCounter;
         localCeedaysCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCeedaysConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localCeedateCounter = -1;
     public boolean isCeedateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCeedateCounter != sharedCounter;
         localCeedateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCeedateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localMaxClaimsDefaultCounter = -1;
     public boolean isMaxClaimsDefaultModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxClaimsDefaultCounter != sharedCounter;
         localMaxClaimsDefaultCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maxClaimsDefault
	 *	@return maxClaimsDefault
	 */
	public char[]  getMaxClaimsDefaultString() {
	     return getCharArray(beginMaxClaimsDefault,MAX_CLAIMS_DEFAULT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxClaimsDefaultIsNumeric() {
	    return isNumeric(beginMaxClaimsDefault
	                    ,beginMaxClaimsDefault + MAX_CLAIMS_DEFAULT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAX_CLAIMS_DEFAULT_LEN = 5;
  	/**
	 * serializeMaxClaimsDefault
	 */
	protected void serializeMaxClaimsDefault(long maxClaimsDefault) {
		 putNumber(beginMaxClaimsDefault,maxClaimsDefault,MAX_CLAIMS_DEFAULT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxClaimsDefaultCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaxClaimsDefault
	 */
   	protected  long serializeMaxClaimsDefault(char[] value) {
	    long  maxClaimsDefault;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maxClaimsDefault = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginMaxClaimsDefault
		       ,5
		      );
		 localMaxClaimsDefaultCounter = shareString.getSerializedField().getModifiedCounter();
		return  maxClaimsDefault;
    }

   protected long checkMaxClaimsDefaultMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaxClaimsDefault is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaxClaimsDefault() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaxClaimsDefault
			                 ,MAX_CLAIMS_DEFAULT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maxClaimsDefault", beginMaxClaimsDefault,MAX_CLAIMS_DEFAULT_LEN);
    }
   	}
     int localMaxClaimsRequestedCounter = -1;
     public boolean isMaxClaimsRequestedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxClaimsRequestedCounter != sharedCounter;
         localMaxClaimsRequestedCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maxClaimsRequested
	 *	@return maxClaimsRequested
	 */
	public char[]  getMaxClaimsRequestedString() {
	     return getCharArray(beginMaxClaimsRequested,MAX_CLAIMS_REQUESTED_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxClaimsRequestedIsNumeric() {
	    return isNumeric(beginMaxClaimsRequested
	                    ,beginMaxClaimsRequested + MAX_CLAIMS_REQUESTED_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAX_CLAIMS_REQUESTED_LEN = 5;
  	/**
	 * serializeMaxClaimsRequested
	 */
	protected void serializeMaxClaimsRequested(long maxClaimsRequested) {
		 putNumber(beginMaxClaimsRequested,maxClaimsRequested,MAX_CLAIMS_REQUESTED_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxClaimsRequestedCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaxClaimsRequested
	 */
   	protected  long serializeMaxClaimsRequested(char[] value) {
	    long  maxClaimsRequested;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maxClaimsRequested = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginMaxClaimsRequested
		       ,5
		      );
		 localMaxClaimsRequestedCounter = shareString.getSerializedField().getModifiedCounter();
		return  maxClaimsRequested;
    }

   protected long checkMaxClaimsRequestedMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaxClaimsRequested is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaxClaimsRequested() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaxClaimsRequested
			                 ,MAX_CLAIMS_REQUESTED_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maxClaimsRequested", beginMaxClaimsRequested,MAX_CLAIMS_REQUESTED_LEN);
    }
   	}
         int localD5427dt1MaxRowsCounter = -1;
         public boolean isD5427dt1MaxRowsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD5427dt1MaxRowsCounter != sharedCounter;
            localD5427dt1MaxRowsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkD5427dt1MaxRowsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localD5427dt1MaxClaimsCounter = -1;
         public boolean isD5427dt1MaxClaimsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD5427dt1MaxClaimsCounter != sharedCounter;
            localD5427dt1MaxClaimsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkD5427dt1MaxClaimsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localFetchRowsetMaxCounter = -1;
         public boolean isFetchRowsetMaxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFetchRowsetMaxCounter != sharedCounter;
            localFetchRowsetMaxCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkFetchRowsetMaxMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localFetchRowsRetrievedCounter = -1;
         public boolean isFetchRowsRetrievedModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFetchRowsRetrievedCounter != sharedCounter;
            localFetchRowsRetrievedCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkFetchRowsRetrievedMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTotalRowsRetrievedCounter = -1;
         public boolean isTotalRowsRetrievedModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTotalRowsRetrievedCounter != sharedCounter;
            localTotalRowsRetrievedCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTotalRowsRetrievedMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localNbrSrtItemsCounter = -1;
         public boolean isNbrSrtItemsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNbrSrtItemsCounter != sharedCounter;
            localNbrSrtItemsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNbrSrtItemsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localPayeeCodeCounter = -1;
     public boolean isPayeeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPayeeCodeCounter != sharedCounter;
         localPayeeCodeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPayeeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localHeaderCtCounter = -1;
         public boolean isHeaderCtModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHeaderCtCounter != sharedCounter;
            localHeaderCtCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkHeaderCtMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localRecTypeCounter = -1;
     public boolean isRecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecTypeCounter != sharedCounter;
         localRecTypeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localDiffrntVerFoundSwCounter = -1;
     public boolean isDiffrntVerFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDiffrntVerFoundSwCounter != sharedCounter;
         localDiffrntVerFoundSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDiffrntVerFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localClaimSwCounter = -1;
     public boolean isClaimSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClaimSwCounter != sharedCounter;
         localClaimSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkClaimSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localInfoLineIndCounter = -1;
     public boolean isInfoLineIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInfoLineIndCounter != sharedCounter;
         localInfoLineIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkInfoLineIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localClmHstEndOfFetchIndCounter = -1;
     public boolean isClmHstEndOfFetchIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClmHstEndOfFetchIndCounter != sharedCounter;
         localClmHstEndOfFetchIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkClmHstEndOfFetchIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localQueryFilterIndCounter = -1;
     public boolean isQueryFilterIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterIndCounter != sharedCounter;
         localQueryFilterIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localDt1ClaimKeyMaxCounter = -1;
     public boolean isDt1ClaimKeyMaxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClaimKeyMaxCounter != sharedCounter;
         localDt1ClaimKeyMaxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClaimKeyMax
	 *	@return dt1ClaimKeyMax
	 */
	public char[]  getDt1ClaimKeyMaxString() {
	     return getCharArray(beginDt1ClaimKeyMax,DT_1_CLAIM_KEY_MAX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClaimKeyMaxIsNumeric() {
	    return isNumeric(beginDt1ClaimKeyMax
	                    ,beginDt1ClaimKeyMax + DT_1_CLAIM_KEY_MAX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLAIM_KEY_MAX_LEN = 4;
  	/**
	 * serializeDt1ClaimKeyMax
	 */
	protected void serializeDt1ClaimKeyMax(int dt1ClaimKeyMax) {
		 putNumber(beginDt1ClaimKeyMax,dt1ClaimKeyMax,DT_1_CLAIM_KEY_MAX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClaimKeyMaxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClaimKeyMax
	 */
   	protected  int serializeDt1ClaimKeyMax(char[] value) {
	    int  dt1ClaimKeyMax;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClaimKeyMax = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1ClaimKeyMax
		       ,4
		      );
		 localDt1ClaimKeyMaxCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClaimKeyMax;
    }

   protected int checkDt1ClaimKeyMaxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClaimKeyMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ClaimKeyMax() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ClaimKeyMax
			                 ,DT_1_CLAIM_KEY_MAX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClaimKeyMax", beginDt1ClaimKeyMax,DT_1_CLAIM_KEY_MAX_LEN);
    }
   	}
     int localDt1ClaimKeyCntCounter = -1;
     public boolean isDt1ClaimKeyCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClaimKeyCntCounter != sharedCounter;
         localDt1ClaimKeyCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClaimKeyCnt
	 *	@return dt1ClaimKeyCnt
	 */
	public char[]  getDt1ClaimKeyCntString() {
	     return getCharArray(beginDt1ClaimKeyCnt,DT_1_CLAIM_KEY_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClaimKeyCntIsNumeric() {
	    return isNumeric(beginDt1ClaimKeyCnt
	                    ,beginDt1ClaimKeyCnt + DT_1_CLAIM_KEY_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLAIM_KEY_CNT_LEN = 4;
  	/**
	 * serializeDt1ClaimKeyCnt
	 */
	protected void serializeDt1ClaimKeyCnt(int dt1ClaimKeyCnt) {
		 putNumber(beginDt1ClaimKeyCnt,dt1ClaimKeyCnt,DT_1_CLAIM_KEY_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClaimKeyCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClaimKeyCnt
	 */
   	protected  int serializeDt1ClaimKeyCnt(char[] value) {
	    int  dt1ClaimKeyCnt;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClaimKeyCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1ClaimKeyCnt
		       ,4
		      );
		 localDt1ClaimKeyCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClaimKeyCnt;
    }

   protected int checkDt1ClaimKeyCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClaimKeyCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ClaimKeyCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ClaimKeyCnt
			                 ,DT_1_CLAIM_KEY_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClaimKeyCnt", beginDt1ClaimKeyCnt,DT_1_CLAIM_KEY_CNT_LEN);
    }
   	}
         int localICounter = -1;
         public boolean isIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICounter != sharedCounter;
            localICounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localQueryBaseCteStartCounter = -1;
     public boolean isQueryBaseCteStartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryBaseCteStartCounter != sharedCounter;
         localQueryBaseCteStartCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryBaseCteStartConstraints(char[] value) {
   			return super.checkConstraints(value , 376 ,false, false);
   }
     int localQueryBaseCteEndCounter = -1;
     public boolean isQueryBaseCteEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryBaseCteEndCounter != sharedCounter;
         localQueryBaseCteEndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryBaseCteEndConstraints(char[] value) {
   			return super.checkConstraints(value , 140 ,false, false);
   }
     int localQueryFilterProviderTinCounter = -1;
     public boolean isQueryFilterProviderTinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterProviderTinCounter != sharedCounter;
         localQueryFilterProviderTinCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterProviderTinConstraints(char[] value) {
   			return super.checkConstraints(value , 55 ,false, false);
   }
     int localQueryFilterIcnCounter = -1;
     public boolean isQueryFilterIcnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterIcnCounter != sharedCounter;
         localQueryFilterIcnCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterIcnConstraints(char[] value) {
   			return super.checkConstraints(value , 46 ,false, false);
   }
     int localQueryFilterAuthStartCounter = -1;
     public boolean isQueryFilterAuthStartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterAuthStartCounter != sharedCounter;
         localQueryFilterAuthStartCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterAuthStartConstraints(char[] value) {
   			return super.checkConstraints(value , 318 ,false, false);
   }
     int localQueryFilterAuthEndCounter = -1;
     public boolean isQueryFilterAuthEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterAuthEndCounter != sharedCounter;
         localQueryFilterAuthEndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterAuthEndConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localQueryFilterAuthBaseEndCounter = -1;
     public boolean isQueryFilterAuthBaseEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterAuthBaseEndCounter != sharedCounter;
         localQueryFilterAuthBaseEndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterAuthBaseEndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localQueryFilterDlgtStartCounter = -1;
     public boolean isQueryFilterDlgtStartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterDlgtStartCounter != sharedCounter;
         localQueryFilterDlgtStartCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterDlgtStartConstraints(char[] value) {
   			return super.checkConstraints(value , 194 ,false, false);
   }
     int localQueryFilterAuthCrit6Counter = -1;
     public boolean isQueryFilterAuthCrit6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterAuthCrit6Counter != sharedCounter;
         localQueryFilterAuthCrit6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterAuthCrit6Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
     int localQueryFilterDlgtCrit6Counter = -1;
     public boolean isQueryFilterDlgtCrit6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterDlgtCrit6Counter != sharedCounter;
         localQueryFilterDlgtCrit6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterDlgtCrit6Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
     int localQueryFilterSpiStartCounter = -1;
     public boolean isQueryFilterSpiStartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterSpiStartCounter != sharedCounter;
         localQueryFilterSpiStartCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterSpiStartConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localQueryFilterSpiEndCounter = -1;
     public boolean isQueryFilterSpiEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterSpiEndCounter != sharedCounter;
         localQueryFilterSpiEndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterSpiEndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localQueryFilterSpiPred1Counter = -1;
     public boolean isQueryFilterSpiPred1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterSpiPred1Counter != sharedCounter;
         localQueryFilterSpiPred1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterSpiPred1Constraints(char[] value) {
   			return super.checkConstraints(value , 43 ,false, false);
   }
     int localQueryFilterSpiPred2Counter = -1;
     public boolean isQueryFilterSpiPred2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterSpiPred2Counter != sharedCounter;
         localQueryFilterSpiPred2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterSpiPred2Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
     int localQueryFilterSpiPred3Counter = -1;
     public boolean isQueryFilterSpiPred3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterSpiPred3Counter != sharedCounter;
         localQueryFilterSpiPred3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterSpiPred3Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
     int localQueryFilterSpiPred4Counter = -1;
     public boolean isQueryFilterSpiPred4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterSpiPred4Counter != sharedCounter;
         localQueryFilterSpiPred4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterSpiPred4Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
     int localQueryFilterSpiPred5Counter = -1;
     public boolean isQueryFilterSpiPred5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryFilterSpiPred5Counter != sharedCounter;
         localQueryFilterSpiPred5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkQueryFilterSpiPred5Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
         int localSqlcode_WsCounter = -1;
         public boolean isSqlcode_WsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlcode_WsCounter != sharedCounter;
            localSqlcode_WsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSqlcode_WsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
