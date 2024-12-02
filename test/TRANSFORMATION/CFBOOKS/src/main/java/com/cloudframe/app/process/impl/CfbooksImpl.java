  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.cfbooks.CfbooksCtx.*;
  import com.cloudframe.app.cfbooks.CfbooksCtx;
  import com.cloudframe.app.process.Cfbooks;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.CfbooksRepository;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.cfbooks.file.*;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.utility.CFUtil;
  import java.math.BigDecimal;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.cfbooks.dto.*;
  import com.cloudframe.app.cfbooks.dto.HeaderTime;
  import com.cloudframe.app.cfbooks.dto.Sqlca;
  import com.cloudframe.app.cfbooks.dto.HeaderTitle;
  import com.cloudframe.app.cfbooks.dto.Nullvars;
  import com.cloudframe.app.cfbooks.file.records.RepOpFields;
  import com.cloudframe.app.cfbooks.dto.Vars;
  import com.cloudframe.app.cfbooks.dto.Dclbooks;
  import com.cloudframe.app.cfbooks.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("cfbooks")
  
  public class CfbooksImpl extends CommonProcess implements Cfbooks {
  
  Logger logger = LoggerFactory.getLogger(CfbooksImpl.class);
  
  
  @Value("${CFBOOKS.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("cfbooksRepository")
  CfbooksRepository cfbooksRepository;
  @Autowired 
  @Qualifier("cfbooks_repOp")
  RepOp repOp;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(CfbooksCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("CFBOOKS" ,dbQualifier, true/*use Dynamic SQL*/);
//  cobolCode::PERFORM 0000-MAIN
          main(programCtx);/*0000-MAIN*/
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(repOp.hasOpened() && !repOp.isReadOnly()) { 
      			repOp.flush(); 
      		}
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 5
      * Input  : None 

      * Output :  

      * - pageNo                         COBOL Name: WS-PAGE-NO
      * - eofFlag                        COBOL Name: EOF-FLAG
      * - errMsg                         COBOL Name: ERR-MSG
      * - writeRec                       COBOL Name: WS-WRITE-REC
      *
      * @throws CFException
      */
      @Override
      public MainOutCtx main(CfbooksCtx programCtx) throws Exception {
//Added variable to get the output context in place.
MainOutCtx methodOut = programCtx.getMainOutCtx();
//  cobolCode::PERFORM 1000-INITIALIZE THRU 1000-EXIT
          initialize(programCtx.getInitializeInCtx());/*1000-INITIALIZE*/
          methodOut.setPageNo(1);
//  cobolCode::PERFORM 1100-WRITE-HEADER THRU 1100-EXIT
          writeHeader(programCtx.getWriteHeaderInCtx());/*1100-WRITE-HEADER*/

// * Extract all books from database and generate report
//  cobolCode::MOVE SPACES TO EOF-FLAG
          methodOut.setEofFlag(CONSTANTS.SPACE);
//  cobolCode::SELECT BOOK_ID , RTRIM ( TITLE ) , TOTAL_PAGES , RATING , ISBN , PUBLISHED_DATE , PUBLISHER_ID FROM BOOKS WITH UR
          programCtx.setBookscurResultSet(cfbooksRepository.openBookscurCfbooks(programCtx.getSqlca()));
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B10_OPENINGBOOKSCUR);
//  cobolCode::PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/
//  cobolCode::PERFORM 1200-FETCH-CURSOR THRU 1200-EXIT
          fetchCursor(programCtx);/*1200-FETCH-CURSOR*/

// *

// *
//  cobolCode::PERFORM 2000-SQLMAIN THRU 2000-EXIT UNTIL END-OF-FILE
          while (!(methodOut.isEndOfFile()) ) {
             sqlmain(programCtx.getSqlmainInCtx());/*2000-SQLMAIN*/
          }
//  cobolCode::SET 88-DONT-WRITE-REC TO TRUE
          methodOut.setDontWriteRec88True(); 
          
//  cobolCode::CLOSE BOOKSCUR
          cfbooksRepository.closeBookscurCfbooks(programCtx.getBookscurResultSet(),programCtx.getSqlca());
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B10_CLOSINGBOOKSCUR);
//  cobolCode::PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/

// *
//  cobolCode::PERFORM 3000-HOUSEKEEPING THRU 3000-EXIT
          housekeeping(programCtx.getHousekeepingInCtx());/*3000-HOUSEKEEPING*/
//  cobolCode::STOP RUN
          throw Terminate.TERMINATE;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - timestamp                      COBOL Name: WS-TIMESTAMP
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - errMsg                         COBOL Name: ERR-MSG
      * - dateR                          COBOL Name: WS-DATE-R
      * - timestamp                      COBOL Name: WS-TIMESTAMP
      * - timeR                          COBOL Name: WS-TIME-R
      * - repopStat                      COBOL Name: REPOP-STAT
      * - booksTitleText                 COBOL Name: BOOKS-TITLE-TEXT
      * - booksIsbnText                  COBOL Name: BOOKS-ISBN-TEXT
      * - booksTitleLen                  COBOL Name: BOOKS-TITLE-LEN
      * - booksIsbnLen                   COBOL Name: BOOKS-ISBN-LEN
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
//Added variable to get the program context in place.
CfbooksCtx programCtx = methodIn.getCfbooksCtx();
//Added variable to get the output context in place.
InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
          methodOut.setErrLoc(CONSTANTS.LITERAL_1000_MN_INITALIZE_B6_);
//  cobolCode::SELECT CURRENT_TIMESTAMP FROM SYSIBM.SYSDUMMY1
          
/**
******      SELECT CURRENT_TIMESTAMP                               
******      INTO :WS-TIMESTAMP                                     
******      FROM SYSIBM.SYSDUMMY1                                  
**/
          methodOut.setSqlcode(0);
          methodOut.setTimestamp(db2Base.getCurrentTimestamp()); 
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_WITHTIMESTAMP);
//  cobolCode::PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/
//  cobolCode::MOVE WS-TIMESTAMP (1 : 10) TO WS-DATE-R
          methodOut.setDateR(methodOut.getTimestamp());
//  cobolCode::MOVE WS-TIMESTAMP (12 : 12) TO WS-TIME-R
          methodIn.getHeaderTime().replace(methodOut.getVars()/*parent*/,0+12 - 1/*fromOffset - (timeR) */,12/*fromLen*/,119/*toOffset - (timestamp) */,12/*toLen*/);
//  cobolCode::MOVE '2021-10-13' TO WS-DATE-R
//  LITERAL_2021_MN2_1013 = '2021-10-13'
          methodOut.setDateR(CONSTANTS.LITERAL_2021_MN2_1013);
//  cobolCode::MOVE '15.51.03.325' TO WS-TIME-R
//  LITERAL_486634995 = '15.51.03.325'
          methodOut.setTimeR(CONSTANTS.LITERAL_486634995);
//  cobolCode::OPEN OUTPUT REP-OP
          repOp.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),repOp.getFileName(),repOp.getRepOpCharSet(),repOp.getRepOpCrlfFlag());
          methodOut.setRepopStat(repOp.getStatus() );
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_OPENINGREP_MN_OP);
//  cobolCode::PERFORM 9998-FILE-ERR-CHK THRU 9998-EXIT
          fileErrChk(programCtx.getFileErrChkInCtx());/*9998-FILE-ERR-CHK*/
//  cobolCode::MOVE SPACES TO BOOKS-TITLE-TEXT BOOKS-ISBN-TEXT
          methodOut.setBooksTitleText(CONSTANTS.SPACE_255);
          methodOut.setBooksIsbnText(CONSTANTS.SPACE_13);
//  cobolCode::MOVE 0 TO BOOKS-TITLE-LEN BOOKS-ISBN-LEN
          methodOut.setBooksTitleLen((short)0);
          methodOut.setBooksIsbnLen((short)0);
      
      return methodOut;
      }
      /**
      * writeHeader 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-WRITE-HEADER COBOL Cyclomatic complexity - 1
      * Input  :  

      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - repopStat                      COBOL Name: REPOP-STAT
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * @throws CFException
      */
      @Override
      public WriteHeaderOutCtx writeHeader(WriteHeaderInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------

// * Write header records
//Added variable to get the program context in place.
CfbooksCtx programCtx = methodIn.getCfbooksCtx();
//Added variable to get the output context in place.
WriteHeaderOutCtx methodOut = methodIn.getWriteHeaderOutCtx();
          methodOut.setErrLoc(CONSTANTS.LITERAL_1100_MN2_WRITEHEADER_B3_);
//  cobolCode::WRITE REP-OP-FIELDS FROM WS-HEADER-TITLE
          repOp.write(methodIn.getHeaderTitle().toCharArray()); 
          methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
          methodOut.setRepopStat(repOp.getStatus() );
//  cobolCode::WRITE REP-OP-FIELDS FROM WS-HEADER-TIME
          repOp.write(methodIn.getHeaderTime().toCharArray()); 
          methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
          methodOut.setRepopStat(repOp.getStatus() );
//  cobolCode::WRITE REP-OP-FIELDS FROM WS-SPACE
          repOp.write(methodIn.getSpace()); 
          methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
          methodOut.setRepopStat(repOp.getStatus() );
//  cobolCode::WRITE REP-OP-FIELDS FROM WS-SPACE
          repOp.write(methodIn.getSpace()); 
          methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
          methodOut.setRepopStat(repOp.getStatus() );
//  cobolCode::WRITE REP-OP-FIELDS FROM WS-HEADER-LABEL
          repOp.write(methodIn.getHeaderLabel()); 
          methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
          methodOut.setRepopStat(repOp.getStatus() );
//  cobolCode::WRITE REP-OP-FIELDS FROM WS-HEADER-LINE
          repOp.write(methodIn.getHeaderLine()); 
          methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
          methodOut.setRepopStat(repOp.getStatus() );
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_WRITINGHEADER);
//  cobolCode::PERFORM 9998-FILE-ERR-CHK THRU 9998-EXIT
          fileErrChk(programCtx.getFileErrChkInCtx());/*9998-FILE-ERR-CHK*/
      
      return methodOut;
      }
      /**
      * fetchCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-FETCH-CURSOR COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * @throws CFException
      */
      @Override
      public FetchCursorOutCtx fetchCursor(CfbooksCtx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
//Added variable to get the output context in place.
FetchCursorOutCtx methodOut = programCtx.getFetchCursorOutCtx();
          methodOut.setErrLoc(CONSTANTS.LITERAL_1200_MN2_FETCHCURSOR_B3_);
//  cobolCode::FETCH BOOKSCUR INTO ? , ? , ? , ? , ? , ? , ?
          cfbooksRepository.fetchBookscurCfbooks(programCtx.getBookscurResultSet(),programCtx.getSqlca(),methodOut.getDclbooks(),methodOut.getNullvars());
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B9_FETCHINGBOOKSCUR);
//  cobolCode::PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/
      
      return methodOut;
      }
      /**
      * sqlmain 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-SQLMAIN COBOL Cyclomatic complexity - 17
      * Input  :  

      * - booksBookId                    COBOL Name: BOOKS-BOOK-ID
      * - booksTotalPages                COBOL Name: BOOKS-TOTAL-PAGES
      * - booksRating                    COBOL Name: BOOKS-RATING
      * - booksIsbnText                  COBOL Name: BOOKS-ISBN-TEXT
      * - booksPublishedDate             COBOL Name: BOOKS-PUBLISHED-DATE
      * - booksPublisherId               COBOL Name: BOOKS-PUBLISHER-ID
      * - booksTitleLen                  COBOL Name: BOOKS-TITLE-LEN
      * - booksTitleText                 COBOL Name: BOOKS-TITLE-TEXT
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      * - bookid                         COBOL Name: WS-BOOKID
      * - booksBookId                    COBOL Name: BOOKS-BOOK-ID
      * - opBookid                       COBOL Name: OP-BOOKID
      * - pages                          COBOL Name: WS-PAGES
      * - booksTotalPages                COBOL Name: BOOKS-TOTAL-PAGES
      * - opPages                        COBOL Name: OP-PAGES
      * - rating                         COBOL Name: WS-RATING
      * - booksRating                    COBOL Name: BOOKS-RATING
      * - opRating                       COBOL Name: OP-RATING
      * - opIsbn                         COBOL Name: OP-ISBN
      * - booksIsbnText                  COBOL Name: BOOKS-ISBN-TEXT
      * - opPubdate                      COBOL Name: OP-PUBDATE
      * - booksPublishedDate             COBOL Name: BOOKS-PUBLISHED-DATE
      * - pubid                          COBOL Name: WS-PUBID
      * - booksPublisherId               COBOL Name: BOOKS-PUBLISHER-ID
      * - opPubid                        COBOL Name: OP-PUBID
      * - opTitle                        COBOL Name: OP-TITLE
      * - booksTitleText                 COBOL Name: BOOKS-TITLE-TEXT
      * - booksTitleLen                  COBOL Name: BOOKS-TITLE-LEN
      * - booksIsbnLen                   COBOL Name: BOOKS-ISBN-LEN
      *
      * @throws CFException
      */
      @Override
      public SqlmainOutCtx sqlmain(SqlmainInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
//Added variable to get the program context in place.
CfbooksCtx programCtx = methodIn.getCfbooksCtx();
//Added variable to get the output context in place.
SqlmainOutCtx methodOut = methodIn.getSqlmainOutCtx();
          methodOut.setErrLoc(CONSTANTS.LITERAL_2000_MN_SQLMAIN_B8_);
//  cobolCode::MOVE SPACES TO REP-OP-FIELDS
          methodOut.getRepOpFields().setString(CONSTANTS.SPACE_132);
          methodOut.setBookid(methodOut.getBooksBookId());
//  cobolCode::MOVE WS-BOOKID TO OP-BOOKID
          methodOut.setOpBookid(String.valueOf(methodOut.getBookidString()).toCharArray());
//  cobolCode::MOVE BOOKS-TOTAL-PAGES TO WS-PAGES
          methodOut.setPages(methodOut.getBooksTotalPages());
//  cobolCode::MOVE WS-PAGES TO OP-PAGES
          methodOut.setOpPages(String.valueOf(methodOut.getPagesString()).toCharArray());
//  cobolCode::MOVE BOOKS-RATING TO WS-RATING
//  FORMAT_1027458795 = "9.99"
          methodOut.setRating(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1027458795,methodOut.getBooksRating().toPlainString().toCharArray()));
//  cobolCode::MOVE WS-RATING TO OP-RATING
          methodOut.setOpRating(methodOut.getRating());
//  cobolCode::MOVE BOOKS-ISBN-TEXT TO OP-ISBN
          methodOut.setOpIsbn(methodOut.getBooksIsbnText());
//  cobolCode::MOVE BOOKS-PUBLISHED-DATE TO OP-PUBDATE
          methodOut.setOpPubdate(methodOut.getBooksPublishedDate());
//  cobolCode::MOVE BOOKS-PUBLISHER-ID TO WS-PUBID
          methodOut.setPubid(methodOut.getBooksPublisherId());
//  cobolCode::MOVE WS-PUBID TO OP-PUBID
          methodOut.setOpPubid(String.valueOf(methodOut.getPubidString()).toCharArray());
//  cobolCode::EVALUATE TRUE
          if  (	( methodOut.getBooksTitleLen() > 228 ) ) { 
//  cobolCode::STRING BOOKS-TITLE-TEXT (1 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodOut.getBooksTitleText(),0,76));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getOpTitle() ,joinCharArray);
              methodOut.setOpTitle(  (char[])updated.get("string"));
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
//  cobolCode::STRING BOOKS-TITLE-TEXT (77 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodOut.getBooksTitleText(),76,152));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getOpTitle() ,joinCharArray);
              methodOut.setOpTitle(  (char[])updated.get("string"));
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
//  cobolCode::STRING BOOKS-TITLE-TEXT (153 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodOut.getBooksTitleText(),152,228));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getOpTitle() ,joinCharArray);
              methodOut.setOpTitle(  (char[])updated.get("string"));
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
//  cobolCode::MOVE BOOKS-TITLE-TEXT (229 : 27) TO OP-TITLE
              methodOut.getRepOpFields().replace(methodIn.getDclbooks()/*parent*/,6+229 - 1/*fromOffset - (opTitle) */,27/*fromLen*/,9/*toOffset - (booksTitleText) */,77/*toLen*/);
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
          }
          else if  (	( methodOut.getBooksTitleLen() > 152 ) ) { 
//  cobolCode::STRING BOOKS-TITLE-TEXT (1 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodOut.getBooksTitleText(),0,76));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getOpTitle() ,joinCharArray);
              methodOut.setOpTitle(  (char[])updated.get("string"));
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
//  cobolCode::STRING BOOKS-TITLE-TEXT (77 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodOut.getBooksTitleText(),76,152));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getOpTitle() ,joinCharArray);
              methodOut.setOpTitle(  (char[])updated.get("string"));
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
//  cobolCode::MOVE BOOKS-TITLE-TEXT (153 : 77) TO OP-TITLE
              methodOut.getRepOpFields().replace(methodIn.getDclbooks()/*parent*/,6+153 - 1/*fromOffset - (opTitle) */,77/*fromLen*/,9/*toOffset - (booksTitleText) */,77/*toLen*/);
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
          }
          else if  (	( methodOut.getBooksTitleLen() > 77 ) ) { 
//  cobolCode::STRING BOOKS-TITLE-TEXT (1 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodOut.getBooksTitleText(),0,76));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getOpTitle() ,joinCharArray);
              methodOut.setOpTitle(  (char[])updated.get("string"));
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
//  cobolCode::MOVE BOOKS-TITLE-TEXT (77 : 77) TO OP-TITLE
              methodOut.getRepOpFields().replace(methodIn.getDclbooks()/*parent*/,6+77 - 1/*fromOffset - (opTitle) */,77/*fromLen*/,9/*toOffset - (booksTitleText) */,77/*toLen*/);
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
          }
          else   { 
//  cobolCode::MOVE BOOKS-TITLE-TEXT (1 : 77) TO OP-TITLE
              methodOut.getRepOpFields().replace(methodIn.getDclbooks()/*parent*/,6/*fromOffset - (opTitle) */,77/*fromLen*/,9/*toOffset - (booksTitleText) */,77/*toLen*/);
//  cobolCode::PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord(programCtx.getWriteRecordInCtx());/*2100-WRITE-RECORD*/
          }
//  cobolCode::MOVE SPACES TO BOOKS-TITLE-TEXT BOOKS-ISBN-TEXT
          methodOut.setBooksTitleText(CONSTANTS.SPACE_255);
          methodOut.setBooksIsbnText(CONSTANTS.SPACE_13);
//  cobolCode::MOVE 0 TO BOOKS-TITLE-LEN BOOKS-ISBN-LEN
          methodOut.setBooksTitleLen((short)0);
          methodOut.setBooksIsbnLen((short)0);
//  cobolCode::PERFORM 1200-FETCH-CURSOR THRU 1200-EXIT
          fetchCursor(programCtx);/*1200-FETCH-CURSOR*/
      
      return methodOut;
      }
      /**
      * writeRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-WRITE-RECORD COBOL Cyclomatic complexity - 3
      * Input  :  

      * - writeRec                       COBOL Name: WS-WRITE-REC
      * - recCount                       COBOL Name: WS-REC-COUNT
      * - pageNo                         COBOL Name: WS-PAGE-NO
      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - recCount                       COBOL Name: WS-REC-COUNT
      * - pageNo                         COBOL Name: WS-PAGE-NO
      * - recBuffer                      COBOL Name: WS-REC-BUFFER
      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      * - repopStat                      COBOL Name: REPOP-STAT
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * @throws CFException
      */
      @Override
      public WriteRecordOutCtx writeRecord(WriteRecordInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
//Added variable to get the program context in place.
CfbooksCtx programCtx = methodIn.getCfbooksCtx();
//Added variable to get the output context in place.
WriteRecordOutCtx methodOut = methodIn.getWriteRecordOutCtx();
          methodOut.setErrLoc(CONSTANTS.LITERAL_2100_MN2_WRITERECORD_B3_);
//  cobolCode::IF 88-DONT-WRITE-REC THEN
          if ( methodIn.isDontWriteRec88()  ) { 
//cobolCode::GO TO 2100-EXIT
return methodOut;
//cobolCodeEnds::GO TO 2100-EXIT
          }
//  cobolCode::IF WS-REC-COUNT = 30
          if (	( methodOut.getRecCount() == 30 )) { 
              methodOut.setRecCount(0);
//  cobolCode::ADD 1 TO WS-PAGE-NO
              methodOut.setPageNo(methodOut.getPageNo()+1);
              methodOut.setRecBuffer(methodOut.getRepOpFields().toCharArray());
//  cobolCode::WRITE REP-OP-FIELDS FROM WS-PAGE-BREAK
              repOp.write(methodIn.getPageBreak()); 
              methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
              methodOut.setRepopStat(repOp.getStatus() );
//  cobolCode::WRITE REP-OP-FIELDS FROM WS-SPACE
              repOp.write(methodIn.getSpace()); 
              methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
              methodOut.setRepopStat(repOp.getStatus() );
//  cobolCode::PERFORM 1100-WRITE-HEADER THRU 1100-EXIT
              writeHeader(programCtx.getWriteHeaderInCtx());/*1100-WRITE-HEADER*/
//  cobolCode::MOVE WS-REC-BUFFER TO REP-OP-FIELDS
              methodOut.getRepOpFields().setString(methodOut.getRecBuffer());
          }
//  cobolCode::WRITE REP-OP-FIELDS
          repOp.write(methodOut.getRepOpFields().toCharArray()); 
          methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
          methodOut.setRepopStat(repOp.getStatus() );
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_WRITINGREP_MN_OP);
//  cobolCode::PERFORM 9998-FILE-ERR-CHK THRU 9998-EXIT
          fileErrChk(programCtx.getFileErrChkInCtx());/*9998-FILE-ERR-CHK*/
//  cobolCode::ADD 1 TO WS-REC-COUNT
          methodOut.setRecCount(methodOut.getRecCount()+1);
//  cobolCode::MOVE SPACES TO REP-OP-FIELDS
          methodOut.getRepOpFields().setString(CONSTANTS.SPACE_132);
      
      return methodOut;
      }
      /**
      * housekeeping 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-HOUSEKEEPING COBOL Cyclomatic complexity - 1
      * Input  :  

      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - repopStat                      COBOL Name: REPOP-STAT
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * @throws CFException
      */
      @Override
      public HousekeepingOutCtx housekeeping(HousekeepingInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------

// * Write footer record and close the report file

// *
//Added variable to get the program context in place.
CfbooksCtx programCtx = methodIn.getCfbooksCtx();
//Added variable to get the output context in place.
HousekeepingOutCtx methodOut = methodIn.getHousekeepingOutCtx();
          methodOut.setErrLoc(CONSTANTS.LITERAL_3000_MN_HOUSEKEEPING_B3_);
//  cobolCode::WRITE REP-OP-FIELDS FROM WS-FOOTER
          repOp.write(methodIn.getFooter()); 
          methodOut.getRepOpFields().setString(CONSTANTS.LOW_VALUE_215751987);
          methodOut.setRepopStat(repOp.getStatus() );
//  cobolCode::CLOSE REP-OP
          repOp.close(); 
          methodOut.setRepopStat(repOp.getStatus() );
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_CLOSINGREP_MN_OP);
//  cobolCode::PERFORM 9998-FILE-ERR-CHK THRU 9998-EXIT
          fileErrChk(programCtx.getFileErrChkInCtx());/*9998-FILE-ERR-CHK*/
      
      return methodOut;
      }
      /**
      * fileErrChk 
      *   This method is derived from 
  *   COBOL Paragraph - 9998-FILE-ERR-CHK COBOL Cyclomatic complexity - 4
      * Input  :  

      * - repopStat                      COBOL Name: REPOP-STAT
      * - errPgm                         COBOL Name: ERR-PGM
      * - errLoc                         COBOL Name: ERR-LOC
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void fileErrChk(FileErrChkInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
//Added variable to get the program context in place.
CfbooksCtx programCtx = methodIn.getCfbooksCtx();
//  cobolCode::EVALUATE TRUE
          if  (	( methodIn.getRepopStat() == 0 )) { 
              ;
          }
          else   { 
//  cobolCode::DISPLAY 'FILE ERROR'
              logger.info("FILE ERROR"); 
//  cobolCode::DISPLAY 'PROG: ' ERR-PGM
              logger.info("PROG: {}", new String(methodIn.getErrPgm())); 
//  cobolCode::DISPLAY '  IN: ' ERR-LOC
              logger.info("  IN: {}", new String(methodIn.getErrLoc())); 
//  cobolCode::DISPLAY ' MSG: ' ERR-MSG
              logger.info(" MSG: {}", new String(methodIn.getErrMsg())); 
//  cobolCode::DISPLAY 'CODE: ' REPOP-STAT
              logger.info("CODE: {}", String.valueOf(methodIn.getRepopStat())); 
//  cobolCode::STOP RUN
              throw Terminate.TERMINATE;
          }
      
      }
      /**
      * sqlErrChk 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-SQL-ERR-CHK COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - errPgm                         COBOL Name: ERR-PGM
      * - errLoc                         COBOL Name: ERR-LOC
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * Output :  

      * - errCode                        COBOL Name: ERR-CODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - eofFlag                        COBOL Name: EOF-FLAG
      *
      * @throws CFException
      */
      @Override
      public SqlErrChkOutCtx sqlErrChk(SqlErrChkInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
//Added variable to get the program context in place.
CfbooksCtx programCtx = methodIn.getCfbooksCtx();
//Added variable to get the output context in place.
SqlErrChkOutCtx methodOut = methodIn.getSqlErrChkOutCtx();
          methodOut.setErrCode(methodOut.getSqlcode());
//  cobolCode::EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else if  (	( methodOut.getSqlcode() == 100 )) { 
              //  LITERAL_Y = 'Y'
              methodOut.setEofFlag(CONSTANTS.LITERAL_Y);
          }
          else   { 
//  cobolCode::DISPLAY '---SQL ERROR---'
              logger.info("---SQL ERROR---"); 
//  cobolCode::DISPLAY 'PROG: ' ERR-PGM
              logger.info("PROG: {}", new String(methodIn.getErrPgm())); 
//  cobolCode::DISPLAY '  IN: ' ERR-LOC
              logger.info("  IN: {}", new String(methodIn.getErrLoc())); 
//  cobolCode::DISPLAY ' MSG: ' ERR-MSG
              logger.info(" MSG: {}", new String(methodIn.getErrMsg())); 
//  cobolCode::DISPLAY 'CODE: ' ERR-CODE
              logger.info("CODE: {}", String.valueOf(methodOut.getErrCode())); 
//  cobolCode::STOP RUN
              throw Terminate.TERMINATE;
          }
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
