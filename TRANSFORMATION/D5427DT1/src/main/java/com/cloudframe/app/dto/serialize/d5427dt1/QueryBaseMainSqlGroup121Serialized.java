package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class QueryBaseMainSqlGroup121Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class QueryBaseMainSqlGroup121Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(QueryBaseMainSqlGroup121Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int QUERY_BASE_MAIN_SQL_GROUP_121_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for QueryBaseMainSqlGroup121Serialized
	**/
    public QueryBaseMainSqlGroup121Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for QueryBaseMainSqlGroup121Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public QueryBaseMainSqlGroup121Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this QueryBaseMainSqlGroup121Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2101); // serialize this field at offset 2101 by default 
    }
    
	/**
	* sets parent for this QueryBaseMainSqlGroup121Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2101 by default
    }    
	/**
	* initializes the field in QueryBaseMainSqlGroup121Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(QUERY_BASE_MAIN_SQL_GROUP_121_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
	   /*  end of offset */
	}




}
  
