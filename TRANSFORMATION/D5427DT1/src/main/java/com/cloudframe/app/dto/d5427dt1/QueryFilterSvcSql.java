package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryFilterSvcSql is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;


public class QueryFilterSvcSql extends QueryFilterSvcSqlSerialized { 
   















	
	/**
	* Constructor for QueryFilterSvcSql
	**/
    public QueryFilterSvcSql() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" (EXISTS").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             (" (SELECT 1").toCharArray()
             , getStartOffset() + 8
             ,10
             );
       replaceValue( // serialize and save the value
             (" FROM ADJD_CLMSF_LN LNE1").toCharArray()
             , getStartOffset() + 18
             ,24
             );
       replaceValue( // serialize and save the value
             (" WHERE REF.PARTN_ID = LNE1.PARTN_ID").toCharArray()
             , getStartOffset() + 42
             ,35
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = LNE1.PARTN_VAL").toCharArray()
             , getStartOffset() + 77
             ,35
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = LNE1.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 112
             ,41
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = LNE1.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 153
             ,39
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = LNE1.PROC_DT").toCharArray()
             , getStartOffset() + 192
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = LNE1.PROC_TM").toCharArray()
             , getStartOffset() + 223
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 254
             ,26
             );
       replaceValue( // serialize and save the value
             (" = LNE1.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 280
             ,25
             );
       replaceValue( // serialize and save the value
             (" AND LNE1.SRVC_CATGY_CD = CAST(? AS CHAR(2))").toCharArray()
             , getStartOffset() + 305
             ,44
             );
       replaceValue( // serialize and save the value
             (" FETCH FIRST 1 ROWS ONLY").toCharArray()
             , getStartOffset() + 349
             ,24
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 373
             ,1
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 374
             ,1
             );
    }


 


	
	
	

		public static int getQueryFilterSvcSqlFieldLength() {
			return QUERY_FILTER_SVC_SQL_LENGTH;
		}

}
  
