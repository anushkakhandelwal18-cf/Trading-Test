package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uNonArrayData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uNonArrayData extends D51uNonArrayDataSerialized { 
   

								private int d51uReturnCode;

								private int d51uInvReason;

								private int d51uErrTable;
				private D51uErrorTrace d51uErrorTrace = new D51uErrorTrace();

						private char[] d51uMoreRecordsInd = Field.fillLowValue(1);

						private char[] d51uMoreIcdRecords = Field.fillLowValue(1);

						private char[] d51uMoreIcdSwitch = Field.fillLowValue(1);

								private long d51uNbrOfEntries;
				private D51uReturnSw d51uReturnSw = new D51uReturnSw();
	
	/**
	* Constructor for D51uNonArrayData
	**/
    public D51uNonArrayData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uNonArrayData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uNonArrayData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			d51uErrorTrace.setParent(this,getStartOffset() + 6);
	       			d51uReturnSw.setParent(this,getStartOffset() + 38);
    } 

	/**
	 *	Returns the value of d51uReturnCode
	 *	@return d51uReturnCode
	 */
	public int getD51uReturnCode() throws CFException {
       if (isD51uReturnCodeModified()) { 
           d51uReturnCode = refreshD51uReturnCode();
        }
   		return d51uReturnCode;
	}
	

	
	   
	/**
	 * 	Update D51uReturnCode with the passed value
	 *  Corresponding COBOL Variable is D51U-RETURN-CODE
	 *	@param number
	 */
	public void setD51uReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    d51uReturnCode = checkD51uReturnCodeMaxLimit(number); 
		serializeD51uReturnCode(d51uReturnCode);
	}
	

	public void setD51uReturnCode(long number) {
	    number = checkD51uReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uReturnCode((int)number);
	}
	
	/**
	 * 	Update D51uReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51uReturnCode(char[] value) throws CFException {
		 d51uReturnCode = serializeD51uReturnCode(value);
	}
	/**
	 * 	Update D51uReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setD51uReturnCodeString(char[] value) throws CFException {
		 setD51uReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isD51uGoodReturn()
	 *	@return  Returns true if isD51uGoodReturn() is 0
	 */
   public boolean isD51uGoodReturn() throws CFException {
      return (  getD51uReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setD51uGoodReturnTrue() {  			
    	setD51uReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 for isD51uNotFound()
	 *	@return  Returns true if isD51uNotFound() is 1
	 */
   public boolean isD51uNotFound() throws CFException {
      return (  getD51uReturnCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setD51uNotFoundTrue() {  			
    	setD51uReturnCode( 1);
   	}
	
	/**
	 *	Test condition 2 for isD51uDb2Error()
	 *	@return  Returns true if isD51uDb2Error() is 2
	 */
   public boolean isD51uDb2Error() throws CFException {
      return (  getD51uReturnCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setD51uDb2ErrorTrue() {  			
    	setD51uReturnCode( 2);
   	}
	/**
	 *	Returns the value of d51uInvReason
	 *	@return d51uInvReason
	 */
	public int getD51uInvReason() throws CFException {
       if (isD51uInvReasonModified()) { 
           d51uInvReason = refreshD51uInvReason();
        }
   		return d51uInvReason;
	}
	

	
	   
	/**
	 * 	Update D51uInvReason with the passed value
	 *  Corresponding COBOL Variable is D51U-INV-REASON
	 *	@param number
	 */
	public void setD51uInvReason(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    d51uInvReason = checkD51uInvReasonMaxLimit(number); 
		serializeD51uInvReason(d51uInvReason);
	}
	

	public void setD51uInvReason(long number) {
	    number = checkD51uInvReasonMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uInvReason((int)number);
	}
	
	/**
	 * 	Update D51uInvReason with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51uInvReason(char[] value) throws CFException {
		 d51uInvReason = serializeD51uInvReason(value);
	}
	/**
	 * 	Update D51uInvReason with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setD51uInvReasonString(char[] value) throws CFException {
		 setD51uInvReason(value);
	}
	
	/**
	 *	Test condition 0 for isNoError()
	 *	@return  Returns true if isNoError() is 0
	 */
   public boolean isNoError() throws CFException {
      return (  getD51uInvReason()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setNoErrorTrue() {  			
    	setD51uInvReason( 0);
   	}
	
	/**
	 *	Test condition 1 for isD51uInvFuncCd()
	 *	@return  Returns true if isD51uInvFuncCd() is 1
	 */
   public boolean isD51uInvFuncCd() throws CFException {
      return (  getD51uInvReason()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setD51uInvFuncCdTrue() {  			
    	setD51uInvReason( 1);
   	}
	
	/**
	 *	Test condition 2 for isD51uInvCallingPgm()
	 *	@return  Returns true if isD51uInvCallingPgm() is 2
	 */
   public boolean isD51uInvCallingPgm() throws CFException {
      return (  getD51uInvReason()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setD51uInvCallingPgmTrue() {  			
    	setD51uInvReason( 2);
   	}
	
	/**
	 *	Test condition 3 for isD51uInvReqType()
	 *	@return  Returns true if isD51uInvReqType() is 3
	 */
   public boolean isD51uInvReqType() throws CFException {
      return (  getD51uInvReason()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setD51uInvReqTypeTrue() {  			
    	setD51uInvReason( 3);
   	}
	
	/**
	 *	Test condition 40 for isD51uGeneralDb2Error()
	 *	@return  Returns true if isD51uGeneralDb2Error() is 40
	 */
   public boolean isD51uGeneralDb2Error() throws CFException {
      return (  getD51uInvReason()  ==  40  );
   }


	/**
	*  set values 40
	*/
   	public void setD51uGeneralDb2ErrorTrue() {  			
    	setD51uInvReason( 40);
   	}
	
	/**
	 *	Test condition 41 for isD51uDb2SelectError()
	 *	@return  Returns true if isD51uDb2SelectError() is 41
	 */
   public boolean isD51uDb2SelectError() throws CFException {
      return (  getD51uInvReason()  ==  41  );
   }


	/**
	*  set values 41
	*/
   	public void setD51uDb2SelectErrorTrue() {  			
    	setD51uInvReason( 41);
   	}
	
	/**
	 *	Test condition 42 for isD51uDb2OpenError()
	 *	@return  Returns true if isD51uDb2OpenError() is 42
	 */
   public boolean isD51uDb2OpenError() throws CFException {
      return (  getD51uInvReason()  ==  42  );
   }


	/**
	*  set values 42
	*/
   	public void setD51uDb2OpenErrorTrue() {  			
    	setD51uInvReason( 42);
   	}
	
	/**
	 *	Test condition 43 for isD51uDb2CloseError()
	 *	@return  Returns true if isD51uDb2CloseError() is 43
	 */
   public boolean isD51uDb2CloseError() throws CFException {
      return (  getD51uInvReason()  ==  43  );
   }


	/**
	*  set values 43
	*/
   	public void setD51uDb2CloseErrorTrue() {  			
    	setD51uInvReason( 43);
   	}
	
	/**
	 *	Test condition 44 for isD51uDb2FetchError()
	 *	@return  Returns true if isD51uDb2FetchError() is 44
	 */
   public boolean isD51uDb2FetchError() throws CFException {
      return (  getD51uInvReason()  ==  44  );
   }


	/**
	*  set values 44
	*/
   	public void setD51uDb2FetchErrorTrue() {  			
    	setD51uInvReason( 44);
   	}
	
	/**
	 *	Test condition 45 for isD51uDb2DeadlockErr()
	 *	@return  Returns true if isD51uDb2DeadlockErr() is 45
	 */
   public boolean isD51uDb2DeadlockErr() throws CFException {
      return (  getD51uInvReason()  ==  45  );
   }


	/**
	*  set values 45
	*/
   	public void setD51uDb2DeadlockErrTrue() {  			
    	setD51uInvReason( 45);
   	}
	/**
	 *	Returns the value of d51uErrTable
	 *	@return d51uErrTable
	 */
	public int getD51uErrTable() throws CFException {
       if (isD51uErrTableModified()) { 
           d51uErrTable = refreshD51uErrTable();
        }
   		return d51uErrTable;
	}
	

	
	   
	/**
	 * 	Update D51uErrTable with the passed value
	 *  Corresponding COBOL Variable is D51U-ERR-TABLE
	 *	@param number
	 */
	public void setD51uErrTable(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    d51uErrTable = checkD51uErrTableMaxLimit(number); 
		serializeD51uErrTable(d51uErrTable);
	}
	

	public void setD51uErrTable(long number) {
	    number = checkD51uErrTableMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uErrTable((int)number);
	}
	
	/**
	 * 	Update D51uErrTable with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51uErrTable(char[] value) throws CFException {
		 d51uErrTable = serializeD51uErrTable(value);
	}
	/**
	 * 	Update D51uErrTable with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setD51uErrTableString(char[] value) throws CFException {
		 setD51uErrTable(value);
	}
	
	/**
	 *	Test condition 1 for isErrD51uTable()
	 *	@return  Returns true if isErrD51uTable() is 1
	 */
   public boolean isErrD51uTable() throws CFException {
      return (  getD51uErrTable()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setErrD51uTableTrue() {  			
    	setD51uErrTable( 1);
   	}
	/**
	 *	Returns the value of d51uErrorTrace
	 *	@return d51uErrorTrace
	 */   
	 public D51uErrorTrace getD51uErrorTrace() {
   	return d51uErrorTrace;
   }
   /**
	* 	Update D51uErrorTrace with the passed value
	*   Corresponding COBOL Variable is D51U-ERROR-TRACE
	*	@param value
	*/
   public void setD51uErrorTrace(char[] value) {
      d51uErrorTrace.setString(value); 
   }   
    
     /**
	 * 	Update D51uErrorTrace 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uErrorTrace(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uErrorTrace.begin,d51uErrorTrace.length());
   }
   
     /**
	 * 	Update D51uErrorTrace 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uErrorTrace(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uErrorTrace.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uErrorTrace with another Field
	 *	@param value
	 */
   public void setD51uErrorTrace(Field source) {
   	replace(source,0,source.length(),d51uErrorTrace.begin,d51uErrorTrace.length());
   }  
   
     /**
	 * 	Update D51uErrorTrace 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uErrorTrace(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uErrorTrace.begin,d51uErrorTrace.length());
   }
   
     /**
	 * 	Update D51uErrorTrace 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uErrorTrace(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uErrorTrace.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uMoreRecordsInd
	 *	@return d51uMoreRecordsInd
	 */
   public char[] getD51uMoreRecordsInd() throws CFException{
     if (isD51uMoreRecordsIndModified()) { 
        d51uMoreRecordsInd = refreshD51uMoreRecordsInd();
     }
   		return d51uMoreRecordsInd;
   }

  
	/**
	*  set variable d51uMoreRecordsInd
	*  Corresponding COBOL Variable is D51U-MORE-RECORDS-IND
	*  @param value
	**/
   public void setD51uMoreRecordsInd(char[] value) {
      d51uMoreRecordsInd = checkD51uMoreRecordsIndConstraints(value);
      serializeD51uMoreRecordsInd(d51uMoreRecordsInd);
   } 

     /**
	 * 	Update D51uMoreRecordsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uMoreRecordsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uMoreRecordsInd,d51uMoreRecordsInd.length);
   	
   }
   
   public void setD51uMoreRecordsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uMoreRecordsInd,d51uMoreRecordsInd.length);
   	
   }
   
     /**
	 * 	Update D51uMoreRecordsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uMoreRecordsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uMoreRecordsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uMoreRecordsInd with another Field
	 *	@param value
	 */
   public void setD51uMoreRecordsInd(Field source) {
       replace(source,0,source.length(),beginD51uMoreRecordsInd,D_51U_MORE_RECORDS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update D51uMoreRecordsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uMoreRecordsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uMoreRecordsInd,D_51U_MORE_RECORDS_IND_LEN);
   	
   }
   
     /**
	 * 	Update D51uMoreRecordsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uMoreRecordsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uMoreRecordsInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uMoreIcdRecords
	 *	@return d51uMoreIcdRecords
	 */
   public char[] getD51uMoreIcdRecords() throws CFException{
     if (isD51uMoreIcdRecordsModified()) { 
        d51uMoreIcdRecords = refreshD51uMoreIcdRecords();
     }
   		return d51uMoreIcdRecords;
   }

  
	/**
	*  set variable d51uMoreIcdRecords
	*  Corresponding COBOL Variable is D51U-MORE-ICD-RECORDS
	*  @param value
	**/
   public void setD51uMoreIcdRecords(char[] value) {
      d51uMoreIcdRecords = checkD51uMoreIcdRecordsConstraints(value);
      serializeD51uMoreIcdRecords(d51uMoreIcdRecords);
   } 

     /**
	 * 	Update D51uMoreIcdRecords 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uMoreIcdRecords(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uMoreIcdRecords,d51uMoreIcdRecords.length);
   	
   }
   
   public void setD51uMoreIcdRecords(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uMoreIcdRecords,d51uMoreIcdRecords.length);
   	
   }
   
     /**
	 * 	Update D51uMoreIcdRecords 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uMoreIcdRecords(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uMoreIcdRecords+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uMoreIcdRecords with another Field
	 *	@param value
	 */
   public void setD51uMoreIcdRecords(Field source) {
       replace(source,0,source.length(),beginD51uMoreIcdRecords,D_51U_MORE_ICD_RECORDS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uMoreIcdRecords 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uMoreIcdRecords(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uMoreIcdRecords,D_51U_MORE_ICD_RECORDS_LEN);
   	
   }
   
     /**
	 * 	Update D51uMoreIcdRecords 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uMoreIcdRecords(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uMoreIcdRecords+targetIndex,targetLen);
    
   }
	char[] moreIcdRecords88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isMoreIcdRecords()
	 *	@return  Returns true if isMoreIcdRecords() is "Y"
	 */
   public boolean isMoreIcdRecords() throws CFException {
      return (  compareChars( getD51uMoreIcdRecords() , moreIcdRecords88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setMoreIcdRecordsTrue() {  			
    	setD51uMoreIcdRecords( moreIcdRecords88Value);
   	}
	char[] noMoreIcdRecords88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNoMoreIcdRecords()
	 *	@return  Returns true if isNoMoreIcdRecords() is "N"
	 */
   public boolean isNoMoreIcdRecords() throws CFException {
      return (  compareChars( getD51uMoreIcdRecords() , noMoreIcdRecords88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNoMoreIcdRecordsTrue() {  			
    	setD51uMoreIcdRecords( noMoreIcdRecords88Value);
   	}
	/**
	 *	Returns the value of d51uMoreIcdSwitch
	 *	@return d51uMoreIcdSwitch
	 */
   public char[] getD51uMoreIcdSwitch() throws CFException{
     if (isD51uMoreIcdSwitchModified()) { 
        d51uMoreIcdSwitch = refreshD51uMoreIcdSwitch();
     }
   		return d51uMoreIcdSwitch;
   }

  
	/**
	*  set variable d51uMoreIcdSwitch
	*  Corresponding COBOL Variable is D51U-MORE-ICD-SWITCH
	*  @param value
	**/
   public void setD51uMoreIcdSwitch(char[] value) {
      d51uMoreIcdSwitch = checkD51uMoreIcdSwitchConstraints(value);
      serializeD51uMoreIcdSwitch(d51uMoreIcdSwitch);
   } 

     /**
	 * 	Update D51uMoreIcdSwitch 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uMoreIcdSwitch(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uMoreIcdSwitch,d51uMoreIcdSwitch.length);
   	
   }
   
   public void setD51uMoreIcdSwitch(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uMoreIcdSwitch,d51uMoreIcdSwitch.length);
   	
   }
   
     /**
	 * 	Update D51uMoreIcdSwitch 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uMoreIcdSwitch(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uMoreIcdSwitch+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uMoreIcdSwitch with another Field
	 *	@param value
	 */
   public void setD51uMoreIcdSwitch(Field source) {
       replace(source,0,source.length(),beginD51uMoreIcdSwitch,D_51U_MORE_ICD_SWITCH_LEN);
   	
   }  
   
     /**
	 * 	Update D51uMoreIcdSwitch 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uMoreIcdSwitch(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uMoreIcdSwitch,D_51U_MORE_ICD_SWITCH_LEN);
   	
   }
   
     /**
	 * 	Update D51uMoreIcdSwitch 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uMoreIcdSwitch(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uMoreIcdSwitch+targetIndex,targetLen);
    
   }
	char[] firstTimeMoreIcd88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFirstTimeMoreIcd()
	 *	@return  Returns true if isFirstTimeMoreIcd() is "Y"
	 */
   public boolean isFirstTimeMoreIcd() throws CFException {
      return (  compareChars( getD51uMoreIcdSwitch() , firstTimeMoreIcd88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFirstTimeMoreIcdTrue() {  			
    	setD51uMoreIcdSwitch( firstTimeMoreIcd88Value);
   	}
	char[] notFirstTimeMoreIcd88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotFirstTimeMoreIcd()
	 *	@return  Returns true if isNotFirstTimeMoreIcd() is "N"
	 */
   public boolean isNotFirstTimeMoreIcd() throws CFException {
      return (  compareChars( getD51uMoreIcdSwitch() , notFirstTimeMoreIcd88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotFirstTimeMoreIcdTrue() {  			
    	setD51uMoreIcdSwitch( notFirstTimeMoreIcd88Value);
   	}
	/**
	 *	Returns the value of d51uNbrOfEntries
	 *	@return d51uNbrOfEntries
	 */
	public long getD51uNbrOfEntries() throws CFException {
       if (isD51uNbrOfEntriesModified()) { 
           d51uNbrOfEntries = refreshD51uNbrOfEntries();
        }
   		return d51uNbrOfEntries;
	}
	

	
	   
	/**
	 * 	Update D51uNbrOfEntries with the passed value
	 *  Corresponding COBOL Variable is D51U-NBR-OF-ENTRIES
	 *	@param number
	 */
	public void setD51uNbrOfEntries(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    d51uNbrOfEntries = checkD51uNbrOfEntriesMaxLimit(number); 
		serializeD51uNbrOfEntries(d51uNbrOfEntries);
	}
	

	/**
	 * 	Update D51uNbrOfEntries with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51uNbrOfEntries(char[] value) throws CFException {
		 d51uNbrOfEntries = serializeD51uNbrOfEntries(value);
	}
	/**
	 * 	Update D51uNbrOfEntries with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setD51uNbrOfEntriesString(char[] value) throws CFException {
		 setD51uNbrOfEntries(value);
	}
	/**
	 *	Returns the value of d51uReturnSw
	 *	@return d51uReturnSw
	 */   
	 public D51uReturnSw getD51uReturnSw() {
   	return d51uReturnSw;
   }
   /**
	* 	Update D51uReturnSw with the passed value
	*   Corresponding COBOL Variable is D51U-RETURN-SW
	*	@param value
	*/
   public void setD51uReturnSw(char[] value) {
      d51uReturnSw.setString(value); 
   }   
    
     /**
	 * 	Update D51uReturnSw 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uReturnSw(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uReturnSw.begin,d51uReturnSw.length());
   }
   
     /**
	 * 	Update D51uReturnSw 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uReturnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uReturnSw.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uReturnSw with another Field
	 *	@param value
	 */
   public void setD51uReturnSw(Field source) {
   	replace(source,0,source.length(),d51uReturnSw.begin,d51uReturnSw.length());
   }  
   
     /**
	 * 	Update D51uReturnSw 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uReturnSw(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uReturnSw.begin,d51uReturnSw.length());
   }
   
     /**
	 * 	Update D51uReturnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uReturnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uReturnSw.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getD51uNonArrayDataFieldLength() {
			return D_51U_NON_ARRAY_DATA_LENGTH;
		}

}
  
