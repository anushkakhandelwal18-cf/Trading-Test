package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.repository.Trdpb001Repository;
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

import com.cloudframe.app.dto.trdpb001.*;

@Repository
@Qualifier("trdpb001Repository")
public class Trdpb001RepositoryImpl implements Trdpb001Repository {
    Logger logger = LoggerFactory.getLogger(Trdpb001RepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
static final short NOT_NULL = (short)0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openSettlementQueueTrdpb001
    
/**
******     DECLARE SETTLEMENT_QUEUE CURSOR WITH HOLD FOR           
******     SELECT  STQ_ID                                          
******            ,STQ_TRADE_DATA                                  
******       FROM TBTRDSTQ                                         
******       WHERE                                                 
******            STQ_CURRENCY      = :STQ-CURRENCY                
******     ORDER BY STQ_CURRENCY ASC, STQ_ID  ASC                  
**/
    public ResultSet openSettlementQueueTrdpb001(Dcltbtrdstq dcltbtrdstq, Sqlca sqlca) throws Exception {
ResultSet settlementQueueResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	settlementQueueResultSet = db2Base.startQuery(6/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB001)
    .withSql(SQLS.SQL_727592218)
				.withInputs(dcltbtrdstq.getStqCurrency())
				.withDataTypes(Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return settlementQueueResultSet;
    }
// methodEnd:openSettlementQueueTrdpb001
// methodStart:insert
    
/**
******   INSERT INTO TBTRDLOG                                      
******   VALUES (                                                  
******     :LOG-TRANSACTION                                        
******    ,:LOG-CURRENCY                                           
******    ,:LOG-START-TS                                           
******    ,:LOG-END-TS                                             
******   )                                                         
**/
    public void insert(Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(8/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB001)
    .withSql(SQLS.SQL_523195946)
				.withInputs(dcltbtrdlog.getLogTransaction(),dcltbtrdlog.getLogCurrency(),dcltbtrdlog.getLogStartTs(),dcltbtrdlog.getLogEndTs())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
    .executeUpdate();
    
    sqlca.setSqlerrd(2,count);
   }
    catch (SQLException e) {
            fillSqlcaObject(sqlca, e);
    }
    catch(Exception e) {
    throw e;
    }
    }
// methodEnd:insert
// methodStart:updateTbtrdlog
    
/**
******           UPDATE TBTRDLOG                                   
******             SET LOG_END_TS = :LOG-END-TS                    
******           WHERE LOG_TRANSACTION = :LOG-TRANSACTION          
******             AND LOG_CURRENCY    = :LOG-CURRENCY             
**/
    public void updateTbtrdlog(Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(9/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB001)
    .withSql(SQLS.SQL_203945070)
				.withInputs(dcltbtrdlog.getLogEndTs(),dcltbtrdlog.getLogTransaction(),dcltbtrdlog.getLogCurrency())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR)
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
// methodEnd:updateTbtrdlog
// methodStart:updateTbtrdlog1
    
/**
******           UPDATE TBTRDLOG                                   
******             SET LOG_END_TS = :LOG-END-TS                    
******           WHERE LOG_TRANSACTION = :LOG-TRANSACTION          
******             AND LOG_CURRENCY    = :LOG-CURRENCY             
**/
    public void updateTbtrdlog1(Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(9/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB001)
    .withSql(SQLS.SQL_203945070_1)
				.withInputs(dcltbtrdlog.getLogEndTs(),dcltbtrdlog.getLogTransaction(),dcltbtrdlog.getLogCurrency())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR)
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
// methodEnd:updateTbtrdlog1
// methodStart:fetchSettlementQueueTrdpb001
    
/**
******    FETCH SETTLEMENT_QUEUE                                   
******     INTO :STQ-ID                                            
******         ,:STQ-TRADE-DATA                                    
**/
    public void fetchSettlementQueueTrdpb001(ResultSet settlementQueueResultSet, Dcltbtrdstq dcltbtrdstq, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = settlementQueueResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = settlementQueueResultSet.getObject(1);
 if (resultObj != null) {
   try {   
   dcltbtrdstq.setStqId(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdstq.setStqId(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdstq.setStqId(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdstq.setStqId(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = settlementQueueResultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdstq.setStqTradeData( resultObj.toString().toCharArray() );
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
 		logger.error("settlementQueueResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchSettlementQueueTrdpb001
// methodStart:deleteTbtrdstq
    
/**
******            DELETE                                           
******              FROM TBTRDSTQ                                  
******              WHERE                                          
******                                                             
******                   STQ_CURRENCY      = :STQ-CURRENCY         
******               AND STQ_ID            = :STQ-ID               
**/
    public void deleteTbtrdstq(Dcltbtrdstq dcltbtrdstq, Sqlca sqlca) throws Exception {
try {
	// DELETE 
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// execute SQLJ query
	int count = db2Base.startQuery(13/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB001)
.withSql(SQLS.SQL_716332205)
				.withInputs(dcltbtrdstq.getStqCurrency(),dcltbtrdstq.getStqId())
				.withDataTypes(Types.CHAR,Types.INTEGER)
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
// methodEnd:deleteTbtrdstq
// methodStart:deleteTbtrdstq1
    
/**
******            DELETE                                           
******              FROM TBTRDSTQ                                  
******              WHERE                                          
******                                                             
******                   STQ_CURRENCY      = :STQ-CURRENCY         
******               AND STQ_ID            = :STQ-ID               
**/
    public void deleteTbtrdstq1(Dcltbtrdstq dcltbtrdstq, Sqlca sqlca) throws Exception {
try {
	// DELETE 
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// execute SQLJ query
	int count = db2Base.startQuery(13/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB001)
.withSql(SQLS.SQL_716332205_1)
				.withInputs(dcltbtrdstq.getStqCurrency(),dcltbtrdstq.getStqId())
				.withDataTypes(Types.CHAR,Types.INTEGER)
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
// methodEnd:deleteTbtrdstq1
// methodStart:updateTbtrdord
    
/**
******       UPDATE TBTRDORD                                       
******          SET ORD_STATUS = :ORD-STATUS                       
******       WHERE                                                 
******             ORD_CURRENCY      = :ORD-CURRENCY               
******       AND   ORD_TRADING_XCHNG = :ORD-TRADING-XCHNG          
******       AND   ORD_TRADEID       = :ORD-TRADEID                
******       AND   ORD_FIGI          = :ORD-FIGI                   
******       AND   ORD_BUY_SELL_IND  = :ORD-BUY-SELL-IND           
**/
    public void updateTbtrdord(Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(14/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB001)
    .withSql(SQLS.SQL_337073571)
				.withInputs(dcltbtrdord.getOrdStatus(),dcltbtrdord.getOrdCurrency(),dcltbtrdord.getOrdTradingXchng(),dcltbtrdord.getOrdTradeid(),dcltbtrdord.getOrdFigi(),dcltbtrdord.getOrdBuySellInd())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
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
// methodEnd:updateTbtrdord
// methodStart:openSummaryCsrTrdpb001
    
/**
******   DECLARE SUMMARY_CSR CURSOR FOR                            
******       SELECT                                                
******          SUM_CUSTOMER_ID                                    
******         ,SUM_OVERDUE                                        
******         ,SUM_REJECTED                                       
******         ,SUM_SETTLED                                        
******         ,SUM_CURRENCY                                       
******         ,SUM_OPEN_BALANCE                                   
******         ,SUM_TOTAL_DEBIT                                    
******         ,SUM_TOTAL_CREDIT                                   
******         ,SUM_CLOSE_BALANCE                                  
******       FROM TBTRDSUM                                         
******       WHERE SUM_CUSTOMER_ID = :SUM-CUSTOMER-ID              
******       FOR UPDATE OF                                         
******          SUM_OVERDUE                                        
******         ,SUM_REJECTED                                       
******         ,SUM_SETTLED                                        
******         ,SUM_CURRENCY                                       
******         ,SUM_OPEN_BALANCE                                   
******         ,SUM_TOTAL_DEBIT                                    
******         ,SUM_TOTAL_CREDIT                                   
******         ,SUM_CLOSE_BALANCE                                  
**/
    public ResultSet openSummaryCsrTrdpb001(Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception {
ResultSet summaryCsrResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	summaryCsrResultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB001)
    .withSql(SQLS.SQL_1354410233)
				.withInputs(dcltbtrdsum.getSumCustomerId())
				.withDataTypes(Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return summaryCsrResultSet;
    }
// methodEnd:openSummaryCsrTrdpb001
// methodStart:fetchSummaryCsrTrdpb001
    
/**
******     FETCH SUMMARY_CSR                                       
******      INTO :SUM-CUSTOMER-ID                                  
******          ,:SUM-OVERDUE                                      
******          ,:SUM-REJECTED                                     
******          ,:SUM-SETTLED                                      
******          ,:SUM-CURRENCY                                     
******          ,:SUM-OPEN-BALANCE                                 
******          ,:SUM-TOTAL-DEBIT                                  
******          ,:SUM-TOTAL-CREDIT                                 
******          ,:SUM-CLOSE-BALANCE                                
**/
    public void fetchSummaryCsrTrdpb001(ResultSet summaryCsrResultSet, Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception {
try {
	boolean hasResults = summaryCsrResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = summaryCsrResultSet.getObject(1);
 if (resultObj != null) {
   dcltbtrdsum.setSumCustomerId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCsrResultSet.getObject(2);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumOverdue(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsum.setSumOverdue(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumOverdue(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumOverdue(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCsrResultSet.getObject(3);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumRejected(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsum.setSumRejected(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumRejected(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumRejected(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCsrResultSet.getObject(4);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumSettled(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsum.setSumSettled(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumSettled(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumSettled(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCsrResultSet.getObject(5);
 if (resultObj != null) {
   dcltbtrdsum.setSumCurrency( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCsrResultSet.getObject(6);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumOpenBalance( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumOpenBalance( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumOpenBalance( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumOpenBalance( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCsrResultSet.getObject(7);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumTotalDebit( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalDebit( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalDebit( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalDebit( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCsrResultSet.getObject(8);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumTotalCredit( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalCredit( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalCredit( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumTotalCredit( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = summaryCsrResultSet.getObject(9);
 if (resultObj != null) {
   try {   
   dcltbtrdsum.setSumCloseBalance( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdsum.setSumCloseBalance( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsum.setSumCloseBalance( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsum.setSumCloseBalance( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
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
 		logger.error("summaryCsrResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchSummaryCsrTrdpb001
// methodStart:selectTbtrdmac
    
/**
******      SELECT  MAC_BALANCE                                    
******        INTO :MAC-BALANCE                                    
******        FROM TBTRDMAC                                        
******        WHERE                                                
******             MAC_CURRENCY   = :MAC-CURRENCY                  
******         AND MAC_NUMBER     = :MAC-NUMBER                    
******         WITH UR                                             
**/
    public void selectTbtrdmac(Dcltbtrdmac dcltbtrdmac, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(17/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB001)
.withSql(SQLS.SQL_644545964)
				.withInputs(dcltbtrdmac.getMacCurrency(),dcltbtrdmac.getMacNumber())
				.withDataTypes(Types.CHAR,Types.INTEGER)
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
// methodEnd:selectTbtrdmac
// methodStart:insert1
    
/**
******      INSERT                                                 
******        INTO TBTRDSUM                                        
******        VALUES (                                             
******          :SUM-CUSTOMER-ID                                   
******         ,:SUM-OVERDUE                                       
******         ,:SUM-REJECTED                                      
******         ,:SUM-SETTLED                                       
******         ,:SUM-CURRENCY                                      
******         ,:SUM-OPEN-BALANCE                                  
******         ,:SUM-TOTAL-DEBIT                                   
******         ,:SUM-TOTAL-CREDIT                                  
******         ,:SUM-CLOSE-BALANCE                                 
******        )                                                    
**/
    public void insert1(Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(18/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB001)
    .withSql(SQLS.SQL_480142874)
				.withInputs(dcltbtrdsum.getSumCustomerId(),dcltbtrdsum.getSumOverdue(),dcltbtrdsum.getSumRejected(),dcltbtrdsum.getSumSettled(),dcltbtrdsum.getSumCurrency(),dcltbtrdsum.getSumOpenBalance(),dcltbtrdsum.getSumTotalDebit(),dcltbtrdsum.getSumTotalCredit(),dcltbtrdsum.getSumCloseBalance())
				.withDataTypes(Types.CHAR,Types.INTEGER,Types.INTEGER,Types.INTEGER,Types.CHAR,Types.DECIMAL,Types.DECIMAL,Types.DECIMAL,Types.DECIMAL)
    .executeUpdate();
    
    sqlca.setSqlerrd(2,count);
   }
    catch (SQLException e) {
            fillSqlcaObject(sqlca, e);
    }
    catch(Exception e) {
    throw e;
    }
    }
// methodEnd:insert1
// methodStart:updateTbtrdsum
    
/**
******        UPDATE TBTRDSUM                                      
******           SET                                               
******              SUM_OVERDUE       = :SUM-OVERDUE               
******             ,SUM_REJECTED      = :SUM-REJECTED              
******             ,SUM_SETTLED       = :SUM-SETTLED               
******             ,SUM_CURRENCY      = :SUM-CURRENCY              
******             ,SUM_OPEN_BALANCE  = :SUM-OPEN-BALANCE          
******             ,SUM_TOTAL_DEBIT   = :SUM-TOTAL-DEBIT           
******             ,SUM_TOTAL_CREDIT  = :SUM-TOTAL-CREDIT          
******             ,SUM_CLOSE_BALANCE = :SUM-CLOSE-BALANCE         
******        WHERE                                                
******           SUM_CUSTOMER_ID = :SUM-CUSTOMER-ID                
**/
    public void updateTbtrdsum(Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(19/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB001)
    .withSql(SQLS.SQL_312959442)
				.withInputs(dcltbtrdsum.getSumOverdue(),dcltbtrdsum.getSumRejected(),dcltbtrdsum.getSumSettled(),dcltbtrdsum.getSumCurrency(),dcltbtrdsum.getSumOpenBalance(),dcltbtrdsum.getSumTotalDebit(),dcltbtrdsum.getSumTotalCredit(),dcltbtrdsum.getSumCloseBalance(),dcltbtrdsum.getSumCustomerId())
				.withDataTypes(Types.INTEGER,Types.INTEGER,Types.INTEGER,Types.CHAR,Types.DECIMAL,Types.DECIMAL,Types.DECIMAL,Types.DECIMAL,Types.CHAR)
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
// methodEnd:updateTbtrdsum
// methodStart:closeSummaryCsrTrdpb001
    
/**
******     CLOSE SUMMARY_CSR                                       
**/
    public void closeSummaryCsrTrdpb001(ResultSet summaryCsrResultSet, Sqlca sqlca) throws Exception {

	closeCursor(summaryCsrResultSet,sqlca);

    }
// methodEnd:closeSummaryCsrTrdpb001
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
