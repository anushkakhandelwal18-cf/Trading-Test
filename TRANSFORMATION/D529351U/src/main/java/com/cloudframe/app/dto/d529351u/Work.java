package com.cloudframe.app.dto.d529351u;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private short dsmFuncCd;

								private int sub;

								private int csSub;

								private int frtoSub;

								private int ptypSub;

								private int icdSub;

								private int fcndSub;

								private int causSub;

								private int ipaSub;

								private int cflgSub;

								private int mainCtr;

								private int planMatch;

								private long planEffDate;

								private long planCanDate;

						private char[] fetchEnd = new char[1];

						private char[] closeCsrInd = new char[1];

						private char[] fetchEndMain = new char[1];

						private char[] fetchEndFrto = new char[1];

						private char[] fetchEndPtyp = new char[1];

						private char[] fetchEndIcd = new char[1];

						private char[] fetchEndFcnd = new char[1];

						private char[] fetchEndComb = new char[1];

								private int sqlcode_Ws;

								private int dsnnrows;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSub(0);
								setCsSub(0);
								setFrtoSub(0);
								setPtypSub(0);
								setIcdSub(0);
								setFcndSub(0);
								setCausSub(0);
								setIpaSub(0);
								setCflgSub(0);
								setMainCtr(0);
								setPlanMatch(0);
								setPlanEffDate(0L);
								setPlanCanDate(0L);
								setFetchEnd(fillSpace(1));
								setCloseCsrInd(fillSpace(1));
								setFetchEndMain(fillSpace(1));
								setFetchEndFrto(fillSpace(1));
								setFetchEndPtyp(fillSpace(1));
								setFetchEndIcd(fillSpace(1));
								setFetchEndFcnd(fillSpace(1));
								setFetchEndComb(fillSpace(1));
    }


 

	/**
	 *	Returns the value of dsmFuncCd
	 *	@return dsmFuncCd
	 */
	public short getDsmFuncCd() throws CFException {
   		return dsmFuncCd;
	}
	
	/**
	 * 	Update DsmFuncCd with the passed value
	 *  Corresponding COBOL Variable is WS-DSM-FUNC-CD
	 *	@param number
	 */
	public void setDsmFuncCd(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dsmFuncCd = checkDsmFuncCdMaxLimit(number); 
	}

	public void setDsmFuncCd(int number) {
	    number = checkDsmFuncCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDsmFuncCd((short)number);
	}
	public void setDsmFuncCd(long number) {
	    number = checkDsmFuncCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDsmFuncCd((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isFuncCd1()
	 *	@return  Returns true if isFuncCd1() is 1
	 */
   public boolean isFuncCd1() throws CFException {
      return (  getDsmFuncCd()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setFuncCd1True() {  			
    	setDsmFuncCd( (short)1);
   	}
	
	/**
	 *	Test condition 2 for isFuncCd2()
	 *	@return  Returns true if isFuncCd2() is 2
	 */
   public boolean isFuncCd2() throws CFException {
      return (  getDsmFuncCd()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setFuncCd2True() {  			
    	setDsmFuncCd( (short)2);
   	}
	
	/**
	 *	Test condition 3 for isFuncCd3()
	 *	@return  Returns true if isFuncCd3() is 3
	 */
   public boolean isFuncCd3() throws CFException {
      return (  getDsmFuncCd()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setFuncCd3True() {  			
    	setDsmFuncCd( (short)3);
   	}
	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {
   		return sub;
	}
	
	/**
	 * 	Update Sub with the passed value
	 *  Corresponding COBOL Variable is WS-SUB
	 *	@param number
	 */
	public void setSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sub = checkSubMaxLimit(number); 
	}


	public void setSub(long number) {
	    number = checkSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSub((int)number);
	}
	
	/**
	 *	Returns the value of csSub
	 *	@return csSub
	 */
	public int getCsSub() throws CFException {
   		return csSub;
	}
	
	/**
	 * 	Update CsSub with the passed value
	 *  Corresponding COBOL Variable is CS-SUB
	 *	@param number
	 */
	public void setCsSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    csSub = checkCsSubMaxLimit(number); 
	}


	public void setCsSub(long number) {
	    number = checkCsSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCsSub((int)number);
	}
	
	/**
	 *	Returns the value of frtoSub
	 *	@return frtoSub
	 */
	public int getFrtoSub() throws CFException {
   		return frtoSub;
	}
	
	/**
	 * 	Update FrtoSub with the passed value
	 *  Corresponding COBOL Variable is FRTO-SUB
	 *	@param number
	 */
	public void setFrtoSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    frtoSub = checkFrtoSubMaxLimit(number); 
	}


	public void setFrtoSub(long number) {
	    number = checkFrtoSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFrtoSub((int)number);
	}
	
	/**
	 *	Returns the value of ptypSub
	 *	@return ptypSub
	 */
	public int getPtypSub() throws CFException {
   		return ptypSub;
	}
	
	/**
	 * 	Update PtypSub with the passed value
	 *  Corresponding COBOL Variable is PTYP-SUB
	 *	@param number
	 */
	public void setPtypSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ptypSub = checkPtypSubMaxLimit(number); 
	}


	public void setPtypSub(long number) {
	    number = checkPtypSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPtypSub((int)number);
	}
	
	/**
	 *	Returns the value of icdSub
	 *	@return icdSub
	 */
	public int getIcdSub() throws CFException {
   		return icdSub;
	}
	
	/**
	 * 	Update IcdSub with the passed value
	 *  Corresponding COBOL Variable is ICD-SUB
	 *	@param number
	 */
	public void setIcdSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    icdSub = checkIcdSubMaxLimit(number); 
	}


	public void setIcdSub(long number) {
	    number = checkIcdSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIcdSub((int)number);
	}
	
	/**
	 *	Returns the value of fcndSub
	 *	@return fcndSub
	 */
	public int getFcndSub() throws CFException {
   		return fcndSub;
	}
	
	/**
	 * 	Update FcndSub with the passed value
	 *  Corresponding COBOL Variable is FCND-SUB
	 *	@param number
	 */
	public void setFcndSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fcndSub = checkFcndSubMaxLimit(number); 
	}


	public void setFcndSub(long number) {
	    number = checkFcndSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFcndSub((int)number);
	}
	
	/**
	 *	Returns the value of causSub
	 *	@return causSub
	 */
	public int getCausSub() throws CFException {
   		return causSub;
	}
	
	/**
	 * 	Update CausSub with the passed value
	 *  Corresponding COBOL Variable is CAUS-SUB
	 *	@param number
	 */
	public void setCausSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    causSub = checkCausSubMaxLimit(number); 
	}


	public void setCausSub(long number) {
	    number = checkCausSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCausSub((int)number);
	}
	
	/**
	 *	Returns the value of ipaSub
	 *	@return ipaSub
	 */
	public int getIpaSub() throws CFException {
   		return ipaSub;
	}
	
	/**
	 * 	Update IpaSub with the passed value
	 *  Corresponding COBOL Variable is IPA-SUB
	 *	@param number
	 */
	public void setIpaSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ipaSub = checkIpaSubMaxLimit(number); 
	}


	public void setIpaSub(long number) {
	    number = checkIpaSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIpaSub((int)number);
	}
	
	/**
	 *	Returns the value of cflgSub
	 *	@return cflgSub
	 */
	public int getCflgSub() throws CFException {
   		return cflgSub;
	}
	
	/**
	 * 	Update CflgSub with the passed value
	 *  Corresponding COBOL Variable is CFLG-SUB
	 *	@param number
	 */
	public void setCflgSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cflgSub = checkCflgSubMaxLimit(number); 
	}


	public void setCflgSub(long number) {
	    number = checkCflgSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCflgSub((int)number);
	}
	
	/**
	 *	Returns the value of mainCtr
	 *	@return mainCtr
	 */
	public int getMainCtr() throws CFException {
   		return mainCtr;
	}
	
	/**
	 * 	Update MainCtr with the passed value
	 *  Corresponding COBOL Variable is WS-MAIN-CTR
	 *	@param number
	 */
	public void setMainCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mainCtr = checkMainCtrMaxLimit(number); 
	}


	public void setMainCtr(long number) {
	    number = checkMainCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMainCtr((int)number);
	}
	
	/**
	 *	Returns the value of planMatch
	 *	@return planMatch
	 */
	public int getPlanMatch() throws CFException {
   		return planMatch;
	}
	
	/**
	 * 	Update PlanMatch with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-MATCH
	 *	@param number
	 */
	public void setPlanMatch(int number) {
	     // Truncate if the number is beyond +/- Max range
	    planMatch = checkPlanMatchMaxLimit(number); 
	}


	public void setPlanMatch(long number) {
	    number = checkPlanMatchMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanMatch((int)number);
	}
	
	/**
	 *	Returns the value of planEffDate
	 *	@return planEffDate
	 */
	public long getPlanEffDate() throws CFException {
       if (isPlanEffDateModified()) { 
           planEffDate = refreshPlanEffDate();
        }
   		return planEffDate;
	}
	

	
	   
	/**
	 * 	Update PlanEffDate with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-EFF-DATE
	 *	@param number
	 */
	public void setPlanEffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    planEffDate = checkPlanEffDateMaxLimit(number); 
		serializePlanEffDate(planEffDate);
	}
	

	/**
	 * 	Update PlanEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanEffDate(char[] value) throws CFException {
		 planEffDate = serializePlanEffDate(value);
	}
	/**
	 * 	Update PlanEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanEffDateString(char[] value) throws CFException {
		 setPlanEffDate(value);
	}
	/**
	 *	Returns the value of planCanDate
	 *	@return planCanDate
	 */
	public long getPlanCanDate() throws CFException {
       if (isPlanCanDateModified()) { 
           planCanDate = refreshPlanCanDate();
        }
   		return planCanDate;
	}
	

	
	   
	/**
	 * 	Update PlanCanDate with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-CAN-DATE
	 *	@param number
	 */
	public void setPlanCanDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    planCanDate = checkPlanCanDateMaxLimit(number); 
		serializePlanCanDate(planCanDate);
	}
	

	/**
	 * 	Update PlanCanDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanCanDate(char[] value) throws CFException {
		 planCanDate = serializePlanCanDate(value);
	}
	/**
	 * 	Update PlanCanDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanCanDateString(char[] value) throws CFException {
		 setPlanCanDate(value);
	}
	/**
	 *	Returns the value of fetchEnd
	 *	@return fetchEnd
	 */
   public char[] getFetchEnd() throws CFException{
   		return fetchEnd;
   }

  
	/**
	*  set variable fetchEnd
	*  Corresponding COBOL Variable is WS-FETCH-END
	*  @param value
	**/
   public void setFetchEnd(char[] value) {
       value = checkFetchEndConstraints(value);
       arraycopy(value,0,fetchEnd,0,value.length);
   } 
	public void setFetchEnd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fetchEnd,0,beginIndex + endIndex);
   }
	char[] endOfFetch88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFetch()
	 *	@return  Returns true if isEndOfFetch() is "Y"
	 */
   public boolean isEndOfFetch() throws CFException {
      return (  compareChars( getFetchEnd() , endOfFetch88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFetchTrue() {  			
    	setFetchEnd( endOfFetch88Value);
   	}
	char[] notEndOfFetch88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotEndOfFetch()
	 *	@return  Returns true if isNotEndOfFetch() is "N"
	 */
   public boolean isNotEndOfFetch() throws CFException {
      return (  compareChars( getFetchEnd() , notEndOfFetch88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotEndOfFetchTrue() {  			
    	setFetchEnd( notEndOfFetch88Value);
   	}
	/**
	 *	Returns the value of closeCsrInd
	 *	@return closeCsrInd
	 */
   public char[] getCloseCsrInd() throws CFException{
   		return closeCsrInd;
   }

  
	/**
	*  set variable closeCsrInd
	*  Corresponding COBOL Variable is CLOSE-CSR-IND
	*  @param value
	**/
   public void setCloseCsrInd(char[] value) {
       value = checkCloseCsrIndConstraints(value);
       arraycopy(value,0,closeCsrInd,0,value.length);
   } 
	public void setCloseCsrInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,closeCsrInd,0,beginIndex + endIndex);
   }
	char[] closeCsrOk88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isCloseCsrOk()
	 *	@return  Returns true if isCloseCsrOk() is "Y"
	 */
   public boolean isCloseCsrOk() throws CFException {
      return (  compareChars( getCloseCsrInd() , closeCsrOk88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setCloseCsrOkTrue() {  			
    	setCloseCsrInd( closeCsrOk88Value);
   	}
	char[] closeCsrNg88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isCloseCsrNg()
	 *	@return  Returns true if isCloseCsrNg() is "N"
	 */
   public boolean isCloseCsrNg() throws CFException {
      return (  compareChars( getCloseCsrInd() , closeCsrNg88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setCloseCsrNgTrue() {  			
    	setCloseCsrInd( closeCsrNg88Value);
   	}
	/**
	 *	Returns the value of fetchEndMain
	 *	@return fetchEndMain
	 */
   public char[] getFetchEndMain() throws CFException{
   		return fetchEndMain;
   }

  
	/**
	*  set variable fetchEndMain
	*  Corresponding COBOL Variable is WS-FETCH-END-MAIN
	*  @param value
	**/
   public void setFetchEndMain(char[] value) {
       value = checkFetchEndMainConstraints(value);
       arraycopy(value,0,fetchEndMain,0,value.length);
   } 
	public void setFetchEndMain(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fetchEndMain,0,beginIndex + endIndex);
   }
	char[] endOfFetchMain88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFetchMain()
	 *	@return  Returns true if isEndOfFetchMain() is "Y"
	 */
   public boolean isEndOfFetchMain() throws CFException {
      return (  compareChars( getFetchEndMain() , endOfFetchMain88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFetchMainTrue() {  			
    	setFetchEndMain( endOfFetchMain88Value);
   	}
	char[] notEndOfFetchMain88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotEndOfFetchMain()
	 *	@return  Returns true if isNotEndOfFetchMain() is "N"
	 */
   public boolean isNotEndOfFetchMain() throws CFException {
      return (  compareChars( getFetchEndMain() , notEndOfFetchMain88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotEndOfFetchMainTrue() {  			
    	setFetchEndMain( notEndOfFetchMain88Value);
   	}
	/**
	 *	Returns the value of fetchEndFrto
	 *	@return fetchEndFrto
	 */
   public char[] getFetchEndFrto() throws CFException{
   		return fetchEndFrto;
   }

  
	/**
	*  set variable fetchEndFrto
	*  Corresponding COBOL Variable is WS-FETCH-END-FRTO
	*  @param value
	**/
   public void setFetchEndFrto(char[] value) {
       value = checkFetchEndFrtoConstraints(value);
       arraycopy(value,0,fetchEndFrto,0,value.length);
   } 
	public void setFetchEndFrto(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fetchEndFrto,0,beginIndex + endIndex);
   }
	char[] endOfFetchFrto88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFetchFrto()
	 *	@return  Returns true if isEndOfFetchFrto() is "Y"
	 */
   public boolean isEndOfFetchFrto() throws CFException {
      return (  compareChars( getFetchEndFrto() , endOfFetchFrto88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFetchFrtoTrue() {  			
    	setFetchEndFrto( endOfFetchFrto88Value);
   	}
	char[] notEndOfFetchFrto88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotEndOfFetchFrto()
	 *	@return  Returns true if isNotEndOfFetchFrto() is "N"
	 */
   public boolean isNotEndOfFetchFrto() throws CFException {
      return (  compareChars( getFetchEndFrto() , notEndOfFetchFrto88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotEndOfFetchFrtoTrue() {  			
    	setFetchEndFrto( notEndOfFetchFrto88Value);
   	}
	/**
	 *	Returns the value of fetchEndPtyp
	 *	@return fetchEndPtyp
	 */
   public char[] getFetchEndPtyp() throws CFException{
   		return fetchEndPtyp;
   }

  
	/**
	*  set variable fetchEndPtyp
	*  Corresponding COBOL Variable is WS-FETCH-END-PTYP
	*  @param value
	**/
   public void setFetchEndPtyp(char[] value) {
       value = checkFetchEndPtypConstraints(value);
       arraycopy(value,0,fetchEndPtyp,0,value.length);
   } 
	public void setFetchEndPtyp(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fetchEndPtyp,0,beginIndex + endIndex);
   }
	char[] endOfFetchPtyp88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFetchPtyp()
	 *	@return  Returns true if isEndOfFetchPtyp() is "Y"
	 */
   public boolean isEndOfFetchPtyp() throws CFException {
      return (  compareChars( getFetchEndPtyp() , endOfFetchPtyp88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFetchPtypTrue() {  			
    	setFetchEndPtyp( endOfFetchPtyp88Value);
   	}
	char[] notEndOfFetchPtyp88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotEndOfFetchPtyp()
	 *	@return  Returns true if isNotEndOfFetchPtyp() is "N"
	 */
   public boolean isNotEndOfFetchPtyp() throws CFException {
      return (  compareChars( getFetchEndPtyp() , notEndOfFetchPtyp88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotEndOfFetchPtypTrue() {  			
    	setFetchEndPtyp( notEndOfFetchPtyp88Value);
   	}
	/**
	 *	Returns the value of fetchEndIcd
	 *	@return fetchEndIcd
	 */
   public char[] getFetchEndIcd() throws CFException{
   		return fetchEndIcd;
   }

  
	/**
	*  set variable fetchEndIcd
	*  Corresponding COBOL Variable is WS-FETCH-END-ICD
	*  @param value
	**/
   public void setFetchEndIcd(char[] value) {
       value = checkFetchEndIcdConstraints(value);
       arraycopy(value,0,fetchEndIcd,0,value.length);
   } 
	public void setFetchEndIcd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fetchEndIcd,0,beginIndex + endIndex);
   }
	char[] endOfFetchIcd88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFetchIcd()
	 *	@return  Returns true if isEndOfFetchIcd() is "Y"
	 */
   public boolean isEndOfFetchIcd() throws CFException {
      return (  compareChars( getFetchEndIcd() , endOfFetchIcd88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFetchIcdTrue() {  			
    	setFetchEndIcd( endOfFetchIcd88Value);
   	}
	char[] notEndOfFetchIcd88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotEndOfFetchIcd()
	 *	@return  Returns true if isNotEndOfFetchIcd() is "N"
	 */
   public boolean isNotEndOfFetchIcd() throws CFException {
      return (  compareChars( getFetchEndIcd() , notEndOfFetchIcd88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotEndOfFetchIcdTrue() {  			
    	setFetchEndIcd( notEndOfFetchIcd88Value);
   	}
	/**
	 *	Returns the value of fetchEndFcnd
	 *	@return fetchEndFcnd
	 */
   public char[] getFetchEndFcnd() throws CFException{
   		return fetchEndFcnd;
   }

  
	/**
	*  set variable fetchEndFcnd
	*  Corresponding COBOL Variable is WS-FETCH-END-FCND
	*  @param value
	**/
   public void setFetchEndFcnd(char[] value) {
       value = checkFetchEndFcndConstraints(value);
       arraycopy(value,0,fetchEndFcnd,0,value.length);
   } 
	public void setFetchEndFcnd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fetchEndFcnd,0,beginIndex + endIndex);
   }
	char[] endOfFetchFcnd88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFetchFcnd()
	 *	@return  Returns true if isEndOfFetchFcnd() is "Y"
	 */
   public boolean isEndOfFetchFcnd() throws CFException {
      return (  compareChars( getFetchEndFcnd() , endOfFetchFcnd88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFetchFcndTrue() {  			
    	setFetchEndFcnd( endOfFetchFcnd88Value);
   	}
	char[] notEndOfFetchFcnd88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotEndOfFetchFcnd()
	 *	@return  Returns true if isNotEndOfFetchFcnd() is "N"
	 */
   public boolean isNotEndOfFetchFcnd() throws CFException {
      return (  compareChars( getFetchEndFcnd() , notEndOfFetchFcnd88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotEndOfFetchFcndTrue() {  			
    	setFetchEndFcnd( notEndOfFetchFcnd88Value);
   	}
	/**
	 *	Returns the value of fetchEndComb
	 *	@return fetchEndComb
	 */
   public char[] getFetchEndComb() throws CFException{
   		return fetchEndComb;
   }

  
	/**
	*  set variable fetchEndComb
	*  Corresponding COBOL Variable is WS-FETCH-END-COMB
	*  @param value
	**/
   public void setFetchEndComb(char[] value) {
       value = checkFetchEndCombConstraints(value);
       arraycopy(value,0,fetchEndComb,0,value.length);
   } 
	public void setFetchEndComb(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fetchEndComb,0,beginIndex + endIndex);
   }
	char[] endOfFetchComb88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFetchComb()
	 *	@return  Returns true if isEndOfFetchComb() is "Y"
	 */
   public boolean isEndOfFetchComb() throws CFException {
      return (  compareChars( getFetchEndComb() , endOfFetchComb88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFetchCombTrue() {  			
    	setFetchEndComb( endOfFetchComb88Value);
   	}
	char[] notEndOfFetchComb88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotEndOfFetchComb()
	 *	@return  Returns true if isNotEndOfFetchComb() is "N"
	 */
   public boolean isNotEndOfFetchComb() throws CFException {
      return (  compareChars( getFetchEndComb() , notEndOfFetchComb88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotEndOfFetchCombTrue() {  			
    	setFetchEndComb( notEndOfFetchComb88Value);
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
	/**
	 *	Returns the value of dsnnrows
	 *	@return dsnnrows
	 */
	public int getDsnnrows() throws CFException {
   		return dsnnrows;
	}
	
	/**
	 * 	Update Dsnnrows with the passed value
	 *  Corresponding COBOL Variable is DSNNROWS
	 *	@param number
	 */
	public void setDsnnrows(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dsnnrows = checkDsnnrowsMaxLimit(number); 
	}


	public void setDsnnrows(long number) {
	    number = checkDsnnrowsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDsnnrows((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
