package com.cloudframe.app.dto.trdpb001;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:40. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.trdpb001.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private int tradeCount;

								private char[] sqlcode_Ws = Field.fillLowValue(4);

								private long tradeid;

						private char[] sacBooking = new char[8];

						private char[] macBooking = new char[8];

						private char[] customerSummaryWriteSw = Field.fillLowValue(1);

						private char[] summaryDebitCreditSw = Field.fillLowValue(1);

						private char[] settlementSwitch = new char[1];

						private char[] retrySwitch = Field.fillLowValue(1);

						private char[] orderStatus = Field.fillLowValue(3);

						private char[] exception = Field.fillLowValue(200);

						private char[] exceptionHandler = new char[16];

						private char[] currdate = Field.fillLowValue(10);

						private char[] currtime = Field.fillLowValue(8);

						private char[] excpType = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSacBooking(("TRDPB002").toCharArray());
								setMacBooking(("TRDPB003").toCharArray());
								setSettlementSwitch(fillSpace(1));
								setExceptionHandler(("TRDPBEXC        ").toCharArray());
    }


 

	/**
	 *	Returns the value of tradeCount
	 *	@return tradeCount
	 */
	public int getTradeCount() throws CFException {
   		return tradeCount;
	}
	
	/**
	 * 	Update TradeCount with the passed value
	 *  Corresponding COBOL Variable is WS-TRADE-COUNT
	 *	@param number
	 */
	public void setTradeCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tradeCount = checkTradeCountMaxLimit(number); 
	}


	public void setTradeCount(long number) {
	    number = checkTradeCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTradeCount((int)number);
	}
	
	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException{
     if (isSqlcode_WsModified()) { 
        sqlcode_Ws = refreshSqlcode_Ws();
     }
   		return sqlcode_Ws;
   }

  
	/**
	*  set variable sqlcode_Ws
	*  Corresponding COBOL Variable is WS-SQLCODE
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) {
      sqlcode_Ws = checkSqlcode_WsConstraints(value);
      serializeSqlcode_Ws(sqlcode_Ws);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
       replace(source,0,source.length(),beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tradeid
	 *	@return tradeid
	 */
	public long getTradeid() throws CFException {
       if (isTradeidModified()) { 
           tradeid = refreshTradeid();
        }
   		return tradeid;
	}
	

	
	   
	/**
	 * 	Update Tradeid with the passed value
	 *  Corresponding COBOL Variable is WS-TRADEID
	 *	@param number
	 */
	public void setTradeid(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tradeid = checkTradeidMaxLimit(number); 
		serializeTradeid(tradeid);
	}
	

	/**
	 * 	Update Tradeid with the passed value
	 *	@param value (String or char[])
	 */
	public void setTradeid(char[] value) throws CFException {
		 tradeid = serializeTradeid(value);
	}
	/**
	 * 	Update Tradeid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTradeidString(char[] value) throws CFException {
		 setTradeid(value);
	}
	/**
	 *	Returns the value of sacBooking
	 *	@return sacBooking
	 */
   public char[] getSacBooking() throws CFException{
   		return sacBooking;
   }

  
	/**
	*  set variable sacBooking
	*  Corresponding COBOL Variable is WS-SAC-BOOKING
	*  @param value
	**/
   public void setSacBooking(char[] value) {
       value = checkSacBookingConstraints(value);
       arraycopy(value,0,sacBooking,0,value.length);
   } 
	public void setSacBooking(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sacBooking,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of macBooking
	 *	@return macBooking
	 */
   public char[] getMacBooking() throws CFException{
   		return macBooking;
   }

  
	/**
	*  set variable macBooking
	*  Corresponding COBOL Variable is WS-MAC-BOOKING
	*  @param value
	**/
   public void setMacBooking(char[] value) {
       value = checkMacBookingConstraints(value);
       arraycopy(value,0,macBooking,0,value.length);
   } 
	public void setMacBooking(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,macBooking,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of customerSummaryWriteSw
	 *	@return customerSummaryWriteSw
	 */
   public char[] getCustomerSummaryWriteSw() throws CFException{
   		return customerSummaryWriteSw;
   }

  
	/**
	*  set variable customerSummaryWriteSw
	*  Corresponding COBOL Variable is WS-CUSTOMER-SUMMARY-WRITE-SW
	*  @param value
	**/
   public void setCustomerSummaryWriteSw(char[] value) {
       value = checkCustomerSummaryWriteSwConstraints(value);
       arraycopy(value,0,customerSummaryWriteSw,0,value.length);
   } 
	public void setCustomerSummaryWriteSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,customerSummaryWriteSw,0,beginIndex + endIndex);
   }
	char[] customerSummaryWrite8888Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isCustomerSummaryWrite88()
	 *	@return  Returns true if isCustomerSummaryWrite88() is "W"
	 */
   public boolean isCustomerSummaryWrite88() throws CFException {
      return (  compareChars( getCustomerSummaryWriteSw() , customerSummaryWrite8888Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setCustomerSummaryWrite88True() {  			
    	setCustomerSummaryWriteSw( customerSummaryWrite8888Value);
   	}
	char[] customerSummaryRewrite8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isCustomerSummaryRewrite88()
	 *	@return  Returns true if isCustomerSummaryRewrite88() is "R"
	 */
   public boolean isCustomerSummaryRewrite88() throws CFException {
      return (  compareChars( getCustomerSummaryWriteSw() , customerSummaryRewrite8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setCustomerSummaryRewrite88True() {  			
    	setCustomerSummaryWriteSw( customerSummaryRewrite8888Value);
   	}
	/**
	 *	Returns the value of summaryDebitCreditSw
	 *	@return summaryDebitCreditSw
	 */
   public char[] getSummaryDebitCreditSw() throws CFException{
   		return summaryDebitCreditSw;
   }

  
	/**
	*  set variable summaryDebitCreditSw
	*  Corresponding COBOL Variable is WS-SUMMARY-DEBIT-CREDIT-SW
	*  @param value
	**/
   public void setSummaryDebitCreditSw(char[] value) {
       value = checkSummaryDebitCreditSwConstraints(value);
       arraycopy(value,0,summaryDebitCreditSw,0,value.length);
   } 
	public void setSummaryDebitCreditSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,summaryDebitCreditSw,0,beginIndex + endIndex);
   }
	char[] summaryDebit8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isSummaryDebit88()
	 *	@return  Returns true if isSummaryDebit88() is "D"
	 */
   public boolean isSummaryDebit88() throws CFException {
      return (  compareChars( getSummaryDebitCreditSw() , summaryDebit8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setSummaryDebit88True() {  			
    	setSummaryDebitCreditSw( summaryDebit8888Value);
   	}
	char[] summaryCredit8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSummaryCredit88()
	 *	@return  Returns true if isSummaryCredit88() is "C"
	 */
   public boolean isSummaryCredit88() throws CFException {
      return (  compareChars( getSummaryDebitCreditSw() , summaryCredit8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSummaryCredit88True() {  			
    	setSummaryDebitCreditSw( summaryCredit8888Value);
   	}
	char[] summaryNoBooking8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSummaryNoBooking88()
	 *	@return  Returns true if isSummaryNoBooking88() is "N"
	 */
   public boolean isSummaryNoBooking88() throws CFException {
      return (  compareChars( getSummaryDebitCreditSw() , summaryNoBooking8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSummaryNoBooking88True() {  			
    	setSummaryDebitCreditSw( summaryNoBooking8888Value);
   	}
	/**
	 *	Returns the value of settlementSwitch
	 *	@return settlementSwitch
	 */
   public char[] getSettlementSwitch() throws CFException{
   		return settlementSwitch;
   }

  
	/**
	*  set variable settlementSwitch
	*  Corresponding COBOL Variable is WS-SETTLEMENT-SWITCH
	*  @param value
	**/
   public void setSettlementSwitch(char[] value) {
       value = checkSettlementSwitchConstraints(value);
       arraycopy(value,0,settlementSwitch,0,value.length);
   } 
	public void setSettlementSwitch(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,settlementSwitch,0,beginIndex + endIndex);
   }
	char[] continueSettlement8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isContinueSettlement88()
	 *	@return  Returns true if isContinueSettlement88() is "C"
	 */
   public boolean isContinueSettlement88() throws CFException {
      return (  compareChars( getSettlementSwitch() , continueSettlement8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setContinueSettlement88True() {  			
    	setSettlementSwitch( continueSettlement8888Value);
   	}
	char[] stopSettlement8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isStopSettlement88()
	 *	@return  Returns true if isStopSettlement88() is "S"
	 */
   public boolean isStopSettlement88() throws CFException {
      return (  compareChars( getSettlementSwitch() , stopSettlement8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setStopSettlement88True() {  			
    	setSettlementSwitch( stopSettlement8888Value);
   	}
	/**
	 *	Returns the value of retrySwitch
	 *	@return retrySwitch
	 */
   public char[] getRetrySwitch() throws CFException{
   		return retrySwitch;
   }

  
	/**
	*  set variable retrySwitch
	*  Corresponding COBOL Variable is WS-RETRY-SWITCH
	*  @param value
	**/
   public void setRetrySwitch(char[] value) {
       value = checkRetrySwitchConstraints(value);
       arraycopy(value,0,retrySwitch,0,value.length);
   } 
	public void setRetrySwitch(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,retrySwitch,0,beginIndex + endIndex);
   }
	char[] doSql88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isDoSql()
	 *	@return  Returns true if isDoSql() is "D"
	 */
   public boolean isDoSql() throws CFException {
      return (  compareChars( getRetrySwitch() , doSql88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setDoSqlTrue() {  			
    	setRetrySwitch( doSql88Value);
   	}
	char[] retrySql88Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isRetrySql()
	 *	@return  Returns true if isRetrySql() is "R"
	 */
   public boolean isRetrySql() throws CFException {
      return (  compareChars( getRetrySwitch() , retrySql88Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setRetrySqlTrue() {  			
    	setRetrySwitch( retrySql88Value);
   	}
	char[] sqlDone88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSqlDone()
	 *	@return  Returns true if isSqlDone() is "S"
	 */
   public boolean isSqlDone() throws CFException {
      return (  compareChars( getRetrySwitch() , sqlDone88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSqlDoneTrue() {  			
    	setRetrySwitch( sqlDone88Value);
   	}
	/**
	 *	Returns the value of orderStatus
	 *	@return orderStatus
	 */
   public char[] getOrderStatus() throws CFException{
   		return orderStatus;
   }

  
	/**
	*  set variable orderStatus
	*  Corresponding COBOL Variable is WS-ORDER-STATUS
	*  @param value
	**/
   public void setOrderStatus(char[] value) {
       value = checkOrderStatusConstraints(value);
       arraycopy(value,0,orderStatus,0,value.length);
   } 
	public void setOrderStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,orderStatus,0,beginIndex + endIndex);
   }
	char[] accepted88Value = "101".toCharArray();
	/**
	 *	Test condition "101" for isAccepted()
	 *	@return  Returns true if isAccepted() is "101"
	 */
   public boolean isAccepted() throws CFException {
      return (  compareChars( getOrderStatus() , accepted88Value)  == 0  );
   }


	/**
	*  set values "101"
	*/
   	public void setAcceptedTrue() {  			
    	setOrderStatus( accepted88Value);
   	}
	char[] matched88Value = "201".toCharArray();
	/**
	 *	Test condition "201" for isMatched()
	 *	@return  Returns true if isMatched() is "201"
	 */
   public boolean isMatched() throws CFException {
      return (  compareChars( getOrderStatus() , matched88Value)  == 0  );
   }


	/**
	*  set values "201"
	*/
   	public void setMatchedTrue() {  			
    	setOrderStatus( matched88Value);
   	}
	static java.util.Set<String> overdue88Value = new java.util.HashSet<>();
static { 
	overdue88Value.add( "301");
	overdue88Value.add( "302");
	overdue88Value.add( "303");
	overdue88Value.add( "304");
	overdue88Value.add( "305");
	overdue88Value.add( "306");
	overdue88Value.add( "307");
	overdue88Value.add( "308");
} 

	/**
	 *	Test condition "301" "302" "303" "304" "305" "306" "307" "308" for isOverdue()
	 *	@return  Returns true if isOverdue() is "301" "302" "303" "304" "305" "306" "307" "308"
	 */
   public boolean isOverdue() throws CFException {
      return   overdue88Value.contains(String.valueOf(getOrderStatus()));
   }


	/**
	*  set values "301" "302" "303" "304" "305" "306" "307" "308"
	*/
   	public void setOverdueTrue() {  			
    	  setOrderStatus(overdue88Value.iterator().next().toCharArray());
   	}
	char[] overdueBuyerIdInvld88Value = "301".toCharArray();
	/**
	 *	Test condition "301" for isOverdueBuyerIdInvld()
	 *	@return  Returns true if isOverdueBuyerIdInvld() is "301"
	 */
   public boolean isOverdueBuyerIdInvld() throws CFException {
      return (  compareChars( getOrderStatus() , overdueBuyerIdInvld88Value)  == 0  );
   }


	/**
	*  set values "301"
	*/
   	public void setOverdueBuyerIdInvldTrue() {  			
    	setOrderStatus( overdueBuyerIdInvld88Value);
   	}
	char[] overdueSellerIdInvld88Value = "302".toCharArray();
	/**
	 *	Test condition "302" for isOverdueSellerIdInvld()
	 *	@return  Returns true if isOverdueSellerIdInvld() is "302"
	 */
   public boolean isOverdueSellerIdInvld() throws CFException {
      return (  compareChars( getOrderStatus() , overdueSellerIdInvld88Value)  == 0  );
   }


	/**
	*  set values "302"
	*/
   	public void setOverdueSellerIdInvldTrue() {  			
    	setOrderStatus( overdueSellerIdInvld88Value);
   	}
	char[] overdueSecurityInvld88Value = "303".toCharArray();
	/**
	 *	Test condition "303" for isOverdueSecurityInvld()
	 *	@return  Returns true if isOverdueSecurityInvld() is "303"
	 */
   public boolean isOverdueSecurityInvld() throws CFException {
      return (  compareChars( getOrderStatus() , overdueSecurityInvld88Value)  == 0  );
   }


	/**
	*  set values "303"
	*/
   	public void setOverdueSecurityInvldTrue() {  			
    	setOrderStatus( overdueSecurityInvld88Value);
   	}
	char[] overdueBuyerAcInvld88Value = "304".toCharArray();
	/**
	 *	Test condition "304" for isOverdueBuyerAcInvld()
	 *	@return  Returns true if isOverdueBuyerAcInvld() is "304"
	 */
   public boolean isOverdueBuyerAcInvld() throws CFException {
      return (  compareChars( getOrderStatus() , overdueBuyerAcInvld88Value)  == 0  );
   }


	/**
	*  set values "304"
	*/
   	public void setOverdueBuyerAcInvldTrue() {  			
    	setOrderStatus( overdueBuyerAcInvld88Value);
   	}
	char[] overdueSellerAcInvld88Value = "305".toCharArray();
	/**
	 *	Test condition "305" for isOverdueSellerAcInvld()
	 *	@return  Returns true if isOverdueSellerAcInvld() is "305"
	 */
   public boolean isOverdueSellerAcInvld() throws CFException {
      return (  compareChars( getOrderStatus() , overdueSellerAcInvld88Value)  == 0  );
   }


	/**
	*  set values "305"
	*/
   	public void setOverdueSellerAcInvldTrue() {  			
    	setOrderStatus( overdueSellerAcInvld88Value);
   	}
	char[] overdueBuyerOrdstaInvld88Value = "306".toCharArray();
	/**
	 *	Test condition "306" for isOverdueBuyerOrdstaInvld()
	 *	@return  Returns true if isOverdueBuyerOrdstaInvld() is "306"
	 */
   public boolean isOverdueBuyerOrdstaInvld() throws CFException {
      return (  compareChars( getOrderStatus() , overdueBuyerOrdstaInvld88Value)  == 0  );
   }


	/**
	*  set values "306"
	*/
   	public void setOverdueBuyerOrdstaInvldTrue() {  			
    	setOrderStatus( overdueBuyerOrdstaInvld88Value);
   	}
	char[] overdueSellerOrdstaInvld88Value = "307".toCharArray();
	/**
	 *	Test condition "307" for isOverdueSellerOrdstaInvld()
	 *	@return  Returns true if isOverdueSellerOrdstaInvld() is "307"
	 */
   public boolean isOverdueSellerOrdstaInvld() throws CFException {
      return (  compareChars( getOrderStatus() , overdueSellerOrdstaInvld88Value)  == 0  );
   }


	/**
	*  set values "307"
	*/
   	public void setOverdueSellerOrdstaInvldTrue() {  			
    	setOrderStatus( overdueSellerOrdstaInvld88Value);
   	}
	char[] overdueSellerOrdMissing88Value = "308".toCharArray();
	/**
	 *	Test condition "308" for isOverdueSellerOrdMissing()
	 *	@return  Returns true if isOverdueSellerOrdMissing() is "308"
	 */
   public boolean isOverdueSellerOrdMissing() throws CFException {
      return (  compareChars( getOrderStatus() , overdueSellerOrdMissing88Value)  == 0  );
   }


	/**
	*  set values "308"
	*/
   	public void setOverdueSellerOrdMissingTrue() {  			
    	setOrderStatus( overdueSellerOrdMissing88Value);
   	}
	char[] rejected88Value = "401".toCharArray();
	/**
	 *	Test condition "401" for isRejected()
	 *	@return  Returns true if isRejected() is "401"
	 */
   public boolean isRejected() throws CFException {
      return (  compareChars( getOrderStatus() , rejected88Value)  == 0  );
   }


	/**
	*  set values "401"
	*/
   	public void setRejectedTrue() {  			
    	setOrderStatus( rejected88Value);
   	}
	char[] settled88Value = "601".toCharArray();
	/**
	 *	Test condition "601" for isSettled()
	 *	@return  Returns true if isSettled() is "601"
	 */
   public boolean isSettled() throws CFException {
      return (  compareChars( getOrderStatus() , settled88Value)  == 0  );
   }


	/**
	*  set values "601"
	*/
   	public void setSettledTrue() {  			
    	setOrderStatus( settled88Value);
   	}
	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException{
   		return exception;
   }

  
	/**
	*  set variable exception
	*  Corresponding COBOL Variable is WS-EXCEPTION
	*  @param value
	**/
   public void setException(char[] value) {
       value = checkExceptionConstraints(value);
       arraycopy(value,0,exception,0,value.length);
   } 
	public void setException(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,exception,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of exceptionHandler
	 *	@return exceptionHandler
	 */
   public char[] getExceptionHandler() throws CFException{
   		return exceptionHandler;
   }

  
	/**
	*  set variable exceptionHandler
	*  Corresponding COBOL Variable is WS-EXCEPTION-HANDLER
	*  @param value
	**/
   public void setExceptionHandler(char[] value) {
       value = checkExceptionHandlerConstraints(value);
       arraycopy(value,0,exceptionHandler,0,value.length);
   } 
	public void setExceptionHandler(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,exceptionHandler,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currdate
	 *	@return currdate
	 */
   public char[] getCurrdate() throws CFException{
   		return currdate;
   }

  
	/**
	*  set variable currdate
	*  Corresponding COBOL Variable is WS-CURRDATE
	*  @param value
	**/
   public void setCurrdate(char[] value) {
       value = checkCurrdateConstraints(value);
       arraycopy(value,0,currdate,0,value.length);
   } 
	public void setCurrdate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currdate,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currtime
	 *	@return currtime
	 */
   public char[] getCurrtime() throws CFException{
   		return currtime;
   }

  
	/**
	*  set variable currtime
	*  Corresponding COBOL Variable is WS-CURRTIME
	*  @param value
	**/
   public void setCurrtime(char[] value) {
       value = checkCurrtimeConstraints(value);
       arraycopy(value,0,currtime,0,value.length);
   } 
	public void setCurrtime(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currtime,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of excpType
	 *	@return excpType
	 */
   public char[] getExcpType() throws CFException{
   		return excpType;
   }

  
	/**
	*  set variable excpType
	*  Corresponding COBOL Variable is WS-EXCP-TYPE
	*  @param value
	**/
   public void setExcpType(char[] value) {
       value = checkExcpTypeConstraints(value);
       arraycopy(value,0,excpType,0,value.length);
   } 
	public void setExcpType(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,excpType,0,beginIndex + endIndex);
   }
	char[] noExceptions88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNoExceptions()
	 *	@return  Returns true if isNoExceptions() is "N"
	 */
   public boolean isNoExceptions() throws CFException {
      return (  compareChars( getExcpType() , noExceptions88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNoExceptionsTrue() {  			
    	setExcpType( noExceptions88Value);
   	}
	char[] systemException88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSystemException()
	 *	@return  Returns true if isSystemException() is "S"
	 */
   public boolean isSystemException() throws CFException {
      return (  compareChars( getExcpType() , systemException88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSystemExceptionTrue() {  			
    	setExcpType( systemException88Value);
   	}
	char[] applException88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isApplException()
	 *	@return  Returns true if isApplException() is "A"
	 */
   public boolean isApplException() throws CFException {
      return (  compareChars( getExcpType() , applException88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setApplExceptionTrue() {  			
    	setExcpType( applException88Value);
   	}
	char[] dataException88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isDataException()
	 *	@return  Returns true if isDataException() is "D"
	 */
   public boolean isDataException() throws CFException {
      return (  compareChars( getExcpType() , dataException88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setDataExceptionTrue() {  			
    	setExcpType( dataException88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
