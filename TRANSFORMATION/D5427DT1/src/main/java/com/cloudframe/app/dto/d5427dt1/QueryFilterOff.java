package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryFilterOff is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;


public class QueryFilterOff extends QueryFilterOffSerialized { 
   
















	
	/**
	* Constructor for QueryFilterOff
	**/
    public QueryFilterOff() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" AND").toCharArray()
             , getStartOffset() + 0
             ,4
             );
       replaceValue( // serialize and save the value
             (" ( EXISTS").toCharArray()
             , getStartOffset() + 4
             ,9
             );
       replaceValue( // serialize and save the value
             (" (SELECT 1").toCharArray()
             , getStartOffset() + 13
             ,10
             );
       replaceValue( // serialize and save the value
             (" FROM ADJD_CLMHST_DENORM_HDR HDR1").toCharArray()
             , getStartOffset() + 23
             ,33
             );
       replaceValue( // serialize and save the value
             (" WHERE REF.PARTN_ID = HDR1.PARTN_ID").toCharArray()
             , getStartOffset() + 56
             ,35
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = HDR1.PARTN_VAL").toCharArray()
             , getStartOffset() + 91
             ,35
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = HDR1.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 126
             ,41
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = HDR1.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 167
             ,39
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = HDR1.PROC_DT").toCharArray()
             , getStartOffset() + 206
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = HDR1.PROC_TM").toCharArray()
             , getStartOffset() + 237
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 268
             ,26
             );
       replaceValue( // serialize and save the value
             (" = HDR1.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 294
             ,25
             );
       replaceValue( // serialize and save the value
             (" AND HDR1.FILM_OFC_NBR = CAST(? AS CHAR(4))").toCharArray()
             , getStartOffset() + 319
             ,43
             );
       replaceValue( // serialize and save the value
             (" FETCH FIRST 1 ROWS ONLY").toCharArray()
             , getStartOffset() + 362
             ,24
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 386
             ,1
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 387
             ,1
             );
    }


 


	
	
	

		public static int getQueryFilterOffFieldLength() {
			return QUERY_FILTER_OFF_LENGTH;
		}

}
  
