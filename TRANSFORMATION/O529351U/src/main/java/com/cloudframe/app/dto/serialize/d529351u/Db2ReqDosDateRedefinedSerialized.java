package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class Db2ReqDosDateRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Db2ReqDosDateRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Db2ReqDosDateRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_2_REQ_DOS_DATE_REDEFINED_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDb2DosYyyy;
            protected  int beginDb2Dash1;
            protected  int beginDb2DosMm;
            protected  int beginDb2Dash2;
            protected  int beginDb2DosDd;
	
	/**
	* Constructor for Db2ReqDosDateRedefinedSerialized
	**/
    public Db2ReqDosDateRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Db2ReqDosDateRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Db2ReqDosDateRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Db2ReqDosDateRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17); // serialize this field at offset 17 by default 
    }
    
	/**
	* sets parent for this Db2ReqDosDateRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17 by default
    }    
	/**
	* initializes the field in Db2ReqDosDateRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_2_REQ_DOS_DATE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDb2DosYyyy = getStartOffset() + 0;	// set offset for serialization
  
             beginDb2Dash1 = getStartOffset() + 4;	// set offset for serialization
  
             beginDb2DosMm = getStartOffset() + 5;	// set offset for serialization
  
             beginDb2Dash2 = getStartOffset() + 7;	// set offset for serialization
  
             beginDb2DosDd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDb2DosYyyyCounter = -1;
     public boolean isDb2DosYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2DosYyyyCounter != sharedCounter;
         localDb2DosYyyyCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_DOS_YYYY_LEN = 4;
	/**
	 * 	serialize this Db2DosYyyy
	 */
   protected void serializeDb2DosYyyy(char[] db2DosYyyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2DosYyyy,0,getStringValue(),beginDb2DosYyyy,DB_2_DOS_YYYY_LEN);
       localDb2DosYyyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2DosYyyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshDb2DosYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2DosYyyy() {	 
   		return (substring(getStringValue(),beginDb2DosYyyy,beginDb2DosYyyy + DB_2_DOS_YYYY_LEN));
   	}
     int localDb2Dash1Counter = -1;
     public boolean isDb2Dash1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2Dash1Counter != sharedCounter;
         localDb2Dash1Counter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_DASH_1_LEN = 1;
	/**
	 * 	serialize this Db2Dash1
	 */
   protected void serializeDb2Dash1(char[] db2Dash1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2Dash1,0,getStringValue(),beginDb2Dash1,DB_2_DASH_1_LEN);
       localDb2Dash1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2Dash1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDb2Dash1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2Dash1() {	 
   		return (substring(getStringValue(),beginDb2Dash1,beginDb2Dash1 + DB_2_DASH_1_LEN));
   	}
     int localDb2DosMmCounter = -1;
     public boolean isDb2DosMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2DosMmCounter != sharedCounter;
         localDb2DosMmCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_DOS_MM_LEN = 2;
	/**
	 * 	serialize this Db2DosMm
	 */
   protected void serializeDb2DosMm(char[] db2DosMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2DosMm,0,getStringValue(),beginDb2DosMm,DB_2_DOS_MM_LEN);
       localDb2DosMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2DosMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDb2DosMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2DosMm() {	 
   		return (substring(getStringValue(),beginDb2DosMm,beginDb2DosMm + DB_2_DOS_MM_LEN));
   	}
     int localDb2Dash2Counter = -1;
     public boolean isDb2Dash2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2Dash2Counter != sharedCounter;
         localDb2Dash2Counter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_DASH_2_LEN = 1;
	/**
	 * 	serialize this Db2Dash2
	 */
   protected void serializeDb2Dash2(char[] db2Dash2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2Dash2,0,getStringValue(),beginDb2Dash2,DB_2_DASH_2_LEN);
       localDb2Dash2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2Dash2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDb2Dash2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2Dash2() {	 
   		return (substring(getStringValue(),beginDb2Dash2,beginDb2Dash2 + DB_2_DASH_2_LEN));
   	}
     int localDb2DosDdCounter = -1;
     public boolean isDb2DosDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2DosDdCounter != sharedCounter;
         localDb2DosDdCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_DOS_DD_LEN = 2;
	/**
	 * 	serialize this Db2DosDd
	 */
   protected void serializeDb2DosDd(char[] db2DosDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2DosDd,0,getStringValue(),beginDb2DosDd,DB_2_DOS_DD_LEN);
       localDb2DosDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2DosDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDb2DosDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2DosDd() {	 
   		return (substring(getStringValue(),beginDb2DosDd,beginDb2DosDd + DB_2_DOS_DD_LEN));
   	}




}
  
