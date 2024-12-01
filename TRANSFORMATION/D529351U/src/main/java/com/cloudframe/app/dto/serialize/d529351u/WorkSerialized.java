package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPlanEffDate;
            protected  int beginPlanCanDate;
	
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
  
  
  
  
  
  
  
  
  
  
  
  
             beginPlanEffDate = getStartOffset() + 0;	// set offset for serialization
  
             beginPlanCanDate = getStartOffset() + 8;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localDsmFuncCdCounter = -1;
         public boolean isDsmFuncCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDsmFuncCdCounter != sharedCounter;
            localDsmFuncCdCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkDsmFuncCdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSubCounter = -1;
         public boolean isSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSubCounter != sharedCounter;
            localSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCsSubCounter = -1;
         public boolean isCsSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCsSubCounter != sharedCounter;
            localCsSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCsSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localFrtoSubCounter = -1;
         public boolean isFrtoSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFrtoSubCounter != sharedCounter;
            localFrtoSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkFrtoSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localPtypSubCounter = -1;
         public boolean isPtypSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPtypSubCounter != sharedCounter;
            localPtypSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkPtypSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIcdSubCounter = -1;
         public boolean isIcdSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIcdSubCounter != sharedCounter;
            localIcdSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIcdSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localFcndSubCounter = -1;
         public boolean isFcndSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFcndSubCounter != sharedCounter;
            localFcndSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkFcndSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCausSubCounter = -1;
         public boolean isCausSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCausSubCounter != sharedCounter;
            localCausSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCausSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIpaSubCounter = -1;
         public boolean isIpaSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpaSubCounter != sharedCounter;
            localIpaSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpaSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCflgSubCounter = -1;
         public boolean isCflgSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCflgSubCounter != sharedCounter;
            localCflgSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCflgSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMainCtrCounter = -1;
         public boolean isMainCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMainCtrCounter != sharedCounter;
            localMainCtrCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMainCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localPlanMatchCounter = -1;
         public boolean isPlanMatchModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPlanMatchCounter != sharedCounter;
            localPlanMatchCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkPlanMatchMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localPlanEffDateCounter = -1;
     public boolean isPlanEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanEffDateCounter != sharedCounter;
         localPlanEffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planEffDate
	 *	@return planEffDate
	 */
	public char[]  getPlanEffDateString() {
	     return getCharArray(beginPlanEffDate,PLAN_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planEffDateIsNumeric() {
	    return isNumeric(beginPlanEffDate
	                    ,beginPlanEffDate + PLAN_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_EFF_DATE_LEN = 8;
  	/**
	 * serializePlanEffDate
	 */
	protected void serializePlanEffDate(long planEffDate) {
		 putNumber(beginPlanEffDate,planEffDate,PLAN_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanEffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanEffDate
	 */
   	protected  long serializePlanEffDate(char[] value) {
	    long  planEffDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planEffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginPlanEffDate
		       ,8
		      );
		 localPlanEffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  planEffDate;
    }

   protected long checkPlanEffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPlanEffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPlanEffDate
			                 ,PLAN_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planEffDate", beginPlanEffDate,PLAN_EFF_DATE_LEN);
    }
   	}
     int localPlanCanDateCounter = -1;
     public boolean isPlanCanDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanCanDateCounter != sharedCounter;
         localPlanCanDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planCanDate
	 *	@return planCanDate
	 */
	public char[]  getPlanCanDateString() {
	     return getCharArray(beginPlanCanDate,PLAN_CAN_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planCanDateIsNumeric() {
	    return isNumeric(beginPlanCanDate
	                    ,beginPlanCanDate + PLAN_CAN_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_CAN_DATE_LEN = 8;
  	/**
	 * serializePlanCanDate
	 */
	protected void serializePlanCanDate(long planCanDate) {
		 putNumber(beginPlanCanDate,planCanDate,PLAN_CAN_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanCanDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanCanDate
	 */
   	protected  long serializePlanCanDate(char[] value) {
	    long  planCanDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planCanDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginPlanCanDate
		       ,8
		      );
		 localPlanCanDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  planCanDate;
    }

   protected long checkPlanCanDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanCanDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPlanCanDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPlanCanDate
			                 ,PLAN_CAN_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planCanDate", beginPlanCanDate,PLAN_CAN_DATE_LEN);
    }
   	}
     int localFetchEndCounter = -1;
     public boolean isFetchEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFetchEndCounter != sharedCounter;
         localFetchEndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFetchEndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCloseCsrIndCounter = -1;
     public boolean isCloseCsrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCloseCsrIndCounter != sharedCounter;
         localCloseCsrIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCloseCsrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFetchEndMainCounter = -1;
     public boolean isFetchEndMainModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFetchEndMainCounter != sharedCounter;
         localFetchEndMainCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFetchEndMainConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFetchEndFrtoCounter = -1;
     public boolean isFetchEndFrtoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFetchEndFrtoCounter != sharedCounter;
         localFetchEndFrtoCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFetchEndFrtoConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFetchEndPtypCounter = -1;
     public boolean isFetchEndPtypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFetchEndPtypCounter != sharedCounter;
         localFetchEndPtypCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFetchEndPtypConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFetchEndIcdCounter = -1;
     public boolean isFetchEndIcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFetchEndIcdCounter != sharedCounter;
         localFetchEndIcdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFetchEndIcdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFetchEndFcndCounter = -1;
     public boolean isFetchEndFcndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFetchEndFcndCounter != sharedCounter;
         localFetchEndFcndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFetchEndFcndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFetchEndCombCounter = -1;
     public boolean isFetchEndCombModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFetchEndCombCounter != sharedCounter;
         localFetchEndCombCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFetchEndCombConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
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
         int localDsnnrowsCounter = -1;
         public boolean isDsnnrowsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDsnnrowsCounter != sharedCounter;
            localDsnnrowsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDsnnrowsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
