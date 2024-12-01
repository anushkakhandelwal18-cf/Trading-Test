package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryFilterDlgtCrit5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;


public class QueryFilterDlgtCrit5 extends QueryFilterDlgtCrit5Serialized { 
   




	
	/**
	* Constructor for QueryFilterDlgtCrit5
	**/
    public QueryFilterDlgtCrit5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" AND DLGT.PRR_AUTH_NBR > ").toCharArray()
             , getStartOffset() + 0
             ,25
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 25
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 26
             ,1
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 27
             ,1
             );
    }


 


	
	
	

		public static int getQueryFilterDlgtCrit5FieldLength() {
			return QUERY_FILTER_DLGT_CRIT_5_LENGTH;
		}

}
  
