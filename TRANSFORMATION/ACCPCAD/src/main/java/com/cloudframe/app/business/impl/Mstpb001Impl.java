package com.cloudframe.app.business.impl;
  /* 
*****************************************************************
*                                                               *
* mstpb001 : master database api to get customer details        *
*                                                               *
*  - this is a common master data access api and while          *
*    trading application is migrated cloudframe, this           *
*    program can be retained back on mainframe for call         *
*    backs                                                      *
*                                                               *
*****************************************************************
*/
  
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.dto.mstpb001.Mstpb001Ctx.*;
import com.cloudframe.app.dto.mstpb001.Mstpb001Ctx;
import com.cloudframe.app.business.Mstpb001;
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
  import com.cloudframe.app.repository.Mstpb001Repository;
  import com.cloudframe.app.utility.CFUtil;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.mstpb001.*;
import com.cloudframe.app.dto.mstpb001.Sqlca;
import com.cloudframe.app.dto.mstpb001.LsCustomerIo;
import com.cloudframe.app.dto.mstpb001.Dcltbtrdcus;
import com.cloudframe.app.dto.mstpb001.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("mstpb001")
  
  public class Mstpb001Impl extends CommonProcess implements Mstpb001 {
  
  Logger logger = LoggerFactory.getLogger(Mstpb001Impl.class);
  
  
  @Value("${MSTPB001.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("mstpb001Repository")
  Mstpb001Repository mstpb001Repository;
  
  
  
  
  
  
      @Override
      public int setParameter(Mstpb001Ctx programCtx, String lsCustomerIo) throws Exception {
      		if(lsCustomerIo != null)
      		    programCtx.getLsCustomerIo().setString(com.cloudframe.app.data.Field.getParm(lsCustomerIo),new String(CONSTANTS.EBCDIC_ENCODING));
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
      public int process(Mstpb001Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("MSTPB001" ,dbQualifier, true/*use Dynamic SQL*/);
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

      * - lsCustomerStatus               COBOL Name: LS-CUSTOMER-STATUS
      * - lsCustomerErrorMsg             COBOL Name: LS-CUSTOMER-ERROR-MSG
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(Mstpb001Ctx programCtx) throws Exception {
//Added variable to get the output context in place.
MainlineOutCtx methodOut = programCtx.getMainlineOutCtx();

// * Set default to exception
//  cobolCode::SET 88-CUSTOMER-EXCEPTION TO TRUE
          methodOut.setCustomerException88True(); 
          
//  cobolCode::MOVE SPACES TO LS-CUSTOMER-ERROR-MSG
          methodOut.setLsCustomerErrorMsg(CONSTANTS.SPACE_200);
//  cobolCode::PERFORM 1000-GET-CUSTOMER THRU 1000-EXIT
          getCustomer(programCtx.getGetCustomerInCtx());/*1000-GET-CUSTOMER*/
//  cobolCode::GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * getCustomer 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-GET-CUSTOMER COBOL Cyclomatic complexity - 7
      * Input  :  

      * - lsCustomerId                   COBOL Name: LS-CUSTOMER-ID
      * - sqlcode                        COBOL Name: SQLCODE
      * - cusCurrency                    COBOL Name: CUS-CURRENCY
      * - cusDescription                 COBOL Name: CUS-DESCRIPTION
      * - cusStatus                      COBOL Name: CUS-STATUS
      *
      * Output :  

      * - cusCustomerId                  COBOL Name: CUS-CUSTOMER-ID
      * - lsCustomerId                   COBOL Name: LS-CUSTOMER-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - lsCustomerCurrency             COBOL Name: LS-CUSTOMER-CURRENCY
      * - cusCurrency                    COBOL Name: CUS-CURRENCY
      * - lsCustomerDescription          COBOL Name: LS-CUSTOMER-DESCRIPTION
      * - cusDescription                 COBOL Name: CUS-DESCRIPTION
      * - lsCustomerStatus               COBOL Name: LS-CUSTOMER-STATUS
      * - lsCustomerErrorMsg             COBOL Name: LS-CUSTOMER-ERROR-MSG
      *
      * @throws CFException
      */
      @Override
      public GetCustomerOutCtx getCustomer(GetCustomerInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *
//Added variable to get the program context in place.
Mstpb001Ctx programCtx = methodIn.getMstpb001Ctx();
//Added variable to get the output context in place.
GetCustomerOutCtx methodOut = methodIn.getGetCustomerOutCtx();
//  cobolCode::MOVE LS-CUSTOMER-ID TO CUS-CUSTOMER-ID
          methodOut.setCusCustomerId(methodOut.getLsCustomerId());
//  cobolCode::SELECT CUS_CURRENCY , CUS_DESCRIPTION , CUS_STATUS FROM TBTRDCUS WHERE CUS_CUSTOMER_ID = ?
          mstpb001Repository.selectTbtrdcus(programCtx.getSqlca(),methodOut.getDcltbtrdcus());
          //  FORMAT1016334848 = "----"
          methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::MOVE CUS-CURRENCY TO LS-CUSTOMER-CURRENCY
              methodOut.setLsCustomerCurrency(methodOut.getCusCurrency());
//  cobolCode::MOVE CUS-DESCRIPTION TO LS-CUSTOMER-DESCRIPTION
              methodOut.setLsCustomerDescription(methodOut.getCusDescription());
//  cobolCode::IF CUS-STATUS = 'A'
//  LITERAL_A = 'A'
              if (compareChars(methodIn.getCusStatus(), CONSTANTS.LITERAL_A) == 0) { 
//  cobolCode::SET 88-CUSTOMER-ACTIVE TO TRUE
                  methodOut.setCustomerActive88True(); 
                  
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::SET 88-CUSTOMER-INACTIVE TO TRUE
                  methodOut.setCustomerInactive88True(); 
                  
//  cobolCode::MOVE 'Customer is Inactive' TO LS-CUSTOMER-ERROR-MSG
                  methodOut.setLsCustomerErrorMsg(CONSTANTS.LITERAL_1086420419);
              }
          break;
          	case 100:
//  cobolCode::SET 88-CUSTOMER-NOT-FOUND TO TRUE
              methodOut.setCustomerNotFound88True(); 
              
//  cobolCode::MOVE 'Customer Not Found' TO LS-CUSTOMER-ERROR-MSG
              methodOut.setLsCustomerErrorMsg(CONSTANTS.LITERAL_1395303119);
          break;
          default :
//  cobolCode::SET 88-CUSTOMER-EXCEPTION TO TRUE
              methodOut.setCustomerException88True(); 
              
//  cobolCode::MOVE SPACES TO LS-CUSTOMER-ERROR-MSG
              methodOut.setLsCustomerErrorMsg(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Customer Access failed. SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO LS-CUSTOMER-ERROR-MSG END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1349680305);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getLsCustomerErrorMsg() ,joinCharArray);
              methodOut.setLsCustomerErrorMsg(  (char[])updated.get("string"));
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Mstpb001Ctx programCtx = (Mstpb001Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getLsCustomerIo().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Mstpb001Ctx programCtx = (Mstpb001Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof LsCustomerIo) {
                       	programCtx.setLsCustomerIo((LsCustomerIo) parameters[index]);
                  	} else {
                       	programCtx.getLsCustomerIo().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
