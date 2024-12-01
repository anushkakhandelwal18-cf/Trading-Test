package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class QueryBaseMainSqlGroup81Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class QueryBaseMainSqlGroup81Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(QueryBaseMainSqlGroup81Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int QUERY_BASE_MAIN_SQL_GROUP_81_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for QueryBaseMainSqlGroup81Serialized
	**/
    public QueryBaseMainSqlGroup81Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for QueryBaseMainSqlGroup81Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public QueryBaseMainSqlGroup81Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this QueryBaseMainSqlGroup81Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1351); // serialize this field at offset 1351 by default 
    }
    
	/**
	* sets parent for this QueryBaseMainSqlGroup81Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1351 by default
    }    
	/**
	* initializes the field in QueryBaseMainSqlGroup81Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(QUERY_BASE_MAIN_SQL_GROUP_81_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
	   /*  end of offset */
	}




}
  
