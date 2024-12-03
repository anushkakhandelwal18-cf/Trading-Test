package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.repository.Trdpb000Repository;
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

import com.cloudframe.app.dto.trdpb000.*;

@Repository
@Qualifier("trdpb000Repository")
public class Trdpb000RepositoryImpl implements Trdpb000Repository {
    Logger logger = LoggerFactory.getLogger(Trdpb000RepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
static final short NOT_NULL = (short)0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

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
    int count = db2Base.startQuery(8/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB000)
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
    int count = db2Base.startQuery(9/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB000)
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
    int count = db2Base.startQuery(9/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB000)
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
// methodStart:openBuySideOrdersTrdpb000
    
/**
******     DECLARE BUY_SIDE_ORDERS CURSOR WITH HOLD FOR            
******     SELECT  ORD_TRADEID                                     
******            ,ORD_BUY_SELL_IND                                
******            ,ORD_CUSTOMER_ID                                 
******            ,ORD_FIGI                                        
******            ,ORD_QUANTITY                                    
******            ,ORD_CURRENCY                                    
******            ,ORD_AMOUNT                                      
******       FROM TBTRDORD                                         
******       WHERE                                                 
******            ORD_CURRENCY      = :ORD-CURRENCY                
******        AND ORD_TRADING_XCHNG = :ORD-TRADING-XCHNG           
******        AND ORD_BUY_SELL_IND  = 'B'                          
******        AND ORD_STATUS        = :ORD-STATUS                  
**/
    public ResultSet openBuySideOrdersTrdpb000(Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception {
ResultSet buySideOrdersResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	buySideOrdersResultSet = db2Base.startQuery(7/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB000)
    .withSql(SQLS.SQL_541828363)
				.withInputs(dcltbtrdord.getOrdCurrency(),dcltbtrdord.getOrdTradingXchng(),dcltbtrdord.getOrdStatus())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return buySideOrdersResultSet;
    }
// methodEnd:openBuySideOrdersTrdpb000
// methodStart:fetchBuySideOrdersTrdpb000
    
/**
******    FETCH BUY_SIDE_ORDERS                                    
******     INTO :ORD-TRADEID                                       
******         ,:ORD-BUY-SELL-IND                                  
******         ,:ORD-CUSTOMER-ID                                   
******         ,:ORD-FIGI                                          
******         ,:ORD-QUANTITY                                      
******         ,:ORD-CURRENCY                                      
******         ,:ORD-AMOUNT                                        
**/
    public void fetchBuySideOrdersTrdpb000(ResultSet buySideOrdersResultSet, Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception {
try {
	boolean hasResults = buySideOrdersResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = buySideOrdersResultSet.getObject(1);
 if (resultObj != null) {
   dcltbtrdord.setOrdTradeid( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdord.setOrdBuySellInd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(3);
 if (resultObj != null) {
   dcltbtrdord.setOrdCustomerId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(4);
 if (resultObj != null) {
   dcltbtrdord.setOrdFigi( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(5);
 if (resultObj != null) {
   try {   
   dcltbtrdord.setOrdQuantity( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdord.setOrdQuantity( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdord.setOrdQuantity( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdord.setOrdQuantity( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(6);
 if (resultObj != null) {
   dcltbtrdord.setOrdCurrency( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(7);
 if (resultObj != null) {
   try {   
   dcltbtrdord.setOrdAmount( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdord.setOrdAmount( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdord.setOrdAmount( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdord.setOrdAmount( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
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
 		logger.error("buySideOrdersResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchBuySideOrdersTrdpb000
// methodStart:fetchBuySideOrders1Trdpb000
    
/**
******        FETCH BUY_SIDE_ORDERS                                
******         INTO :ORD-TRADEID                                   
******             ,:ORD-BUY-SELL-IND                              
******             ,:ORD-CUSTOMER-ID                               
******             ,:ORD-FIGI                                      
******             ,:ORD-QUANTITY                                  
******             ,:ORD-CURRENCY                                  
******             ,:ORD-AMOUNT                                    
**/
    public void fetchBuySideOrders1Trdpb000(ResultSet buySideOrdersResultSet, Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception {
try {
	boolean hasResults = buySideOrdersResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = buySideOrdersResultSet.getObject(1);
 if (resultObj != null) {
   dcltbtrdord.setOrdTradeid( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdord.setOrdBuySellInd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(3);
 if (resultObj != null) {
   dcltbtrdord.setOrdCustomerId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(4);
 if (resultObj != null) {
   dcltbtrdord.setOrdFigi( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(5);
 if (resultObj != null) {
   try {   
   dcltbtrdord.setOrdQuantity( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdord.setOrdQuantity( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdord.setOrdQuantity( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdord.setOrdQuantity( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(6);
 if (resultObj != null) {
   dcltbtrdord.setOrdCurrency( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = buySideOrdersResultSet.getObject(7);
 if (resultObj != null) {
   try {   
   dcltbtrdord.setOrdAmount( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dcltbtrdord.setOrdAmount( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dcltbtrdord.setOrdAmount( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dcltbtrdord.setOrdAmount( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
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
 		logger.error("buySideOrdersResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchBuySideOrders1Trdpb000
// methodStart:closeBuySideOrdersTrdpb000
    
/**
******    CLOSE BUY_SIDE_ORDERS                                    
**/
    public void closeBuySideOrdersTrdpb000(ResultSet buySideOrdersResultSet, Sqlca sqlca) throws Exception {

	closeCursor(buySideOrdersResultSet,sqlca);

    }
// methodEnd:closeBuySideOrdersTrdpb000
// methodStart:selectTbtrdord
    
/**
******    SELECT                                                   
******          ORD_CUSTOMER_ID                                    
******        , ORD_STATUS                                         
******     INTO :ORD-CUSTOMER-ID                                   
******         ,:ORD-STATUS                                        
******     FROM TBTRDORD                                           
******     WHERE                                                   
******           ORD_CURRENCY      = :ORD-CURRENCY                 
******     AND   ORD_TRADING_XCHNG = :ORD-TRADING-XCHNG            
******     AND   ORD_TRADEID       = :ORD-TRADEID                  
******     AND   ORD_FIGI          = :ORD-FIGI                     
******     AND   ORD_BUY_SELL_IND  = :ORD-BUY-SELL-IND             
******     WITH UR                                                 
**/
    public void selectTbtrdord(Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(17/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB000)
.withSql(SQLS.SQL_905812455)
				.withInputs(dcltbtrdord.getOrdCurrency(),dcltbtrdord.getOrdTradingXchng(),dcltbtrdord.getOrdTradeid(),dcltbtrdord.getOrdFigi(),dcltbtrdord.getOrdBuySellInd())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR,Types.CHAR)
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
   dcltbtrdord.setOrdCustomerId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdord.setOrdStatus( resultObj.toString().toCharArray() );
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
// methodEnd:selectTbtrdord
// methodStart:selectTbtrdsac
    
/**
******    SELECT                                                   
******          SAC_NUMBER                                         
******        , SAC_STATUS                                         
******     INTO :SAC-NUMBER                                        
******         ,:SAC-STATUS                                        
******     FROM TBTRDSAC                                           
******     WHERE                                                   
******           SAC_CUSTOMER_ID   = :SAC-CUSTOMER-ID              
******     AND   SAC_CURRENCY      = :SAC-CURRENCY                 
******     WITH UR                                                 
**/
    public void selectTbtrdsac(Sqlca sqlca, Dcltbtrdsac dcltbtrdsac) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(18/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB000)
.withSql(SQLS.SQL_1752331982)
				.withInputs(dcltbtrdsac.getSacCustomerId(),dcltbtrdsac.getSacCurrency())
				.withDataTypes(Types.CHAR,Types.CHAR)
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
   dcltbtrdsac.setSacNumber(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsac.setSacNumber(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsac.setSacNumber(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsac.setSacNumber(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdsac.setSacStatus( resultObj.toString().toCharArray() );
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
// methodEnd:selectTbtrdsac
// methodStart:selectTbtrdsac1
    
/**
******    SELECT                                                   
******          SAC_NUMBER                                         
******        , SAC_STATUS                                         
******     INTO :SAC-NUMBER                                        
******         ,:SAC-STATUS                                        
******     FROM TBTRDSAC                                           
******     WHERE                                                   
******           SAC_CUSTOMER_ID   = :SAC-CUSTOMER-ID              
******     AND   SAC_CURRENCY      = :SAC-CURRENCY                 
******     WITH UR                                                 
**/
    public void selectTbtrdsac1(Sqlca sqlca, Dcltbtrdsac dcltbtrdsac) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(19/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB000)
.withSql(SQLS.SQL_1752331982_1)
				.withInputs(dcltbtrdsac.getSacCustomerId(),dcltbtrdsac.getSacCurrency())
				.withDataTypes(Types.CHAR,Types.CHAR)
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
   dcltbtrdsac.setSacNumber(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdsac.setSacNumber(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdsac.setSacNumber(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdsac.setSacNumber(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdsac.setSacStatus( resultObj.toString().toCharArray() );
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
// methodEnd:selectTbtrdsac1
// methodStart:selectTbtrdmac
    
/**
******    SELECT                                                   
******          MAC_NUMBER                                         
******        , MAC_STATUS                                         
******     INTO :MAC-NUMBER                                        
******         ,:MAC-STATUS                                        
******     FROM TBTRDMAC                                           
******     WHERE                                                   
******           MAC_CURRENCY      = :MAC-CURRENCY                 
******       AND MAC_CUSTOMER_ID   = :MAC-CUSTOMER-ID              
******     WITH UR                                                 
**/
    public void selectTbtrdmac(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(20/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB000)
.withSql(SQLS.SQL_656699678)
				.withInputs(dcltbtrdmac.getMacCurrency(),dcltbtrdmac.getMacCustomerId())
				.withDataTypes(Types.CHAR,Types.CHAR)
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
   dcltbtrdmac.setMacNumber(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdmac.setMacNumber(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdmac.setMacNumber(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdmac.setMacNumber(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdmac.setMacStatus( resultObj.toString().toCharArray() );
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
// methodStart:selectTbtrdmac1
    
/**
******    SELECT                                                   
******          MAC_NUMBER                                         
******        , MAC_STATUS                                         
******     INTO :MAC-NUMBER                                        
******         ,:MAC-STATUS                                        
******     FROM TBTRDMAC                                           
******     WHERE                                                   
******           MAC_CURRENCY      = :MAC-CURRENCY                 
******       AND MAC_CUSTOMER_ID   = :MAC-CUSTOMER-ID              
******     WITH UR                                                 
**/
    public void selectTbtrdmac1(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(21/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB000)
.withSql(SQLS.SQL_656699678_1)
				.withInputs(dcltbtrdmac.getMacCurrency(),dcltbtrdmac.getMacCustomerId())
				.withDataTypes(Types.CHAR,Types.CHAR)
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
   dcltbtrdmac.setMacNumber(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dcltbtrdmac.setMacNumber(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dcltbtrdmac.setMacNumber(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dcltbtrdmac.setMacNumber(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   dcltbtrdmac.setMacStatus( resultObj.toString().toCharArray() );
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
// methodEnd:selectTbtrdmac1
// methodStart:insertTbtrdstq
    
/**
******  INSERT INTO TBTRDSTQ                                       
******  (                                                          
******    STQ_CURRENCY                                             
******   ,STQ_TRADE_DATA                                           
******  )                                                          
******  VALUES                                                     
******  (                                                          
******    :WS-STQ-CURRENCY                                         
******   ,:WS-STQ-TRDPAIR                                          
******  )                                                          
******  FOR :WS-STQ-INDEX ROWS                                     
******  NOT ATOMIC                                                 
******  CONTINUE ON SQLEXCEPTION                                   
**/
    public void insertTbtrdstq(Sqlca sqlca, SettlmentQueueTable settlmentQueueTable) throws Exception {

/**
******  INSERT INTO TBTRDSTQ                                       
******  (                                                          
******    STQ_CURRENCY                                             
******   ,STQ_TRADE_DATA                                           
******  )                                                          
******  VALUES                                                     
******  (                                                          
******    :WS-STQ-CURRENCY                                         
******   ,:WS-STQ-TRDPAIR                                          
******  )                                                          
******  FOR :WS-STQ-INDEX ROWS                                     
******  NOT ATOMIC                                                 
******  CONTINUE ON SQLEXCEPTION                                   
**/
try {
	// BATCH INSERT
	// reset SQLCODE
	sqlca.setSqlcode(0);
   // execute Batch Insert SQL query
   db2Base.startQuery(22/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB000)
.withSql(SQLS.SQL_244621935)
				.withInputs(settlmentQueueTable.getStqCurrency(),settlmentQueueTable.getStqTrdpair(),settlmentQueueTable.getStqIndex())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.SMALLINT)
   .executeBatchInsert();
   sqlca.setSqlerrd(2,db2Base.getRowsUpdated());
   sqlca.setSqlcode(db2Base.getSqlcode());
}
catch (SQLException e) {
           fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
  throw e;
}
    }
// methodEnd:insertTbtrdstq
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
    int count = db2Base.startQuery(23/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB000)
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
// methodStart:openSummaryCsrTrdpb000
    
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
    public ResultSet openSummaryCsrTrdpb000(Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception {
ResultSet summaryCsrResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	summaryCsrResultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB000)
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
// methodEnd:openSummaryCsrTrdpb000
// methodStart:fetchSummaryCsrTrdpb000
    
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
    public void fetchSummaryCsrTrdpb000(ResultSet summaryCsrResultSet, Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception {
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
// methodEnd:fetchSummaryCsrTrdpb000
// methodStart:selectTbtrdmac2
    
/**
******      SELECT  MAC_BALANCE                                    
******        INTO :MAC-BALANCE                                    
******        FROM TBTRDMAC                                        
******        WHERE                                                
******             MAC_CURRENCY   = :MAC-CURRENCY                  
******         AND MAC_NUMBER     = :MAC-NUMBER                    
******         WITH UR                                             
**/
    public void selectTbtrdmac2(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	ResultSet resultSet = db2Base.startQuery(26/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB000)
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
// methodEnd:selectTbtrdmac2
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
    public void insert1(Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(27/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB000)
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
    public void updateTbtrdsum(Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(28/* SQL Sequence*/,CONSTANTS.LITERAL_TRDPB000)
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
// methodStart:closeSummaryCsrTrdpb000
    
/**
******     CLOSE SUMMARY_CSR                                       
**/
    public void closeSummaryCsrTrdpb000(ResultSet summaryCsrResultSet, Sqlca sqlca) throws Exception {

	closeCursor(summaryCsrResultSet,sqlca);

    }
// methodEnd:closeSummaryCsrTrdpb000
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
