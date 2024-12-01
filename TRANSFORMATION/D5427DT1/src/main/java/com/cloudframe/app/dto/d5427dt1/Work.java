package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

						private char[] thisProgram = new char[8];

						private char[] dt1ReqContainerName = new char[16];

								private int dt1ReqContainerLength;

						private char[] dt1RspContainerName = new char[16];

								private int dt1RspContainerLength;

						private char[] dt1RspContainerLayout = new char[8];

						private char[] dt1ClmContainerName = new char[16];

						private char[] dt1ClmContainerLayout = new char[8];

						private char[] dt1SrtContainerName = new char[16];

						private char[] dt1SrtContainerLayout = new char[8];

						private char[] stsContainerName = new char[16];

								private int stsContainerLength;

						private char[] stsContainerLayout = new char[8];

						private char[] topsIcn10 = Field.fillLowValue(10);

						private char[] defaultDate = Field.fillLowValue(80);

						private char[] defaultDateDb2 = new char[10];

						private char[] fmtYyyyMmDd = new char[10];

						private char[] fmtYyddd = new char[5];

						private char[] ceedays = new char[8];

						private char[] ceedate = new char[8];

								private long maxClaimsDefault;

								private long maxClaimsRequested;

								private int d5427dt1MaxRows;

								private int d5427dt1MaxClaims;

								private int fetchRowsetMax;

								private int fetchRowsRetrieved;

								private int totalRowsRetrieved;

								private int nbrSrtItems;

						private char[] payeeCode = Field.fillLowValue(1);

								private short headerCt;

						private char[] recType = new char[1];

						private char[] diffrntVerFoundSw = new char[1];

						private char[] claimSw = new char[1];

						private char[] infoLineInd = new char[1];

						private char[] clmHstEndOfFetchInd = new char[1];

						private char[] queryFilterInd = new char[1];

								private int dt1ClaimKeyMax;

								private int dt1ClaimKeyCnt;

								private short i;

						private char[] queryBaseCteStart = new char[376];

						private char[] queryBaseCteEnd = new char[140];

						private char[] queryFilterProviderTin = new char[55];

						private char[] queryFilterIcn = new char[46];

						private char[] queryFilterAuthStart = new char[318];

						private char[] queryFilterAuthEnd = new char[26];

						private char[] queryFilterAuthBaseEnd = new char[1];

						private char[] queryFilterDlgtStart = new char[194];

						private char[] queryFilterAuthCrit6 = new char[40];

						private char[] queryFilterDlgtCrit6 = new char[44];

						private char[] queryFilterSpiStart = new char[6];

						private char[] queryFilterSpiEnd = new char[1];

						private char[] queryFilterSpiPred1 = new char[43];

						private char[] queryFilterSpiPred2 = new char[47];

						private char[] queryFilterSpiPred3 = new char[47];

						private char[] queryFilterSpiPred4 = new char[47];

						private char[] queryFilterSpiPred5 = new char[47];

								private int sqlcode_Ws;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setThisProgram(("D5427DT1").toCharArray());
								setDt1ReqContainerName(("D5427DT1-REQ    ").toCharArray());
								setDt1RspContainerName(("D5427DT1-RSP    ").toCharArray());
								setDt1RspContainerLayout(("VYDT1RS1").toCharArray());
								setDt1ClmContainerName(("D5427DT1-CLM    ").toCharArray());
								setDt1ClmContainerLayout(("VYDT1CL1").toCharArray());
								setDt1SrtContainerName(("D5427DT1-SRT    ").toCharArray());
								setDt1SrtContainerLayout(("VYDT1SR1").toCharArray());
								setStsContainerName(("D5427DT1-STS    ").toCharArray());
								setStsContainerLayout(("VYRSPSTS").toCharArray());
								setDefaultDateDb2(("0001-01-01").toCharArray());
								setFmtYyyyMmDd(("YYYY-MM-DD").toCharArray());
								setFmtYyddd(("YYDDD").toCharArray());
								setCeedays(("CEEDAYS ").toCharArray());
								setCeedate(("CEEDATE ").toCharArray());
								setMaxClaimsDefault(108L);
								setD5427dt1MaxRows(800);
								setD5427dt1MaxClaims(0);
								setFetchRowsetMax(100);
								setFetchRowsRetrieved(0);
								setTotalRowsRetrieved(0);
								setHeaderCt((short)0);
								setRecType(fillSpace(1));
								setDiffrntVerFoundSw(fillSpace(1));
								setClaimSw(("N").toCharArray());
								setInfoLineInd(("N").toCharArray());
								setClmHstEndOfFetchInd(("N").toCharArray());
								setQueryFilterInd(("N").toCharArray());
								setDt1ClaimKeyMax(108);
								setQueryBaseCteStart(" WITH  CLM_HST_TABLE ( PARTN_ID,PARTN_VAL,PROC_DT,PROC_TM,ICN_SUFX_VERS_NBR,INVN_CTL_NBR,ICN_SUFX_CD)  AS ( SELECT DISTINCT REF.PARTN_ID,REF.PARTN_VAL,REF.PROC_DT,REF.PROC_TM,REF.ICN_SUFX_VERS_NBR,REF.INVN_CTL_NBR,REF.ICN_SUFX_CD FROM ADJD_CLMHST_DENORM_REF REF WHERE REF.POL_NBR = CAST(? AS CHAR(6))  AND REF.EE_ID = CAST(? AS CHAR(10)) AND REF.DEPN_NBR = CAST(? AS CHAR(2)) ".toCharArray());
								setQueryBaseCteEnd(" ORDER BY REF.PROC_DT DESC,REF.PROC_TM DESC,REF.ICN_SUFX_VERS_NBR DESC,REF.INVN_CTL_NBR DESC,REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY)".toCharArray());
								setQueryFilterProviderTin((" AND SUBSTR(REF.PROV_TINSUFF,2,9) = CAST(? AS CHAR(9)) ").toCharArray());
								setQueryFilterIcn((" AND REF.INVN_CTL_NBR = CAST(? AS CHAR(10))   ").toCharArray());
								setQueryFilterAuthStart(" AND( (EXISTS (SELECT 1 FROM ADJD_CLMHST_DENORM_LN DLN1 WHERE REF.PARTN_ID = DLN1.PARTN_ID AND REF.PARTN_VAL = DLN1.PARTN_VAL AND REF.INVN_CTL_NBR = DLN1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN1.ICN_SUFX_CD AND REF.PROC_DT = DLN1.PROC_DT AND REF.PROC_TM = DLN1.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN1.ICN_SUFX_VERS_NBR".toCharArray());
								setQueryFilterAuthEnd((" FETCH FIRST 1 ROWS ONLY))").toCharArray());
								setQueryFilterAuthBaseEnd((")").toCharArray());
								setQueryFilterDlgtStart(" OR (EXISTS (SELECT 1 FROM DE_AUTH_SRCH DLGT WHERE REF.PARTN_ID = DLGT.PARTN_ID AND REF.PARTN_VAL = DLGT.PARTN_VAL AND REF.INVN_CTL_NBR = DLGT.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLGT.ICN_SUFX_CD".toCharArray());
								setQueryFilterAuthCrit6((" AND DLN1.AUTH_NBR = CAST(? AS CHAR(10))").toCharArray());
								setQueryFilterDlgtCrit6((" AND DLGT.PRR_AUTH_NBR = CAST(? AS CHAR(50))").toCharArray());
								setQueryFilterSpiStart((" AND (").toCharArray());
								setQueryFilterSpiEnd((")").toCharArray());
								setQueryFilterSpiPred1(("UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
								setQueryFilterSpiPred2((" OR UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
								setQueryFilterSpiPred3((" OR UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
								setQueryFilterSpiPred4((" OR UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
								setQueryFilterSpiPred5((" OR UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
    }


 

	/**
	 *	Returns the value of thisProgram
	 *	@return thisProgram
	 */
   public char[] getThisProgram() throws CFException{
   		return thisProgram;
   }

  
	/**
	*  set variable thisProgram
	*  Corresponding COBOL Variable is THIS-PROGRAM
	*  @param value
	**/
   public void setThisProgram(char[] value) {
       value = checkThisProgramConstraints(value);
       arraycopy(value,0,thisProgram,0,value.length);
   } 
	public void setThisProgram(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,thisProgram,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt1ReqContainerName
	 *	@return dt1ReqContainerName
	 */
   public char[] getDt1ReqContainerName() throws CFException{
   		return dt1ReqContainerName;
   }

  
	/**
	*  set variable dt1ReqContainerName
	*  Corresponding COBOL Variable is DT1-REQ-CONTAINER-NAME
	*  @param value
	**/
   public void setDt1ReqContainerName(char[] value) {
       value = checkDt1ReqContainerNameConstraints(value);
       arraycopy(value,0,dt1ReqContainerName,0,value.length);
   } 
	public void setDt1ReqContainerName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt1ReqContainerName,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt1ReqContainerLength
	 *	@return dt1ReqContainerLength
	 */
	public int getDt1ReqContainerLength() throws CFException {
   		return dt1ReqContainerLength;
	}
	
	/**
	 * 	Update Dt1ReqContainerLength with the passed value
	 *  Corresponding COBOL Variable is DT1-REQ-CONTAINER-LENGTH
	 *	@param number
	 */
	public void setDt1ReqContainerLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dt1ReqContainerLength = checkDt1ReqContainerLengthMaxLimit(number); 
	}


	public void setDt1ReqContainerLength(long number) {
	    number = checkDt1ReqContainerLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ReqContainerLength((int)number);
	}
	
	/**
	 *	Returns the value of dt1RspContainerName
	 *	@return dt1RspContainerName
	 */
   public char[] getDt1RspContainerName() throws CFException{
   		return dt1RspContainerName;
   }

  
	/**
	*  set variable dt1RspContainerName
	*  Corresponding COBOL Variable is DT1-RSP-CONTAINER-NAME
	*  @param value
	**/
   public void setDt1RspContainerName(char[] value) {
       value = checkDt1RspContainerNameConstraints(value);
       arraycopy(value,0,dt1RspContainerName,0,value.length);
   } 
	public void setDt1RspContainerName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt1RspContainerName,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt1RspContainerLength
	 *	@return dt1RspContainerLength
	 */
	public int getDt1RspContainerLength() throws CFException {
   		return dt1RspContainerLength;
	}
	
	/**
	 * 	Update Dt1RspContainerLength with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-CONTAINER-LENGTH
	 *	@param number
	 */
	public void setDt1RspContainerLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dt1RspContainerLength = checkDt1RspContainerLengthMaxLimit(number); 
	}


	public void setDt1RspContainerLength(long number) {
	    number = checkDt1RspContainerLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1RspContainerLength((int)number);
	}
	
	/**
	 *	Returns the value of dt1RspContainerLayout
	 *	@return dt1RspContainerLayout
	 */
   public char[] getDt1RspContainerLayout() throws CFException{
   		return dt1RspContainerLayout;
   }

  
	/**
	*  set variable dt1RspContainerLayout
	*  Corresponding COBOL Variable is DT1-RSP-CONTAINER-LAYOUT
	*  @param value
	**/
   public void setDt1RspContainerLayout(char[] value) {
       value = checkDt1RspContainerLayoutConstraints(value);
       arraycopy(value,0,dt1RspContainerLayout,0,value.length);
   } 
	public void setDt1RspContainerLayout(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt1RspContainerLayout,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt1ClmContainerName
	 *	@return dt1ClmContainerName
	 */
   public char[] getDt1ClmContainerName() throws CFException{
   		return dt1ClmContainerName;
   }

  
	/**
	*  set variable dt1ClmContainerName
	*  Corresponding COBOL Variable is DT1-CLM-CONTAINER-NAME
	*  @param value
	**/
   public void setDt1ClmContainerName(char[] value) {
       value = checkDt1ClmContainerNameConstraints(value);
       arraycopy(value,0,dt1ClmContainerName,0,value.length);
   } 
	public void setDt1ClmContainerName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt1ClmContainerName,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt1ClmContainerLayout
	 *	@return dt1ClmContainerLayout
	 */
   public char[] getDt1ClmContainerLayout() throws CFException{
   		return dt1ClmContainerLayout;
   }

  
	/**
	*  set variable dt1ClmContainerLayout
	*  Corresponding COBOL Variable is DT1-CLM-CONTAINER-LAYOUT
	*  @param value
	**/
   public void setDt1ClmContainerLayout(char[] value) {
       value = checkDt1ClmContainerLayoutConstraints(value);
       arraycopy(value,0,dt1ClmContainerLayout,0,value.length);
   } 
	public void setDt1ClmContainerLayout(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt1ClmContainerLayout,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt1SrtContainerName
	 *	@return dt1SrtContainerName
	 */
   public char[] getDt1SrtContainerName() throws CFException{
   		return dt1SrtContainerName;
   }

  
	/**
	*  set variable dt1SrtContainerName
	*  Corresponding COBOL Variable is DT1-SRT-CONTAINER-NAME
	*  @param value
	**/
   public void setDt1SrtContainerName(char[] value) {
       value = checkDt1SrtContainerNameConstraints(value);
       arraycopy(value,0,dt1SrtContainerName,0,value.length);
   } 
	public void setDt1SrtContainerName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt1SrtContainerName,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt1SrtContainerLayout
	 *	@return dt1SrtContainerLayout
	 */
   public char[] getDt1SrtContainerLayout() throws CFException{
   		return dt1SrtContainerLayout;
   }

  
	/**
	*  set variable dt1SrtContainerLayout
	*  Corresponding COBOL Variable is DT1-SRT-CONTAINER-LAYOUT
	*  @param value
	**/
   public void setDt1SrtContainerLayout(char[] value) {
       value = checkDt1SrtContainerLayoutConstraints(value);
       arraycopy(value,0,dt1SrtContainerLayout,0,value.length);
   } 
	public void setDt1SrtContainerLayout(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt1SrtContainerLayout,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of stsContainerName
	 *	@return stsContainerName
	 */
   public char[] getStsContainerName() throws CFException{
   		return stsContainerName;
   }

  
	/**
	*  set variable stsContainerName
	*  Corresponding COBOL Variable is STS-CONTAINER-NAME
	*  @param value
	**/
   public void setStsContainerName(char[] value) {
       value = checkStsContainerNameConstraints(value);
       arraycopy(value,0,stsContainerName,0,value.length);
   } 
	public void setStsContainerName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,stsContainerName,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of stsContainerLength
	 *	@return stsContainerLength
	 */
	public int getStsContainerLength() throws CFException {
   		return stsContainerLength;
	}
	
	/**
	 * 	Update StsContainerLength with the passed value
	 *  Corresponding COBOL Variable is STS-CONTAINER-LENGTH
	 *	@param number
	 */
	public void setStsContainerLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    stsContainerLength = checkStsContainerLengthMaxLimit(number); 
	}


	public void setStsContainerLength(long number) {
	    number = checkStsContainerLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setStsContainerLength((int)number);
	}
	
	/**
	 *	Returns the value of stsContainerLayout
	 *	@return stsContainerLayout
	 */
   public char[] getStsContainerLayout() throws CFException{
   		return stsContainerLayout;
   }

  
	/**
	*  set variable stsContainerLayout
	*  Corresponding COBOL Variable is STS-CONTAINER-LAYOUT
	*  @param value
	**/
   public void setStsContainerLayout(char[] value) {
       value = checkStsContainerLayoutConstraints(value);
       arraycopy(value,0,stsContainerLayout,0,value.length);
   } 
	public void setStsContainerLayout(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,stsContainerLayout,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of topsIcn10
	 *	@return topsIcn10
	 */
   public char[] getTopsIcn10() throws CFException{
   		return topsIcn10;
   }

  
	/**
	*  set variable topsIcn10
	*  Corresponding COBOL Variable is TOPS-ICN-10
	*  @param value
	**/
   public void setTopsIcn10(char[] value) {
       value = checkTopsIcn10Constraints(value);
       arraycopy(value,0,topsIcn10,0,value.length);
   } 
	public void setTopsIcn10(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,topsIcn10,0,beginIndex + endIndex);
   }
	
	/**
	 *	Test condition "0000000001" THRU "9999999999" "AA00000000" THRU "ZZ99999999" for isValidIcnNumValue10()
	 *	@return  Returns true if isValidIcnNumValue10() is "0000000001" THRU "9999999999" "AA00000000" THRU "ZZ99999999"
	 */
   public boolean isValidIcnNumValue10() throws CFException {
      return (  isGreaterOrEqual(getTopsIcn10(), "0000000001" ) &&  isLessOrEqual(getTopsIcn10(),"9999999999l" )  ||  isGreaterOrEqual(getTopsIcn10(), "AA00000000" ) &&  isLessOrEqual(getTopsIcn10(),"ZZ99999999" )  );
   }


	/**
	*  set values "0000000001" THRU "9999999999" "AA00000000" THRU "ZZ99999999"
	*/
   	public void setValidIcnNumValue10True() {  			
    	setTopsIcn10( "0000000001".toCharArray());
   	}
	/**
	 *	Returns the value of defaultDate
	 *	@return defaultDate
	 */
   public char[] getDefaultDate() throws CFException{
   		return defaultDate;
   }

  
	/**
	*  set variable defaultDate
	*  Corresponding COBOL Variable is WS-DEFAULT-DATE
	*  @param value
	**/
   public void setDefaultDate(char[] value) {
       value = checkDefaultDateConstraints(value);
       arraycopy(value,0,defaultDate,0,value.length);
   } 
	public void setDefaultDate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,defaultDate,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of defaultDateDb2
	 *	@return defaultDateDb2
	 */
   public char[] getDefaultDateDb2() throws CFException{
   		return defaultDateDb2;
   }

  
	/**
	*  set variable defaultDateDb2
	*  Corresponding COBOL Variable is DEFAULT-DATE-DB2
	*  @param value
	**/
   public void setDefaultDateDb2(char[] value) {
       value = checkDefaultDateDb2Constraints(value);
       arraycopy(value,0,defaultDateDb2,0,value.length);
   } 
	public void setDefaultDateDb2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,defaultDateDb2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fmtYyyyMmDd
	 *	@return fmtYyyyMmDd
	 */
   public char[] getFmtYyyyMmDd() throws CFException{
   		return fmtYyyyMmDd;
   }

  
	/**
	*  set variable fmtYyyyMmDd
	*  Corresponding COBOL Variable is FMT-YYYY-MM-DD
	*  @param value
	**/
   public void setFmtYyyyMmDd(char[] value) {
       value = checkFmtYyyyMmDdConstraints(value);
       arraycopy(value,0,fmtYyyyMmDd,0,value.length);
   } 
	public void setFmtYyyyMmDd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fmtYyyyMmDd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fmtYyddd
	 *	@return fmtYyddd
	 */
   public char[] getFmtYyddd() throws CFException{
   		return fmtYyddd;
   }

  
	/**
	*  set variable fmtYyddd
	*  Corresponding COBOL Variable is FMT-YYDDD
	*  @param value
	**/
   public void setFmtYyddd(char[] value) {
       value = checkFmtYydddConstraints(value);
       arraycopy(value,0,fmtYyddd,0,value.length);
   } 
	public void setFmtYyddd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fmtYyddd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ceedays
	 *	@return ceedays
	 */
   public char[] getCeedays() throws CFException{
   		return ceedays;
   }

  
	/**
	*  set variable ceedays
	*  Corresponding COBOL Variable is CEEDAYS
	*  @param value
	**/
   public void setCeedays(char[] value) {
       value = checkCeedaysConstraints(value);
       arraycopy(value,0,ceedays,0,value.length);
   } 
	public void setCeedays(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ceedays,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ceedate
	 *	@return ceedate
	 */
   public char[] getCeedate() throws CFException{
   		return ceedate;
   }

  
	/**
	*  set variable ceedate
	*  Corresponding COBOL Variable is CEEDATE
	*  @param value
	**/
   public void setCeedate(char[] value) {
       value = checkCeedateConstraints(value);
       arraycopy(value,0,ceedate,0,value.length);
   } 
	public void setCeedate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ceedate,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of maxClaimsDefault
	 *	@return maxClaimsDefault
	 */
	public long getMaxClaimsDefault() throws CFException {
       if (isMaxClaimsDefaultModified()) { 
           maxClaimsDefault = refreshMaxClaimsDefault();
        }
   		return maxClaimsDefault;
	}
	

	
	   
	/**
	 * 	Update MaxClaimsDefault with the passed value
	 *  Corresponding COBOL Variable is MAX-CLAIMS-DEFAULT
	 *	@param number
	 */
	public void setMaxClaimsDefault(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maxClaimsDefault = checkMaxClaimsDefaultMaxLimit(number); 
		serializeMaxClaimsDefault(maxClaimsDefault);
	}
	

	/**
	 * 	Update MaxClaimsDefault with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxClaimsDefault(char[] value) throws CFException {
		 maxClaimsDefault = serializeMaxClaimsDefault(value);
	}
	/**
	 * 	Update MaxClaimsDefault with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxClaimsDefaultString(char[] value) throws CFException {
		 setMaxClaimsDefault(value);
	}
	/**
	 *	Returns the value of maxClaimsRequested
	 *	@return maxClaimsRequested
	 */
	public long getMaxClaimsRequested() throws CFException {
       if (isMaxClaimsRequestedModified()) { 
           maxClaimsRequested = refreshMaxClaimsRequested();
        }
   		return maxClaimsRequested;
	}
	

	
	   
	/**
	 * 	Update MaxClaimsRequested with the passed value
	 *  Corresponding COBOL Variable is MAX-CLAIMS-REQUESTED
	 *	@param number
	 */
	public void setMaxClaimsRequested(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maxClaimsRequested = checkMaxClaimsRequestedMaxLimit(number); 
		serializeMaxClaimsRequested(maxClaimsRequested);
	}
	

	/**
	 * 	Update MaxClaimsRequested with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxClaimsRequested(char[] value) throws CFException {
		 maxClaimsRequested = serializeMaxClaimsRequested(value);
	}
	/**
	 * 	Update MaxClaimsRequested with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxClaimsRequestedString(char[] value) throws CFException {
		 setMaxClaimsRequested(value);
	}
	/**
	 *	Returns the value of d5427dt1MaxRows
	 *	@return d5427dt1MaxRows
	 */
	public int getD5427dt1MaxRows() throws CFException {
   		return d5427dt1MaxRows;
	}
	
	/**
	 * 	Update D5427dt1MaxRows with the passed value
	 *  Corresponding COBOL Variable is D5427DT1-MAX-ROWS
	 *	@param number
	 */
	public void setD5427dt1MaxRows(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d5427dt1MaxRows = checkD5427dt1MaxRowsMaxLimit(number); 
	}


	public void setD5427dt1MaxRows(long number) {
	    number = checkD5427dt1MaxRowsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD5427dt1MaxRows((int)number);
	}
	
	/**
	 *	Returns the value of d5427dt1MaxClaims
	 *	@return d5427dt1MaxClaims
	 */
	public int getD5427dt1MaxClaims() throws CFException {
   		return d5427dt1MaxClaims;
	}
	
	/**
	 * 	Update D5427dt1MaxClaims with the passed value
	 *  Corresponding COBOL Variable is D5427DT1-MAX-CLAIMS
	 *	@param number
	 */
	public void setD5427dt1MaxClaims(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d5427dt1MaxClaims = checkD5427dt1MaxClaimsMaxLimit(number); 
	}


	public void setD5427dt1MaxClaims(long number) {
	    number = checkD5427dt1MaxClaimsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD5427dt1MaxClaims((int)number);
	}
	
	/**
	 *	Returns the value of fetchRowsetMax
	 *	@return fetchRowsetMax
	 */
	public int getFetchRowsetMax() throws CFException {
   		return fetchRowsetMax;
	}
	
	/**
	 * 	Update FetchRowsetMax with the passed value
	 *  Corresponding COBOL Variable is FETCH-ROWSET-MAX
	 *	@param number
	 */
	public void setFetchRowsetMax(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fetchRowsetMax = checkFetchRowsetMaxMaxLimit(number); 
	}


	public void setFetchRowsetMax(long number) {
	    number = checkFetchRowsetMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFetchRowsetMax((int)number);
	}
	
	/**
	 *	Returns the value of fetchRowsRetrieved
	 *	@return fetchRowsRetrieved
	 */
	public int getFetchRowsRetrieved() throws CFException {
   		return fetchRowsRetrieved;
	}
	
	/**
	 * 	Update FetchRowsRetrieved with the passed value
	 *  Corresponding COBOL Variable is FETCH-ROWS-RETRIEVED
	 *	@param number
	 */
	public void setFetchRowsRetrieved(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fetchRowsRetrieved = checkFetchRowsRetrievedMaxLimit(number); 
	}


	public void setFetchRowsRetrieved(long number) {
	    number = checkFetchRowsRetrievedMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFetchRowsRetrieved((int)number);
	}
	
	/**
	 *	Returns the value of totalRowsRetrieved
	 *	@return totalRowsRetrieved
	 */
	public int getTotalRowsRetrieved() throws CFException {
   		return totalRowsRetrieved;
	}
	
	/**
	 * 	Update TotalRowsRetrieved with the passed value
	 *  Corresponding COBOL Variable is TOTAL-ROWS-RETRIEVED
	 *	@param number
	 */
	public void setTotalRowsRetrieved(int number) {
	     // Truncate if the number is beyond +/- Max range
	    totalRowsRetrieved = checkTotalRowsRetrievedMaxLimit(number); 
	}


	public void setTotalRowsRetrieved(long number) {
	    number = checkTotalRowsRetrievedMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTotalRowsRetrieved((int)number);
	}
	
	/**
	 *	Returns the value of nbrSrtItems
	 *	@return nbrSrtItems
	 */
	public int getNbrSrtItems() throws CFException {
   		return nbrSrtItems;
	}
	
	/**
	 * 	Update NbrSrtItems with the passed value
	 *  Corresponding COBOL Variable is NBR-SRT-ITEMS
	 *	@param number
	 */
	public void setNbrSrtItems(int number) {
	     // Truncate if the number is beyond +/- Max range
	    nbrSrtItems = checkNbrSrtItemsMaxLimit(number); 
	}


	public void setNbrSrtItems(long number) {
	    number = checkNbrSrtItemsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNbrSrtItems((int)number);
	}
	
	/**
	 *	Returns the value of payeeCode
	 *	@return payeeCode
	 */
   public char[] getPayeeCode() throws CFException{
   		return payeeCode;
   }

  
	/**
	*  set variable payeeCode
	*  Corresponding COBOL Variable is WS-PAYEE-CODE
	*  @param value
	**/
   public void setPayeeCode(char[] value) {
       value = checkPayeeCodeConstraints(value);
       arraycopy(value,0,payeeCode,0,value.length);
   } 
	public void setPayeeCode(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,payeeCode,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of headerCt
	 *	@return headerCt
	 */
	public short getHeaderCt() throws CFException {
   		return headerCt;
	}
	
	/**
	 * 	Update HeaderCt with the passed value
	 *  Corresponding COBOL Variable is WS-HEADER-CT
	 *	@param number
	 */
	public void setHeaderCt(short number) {
	     // Truncate if the number is beyond +/- Max range
	    headerCt = checkHeaderCtMaxLimit(number); 
	}

	public void setHeaderCt(int number) {
	    number = checkHeaderCtMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHeaderCt((short)number);
	}
	public void setHeaderCt(long number) {
	    number = checkHeaderCtMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHeaderCt((short)number);
	}
	

	/**
	 *	Returns the value of recType
	 *	@return recType
	 */
   public char[] getRecType() throws CFException{
   		return recType;
   }

  
	/**
	*  set variable recType
	*  Corresponding COBOL Variable is WS-REC-TYPE
	*  @param value
	**/
   public void setRecType(char[] value) {
       value = checkRecTypeConstraints(value);
       arraycopy(value,0,recType,0,value.length);
   } 
	public void setRecType(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,recType,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of diffrntVerFoundSw
	 *	@return diffrntVerFoundSw
	 */
   public char[] getDiffrntVerFoundSw() throws CFException{
   		return diffrntVerFoundSw;
   }

  
	/**
	*  set variable diffrntVerFoundSw
	*  Corresponding COBOL Variable is WS-DIFFRNT-VER-FOUND-SW
	*  @param value
	**/
   public void setDiffrntVerFoundSw(char[] value) {
       value = checkDiffrntVerFoundSwConstraints(value);
       arraycopy(value,0,diffrntVerFoundSw,0,value.length);
   } 
	public void setDiffrntVerFoundSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,diffrntVerFoundSw,0,beginIndex + endIndex);
   }
	char[] diffrntVerFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDiffrntVerFound()
	 *	@return  Returns true if isDiffrntVerFound() is "Y"
	 */
   public boolean isDiffrntVerFound() throws CFException {
      return (  compareChars( getDiffrntVerFoundSw() , diffrntVerFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDiffrntVerFoundTrue() {  			
    	setDiffrntVerFoundSw( diffrntVerFound88Value);
   	}
	char[] diffrntVerNotFound88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDiffrntVerNotFound()
	 *	@return  Returns true if isDiffrntVerNotFound() is "N"
	 */
   public boolean isDiffrntVerNotFound() throws CFException {
      return (  compareChars( getDiffrntVerFoundSw() , diffrntVerNotFound88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDiffrntVerNotFoundTrue() {  			
    	setDiffrntVerFoundSw( diffrntVerNotFound88Value);
   	}
	/**
	 *	Returns the value of claimSw
	 *	@return claimSw
	 */
   public char[] getClaimSw() throws CFException{
   		return claimSw;
   }

  
	/**
	*  set variable claimSw
	*  Corresponding COBOL Variable is CLAIM-SW
	*  @param value
	**/
   public void setClaimSw(char[] value) {
       value = checkClaimSwConstraints(value);
       arraycopy(value,0,claimSw,0,value.length);
   } 
	public void setClaimSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,claimSw,0,beginIndex + endIndex);
   }
	char[] claimNotfound88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isClaimNotfound()
	 *	@return  Returns true if isClaimNotfound() is "N"
	 */
   public boolean isClaimNotfound() throws CFException {
      return (  compareChars( getClaimSw() , claimNotfound88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setClaimNotfoundTrue() {  			
    	setClaimSw( claimNotfound88Value);
   	}
	char[] claimFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isClaimFound()
	 *	@return  Returns true if isClaimFound() is "Y"
	 */
   public boolean isClaimFound() throws CFException {
      return (  compareChars( getClaimSw() , claimFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setClaimFoundTrue() {  			
    	setClaimSw( claimFound88Value);
   	}
	/**
	 *	Returns the value of infoLineInd
	 *	@return infoLineInd
	 */
   public char[] getInfoLineInd() throws CFException{
   		return infoLineInd;
   }

  
	/**
	*  set variable infoLineInd
	*  Corresponding COBOL Variable is INFO-LINE-IND
	*  @param value
	**/
   public void setInfoLineInd(char[] value) {
       value = checkInfoLineIndConstraints(value);
       arraycopy(value,0,infoLineInd,0,value.length);
   } 
	public void setInfoLineInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,infoLineInd,0,beginIndex + endIndex);
   }
	char[] infoLineNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isInfoLineNo()
	 *	@return  Returns true if isInfoLineNo() is "N"
	 */
   public boolean isInfoLineNo() throws CFException {
      return (  compareChars( getInfoLineInd() , infoLineNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setInfoLineNoTrue() {  			
    	setInfoLineInd( infoLineNo88Value);
   	}
	char[] infoLineYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isInfoLineYes()
	 *	@return  Returns true if isInfoLineYes() is "Y"
	 */
   public boolean isInfoLineYes() throws CFException {
      return (  compareChars( getInfoLineInd() , infoLineYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setInfoLineYesTrue() {  			
    	setInfoLineInd( infoLineYes88Value);
   	}
	/**
	 *	Returns the value of clmHstEndOfFetchInd
	 *	@return clmHstEndOfFetchInd
	 */
   public char[] getClmHstEndOfFetchInd() throws CFException{
   		return clmHstEndOfFetchInd;
   }

  
	/**
	*  set variable clmHstEndOfFetchInd
	*  Corresponding COBOL Variable is CLM-HST-END-OF-FETCH-IND
	*  @param value
	**/
   public void setClmHstEndOfFetchInd(char[] value) {
       value = checkClmHstEndOfFetchIndConstraints(value);
       arraycopy(value,0,clmHstEndOfFetchInd,0,value.length);
   } 
	public void setClmHstEndOfFetchInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,clmHstEndOfFetchInd,0,beginIndex + endIndex);
   }
	char[] clmHstEndOfFetchNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isClmHstEndOfFetchNo()
	 *	@return  Returns true if isClmHstEndOfFetchNo() is "N"
	 */
   public boolean isClmHstEndOfFetchNo() throws CFException {
      return (  compareChars( getClmHstEndOfFetchInd() , clmHstEndOfFetchNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setClmHstEndOfFetchNoTrue() {  			
    	setClmHstEndOfFetchInd( clmHstEndOfFetchNo88Value);
   	}
	char[] clmHstEndOfFetchYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isClmHstEndOfFetchYes()
	 *	@return  Returns true if isClmHstEndOfFetchYes() is "Y"
	 */
   public boolean isClmHstEndOfFetchYes() throws CFException {
      return (  compareChars( getClmHstEndOfFetchInd() , clmHstEndOfFetchYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setClmHstEndOfFetchYesTrue() {  			
    	setClmHstEndOfFetchInd( clmHstEndOfFetchYes88Value);
   	}
	/**
	 *	Returns the value of queryFilterInd
	 *	@return queryFilterInd
	 */
   public char[] getQueryFilterInd() throws CFException{
   		return queryFilterInd;
   }

  
	/**
	*  set variable queryFilterInd
	*  Corresponding COBOL Variable is QUERY-FILTER-IND
	*  @param value
	**/
   public void setQueryFilterInd(char[] value) {
       value = checkQueryFilterIndConstraints(value);
       arraycopy(value,0,queryFilterInd,0,value.length);
   } 
	public void setQueryFilterInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterInd,0,beginIndex + endIndex);
   }
	char[] queryFilterNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isQueryFilterNo()
	 *	@return  Returns true if isQueryFilterNo() is "N"
	 */
   public boolean isQueryFilterNo() throws CFException {
      return (  compareChars( getQueryFilterInd() , queryFilterNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setQueryFilterNoTrue() {  			
    	setQueryFilterInd( queryFilterNo88Value);
   	}
	char[] queryFilterYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isQueryFilterYes()
	 *	@return  Returns true if isQueryFilterYes() is "Y"
	 */
   public boolean isQueryFilterYes() throws CFException {
      return (  compareChars( getQueryFilterInd() , queryFilterYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setQueryFilterYesTrue() {  			
    	setQueryFilterInd( queryFilterYes88Value);
   	}
	char[] queryFilterSrvcDtOnly88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isQueryFilterSrvcDtOnly()
	 *	@return  Returns true if isQueryFilterSrvcDtOnly() is "S"
	 */
   public boolean isQueryFilterSrvcDtOnly() throws CFException {
      return (  compareChars( getQueryFilterInd() , queryFilterSrvcDtOnly88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setQueryFilterSrvcDtOnlyTrue() {  			
    	setQueryFilterInd( queryFilterSrvcDtOnly88Value);
   	}
	char[] queryFilterSrvcDtProv88Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isQueryFilterSrvcDtProv()
	 *	@return  Returns true if isQueryFilterSrvcDtProv() is "P"
	 */
   public boolean isQueryFilterSrvcDtProv() throws CFException {
      return (  compareChars( getQueryFilterInd() , queryFilterSrvcDtProv88Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setQueryFilterSrvcDtProvTrue() {  			
    	setQueryFilterInd( queryFilterSrvcDtProv88Value);
   	}
	char[] queryFilterAllCpt88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isQueryFilterAllCpt()
	 *	@return  Returns true if isQueryFilterAllCpt() is "C"
	 */
   public boolean isQueryFilterAllCpt() throws CFException {
      return (  compareChars( getQueryFilterInd() , queryFilterAllCpt88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setQueryFilterAllCptTrue() {  			
    	setQueryFilterInd( queryFilterAllCpt88Value);
   	}
	char[] queryFilterAllCptOop88Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isQueryFilterAllCptOop()
	 *	@return  Returns true if isQueryFilterAllCptOop() is "O"
	 */
   public boolean isQueryFilterAllCptOop() throws CFException {
      return (  compareChars( getQueryFilterInd() , queryFilterAllCptOop88Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setQueryFilterAllCptOopTrue() {  			
    	setQueryFilterInd( queryFilterAllCptOop88Value);
   	}
	char[] queryFilterAllRev88Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isQueryFilterAllRev()
	 *	@return  Returns true if isQueryFilterAllRev() is "R"
	 */
   public boolean isQueryFilterAllRev() throws CFException {
      return (  compareChars( getQueryFilterInd() , queryFilterAllRev88Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setQueryFilterAllRevTrue() {  			
    	setQueryFilterInd( queryFilterAllRev88Value);
   	}
	char[] queryFilterAllRevOop88Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isQueryFilterAllRevOop()
	 *	@return  Returns true if isQueryFilterAllRevOop() is "T"
	 */
   public boolean isQueryFilterAllRevOop() throws CFException {
      return (  compareChars( getQueryFilterInd() , queryFilterAllRevOop88Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setQueryFilterAllRevOopTrue() {  			
    	setQueryFilterInd( queryFilterAllRevOop88Value);
   	}
	/**
	 *	Returns the value of dt1ClaimKeyMax
	 *	@return dt1ClaimKeyMax
	 */
	public int getDt1ClaimKeyMax() throws CFException {
       if (isDt1ClaimKeyMaxModified()) { 
           dt1ClaimKeyMax = refreshDt1ClaimKeyMax();
        }
   		return dt1ClaimKeyMax;
	}
	

	
	   
	/**
	 * 	Update Dt1ClaimKeyMax with the passed value
	 *  Corresponding COBOL Variable is DT1-CLAIM-KEY-MAX
	 *	@param number
	 */
	public void setDt1ClaimKeyMax(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClaimKeyMax = checkDt1ClaimKeyMaxMaxLimit(number); 
		serializeDt1ClaimKeyMax(dt1ClaimKeyMax);
	}
	

	public void setDt1ClaimKeyMax(long number) {
	    number = checkDt1ClaimKeyMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ClaimKeyMax((int)number);
	}
	
	/**
	 * 	Update Dt1ClaimKeyMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClaimKeyMax(char[] value) throws CFException {
		 dt1ClaimKeyMax = serializeDt1ClaimKeyMax(value);
	}
	/**
	 * 	Update Dt1ClaimKeyMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClaimKeyMaxString(char[] value) throws CFException {
		 setDt1ClaimKeyMax(value);
	}
	/**
	 *	Returns the value of dt1ClaimKeyCnt
	 *	@return dt1ClaimKeyCnt
	 */
	public int getDt1ClaimKeyCnt() throws CFException {
       if (isDt1ClaimKeyCntModified()) { 
           dt1ClaimKeyCnt = refreshDt1ClaimKeyCnt();
        }
   		return dt1ClaimKeyCnt;
	}
	

	
	   
	/**
	 * 	Update Dt1ClaimKeyCnt with the passed value
	 *  Corresponding COBOL Variable is DT1-CLAIM-KEY-CNT
	 *	@param number
	 */
	public void setDt1ClaimKeyCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClaimKeyCnt = checkDt1ClaimKeyCntMaxLimit(number); 
		serializeDt1ClaimKeyCnt(dt1ClaimKeyCnt);
	}
	

	public void setDt1ClaimKeyCnt(long number) {
	    number = checkDt1ClaimKeyCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ClaimKeyCnt((int)number);
	}
	
	/**
	 * 	Update Dt1ClaimKeyCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClaimKeyCnt(char[] value) throws CFException {
		 dt1ClaimKeyCnt = serializeDt1ClaimKeyCnt(value);
	}
	/**
	 * 	Update Dt1ClaimKeyCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClaimKeyCntString(char[] value) throws CFException {
		 setDt1ClaimKeyCnt(value);
	}
	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is I
	 *	@param number
	 */
	public void setI(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
	}

	public void setI(int number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	public void setI(long number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	

	/**
	 *	Returns the value of queryBaseCteStart
	 *	@return queryBaseCteStart
	 */
   public char[] getQueryBaseCteStart() throws CFException{
   		return queryBaseCteStart;
   }

  
	/**
	*  set variable queryBaseCteStart
	*  Corresponding COBOL Variable is QUERY-BASE-CTE-START
	*  @param value
	**/
   public void setQueryBaseCteStart(char[] value) {
       value = checkQueryBaseCteStartConstraints(value);
       arraycopy(value,0,queryBaseCteStart,0,value.length);
   } 
	public void setQueryBaseCteStart(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryBaseCteStart,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryBaseCteEnd
	 *	@return queryBaseCteEnd
	 */
   public char[] getQueryBaseCteEnd() throws CFException{
   		return queryBaseCteEnd;
   }

  
	/**
	*  set variable queryBaseCteEnd
	*  Corresponding COBOL Variable is QUERY-BASE-CTE-END
	*  @param value
	**/
   public void setQueryBaseCteEnd(char[] value) {
       value = checkQueryBaseCteEndConstraints(value);
       arraycopy(value,0,queryBaseCteEnd,0,value.length);
   } 
	public void setQueryBaseCteEnd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryBaseCteEnd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterProviderTin
	 *	@return queryFilterProviderTin
	 */
   public char[] getQueryFilterProviderTin() throws CFException{
   		return queryFilterProviderTin;
   }

  
	/**
	*  set variable queryFilterProviderTin
	*  Corresponding COBOL Variable is QUERY-FILTER-PROVIDER-TIN
	*  @param value
	**/
   public void setQueryFilterProviderTin(char[] value) {
       value = checkQueryFilterProviderTinConstraints(value);
       arraycopy(value,0,queryFilterProviderTin,0,value.length);
   } 
	public void setQueryFilterProviderTin(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterProviderTin,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterIcn
	 *	@return queryFilterIcn
	 */
   public char[] getQueryFilterIcn() throws CFException{
   		return queryFilterIcn;
   }

  
	/**
	*  set variable queryFilterIcn
	*  Corresponding COBOL Variable is QUERY-FILTER-ICN
	*  @param value
	**/
   public void setQueryFilterIcn(char[] value) {
       value = checkQueryFilterIcnConstraints(value);
       arraycopy(value,0,queryFilterIcn,0,value.length);
   } 
	public void setQueryFilterIcn(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterIcn,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterAuthStart
	 *	@return queryFilterAuthStart
	 */
   public char[] getQueryFilterAuthStart() throws CFException{
   		return queryFilterAuthStart;
   }

  
	/**
	*  set variable queryFilterAuthStart
	*  Corresponding COBOL Variable is QUERY-FILTER-AUTH-START
	*  @param value
	**/
   public void setQueryFilterAuthStart(char[] value) {
       value = checkQueryFilterAuthStartConstraints(value);
       arraycopy(value,0,queryFilterAuthStart,0,value.length);
   } 
	public void setQueryFilterAuthStart(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterAuthStart,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterAuthEnd
	 *	@return queryFilterAuthEnd
	 */
   public char[] getQueryFilterAuthEnd() throws CFException{
   		return queryFilterAuthEnd;
   }

  
	/**
	*  set variable queryFilterAuthEnd
	*  Corresponding COBOL Variable is QUERY-FILTER-AUTH-END
	*  @param value
	**/
   public void setQueryFilterAuthEnd(char[] value) {
       value = checkQueryFilterAuthEndConstraints(value);
       arraycopy(value,0,queryFilterAuthEnd,0,value.length);
   } 
	public void setQueryFilterAuthEnd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterAuthEnd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterAuthBaseEnd
	 *	@return queryFilterAuthBaseEnd
	 */
   public char[] getQueryFilterAuthBaseEnd() throws CFException{
   		return queryFilterAuthBaseEnd;
   }

  
	/**
	*  set variable queryFilterAuthBaseEnd
	*  Corresponding COBOL Variable is QUERY-FILTER-AUTH-BASE-END
	*  @param value
	**/
   public void setQueryFilterAuthBaseEnd(char[] value) {
       value = checkQueryFilterAuthBaseEndConstraints(value);
       arraycopy(value,0,queryFilterAuthBaseEnd,0,value.length);
   } 
	public void setQueryFilterAuthBaseEnd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterAuthBaseEnd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterDlgtStart
	 *	@return queryFilterDlgtStart
	 */
   public char[] getQueryFilterDlgtStart() throws CFException{
   		return queryFilterDlgtStart;
   }

  
	/**
	*  set variable queryFilterDlgtStart
	*  Corresponding COBOL Variable is QUERY-FILTER-DLGT-START
	*  @param value
	**/
   public void setQueryFilterDlgtStart(char[] value) {
       value = checkQueryFilterDlgtStartConstraints(value);
       arraycopy(value,0,queryFilterDlgtStart,0,value.length);
   } 
	public void setQueryFilterDlgtStart(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterDlgtStart,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterAuthCrit6
	 *	@return queryFilterAuthCrit6
	 */
   public char[] getQueryFilterAuthCrit6() throws CFException{
   		return queryFilterAuthCrit6;
   }

  
	/**
	*  set variable queryFilterAuthCrit6
	*  Corresponding COBOL Variable is QUERY-FILTER-AUTH-CRIT-6
	*  @param value
	**/
   public void setQueryFilterAuthCrit6(char[] value) {
       value = checkQueryFilterAuthCrit6Constraints(value);
       arraycopy(value,0,queryFilterAuthCrit6,0,value.length);
   } 
	public void setQueryFilterAuthCrit6(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterAuthCrit6,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterDlgtCrit6
	 *	@return queryFilterDlgtCrit6
	 */
   public char[] getQueryFilterDlgtCrit6() throws CFException{
   		return queryFilterDlgtCrit6;
   }

  
	/**
	*  set variable queryFilterDlgtCrit6
	*  Corresponding COBOL Variable is QUERY-FILTER-DLGT-CRIT-6
	*  @param value
	**/
   public void setQueryFilterDlgtCrit6(char[] value) {
       value = checkQueryFilterDlgtCrit6Constraints(value);
       arraycopy(value,0,queryFilterDlgtCrit6,0,value.length);
   } 
	public void setQueryFilterDlgtCrit6(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterDlgtCrit6,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterSpiStart
	 *	@return queryFilterSpiStart
	 */
   public char[] getQueryFilterSpiStart() throws CFException{
   		return queryFilterSpiStart;
   }

  
	/**
	*  set variable queryFilterSpiStart
	*  Corresponding COBOL Variable is QUERY-FILTER-SPI-START
	*  @param value
	**/
   public void setQueryFilterSpiStart(char[] value) {
       value = checkQueryFilterSpiStartConstraints(value);
       arraycopy(value,0,queryFilterSpiStart,0,value.length);
   } 
	public void setQueryFilterSpiStart(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterSpiStart,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterSpiEnd
	 *	@return queryFilterSpiEnd
	 */
   public char[] getQueryFilterSpiEnd() throws CFException{
   		return queryFilterSpiEnd;
   }

  
	/**
	*  set variable queryFilterSpiEnd
	*  Corresponding COBOL Variable is QUERY-FILTER-SPI-END
	*  @param value
	**/
   public void setQueryFilterSpiEnd(char[] value) {
       value = checkQueryFilterSpiEndConstraints(value);
       arraycopy(value,0,queryFilterSpiEnd,0,value.length);
   } 
	public void setQueryFilterSpiEnd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterSpiEnd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterSpiPred1
	 *	@return queryFilterSpiPred1
	 */
   public char[] getQueryFilterSpiPred1() throws CFException{
   		return queryFilterSpiPred1;
   }

  
	/**
	*  set variable queryFilterSpiPred1
	*  Corresponding COBOL Variable is QUERY-FILTER-SPI-PRED-1
	*  @param value
	**/
   public void setQueryFilterSpiPred1(char[] value) {
       value = checkQueryFilterSpiPred1Constraints(value);
       arraycopy(value,0,queryFilterSpiPred1,0,value.length);
   } 
	public void setQueryFilterSpiPred1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterSpiPred1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterSpiPred2
	 *	@return queryFilterSpiPred2
	 */
   public char[] getQueryFilterSpiPred2() throws CFException{
   		return queryFilterSpiPred2;
   }

  
	/**
	*  set variable queryFilterSpiPred2
	*  Corresponding COBOL Variable is QUERY-FILTER-SPI-PRED-2
	*  @param value
	**/
   public void setQueryFilterSpiPred2(char[] value) {
       value = checkQueryFilterSpiPred2Constraints(value);
       arraycopy(value,0,queryFilterSpiPred2,0,value.length);
   } 
	public void setQueryFilterSpiPred2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterSpiPred2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterSpiPred3
	 *	@return queryFilterSpiPred3
	 */
   public char[] getQueryFilterSpiPred3() throws CFException{
   		return queryFilterSpiPred3;
   }

  
	/**
	*  set variable queryFilterSpiPred3
	*  Corresponding COBOL Variable is QUERY-FILTER-SPI-PRED-3
	*  @param value
	**/
   public void setQueryFilterSpiPred3(char[] value) {
       value = checkQueryFilterSpiPred3Constraints(value);
       arraycopy(value,0,queryFilterSpiPred3,0,value.length);
   } 
	public void setQueryFilterSpiPred3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterSpiPred3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterSpiPred4
	 *	@return queryFilterSpiPred4
	 */
   public char[] getQueryFilterSpiPred4() throws CFException{
   		return queryFilterSpiPred4;
   }

  
	/**
	*  set variable queryFilterSpiPred4
	*  Corresponding COBOL Variable is QUERY-FILTER-SPI-PRED-4
	*  @param value
	**/
   public void setQueryFilterSpiPred4(char[] value) {
       value = checkQueryFilterSpiPred4Constraints(value);
       arraycopy(value,0,queryFilterSpiPred4,0,value.length);
   } 
	public void setQueryFilterSpiPred4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterSpiPred4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of queryFilterSpiPred5
	 *	@return queryFilterSpiPred5
	 */
   public char[] getQueryFilterSpiPred5() throws CFException{
   		return queryFilterSpiPred5;
   }

  
	/**
	*  set variable queryFilterSpiPred5
	*  Corresponding COBOL Variable is QUERY-FILTER-SPI-PRED-5
	*  @param value
	**/
   public void setQueryFilterSpiPred5(char[] value) {
       value = checkQueryFilterSpiPred5Constraints(value);
       arraycopy(value,0,queryFilterSpiPred5,0,value.length);
   } 
	public void setQueryFilterSpiPred5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,queryFilterSpiPred5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public int getSqlcode_Ws() throws CFException {
   		return sqlcode_Ws;
	}
	
	/**
	 * 	Update Sqlcode_Ws with the passed value
	 *  Corresponding COBOL Variable is WS-SQLCODE
	 *	@param number
	 */
	public void setSqlcode_Ws(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlcode_Ws = checkSqlcode_WsMaxLimit(number); 
	}


	public void setSqlcode_Ws(long number) {
	    number = checkSqlcode_WsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqlcode_Ws((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isSqlcodeOk()
	 *	@return  Returns true if isSqlcodeOk() is 0
	 */
   public boolean isSqlcodeOk() throws CFException {
      return (  getSqlcode_Ws()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSqlcodeOkTrue() {  			
    	setSqlcode_Ws( 0);
   	}
	
	/**
	 *	Test condition 100 -305 for isSqlcodeNotFound()
	 *	@return  Returns true if isSqlcodeNotFound() is 100 -305
	 */
   public boolean isSqlcodeNotFound() throws CFException {
      return (  getSqlcode_Ws()  ==  100  ||  getSqlcode_Ws()  ==  -305  );
   }


	/**
	*  set values 100 -305
	*/
   	public void setSqlcodeNotFoundTrue() {  			
    	setSqlcode_Ws( 100);
   	}
	
	/**
	 *	Test condition 100 for isSqlcodeFetchEnd()
	 *	@return  Returns true if isSqlcodeFetchEnd() is 100
	 */
   public boolean isSqlcodeFetchEnd() throws CFException {
      return (  getSqlcode_Ws()  ==  100  );
   }


	/**
	*  set values 100
	*/
   	public void setSqlcodeFetchEndTrue() {  			
    	setSqlcode_Ws( 100);
   	}
	
	/**
	 *	Test condition 0 THRU 999 for isSqlcodePositive()
	 *	@return  Returns true if isSqlcodePositive() is 0 THRU 999
	 */
   public boolean isSqlcodePositive() throws CFException {
      return (   (getSqlcode_Ws()  >=  0 ) &&   (getSqlcode_Ws()  <=  999 )   );
   }


	/**
	*  set values 0 THRU 999
	*/
   	public void setSqlcodePositiveTrue() {  			
    	setSqlcode_Ws( 0);
   	}
	
	/**
	 *	Test condition -999 THRU -1 for isSqlcodeNegative()
	 *	@return  Returns true if isSqlcodeNegative() is -999 THRU -1
	 */
   public boolean isSqlcodeNegative() throws CFException {
      return (   (getSqlcode_Ws()  >=  -999 ) &&   (getSqlcode_Ws()  <=  -1 )   );
   }


	/**
	*  set values -999 THRU -1
	*/
   	public void setSqlcodeNegativeTrue() {  			
    	setSqlcode_Ws( -999);
   	}
	
	/**
	 *	Test condition -180 -181 for isSqlcodeInvalidDate()
	 *	@return  Returns true if isSqlcodeInvalidDate() is -180 -181
	 */
   public boolean isSqlcodeInvalidDate() throws CFException {
      return (  getSqlcode_Ws()  ==  -180  ||  getSqlcode_Ws()  ==  -181  );
   }


	/**
	*  set values -180 -181
	*/
   	public void setSqlcodeInvalidDateTrue() {  			
    	setSqlcode_Ws( -180);
   	}
	
	/**
	 *	Test condition -305 for isSqlcodeNullValueReturned()
	 *	@return  Returns true if isSqlcodeNullValueReturned() is -305
	 */
   public boolean isSqlcodeNullValueReturned() throws CFException {
      return (  getSqlcode_Ws()  ==  -305  );
   }


	/**
	*  set values -305
	*/
   	public void setSqlcodeNullValueReturnedTrue() {  			
    	setSqlcode_Ws( -305);
   	}
	
	/**
	 *	Test condition -413 for isSqlcodeOverflow()
	 *	@return  Returns true if isSqlcodeOverflow() is -413
	 */
   public boolean isSqlcodeOverflow() throws CFException {
      return (  getSqlcode_Ws()  ==  -413  );
   }


	/**
	*  set values -413
	*/
   	public void setSqlcodeOverflowTrue() {  			
    	setSqlcode_Ws( -413);
   	}
	
	/**
	 *	Test condition -509 THRU -501 for isSqlcodeCursorErr()
	 *	@return  Returns true if isSqlcodeCursorErr() is -509 THRU -501
	 */
   public boolean isSqlcodeCursorErr() throws CFException {
      return (   (getSqlcode_Ws()  >=  -509 ) &&   (getSqlcode_Ws()  <=  -501 )   );
   }


	/**
	*  set values -509 THRU -501
	*/
   	public void setSqlcodeCursorErrTrue() {  			
    	setSqlcode_Ws( -509);
   	}
	
	/**
	 *	Test condition -803 for isSqlcodeDupViolation()
	 *	@return  Returns true if isSqlcodeDupViolation() is -803
	 */
   public boolean isSqlcodeDupViolation() throws CFException {
      return (  getSqlcode_Ws()  ==  -803  );
   }


	/**
	*  set values -803
	*/
   	public void setSqlcodeDupViolationTrue() {  			
    	setSqlcode_Ws( -803);
   	}
	
	/**
	 *	Test condition -805 -818 for isSqlcodeBindErr()
	 *	@return  Returns true if isSqlcodeBindErr() is -805 -818
	 */
   public boolean isSqlcodeBindErr() throws CFException {
      return (  getSqlcode_Ws()  ==  -805  ||  getSqlcode_Ws()  ==  -818  );
   }


	/**
	*  set values -805 -818
	*/
   	public void setSqlcodeBindErrTrue() {  			
    	setSqlcode_Ws( -805);
   	}
	
	/**
	 *	Test condition -811 for isSqlcodeMultRows()
	 *	@return  Returns true if isSqlcodeMultRows() is -811
	 */
   public boolean isSqlcodeMultRows() throws CFException {
      return (  getSqlcode_Ws()  ==  -811  );
   }


	/**
	*  set values -811
	*/
   	public void setSqlcodeMultRowsTrue() {  			
    	setSqlcode_Ws( -811);
   	}
	
	/**
	 *	Test condition -900 for isSqlcodeNoServer()
	 *	@return  Returns true if isSqlcodeNoServer() is -900
	 */
   public boolean isSqlcodeNoServer() throws CFException {
      return (  getSqlcode_Ws()  ==  -900  );
   }


	/**
	*  set values -900
	*/
   	public void setSqlcodeNoServerTrue() {  			
    	setSqlcode_Ws( -900);
   	}
	
	/**
	 *	Test condition -901 for isSqlcodeDb2SysErr()
	 *	@return  Returns true if isSqlcodeDb2SysErr() is -901
	 */
   public boolean isSqlcodeDb2SysErr() throws CFException {
      return (  getSqlcode_Ws()  ==  -901  );
   }


	/**
	*  set values -901
	*/
   	public void setSqlcodeDb2SysErrTrue() {  			
    	setSqlcode_Ws( -901);
   	}
	
	/**
	 *	Test condition -904 for isSqlcodeResourceErr()
	 *	@return  Returns true if isSqlcodeResourceErr() is -904
	 */
   public boolean isSqlcodeResourceErr() throws CFException {
      return (  getSqlcode_Ws()  ==  -904  );
   }


	/**
	*  set values -904
	*/
   	public void setSqlcodeResourceErrTrue() {  			
    	setSqlcode_Ws( -904);
   	}
	
	/**
	 *	Test condition -905 for isSqlcodeTimeOut()
	 *	@return  Returns true if isSqlcodeTimeOut() is -905
	 */
   public boolean isSqlcodeTimeOut() throws CFException {
      return (  getSqlcode_Ws()  ==  -905  );
   }


	/**
	*  set values -905
	*/
   	public void setSqlcodeTimeOutTrue() {  			
    	setSqlcode_Ws( -905);
   	}
	
	/**
	 *	Test condition -911 for isSqlcodeDeadlockNorb()
	 *	@return  Returns true if isSqlcodeDeadlockNorb() is -911
	 */
   public boolean isSqlcodeDeadlockNorb() throws CFException {
      return (  getSqlcode_Ws()  ==  -911  );
   }


	/**
	*  set values -911
	*/
   	public void setSqlcodeDeadlockNorbTrue() {  			
    	setSqlcode_Ws( -911);
   	}
	
	/**
	 *	Test condition -913 for isSqlcodeDeadlockRb()
	 *	@return  Returns true if isSqlcodeDeadlockRb() is -913
	 */
   public boolean isSqlcodeDeadlockRb() throws CFException {
      return (  getSqlcode_Ws()  ==  -913  );
   }


	/**
	*  set values -913
	*/
   	public void setSqlcodeDeadlockRbTrue() {  			
    	setSqlcode_Ws( -913);
   	}
	
	/**
	 *	Test condition -922 for isSqlcodePlanSecurityErr()
	 *	@return  Returns true if isSqlcodePlanSecurityErr() is -922
	 */
   public boolean isSqlcodePlanSecurityErr() throws CFException {
      return (  getSqlcode_Ws()  ==  -922  );
   }


	/**
	*  set values -922
	*/
   	public void setSqlcodePlanSecurityErrTrue() {  			
    	setSqlcode_Ws( -922);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
