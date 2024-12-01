package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DsmSqlErrorMsgAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DsmSqlErrorMsgAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DsmSqlErrorMsgAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DSM_SQL_ERROR_MSG_AREA_LENGTH = 120;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDsmErrTblName;
            protected  int beginDsmErrSectnName;
            protected  int beginDsmErrPgmName;
            protected  int beginDsmErrClngPgmName;
            protected  int beginDsmErrTblAction;
            protected  int beginDsmErrTxt;
	
	/**
	* Constructor for DsmSqlErrorMsgAreaSerialized
	**/
    public DsmSqlErrorMsgAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DsmSqlErrorMsgAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmSqlErrorMsgAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DsmSqlErrorMsgAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,990); // serialize this field at offset 990 by default 
    }
    
	/**
	* sets parent for this DsmSqlErrorMsgAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 990 by default
    }    
	/**
	* initializes the field in DsmSqlErrorMsgAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DSM_SQL_ERROR_MSG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDsmErrTblName = getStartOffset() + 0;	// set offset for serialization
  
             beginDsmErrSectnName = getStartOffset() + 25;	// set offset for serialization
  
             beginDsmErrPgmName = getStartOffset() + 59;	// set offset for serialization
  
             beginDsmErrClngPgmName = getStartOffset() + 67;	// set offset for serialization
  
             beginDsmErrTblAction = getStartOffset() + 75;	// set offset for serialization
  
             beginDsmErrTxt = getStartOffset() + 85;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDsmErrTblNameCounter = -1;
     public boolean isDsmErrTblNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmErrTblNameCounter != sharedCounter;
         localDsmErrTblNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_ERR_TBL_NAME_LEN = 25;
	/**
	 * 	serialize this DsmErrTblName
	 */
   protected void serializeDsmErrTblName(char[] dsmErrTblName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmErrTblName,0,getStringValue(),beginDsmErrTblName,DSM_ERR_TBL_NAME_LEN);
       localDsmErrTblNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmErrTblNameConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshDsmErrTblName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmErrTblName() {	 
   		return (substring(getStringValue(),beginDsmErrTblName,beginDsmErrTblName + DSM_ERR_TBL_NAME_LEN));
   	}
     int localDsmErrSectnNameCounter = -1;
     public boolean isDsmErrSectnNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmErrSectnNameCounter != sharedCounter;
         localDsmErrSectnNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_ERR_SECTN_NAME_LEN = 34;
	/**
	 * 	serialize this DsmErrSectnName
	 */
   protected void serializeDsmErrSectnName(char[] dsmErrSectnName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmErrSectnName,0,getStringValue(),beginDsmErrSectnName,DSM_ERR_SECTN_NAME_LEN);
       localDsmErrSectnNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmErrSectnNameConstraints(char[] value) {
   			return super.checkConstraints(value , 34 ,false, false);
   }
    /**
	 *	refreshDsmErrSectnName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmErrSectnName() {	 
   		return (substring(getStringValue(),beginDsmErrSectnName,beginDsmErrSectnName + DSM_ERR_SECTN_NAME_LEN));
   	}
     int localDsmErrPgmNameCounter = -1;
     public boolean isDsmErrPgmNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmErrPgmNameCounter != sharedCounter;
         localDsmErrPgmNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_ERR_PGM_NAME_LEN = 8;
	/**
	 * 	serialize this DsmErrPgmName
	 */
   protected void serializeDsmErrPgmName(char[] dsmErrPgmName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmErrPgmName,0,getStringValue(),beginDsmErrPgmName,DSM_ERR_PGM_NAME_LEN);
       localDsmErrPgmNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmErrPgmNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDsmErrPgmName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmErrPgmName() {	 
   		return (substring(getStringValue(),beginDsmErrPgmName,beginDsmErrPgmName + DSM_ERR_PGM_NAME_LEN));
   	}
     int localDsmErrClngPgmNameCounter = -1;
     public boolean isDsmErrClngPgmNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmErrClngPgmNameCounter != sharedCounter;
         localDsmErrClngPgmNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_ERR_CLNG_PGM_NAME_LEN = 8;
	/**
	 * 	serialize this DsmErrClngPgmName
	 */
   protected void serializeDsmErrClngPgmName(char[] dsmErrClngPgmName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmErrClngPgmName,0,getStringValue(),beginDsmErrClngPgmName,DSM_ERR_CLNG_PGM_NAME_LEN);
       localDsmErrClngPgmNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmErrClngPgmNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDsmErrClngPgmName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmErrClngPgmName() {	 
   		return (substring(getStringValue(),beginDsmErrClngPgmName,beginDsmErrClngPgmName + DSM_ERR_CLNG_PGM_NAME_LEN));
   	}
     int localDsmErrTblActionCounter = -1;
     public boolean isDsmErrTblActionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmErrTblActionCounter != sharedCounter;
         localDsmErrTblActionCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_ERR_TBL_ACTION_LEN = 10;
	/**
	 * 	serialize this DsmErrTblAction
	 */
   protected void serializeDsmErrTblAction(char[] dsmErrTblAction) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmErrTblAction,0,getStringValue(),beginDsmErrTblAction,DSM_ERR_TBL_ACTION_LEN);
       localDsmErrTblActionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmErrTblActionConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDsmErrTblAction is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmErrTblAction() {	 
   		return (substring(getStringValue(),beginDsmErrTblAction,beginDsmErrTblAction + DSM_ERR_TBL_ACTION_LEN));
   	}
     int localDsmErrTxtCounter = -1;
     public boolean isDsmErrTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmErrTxtCounter != sharedCounter;
         localDsmErrTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_ERR_TXT_LEN = 35;
	/**
	 * 	serialize this DsmErrTxt
	 */
   protected void serializeDsmErrTxt(char[] dsmErrTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmErrTxt,0,getStringValue(),beginDsmErrTxt,DSM_ERR_TXT_LEN);
       localDsmErrTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmErrTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshDsmErrTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmErrTxt() {	 
   		return (substring(getStringValue(),beginDsmErrTxt,beginDsmErrTxt + DSM_ERR_TXT_LEN));
   	}




}
  
