package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.repository.CfbooksRepository;
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

import com.cloudframe.app.cfbooks.dto.*;

@Repository
@Qualifier("cfbooksRepository")
public class CfbooksRepositoryImpl implements CfbooksRepository {
    Logger logger = LoggerFactory.getLogger(CfbooksRepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openBookscurCfbooks
    
/**
******     DECLARE BOOKSCUR CURSOR FOR                             
******     SELECT  BOOK_ID                                         
******            ,RTRIM(TITLE)                                    
******            ,TOTAL_PAGES                                     
******            ,RATING                                          
******            ,ISBN                                            
******            ,PUBLISHED_DATE                                  
******            ,PUBLISHER_ID                                    
******     FROM    BOOKS                                           
******     WITH UR                                                 
**/
    public ResultSet openBookscurCfbooks(Sqlca sqlca) throws Exception {
ResultSet bookscurResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	bookscurResultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_CFBOOKS)
    .withSql(SQLS.SQL_77213668)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return bookscurResultSet;
    }
// methodEnd:openBookscurCfbooks
// methodStart:closeBookscurCfbooks
    
/**
******      CLOSE BOOKSCUR                                         
**/
    public void closeBookscurCfbooks(ResultSet bookscurResultSet, Sqlca sqlca) throws Exception {

	closeCursor(bookscurResultSet,sqlca);

    }
// methodEnd:closeBookscurCfbooks
// methodStart:fetchBookscurCfbooks
    
/**
******      FETCH BOOKSCUR                                         
******      INTO :BOOKS-BOOK-ID                                    
******          ,:BOOKS-TITLE                                      
******          ,:BOOKS-TOTAL-PAGES:WS-PAGE-NULL                   
******          ,:BOOKS-RATING:WS-RATE-NULL                        
******          ,:BOOKS-ISBN:WS-ISBN-NULL                          
******          ,:BOOKS-PUBLISHED-DATE:WS-DATE-NULL                
******          ,:BOOKS-PUBLISHER-ID:WS-ID-NULL                    
**/
    public void fetchBookscurCfbooks(ResultSet bookscurResultSet, Sqlca sqlca, Dclbooks dclbooks, Nullvars nullvars) throws Exception {
try {
	boolean hasResults = bookscurResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = bookscurResultSet.getObject(1);
 if (resultObj != null) {
   try {   
   dclbooks.setBooksBookId(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dclbooks.setBooksBookId(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dclbooks.setBooksBookId(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dclbooks.setBooksBookId(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = bookscurResultSet.getObject(2);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   dclbooks.setBooksTitle( value,0, value.length,2,value.length);
   dclbooks.getBooksTitle().setBooksTitleLen((short) value.length);
} else {sqlca.setSqlcode(-305); }
 resultObj = bookscurResultSet.getObject(3);
 if (resultObj != null) {
   try {   
   nullvars.setPageNull( (short) 0);dclbooks.setBooksTotalPages(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dclbooks.setBooksTotalPages(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dclbooks.setBooksTotalPages(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dclbooks.setBooksTotalPages(((Double) resultObj).intValue());
   }
 } else {nullvars.setPageNull( (short) -1);
 }
 resultObj = bookscurResultSet.getObject(4);
 if (resultObj != null) {
   try {   
   nullvars.setRateNull( (short) 0);dclbooks.setBooksRating( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        dclbooks.setBooksRating( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        dclbooks.setBooksRating( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        dclbooks.setBooksRating( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
 } else {nullvars.setRateNull( (short) -1);
 }
 resultObj = bookscurResultSet.getObject(5);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   dclbooks.setBooksIsbn( value,0, value.length,2,value.length);
   dclbooks.getBooksIsbn().setBooksIsbnLen((short) value.length);
if (nullvars.getIsbnNull() != 0) nullvars.setIsbnNull( (short) 0);
 } else nullvars.setIsbnNull((short) -1 );
 resultObjString = bookscurResultSet.getString(6);
 if (resultObjString != null) {
   nullvars.setDateNull( (short) 0);dclbooks.setBooksPublishedDate( resultObjString.toCharArray() );
 } else {nullvars.setDateNull( (short) -1);
 }
 resultObj = bookscurResultSet.getObject(7);
 if (resultObj != null) {
   try {   
   nullvars.setIdNull( (short) 0);dclbooks.setBooksPublisherId(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dclbooks.setBooksPublisherId(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dclbooks.setBooksPublisherId(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dclbooks.setBooksPublisherId(((Double) resultObj).intValue());
   }
 } else {nullvars.setIdNull( (short) -1);
 }
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
 		logger.error("bookscurResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchBookscurCfbooks
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
