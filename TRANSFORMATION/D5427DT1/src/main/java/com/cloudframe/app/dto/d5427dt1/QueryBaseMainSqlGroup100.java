package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryBaseMainSqlGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class QueryBaseMainSqlGroup100 extends QueryBaseMainSqlGroup100Serialized { 
   





	
	/**
	* Constructor for QueryBaseMainSqlGroup100
	**/
    public QueryBaseMainSqlGroup100() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for QueryBaseMainSqlGroup100. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public QueryBaseMainSqlGroup100(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 3
             ,1
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 4
             ,1
             );
    } 


	
	
	

		public static int getQueryBaseMainSqlGroup100FieldLength() {
			return QUERY_BASE_MAIN_SQL_GROUP_100_LENGTH;
		}

}
  
