package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class SqllenRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqllenRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqllenRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLLEN_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlscale;
	
	/**
	* Constructor for SqllenRedefinedSerialized
	**/
    public SqllenRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqllenRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqllenRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqllenRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this SqllenRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in SqllenRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLLEN_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlscale = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSqlscaleCounter = -1;
     public boolean isSqlscaleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlscaleCounter != sharedCounter;
         localSqlscaleCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLSCALE_LEN = 1;
	/**
	 * 	serialize this Sqlscale
	 */
   protected void serializeSqlscale(char[] sqlscale) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlscale,0,getStringValue(),beginSqlscale,SQLSCALE_LEN);
       localSqlscaleCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlscaleConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSqlscale is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlscale() {	 
   		return (substring(getStringValue(),beginSqlscale,beginSqlscale + SQLSCALE_LEN));
   	}




}
  
