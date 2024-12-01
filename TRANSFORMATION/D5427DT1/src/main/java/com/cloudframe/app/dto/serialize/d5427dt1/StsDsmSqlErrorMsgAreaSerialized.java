package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class StsDsmSqlErrorMsgAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsDsmSqlErrorMsgAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsDsmSqlErrorMsgAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_DSM_SQL_ERROR_MSG_AREA_LENGTH = 120;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStsDsmErrTblName;
            protected  int beginStsDsmErrSectnName;
            protected  int beginStsDsmErrPgmName;
            protected  int beginStsDsmErrClngPgmName;
            protected  int beginStsDsmErrTblAction;
            protected  int beginStsDsmErrTxt;
	
	/**
	* Constructor for StsDsmSqlErrorMsgAreaSerialized
	**/
    public StsDsmSqlErrorMsgAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StsDsmSqlErrorMsgAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsDsmSqlErrorMsgAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StsDsmSqlErrorMsgAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,315); // serialize this field at offset 315 by default 
    }
    
	/**
	* sets parent for this StsDsmSqlErrorMsgAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 315 by default
    }    
	/**
	* initializes the field in StsDsmSqlErrorMsgAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_DSM_SQL_ERROR_MSG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStsDsmErrTblName = getStartOffset() + 0;	// set offset for serialization
  
             beginStsDsmErrSectnName = getStartOffset() + 25;	// set offset for serialization
  
             beginStsDsmErrPgmName = getStartOffset() + 59;	// set offset for serialization
  
             beginStsDsmErrClngPgmName = getStartOffset() + 67;	// set offset for serialization
  
             beginStsDsmErrTblAction = getStartOffset() + 75;	// set offset for serialization
  
             beginStsDsmErrTxt = getStartOffset() + 85;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStsDsmErrTblNameCounter = -1;
     public boolean isStsDsmErrTblNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsDsmErrTblNameCounter != sharedCounter;
         localStsDsmErrTblNameCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_DSM_ERR_TBL_NAME_LEN = 25;
	/**
	 * 	serialize this StsDsmErrTblName
	 */
   protected void serializeStsDsmErrTblName(char[] stsDsmErrTblName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsDsmErrTblName,0,getStringValue(),beginStsDsmErrTblName,STS_DSM_ERR_TBL_NAME_LEN);
       localStsDsmErrTblNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsDsmErrTblNameConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshStsDsmErrTblName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsDsmErrTblName() {	 
   		return (substring(getStringValue(),beginStsDsmErrTblName,beginStsDsmErrTblName + STS_DSM_ERR_TBL_NAME_LEN));
   	}
     int localStsDsmErrSectnNameCounter = -1;
     public boolean isStsDsmErrSectnNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsDsmErrSectnNameCounter != sharedCounter;
         localStsDsmErrSectnNameCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_DSM_ERR_SECTN_NAME_LEN = 34;
	/**
	 * 	serialize this StsDsmErrSectnName
	 */
   protected void serializeStsDsmErrSectnName(char[] stsDsmErrSectnName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsDsmErrSectnName,0,getStringValue(),beginStsDsmErrSectnName,STS_DSM_ERR_SECTN_NAME_LEN);
       localStsDsmErrSectnNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsDsmErrSectnNameConstraints(char[] value) {
   			return super.checkConstraints(value , 34 ,false, false);
   }
    /**
	 *	refreshStsDsmErrSectnName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsDsmErrSectnName() {	 
   		return (substring(getStringValue(),beginStsDsmErrSectnName,beginStsDsmErrSectnName + STS_DSM_ERR_SECTN_NAME_LEN));
   	}
     int localStsDsmErrPgmNameCounter = -1;
     public boolean isStsDsmErrPgmNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsDsmErrPgmNameCounter != sharedCounter;
         localStsDsmErrPgmNameCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_DSM_ERR_PGM_NAME_LEN = 8;
	/**
	 * 	serialize this StsDsmErrPgmName
	 */
   protected void serializeStsDsmErrPgmName(char[] stsDsmErrPgmName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsDsmErrPgmName,0,getStringValue(),beginStsDsmErrPgmName,STS_DSM_ERR_PGM_NAME_LEN);
       localStsDsmErrPgmNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsDsmErrPgmNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshStsDsmErrPgmName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsDsmErrPgmName() {	 
   		return (substring(getStringValue(),beginStsDsmErrPgmName,beginStsDsmErrPgmName + STS_DSM_ERR_PGM_NAME_LEN));
   	}
     int localStsDsmErrClngPgmNameCounter = -1;
     public boolean isStsDsmErrClngPgmNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsDsmErrClngPgmNameCounter != sharedCounter;
         localStsDsmErrClngPgmNameCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_DSM_ERR_CLNG_PGM_NAME_LEN = 8;
	/**
	 * 	serialize this StsDsmErrClngPgmName
	 */
   protected void serializeStsDsmErrClngPgmName(char[] stsDsmErrClngPgmName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsDsmErrClngPgmName,0,getStringValue(),beginStsDsmErrClngPgmName,STS_DSM_ERR_CLNG_PGM_NAME_LEN);
       localStsDsmErrClngPgmNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsDsmErrClngPgmNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshStsDsmErrClngPgmName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsDsmErrClngPgmName() {	 
   		return (substring(getStringValue(),beginStsDsmErrClngPgmName,beginStsDsmErrClngPgmName + STS_DSM_ERR_CLNG_PGM_NAME_LEN));
   	}
     int localStsDsmErrTblActionCounter = -1;
     public boolean isStsDsmErrTblActionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsDsmErrTblActionCounter != sharedCounter;
         localStsDsmErrTblActionCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_DSM_ERR_TBL_ACTION_LEN = 10;
	/**
	 * 	serialize this StsDsmErrTblAction
	 */
   protected void serializeStsDsmErrTblAction(char[] stsDsmErrTblAction) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsDsmErrTblAction,0,getStringValue(),beginStsDsmErrTblAction,STS_DSM_ERR_TBL_ACTION_LEN);
       localStsDsmErrTblActionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsDsmErrTblActionConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshStsDsmErrTblAction is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsDsmErrTblAction() {	 
   		return (substring(getStringValue(),beginStsDsmErrTblAction,beginStsDsmErrTblAction + STS_DSM_ERR_TBL_ACTION_LEN));
   	}
     int localStsDsmErrTxtCounter = -1;
     public boolean isStsDsmErrTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsDsmErrTxtCounter != sharedCounter;
         localStsDsmErrTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_DSM_ERR_TXT_LEN = 35;
	/**
	 * 	serialize this StsDsmErrTxt
	 */
   protected void serializeStsDsmErrTxt(char[] stsDsmErrTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsDsmErrTxt,0,getStringValue(),beginStsDsmErrTxt,STS_DSM_ERR_TXT_LEN);
       localStsDsmErrTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsDsmErrTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshStsDsmErrTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsDsmErrTxt() {	 
   		return (substring(getStringValue(),beginStsDsmErrTxt,beginStsDsmErrTxt + STS_DSM_ERR_TXT_LEN));
   	}




}
  
