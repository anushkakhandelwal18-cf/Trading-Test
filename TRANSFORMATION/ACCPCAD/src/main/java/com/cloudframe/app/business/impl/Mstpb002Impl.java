package com.cloudframe.app.business.impl;
  /* 
*****************************************************************
*                                                               *
* mstpb002 : master database api to get security details        *
*                                                               *
*  - this is a common master data access api and while          *
*    trading application is migrated cloudframe, this           *
*    program can be retained back on mainframe for call         *
*    backs                                                      *
*                                                               *
*****************************************************************
*/
  
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.dto.mstpb002.Mstpb002Ctx.*;
import com.cloudframe.app.dto.mstpb002.Mstpb002Ctx;
import com.cloudframe.app.business.Mstpb002;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.Mstpb002Repository;
  import com.cloudframe.app.utility.CFUtil;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.mstpb002.*;
import com.cloudframe.app.dto.mstpb002.LsSecurityIo;
import com.cloudframe.app.dto.mstpb002.Sqlca;
import com.cloudframe.app.dto.mstpb002.Dcltbtrdsec;
import com.cloudframe.app.dto.mstpb002.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("mstpb002")
  
  public class Mstpb002Impl extends CommonProcess implements Mstpb002 {
  
  Logger logger = LoggerFactory.getLogger(Mstpb002Impl.class);
  
  
  @Value("${MSTPB002.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("mstpb002Repository")
  Mstpb002Repository mstpb002Repository;
  
  
  
  
  
  
      @Override
      public int setParameter(Mstpb002Ctx programCtx, String lsSecurityIo) throws Exception {
      		if(lsSecurityIo != null)
      		    programCtx.getLsSecurityIo().setString(com.cloudframe.app.data.Field.getParm(lsSecurityIo),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Mstpb002Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("MSTPB002" ,dbQualifier, true/*use Dynamic SQL*/);
//Added variable to get the output context in place.
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  cobolCode::PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - lsSecurityStatus               COBOL Name: LS-SECURITY-STATUS
      * - lsSecurityErrorMsg             COBOL Name: LS-SECURITY-ERROR-MSG
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(Mstpb002Ctx programCtx) throws Exception {
//Added variable to get the output context in place.
MainlineOutCtx methodOut = programCtx.getMainlineOutCtx();

// *
// * Set default to exception
//  cobolCode::SET 88-SECURITY-EXCEPTION TO TRUE
          methodOut.setSecurityException88True(); 
          
//  cobolCode::MOVE SPACES TO LS-SECURITY-ERROR-MSG
          methodOut.setLsSecurityErrorMsg(CONSTANTS.SPACE_200);
//  cobolCode::PERFORM 1000-GET-SECURITY THRU 1000-EXIT
          getSecurity(programCtx.getGetSecurityInCtx());/*1000-GET-SECURITY*/
//  cobolCode::GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * getSecurity 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-GET-SECURITY COBOL Cyclomatic complexity - 6
      * Input  :  

      * - lsFigi                         COBOL Name: LS-FIGI
      * - sqlcode                        COBOL Name: SQLCODE
      * - secCurrency                    COBOL Name: SEC-CURRENCY
      * - secDescription                 COBOL Name: SEC-DESCRIPTION
      * - secSymbol                      COBOL Name: SEC-SYMBOL
      * - secShareClassFigi              COBOL Name: SEC-SHARE-CLASS-FIGI
      * - secType                        COBOL Name: SEC-TYPE
      *
      * Output :  

      * - secFigi                        COBOL Name: SEC-FIGI
      * - lsFigi                         COBOL Name: LS-FIGI
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - lsCurrency                     COBOL Name: LS-CURRENCY
      * - secCurrency                    COBOL Name: SEC-CURRENCY
      * - lsDescription                  COBOL Name: LS-DESCRIPTION
      * - secDescription                 COBOL Name: SEC-DESCRIPTION
      * - lsSymbol                       COBOL Name: LS-SYMBOL
      * - secSymbol                      COBOL Name: SEC-SYMBOL
      * - lsShareClassFigi               COBOL Name: LS-SHARE-CLASS-FIGI
      * - secShareClassFigi              COBOL Name: SEC-SHARE-CLASS-FIGI
      * - lsType                         COBOL Name: LS-TYPE
      * - secType                        COBOL Name: SEC-TYPE
      * - lsSecurityStatus               COBOL Name: LS-SECURITY-STATUS
      * - lsSecurityErrorMsg             COBOL Name: LS-SECURITY-ERROR-MSG
      *
      * @throws CFException
      */
      @Override
      public GetSecurityOutCtx getSecurity(GetSecurityInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *
//Added variable to get the program context in place.
Mstpb002Ctx programCtx = methodIn.getMstpb002Ctx();
//Added variable to get the output context in place.
GetSecurityOutCtx methodOut = methodIn.getGetSecurityOutCtx();
//  cobolCode::MOVE LS-FIGI TO SEC-FIGI
          methodOut.setSecFigi(methodOut.getLsFigi());
//  cobolCode::SELECT SEC_CURRENCY , SEC_DESCRIPTION , SEC_SYMBOL , SEC_SHARE_CLASS_FIGI , SEC_TYPE FROM TBTRDSEC WHERE SEC_FIGI = ?
          mstpb002Repository.selectTbtrdsec(methodOut.getDcltbtrdsec(),programCtx.getSqlca());
          //  FORMAT1016334848 = "----"
          methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::MOVE SEC-CURRENCY TO LS-CURRENCY
              methodOut.setLsCurrency(methodOut.getSecCurrency());
//  cobolCode::MOVE SEC-DESCRIPTION TO LS-DESCRIPTION
              methodOut.setLsDescription(methodOut.getSecDescription());
//  cobolCode::MOVE SEC-SYMBOL TO LS-SYMBOL
              methodOut.setLsSymbol(methodOut.getSecSymbol());
//  cobolCode::MOVE SEC-SHARE-CLASS-FIGI TO LS-SHARE-CLASS-FIGI
              methodOut.setLsShareClassFigi(methodOut.getSecShareClassFigi());
//  cobolCode::MOVE SEC-TYPE TO LS-TYPE
              methodOut.setLsType(methodOut.getSecType());
//  cobolCode::SET 88-SECURITY-ACTIVE TO TRUE
              methodOut.setSecurityActive88True(); 
              
          break;
          	case 100:
//  cobolCode::SET 88-SECURITY-NOT-FOUND TO TRUE
              methodOut.setSecurityNotFound88True(); 
              
//  cobolCode::MOVE 'SECURITY Not Found' TO LS-SECURITY-ERROR-MSG
              methodOut.setLsSecurityErrorMsg(CONSTANTS.LITERAL_1961717773);
          break;
          default :
//  cobolCode::SET 88-SECURITY-EXCEPTION TO TRUE
              methodOut.setSecurityException88True(); 
              
//  cobolCode::MOVE SPACES TO LS-SECURITY-ERROR-MSG
              methodOut.setLsSecurityErrorMsg(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'SECURITY Access failed. SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO LS-SECURITY-ERROR-MSG END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_679803187);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getLsSecurityErrorMsg() ,joinCharArray);
              methodOut.setLsSecurityErrorMsg(  (char[])updated.get("string"));
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Mstpb002Ctx programCtx = (Mstpb002Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getLsSecurityIo().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Mstpb002Ctx programCtx = (Mstpb002Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof LsSecurityIo) {
                       	programCtx.setLsSecurityIo((LsSecurityIo) parameters[index]);
                  	} else {
                       	programCtx.getLsSecurityIo().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
