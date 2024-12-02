package com.cloudframe.app.trdpb006.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:21. using version 5.0.0.161
**/


import com.cloudframe.app.trdpb006.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

						private char[] reporderFileStatus = Field.fillLowValue(2);

								private int pagenum;

						private char[] printHeader = new char[1];

						private char[] endOfOrdersSw = new char[1];

						private char[] emptyHdr = new char[160];

						private char[] detailHdr2 = new char[159];

						private char[] prevCustid = new char[12];

						private char[] prevBuySell = new char[1];

						private char[] prevOrderStatus = Field.fillLowValue(3);

								private int maxOrdersPerPage;

								private int orderCount;

						private char[] buyerSellerCustId = Field.fillLowValue(12);

								private char[] sqlcode_Ws = Field.fillLowValue(4);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPagenum(0);
								setPrintHeader(fillSpace(1));
								setEndOfOrdersSw(fillSpace(1));
								setEmptyHdr(pad(160," ".toCharArray(),' ',RIGHT_PAD));
								setDetailHdr2(mergeArrays("+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60,(byte)0x60}) , "+".toCharArray()));
								setPrevCustid(fillSpace(12));
								setPrevBuySell(fillSpace(1));
								setMaxOrdersPerPage(60);
								setOrderCount(0);
    }


 

	/**
	 *	Returns the value of reporderFileStatus
	 *	@return reporderFileStatus
	 */
   public char[] getReporderFileStatus() throws CFException{
   		return reporderFileStatus;
   }

  
	/**
	*  set variable reporderFileStatus
	*  Corresponding COBOL Variable is REPORDER-FILE-STATUS
	*  @param value
	**/
   public void setReporderFileStatus(char[] value) {
       value = checkReporderFileStatusConstraints(value);
       arraycopy(value,0,reporderFileStatus,0,value.length);
   } 
	public void setReporderFileStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,reporderFileStatus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pagenum
	 *	@return pagenum
	 */
	public int getPagenum() throws CFException {
       if (isPagenumModified()) { 
           pagenum = refreshPagenum();
        }
   		return pagenum;
	}
	

	
	   
	/**
	 * 	Update Pagenum with the passed value
	 *  Corresponding COBOL Variable is WS-PAGENUM
	 *	@param number
	 */
	public void setPagenum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pagenum = checkPagenumMaxLimit(number); 
		serializePagenum(pagenum);
	}
	

	public void setPagenum(long number) {
	    number = checkPagenumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPagenum((int)number);
	}
	
	/**
	 * 	Update Pagenum with the passed value
	 *	@param value (String or char[])
	 */
	public void setPagenum(char[] value) throws CFException {
		 pagenum = serializePagenum(value);
	}
	/**
	 * 	Update Pagenum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPagenumString(char[] value) throws CFException {
		 setPagenum(value);
	}
	/**
	 *	Returns the value of printHeader
	 *	@return printHeader
	 */
   public char[] getPrintHeader() throws CFException{
   		return printHeader;
   }

  
	/**
	*  set variable printHeader
	*  Corresponding COBOL Variable is WS-PRINT-HEADER
	*  @param value
	**/
   public void setPrintHeader(char[] value) {
       value = checkPrintHeaderConstraints(value);
       arraycopy(value,0,printHeader,0,value.length);
   } 
	public void setPrintHeader(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,printHeader,0,beginIndex + endIndex);
   }
	char[] printPageHeader8888Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isPrintPageHeader88()
	 *	@return  Returns true if isPrintPageHeader88() is "P"
	 */
   public boolean isPrintPageHeader88() throws CFException {
      return (  compareChars( getPrintHeader() , printPageHeader8888Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setPrintPageHeader88True() {  			
    	setPrintHeader( printPageHeader8888Value);
   	}
	char[] printHeader18888Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isPrintHeader188()
	 *	@return  Returns true if isPrintHeader188() is "H"
	 */
   public boolean isPrintHeader188() throws CFException {
      return (  compareChars( getPrintHeader() , printHeader18888Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setPrintHeader188True() {  			
    	setPrintHeader( printHeader18888Value);
   	}
	char[] printDetailHdr8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isPrintDetailHdr88()
	 *	@return  Returns true if isPrintDetailHdr88() is "D"
	 */
   public boolean isPrintDetailHdr88() throws CFException {
      return (  compareChars( getPrintHeader() , printDetailHdr8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setPrintDetailHdr88True() {  			
    	setPrintHeader( printDetailHdr8888Value);
   	}
	char[] printDetail8888Value = " ".toCharArray();
	/**
	 *	Test condition " " for isPrintDetail88()
	 *	@return  Returns true if isPrintDetail88() is " "
	 */
   public boolean isPrintDetail88() throws CFException {
      return (  compareChars( getPrintHeader() , printDetail8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setPrintDetail88True() {  			
    	setPrintHeader( printDetail8888Value);
   	}
	/**
	 *	Returns the value of endOfOrdersSw
	 *	@return endOfOrdersSw
	 */
   public char[] getEndOfOrdersSw() throws CFException{
   		return endOfOrdersSw;
   }

  
	/**
	*  set variable endOfOrdersSw
	*  Corresponding COBOL Variable is WS-END-OF-ORDERS-SW
	*  @param value
	**/
   public void setEndOfOrdersSw(char[] value) {
       value = checkEndOfOrdersSwConstraints(value);
       arraycopy(value,0,endOfOrdersSw,0,value.length);
   } 
	public void setEndOfOrdersSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,endOfOrdersSw,0,beginIndex + endIndex);
   }
	char[] endOfOrders8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfOrders88()
	 *	@return  Returns true if isEndOfOrders88() is "Y"
	 */
   public boolean isEndOfOrders88() throws CFException {
      return (  compareChars( getEndOfOrdersSw() , endOfOrders8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfOrders88True() {  			
    	setEndOfOrdersSw( endOfOrders8888Value);
   	}
	/**
	 *	Returns the value of emptyHdr
	 *	@return emptyHdr
	 */
   public char[] getEmptyHdr() throws CFException{
   		return emptyHdr;
   }

  
	/**
	*  set variable emptyHdr
	*  Corresponding COBOL Variable is WS-EMPTY-HDR
	*  @param value
	**/
   public void setEmptyHdr(char[] value) {
       value = checkEmptyHdrConstraints(value);
       arraycopy(value,0,emptyHdr,0,value.length);
   } 
	public void setEmptyHdr(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,emptyHdr,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of detailHdr2
	 *	@return detailHdr2
	 */
   public char[] getDetailHdr2() throws CFException{
   		return detailHdr2;
   }

  
	/**
	*  set variable detailHdr2
	*  Corresponding COBOL Variable is WS-DETAIL-HDR2
	*  @param value
	**/
   public void setDetailHdr2(char[] value) {
       value = checkDetailHdr2Constraints(value);
       arraycopy(value,0,detailHdr2,0,value.length);
   } 
	public void setDetailHdr2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,detailHdr2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevCustid
	 *	@return prevCustid
	 */
   public char[] getPrevCustid() throws CFException{
   		return prevCustid;
   }

  
	/**
	*  set variable prevCustid
	*  Corresponding COBOL Variable is WS-PREV-CUSTID
	*  @param value
	**/
   public void setPrevCustid(char[] value) {
       value = checkPrevCustidConstraints(value);
       arraycopy(value,0,prevCustid,0,value.length);
   } 
	public void setPrevCustid(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevCustid,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevBuySell
	 *	@return prevBuySell
	 */
   public char[] getPrevBuySell() throws CFException{
   		return prevBuySell;
   }

  
	/**
	*  set variable prevBuySell
	*  Corresponding COBOL Variable is WS-PREV-BUY-SELL
	*  @param value
	**/
   public void setPrevBuySell(char[] value) {
       value = checkPrevBuySellConstraints(value);
       arraycopy(value,0,prevBuySell,0,value.length);
   } 
	public void setPrevBuySell(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevBuySell,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevOrderStatus
	 *	@return prevOrderStatus
	 */
   public char[] getPrevOrderStatus() throws CFException{
   		return prevOrderStatus;
   }

  
	/**
	*  set variable prevOrderStatus
	*  Corresponding COBOL Variable is WS-PREV-ORDER-STATUS
	*  @param value
	**/
   public void setPrevOrderStatus(char[] value) {
       value = checkPrevOrderStatusConstraints(value);
       arraycopy(value,0,prevOrderStatus,0,value.length);
   } 
	public void setPrevOrderStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevOrderStatus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of maxOrdersPerPage
	 *	@return maxOrdersPerPage
	 */
	public int getMaxOrdersPerPage() throws CFException {
   		return maxOrdersPerPage;
	}
	
	/**
	 * 	Update MaxOrdersPerPage with the passed value
	 *  Corresponding COBOL Variable is WS-MAX-ORDERS-PER-PAGE
	 *	@param number
	 */
	public void setMaxOrdersPerPage(int number) {
	     // Truncate if the number is beyond +/- Max range
	    maxOrdersPerPage = checkMaxOrdersPerPageMaxLimit(number); 
	}


	public void setMaxOrdersPerPage(long number) {
	    number = checkMaxOrdersPerPageMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxOrdersPerPage((int)number);
	}
	
	/**
	 *	Returns the value of orderCount
	 *	@return orderCount
	 */
	public int getOrderCount() throws CFException {
   		return orderCount;
	}
	
	/**
	 * 	Update OrderCount with the passed value
	 *  Corresponding COBOL Variable is WS-ORDER-COUNT
	 *	@param number
	 */
	public void setOrderCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    orderCount = checkOrderCountMaxLimit(number); 
	}


	public void setOrderCount(long number) {
	    number = checkOrderCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOrderCount((int)number);
	}
	
	/**
	 *	Returns the value of buyerSellerCustId
	 *	@return buyerSellerCustId
	 */
   public char[] getBuyerSellerCustId() throws CFException{
   		return buyerSellerCustId;
   }

  
	/**
	*  set variable buyerSellerCustId
	*  Corresponding COBOL Variable is WS-BUYER-SELLER-CUST-ID
	*  @param value
	**/
   public void setBuyerSellerCustId(char[] value) {
       value = checkBuyerSellerCustIdConstraints(value);
       arraycopy(value,0,buyerSellerCustId,0,value.length);
   } 
	public void setBuyerSellerCustId(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,buyerSellerCustId,0,beginIndex + endIndex);
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

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
