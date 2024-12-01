package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import java.math.MathContext;
import com.cloudframe.app.repository.D5427dt1Repository;
import com.cloudframe.app.common.CONSTANTS;
import java.math.BigDecimal;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.dto.d5427dt1.*;

@Repository
@Qualifier("d5427dt1Repository")
public class D5427dt1RepositoryImpl implements D5427dt1Repository {
    Logger logger = LoggerFactory.getLogger(D5427dt1RepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
static final short NOT_NULL = (short)0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:selectAdjdClmsfRef
    
/**
******  SELECT                                                     
******        POL_NBR                                              
******      , EE_ID                                                
******      , DEPN_NBR                                             
******    INTO                                                     
******        :DREF-POL-NBR                                        
******      , :DREF-EE-ID                                          
******      , :DREF-DEPN-NBR                                       
******    FROM ADJD_CLMSF_REF                                      
******                                                             
******   WHERE INVN_CTL_NBR = :DREF-INVN-CTL-NBR                   
******   FETCH FIRST 1 ROWS ONLY                                   
******   WITH UR                                                   
******                                                             
**/
    public void selectAdjdClmsfRef(Sqlca sqlca, DcladjdClmsfRef dcladjdClmsfRef) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(14/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
.withSql(SQLS.SQL_2100414641)
				.withInputs(dcladjdClmsfRef.getDrefInvnCtlNbr())
				.withDataTypes(Types.CHAR)
	.queryForList();
	// check sqlca.getSqlcode() or errors
	sqlca.setSqlcode(Db2Base.fillSQLCode(resultSet));
	if (sqlca.getSqlcode() != 100) {
	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = resultSet.getObject(1);
 if (resultObj != null) {
   dcladjdClmsfRef.setDrefPolNbr( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(2);
 if (resultObjString != null) {
   dcladjdClmsfRef.setDrefEeId( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {
   dcladjdClmsfRef.setDrefDepnNbr( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
		if (resultSet.next()) sqlca.setSqlcode(-811);
	}else{
	sqlca.setSqlerrp("DSNXRFF".toCharArray());
int[] arr = {-110, 0, 0, -1, 0, 0};
for (int i = 0; i < arr.length; i++) {
sqlca.setSqlerrd(i, arr[i]);
}
sqlca.getSqlext().setSqlstate("02000".toCharArray());
	}
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:selectAdjdClmsfRef
// methodStart:openCsrInitFil2D5427dt1
    
/**
******  DECLARE CSR-INIT-FIL2 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  = :HV-PROV-TIN    
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******         FETCH FIRST  500 ROWS ONLY                          
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , LNE.AUTH_SRC_ID                                        
******    , LNE.AUTH_PROC_CD                                       
******    , PRV.PROV_NM                                            
******    , PRV.PROV_EOB_NM                                        
******    , PRV.PROV_PRDCT_CD                                      
******    , PRV.PROV_MKT_TYP_CD                                    
******    , PRV.PROV_IPA_ID                                        
******    , PRV.TPSM_CD                                            
******    , PRV.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrInitFil2D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrInitFil2ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrInitFil2ResultSet = db2Base.startQuery(15/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_352034233)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrInitFil2ResultSet;
    }
// methodEnd:openCsrInitFil2D5427dt1
// methodStart:fetchCsrInitFil2D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-INIT-FIL2                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrInitFil2D5427dt1(ResultSet csrInitFil2ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrInitFil2ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrInitFil2ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil2ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil2ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil2ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil2ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil2ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil2ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil2ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil2ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrInitFil2ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrInitFil2D5427dt1
// methodStart:closeCsrInitFil2D5427dt1
    
/**
******    CLOSE CSR-INIT-FIL2                                      
**/
    public void closeCsrInitFil2D5427dt1(ResultSet csrInitFil2ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrInitFil2ResultSet,sqlca);

    }
// methodEnd:closeCsrInitFil2D5427dt1
// methodStart:openCsrNextFil2D5427dt1
    
/**
******  DECLARE CSR-NEXT-FIL2 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  = :HV-PROV-TIN    
******                                                             
******         AND                                                 
******         (                                                   
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD       = :DDEREF-ICN-SUFX-CD  
******           AND  REF.LN_ID            <= :DDEREF-LN-ID        
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD      <  :DDEREF-ICN-SUFX-CD  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR     <  :DDEREF-INVN-CTL-NBR 
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******             <  :DDEREF-ICN-SUFX-VERS-NBR                    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******             <  :DDEREF-PGM-ID-LST-CHAR-VAL                  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM          <  :DDEREF-PROC-TM    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT          <  :DDEREF-PROC-DT    
******           )                                                 
******         )                                                   
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******       FETCH FIRST  500 ROWS ONLY                            
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , LNE.AUTH_SRC_ID                                        
******    , LNE.AUTH_PROC_CD                                       
******    , PRV.PROV_NM                                            
******    , PRV.PROV_EOB_NM                                        
******    , PRV.PROV_PRDCT_CD                                      
******    , PRV.PROV_MKT_TYP_CD                                    
******    , PRV.PROV_IPA_ID                                        
******    , PRV.TPSM_CD                                            
******    , PRV.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrNextFil2D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrNextFil2ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrNextFil2ResultSet = db2Base.startQuery(19/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_299536769)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefLnIdGroup().getDderefLnId(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrNextFil2ResultSet;
    }
// methodEnd:openCsrNextFil2D5427dt1
// methodStart:fetchCsrNextFil2D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-NEXT-FIL2                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrNextFil2D5427dt1(ResultSet csrNextFil2ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrNextFil2ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrNextFil2ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil2ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil2ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil2ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil2ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil2ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil2ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil2ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil2ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrNextFil2ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrNextFil2D5427dt1
// methodStart:closeCsrNextFil2D5427dt1
    
/**
******    CLOSE CSR-NEXT-FIL2                                      
**/
    public void closeCsrNextFil2D5427dt1(ResultSet csrNextFil2ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrNextFil2ResultSet,sqlca);

    }
// methodEnd:closeCsrNextFil2D5427dt1
// methodStart:prepare
    
/**
******  PREPARE DT1-DYN-QUERY                                      
******  FROM :QUERY-TEXT-AREA                                      
**/
    public void prepare(QueryTextArea queryTextArea, Sqlca sqlca) throws Exception {

try {
	//PREPARE
	sqlca.setSqlcode(0);
	int len = queryTextArea.getShort(0);
    char[] sql = new char[len];
    System.arraycopy(queryTextArea.toCharArray(), 2, sql, 0, len);
     db2Base.sqlPrepare(  new String(sql),"DT1-DYN-QUERY",CONSTANTS.LITERAL_D5427DT1);
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:prepare
// methodStart:openCsrInitFullD5427dt1
    
/**
******  DECLARE CSR-INIT-FULL CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******                                                             
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******       FETCH FIRST  500 ROWS ONLY                            
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , LNE.AUTH_SRC_ID                                        
******    , LNE.AUTH_PROC_CD                                       
******    , PRV.PROV_NM                                            
******    , PRV.PROV_EOB_NM                                        
******    , PRV.PROV_PRDCT_CD                                      
******    , PRV.PROV_MKT_TYP_CD                                    
******    , PRV.PROV_IPA_ID                                        
******    , PRV.TPSM_CD                                            
******    , PRV.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrInitFullD5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca) throws Exception {
ResultSet csrInitFullResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrInitFullResultSet = db2Base.startQuery(24/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_1787566012)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrInitFullResultSet;
    }
// methodEnd:openCsrInitFullD5427dt1
// methodStart:fetchCsrInitFullD5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-INIT-FULL                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrInitFullD5427dt1(ResultSet csrInitFullResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrInitFullResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrInitFullResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFullResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFullResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFullResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFullResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFullResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFullResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFullResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFullResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrInitFullResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrInitFullD5427dt1
// methodStart:closeCsrInitFullD5427dt1
    
/**
******    CLOSE CSR-INIT-FULL                                      
**/
    public void closeCsrInitFullD5427dt1(ResultSet csrInitFullResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrInitFullResultSet,sqlca);

    }
// methodEnd:closeCsrInitFullD5427dt1
// methodStart:openCsrInitFiltD5427dt1
    
/**
******  DECLARE CSR-INIT-FILT CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******         FETCH FIRST  500 ROWS ONLY                          
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , LNE.AUTH_SRC_ID                                        
******    , LNE.AUTH_PROC_CD                                       
******    , PRV.PROV_NM                                            
******    , PRV.PROV_EOB_NM                                        
******    , PRV.PROV_PRDCT_CD                                      
******    , PRV.PROV_MKT_TYP_CD                                    
******    , PRV.PROV_IPA_ID                                        
******    , PRV.TPSM_CD                                            
******    , PRV.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrInitFiltD5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrInitFiltResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrInitFiltResultSet = db2Base.startQuery(28/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_1120800865)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrInitFiltResultSet;
    }
// methodEnd:openCsrInitFiltD5427dt1
// methodStart:fetchCsrInitFiltD5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-INIT-FILT                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrInitFiltD5427dt1(ResultSet csrInitFiltResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrInitFiltResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrInitFiltResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFiltResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFiltResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFiltResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFiltResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFiltResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFiltResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFiltResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFiltResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrInitFiltResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrInitFiltD5427dt1
// methodStart:closeCsrInitFiltD5427dt1
    
/**
******    CLOSE CSR-INIT-FILT                                      
**/
    public void closeCsrInitFiltD5427dt1(ResultSet csrInitFiltResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrInitFiltResultSet,sqlca);

    }
// methodEnd:closeCsrInitFiltD5427dt1
// methodStart:openCsrNextFullD5427dt1
    
/**
******  DECLARE CSR-NEXT-FULL CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******                                                             
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND                                                 
******         (                                                   
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD       = :DDEREF-ICN-SUFX-CD  
******           AND  REF.LN_ID            <= :DDEREF-LN-ID        
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD      <  :DDEREF-ICN-SUFX-CD  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR     <  :DDEREF-INVN-CTL-NBR 
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******             <  :DDEREF-ICN-SUFX-VERS-NBR                    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******             <  :DDEREF-PGM-ID-LST-CHAR-VAL                  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM          <  :DDEREF-PROC-TM    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT          <  :DDEREF-PROC-DT    
******           )                                                 
******         )                                                   
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******       FETCH FIRST  500 ROWS ONLY                            
******    )                                                        
******                                                             
******  SELECT                                                     
******                                                             
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , LNE.AUTH_SRC_ID                                        
******    , LNE.AUTH_PROC_CD                                       
******    , PRV.PROV_NM                                            
******    , PRV.PROV_EOB_NM                                        
******    , PRV.PROV_PRDCT_CD                                      
******    , PRV.PROV_MKT_TYP_CD                                    
******    , PRV.PROV_IPA_ID                                        
******    , PRV.TPSM_CD                                            
******    , PRV.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrNextFullD5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca) throws Exception {
ResultSet csrNextFullResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrNextFullResultSet = db2Base.startQuery(32/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_1316185958)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefLnIdGroup().getDderefLnId(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrNextFullResultSet;
    }
// methodEnd:openCsrNextFullD5427dt1
// methodStart:fetchCsrNextFullD5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-NEXT-FULL                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrNextFullD5427dt1(ResultSet csrNextFullResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrNextFullResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrNextFullResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFullResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFullResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFullResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFullResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFullResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFullResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFullResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFullResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrNextFullResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrNextFullD5427dt1
// methodStart:closeCsrNextFullD5427dt1
    
/**
******    CLOSE CSR-NEXT-FULL                                      
**/
    public void closeCsrNextFullD5427dt1(ResultSet csrNextFullResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrNextFullResultSet,sqlca);

    }
// methodEnd:closeCsrNextFullD5427dt1
// methodStart:openCsrNextFiltD5427dt1
    
/**
******  DECLARE CSR-NEXT-FILT CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND                                                 
******         (                                                   
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD       = :DDEREF-ICN-SUFX-CD  
******           AND  REF.LN_ID            <= :DDEREF-LN-ID        
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD      <  :DDEREF-ICN-SUFX-CD  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR     <  :DDEREF-INVN-CTL-NBR 
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******             <  :DDEREF-ICN-SUFX-VERS-NBR                    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******             <  :DDEREF-PGM-ID-LST-CHAR-VAL                  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM          <  :DDEREF-PROC-TM    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT          <  :DDEREF-PROC-DT    
******           )                                                 
******         )                                                   
******                                                             
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******       FETCH FIRST  500 ROWS ONLY                            
******    )                                                        
******                                                             
******  SELECT                                                     
******                                                             
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , LNE.AUTH_SRC_ID                                        
******    , LNE.AUTH_PROC_CD                                       
******    , PRV.PROV_NM                                            
******    , PRV.PROV_EOB_NM                                        
******    , PRV.PROV_PRDCT_CD                                      
******    , PRV.PROV_MKT_TYP_CD                                    
******    , PRV.PROV_IPA_ID                                        
******    , PRV.TPSM_CD                                            
******    , PRV.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrNextFiltD5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrNextFiltResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrNextFiltResultSet = db2Base.startQuery(36/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_1442873665)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefLnIdGroup().getDderefLnId(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrNextFiltResultSet;
    }
// methodEnd:openCsrNextFiltD5427dt1
// methodStart:fetchCsrNextFiltD5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-NEXT-FILT                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrNextFiltD5427dt1(ResultSet csrNextFiltResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrNextFiltResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrNextFiltResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFiltResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFiltResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFiltResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFiltResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFiltResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFiltResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFiltResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFiltResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrNextFiltResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrNextFiltD5427dt1
// methodStart:closeCsrNextFiltD5427dt1
    
/**
******    CLOSE CSR-NEXT-FILT                                      
**/
    public void closeCsrNextFiltD5427dt1(ResultSet csrNextFiltResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrNextFiltResultSet,sqlca);

    }
// methodEnd:closeCsrNextFiltD5427dt1
// methodStart:openCsrInitFil3D5427dt1
    
/**
******  DECLARE CSR-INIT-FIL3 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      , AUTH_SRC_ID                                          
******      , AUTH_PROC_CD                                         
******      , PROV_NM                                              
******      , PROV_EOB_NM                                          
******      , PROV_PRDCT_CD                                        
******      , PROV_MKT_TYP_CD                                      
******      , PROV_IPA_ID                                          
******      , TPSM_CD                                              
******      , PROV_SPCL_CD                                         
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******          , LNE.AUTH_SRC_ID                                  
******          , LNE.AUTH_PROC_CD                                 
******          , PRV.PROV_NM                                      
******          , PRV.PROV_EOB_NM                                  
******          , PRV.PROV_PRDCT_CD                                
******          , PRV.PROV_MKT_TYP_CD                              
******          , PRV.PROV_IPA_ID                                  
******          , PRV.TPSM_CD                                      
******          , PRV.PROV_SPCL_CD                                 
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******    INNER JOIN ADJD_CLMSF_ORIGHDR ORG                        
******            ON ORG.PARTN_ID          = LNE.PARTN_ID          
******           AND ORG.PARTN_VAL         = LNE.PARTN_VAL         
******           AND ORG.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND ORG.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND ORG.PROC_DT           = LNE.PROC_DT           
******           AND ORG.PROC_TM           = LNE.PROC_TM           
******           AND ORG.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND ORG.LN_CORR_ID        = LNE.ORIG_LN_CORR_ID   
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******    INNER JOIN ADJD_CLMSFLN_ACCUM ACM                        
******            ON REF.PARTN_ID          = ACM.PARTN_ID          
******           AND REF.PARTN_VAL         = ACM.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = ACM.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = ACM.ICN_SUFX_CD       
******           AND REF.PROC_DT           = ACM.PROC_DT           
******           AND REF.PROC_TM           = ACM.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = ACM.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = ACM.LN_ID             
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  BETWEEN           
******                        :HV-PROV-TIN AND :HV-PROV-TIN1       
******         AND REF.RMRK_CD BETWEEN :HV-REMARK-CD1 AND          
******                                  :HV-REMARK-CD2             
******                                                             
******         AND SUBSTR(REF.CAUS_CD,1,1) BETWEEN :HV-CAUSE-CD1   
******                                        AND  :HV-CAUSE-CD2   
******         AND (ORG.UB92_RVNU_CD BETWEEN :HV-REV-FROM          
******                                   AND :HV-REV-THRU)         
******         AND ACM.LN_ACCUM_TYP_CD   = 'OOP'                   
******                                                             
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******         FETCH FIRST  500 ROWS ONLY                          
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , HST.AUTH_SRC_ID                                        
******    , HST.AUTH_PROC_CD                                       
******    , HST.PROV_NM                                            
******    , HST.PROV_EOB_NM                                        
******    , HST.PROV_PRDCT_CD                                      
******    , HST.PROV_MKT_TYP_CD                                    
******    , HST.PROV_IPA_ID                                        
******    , HST.TPSM_CD                                            
******    , HST.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrInitFil3D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrInitFil3ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrInitFil3ResultSet = db2Base.startQuery(40/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_2116954806)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin(),hostVariables.getHvProvTinsuff1Redefined().getHvProvTin1(),hostVariables.getHvRemarkCd1(),hostVariables.getHvRemarkCd2(),hostVariables.getHvCauseCd1(),hostVariables.getHvCauseCd2(),hostVariables.getHvRevFrom(),hostVariables.getHvRevThru())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrInitFil3ResultSet;
    }
// methodEnd:openCsrInitFil3D5427dt1
// methodStart:fetchCsrInitFil3D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-INIT-FIL3                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrInitFil3D5427dt1(ResultSet csrInitFil3ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrInitFil3ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrInitFil3ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil3ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil3ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil3ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil3ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil3ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil3ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil3ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil3ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrInitFil3ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrInitFil3D5427dt1
// methodStart:closeCsrInitFil3D5427dt1
    
/**
******    CLOSE CSR-INIT-FIL3                                      
**/
    public void closeCsrInitFil3D5427dt1(ResultSet csrInitFil3ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrInitFil3ResultSet,sqlca);

    }
// methodEnd:closeCsrInitFil3D5427dt1
// methodStart:openCsrNextFil3D5427dt1
    
/**
******  DECLARE CSR-NEXT-FIL3 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      , AUTH_SRC_ID                                          
******      , AUTH_PROC_CD                                         
******      , PROV_NM                                              
******      , PROV_EOB_NM                                          
******      , PROV_PRDCT_CD                                        
******      , PROV_MKT_TYP_CD                                      
******      , PROV_IPA_ID                                          
******      , TPSM_CD                                              
******      , PROV_SPCL_CD                                         
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******          , LNE.AUTH_SRC_ID                                  
******          , LNE.AUTH_PROC_CD                                 
******          , PRV.PROV_NM                                      
******          , PRV.PROV_EOB_NM                                  
******          , PRV.PROV_PRDCT_CD                                
******          , PRV.PROV_MKT_TYP_CD                              
******          , PRV.PROV_IPA_ID                                  
******          , PRV.TPSM_CD                                      
******          , PRV.PROV_SPCL_CD                                 
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_ORIGHDR ORG                        
******            ON ORG.PARTN_ID          = LNE.PARTN_ID          
******           AND ORG.PARTN_VAL         = LNE.PARTN_VAL         
******           AND ORG.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND ORG.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND ORG.PROC_DT           = LNE.PROC_DT           
******           AND ORG.PROC_TM           = LNE.PROC_TM           
******           AND ORG.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND ORG.LN_CORR_ID        = LNE.ORIG_LN_CORR_ID   
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******    INNER JOIN ADJD_CLMSFLN_ACCUM ACM                        
******            ON REF.PARTN_ID          = ACM.PARTN_ID          
******           AND REF.PARTN_VAL         = ACM.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = ACM.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = ACM.ICN_SUFX_CD       
******           AND REF.PROC_DT           = ACM.PROC_DT           
******           AND REF.PROC_TM           = ACM.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = ACM.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = ACM.LN_ID             
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  BETWEEN           
******                          :HV-PROV-TIN AND :HV-PROV-TIN1     
******                                                             
******         AND REF.RMRK_CD BETWEEN :HV-REMARK-CD1 AND          
******                                  :HV-REMARK-CD2             
******                                                             
******         AND SUBSTR(REF.CAUS_CD,1,1) BETWEEN :HV-CAUSE-CD1   
******                                        AND  :HV-CAUSE-CD2   
******         AND (ORG.UB92_RVNU_CD BETWEEN :HV-REV-FROM          
******                                   AND :HV-REV-THRU)         
******           AND ACM.LN_ACCUM_TYP_CD   = 'OOP'                 
******                                                             
******                                                             
******         AND                                                 
******         (                                                   
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD       = :DDEREF-ICN-SUFX-CD  
******           AND  REF.LN_ID            <= :DDEREF-LN-ID        
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD      <  :DDEREF-ICN-SUFX-CD  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR     <  :DDEREF-INVN-CTL-NBR 
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******             <  :DDEREF-ICN-SUFX-VERS-NBR                    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******             <  :DDEREF-PGM-ID-LST-CHAR-VAL                  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM          <  :DDEREF-PROC-TM    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT          <  :DDEREF-PROC-DT    
******           )                                                 
******         )                                                   
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******       FETCH FIRST  500 ROWS ONLY                            
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , HST.AUTH_SRC_ID                                        
******    , HST.AUTH_PROC_CD                                       
******    , HST.PROV_NM                                            
******    , HST.PROV_EOB_NM                                        
******    , HST.PROV_PRDCT_CD                                      
******    , HST.PROV_MKT_TYP_CD                                    
******    , HST.PROV_IPA_ID                                        
******    , HST.TPSM_CD                                            
******    , HST.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrNextFil3D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrNextFil3ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrNextFil3ResultSet = db2Base.startQuery(44/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_1251727336)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin(),hostVariables.getHvProvTinsuff1Redefined().getHvProvTin1(),hostVariables.getHvRemarkCd1(),hostVariables.getHvRemarkCd2(),hostVariables.getHvCauseCd1(),hostVariables.getHvCauseCd2(),hostVariables.getHvRevFrom(),hostVariables.getHvRevThru(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefLnIdGroup().getDderefLnId(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrNextFil3ResultSet;
    }
// methodEnd:openCsrNextFil3D5427dt1
// methodStart:fetchCsrNextFil3D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-NEXT-FIL3                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrNextFil3D5427dt1(ResultSet csrNextFil3ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrNextFil3ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrNextFil3ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil3ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil3ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil3ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil3ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil3ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil3ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil3ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil3ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrNextFil3ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrNextFil3D5427dt1
// methodStart:closeCsrNextFil3D5427dt1
    
/**
******    CLOSE CSR-NEXT-FIL3                                      
**/
    public void closeCsrNextFil3D5427dt1(ResultSet csrNextFil3ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrNextFil3ResultSet,sqlca);

    }
// methodEnd:closeCsrNextFil3D5427dt1
// methodStart:openCsrInitFil4D5427dt1
    
/**
******  DECLARE CSR-INIT-FIL4 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      , AUTH_SRC_ID                                          
******      , AUTH_PROC_CD                                         
******      , PROV_NM                                              
******      , PROV_EOB_NM                                          
******      , PROV_PRDCT_CD                                        
******      , PROV_MKT_TYP_CD                                      
******      , PROV_IPA_ID                                          
******      , TPSM_CD                                              
******      , PROV_SPCL_CD                                         
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******          , LNE.AUTH_SRC_ID                                  
******          , LNE.AUTH_PROC_CD                                 
******          , PRV.PROV_NM                                      
******          , PRV.PROV_EOB_NM                                  
******          , PRV.PROV_PRDCT_CD                                
******          , PRV.PROV_MKT_TYP_CD                              
******          , PRV.PROV_IPA_ID                                  
******          , PRV.TPSM_CD                                      
******          , PRV.PROV_SPCL_CD                                 
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******    INNER JOIN ADJD_CLMSFLN_ACCUM ACM                        
******            ON REF.PARTN_ID          = ACM.PARTN_ID          
******           AND REF.PARTN_VAL         = ACM.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = ACM.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = ACM.ICN_SUFX_CD       
******           AND REF.PROC_DT           = ACM.PROC_DT           
******           AND REF.PROC_TM           = ACM.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = ACM.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = ACM.LN_ID             
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  BETWEEN           
******                        :HV-PROV-TIN AND :HV-PROV-TIN1       
******         AND REF.RMRK_CD BETWEEN :HV-REMARK-CD1 AND          
******                                  :HV-REMARK-CD2             
******                                                             
******         AND SUBSTR(REF.CAUS_CD,1,1) BETWEEN :HV-CAUSE-CD1   
******                                        AND  :HV-CAUSE-CD2   
******         AND (LNE.ORIG_PROC_CD BETWEEN :HV-CPT-FROM          
******                                   AND :HV-CPT-THRU          
******                     OR                                      
******              LNE.PMT_SVC_CD   BETWEEN :HV-CPT-FROM          
******                                   AND :HV-CPT-THRU)         
******         AND ACM.LN_ACCUM_TYP_CD   = 'OOP'                   
******                                                             
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******         FETCH FIRST  500 ROWS ONLY                          
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , HST.AUTH_SRC_ID                                        
******    , HST.AUTH_PROC_CD                                       
******    , HST.PROV_NM                                            
******    , HST.PROV_EOB_NM                                        
******    , HST.PROV_PRDCT_CD                                      
******    , HST.PROV_MKT_TYP_CD                                    
******    , HST.PROV_IPA_ID                                        
******    , HST.TPSM_CD                                            
******    , HST.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrInitFil4D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrInitFil4ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrInitFil4ResultSet = db2Base.startQuery(48/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_59911343)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin(),hostVariables.getHvProvTinsuff1Redefined().getHvProvTin1(),hostVariables.getHvRemarkCd1(),hostVariables.getHvRemarkCd2(),hostVariables.getHvCauseCd1(),hostVariables.getHvCauseCd2(),hostVariables.getHvCptFrom(),hostVariables.getHvCptThru(),hostVariables.getHvCptFrom(),hostVariables.getHvCptThru())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrInitFil4ResultSet;
    }
// methodEnd:openCsrInitFil4D5427dt1
// methodStart:fetchCsrInitFil4D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-INIT-FIL4                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrInitFil4D5427dt1(ResultSet csrInitFil4ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrInitFil4ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrInitFil4ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil4ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil4ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil4ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil4ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil4ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil4ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil4ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil4ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrInitFil4ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrInitFil4D5427dt1
// methodStart:closeCsrInitFil4D5427dt1
    
/**
******    CLOSE CSR-INIT-FIL4                                      
**/
    public void closeCsrInitFil4D5427dt1(ResultSet csrInitFil4ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrInitFil4ResultSet,sqlca);

    }
// methodEnd:closeCsrInitFil4D5427dt1
// methodStart:openCsrNextFil4D5427dt1
    
/**
******  DECLARE CSR-NEXT-FIL4 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      , AUTH_SRC_ID                                          
******      , AUTH_PROC_CD                                         
******      , PROV_NM                                              
******      , PROV_EOB_NM                                          
******      , PROV_PRDCT_CD                                        
******      , PROV_MKT_TYP_CD                                      
******      , PROV_IPA_ID                                          
******      , TPSM_CD                                              
******      , PROV_SPCL_CD                                         
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******          , LNE.AUTH_SRC_ID                                  
******          , LNE.AUTH_PROC_CD                                 
******          , PRV.PROV_NM                                      
******          , PRV.PROV_EOB_NM                                  
******          , PRV.PROV_PRDCT_CD                                
******          , PRV.PROV_MKT_TYP_CD                              
******          , PRV.PROV_IPA_ID                                  
******          , PRV.TPSM_CD                                      
******          , PRV.PROV_SPCL_CD                                 
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******    INNER JOIN ADJD_CLMSFLN_ACCUM ACM                        
******            ON REF.PARTN_ID          = ACM.PARTN_ID          
******           AND REF.PARTN_VAL         = ACM.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = ACM.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = ACM.ICN_SUFX_CD       
******           AND REF.PROC_DT           = ACM.PROC_DT           
******           AND REF.PROC_TM           = ACM.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = ACM.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = ACM.LN_ID             
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  BETWEEN           
******                          :HV-PROV-TIN AND :HV-PROV-TIN1     
******                                                             
******         AND REF.RMRK_CD BETWEEN :HV-REMARK-CD1 AND          
******                                  :HV-REMARK-CD2             
******                                                             
******         AND SUBSTR(REF.CAUS_CD,1,1) BETWEEN :HV-CAUSE-CD1   
******                                        AND  :HV-CAUSE-CD2   
******         AND (LNE.ORIG_PROC_CD BETWEEN :HV-CPT-FROM          
******                                   AND :HV-CPT-THRU          
******                       OR                                    
******              LNE.PMT_SVC_CD   BETWEEN :HV-CPT-FROM          
******                                   AND :HV-CPT-THRU)         
******           AND ACM.LN_ACCUM_TYP_CD   = 'OOP'                 
******                                                             
******                                                             
******         AND                                                 
******         (                                                   
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD       = :DDEREF-ICN-SUFX-CD  
******           AND  REF.LN_ID            <= :DDEREF-LN-ID        
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD      <  :DDEREF-ICN-SUFX-CD  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR     <  :DDEREF-INVN-CTL-NBR 
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******             <  :DDEREF-ICN-SUFX-VERS-NBR                    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******             <  :DDEREF-PGM-ID-LST-CHAR-VAL                  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM          <  :DDEREF-PROC-TM    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT          <  :DDEREF-PROC-DT    
******           )                                                 
******         )                                                   
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******       FETCH FIRST  500 ROWS ONLY                            
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , HST.AUTH_SRC_ID                                        
******    , HST.AUTH_PROC_CD                                       
******    , HST.PROV_NM                                            
******    , HST.PROV_EOB_NM                                        
******    , HST.PROV_PRDCT_CD                                      
******    , HST.PROV_MKT_TYP_CD                                    
******    , HST.PROV_IPA_ID                                        
******    , HST.TPSM_CD                                            
******    , HST.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrNextFil4D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrNextFil4ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrNextFil4ResultSet = db2Base.startQuery(52/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_682005103)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin(),hostVariables.getHvProvTinsuff1Redefined().getHvProvTin1(),hostVariables.getHvRemarkCd1(),hostVariables.getHvRemarkCd2(),hostVariables.getHvCauseCd1(),hostVariables.getHvCauseCd2(),hostVariables.getHvCptFrom(),hostVariables.getHvCptThru(),hostVariables.getHvCptFrom(),hostVariables.getHvCptThru(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefLnIdGroup().getDderefLnId(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrNextFil4ResultSet;
    }
// methodEnd:openCsrNextFil4D5427dt1
// methodStart:fetchCsrNextFil4D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-NEXT-FIL4                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrNextFil4D5427dt1(ResultSet csrNextFil4ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrNextFil4ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrNextFil4ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil4ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil4ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil4ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil4ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil4ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil4ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil4ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil4ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrNextFil4ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrNextFil4D5427dt1
// methodStart:closeCsrNextFil4D5427dt1
    
/**
******    CLOSE CSR-NEXT-FIL4                                      
**/
    public void closeCsrNextFil4D5427dt1(ResultSet csrNextFil4ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrNextFil4ResultSet,sqlca);

    }
// methodEnd:closeCsrNextFil4D5427dt1
// methodStart:openCsrInitFil5D5427dt1
    
/**
******  DECLARE CSR-INIT-FIL5 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      , AUTH_SRC_ID                                          
******      , AUTH_PROC_CD                                         
******      , PROV_NM                                              
******      , PROV_EOB_NM                                          
******      , PROV_PRDCT_CD                                        
******      , PROV_MKT_TYP_CD                                      
******      , PROV_IPA_ID                                          
******      , TPSM_CD                                              
******      , PROV_SPCL_CD                                         
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******          , LNE.AUTH_SRC_ID                                  
******          , LNE.AUTH_PROC_CD                                 
******          , PRV.PROV_NM                                      
******          , PRV.PROV_EOB_NM                                  
******          , PRV.PROV_PRDCT_CD                                
******          , PRV.PROV_MKT_TYP_CD                              
******          , PRV.PROV_IPA_ID                                  
******          , PRV.TPSM_CD                                      
******          , PRV.PROV_SPCL_CD                                 
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******    INNER JOIN ADJD_CLMSF_ORIGHDR ORG                        
******            ON ORG.PARTN_ID          = LNE.PARTN_ID          
******           AND ORG.PARTN_VAL         = LNE.PARTN_VAL         
******           AND ORG.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND ORG.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND ORG.PROC_DT           = LNE.PROC_DT           
******           AND ORG.PROC_TM           = LNE.PROC_TM           
******           AND ORG.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND ORG.LN_CORR_ID        = LNE.ORIG_LN_CORR_ID   
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  BETWEEN           
******                        :HV-PROV-TIN AND :HV-PROV-TIN1       
******         AND REF.RMRK_CD BETWEEN :HV-REMARK-CD1 AND          
******                                  :HV-REMARK-CD2             
******                                                             
******         AND SUBSTR(REF.CAUS_CD,1,1) BETWEEN :HV-CAUSE-CD1   
******                                        AND  :HV-CAUSE-CD2   
******         AND (ORG.UB92_RVNU_CD BETWEEN :HV-REV-FROM          
******                                   AND :HV-REV-THRU)         
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******         FETCH FIRST  500 ROWS ONLY                          
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , HST.AUTH_SRC_ID                                        
******    , HST.AUTH_PROC_CD                                       
******    , HST.PROV_NM                                            
******    , HST.PROV_EOB_NM                                        
******    , HST.PROV_PRDCT_CD                                      
******    , HST.PROV_MKT_TYP_CD                                    
******    , HST.PROV_IPA_ID                                        
******    , HST.TPSM_CD                                            
******    , HST.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrInitFil5D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrInitFil5ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrInitFil5ResultSet = db2Base.startQuery(56/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_78870721)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin(),hostVariables.getHvProvTinsuff1Redefined().getHvProvTin1(),hostVariables.getHvRemarkCd1(),hostVariables.getHvRemarkCd2(),hostVariables.getHvCauseCd1(),hostVariables.getHvCauseCd2(),hostVariables.getHvRevFrom(),hostVariables.getHvRevThru())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrInitFil5ResultSet;
    }
// methodEnd:openCsrInitFil5D5427dt1
// methodStart:fetchCsrInitFil5D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-INIT-FIL5                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrInitFil5D5427dt1(ResultSet csrInitFil5ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrInitFil5ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrInitFil5ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil5ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil5ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil5ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil5ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil5ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil5ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil5ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil5ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrInitFil5ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrInitFil5D5427dt1
// methodStart:closeCsrInitFil5D5427dt1
    
/**
******    CLOSE CSR-INIT-FIL5                                      
**/
    public void closeCsrInitFil5D5427dt1(ResultSet csrInitFil5ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrInitFil5ResultSet,sqlca);

    }
// methodEnd:closeCsrInitFil5D5427dt1
// methodStart:openCsrNextFil5D5427dt1
    
/**
******  DECLARE CSR-NEXT-FIL5 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      , AUTH_SRC_ID                                          
******      , AUTH_PROC_CD                                         
******      , PROV_NM                                              
******      , PROV_EOB_NM                                          
******      , PROV_PRDCT_CD                                        
******      , PROV_MKT_TYP_CD                                      
******      , PROV_IPA_ID                                          
******      , TPSM_CD                                              
******      , PROV_SPCL_CD                                         
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******          , LNE.AUTH_SRC_ID                                  
******          , LNE.AUTH_PROC_CD                                 
******          , PRV.PROV_NM                                      
******          , PRV.PROV_EOB_NM                                  
******          , PRV.PROV_PRDCT_CD                                
******          , PRV.PROV_MKT_TYP_CD                              
******          , PRV.PROV_IPA_ID                                  
******          , PRV.TPSM_CD                                      
******          , PRV.PROV_SPCL_CD                                 
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_ORIGHDR ORG                        
******            ON ORG.PARTN_ID          = LNE.PARTN_ID          
******           AND ORG.PARTN_VAL         = LNE.PARTN_VAL         
******           AND ORG.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND ORG.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND ORG.PROC_DT           = LNE.PROC_DT           
******           AND ORG.PROC_TM           = LNE.PROC_TM           
******           AND ORG.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND ORG.LN_CORR_ID        = LNE.ORIG_LN_CORR_ID   
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  BETWEEN           
******                          :HV-PROV-TIN AND :HV-PROV-TIN1     
******                                                             
******         AND REF.RMRK_CD BETWEEN :HV-REMARK-CD1 AND          
******                                  :HV-REMARK-CD2             
******                                                             
******         AND SUBSTR(REF.CAUS_CD,1,1) BETWEEN :HV-CAUSE-CD1   
******                                        AND  :HV-CAUSE-CD2   
******         AND (ORG.UB92_RVNU_CD BETWEEN :HV-REV-FROM          
******                                   AND :HV-REV-THRU)         
******         AND                                                 
******         (                                                   
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD       = :DDEREF-ICN-SUFX-CD  
******           AND  REF.LN_ID            <= :DDEREF-LN-ID        
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD      <  :DDEREF-ICN-SUFX-CD  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR     <  :DDEREF-INVN-CTL-NBR 
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******             <  :DDEREF-ICN-SUFX-VERS-NBR                    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******             <  :DDEREF-PGM-ID-LST-CHAR-VAL                  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM          <  :DDEREF-PROC-TM    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT          <  :DDEREF-PROC-DT    
******           )                                                 
******         )                                                   
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******       FETCH FIRST  500 ROWS ONLY                            
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , HST.AUTH_SRC_ID                                        
******    , HST.AUTH_PROC_CD                                       
******    , HST.PROV_NM                                            
******    , HST.PROV_EOB_NM                                        
******    , HST.PROV_PRDCT_CD                                      
******    , HST.PROV_MKT_TYP_CD                                    
******    , HST.PROV_IPA_ID                                        
******    , HST.TPSM_CD                                            
******    , HST.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrNextFil5D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrNextFil5ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrNextFil5ResultSet = db2Base.startQuery(60/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_439713759)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin(),hostVariables.getHvProvTinsuff1Redefined().getHvProvTin1(),hostVariables.getHvRemarkCd1(),hostVariables.getHvRemarkCd2(),hostVariables.getHvCauseCd1(),hostVariables.getHvCauseCd2(),hostVariables.getHvRevFrom(),hostVariables.getHvRevThru(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefLnIdGroup().getDderefLnId(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrNextFil5ResultSet;
    }
// methodEnd:openCsrNextFil5D5427dt1
// methodStart:fetchCsrNextFil5D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-NEXT-FIL5                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrNextFil5D5427dt1(ResultSet csrNextFil5ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrNextFil5ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrNextFil5ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil5ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil5ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil5ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil5ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil5ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil5ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil5ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil5ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrNextFil5ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrNextFil5D5427dt1
// methodStart:closeCsrNextFil5D5427dt1
    
/**
******    CLOSE CSR-NEXT-FIL5                                      
**/
    public void closeCsrNextFil5D5427dt1(ResultSet csrNextFil5ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrNextFil5ResultSet,sqlca);

    }
// methodEnd:closeCsrNextFil5D5427dt1
// methodStart:openCsrInitFil6D5427dt1
    
/**
******  DECLARE CSR-INIT-FIL6 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      , AUTH_SRC_ID                                          
******      , AUTH_PROC_CD                                         
******      , PROV_NM                                              
******      , PROV_EOB_NM                                          
******      , PROV_PRDCT_CD                                        
******      , PROV_MKT_TYP_CD                                      
******      , PROV_IPA_ID                                          
******      , TPSM_CD                                              
******      , PROV_SPCL_CD                                         
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******          , LNE.AUTH_SRC_ID                                  
******          , LNE.AUTH_PROC_CD                                 
******          , PRV.PROV_NM                                      
******          , PRV.PROV_EOB_NM                                  
******          , PRV.PROV_PRDCT_CD                                
******          , PRV.PROV_MKT_TYP_CD                              
******          , PRV.PROV_IPA_ID                                  
******          , PRV.TPSM_CD                                      
******          , PRV.PROV_SPCL_CD                                 
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  BETWEEN           
******                        :HV-PROV-TIN AND :HV-PROV-TIN1       
******         AND REF.RMRK_CD BETWEEN :HV-REMARK-CD1 AND          
******                                  :HV-REMARK-CD2             
******                                                             
******         AND SUBSTR(REF.CAUS_CD,1,1) BETWEEN :HV-CAUSE-CD1   
******                                        AND  :HV-CAUSE-CD2   
******         AND (LNE.ORIG_PROC_CD BETWEEN :HV-CPT-FROM          
******                                   AND :HV-CPT-THRU          
******                     OR                                      
******              LNE.PMT_SVC_CD   BETWEEN :HV-CPT-FROM          
******                                   AND :HV-CPT-THRU)         
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******         FETCH FIRST  500 ROWS ONLY                          
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , HST.AUTH_SRC_ID                                        
******    , HST.AUTH_PROC_CD                                       
******    , HST.PROV_NM                                            
******    , HST.PROV_EOB_NM                                        
******    , HST.PROV_PRDCT_CD                                      
******    , HST.PROV_MKT_TYP_CD                                    
******    , HST.PROV_IPA_ID                                        
******    , HST.TPSM_CD                                            
******    , HST.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrInitFil6D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrInitFil6ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrInitFil6ResultSet = db2Base.startQuery(64/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_1335479062)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin(),hostVariables.getHvProvTinsuff1Redefined().getHvProvTin1(),hostVariables.getHvRemarkCd1(),hostVariables.getHvRemarkCd2(),hostVariables.getHvCauseCd1(),hostVariables.getHvCauseCd2(),hostVariables.getHvCptFrom(),hostVariables.getHvCptThru(),hostVariables.getHvCptFrom(),hostVariables.getHvCptThru())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrInitFil6ResultSet;
    }
// methodEnd:openCsrInitFil6D5427dt1
// methodStart:fetchCsrInitFil6D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-INIT-FIL6                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrInitFil6D5427dt1(ResultSet csrInitFil6ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrInitFil6ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrInitFil6ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil6ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil6ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil6ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil6ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil6ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil6ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrInitFil6ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrInitFil6ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrInitFil6ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrInitFil6D5427dt1
// methodStart:closeCsrInitFil6D5427dt1
    
/**
******    CLOSE CSR-INIT-FIL6                                      
**/
    public void closeCsrInitFil6D5427dt1(ResultSet csrInitFil6ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrInitFil6ResultSet,sqlca);

    }
// methodEnd:closeCsrInitFil6D5427dt1
// methodStart:openCsrNextFil6D5427dt1
    
/**
******  DECLARE CSR-NEXT-FIL6 CURSOR WITH ROWSET POSITIONING FOR   
******    WITH  CLM_HST_TABLE                                      
******      (                                                      
******        PARTN_ID                                             
******      , PARTN_VAL                                            
******      , PROC_DT                                              
******      , PROC_TM                                              
******      , ICN_SUFX_VERS_NBR                                    
******      , INVN_CTL_NBR                                         
******      , ICN_SUFX_CD                                          
******      , AUTH_SRC_ID                                          
******      , AUTH_PROC_CD                                         
******      , PROV_NM                                              
******      , PROV_EOB_NM                                          
******      , PROV_PRDCT_CD                                        
******      , PROV_MKT_TYP_CD                                      
******      , PROV_IPA_ID                                          
******      , TPSM_CD                                              
******      , PROV_SPCL_CD                                         
******      )                                                      
******   AS (                                                      
******        SELECT DISTINCT                                      
******            REF.PARTN_ID                                     
******          , REF.PARTN_VAL                                    
******          , REF.PROC_DT                                      
******          , REF.PROC_TM                                      
******          , REF.ICN_SUFX_VERS_NBR                            
******          , REF.INVN_CTL_NBR                                 
******          , REF.ICN_SUFX_CD                                  
******          , LNE.AUTH_SRC_ID                                  
******          , LNE.AUTH_PROC_CD                                 
******          , PRV.PROV_NM                                      
******          , PRV.PROV_EOB_NM                                  
******          , PRV.PROV_PRDCT_CD                                
******          , PRV.PROV_MKT_TYP_CD                              
******          , PRV.PROV_IPA_ID                                  
******          , PRV.TPSM_CD                                      
******          , PRV.PROV_SPCL_CD                                 
******                                                             
******        FROM ADJD_CLMHST_DENORM_REF REF                      
******                                                             
******    INNER JOIN ADJD_CLMSF_LN LNE                             
******            ON REF.PARTN_ID          = LNE.PARTN_ID          
******           AND REF.PARTN_VAL         = LNE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = LNE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = LNE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = LNE.PROC_DT           
******           AND REF.PROC_TM           = LNE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = LNE.LN_ID             
******                                                             
******    INNER JOIN ADJD_CLMSF_PROV    PRV                        
******            ON REF.PARTN_ID          = PRV.PARTN_ID          
******           AND REF.PARTN_VAL         = PRV.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = PRV.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = PRV.ICN_SUFX_CD       
******           AND REF.PROC_DT           = PRV.PROC_DT           
******           AND REF.PROC_TM           = PRV.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR 
******           AND REF.PROV_SCRN_NBR     = PRV.PROV_SEQ_NBR      
******                                                             
******       WHERE                                                 
******              REF.POL_NBR                = :DDEREF-POL-NBR   
******         AND  REF.EE_ID                  = :DDEREF-EE-ID     
******         AND  REF.DEPN_NBR               = :DDEREF-DEPN-NBR  
******                                                             
******         AND :HV-LST-SRVC-DT >= REF.FST_DT                   
******         AND :HV-FST-DT      <= REF.LST_SRVC_DT              
******                                                             
******         AND SUBSTR(REF.PROV_TINSUFF,2,9)  BETWEEN           
******                          :HV-PROV-TIN AND :HV-PROV-TIN1     
******                                                             
******         AND REF.RMRK_CD BETWEEN :HV-REMARK-CD1 AND          
******                                  :HV-REMARK-CD2             
******                                                             
******         AND SUBSTR(REF.CAUS_CD,1,1) BETWEEN :HV-CAUSE-CD1   
******                                        AND  :HV-CAUSE-CD2   
******         AND (LNE.ORIG_PROC_CD BETWEEN :HV-CPT-FROM          
******                                   AND :HV-CPT-THRU          
******                       OR                                    
******              LNE.PMT_SVC_CD   BETWEEN :HV-CPT-FROM          
******                                   AND :HV-CPT-THRU)         
******                                                             
******         AND                                                 
******         (                                                   
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD       = :DDEREF-ICN-SUFX-CD  
******           AND  REF.LN_ID            <= :DDEREF-LN-ID        
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR      = :DDEREF-INVN-CTL-NBR 
******           AND  REF.ICN_SUFX_CD      <  :DDEREF-ICN-SUFX-CD  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******              = :DDEREF-ICN-SUFX-VERS-NBR                    
******           AND  REF.INVN_CTL_NBR     <  :DDEREF-INVN-CTL-NBR 
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******              = :DDEREF-PGM-ID-LST-CHAR-VAL                  
******             AND  REF.ICN_SUFX_VERS_NBR                      
******             <  :DDEREF-ICN-SUFX-VERS-NBR                    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM           = :DDEREF-PROC-TM    
******             AND  REF.PGM_ID_LST_CHAR_VAL                    
******             <  :DDEREF-PGM-ID-LST-CHAR-VAL                  
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT           = :DDEREF-PROC-DT    
******             AND  REF.PROC_TM          <  :DDEREF-PROC-TM    
******           )                                                 
******          OR                                                 
******           (      REF.PROC_DT          <  :DDEREF-PROC-DT    
******           )                                                 
******         )                                                   
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******                                                             
******       FETCH FIRST  500 ROWS ONLY                            
******    )                                                        
******                                                             
******  SELECT                                                     
******      REF.PARTN_ID                                           
******    , REF.PARTN_VAL                                          
******    , REF.PROC_DT                                            
******    , REF.PROC_TM                                            
******    , REF.PGM_ID_LST_CHAR_VAL                                
******    , REF.ICN_SUFX_VERS_NBR                                  
******    , REF.INVN_CTL_NBR                                       
******    , REF.ICN_SUFX_CD                                        
******    , REF.LN_ID                                              
******                                                             
******    , REF.FLN_JULIAN_DT_NBR                                  
******    , REF.FLN_SRL_NBR                                        
******    , REF.DFT_NBR                                            
******    , REF.FST_DT                                             
******    , REF.LST_SRVC_DT                                        
******    , REF.PROV_TINSUFF                                       
******                                                             
******    , REF.PROV_SCRN_NBR                                      
******    , REF.CHRG_AMT                                           
******    , REF.RMRK_CD                                            
******    , REF.NC_AMT                                             
******    , REF.PMT_SVC_CD                                         
******    , REF.OVR_CD                                             
******    , REF.COPAY_AMT                                          
******    , REF.SRVC_CD                                            
******    , REF.PAY_CD                                             
******    , REF.TRANS_CD                                           
******    , HDR.FILM_OFC_NBR                                       
******    , HDR.CLM_LVL_RSN_CD                                     
******    , HDR.ADJTR_ID                                           
******    , HDR.MBR_PRV_IND                                        
******    , HDR.NTFY_WAIV_CD                                       
******    , HDR.BANK_CD                                            
******    , HDR.DIV_NBR                                            
******    , HDR.CLS_NBR                                            
******    , HDR.DRG_NBR                                            
******    , HDR.FACL_OR_PROF_CD                                    
******    , BKE.DLGT_ENTY_CD                                       
******    , BK2.NDB_CONTR_ID                                       
******    , BK2.CLM_SMB_TYP_APP_CD                                 
******    , BK2.SMB_ST_CD                                          
******    , DLN.PROC_T1_IND                                        
******    , DLN.AUTH_NBR                                           
******    , DLN.BASE_DED_DESC_TXT                                  
******    , DLN.MM_DED_DESC_TXT                                    
******    , DLN.PRS_CREAT_SRC_CD                                   
******    , DLN.BASE_DED_AMT                                       
******    , DLN.BASE_AMT                                           
******    , DLN.MM_DED_AMT                                         
******    , DLN.MM_AMT                                             
******    , DLN.MC_CR_RES_AMT                                      
******    , DLN.COB_CR_RES_AMT                                     
******    , DLN.PAR_IND                                            
******    , DLN.SUP_AMT                                            
******    , DLN.PROV_MKT_NBR                                       
******    , DLN.PPO_CD                                             
******    , DLN.PTNT_RESP_AMT                                      
******    , HST.AUTH_SRC_ID                                        
******    , HST.AUTH_PROC_CD                                       
******    , HST.PROV_NM                                            
******    , HST.PROV_EOB_NM                                        
******    , HST.PROV_PRDCT_CD                                      
******    , HST.PROV_MKT_TYP_CD                                    
******    , HST.PROV_IPA_ID                                        
******    , HST.TPSM_CD                                            
******    , HST.PROV_SPCL_CD                                       
******    , IFNULL(                                                
******     (SELECT PR1.PROV_MEDCD_RECLM_IND                        
******        FROM ADJD_CLMSF_PROV PR1                             
******       WHERE REF.PARTN_ID          = PR1.PARTN_ID            
******         AND REF.PARTN_VAL         = PR1.PARTN_VAL           
******         AND REF.INVN_CTL_NBR      = PR1.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = PR1.ICN_SUFX_CD         
******         AND REF.PROC_DT           = PR1.PROC_DT             
******         AND REF.PROC_TM           = PR1.PROC_TM             
******         AND PR1.PROV_MEDCD_RECLM_IND = 'Y'                  
******          ORDER BY LST_UPDT_DTTM DESC                        
******        FETCH FIRST 1 ROW ONLY)                              
******     ,' ')                                                   
******    , IFNULL(                                                
******             ( SELECT REL.REL_SRVC_CLM_LVL_IND               
******                 FROM ADJD_CLMSFLN_REL_SRVCS REL             
******                WHERE REF.PARTN_ID         = REL.PARTN_ID    
******                 AND REF.PARTN_VAL         = REL.PARTN_VAL   
******                 AND REF.INVN_CTL_NBR      = REL.INVN_CTL_NBR
******                 AND REF.ICN_SUFX_CD       = REL.ICN_SUFX_CD 
******                 AND REF.PROC_DT           = REL.PROC_DT     
******                 AND REF.PROC_TM           = REL.PROC_TM     
******                 AND REF.ICN_SUFX_VERS_NBR                   
******                   = REL.ICN_SUFX_VERS_NBR                   
******                 AND REF.LN_ID             = REL.LN_ID       
******                FETCH FIRST 1 ROWS ONLY )                    
******              ,' ')                                          
******    , IFNULL(DIA.DIAG_CD,'       ')                          
******                                                             
******    ,( SELECT COUNT(DISTINCT AUTH_NBR)                       
******         FROM ADJD_CLMHST_DENORM_LN    DLN2                  
******        WHERE REF.PARTN_ID          = DLN2.PARTN_ID          
******          AND REF.PARTN_VAL         = DLN2.PARTN_VAL         
******          AND REF.INVN_CTL_NBR      = DLN2.INVN_CTL_NBR      
******          AND REF.ICN_SUFX_CD       = DLN2.ICN_SUFX_CD       
******          AND REF.PROC_DT           = DLN2.PROC_DT           
******          AND REF.PROC_TM           = DLN2.PROC_TM           
******          AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR 
******          AND ' '                   < DLN2.AUTH_NBR )        
******                                                             
******    ,( SELECT SUM(PHYS_MEDCN_MSK_CNT)                        
******         FROM ADJD_CLMSF_LN2  LN2                            
******        WHERE REF.PARTN_ID          = LN2.PARTN_ID           
******          AND REF.PARTN_VAL         = LN2.PARTN_VAL          
******          AND REF.INVN_CTL_NBR      = LN2.INVN_CTL_NBR       
******          AND REF.ICN_SUFX_CD       = LN2.ICN_SUFX_CD        
******          AND REF.PROC_DT           = LN2.PROC_DT            
******          AND REF.PROC_TM           = LN2.PROC_TM            
******          AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR) 
******                                                             
******  FROM CLM_HST_TABLE HST                                     
******  INNER JOIN ADJD_CLMHST_DENORM_REF REF                      
******          ON REF.PARTN_ID          = HST.PARTN_ID            
******         AND REF.PARTN_VAL         = HST.PARTN_VAL           
******         AND REF.PROC_DT           = HST.PROC_DT             
******         AND REF.PROC_TM           = HST.PROC_TM             
******         AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR   
******         AND REF.INVN_CTL_NBR      = HST.INVN_CTL_NBR        
******         AND REF.ICN_SUFX_CD       = HST.ICN_SUFX_CD         
******                                                             
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_HDR HDR                    
******            ON REF.PARTN_ID          = HDR.PARTN_ID          
******           AND REF.PARTN_VAL         = HDR.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = HDR.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = HDR.ICN_SUFX_CD       
******           AND REF.PROC_DT           = HDR.PROC_DT           
******           AND REF.PROC_TM           = HDR.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E BKE                          
******            ON REF.PARTN_ID          = BKE.PARTN_ID          
******           AND REF.PARTN_VAL         = BKE.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BKE.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BKE.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BKE.PROC_DT           
******           AND REF.PROC_TM           = BKE.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMSF_BLK_E2 BK2                         
******            ON REF.PARTN_ID          = BK2.PARTN_ID          
******           AND REF.PARTN_VAL         = BK2.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = BK2.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = BK2.ICN_SUFX_CD       
******           AND REF.PROC_DT           = BK2.PROC_DT           
******           AND REF.PROC_TM           = BK2.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR 
******                                                             
******    INNER JOIN ADJD_CLMHST_DENORM_LN DLN                     
******            ON REF.PARTN_ID          = DLN.PARTN_ID          
******           AND REF.PARTN_VAL         = DLN.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DLN.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DLN.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DLN.PROC_DT           
******           AND REF.PROC_TM           = DLN.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR 
******           AND REF.LN_ID             = DLN.LN_ID             
******                                                             
******                                                             
******   LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA 
******            ON REF.PARTN_ID          = DIA.PARTN_ID          
******           AND REF.PARTN_VAL         = DIA.PARTN_VAL         
******           AND REF.INVN_CTL_NBR      = DIA.INVN_CTL_NBR      
******           AND REF.ICN_SUFX_CD       = DIA.ICN_SUFX_CD       
******           AND REF.PROC_DT           = DIA.PROC_DT           
******           AND REF.PROC_TM           = DIA.PROC_TM           
******           AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR 
******           AND 1                     = DIA.DIAG_SEQ_NBR      
******                                                             
******       ORDER BY REF.PROC_DT             DESC                 
******              , REF.PROC_TM             DESC                 
******              , REF.PGM_ID_LST_CHAR_VAL DESC                 
******              , REF.ICN_SUFX_VERS_NBR   DESC                 
******              , REF.INVN_CTL_NBR        DESC                 
******              , REF.ICN_SUFX_CD         DESC                 
******              , REF.LN_ID               DESC                 
******                                                             
******    OPTIMIZE FOR  600 ROWS                                   
******    FETCH FIRST   600 ROWS ONLY                              
******    WITH UR                                                  
**/
    public ResultSet openCsrNextFil6D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception {
ResultSet csrNextFil6ResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csrNextFil6ResultSet = db2Base.startQuery(68/* SQL Sequence*/, CONSTANTS.LITERAL_D5427DT1)
    .withSql(SQLS.SQL_1766582196)
				.withInputs(dcladjdClmhstDenormRef.getDderefPolNbrGroup().getDderefPolNbr(),dcladjdClmhstDenormRef.getDderefEeIdGroup().getDderefEeId(),dcladjdClmhstDenormRef.getDderefDepnNbrGroup().getDderefDepnNbr(),hostVariables.getHvLstSrvcDtGroup().getHvLstSrvcDt(),hostVariables.getHvFstDtGroup().getHvFstDt(),hostVariables.getHvProvTinsuffRedefined().getHvProvTin(),hostVariables.getHvProvTinsuff1Redefined().getHvProvTin1(),hostVariables.getHvRemarkCd1(),hostVariables.getHvRemarkCd2(),hostVariables.getHvCauseCd1(),hostVariables.getHvCauseCd2(),hostVariables.getHvCptFrom(),hostVariables.getHvCptThru(),hostVariables.getHvCptFrom(),hostVariables.getHvCptThru(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefLnIdGroup().getDderefLnId(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefIcnSufxCdGroup().getDderefIcnSufxCd(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefInvnCtlNbrGroup().getDderefInvnCtlNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefIcnSufxVersNbr(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefPgmIdLstCharValGroup().getDderefPgmIdLstCharVal(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt(),dcladjdClmhstDenormRef.getDderefProcTmGroup().getDderefProcTm(),dcladjdClmhstDenormRef.getDderefProcDtGroup().getDderefProcDt())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.SMALLINT,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csrNextFil6ResultSet;
    }
// methodEnd:openCsrNextFil6D5427dt1
// methodStart:fetchCsrNextFil6D5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  CSR-NEXT-FIL6                                      
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchCsrNextFil6D5427dt1(ResultSet csrNextFil6ResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = csrNextFil6ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csrNextFil6ResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil6ResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil6ResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil6ResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil6ResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil6ResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil6ResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = csrNextFil6ResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = csrNextFil6ResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("csrNextFil6ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsrNextFil6D5427dt1
// methodStart:closeCsrNextFil6D5427dt1
    
/**
******    CLOSE CSR-NEXT-FIL6                                      
**/
    public void closeCsrNextFil6D5427dt1(ResultSet csrNextFil6ResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csrNextFil6ResultSet,sqlca);

    }
// methodEnd:closeCsrNextFil6D5427dt1
// methodStart:openDt1DynCursorD5427dt1
    
/**
******  DECLARE DT1-DYN-CURSOR  CURSOR WITH ROWSET POSITIONING     
******    FOR DT1-DYN-QUERY                                        
**/
    public ResultSet openDt1DynCursorD5427dt1(Field sqlda, Sqlca sqlca) throws Exception {
ResultSet dt1DynCursorResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
    dt1DynCursorResultSet = db2Base.sqlOpen("DT1-DYN-QUERY",CONSTANTS.LITERAL_D5427DT1, sqlda);
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return dt1DynCursorResultSet;
    }
// methodEnd:openDt1DynCursorD5427dt1
// methodStart:fetchDt1DynCursorD5427dt1
    
/**
******  FETCH   NEXT ROWSET                                        
******    FROM  DT1-DYN-CURSOR                                     
******     FOR :FETCH-ROWSET-MAX     ROWS                          
******                                                             
******    INTO                                                     
******        :HVA-PARTN-ID                                        
******      , :HVA-PARTN-VAL                                       
******      , :HVA-PROC-DT                                         
******      , :HVA-PROC-TM                                         
******      , :HVA-PGM-ID-LST-CHAR-VAL                             
******      , :HVA-ICN-SUFX-VERS-NBR                               
******      , :HVA-INVN-CTL-NBR                                    
******      , :HVA-ICN-SUFX-CD                                     
******      , :HVA-LN-ID                                           
******      , :HVA-FLN-JULIAN-DT-NBR                               
******      , :HVA-FLN-SRL-NBR                                     
******      , :HVA-DFT-NBR                                         
******      , :HVA-FST-DT                                          
******      , :HVA-LST-SRVC-DT                                     
******      , :HVA-PROV-TINSUFF                                    
******      , :HVA-PROV-SCRN-NBR                                   
******      , :HVA-CHRG-AMT                                        
******      , :HVA-RMRK-CD                                         
******      , :HVA-NC-AMT                                          
******      , :HVA-PMT-SVC-CD                                      
******      , :HVA-OVR-CD                                          
******      , :HVA-COPAY-AMT                                       
******      , :HVA-SRVC-CD                                         
******      , :HVA-PAY-CD                                          
******      , :HVA-TRANS-CD                                        
******      , :HVA-FILM-OFC-NBR                                    
******      , :HVA-CLM-LVL-RSN-CD                                  
******      , :HVA-ADJTR-ID                                        
******      , :HVA-MBR-PRV-IND                                     
******      , :HVA-NTFY-WAIV-CD                                    
******      , :HVA-BANK-CD                                         
******      , :HVA-DIV-NBR                                         
******      , :HVA-CLS-NBR                                         
******      , :HVA-DRG-NBR                                         
******      , :HVA-FACL-OR-PROF-CD                                 
******      , :HVA-DLGTE-IND                                       
******      , :HVA-NDB-CONTR-ID                                    
******      , :HVA-CLM-SMB-TYP-APP-CD                              
******      , :HVA-SMB-ST-CD                                       
******      , :HVA-PROC-T1-IND                                     
******      , :HVA-AUTH-NBR                                        
******      , :HVA-BASE-DED-DESC-TXT                               
******      , :HVA-MM-DED-DESC-TXT                                 
******      , :HVA-PRS-CREAT-SRC-CD                                
******      , :HVA-BASE-DED-AMT                                    
******      , :HVA-BASE-AMT                                        
******      , :HVA-MM-DED-AMT                                      
******      , :HVA-MM-AMT                                          
******      , :HVA-MC-CR-RES-AMT                                   
******      , :HVA-COB-CR-RES-AMT                                  
******      , :HVA-PAR-IND                                         
******      , :HVA-SUP-AMT                                         
******      , :HVA-PROV-MKT-NBR                                    
******      , :HVA-PPO-CD                                          
******      , :HVA-PTNT-RESP-AMT                                   
******      , :HVA-AUTH-SRC-ID                                     
******      , :HVA-AUTH-PROC-CD                                    
******      , :HVA-PROV-NM                                         
******      , :HVA-PROV-EOB-NM                                     
******      , :HVA-PROV-PRDCT-CD                                   
******      , :HVA-PROV-MKT-TYP-CD                                 
******      , :HVA-PROV-IPA-ID                                     
******      , :HVA-TPSM-CD                                         
******      , :HVA-PROV-SPCL-CD                                    
******      , :HVA-PROV-MEDCD-RECLM-IND                            
******      , :HVA-REL-SRVC-CLM-LVL-IND                            
******      , :HVA-DIAG-CD                                         
******      , :HVA-AUTH-UNIQ-CNT                                   
******      , :HVA-PHYS-MEDCN-MSK-CNT:HVA-MSK-NULL-IND             
******                                                             
**/
    public void fetchDt1DynCursorD5427dt1(ResultSet dt1DynCursorResultSet, Work work, Sqlca sqlca, HvaClmHistArray hvaClmHistArray) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < work.getFetchRowsetMax()) {
       hasResults = dt1DynCursorResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = dt1DynCursorResultSet.getObject(1);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPartnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = dt1DynCursorResultSet.getString(2);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaPartnVal(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = dt1DynCursorResultSet.getString(3);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = dt1DynCursorResultSet.getString(4);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaProcTm(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(5);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPgmIdLstCharVal(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(6);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxVersNbr(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = dt1DynCursorResultSet.getString(7);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaInvnCtlNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(8);
 if (resultObj != null) {
   hvaClmHistArray.setHvaIcnSufxCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(9);
 if (resultObj != null) {
   hvaClmHistArray.setHvaLnId(ftchRowCnt,(short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(10);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnJulianDtNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(11);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFlnSrlNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(12);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDftNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = dt1DynCursorResultSet.getString(13);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaFstDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = dt1DynCursorResultSet.getString(14);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaLstSrvcDt(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(15);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvTinsuff(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(16);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvScrnNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaChrgAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(18);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRmrkCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(19);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaNcAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaNcAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(20);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPmtSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(21);
 if (resultObj != null) {
   hvaClmHistArray.setHvaOvrCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(22);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCopayAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(23);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSrvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(24);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPayCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(25);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTransCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(26);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFilmOfcNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(27);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmLvlRsnCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(28);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAdjtrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(29);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMbrPrvInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(30);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNtfyWaivCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(31);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBankCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(32);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDivNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(33);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClsNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(34);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDrgNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(35);
 if (resultObj != null) {
   hvaClmHistArray.setHvaFaclOrProfCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(36);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDlgteInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(37);
 if (resultObj != null) {
   hvaClmHistArray.setHvaNdbContrId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(38);
 if (resultObj != null) {
   hvaClmHistArray.setHvaClmSmbTypAppCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(39);
 if (resultObj != null) {
   hvaClmHistArray.setHvaSmbStCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(40);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProcT1Ind(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = dt1DynCursorResultSet.getString(41);
 if (resultObjString != null) {
   hvaClmHistArray.setHvaAuthNbr(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(42);
 if (resultObj != null) {
   hvaClmHistArray.setHvaBaseDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(43);
 if (resultObj != null) {
   hvaClmHistArray.setHvaMmDedDescTxt(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(44);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPrsCreatSrcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(45);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(46);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaBaseAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(47);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmDedAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(48);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMmAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMmAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(49);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaMcCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(50);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaCobCrResAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(51);
 if (resultObj != null) {
   hvaClmHistArray.setHvaParInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(52);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaSupAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaSupAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(53);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktNbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(54);
 if (resultObj != null) {
   hvaClmHistArray.setHvaPpoCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(55);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaPtntRespAmt(ftchRowCnt, new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(56);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthSrcId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(57);
 if (resultObj != null) {
   hvaClmHistArray.setHvaAuthProcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(58);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(59);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvEobNm(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(60);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvPrdctCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(61);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMktTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(62);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvIpaId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(63);
 if (resultObj != null) {
   hvaClmHistArray.setHvaTpsmCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(64);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvSpclCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(65);
 if (resultObj != null) {
   hvaClmHistArray.setHvaProvMedcdReclmInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(66);
 if (resultObj != null) {
   hvaClmHistArray.setHvaRelSrvcClmLvlInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(67);
 if (resultObj != null) {
   hvaClmHistArray.setHvaDiagCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(68);
 if (resultObj != null) {
   try {   
   hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        hvaClmHistArray.setHvaAuthUniqCnt(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = dt1DynCursorResultSet.getObject(69);
 if (resultObj != null) {   
   hvaClmHistArray.setHvaPhysMedcnMskCnt(ftchRowCnt,((Integer) resultObj).intValue());hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
if (hvaClmHistArray.getHvaMskNullInd(ftchRowCnt) != 0) hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, 0);
 } else hvaClmHistArray.setHvaMskNullInd(ftchRowCnt, -1);
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("dt1DynCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchDt1DynCursorD5427dt1
// methodStart:closeDt1DynCursorD5427dt1
    
/**
******    CLOSE DT1-DYN-CURSOR                                     
**/
    public void closeDt1DynCursorD5427dt1(ResultSet dt1DynCursorResultSet, Sqlca sqlca) throws Exception {

	closeCursor(dt1DynCursorResultSet,sqlca);

    }
// methodEnd:closeDt1DynCursorD5427dt1
// methodStart:fillSqlcaObject
    public void fillSqlcaObject(Sqlca sqlca, SQLException e) {
            CfSqlca db2Sqlca = Db2Base.getCfSqlca(e);
            if (db2Sqlca != null) {
                sqlca.setSqlcaid("SQLCA  ".toCharArray());
                sqlca.setSqlcabc(136);
                sqlca.setSqlcode(db2Sqlca.getSqlCode());
                sqlca.setSqlerrp(db2Sqlca.getSqlErrp().toCharArray());
                if(db2Sqlca.getSqlErrmc() != null) {
                     sqlca.getSqlerrm().setSqlerrml(db2Sqlca.getSqlErrmc().length());
                     char ch = 65533;
                     char[] errmc = db2Sqlca.getSqlErrmc().toCharArray();
                      for(int i =0 ;i< errmc.length;i++){
                         if(errmc[i]==';'){
                              errmc[i] = ch;
                         }
                      }
                     sqlca.getSqlerrm().setSqlerrmc(errmc);
                }
                int[] sqlErrd = db2Sqlca.getSqlErrd();
                for (int i = 0; i < sqlErrd.length; i++) {
                    sqlca.setSqlerrd(i, sqlErrd[i]);
                }
                char[] sqlWarn = db2Sqlca.getSqlWarn();
                for (int i = 0; i < sqlWarn.length; i++) {
                    switch (i) {
                        case 0:
                            sqlca.getSqlwarn().setSqlwarn0(new char[]{sqlWarn[0]});
                            break;
                        case 1:
                            sqlca.getSqlwarn().setSqlwarn1(new char[]{sqlWarn[1]});
                            break;
                        case 2:
                            sqlca.getSqlwarn().setSqlwarn2(new char[]{sqlWarn[2]});
                            break;
                        case 3:
                            sqlca.getSqlwarn().setSqlwarn3(new char[]{sqlWarn[3]});
                            break;
                        case 4:
                            sqlca.getSqlwarn().setSqlwarn4(new char[]{sqlWarn[4]});
                            break;
                        case 5:
                            sqlca.getSqlwarn().setSqlwarn5(new char[]{sqlWarn[5]});
                            break;
                        case 6:
                            sqlca.getSqlwarn().setSqlwarn6(new char[]{sqlWarn[6]});
                            break;
                        case 7:
                            sqlca.getSqlwarn().setSqlwarn7(new char[]{sqlWarn[7]});
                            break;
                        case 8:
                            sqlca.getSqlext().setSqlwarn8(new char[]{sqlWarn[8]});
                            break;
                        case 9:
                            sqlca.getSqlext().setSqlwarn9(new char[]{sqlWarn[9]});
                            break;
                        case 10:
                            sqlca.getSqlext().setSqlwarna(new char[]{sqlWarn[10]});
                            break;
                    }
                }
                sqlca.getSqlext().setSqlstate(db2Sqlca.getSqlState().toCharArray());
        } else {
            sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
        }
    }
// methodEnd:fillSqlcaObject



    public void fill501SqlcaObject(Sqlca sqlca) {
                sqlca.setSqlcode(-501);
                sqlca.setSqlerrp("DSNXERT".toCharArray());
                sqlca.setSqlerrd(0,-240);
    	  		sqlca.setSqlerrd(1,0);
		    	sqlca.setSqlerrd(2,0);
		    	sqlca.setSqlerrd(3,-1);
		    	sqlca.setSqlerrd(4,0);
		    	sqlca.setSqlerrd(5,0);
			    sqlca.getSqlext().setSqlstate("24501".toCharArray());
    }

public void closeCursor(ResultSet result, Sqlca sqlca) throws Exception {
        sqlca.setSqlcode(0);
	try { 
	db2Base.closeCursor(result);
} catch(Exception e) {
	logger.info("{} close had exception", result);
}

db2Base.updateFetchCounter(sqlFetchCounter);
}

}
