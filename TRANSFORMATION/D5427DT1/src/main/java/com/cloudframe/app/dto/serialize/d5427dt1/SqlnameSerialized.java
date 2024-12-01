package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class SqlnameSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlnameSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlnameSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLNAME_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlnamel;
	
	/**
	* Constructor for SqlnameSerialized
	**/
    public SqlnameSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqlnameSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlnameSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqlnameSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,28); // serialize this field at offset 28 by default 
    }
    
	/**
	* sets parent for this SqlnameSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 28 by default
    }    
	/**
	* initializes the field in SqlnameSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLNAME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlnamel = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSqlnamelCounter = -1;
         public boolean isSqlnamelModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlnamelCounter != sharedCounter;
            localSqlnamelCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLNAMEL_LEN = 2;
  	/**
	 * serializeSqlnamel
	 */
	protected void serializeSqlnamel(short sqlnamel) {
           replaceValue( //  save the value as string
                   getBinaryString( sqlnamel,SQLNAMEL_LEN)
                  ,beginSqlnamel
                  ,SQLNAMEL_LEN
                 );
            localSqlnamelCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSqlnamelMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSqlnamel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSqlnamel() {	 
			return (getShort(beginSqlnamel));
   	}




}
  
