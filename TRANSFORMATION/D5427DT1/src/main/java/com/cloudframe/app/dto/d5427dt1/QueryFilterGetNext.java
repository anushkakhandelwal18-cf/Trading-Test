package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryFilterGetNext is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;


public class QueryFilterGetNext extends QueryFilterGetNextSerialized { 
   





















































	
	/**
	* Constructor for QueryFilterGetNext
	**/
    public QueryFilterGetNext() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" AND").toCharArray()
             , getStartOffset() + 0
             ,4
             );
       replaceValue( // serialize and save the value
             (" (").toCharArray()
             , getStartOffset() + 4
             ,2
             );
       replaceValue( // serialize and save the value
             ("(REF.PROC_DT = CAST(? AS DATE)").toCharArray()
             , getStartOffset() + 6
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = CAST(? AS TIME)").toCharArray()
             , getStartOffset() + 36
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.PGM_ID_LST_CHAR_VAL").toCharArray()
             , getStartOffset() + 70
             ,28
             );
       replaceValue( // serialize and save the value
             (" = CAST(? AS CHAR(1)) ").toCharArray()
             , getStartOffset() + 98
             ,22
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 120
             ,26
             );
       replaceValue( // serialize and save the value
             (" = CAST(? AS SMALLINT)   ").toCharArray()
             , getStartOffset() + 146
             ,25
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = CAST(? AS CHAR(10))").toCharArray()
             , getStartOffset() + 171
             ,43
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = CAST(? AS CHAR(2)) ").toCharArray()
             , getStartOffset() + 214
             ,42
             );
       replaceValue( // serialize and save the value
             (" AND REF.LN_ID <= CAST(? AS SMALLINT)   ").toCharArray()
             , getStartOffset() + 256
             ,40
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 296
             ,1
             );
       replaceValue( // serialize and save the value
             (" OR").toCharArray()
             , getStartOffset() + 297
             ,3
             );
       replaceValue( // serialize and save the value
             (" (REF.PROC_DT = CAST(? AS DATE)").toCharArray()
             , getStartOffset() + 300
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = CAST(? AS TIME)").toCharArray()
             , getStartOffset() + 331
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.PGM_ID_LST_CHAR_VAL").toCharArray()
             , getStartOffset() + 365
             ,28
             );
       replaceValue( // serialize and save the value
             (" = CAST(? AS CHAR(1))").toCharArray()
             , getStartOffset() + 393
             ,21
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 414
             ,26
             );
       replaceValue( // serialize and save the value
             (" = CAST(? AS SMALLINT)   ").toCharArray()
             , getStartOffset() + 440
             ,25
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = CAST(? AS CHAR(10))").toCharArray()
             , getStartOffset() + 465
             ,43
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD < CAST(? AS CHAR(2)) ").toCharArray()
             , getStartOffset() + 508
             ,42
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 550
             ,1
             );
       replaceValue( // serialize and save the value
             (" OR").toCharArray()
             , getStartOffset() + 551
             ,3
             );
       replaceValue( // serialize and save the value
             (" (REF.PROC_DT = CAST(? AS DATE)").toCharArray()
             , getStartOffset() + 554
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = CAST(? AS TIME)").toCharArray()
             , getStartOffset() + 585
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.PGM_ID_LST_CHAR_VAL").toCharArray()
             , getStartOffset() + 619
             ,28
             );
       replaceValue( // serialize and save the value
             (" = CAST(? AS CHAR(1))").toCharArray()
             , getStartOffset() + 647
             ,21
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 668
             ,26
             );
       replaceValue( // serialize and save the value
             (" = CAST(? AS SMALLINT)   ").toCharArray()
             , getStartOffset() + 694
             ,25
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR < CAST(? AS CHAR(10))").toCharArray()
             , getStartOffset() + 719
             ,43
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 762
             ,1
             );
       replaceValue( // serialize and save the value
             (" OR").toCharArray()
             , getStartOffset() + 763
             ,3
             );
       replaceValue( // serialize and save the value
             (" (REF.PROC_DT = CAST(? AS DATE)").toCharArray()
             , getStartOffset() + 766
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = CAST(? AS TIME)").toCharArray()
             , getStartOffset() + 797
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.PGM_ID_LST_CHAR_VAL").toCharArray()
             , getStartOffset() + 831
             ,28
             );
       replaceValue( // serialize and save the value
             (" = CAST(? AS CHAR(1))").toCharArray()
             , getStartOffset() + 859
             ,21
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 880
             ,26
             );
       replaceValue( // serialize and save the value
             (" < CAST(? AS SMALLINT)   ").toCharArray()
             , getStartOffset() + 906
             ,25
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 931
             ,1
             );
       replaceValue( // serialize and save the value
             (" OR").toCharArray()
             , getStartOffset() + 932
             ,3
             );
       replaceValue( // serialize and save the value
             (" (REF.PROC_DT = CAST(? AS DATE)").toCharArray()
             , getStartOffset() + 935
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = CAST(? AS TIME)").toCharArray()
             , getStartOffset() + 966
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.PGM_ID_LST_CHAR_VAL").toCharArray()
             , getStartOffset() + 1000
             ,28
             );
       replaceValue( // serialize and save the value
             (" < CAST(? AS CHAR(1))").toCharArray()
             , getStartOffset() + 1028
             ,21
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 1049
             ,1
             );
       replaceValue( // serialize and save the value
             (" OR").toCharArray()
             , getStartOffset() + 1050
             ,3
             );
       replaceValue( // serialize and save the value
             (" (REF.PROC_DT = CAST(? AS DATE)").toCharArray()
             , getStartOffset() + 1053
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM < CAST(? AS TIME)").toCharArray()
             , getStartOffset() + 1084
             ,34
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 1118
             ,1
             );
       replaceValue( // serialize and save the value
             (" OR").toCharArray()
             , getStartOffset() + 1119
             ,3
             );
       replaceValue( // serialize and save the value
             (" (REF.PROC_DT < CAST(? AS DATE)").toCharArray()
             , getStartOffset() + 1122
             ,31
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 1153
             ,1
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 1154
             ,1
             );
    }


 


	
	
	

		public static int getQueryFilterGetNextFieldLength() {
			return QUERY_FILTER_GET_NEXT_LENGTH;
		}

}
  
