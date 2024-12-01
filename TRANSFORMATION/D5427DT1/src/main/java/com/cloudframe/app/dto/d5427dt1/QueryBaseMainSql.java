package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryBaseMainSql is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class QueryBaseMainSql extends QueryBaseMainSqlSerialized { 
   
















































































				private QueryBaseMainSqlGroup81 queryBaseMainSqlGroup81 = new QueryBaseMainSqlGroup81();













				private QueryBaseMainSqlGroup100 queryBaseMainSqlGroup100 = new QueryBaseMainSqlGroup100();

				private QueryBaseMainSqlGroup107 queryBaseMainSqlGroup107 = new QueryBaseMainSqlGroup107();









				private QueryBaseMainSqlGroup121 queryBaseMainSqlGroup121 = new QueryBaseMainSqlGroup121();
























































































	
	/**
	* Constructor for QueryBaseMainSql
	**/
    public QueryBaseMainSql() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			queryBaseMainSqlGroup81.setParent(this,getStartOffset() + 1351);
	       			queryBaseMainSqlGroup100.setParent(this,getStartOffset() + 1737);
	       			queryBaseMainSqlGroup107.setParent(this,getStartOffset() + 1762);
	       			queryBaseMainSqlGroup121.setParent(this,getStartOffset() + 2101);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" SELECT").toCharArray()
             , getStartOffset() + 0
             ,7
             );
       replaceValue( // serialize and save the value
             (" REF.PARTN_ID").toCharArray()
             , getStartOffset() + 7
             ,13
             );
       replaceValue( // serialize and save the value
             (",REF.PARTN_VAL").toCharArray()
             , getStartOffset() + 20
             ,14
             );
       replaceValue( // serialize and save the value
             (",REF.PROC_DT").toCharArray()
             , getStartOffset() + 34
             ,12
             );
       replaceValue( // serialize and save the value
             (",REF.PROC_TM").toCharArray()
             , getStartOffset() + 46
             ,12
             );
       replaceValue( // serialize and save the value
             (",REF.PGM_ID_LST_CHAR_VAL").toCharArray()
             , getStartOffset() + 58
             ,24
             );
       replaceValue( // serialize and save the value
             (",REF.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 82
             ,22
             );
       replaceValue( // serialize and save the value
             (",REF.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 104
             ,17
             );
       replaceValue( // serialize and save the value
             (",REF.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 121
             ,16
             );
       replaceValue( // serialize and save the value
             (",REF.LN_ID").toCharArray()
             , getStartOffset() + 137
             ,10
             );
       replaceValue( // serialize and save the value
             (",REF.FLN_JULIAN_DT_NBR").toCharArray()
             , getStartOffset() + 147
             ,22
             );
       replaceValue( // serialize and save the value
             (",REF.FLN_SRL_NBR").toCharArray()
             , getStartOffset() + 169
             ,16
             );
       replaceValue( // serialize and save the value
             (",REF.DFT_NBR").toCharArray()
             , getStartOffset() + 185
             ,12
             );
       replaceValue( // serialize and save the value
             (",REF.FST_DT").toCharArray()
             , getStartOffset() + 197
             ,11
             );
       replaceValue( // serialize and save the value
             (",REF.LST_SRVC_DT").toCharArray()
             , getStartOffset() + 208
             ,16
             );
       replaceValue( // serialize and save the value
             (",REF.PROV_TINSUFF").toCharArray()
             , getStartOffset() + 224
             ,17
             );
       replaceValue( // serialize and save the value
             (",REF.PROV_SCRN_NBR").toCharArray()
             , getStartOffset() + 241
             ,18
             );
       replaceValue( // serialize and save the value
             (",REF.CHRG_AMT").toCharArray()
             , getStartOffset() + 259
             ,13
             );
       replaceValue( // serialize and save the value
             (",REF.RMRK_CD").toCharArray()
             , getStartOffset() + 272
             ,12
             );
       replaceValue( // serialize and save the value
             (",REF.NC_AMT").toCharArray()
             , getStartOffset() + 284
             ,11
             );
       replaceValue( // serialize and save the value
             (",REF.PMT_SVC_CD").toCharArray()
             , getStartOffset() + 295
             ,15
             );
       replaceValue( // serialize and save the value
             (",REF.OVR_CD").toCharArray()
             , getStartOffset() + 310
             ,11
             );
       replaceValue( // serialize and save the value
             (",REF.COPAY_AMT").toCharArray()
             , getStartOffset() + 321
             ,14
             );
       replaceValue( // serialize and save the value
             (",REF.SRVC_CD").toCharArray()
             , getStartOffset() + 335
             ,12
             );
       replaceValue( // serialize and save the value
             (",REF.PAY_CD").toCharArray()
             , getStartOffset() + 347
             ,11
             );
       replaceValue( // serialize and save the value
             (",REF.TRANS_CD").toCharArray()
             , getStartOffset() + 358
             ,13
             );
       replaceValue( // serialize and save the value
             (",HDR.FILM_OFC_NBR").toCharArray()
             , getStartOffset() + 371
             ,17
             );
       replaceValue( // serialize and save the value
             (",HDR.CLM_LVL_RSN_CD").toCharArray()
             , getStartOffset() + 388
             ,19
             );
       replaceValue( // serialize and save the value
             (",HDR.ADJTR_ID").toCharArray()
             , getStartOffset() + 407
             ,13
             );
       replaceValue( // serialize and save the value
             (",HDR.MBR_PRV_IND").toCharArray()
             , getStartOffset() + 420
             ,16
             );
       replaceValue( // serialize and save the value
             (",HDR.NTFY_WAIV_CD").toCharArray()
             , getStartOffset() + 436
             ,17
             );
       replaceValue( // serialize and save the value
             (",HDR.BANK_CD").toCharArray()
             , getStartOffset() + 453
             ,12
             );
       replaceValue( // serialize and save the value
             (",HDR.DIV_NBR").toCharArray()
             , getStartOffset() + 465
             ,12
             );
       replaceValue( // serialize and save the value
             (",HDR.CLS_NBR").toCharArray()
             , getStartOffset() + 477
             ,12
             );
       replaceValue( // serialize and save the value
             (",HDR.DRG_NBR").toCharArray()
             , getStartOffset() + 489
             ,12
             );
       replaceValue( // serialize and save the value
             (",HDR.FACL_OR_PROF_CD").toCharArray()
             , getStartOffset() + 501
             ,20
             );
       replaceValue( // serialize and save the value
             (",BKE.DLGT_ENTY_CD").toCharArray()
             , getStartOffset() + 521
             ,17
             );
       replaceValue( // serialize and save the value
             (",BK2.NDB_CONTR_ID").toCharArray()
             , getStartOffset() + 538
             ,17
             );
       replaceValue( // serialize and save the value
             (",BK2.CLM_SMB_TYP_APP_CD").toCharArray()
             , getStartOffset() + 555
             ,23
             );
       replaceValue( // serialize and save the value
             (",BK2.SMB_ST_CD").toCharArray()
             , getStartOffset() + 578
             ,14
             );
       replaceValue( // serialize and save the value
             (",DLN.PROC_T1_IND").toCharArray()
             , getStartOffset() + 592
             ,16
             );
       replaceValue( // serialize and save the value
             (",DLN.AUTH_NBR").toCharArray()
             , getStartOffset() + 608
             ,13
             );
       replaceValue( // serialize and save the value
             (",DLN.BASE_DED_DESC_TXT").toCharArray()
             , getStartOffset() + 621
             ,22
             );
       replaceValue( // serialize and save the value
             (",DLN.MM_DED_DESC_TXT").toCharArray()
             , getStartOffset() + 643
             ,20
             );
       replaceValue( // serialize and save the value
             (",DLN.PRS_CREAT_SRC_CD").toCharArray()
             , getStartOffset() + 663
             ,21
             );
       replaceValue( // serialize and save the value
             (",DLN.BASE_DED_AMT").toCharArray()
             , getStartOffset() + 684
             ,17
             );
       replaceValue( // serialize and save the value
             (",DLN.BASE_AMT").toCharArray()
             , getStartOffset() + 701
             ,13
             );
       replaceValue( // serialize and save the value
             (",DLN.MM_DED_AMT").toCharArray()
             , getStartOffset() + 714
             ,15
             );
       replaceValue( // serialize and save the value
             (",DLN.MM_AMT").toCharArray()
             , getStartOffset() + 729
             ,11
             );
       replaceValue( // serialize and save the value
             (",DLN.MC_CR_RES_AMT").toCharArray()
             , getStartOffset() + 740
             ,18
             );
       replaceValue( // serialize and save the value
             (",DLN.COB_CR_RES_AMT").toCharArray()
             , getStartOffset() + 758
             ,19
             );
       replaceValue( // serialize and save the value
             (",DLN.PAR_IND").toCharArray()
             , getStartOffset() + 777
             ,12
             );
       replaceValue( // serialize and save the value
             (",DLN.SUP_AMT").toCharArray()
             , getStartOffset() + 789
             ,12
             );
       replaceValue( // serialize and save the value
             (",DLN.PROV_MKT_NBR").toCharArray()
             , getStartOffset() + 801
             ,17
             );
       replaceValue( // serialize and save the value
             (",DLN.PPO_CD").toCharArray()
             , getStartOffset() + 818
             ,11
             );
       replaceValue( // serialize and save the value
             (",DLN.PTNT_RESP_AMT").toCharArray()
             , getStartOffset() + 829
             ,18
             );
       replaceValue( // serialize and save the value
             (",LNE.AUTH_SRC_ID").toCharArray()
             , getStartOffset() + 847
             ,16
             );
       replaceValue( // serialize and save the value
             (",LNE.AUTH_PROC_CD").toCharArray()
             , getStartOffset() + 863
             ,17
             );
       replaceValue( // serialize and save the value
             (",PRV.PROV_NM").toCharArray()
             , getStartOffset() + 880
             ,12
             );
       replaceValue( // serialize and save the value
             (",PRV.PROV_EOB_NM").toCharArray()
             , getStartOffset() + 892
             ,16
             );
       replaceValue( // serialize and save the value
             (",PRV.PROV_PRDCT_CD").toCharArray()
             , getStartOffset() + 908
             ,18
             );
       replaceValue( // serialize and save the value
             (",PRV.PROV_MKT_TYP_CD").toCharArray()
             , getStartOffset() + 926
             ,20
             );
       replaceValue( // serialize and save the value
             (",PRV.PROV_IPA_ID").toCharArray()
             , getStartOffset() + 946
             ,16
             );
       replaceValue( // serialize and save the value
             (",PRV.TPSM_CD").toCharArray()
             , getStartOffset() + 962
             ,12
             );
       replaceValue( // serialize and save the value
             (",PRV.PROV_SPCL_CD").toCharArray()
             , getStartOffset() + 974
             ,17
             );
       replaceValue( // serialize and save the value
             (",IFNULL(").toCharArray()
             , getStartOffset() + 991
             ,8
             );
       replaceValue( // serialize and save the value
             ("(SELECT PR1.PROV_MEDCD_RECLM_IND").toCharArray()
             , getStartOffset() + 999
             ,32
             );
       replaceValue( // serialize and save the value
             (" FROM ADJD_CLMSF_PROV PR1").toCharArray()
             , getStartOffset() + 1031
             ,25
             );
       replaceValue( // serialize and save the value
             (" WHERE REF.PARTN_ID = PR1.PARTN_ID").toCharArray()
             , getStartOffset() + 1056
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = PR1.PARTN_VAL").toCharArray()
             , getStartOffset() + 1090
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 1124
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 1164
             ,38
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = PR1.PROC_DT").toCharArray()
             , getStartOffset() + 1202
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = PR1.PROC_TM").toCharArray()
             , getStartOffset() + 1232
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND PR1.PROV_MEDCD_RECLM_IND =  ").toCharArray()
             , getStartOffset() + 1262
             ,33
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 1295
             ,1
             );
       replaceValue( // serialize and save the value
             ("Y").toCharArray()
             , getStartOffset() + 1296
             ,1
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 1297
             ,1
             );
       replaceValue( // serialize and save the value
             (" ORDER BY LST_UPDT_DTTM DESC").toCharArray()
             , getStartOffset() + 1298
             ,28
             );
       replaceValue( // serialize and save the value
             ("  FETCH FIRST 1 ROW ONLY)").toCharArray()
             , getStartOffset() + 1326
             ,25
             );
       replaceValue( // serialize and save the value
             (",IFNULL(").toCharArray()
             , getStartOffset() + 1356
             ,8
             );
       replaceValue( // serialize and save the value
             (" (SELECT REL.REL_SRVC_CLM_LVL_IND").toCharArray()
             , getStartOffset() + 1364
             ,33
             );
       replaceValue( // serialize and save the value
             (" FROM ADJD_CLMSFLN_REL_SRVCS REL").toCharArray()
             , getStartOffset() + 1397
             ,32
             );
       replaceValue( // serialize and save the value
             (" WHERE REF.PARTN_ID = REL.PARTN_ID").toCharArray()
             , getStartOffset() + 1429
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = REL.PARTN_VAL").toCharArray()
             , getStartOffset() + 1463
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 1497
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 1537
             ,38
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = REL.PROC_DT").toCharArray()
             , getStartOffset() + 1575
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = REL.PROC_TM").toCharArray()
             , getStartOffset() + 1605
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 1635
             ,26
             );
       replaceValue( // serialize and save the value
             (" = REL.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 1661
             ,24
             );
       replaceValue( // serialize and save the value
             (" AND REF.LN_ID = REL.LN_ID").toCharArray()
             , getStartOffset() + 1685
             ,26
             );
       replaceValue( // serialize and save the value
             (" FETCH FIRST 1 ROWS ONLY )").toCharArray()
             , getStartOffset() + 1711
             ,26
             );
       replaceValue( // serialize and save the value
             (",IFNULL(DIA.DIAG_CD,").toCharArray()
             , getStartOffset() + 1742
             ,20
             );
       replaceValue( // serialize and save the value
             (",( SELECT COUNT(DISTINCT AUTH_NBR)").toCharArray()
             , getStartOffset() + 1772
             ,34
             );
       replaceValue( // serialize and save the value
             (" FROM ADJD_CLMHST_DENORM_LN DLN2").toCharArray()
             , getStartOffset() + 1806
             ,32
             );
       replaceValue( // serialize and save the value
             (" WHERE REF.PARTN_ID = DLN2.PARTN_ID").toCharArray()
             , getStartOffset() + 1838
             ,35
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = DLN2.PARTN_VAL").toCharArray()
             , getStartOffset() + 1873
             ,35
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 1908
             ,41
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 1949
             ,39
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = DLN2.PROC_DT").toCharArray()
             , getStartOffset() + 1988
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = DLN2.PROC_TM").toCharArray()
             , getStartOffset() + 2019
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 2050
             ,51
             );
       replaceValue( // serialize and save the value
             (",( SELECT SUM(PHYS_MEDCN_MSK_CNT) ").toCharArray()
             , getStartOffset() + 2127
             ,34
             );
       replaceValue( // serialize and save the value
             (" FROM ADJD_CLMSF_LN2 LN2        ").toCharArray()
             , getStartOffset() + 2161
             ,32
             );
       replaceValue( // serialize and save the value
             (" WHERE REF.PARTN_ID = LN2.PARTN_ID ").toCharArray()
             , getStartOffset() + 2193
             ,35
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = LN2.PARTN_VAL ").toCharArray()
             , getStartOffset() + 2228
             ,35
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR ").toCharArray()
             , getStartOffset() + 2263
             ,41
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD ").toCharArray()
             , getStartOffset() + 2304
             ,39
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = LN2.PROC_DT ").toCharArray()
             , getStartOffset() + 2343
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = LN2.PROC_TM ").toCharArray()
             , getStartOffset() + 2374
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) ").toCharArray()
             , getStartOffset() + 2405
             ,52
             );
       replaceValue( // serialize and save the value
             (" FROM CLM_HST_TABLE HST").toCharArray()
             , getStartOffset() + 2457
             ,23
             );
       replaceValue( // serialize and save the value
             (" INNER JOIN ADJD_CLMHST_DENORM_REF REF").toCharArray()
             , getStartOffset() + 2480
             ,38
             );
       replaceValue( // serialize and save the value
             (" ON REF.PARTN_ID = HST.PARTN_ID").toCharArray()
             , getStartOffset() + 2518
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = HST.PARTN_VAL").toCharArray()
             , getStartOffset() + 2549
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = HST.PROC_DT").toCharArray()
             , getStartOffset() + 2583
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = HST.PROC_TM").toCharArray()
             , getStartOffset() + 2613
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 2643
             ,50
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 2693
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 2733
             ,38
             );
       replaceValue( // serialize and save the value
             (" INNER JOIN ADJD_CLMHST_DENORM_HDR HDR").toCharArray()
             , getStartOffset() + 2771
             ,38
             );
       replaceValue( // serialize and save the value
             (" ON REF.PARTN_ID = HDR.PARTN_ID").toCharArray()
             , getStartOffset() + 2809
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = HDR.PARTN_VAL").toCharArray()
             , getStartOffset() + 2840
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 2874
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 2914
             ,38
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = HDR.PROC_DT").toCharArray()
             , getStartOffset() + 2952
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = HDR.PROC_TM").toCharArray()
             , getStartOffset() + 2982
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 3012
             ,50
             );
       replaceValue( // serialize and save the value
             (" INNER JOIN ADJD_CLMSF_BLK_E BKE").toCharArray()
             , getStartOffset() + 3062
             ,32
             );
       replaceValue( // serialize and save the value
             (" ON REF.PARTN_ID = BKE.PARTN_ID").toCharArray()
             , getStartOffset() + 3094
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = BKE.PARTN_VAL").toCharArray()
             , getStartOffset() + 3125
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 3159
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 3199
             ,38
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = BKE.PROC_DT").toCharArray()
             , getStartOffset() + 3237
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = BKE.PROC_TM").toCharArray()
             , getStartOffset() + 3267
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 3297
             ,50
             );
       replaceValue( // serialize and save the value
             (" INNER JOIN ADJD_CLMSF_BLK_E2 BK2").toCharArray()
             , getStartOffset() + 3347
             ,33
             );
       replaceValue( // serialize and save the value
             (" ON REF.PARTN_ID = BK2.PARTN_ID").toCharArray()
             , getStartOffset() + 3380
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = BK2.PARTN_VAL").toCharArray()
             , getStartOffset() + 3411
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 3445
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 3485
             ,38
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = BK2.PROC_DT").toCharArray()
             , getStartOffset() + 3523
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = BK2.PROC_TM").toCharArray()
             , getStartOffset() + 3553
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 3583
             ,50
             );
       replaceValue( // serialize and save the value
             (" INNER JOIN ADJD_CLMHST_DENORM_LN DLN").toCharArray()
             , getStartOffset() + 3633
             ,37
             );
       replaceValue( // serialize and save the value
             (" ON REF.PARTN_ID = DLN.PARTN_ID").toCharArray()
             , getStartOffset() + 3670
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = DLN.PARTN_VAL").toCharArray()
             , getStartOffset() + 3701
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 3735
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 3775
             ,38
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = DLN.PROC_DT").toCharArray()
             , getStartOffset() + 3813
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = DLN.PROC_TM").toCharArray()
             , getStartOffset() + 3843
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 3873
             ,50
             );
       replaceValue( // serialize and save the value
             (" AND REF.LN_ID = DLN.LN_ID").toCharArray()
             , getStartOffset() + 3923
             ,26
             );
       replaceValue( // serialize and save the value
             (" INNER JOIN ADJD_CLMSF_PROV PRV").toCharArray()
             , getStartOffset() + 3949
             ,31
             );
       replaceValue( // serialize and save the value
             (" ON REF.PARTN_ID = PRV.PARTN_ID").toCharArray()
             , getStartOffset() + 3980
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = PRV.PARTN_VAL").toCharArray()
             , getStartOffset() + 4011
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 4045
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 4085
             ,38
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = PRV.PROC_DT").toCharArray()
             , getStartOffset() + 4123
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = PRV.PROC_TM").toCharArray()
             , getStartOffset() + 4153
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 4183
             ,50
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR").toCharArray()
             , getStartOffset() + 4233
             ,41
             );
       replaceValue( // serialize and save the value
             (" INNER JOIN ADJD_CLMSF_LN LNE").toCharArray()
             , getStartOffset() + 4274
             ,29
             );
       replaceValue( // serialize and save the value
             (" ON REF.PARTN_ID = LNE.PARTN_ID").toCharArray()
             , getStartOffset() + 4303
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = LNE.PARTN_VAL").toCharArray()
             , getStartOffset() + 4334
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 4368
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 4408
             ,38
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = LNE.PROC_DT").toCharArray()
             , getStartOffset() + 4446
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = LNE.PROC_TM").toCharArray()
             , getStartOffset() + 4476
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 4506
             ,50
             );
       replaceValue( // serialize and save the value
             (" AND REF.LN_ID = LNE.LN_ID").toCharArray()
             , getStartOffset() + 4556
             ,26
             );
       replaceValue( // serialize and save the value
             (" LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA").toCharArray()
             , getStartOffset() + 4582
             ,36
             );
       replaceValue( // serialize and save the value
             (" ON REF.PARTN_ID = DIA.PARTN_ID").toCharArray()
             , getStartOffset() + 4618
             ,31
             );
       replaceValue( // serialize and save the value
             (" AND REF.PARTN_VAL = DIA.PARTN_VAL").toCharArray()
             , getStartOffset() + 4649
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR").toCharArray()
             , getStartOffset() + 4683
             ,40
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD").toCharArray()
             , getStartOffset() + 4723
             ,38
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_DT = DIA.PROC_DT").toCharArray()
             , getStartOffset() + 4761
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.PROC_TM = DIA.PROC_TM").toCharArray()
             , getStartOffset() + 4791
             ,30
             );
       replaceValue( // serialize and save the value
             (" AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR").toCharArray()
             , getStartOffset() + 4821
             ,50
             );
       replaceValue( // serialize and save the value
             (" AND 1 = DIA.DIAG_SEQ_NBR").toCharArray()
             , getStartOffset() + 4871
             ,25
             );
       replaceValue( // serialize and save the value
             (" ORDER BY REF.PROC_DT DESC").toCharArray()
             , getStartOffset() + 4896
             ,26
             );
       replaceValue( // serialize and save the value
             (", REF.PROC_TM DESC").toCharArray()
             , getStartOffset() + 4922
             ,18
             );
       replaceValue( // serialize and save the value
             (", REF.PGM_ID_LST_CHAR_VAL DESC").toCharArray()
             , getStartOffset() + 4940
             ,30
             );
       replaceValue( // serialize and save the value
             (", REF.ICN_SUFX_VERS_NBR DESC").toCharArray()
             , getStartOffset() + 4970
             ,28
             );
       replaceValue( // serialize and save the value
             (", REF.INVN_CTL_NBR DESC").toCharArray()
             , getStartOffset() + 4998
             ,23
             );
       replaceValue( // serialize and save the value
             (", REF.ICN_SUFX_CD DESC").toCharArray()
             , getStartOffset() + 5021
             ,22
             );
       replaceValue( // serialize and save the value
             (", REF.LN_ID DESC").toCharArray()
             , getStartOffset() + 5043
             ,16
             );
       replaceValue( // serialize and save the value
             (" OPTIMIZE FOR 600 ROWS").toCharArray()
             , getStartOffset() + 5059
             ,22
             );
       replaceValue( // serialize and save the value
             (" FETCH FIRST 600 ROWS ONLY").toCharArray()
             , getStartOffset() + 5081
             ,26
             );
       replaceValue( // serialize and save the value
             (" WITH UR").toCharArray()
             , getStartOffset() + 5107
             ,8
             );
    }


 

	/**
	 *	Returns the value of queryBaseMainSqlGroup81
	 *	@return queryBaseMainSqlGroup81
	 */   
	 public QueryBaseMainSqlGroup81 getQueryBaseMainSqlGroup81() {
   	return queryBaseMainSqlGroup81;
   }
   /**
	* 	Update QueryBaseMainSqlGroup81 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setQueryBaseMainSqlGroup81(char[] value) {
      queryBaseMainSqlGroup81.setString(value); 
   }   
    
     /**
	 * 	Update QueryBaseMainSqlGroup81 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup81(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup81.begin,queryBaseMainSqlGroup81.length());
   }
   
     /**
	 * 	Update QueryBaseMainSqlGroup81 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup81(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup81.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update QueryBaseMainSqlGroup81 with another Field
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup81(Field source) {
   	replace(source,0,source.length(),queryBaseMainSqlGroup81.begin,queryBaseMainSqlGroup81.length());
   }  
   
     /**
	 * 	Update QueryBaseMainSqlGroup81 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup81(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup81.begin,queryBaseMainSqlGroup81.length());
   }
   
     /**
	 * 	Update QueryBaseMainSqlGroup81 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup81(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup81.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of queryBaseMainSqlGroup100
	 *	@return queryBaseMainSqlGroup100
	 */   
	 public QueryBaseMainSqlGroup100 getQueryBaseMainSqlGroup100() {
   	return queryBaseMainSqlGroup100;
   }
   /**
	* 	Update QueryBaseMainSqlGroup100 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setQueryBaseMainSqlGroup100(char[] value) {
      queryBaseMainSqlGroup100.setString(value); 
   }   
    
     /**
	 * 	Update QueryBaseMainSqlGroup100 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup100(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup100.begin,queryBaseMainSqlGroup100.length());
   }
   
     /**
	 * 	Update QueryBaseMainSqlGroup100 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup100.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update QueryBaseMainSqlGroup100 with another Field
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup100(Field source) {
   	replace(source,0,source.length(),queryBaseMainSqlGroup100.begin,queryBaseMainSqlGroup100.length());
   }  
   
     /**
	 * 	Update QueryBaseMainSqlGroup100 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup100(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup100.begin,queryBaseMainSqlGroup100.length());
   }
   
     /**
	 * 	Update QueryBaseMainSqlGroup100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup100.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of queryBaseMainSqlGroup107
	 *	@return queryBaseMainSqlGroup107
	 */   
	 public QueryBaseMainSqlGroup107 getQueryBaseMainSqlGroup107() {
   	return queryBaseMainSqlGroup107;
   }
   /**
	* 	Update QueryBaseMainSqlGroup107 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setQueryBaseMainSqlGroup107(char[] value) {
      queryBaseMainSqlGroup107.setString(value); 
   }   
    
     /**
	 * 	Update QueryBaseMainSqlGroup107 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup107(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup107.begin,queryBaseMainSqlGroup107.length());
   }
   
     /**
	 * 	Update QueryBaseMainSqlGroup107 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup107(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup107.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update QueryBaseMainSqlGroup107 with another Field
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup107(Field source) {
   	replace(source,0,source.length(),queryBaseMainSqlGroup107.begin,queryBaseMainSqlGroup107.length());
   }  
   
     /**
	 * 	Update QueryBaseMainSqlGroup107 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup107(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup107.begin,queryBaseMainSqlGroup107.length());
   }
   
     /**
	 * 	Update QueryBaseMainSqlGroup107 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup107(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup107.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of queryBaseMainSqlGroup121
	 *	@return queryBaseMainSqlGroup121
	 */   
	 public QueryBaseMainSqlGroup121 getQueryBaseMainSqlGroup121() {
   	return queryBaseMainSqlGroup121;
   }
   /**
	* 	Update QueryBaseMainSqlGroup121 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setQueryBaseMainSqlGroup121(char[] value) {
      queryBaseMainSqlGroup121.setString(value); 
   }   
    
     /**
	 * 	Update QueryBaseMainSqlGroup121 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup121(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup121.begin,queryBaseMainSqlGroup121.length());
   }
   
     /**
	 * 	Update QueryBaseMainSqlGroup121 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup121(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup121.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update QueryBaseMainSqlGroup121 with another Field
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup121(Field source) {
   	replace(source,0,source.length(),queryBaseMainSqlGroup121.begin,queryBaseMainSqlGroup121.length());
   }  
   
     /**
	 * 	Update QueryBaseMainSqlGroup121 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup121(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup121.begin,queryBaseMainSqlGroup121.length());
   }
   
     /**
	 * 	Update QueryBaseMainSqlGroup121 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setQueryBaseMainSqlGroup121(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,queryBaseMainSqlGroup121.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getQueryBaseMainSqlFieldLength() {
			return QUERY_BASE_MAIN_SQL_LENGTH;
		}

}
  
