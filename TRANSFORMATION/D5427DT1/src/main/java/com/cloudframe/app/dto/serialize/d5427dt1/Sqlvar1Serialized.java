package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Sqlvar1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sqlvar1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sqlvar1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLVAR_1_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqltype;
            protected  int beginSqllen;
            protected  int beginSqldata;
            protected  int beginSqlind;
	
	/**
	* Constructor for Sqlvar1Serialized
	**/
    public Sqlvar1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sqlvar1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlvar1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sqlvar1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16); // serialize this field at offset 16 by default 
    }
    
	/**
	* sets parent for this Sqlvar1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16 by default
    }    
	/**
	* initializes the field in Sqlvar1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLVAR_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqltype = getStartOffset() + 0;	// set offset for serialization
  
             beginSqllen = getStartOffset() + 2;	// set offset for serialization
  
  
             beginSqldata = getStartOffset() + 4;	// set offset for serialization
  
             beginSqlind = getStartOffset() + 8;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localSqltypeCounter = -1;
         public boolean isSqltypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqltypeCounter != sharedCounter;
            localSqltypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLTYPE_LEN = 2;
  	/**
	 * serializeSqltype
	 */
	protected void serializeSqltype(short sqltype) {
           replaceValue( //  save the value as string
                   getBinaryString( sqltype,SQLTYPE_LEN)
                  ,beginSqltype
                  ,SQLTYPE_LEN
                 );
            localSqltypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSqltypeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSqltype is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSqltype() {	 
			return (getShort(beginSqltype));
   	}
         int localSqllenCounter = -1;
         public boolean isSqllenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqllenCounter != sharedCounter;
            localSqllenCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLLEN_LEN = 2;
  	/**
	 * serializeSqllen
	 */
	protected void serializeSqllen(short sqllen) {
           replaceValue( //  save the value as string
                   getBinaryString( sqllen,SQLLEN_LEN)
                  ,beginSqllen
                  ,SQLLEN_LEN
                 );
            localSqllenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSqllenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSqllen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSqllen() {	 
			return (getShort(beginSqllen));
   	}
     int localSqldataCounter = -1;
     public boolean isSqldataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqldataCounter != sharedCounter;
         localSqldataCounter = sharedCounter; return hasModified; 
     }
   protected static final int SQLDATA_LEN = 4;
  	/**
	 * serializeSqldata
	 */
	protected void serializeSqldata(int sqldata) {
           replaceValue( //  save the value as string
                   getBinaryString( sqldata,SQLDATA_LEN)
                  ,beginSqldata
                  ,SQLDATA_LEN
                 );
            localSqldataCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSqldataMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSqldata is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSqldata() {	 
			return (getInt(beginSqldata));
   	}
     int localSqlindCounter = -1;
     public boolean isSqlindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlindCounter != sharedCounter;
         localSqlindCounter = sharedCounter; return hasModified; 
     }
   protected static final int SQLIND_LEN = 4;
  	/**
	 * serializeSqlind
	 */
	protected void serializeSqlind(int sqlind) {
           replaceValue( //  save the value as string
                   getBinaryString( sqlind,SQLIND_LEN)
                  ,beginSqlind
                  ,SQLIND_LEN
                 );
            localSqlindCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSqlindMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSqlind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSqlind() {	 
			return (getInt(beginSqlind));
   	}




}
  
