package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryFilterServiceDates is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;


public class QueryFilterServiceDates extends QueryFilterServiceDatesSerialized { 
   


	
	/**
	* Constructor for QueryFilterServiceDates
	**/
    public QueryFilterServiceDates() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" AND CAST(? AS DATE) >= REF.FST_DT").toCharArray()
             , getStartOffset() + 0
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND CAST(? AS DATE) <= REF.LST_SRVC_DT").toCharArray()
             , getStartOffset() + 34
             ,39
             );
    }


 


	
	
	

		public static int getQueryFilterServiceDatesFieldLength() {
			return QUERY_FILTER_SERVICE_DATES_LENGTH;
		}

}
  
