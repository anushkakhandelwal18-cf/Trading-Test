package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.repository.Trdpb006Repository;
import com.cloudframe.app.dao.Db2Base;
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

import com.cloudframe.app.dto.trdpb006.*;

@Repository
@Qualifier("trdpb006Repository")
public class Trdpb006RepositoryImpl implements Trdpb006Repository {
    Logger logger = LoggerFactory.getLogger(Trdpb006RepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openClientOrdersTrdpb006
    
/**
******     DECLARE CLIENT_ORDERS CURSOR WITH HOLD FOR              
******     SELECT  A.ORD_TRADEID                                   
******            ,A.ORD_TRADING_XCHNG                             
******            ,A.ORD_BUY_SELL_IND                              
******            ,A.ORD_CUSTOMER_ID                               
******            ,CUS_DESCRIPTION                                 
******            ,A.ORD_FIGI                                      
******            ,SEC_SYMBOL                                      
******            ,SEC_DESCRIPTION                                 
******            ,SEC_TYPE                                        
******            ,A.ORD_QUANTITY                                  
******            ,A.ORD_CURRENCY                                  
******            ,A.ORD_AMOUNT                                    
******            ,A.ORD_STATUS                                    
******            ,B.ORD_CUSTOMER_ID                               
******       FROM TBTRDORD A, TBTRDCUS, TBTRDSEC , TBTRDORD B      
******       WHERE A.ORD_CUSTOMER_ID = CUS_CUSTOMER_ID             
******         AND A.ORD_FIGI      = SEC_FIGI                      
******         AND A.ORD_CURRENCY     = B.ORD_CURRENCY             
******         AND A.ORD_TRADING_XCHNG= B.ORD_TRADING_XCHNG        
******         AND A.ORD_TRADEID      = B.ORD_TRADEID              
******         AND A.ORD_FIGI         = B.ORD_FIGI                 
******         AND A.ORD_BUY_SELL_IND <> B.ORD_BUY_SELL_IND        
******       ORDER BY A.ORD_CUSTOMER_ID ASC                        
******               ,A.ORD_BUY_SELL_IND ASC                       
******               ,A.ORD_CURRENCY   ASC                         
******               ,A.ORD_STATUS     ASC                         
******               ,A.ORD_TRADEID    ASC                         
**/
    public ResultSet openClientOrdersTrdpb006(Sqlca sqlca) throws Exception {
ResultSet clientOrdersResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	clientOrdersResultSet = db2Base.startQuery(3/* SQL Sequence*/, CONSTANTS.LITERAL_TRDPB006)
    .withSql(SQLS.SQL_284822057)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return clientOrdersResultSet;
    }
// methodEnd:openClientOrdersTrdpb006
// methodStart:fetchClientOrdersTrdpb006
    
/**
******    FETCH CLIENT_ORDERS                                      
******     INTO :ORD-TRADEID                                       
******         ,:ORD-TRADING-XCHNG                                 
******         ,:ORD-BUY-SELL-IND                                  
******         ,:ORD-CUSTOMER-ID                                   
******         ,:CUS-DESCRIPTION                                   
******         ,:ORD-FIGI                                          
******         ,:SEC-SYMBOL                                        
******         ,:SEC-DESCRIPTION                                   
******         ,:SEC-TYPE                                          
******         ,:ORD-QUANTITY                                      
******         ,:ORD-CURRENCY                                      
******         ,:ORD-AMOUNT                                        
******         ,:ORD-STATUS                                        
******         ,:WS-BUYER-SELLER-CUST-ID                           
**/
    public void fetchClientOrdersTrdpb006(ResultSet clientOrdersResultSet, Dcltbtrdcus dcltbtrdcus, Dcltbtrdord dcltbtrdord, Dcltbtrdsec dcltbtrdsec, Sqlca sqlca, Work work) throws Exception {
try {
	boolean hasResults = clientOrdersResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = clientOrdersResultSet.getObject(1);
 if (resultObj != null) {
   dcltbtrdord.setOrdTradeid( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = clientOrdersResultSet.getString(2);
 if (resultObjString != null) {
   dcltbtrdord.setOrdTradingXchng( resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(3);
 if (resultObj != null) {
   dcltbtrdord.setOrdBuySellInd( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(4);
 if (resultObj != null) {
   dcltbtrdord.setOrdCustomerId( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(5);
 if (resultObj != null) {
   dcltbtrdcus.setCusDescription( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(6);
 if (resultObj != null) {
   dcltbtrdord.setOrdFigi( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(7);
 if (resultObj != null) {
   dcltbtrdsec.setSecSymbol( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(8);
 if (resultObj != null) {
   dcltbtrdsec.setSecDescription( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(9);
 if (resultObj != null) {
   dcltbtrdsec.setSecType( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(10);
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
 resultObj = clientOrdersResultSet.getObject(11);
 if (resultObj != null) {
   dcltbtrdord.setOrdCurrency( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(12);
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
 resultObj = clientOrdersResultSet.getObject(13);
 if (resultObj != null) {
   dcltbtrdord.setOrdStatus( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = clientOrdersResultSet.getObject(14);
 if (resultObj != null) {
   work.setBuyerSellerCustId( resultObj.toString().toCharArray() );
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
 		logger.error("clientOrdersResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchClientOrdersTrdpb006
// methodStart:closeClientOrdersTrdpb006
    
/**
******    CLOSE CLIENT_ORDERS                                      
**/
    public void closeClientOrdersTrdpb006(ResultSet clientOrdersResultSet, Sqlca sqlca) throws Exception {

	closeCursor(clientOrdersResultSet,sqlca);

    }
// methodEnd:closeClientOrdersTrdpb006
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
