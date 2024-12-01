package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryFilterFln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;


public class QueryFilterFln extends QueryFilterFlnSerialized { 
   


	
	/**
	* Constructor for QueryFilterFln
	**/
    public QueryFilterFln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" AND REF.FLN_JULIAN_DT_NBR = CAST(? AS CHAR(5))").toCharArray()
             , getStartOffset() + 0
             ,47
             );
       replaceValue( // serialize and save the value
             (" AND REF.FLN_SRL_NBR = CAST(? AS CHAR(5)) ").toCharArray()
             , getStartOffset() + 47
             ,42
             );
    }


 


	
	
	

		public static int getQueryFilterFlnFieldLength() {
			return QUERY_FILTER_FLN_LENGTH;
		}

}
  
