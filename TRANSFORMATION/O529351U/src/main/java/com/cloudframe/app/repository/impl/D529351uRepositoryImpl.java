package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.repository.D529351uRepository;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.dto.d529351u.*;

@Repository
@Qualifier("d529351uRepository")
public class D529351uRepositoryImpl implements D529351uRepository {
    Logger logger = LoggerFactory.getLogger(D529351uRepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
static final short NOT_NULL = (short)0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openCsplnvD529351u
    
/**
******  DECLARE CSPLNV  CURSOR                                     
******   WITH ROWSET POSITIONING FOR                               
******    SELECT                                                   
******           A.SPI_TBL_ID                                      
******          ,B.POS_TIER_TYP_CD                                 
******          ,B.PRI_DIAG_IND                                    
******          ,B.MJR_DIAG_ELIG_IND                               
******                                                             
******    FROM FE_SPI_PLN_VAR A                                    
******                                                             
******         INNER JOIN FE_SPI_DESC_HDR B                        
******                 ON  B.SPI_TBL_ID =  A.SPI_TBL_ID  AND       
******                     B.SPI_STS_CD = 'A'            AND       
******                     B.STS_CD     = 'A'                      
******                                                             
******    WHERE  A.POL_NBR    = :PLNV-POL-NBR                      
******      AND  A.PLN_NBR    = :PLNV-PLN-NBR                      
******      AND  A.EFF_DT    <= :WS-DB2-REQ-DOS-DATE               
******      AND  A.CANC_DT   >= :WS-DB2-REQ-DOS-DATE               
******      AND  A.STS_CD     = 'A'                                
******                                                             
******                                                             
******    ORDER BY                                                 
******             A.SPI_TBL_ID           ASC,                     
******             A.EFF_DT               DESC                     
******                                                             
******    FOR FETCH ONLY                                           
******                                                             
**/
    public ResultSet openCsplnvD529351u(Sqlca sqlca, WorkArea workArea, DclfeSpiPlnVar dclfeSpiPlnVar) throws Exception {
ResultSet csplnvResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csplnvResultSet = db2Base.startQuery(11/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
    .withSql(SQLS.SQL_893291460)
				.withInputs(dclfeSpiPlnVar.getPlnvPolNbr(),dclfeSpiPlnVar.getPlnvPlnNbr(),workArea.getDb2ReqDosDate(),workArea.getDb2ReqDosDate())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csplnvResultSet;
    }
// methodEnd:openCsplnvD529351u
// methodStart:fetchCsplnvD529351u
    
/**
******      FETCH NEXT ROWSET FROM CSPLNV                          
******          FOR 100 ROWS                                       
******      INTO                                                   
******            :HV01-SPI-TBL-ID                                 
******           ,:HV14-POS-TIER-TYP-CD                            
******           ,:HV0A-PRI-DIAG-IND                               
******           ,:HV15-MJR-DIAG-ELIG-IND                          
**/
    public void fetchCsplnvD529351u(ResultSet csplnvResultSet, Sqlca sqlca, HvHostVariablesCsplnv hvHostVariablesCsplnv) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < 100) {
       hasResults = csplnvResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csplnvResultSet.getObject(1);
 if (resultObj != null) {
   hvHostVariablesCsplnv.setHv01SpiTblId(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csplnvResultSet.getObject(2);
 if (resultObj != null) {
   hvHostVariablesCsplnv.setHv14PosTierTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csplnvResultSet.getObject(3);
 if (resultObj != null) {
   hvHostVariablesCsplnv.setHv0aPriDiagInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csplnvResultSet.getObject(4);
 if (resultObj != null) {
   hvHostVariablesCsplnv.setHv15MjrDiagEligInd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
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
 		logger.error("csplnvResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsplnvD529351u
// methodStart:closeCsplnvD529351u
    
/**
******    CLOSE CSPLNV                                             
**/
    public void closeCsplnvD529351u(ResultSet csplnvResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csplnvResultSet,sqlca);

    }
// methodEnd:closeCsplnvD529351u
// methodStart:openCsfrtoD529351u
    
/**
******   DECLARE CSFRTO CURSOR                                     
******    WITH ROWSET POSITIONING FOR                              
******     SELECT                                                  
******        DERIV_PL_OF_SVC_CD                                   
******       ,DERIV_SVC_CD                                         
******       ,DERIV_CAUS_CD                                        
******       ,CLM_FRM_SVC_CD                                       
******       ,CLM_TO_SVC_CD                                        
******       ,SVC_TYP_CD                                           
******    FROM                                                     
******      FE_SPI_RULE_FR_TO_SVC                                  
******    WHERE  SPI_TBL_ID         = :FRTO-SPI-TBL-ID             
******      AND  STS_CD             = 'A'                          
******    FOR FETCH ONLY                                           
**/
    public ResultSet openCsfrtoD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception {
ResultSet csfrtoResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csfrtoResultSet = db2Base.startQuery(12/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
    .withSql(SQLS.SQL_1116813597)
				.withInputs(dclfeSpiRuleFrToSvc.getFrtoSpiTblId())
				.withDataTypes(Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csfrtoResultSet;
    }
// methodEnd:openCsfrtoD529351u
// methodStart:fetchCsfrtoD529351u
    
/**
******      FETCH NEXT ROWSET FROM CSFRTO                          
******          FOR 100 ROWS                                       
******      INTO                                                   
******            :HV08-SVC-DRV-POS                                
******           ,:HV09-SVC-DRV-SVC                                
******           ,:HV10-SVC-DRV-CAU                                
******           ,:HV11-CLM-FRM-SVC-CD                             
******           ,:HV12-CLM-TO-SVC-CD                              
******           ,:HV13-SVC-TYP-CD                                 
**/
    public void fetchCsfrtoD529351u(ResultSet csfrtoResultSet, HvHostVariablesCsfrto hvHostVariablesCsfrto, Sqlca sqlca) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < 100) {
       hasResults = csfrtoResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csfrtoResultSet.getObject(1);
 if (resultObj != null) {
   hvHostVariablesCsfrto.setHv08SvcDrvPos(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csfrtoResultSet.getObject(2);
 if (resultObj != null) {
   hvHostVariablesCsfrto.setHv09SvcDrvSvc(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csfrtoResultSet.getObject(3);
 if (resultObj != null) {
   hvHostVariablesCsfrto.setHv10SvcDrvCau(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csfrtoResultSet.getObject(4);
 if (resultObj != null) {
   hvHostVariablesCsfrto.setHv11ClmFrmSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csfrtoResultSet.getObject(5);
 if (resultObj != null) {
   hvHostVariablesCsfrto.setHv12ClmToSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csfrtoResultSet.getObject(6);
 if (resultObj != null) {
   hvHostVariablesCsfrto.setHv13SvcTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
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
 		logger.error("csfrtoResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsfrtoD529351u
// methodStart:closeCsfrtoD529351u
    
/**
******    CLOSE CSFRTO                                             
**/
    public void closeCsfrtoD529351u(ResultSet csfrtoResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csfrtoResultSet,sqlca);

    }
// methodEnd:closeCsfrtoD529351u
// methodStart:openCsptypD529351u
    
/**
******  DECLARE CSPTYP    CURSOR FOR                               
******    SELECT                                                   
******          PROV_TYP                                           
******    FROM FE_SPI_RULE_PROV_TYP                                
******    WHERE SPI_TBL_ID           = :PTYP-SPI-TBL-ID            
******      AND  STS_CD              = 'A'                         
******      AND  DERIV_PL_OF_SVC_CD  = :PTYP-DERIV-PL-OF-SVC-CD    
******      AND  DERIV_SVC_CD        = :PTYP-DERIV-SVC-CD          
******      AND  DERIV_CAUS_CD       = :PTYP-DERIV-CAUS-CD         
******                                                             
******    FOR FETCH ONLY                                           
******                                                             
**/
    public ResultSet openCsptypD529351u(DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca) throws Exception {
ResultSet csptypResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csptypResultSet = db2Base.startQuery(13/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
    .withSql(SQLS.SQL_1935646759)
				.withInputs(dclfeSpiRuleProvTyp.getPtypSpiTblId(),dclfeSpiRuleProvTyp.getPtypDerivPlOfSvcCd(),dclfeSpiRuleProvTyp.getPtypDerivSvcCd(),dclfeSpiRuleProvTyp.getPtypDerivCausCd())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csptypResultSet;
    }
// methodEnd:openCsptypD529351u
// methodStart:fetchCsptypD529351u
    
/**
******      FETCH CSPTYP                                           
******      INTO                                                   
******            :PTYP-PROV-TYP                                   
**/
    public void fetchCsptypD529351u(ResultSet csptypResultSet, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = csptypResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csptypResultSet.getObject(1);
 if (resultObj != null) {
   dclfeSpiRuleProvTyp.setPtypProvTyp( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("csptypResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchCsptypD529351u
// methodStart:closeCsptypD529351u
    
/**
******    CLOSE CSPTYP                                             
**/
    public void closeCsptypD529351u(ResultSet csptypResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csptypResultSet,sqlca);

    }
// methodEnd:closeCsptypD529351u
// methodStart:openCsicdD529351u
    
/**
******  DECLARE CSICD   CURSOR                                     
******    WITH ROWSET POSITIONING FOR                              
******    SELECT                                                   
******        DERIV_PL_OF_SVC_CD                                   
******       ,DERIV_SVC_CD                                         
******       ,DERIV_CAUS_CD                                        
******       ,CLM_ICD_IND                                          
******       ,CLM_ICD_FROM_CD                                      
******       ,CLM_ICD_TO_CD                                        
******    FROM FE_SPI_RULE_ICD                                     
******    WHERE SPI_TBL_ID          = :RICD-SPI-TBL-ID             
******      AND STS_CD              = 'A'                          
******      AND  DERIV_PL_OF_SVC_CD = :RICD-DERIV-PL-OF-SVC-CD     
******      AND  DERIV_SVC_CD       = :RICD-DERIV-SVC-CD           
******      AND  DERIV_CAUS_CD      = :RICD-DERIV-CAUS-CD          
******      AND  CLM_ICD_IND        = :WS-LST-CLM-ICD-IND          
******      AND ((CLM_ICD_FROM_CD  <= :TEST-DIAG-01 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-01)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-02 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-02)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-03 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-03)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-04 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-04)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-05 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-05)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-06 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-06)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-07 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-07)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-08 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-08)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-09 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-09)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-10 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-10)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-11 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-11)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-12 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-12)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-13 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-13)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-14 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-14)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-15 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-15)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-16 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-16)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-17 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-17)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-18 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-18)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-19 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-19)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-20 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-20)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-21 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-21)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-22 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-22)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-23 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-23)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-24 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-24)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-25 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-25)    OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-01     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-02     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-03     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-04     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-05     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-06     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-07     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-08     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-09     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-10     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-11     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-12     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-13     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-14     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-15     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-16     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-17     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-18     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-19     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-20     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-21     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-22     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-23     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-24     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-25)               
******                                                             
******    ORDER BY CLM_ICD_FROM_CD, CLM_ICD_TO_CD                  
******                                                             
******    FOR FETCH ONLY                                           
******                                                             
**/
    public ResultSet openCsicdD529351u(DclfeSpiRuleIcd dclfeSpiRuleIcd, TestVariables testVariables, Sqlca sqlca, LstIcdKey lstIcdKey) throws Exception {
ResultSet csicdResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csicdResultSet = db2Base.startQuery(14/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
    .withSql(SQLS.SQL_836373005)
				.withInputs(dclfeSpiRuleIcd.getRicdSpiTblId(),dclfeSpiRuleIcd.getRicdDerivPlOfSvcCd(),dclfeSpiRuleIcd.getRicdDerivSvcCd(),dclfeSpiRuleIcd.getRicdDerivCausCd(),lstIcdKey.getLstClmIcdInd(),testVariables.getTestDiagArea().getTestDiag01(),testVariables.getTestDiagArea().getTestDiag01(),testVariables.getTestDiagArea().getTestDiag02(),testVariables.getTestDiagArea().getTestDiag02(),testVariables.getTestDiagArea().getTestDiag03(),testVariables.getTestDiagArea().getTestDiag03(),testVariables.getTestDiagArea().getTestDiag04(),testVariables.getTestDiagArea().getTestDiag04(),testVariables.getTestDiagArea().getTestDiag05(),testVariables.getTestDiagArea().getTestDiag05(),testVariables.getTestDiagArea().getTestDiag06(),testVariables.getTestDiagArea().getTestDiag06(),testVariables.getTestDiagArea().getTestDiag07(),testVariables.getTestDiagArea().getTestDiag07(),testVariables.getTestDiagArea().getTestDiag08(),testVariables.getTestDiagArea().getTestDiag08(),testVariables.getTestDiagArea().getTestDiag09(),testVariables.getTestDiagArea().getTestDiag09(),testVariables.getTestDiagArea().getTestDiag10(),testVariables.getTestDiagArea().getTestDiag10(),testVariables.getTestDiagArea().getTestDiag11(),testVariables.getTestDiagArea().getTestDiag11(),testVariables.getTestDiagArea().getTestDiag12(),testVariables.getTestDiagArea().getTestDiag12(),testVariables.getTestDiagArea().getTestDiag13(),testVariables.getTestDiagArea().getTestDiag13(),testVariables.getTestDiagArea().getTestDiag14(),testVariables.getTestDiagArea().getTestDiag14(),testVariables.getTestDiagArea().getTestDiag15(),testVariables.getTestDiagArea().getTestDiag15(),testVariables.getTestDiagArea().getTestDiag16(),testVariables.getTestDiagArea().getTestDiag16(),testVariables.getTestDiagArea().getTestDiag17(),testVariables.getTestDiagArea().getTestDiag17(),testVariables.getTestDiagArea().getTestDiag18(),testVariables.getTestDiagArea().getTestDiag18(),testVariables.getTestDiagArea().getTestDiag19(),testVariables.getTestDiagArea().getTestDiag19(),testVariables.getTestDiagArea().getTestDiag20(),testVariables.getTestDiagArea().getTestDiag20(),testVariables.getTestDiagArea().getTestDiag21(),testVariables.getTestDiagArea().getTestDiag21(),testVariables.getTestDiagArea().getTestDiag22(),testVariables.getTestDiagArea().getTestDiag22(),testVariables.getTestDiagArea().getTestDiag23(),testVariables.getTestDiagArea().getTestDiag23(),testVariables.getTestDiagArea().getTestDiag24(),testVariables.getTestDiagArea().getTestDiag24(),testVariables.getTestDiagArea().getTestDiag25(),testVariables.getTestDiagArea().getTestDiag25(),testVariables.getTestDiagArea().getTestDiag01(),testVariables.getTestDiagArea().getTestDiag02(),testVariables.getTestDiagArea().getTestDiag03(),testVariables.getTestDiagArea().getTestDiag04(),testVariables.getTestDiagArea().getTestDiag05(),testVariables.getTestDiagArea().getTestDiag06(),testVariables.getTestDiagArea().getTestDiag07(),testVariables.getTestDiagArea().getTestDiag08(),testVariables.getTestDiagArea().getTestDiag09(),testVariables.getTestDiagArea().getTestDiag10(),testVariables.getTestDiagArea().getTestDiag11(),testVariables.getTestDiagArea().getTestDiag12(),testVariables.getTestDiagArea().getTestDiag13(),testVariables.getTestDiagArea().getTestDiag14(),testVariables.getTestDiagArea().getTestDiag15(),testVariables.getTestDiagArea().getTestDiag16(),testVariables.getTestDiagArea().getTestDiag17(),testVariables.getTestDiagArea().getTestDiag18(),testVariables.getTestDiagArea().getTestDiag19(),testVariables.getTestDiagArea().getTestDiag20(),testVariables.getTestDiagArea().getTestDiag21(),testVariables.getTestDiagArea().getTestDiag22(),testVariables.getTestDiagArea().getTestDiag23(),testVariables.getTestDiagArea().getTestDiag24(),testVariables.getTestDiagArea().getTestDiag25())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csicdResultSet;
    }
// methodEnd:openCsicdD529351u
// methodStart:fetchCsicdD529351u
    
/**
******      FETCH NEXT ROWSET FROM CSICD                           
******          FOR 9999 ROWS                                      
******      INTO                                                   
******            :HV3A-ICD-DRV-POS                                
******           ,:HV3B-ICD-DRV-SVC                                
******           ,:HV3C-ICD-DRV-CAU                                
******           ,:HV3D-ICD-TYP-CD                                 
******           ,:HV3E-CLM-FRM-ICD-CD                             
******           ,:HV3F-CLM-TO-ICD-CD                              
**/
    public void fetchCsicdD529351u(ResultSet csicdResultSet, HvHostVariablesCsicdo hvHostVariablesCsicdo, Sqlca sqlca) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < 9999) {
       hasResults = csicdResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csicdResultSet.getObject(1);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3aIcdDrvPos(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdResultSet.getObject(2);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3bIcdDrvSvc(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdResultSet.getObject(3);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3cIcdDrvCau(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdResultSet.getObject(4);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3dIcdTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdResultSet.getObject(5);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3eClmFrmIcdCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdResultSet.getObject(6);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3fClmToIcdCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
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
 		logger.error("csicdResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsicdD529351u
// methodStart:closeCsicdD529351u
    
/**
******    CLOSE CSICD                                              
**/
    public void closeCsicdD529351u(ResultSet csicdResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csicdResultSet,sqlca);

    }
// methodEnd:closeCsicdD529351u
// methodStart:openCsfcndD529351u
    
/**
******  DECLARE CSFCND   CURSOR FOR                                
******    SELECT                                                   
******          FROM_COND_POS                                      
******    FROM FE_SPI_RULE_FR_COND_POS                             
******    WHERE SPI_TBL_ID         = :FCND-SPI-TBL-ID              
******     AND  STS_CD             = 'A'                           
******     AND  DERIV_PL_OF_SVC_CD = :FCND-DERIV-PL-OF-SVC-CD      
******     AND  DERIV_SVC_CD       = :FCND-DERIV-SVC-CD            
******     AND  DERIV_CAUS_CD      = :FCND-DERIV-CAUS-CD           
******                                                             
******    FOR FETCH ONLY                                           
******                                                             
**/
    public ResultSet openCsfcndD529351u(Sqlca sqlca, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos) throws Exception {
ResultSet csfcndResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csfcndResultSet = db2Base.startQuery(16/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
    .withSql(SQLS.SQL_443604161)
				.withInputs(dclfeSpiRuleFrCondPos.getFcndSpiTblId(),dclfeSpiRuleFrCondPos.getFcndDerivPlOfSvcCd(),dclfeSpiRuleFrCondPos.getFcndDerivSvcCd(),dclfeSpiRuleFrCondPos.getFcndDerivCausCd())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csfcndResultSet;
    }
// methodEnd:openCsfcndD529351u
// methodStart:fetchCsfcndD529351u
    
/**
******      FETCH CSFCND                                           
******      INTO                                                   
******            :FCND-FROM-COND-POS                              
**/
    public void fetchCsfcndD529351u(ResultSet csfcndResultSet, Sqlca sqlca, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos) throws Exception {
try {
	boolean hasResults = csfcndResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csfcndResultSet.getObject(1);
 if (resultObj != null) {
   dclfeSpiRuleFrCondPos.setFcndFromCondPos( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("csfcndResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchCsfcndD529351u
// methodStart:closeCsfcndD529351u
    
/**
******    CLOSE CSFCND                                             
**/
    public void closeCsfcndD529351u(ResultSet csfcndResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csfcndResultSet,sqlca);

    }
// methodEnd:closeCsfcndD529351u
// methodStart:selectFeSpiRuleCaus
    
/**
******   SELECT                                                    
******       CLM_CAUS_1_CD                                         
******      ,CLM_CAUS_2_CD                                         
******      ,CLM_CAUS_3_CD                                         
******      ,CLM_CAUS_4_CD                                         
******      ,CLM_CAUS_5_CD                                         
******      ,CLM_CAUS_6_CD                                         
******      ,CLM_CAUS_7_CD                                         
******      ,CLM_CAUS_8_CD                                         
******      INTO                                                   
******       :CAUS-CLM-CAUS-1-CD                                   
******      ,:CAUS-CLM-CAUS-2-CD                                   
******      ,:CAUS-CLM-CAUS-3-CD                                   
******      ,:CAUS-CLM-CAUS-4-CD                                   
******      ,:CAUS-CLM-CAUS-5-CD                                   
******      ,:CAUS-CLM-CAUS-6-CD                                   
******      ,:CAUS-CLM-CAUS-7-CD                                   
******      ,:CAUS-CLM-CAUS-8-CD                                   
******    FROM FE_SPI_RULE_CAUS                                    
******    WHERE SPI_TBL_ID         = :CAUS-SPI-TBL-ID              
******    AND   STS_CD             = 'A'                           
******    AND   DERIV_PL_OF_SVC_CD = :CAUS-DERIV-PL-OF-SVC-CD      
******    AND   DERIV_SVC_CD       = :CAUS-DERIV-SVC-CD            
******    AND   DERIV_CAUS_CD      = :CAUS-DERIV-CAUS-CD           
******    FETCH FIRST 1 ROW  ONLY                                  
******                                                             
**/
    public void selectFeSpiRuleCaus(Sqlca sqlca, DclfeSpiRuleCaus dclfeSpiRuleCaus) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(33/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
.withSql(SQLS.SQL_1320672265)
				.withInputs(dclfeSpiRuleCaus.getCausSpiTblId(),dclfeSpiRuleCaus.getCausDerivPlOfSvcCd(),dclfeSpiRuleCaus.getCausDerivSvcCd(),dclfeSpiRuleCaus.getCausDerivCausCd())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
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
   dclfeSpiRuleCaus.setCausClmCaus1Cd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   dclfeSpiRuleCaus.setCausClmCaus2Cd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {
   dclfeSpiRuleCaus.setCausClmCaus3Cd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   dclfeSpiRuleCaus.setCausClmCaus4Cd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(5);
 if (resultObj != null) {
   dclfeSpiRuleCaus.setCausClmCaus5Cd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {
   dclfeSpiRuleCaus.setCausClmCaus6Cd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(7);
 if (resultObj != null) {
   dclfeSpiRuleCaus.setCausClmCaus7Cd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(8);
 if (resultObj != null) {
   dclfeSpiRuleCaus.setCausClmCaus8Cd( resultObj.toString().toCharArray() );
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
// methodEnd:selectFeSpiRuleCaus
// methodStart:selectFeSpiRuleIpa
    
/**
******    SELECT                                                   
******           CLM_IPA_1_CD                                      
******          ,CLM_IPA_2_CD                                      
******          ,CLM_IPA_3_CD                                      
******    INTO                                                     
******          :RIPA-CLM-IPA-1-CD                                 
******         ,:RIPA-CLM-IPA-2-CD                                 
******         ,:RIPA-CLM-IPA-3-CD                                 
******    FROM FE_SPI_RULE_IPA                                     
******    WHERE SPI_TBL_ID         = :RIPA-SPI-TBL-ID              
******    AND   STS_CD             = 'A'                           
******    AND   DERIV_PL_OF_SVC_CD = :RIPA-DERIV-PL-OF-SVC-CD      
******    AND   DERIV_SVC_CD       = :RIPA-DERIV-SVC-CD            
******    AND   DERIV_CAUS_CD      = :RIPA-DERIV-CAUS-CD           
******    FETCH FIRST 1 ROW  ONLY                                  
******                                                             
**/
    public void selectFeSpiRuleIpa(DclfeSpiRuleIpa dclfeSpiRuleIpa, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(34/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
.withSql(SQLS.SQL_1233467357)
				.withInputs(dclfeSpiRuleIpa.getRipaSpiTblId(),dclfeSpiRuleIpa.getRipaDerivPlOfSvcCd(),dclfeSpiRuleIpa.getRipaDerivSvcCd(),dclfeSpiRuleIpa.getRipaDerivCausCd())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
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
   dclfeSpiRuleIpa.setRipaClmIpa1Cd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   dclfeSpiRuleIpa.setRipaClmIpa2Cd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {
   dclfeSpiRuleIpa.setRipaClmIpa3Cd( resultObj.toString().toCharArray() );
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
// methodEnd:selectFeSpiRuleIpa
// methodStart:openSvcMainCsrD529351u
    
/**
******   DECLARE SVC-MAIN-CSR CURSOR                               
******    WITH ROWSET POSITIONING FOR                              
******    SELECT                                                   
******        DERIV_PL_OF_SVC_CD                                   
******       ,DERIV_SVC_CD                                         
******       ,DERIV_CAUS_CD                                        
******                                                             
******       ,POS_IND  ||                                          
******        SVC_IND  ||                                          
******        PROV_IND ||                                          
******        CAUS_IND ||                                          
******        IPA_IND  ||                                          
******        GTN_IND  ||                                          
******        ICD_IND  ||                                          
******        CPE_DESC_IND                                         
******                                                             
******    FROM                                                     
******      FE_SPI_DENORM                                          
******    WHERE                                                    
******         SPI_TBL_ID = :FRTO-SPI-TBL-ID                       
******    FOR FETCH ONLY                                           
******    WITH UR                                                  
**/
    public ResultSet openSvcMainCsrD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception {
ResultSet svcMainCsrResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	svcMainCsrResultSet = db2Base.startQuery(10/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
    .withSql(SQLS.SQL_769749506)
				.withInputs(dclfeSpiRuleFrToSvc.getFrtoSpiTblId())
				.withDataTypes(Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return svcMainCsrResultSet;
    }
// methodEnd:openSvcMainCsrD529351u
// methodStart:fetchSvcMainCsrD529351u
    
/**
******     FETCH NEXT ROWSET FROM SVC-MAIN-CSR                     
******     FOR 100 ROWS                                            
******     INTO                                                    
******            :HV04-KEY-DRV-POS                                
******          , :HV05-KEY-DRV-SVC                                
******          , :HV06-KEY-DRV-CAU                                
******          , :HV07-RULE-SW                                    
**/
    public void fetchSvcMainCsrD529351u(ResultSet svcMainCsrResultSet, HvHostVariablesSvcmain hvHostVariablesSvcmain, Sqlca sqlca) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < 100) {
       hasResults = svcMainCsrResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = svcMainCsrResultSet.getObject(1);
 if (resultObj != null) {
   hvHostVariablesSvcmain.setHv04KeyDrvPos(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = svcMainCsrResultSet.getObject(2);
 if (resultObj != null) {
   hvHostVariablesSvcmain.setHv05KeyDrvSvc(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = svcMainCsrResultSet.getObject(3);
 if (resultObj != null) {
   hvHostVariablesSvcmain.setHv06KeyDrvCau(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = svcMainCsrResultSet.getString(4);
 if (resultObjString != null) {
   hvHostVariablesSvcmain.setHv07RuleSw(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
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
 		logger.error("svcMainCsrResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchSvcMainCsrD529351u
// methodStart:closeSvcMainCsrD529351u
    
/**
******   CLOSE SVC-MAIN-CSR                                        
**/
    public void closeSvcMainCsrD529351u(ResultSet svcMainCsrResultSet, Sqlca sqlca) throws Exception {

	closeCursor(svcMainCsrResultSet,sqlca);

    }
// methodEnd:closeSvcMainCsrD529351u
// methodStart:openCombCurD529351u
    
/**
******   DECLARE COMB_CUR CURSOR                                   
******      WITH ROWSET POSITIONING FOR                            
******   SELECT '1' REC_TYP_CD                                     
******      ,DERIV_PL_OF_SVC_CD                                    
******      ,DERIV_SVC_CD                                          
******      ,DERIV_CAUS_CD                                         
******      ,CLM_CAUS_1_CD                                         
******      ,CLM_CAUS_2_CD                                         
******      ,CLM_CAUS_3_CD                                         
******      ,CLM_CAUS_4_CD                                         
******      ,CLM_CAUS_5_CD                                         
******      ,CLM_CAUS_6_CD                                         
******      ,CLM_CAUS_7_CD                                         
******      ,CLM_CAUS_8_CD                                         
******      ,CHAR(SPACE(3)) CLM_IPA_1_CD                           
******      ,CHAR(SPACE(3)) CLM_IPA_2_CD                           
******      ,CHAR(SPACE(3)) CLM_IPA_3_CD                           
******      ,CHAR(SPACE(2)) PROV_TYP                               
******      ,CHAR(SPACE(2)) FROM_COND_POS                          
******      ,CHAR(SPACE(4)) GRP_TBL_1_NBR                          
******      ,CHAR(SPACE(4)) GRP_TBL_2_NBR                          
******      ,CHAR(SPACE(4)) GRP_TBL_3_NBR                          
******      ,CHAR(SPACE(4)) CPE_DESC_CD                            
******   FROM FE_SPI_RULE_CAUS                                     
******    WHERE SPI_TBL_ID         = :CAUS-SPI-TBL-ID              
******    AND   STS_CD             = 'A'                           
******     AND (CLM_CAUS_1_CD     = :TEST-CAUS OR                  
******          CLM_CAUS_2_CD     = :TEST-CAUS OR                  
******          CLM_CAUS_3_CD     = :TEST-CAUS OR                  
******          CLM_CAUS_4_CD     = :TEST-CAUS OR                  
******          CLM_CAUS_5_CD     = :TEST-CAUS OR                  
******          CLM_CAUS_6_CD     = :TEST-CAUS OR                  
******          CLM_CAUS_7_CD     = :TEST-CAUS OR                  
******          CLM_CAUS_8_CD     = :TEST-CAUS)                    
******    UNION ALL                                                
******    SELECT '2' REC_TYP_CD                                    
******         ,DERIV_PL_OF_SVC_CD                                 
******         ,DERIV_SVC_CD                                       
******         ,DERIV_CAUS_CD                                      
******         ,CHAR(SPACE(1)) CLM_CAUS_1_CD                       
******         ,CHAR(SPACE(1)) CLM_CAUS_2_CD                       
******         ,CHAR(SPACE(1)) CLM_CAUS_3_CD                       
******         ,CHAR(SPACE(1)) CLM_CAUS_4_CD                       
******         ,CHAR(SPACE(1)) CLM_CAUS_5_CD                       
******         ,CHAR(SPACE(1)) CLM_CAUS_6_CD                       
******         ,CHAR(SPACE(1)) CLM_CAUS_7_CD                       
******         ,CHAR(SPACE(1)) CLM_CAUS_8_CD                       
******         ,CLM_IPA_1_CD                                       
******         ,CLM_IPA_2_CD                                       
******         ,CLM_IPA_3_CD                                       
******         ,CHAR(SPACE(2)) PROV_TYP                            
******         ,CHAR(SPACE(2)) FROM_COND_POS                       
******         ,GRP_TBL_1_NBR                                      
******         ,GRP_TBL_2_NBR                                      
******         ,GRP_TBL_3_NBR                                      
******         ,CHAR(SPACE(4)) CPE_DESC_CD                         
******    FROM FE_SPI_RULE_IPA                                     
******      WHERE SPI_TBL_ID         = :RIPA-SPI-TBL-ID            
******      AND   STS_CD             = 'A'                         
******    UNION ALL                                                
******    SELECT '3' REC_TYP_CD                                    
******        ,DERIV_PL_OF_SVC_CD                                  
******        ,DERIV_SVC_CD                                        
******        ,DERIV_CAUS_CD                                       
******        ,CHAR(SPACE(1)) CLM_CAUS_1_CD                        
******        ,CHAR(SPACE(1)) CLM_CAUS_2_CD                        
******        ,CHAR(SPACE(1)) CLM_CAUS_3_CD                        
******        ,CHAR(SPACE(1)) CLM_CAUS_4_CD                        
******        ,CHAR(SPACE(1)) CLM_CAUS_5_CD                        
******        ,CHAR(SPACE(1)) CLM_CAUS_6_CD                        
******        ,CHAR(SPACE(1)) CLM_CAUS_7_CD                        
******        ,CHAR(SPACE(1)) CLM_CAUS_8_CD                        
******        ,CHAR(SPACE(3)) CLM_IPA_1_CD                         
******        ,CHAR(SPACE(3)) CLM_IPA_2_CD                         
******        ,CHAR(SPACE(3)) CLM_IPA_3_CD                         
******        ,PROV_TYP                                            
******        ,CHAR(SPACE(2)) FROM_COND_POS                        
******        ,CHAR(SPACE(4)) GRP_TBL_1_NBR                        
******        ,CHAR(SPACE(4)) GRP_TBL_2_NBR                        
******        ,CHAR(SPACE(4)) GRP_TBL_3_NBR                        
******        ,CHAR(SPACE(4)) CPE_DESC_CD                          
******    FROM FE_SPI_RULE_PROV_TYP                                
******     WHERE SPI_TBL_ID         = :PTYP-SPI-TBL-ID             
******     AND   STS_CD             = 'A'                          
******     AND PROV_TYP           = :TEST-PROV-TYP                 
******                                                             
******    UNION ALL                                                
******    SELECT '4' REC_TYP_CD                                    
******       ,DERIV_PL_OF_SVC_CD                                   
******       ,DERIV_SVC_CD                                         
******       ,DERIV_CAUS_CD                                        
******       ,CHAR(SPACE(1)) CLM_CAUS_1_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_2_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_3_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_4_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_5_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_6_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_7_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_8_CD                         
******       ,CHAR(SPACE(3)) CLM_IPA_1_CD                          
******       ,CHAR(SPACE(3)) CLM_IPA_2_CD                          
******       ,CHAR(SPACE(3)) CLM_IPA_3_CD                          
******       ,CHAR(SPACE(2)) PROV_TYP                              
******       ,FROM_COND_POS                                        
******       ,CHAR(SPACE(4)) GRP_TBL_1_NBR                         
******       ,CHAR(SPACE(4)) GRP_TBL_2_NBR                         
******       ,CHAR(SPACE(4)) GRP_TBL_3_NBR                         
******       ,CHAR(SPACE(4)) CPE_DESC_CD                           
******     FROM FE_SPI_RULE_FR_COND_POS                            
******     WHERE SPI_TBL_ID = :FCND-SPI-TBL-ID                     
******     AND STS_CD        = 'A'                                 
******     AND FROM_COND_POS = :TEST-POS                           
******                                                             
******    UNION ALL                                                
******    SELECT '5' REC_TYP_CD                                    
******       ,DERIV_PL_OF_SVC_CD                                   
******       ,DERIV_SVC_CD                                         
******       ,DERIV_CAUS_CD                                        
******       ,CHAR(SPACE(1)) CLM_CAUS_1_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_2_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_3_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_4_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_5_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_6_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_7_CD                         
******       ,CHAR(SPACE(1)) CLM_CAUS_8_CD                         
******       ,CHAR(SPACE(3)) CLM_IPA_1_CD                          
******       ,CHAR(SPACE(3)) CLM_IPA_2_CD                          
******       ,CHAR(SPACE(3)) CLM_IPA_3_CD                          
******       ,CHAR(SPACE(2)) PROV_TYP                              
******       ,CHAR(SPACE(2)) FROM_COND_POS                         
******       ,CHAR(SPACE(4)) GRP_TBL_1_NBR                         
******       ,CHAR(SPACE(4)) GRP_TBL_2_NBR                         
******       ,CHAR(SPACE(4)) GRP_TBL_3_NBR                         
******       ,CPE_DESC_CD                                          
******     FROM FE_SPI_RULE_CPE_FLG                                
******     WHERE SPI_TBL_ID = :CPEFL-SPI-TBL-ID                    
******     AND STS_CD        = 'A'                                 
******     AND CPE_DESC_CD   = :TEST-CPE-DESC-CD                   
******                                                             
******    FOR FETCH ONLY                                           
**/
    public ResultSet openCombCurD529351u(TestVariables testVariables, DclfeSpiRuleIpa dclfeSpiRuleIpa, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca, DclfeSpiRuleCaus dclfeSpiRuleCaus, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, DclfeSpiRuleCpeFlg dclfeSpiRuleCpeFlg) throws Exception {
ResultSet combCurResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	combCurResultSet = db2Base.startQuery(17/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
    .withSql(SQLS.SQL_1809880364)
				.withInputs(dclfeSpiRuleCaus.getCausSpiTblId(),testVariables.getTestCaus(),testVariables.getTestCaus(),testVariables.getTestCaus(),testVariables.getTestCaus(),testVariables.getTestCaus(),testVariables.getTestCaus(),testVariables.getTestCaus(),testVariables.getTestCaus(),dclfeSpiRuleIpa.getRipaSpiTblId(),dclfeSpiRuleProvTyp.getPtypSpiTblId(),testVariables.getTestProvTyp(),dclfeSpiRuleFrCondPos.getFcndSpiTblId(),testVariables.getTestPos(),dclfeSpiRuleCpeFlg.getCpeflSpiTblId(),testVariables.getTestCpeDescCd())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return combCurResultSet;
    }
// methodEnd:openCombCurD529351u
// methodStart:fetchCombCurD529351u
    
/**
******   FETCH NEXT ROWSET FROM COMB_CUR                           
******    FOR 100 ROWS                                             
******   INTO                                                      
******    :HV2A-REC-TYP-CD,                                        
******    :HV2B-DERIV-PL-OF-SVC-CD,                                
******    :HV2C-DERIV-SVC-CD,                                      
******    :HV2D-DERIV-CAUS-CD,                                     
******    :HV2E-CLM-CAUS-1-CD,                                     
******    :HV2F-CLM-CAUS-2-CD,                                     
******    :HV2G-CLM-CAUS-3-CD,                                     
******    :HV2H-CLM-CAUS-4-CD,                                     
******    :HV2I-CLM-CAUS-5-CD,                                     
******    :HV2J-CLM-CAUS-6-CD,                                     
******    :HV2K-CLM-CAUS-7-CD,                                     
******    :HV2L-CLM-CAUS-8-CD,                                     
******    :HV2M-CLM-IPA-1-CD,                                      
******    :HV2N-CLM-IPA-2-CD,                                      
******    :HV2O-CLM-IPA-3-CD,                                      
******    :HV2P-PROV-TYP,                                          
******    :HV2Q-FROM-COND-POS,                                     
******    :HV2R-GRP-TBL-1-NBR,                                     
******    :HV2S-GRP-TBL-2-NBR,                                     
******    :HV2T-GRP-TBL-3-NBR,                                     
******    :HV2U-CPE-DESC-CD                                        
**/
    public void fetchCombCurD529351u(ResultSet combCurResultSet, Sqlca sqlca, HvHostVariablesCombcr hvHostVariablesCombcr) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < 100) {
       hasResults = combCurResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = combCurResultSet.getObject(1);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2aRecTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(2);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2bDerivPlOfSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(3);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2cDerivSvcCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(4);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2dDerivCausCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(5);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2eClmCaus1Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(6);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2fClmCaus2Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(7);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2gClmCaus3Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(8);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2hClmCaus4Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(9);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2iClmCaus5Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(10);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2jClmCaus6Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(11);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2kClmCaus7Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(12);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2lClmCaus8Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(13);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2mClmIpa1Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(14);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2nClmIpa2Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(15);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2oClmIpa3Cd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(16);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2pProvTyp(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(17);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2qFromCondPos(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(18);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2rGrpTbl1Nbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(19);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2sGrpTbl2Nbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(20);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2tGrpTbl3Nbr(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = combCurResultSet.getObject(21);
 if (resultObj != null) {
   hvHostVariablesCombcr.setHv2uCpeDescCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
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
 		logger.error("combCurResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCombCurD529351u
// methodStart:closeCombCurD529351u
    
/**
******  CLOSE COMB_CUR                                             
**/
    public void closeCombCurD529351u(ResultSet combCurResultSet, Sqlca sqlca) throws Exception {

	closeCursor(combCurResultSet,sqlca);

    }
// methodEnd:closeCombCurD529351u
// methodStart:openCsicdFirst9999SpiD529351u
    
/**
******  DECLARE CSICD_FIRST_9999_SPI CURSOR                        
******    WITH ROWSET POSITIONING FOR                              
******    SELECT                                                   
******        DERIV_PL_OF_SVC_CD                                   
******       ,DERIV_SVC_CD                                         
******       ,DERIV_CAUS_CD                                        
******       ,CLM_ICD_IND                                          
******       ,CLM_ICD_FROM_CD                                      
******       ,CLM_ICD_TO_CD                                        
******    FROM FE_SPI_RULE_ICD                                     
******    WHERE (SPI_TBL_ID          = :RICD-SPI-TBL-ID            
******      AND STS_CD              = 'A'                          
******      AND  CLM_ICD_IND         = :WS-LST-CLM-ICD-IND)        
******                                                             
******      AND ((CLM_ICD_FROM_CD  <= :TEST-DIAG-01 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-01)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-02 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-02)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-03 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-03)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-04 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-04)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-05 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-05)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-06 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-06)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-07 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-07)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-08 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-08)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-09 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-09)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-10 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-10)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-11 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-11)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-12 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-12)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-13 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-13)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-14 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-14)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-15 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-15)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-16 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-16)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-17 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-17)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-18 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-18)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-19 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-19)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-20 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-20)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-21 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-21)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-22 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-22)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-23 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-23)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-24 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-24)    OR         
******           (CLM_ICD_FROM_CD  <= :TEST-DIAG-25 AND            
******            CLM_ICD_TO_CD    >= :TEST-DIAG-25)    OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-01     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-02     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-03     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-04     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-05     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-06     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-07     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-08     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-09     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-10     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-11     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-12     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-13     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-14     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-15     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-16     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-17     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-18     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-19     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-20     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-21     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-22     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-23     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-24     OR         
******            CLM_ICD_FROM_CD   = :TEST-DIAG-25)               
******                                                             
******    ORDER BY DERIV_PL_OF_SVC_CD,                             
******    DERIV_SVC_CD, DERIV_CAUS_CD, CLM_ICD_FROM_CD,            
******    CLM_ICD_TO_CD                                            
******                                                             
******    FOR FETCH ONLY                                           
******                                                             
**/
    public ResultSet openCsicdFirst9999SpiD529351u(DclfeSpiRuleIcd dclfeSpiRuleIcd, TestVariables testVariables, Sqlca sqlca, LstIcdKey lstIcdKey) throws Exception {
ResultSet csicdFirst9999SpiResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	csicdFirst9999SpiResultSet = db2Base.startQuery(15/* SQL Sequence*/, CONSTANTS.LITERAL_D529351U)
    .withSql(SQLS.SQL_48948215)
				.withInputs(dclfeSpiRuleIcd.getRicdSpiTblId(),lstIcdKey.getLstClmIcdInd(),testVariables.getTestDiagArea().getTestDiag01(),testVariables.getTestDiagArea().getTestDiag01(),testVariables.getTestDiagArea().getTestDiag02(),testVariables.getTestDiagArea().getTestDiag02(),testVariables.getTestDiagArea().getTestDiag03(),testVariables.getTestDiagArea().getTestDiag03(),testVariables.getTestDiagArea().getTestDiag04(),testVariables.getTestDiagArea().getTestDiag04(),testVariables.getTestDiagArea().getTestDiag05(),testVariables.getTestDiagArea().getTestDiag05(),testVariables.getTestDiagArea().getTestDiag06(),testVariables.getTestDiagArea().getTestDiag06(),testVariables.getTestDiagArea().getTestDiag07(),testVariables.getTestDiagArea().getTestDiag07(),testVariables.getTestDiagArea().getTestDiag08(),testVariables.getTestDiagArea().getTestDiag08(),testVariables.getTestDiagArea().getTestDiag09(),testVariables.getTestDiagArea().getTestDiag09(),testVariables.getTestDiagArea().getTestDiag10(),testVariables.getTestDiagArea().getTestDiag10(),testVariables.getTestDiagArea().getTestDiag11(),testVariables.getTestDiagArea().getTestDiag11(),testVariables.getTestDiagArea().getTestDiag12(),testVariables.getTestDiagArea().getTestDiag12(),testVariables.getTestDiagArea().getTestDiag13(),testVariables.getTestDiagArea().getTestDiag13(),testVariables.getTestDiagArea().getTestDiag14(),testVariables.getTestDiagArea().getTestDiag14(),testVariables.getTestDiagArea().getTestDiag15(),testVariables.getTestDiagArea().getTestDiag15(),testVariables.getTestDiagArea().getTestDiag16(),testVariables.getTestDiagArea().getTestDiag16(),testVariables.getTestDiagArea().getTestDiag17(),testVariables.getTestDiagArea().getTestDiag17(),testVariables.getTestDiagArea().getTestDiag18(),testVariables.getTestDiagArea().getTestDiag18(),testVariables.getTestDiagArea().getTestDiag19(),testVariables.getTestDiagArea().getTestDiag19(),testVariables.getTestDiagArea().getTestDiag20(),testVariables.getTestDiagArea().getTestDiag20(),testVariables.getTestDiagArea().getTestDiag21(),testVariables.getTestDiagArea().getTestDiag21(),testVariables.getTestDiagArea().getTestDiag22(),testVariables.getTestDiagArea().getTestDiag22(),testVariables.getTestDiagArea().getTestDiag23(),testVariables.getTestDiagArea().getTestDiag23(),testVariables.getTestDiagArea().getTestDiag24(),testVariables.getTestDiagArea().getTestDiag24(),testVariables.getTestDiagArea().getTestDiag25(),testVariables.getTestDiagArea().getTestDiag25(),testVariables.getTestDiagArea().getTestDiag01(),testVariables.getTestDiagArea().getTestDiag02(),testVariables.getTestDiagArea().getTestDiag03(),testVariables.getTestDiagArea().getTestDiag04(),testVariables.getTestDiagArea().getTestDiag05(),testVariables.getTestDiagArea().getTestDiag06(),testVariables.getTestDiagArea().getTestDiag07(),testVariables.getTestDiagArea().getTestDiag08(),testVariables.getTestDiagArea().getTestDiag09(),testVariables.getTestDiagArea().getTestDiag10(),testVariables.getTestDiagArea().getTestDiag11(),testVariables.getTestDiagArea().getTestDiag12(),testVariables.getTestDiagArea().getTestDiag13(),testVariables.getTestDiagArea().getTestDiag14(),testVariables.getTestDiagArea().getTestDiag15(),testVariables.getTestDiagArea().getTestDiag16(),testVariables.getTestDiagArea().getTestDiag17(),testVariables.getTestDiagArea().getTestDiag18(),testVariables.getTestDiagArea().getTestDiag19(),testVariables.getTestDiagArea().getTestDiag20(),testVariables.getTestDiagArea().getTestDiag21(),testVariables.getTestDiagArea().getTestDiag22(),testVariables.getTestDiagArea().getTestDiag23(),testVariables.getTestDiagArea().getTestDiag24(),testVariables.getTestDiagArea().getTestDiag25())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return csicdFirst9999SpiResultSet;
    }
// methodEnd:openCsicdFirst9999SpiD529351u
// methodStart:fetchCsicdFirst9999SpiD529351u
    
/**
******      FETCH NEXT ROWSET FROM CSICD_FIRST_9999_SPI            
******          FOR 9999 ROWS                                      
******      INTO                                                   
******            :HV3A-ICD-DRV-POS                                
******           ,:HV3B-ICD-DRV-SVC                                
******           ,:HV3C-ICD-DRV-CAU                                
******           ,:HV3D-ICD-TYP-CD                                 
******           ,:HV3E-CLM-FRM-ICD-CD                             
******           ,:HV3F-CLM-TO-ICD-CD                              
**/
    public void fetchCsicdFirst9999SpiD529351u(ResultSet csicdFirst9999SpiResultSet, HvHostVariablesCsicdo hvHostVariablesCsicdo, Sqlca sqlca) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < 9999) {
       hasResults = csicdFirst9999SpiResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = csicdFirst9999SpiResultSet.getObject(1);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3aIcdDrvPos(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdFirst9999SpiResultSet.getObject(2);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3bIcdDrvSvc(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdFirst9999SpiResultSet.getObject(3);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3cIcdDrvCau(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdFirst9999SpiResultSet.getObject(4);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3dIcdTypCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdFirst9999SpiResultSet.getObject(5);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3eClmFrmIcdCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = csicdFirst9999SpiResultSet.getObject(6);
 if (resultObj != null) {
   hvHostVariablesCsicdo.setHv3fClmToIcdCd(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
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
 		logger.error("csicdFirst9999SpiResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCsicdFirst9999SpiD529351u
// methodStart:closeCsicdFirst9999SpiD529351u
    
/**
******    CLOSE CSICD_FIRST_9999_SPI                               
**/
    public void closeCsicdFirst9999SpiD529351u(ResultSet csicdFirst9999SpiResultSet, Sqlca sqlca) throws Exception {

	closeCursor(csicdFirst9999SpiResultSet,sqlca);

    }
// methodEnd:closeCsicdFirst9999SpiD529351u
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
