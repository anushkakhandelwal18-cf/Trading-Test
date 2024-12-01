package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryBaseMainSqlGroup121 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class QueryBaseMainSqlGroup121 extends QueryBaseMainSqlGroup121Serialized { 
   





	
	/**
	* Constructor for QueryBaseMainSqlGroup121
	**/
    public QueryBaseMainSqlGroup121() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for QueryBaseMainSqlGroup121. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public QueryBaseMainSqlGroup121(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (" AND ").toCharArray()
             , getStartOffset() + 0
             ,5
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 5
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 6
             ,1
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 7
             ,1
             );
       replaceValue( // serialize and save the value
             (" < DLN2.AUTH_NBR )").toCharArray()
             , getStartOffset() + 8
             ,18
             );
    } 


	
	
	

		public static int getQueryBaseMainSqlGroup121FieldLength() {
			return QUERY_BASE_MAIN_SQL_GROUP_121_LENGTH;
		}

}
  
