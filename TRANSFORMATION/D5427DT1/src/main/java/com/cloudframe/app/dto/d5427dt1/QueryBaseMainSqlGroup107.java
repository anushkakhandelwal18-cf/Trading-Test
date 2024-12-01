package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryBaseMainSqlGroup107 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class QueryBaseMainSqlGroup107 extends QueryBaseMainSqlGroup107Serialized { 
   




	
	/**
	* Constructor for QueryBaseMainSqlGroup107
	**/
    public QueryBaseMainSqlGroup107() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for QueryBaseMainSqlGroup107. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public QueryBaseMainSqlGroup107(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 1
             ,7
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 8
             ,1
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 9
             ,1
             );
    } 


	
	
	

		public static int getQueryBaseMainSqlGroup107FieldLength() {
			return QUERY_BASE_MAIN_SQL_GROUP_107_LENGTH;
		}

}
  
