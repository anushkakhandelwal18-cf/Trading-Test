package com.cloudframe.app.repository.impl;

import com.cloudframe.app.repository.Trdpb003Repository;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import java.math.MathContext;
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

import com.cloudframe.app.trdpb003.dto.*;

@Repository
@Qualifier("trdpb003Repository")
public class Trdpb003RepositoryImpl implements Trdpb003Repository {
    Logger logger = LoggerFactory.getLogger(Trdpb003RepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
static final short NOT_NULL = (short)0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openMacBookingTrdpb003
    
/**
******     DECLARE MAC_BOOKING  CURSOR FOR                         
******     SELECT  MAC_BALANCE                                     
******       FROM TBTRDMAC                                         
******       WHERE                                                 
******            MAC_CURRENCY      = :MAC-CURRENCY                
******        AND MAC_NUMBER        = :MAC-NUMBER                  
******       FOR UPDATE OF MAC_BALANCE                             
**/
    public ResultSet openMacBookingTrdpb003(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception {
ResultSet macBookingResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	macBookingResultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB003)
    .withSql(SQLS.SQL_2131911232)
				.withInputs(dcltbtrdmac.getMacCurrency(),dcltbtrdmac.getMacNumber())
				.withDataTypes(Types.CHAR,Types.INTEGER)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return macBookingResultSet;
    }
// methodEnd:openMacBookingTrdpb003
// methodStart:fetchMacBookingTrdpb003
    
/**
******    FETCH MAC_BOOKING                                        
******     INTO :MAC-BALANCE                                       
**/
    public void fetchMacBookingTrdpb003(ResultSet macBookingResultSet, Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception {
try {
	boolean hasResults = macBookingResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = macBookingResultSet.getObject(1);
 if (resultObj != null) {
   try {   
   dcltbtrdmac.setMacBalance( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdmac.setMacBalance( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdmac.setMacBalance( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdmac.setMacBalance( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
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
 		logger.error("macBookingResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchMacBookingTrdpb003
// methodStart:updateTbtrdmac
    
/**
******        UPDATE TBTRDMAC                                      
******          SET MAC_BALANCE      = :MAC-BALANCE                
******        WHERE MAC_CURRENCY     = :MAC-CURRENCY               
******          AND MAC_NUMBER       = :MAC-NUMBER                 
**/
    public void updateTbtrdmac(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(4/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB003)
    .withSql(SQLS.SQL_1886454020)
				.withInputs(dcltbtrdmac.getMacBalance(),dcltbtrdmac.getMacCurrency(),dcltbtrdmac.getMacNumber())
				.withDataTypes(Types.DECIMAL,Types.CHAR,Types.INTEGER)
    .executeUpdate();
    if(count == 0) {
	sqlca.setSqlcode(100);
}

    sqlca.setSqlerrd(2,count);
   }
    catch (SQLException e) {
            fillSqlcaObject(sqlca, e);
    }
    catch(Exception e) {
    throw e;
    }
    }
// methodEnd:updateTbtrdmac
// methodStart:closeMacBookingTrdpb003
    
/**
******    CLOSE MAC_BOOKING                                        
**/
    public void closeMacBookingTrdpb003(ResultSet macBookingResultSet, Sqlca sqlca) throws Exception {

	closeCursor(macBookingResultSet,sqlca);

    }
// methodEnd:closeMacBookingTrdpb003
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
