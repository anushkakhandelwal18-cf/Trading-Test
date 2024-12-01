package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Sqlvar2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sqlvar2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sqlvar2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLVAR_2_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlvar2Reserved1;
            protected  int beginSqllonglen;
	
	/**
	* Constructor for Sqlvar2Serialized
	**/
    public Sqlvar2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sqlvar2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlvar2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sqlvar2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16); // serialize this field at offset 16 by default 
    }
    
	/**
	* sets parent for this Sqlvar2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16 by default
    }    
	/**
	* initializes the field in Sqlvar2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLVAR_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlvar2Reserved1 = getStartOffset() + 0;	// set offset for serialization
  
             beginSqllonglen = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSqlvar2Reserved1Counter = -1;
         public boolean isSqlvar2Reserved1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlvar2Reserved1Counter != sharedCounter;
            localSqlvar2Reserved1Counter = sharedCounter; return hasModified; 
         }
   protected static final int SQLVAR_2_RESERVED_1_LEN = 4;
  	/**
	 * serializeSqlvar2Reserved1
	 */
	protected void serializeSqlvar2Reserved1(int sqlvar2Reserved1) {
           replaceValue( //  save the value as string
                   getBinaryString( sqlvar2Reserved1,SQLVAR_2_RESERVED_1_LEN)
                  ,beginSqlvar2Reserved1
                  ,SQLVAR_2_RESERVED_1_LEN
                 );
            localSqlvar2Reserved1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSqlvar2Reserved1MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSqlvar2Reserved1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSqlvar2Reserved1() {	 
			return (getInt(beginSqlvar2Reserved1));
   	}
         int localSqllonglenCounter = -1;
         public boolean isSqllonglenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqllonglenCounter != sharedCounter;
            localSqllonglenCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLLONGLEN_LEN = 4;
  	/**
	 * serializeSqllonglen
	 */
	protected void serializeSqllonglen(int sqllonglen) {
           replaceValue( //  save the value as string
                   getBinaryString( sqllonglen,SQLLONGLEN_LEN)
                  ,beginSqllonglen
                  ,SQLLONGLEN_LEN
                 );
            localSqllonglenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSqllonglenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSqllonglen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSqllonglen() {	 
			return (getInt(beginSqllonglen));
   	}




}
  
