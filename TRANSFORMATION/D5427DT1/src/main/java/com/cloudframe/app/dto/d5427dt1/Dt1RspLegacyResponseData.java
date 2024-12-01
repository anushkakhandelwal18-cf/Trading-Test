package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1RspLegacyResponseData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Dt1RspLegacyResponseData extends Dt1RspLegacyResponseDataSerialized { 
   

								private int dt1RspReturnCode;

								private int dt1RspExplanationCode;

								private int dt1RspRespCode;

								private long dt1RspSqlCode;

						private char[] dt1RspErrSection = Field.fillLowValue(8);
	
	/**
	* Constructor for Dt1RspLegacyResponseData
	**/
    public Dt1RspLegacyResponseData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1RspLegacyResponseData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1RspLegacyResponseData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dt1RspReturnCode
	 *	@return dt1RspReturnCode
	 */
	public int getDt1RspReturnCode() throws CFException {
       if (isDt1RspReturnCodeModified()) { 
           dt1RspReturnCode = refreshDt1RspReturnCode();
        }
   		return dt1RspReturnCode;
	}
	

	
	   
	/**
	 * 	Update Dt1RspReturnCode with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-RETURN-CODE
	 *	@param number
	 */
	public void setDt1RspReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspReturnCode = checkDt1RspReturnCodeMaxLimit(number); 
		serializeDt1RspReturnCode(dt1RspReturnCode);
	}
	

	public void setDt1RspReturnCode(long number) {
	    number = checkDt1RspReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1RspReturnCode((int)number);
	}
	
	/**
	 * 	Update Dt1RspReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspReturnCode(char[] value) throws CFException {
		 dt1RspReturnCode = serializeDt1RspReturnCode(value);
	}
	/**
	 * 	Update Dt1RspReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspReturnCodeString(char[] value) throws CFException {
		 setDt1RspReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isDt1RspOk()
	 *	@return  Returns true if isDt1RspOk() is 0
	 */
   public boolean isDt1RspOk() throws CFException {
      return (  getDt1RspReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setDt1RspOkTrue() {  			
    	setDt1RspReturnCode( 0);
   	}
	
	/**
	 *	Test condition 6 for isDt1RspFailedSeeExpCode()
	 *	@return  Returns true if isDt1RspFailedSeeExpCode() is 6
	 */
   public boolean isDt1RspFailedSeeExpCode() throws CFException {
      return (  getDt1RspReturnCode()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setDt1RspFailedSeeExpCodeTrue() {  			
    	setDt1RspReturnCode( 6);
   	}
	
	/**
	 *	Test condition 7 for isDt1RspDatabaseError()
	 *	@return  Returns true if isDt1RspDatabaseError() is 7
	 */
   public boolean isDt1RspDatabaseError() throws CFException {
      return (  getDt1RspReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setDt1RspDatabaseErrorTrue() {  			
    	setDt1RspReturnCode( 7);
   	}
	
	/**
	 *	Test condition 8 for isDt1RspNotAuthForView()
	 *	@return  Returns true if isDt1RspNotAuthForView() is 8
	 */
   public boolean isDt1RspNotAuthForView() throws CFException {
      return (  getDt1RspReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setDt1RspNotAuthForViewTrue() {  			
    	setDt1RspReturnCode( 8);
   	}
	
	/**
	 *	Test condition 99 for isDt1RspFail()
	 *	@return  Returns true if isDt1RspFail() is 99
	 */
   public boolean isDt1RspFail() throws CFException {
      return (  getDt1RspReturnCode()  ==  99  );
   }


	/**
	*  set values 99
	*/
   	public void setDt1RspFailTrue() {  			
    	setDt1RspReturnCode( 99);
   	}
	
	/**
	 *	Test condition 1 THRU 99 for isDt1RspNotOk()
	 *	@return  Returns true if isDt1RspNotOk() is 1 THRU 99
	 */
   public boolean isDt1RspNotOk() throws CFException {
      return (   (getDt1RspReturnCode()  >=  1 ) &&   (getDt1RspReturnCode()  <=  99 )   );
   }


	/**
	*  set values 1 THRU 99
	*/
   	public void setDt1RspNotOkTrue() {  			
    	setDt1RspReturnCode( 1);
   	}
	/**
	 *	Returns the value of dt1RspExplanationCode
	 *	@return dt1RspExplanationCode
	 */
	public int getDt1RspExplanationCode() throws CFException {
       if (isDt1RspExplanationCodeModified()) { 
           dt1RspExplanationCode = refreshDt1RspExplanationCode();
        }
   		return dt1RspExplanationCode;
	}
	

	
	   
	/**
	 * 	Update Dt1RspExplanationCode with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-EXPLANATION-CODE
	 *	@param number
	 */
	public void setDt1RspExplanationCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspExplanationCode = checkDt1RspExplanationCodeMaxLimit(number); 
		serializeDt1RspExplanationCode(dt1RspExplanationCode);
	}
	

	public void setDt1RspExplanationCode(long number) {
	    number = checkDt1RspExplanationCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1RspExplanationCode((int)number);
	}
	
	/**
	 * 	Update Dt1RspExplanationCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspExplanationCode(char[] value) throws CFException {
		 dt1RspExplanationCode = serializeDt1RspExplanationCode(value);
	}
	/**
	 * 	Update Dt1RspExplanationCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspExplanationCodeString(char[] value) throws CFException {
		 setDt1RspExplanationCode(value);
	}
	
	/**
	 *	Test condition 0 for isDt1RspExplOk()
	 *	@return  Returns true if isDt1RspExplOk() is 0
	 */
   public boolean isDt1RspExplOk() throws CFException {
      return (  getDt1RspExplanationCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setDt1RspExplOkTrue() {  			
    	setDt1RspExplanationCode( 0);
   	}
	
	/**
	 *	Test condition 2 for isDt1RspInvalidView()
	 *	@return  Returns true if isDt1RspInvalidView() is 2
	 */
   public boolean isDt1RspInvalidView() throws CFException {
      return (  getDt1RspExplanationCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setDt1RspInvalidViewTrue() {  			
    	setDt1RspExplanationCode( 2);
   	}
	
	/**
	 *	Test condition 5 for isDt1RspIOError()
	 *	@return  Returns true if isDt1RspIOError() is 5
	 */
   public boolean isDt1RspIOError() throws CFException {
      return (  getDt1RspExplanationCode()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setDt1RspIOErrorTrue() {  			
    	setDt1RspExplanationCode( 5);
   	}
	
	/**
	 *	Test condition 90 for isDt1RspFoundPgmError()
	 *	@return  Returns true if isDt1RspFoundPgmError() is 90
	 */
   public boolean isDt1RspFoundPgmError() throws CFException {
      return (  getDt1RspExplanationCode()  ==  90  );
   }


	/**
	*  set values 90
	*/
   	public void setDt1RspFoundPgmErrorTrue() {  			
    	setDt1RspExplanationCode( 90);
   	}
	
	/**
	 *	Test condition 997 for isDt1RspSeeParmsForMoreInf()
	 *	@return  Returns true if isDt1RspSeeParmsForMoreInf() is 997
	 */
   public boolean isDt1RspSeeParmsForMoreInf() throws CFException {
      return (  getDt1RspExplanationCode()  ==  997  );
   }


	/**
	*  set values 997
	*/
   	public void setDt1RspSeeParmsForMoreInfTrue() {  			
    	setDt1RspExplanationCode( 997);
   	}
	
	/**
	 *	Test condition 998 for isDt1RspSeeViewForMoreInfo()
	 *	@return  Returns true if isDt1RspSeeViewForMoreInfo() is 998
	 */
   public boolean isDt1RspSeeViewForMoreInfo() throws CFException {
      return (  getDt1RspExplanationCode()  ==  998  );
   }


	/**
	*  set values 998
	*/
   	public void setDt1RspSeeViewForMoreInfoTrue() {  			
    	setDt1RspExplanationCode( 998);
   	}
	/**
	 *	Returns the value of dt1RspRespCode
	 *	@return dt1RspRespCode
	 */
	public int getDt1RspRespCode() throws CFException {
       if (isDt1RspRespCodeModified()) { 
           dt1RspRespCode = refreshDt1RspRespCode();
        }
   		return dt1RspRespCode;
	}
	

	
	   
	/**
	 * 	Update Dt1RspRespCode with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-RESP-CODE
	 *	@param number
	 */
	public void setDt1RspRespCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspRespCode = checkDt1RspRespCodeMaxLimit(number); 
		serializeDt1RspRespCode(dt1RspRespCode);
	}
	

	public void setDt1RspRespCode(long number) {
	    number = checkDt1RspRespCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1RspRespCode((int)number);
	}
	
	/**
	 * 	Update Dt1RspRespCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspRespCode(char[] value) throws CFException {
		 dt1RspRespCode = serializeDt1RspRespCode(value);
	}
	/**
	 * 	Update Dt1RspRespCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspRespCodeString(char[] value) throws CFException {
		 setDt1RspRespCode(value);
	}
	
	/**
	 *	Test condition 0 for isDt1RspGoodReturn()
	 *	@return  Returns true if isDt1RspGoodReturn() is 0
	 */
   public boolean isDt1RspGoodReturn() throws CFException {
      return (  getDt1RspRespCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setDt1RspGoodReturnTrue() {  			
    	setDt1RspRespCode( 0);
   	}
	
	/**
	 *	Test condition 1 for isDt1RspInvalidRequest()
	 *	@return  Returns true if isDt1RspInvalidRequest() is 1
	 */
   public boolean isDt1RspInvalidRequest() throws CFException {
      return (  getDt1RspRespCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDt1RspInvalidRequestTrue() {  			
    	setDt1RspRespCode( 1);
   	}
	
	/**
	 *	Test condition 3 for isDt1RspNoClaimsFound()
	 *	@return  Returns true if isDt1RspNoClaimsFound() is 3
	 */
   public boolean isDt1RspNoClaimsFound() throws CFException {
      return (  getDt1RspRespCode()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setDt1RspNoClaimsFoundTrue() {  			
    	setDt1RspRespCode( 3);
   	}
	
	/**
	 *	Test condition 100 for isDt1RspEmployeeNotFound()
	 *	@return  Returns true if isDt1RspEmployeeNotFound() is 100
	 */
   public boolean isDt1RspEmployeeNotFound() throws CFException {
      return (  getDt1RspRespCode()  ==  100  );
   }


	/**
	*  set values 100
	*/
   	public void setDt1RspEmployeeNotFoundTrue() {  			
    	setDt1RspRespCode( 100);
   	}
	
	/**
	 *	Test condition 101 for isDt1RspPatientNotFound()
	 *	@return  Returns true if isDt1RspPatientNotFound() is 101
	 */
   public boolean isDt1RspPatientNotFound() throws CFException {
      return (  getDt1RspRespCode()  ==  101  );
   }


	/**
	*  set values 101
	*/
   	public void setDt1RspPatientNotFoundTrue() {  			
    	setDt1RspRespCode( 101);
   	}
	
	/**
	 *	Test condition 102 for isDt1RspIcnNotFound()
	 *	@return  Returns true if isDt1RspIcnNotFound() is 102
	 */
   public boolean isDt1RspIcnNotFound() throws CFException {
      return (  getDt1RspRespCode()  ==  102  );
   }


	/**
	*  set values 102
	*/
   	public void setDt1RspIcnNotFoundTrue() {  			
    	setDt1RspRespCode( 102);
   	}
	
	/**
	 *	Test condition 200 for isDt1RspInvalidIcn()
	 *	@return  Returns true if isDt1RspInvalidIcn() is 200
	 */
   public boolean isDt1RspInvalidIcn() throws CFException {
      return (  getDt1RspRespCode()  ==  200  );
   }


	/**
	*  set values 200
	*/
   	public void setDt1RspInvalidIcnTrue() {  			
    	setDt1RspRespCode( 200);
   	}
	
	/**
	 *	Test condition 201 for isDt1RspInvalidMbrInfo()
	 *	@return  Returns true if isDt1RspInvalidMbrInfo() is 201
	 */
   public boolean isDt1RspInvalidMbrInfo() throws CFException {
      return (  getDt1RspRespCode()  ==  201  );
   }


	/**
	*  set values 201
	*/
   	public void setDt1RspInvalidMbrInfoTrue() {  			
    	setDt1RspRespCode( 201);
   	}
	
	/**
	 *	Test condition 202 for isDt1RspInvalidOffice()
	 *	@return  Returns true if isDt1RspInvalidOffice() is 202
	 */
   public boolean isDt1RspInvalidOffice() throws CFException {
      return (  getDt1RspRespCode()  ==  202  );
   }


	/**
	*  set values 202
	*/
   	public void setDt1RspInvalidOfficeTrue() {  			
    	setDt1RspRespCode( 202);
   	}
	
	/**
	 *	Test condition 203 for isDt1RspInvalidDepNumber()
	 *	@return  Returns true if isDt1RspInvalidDepNumber() is 203
	 */
   public boolean isDt1RspInvalidDepNumber() throws CFException {
      return (  getDt1RspRespCode()  ==  203  );
   }


	/**
	*  set values 203
	*/
   	public void setDt1RspInvalidDepNumberTrue() {  			
    	setDt1RspRespCode( 203);
   	}
	
	/**
	 *	Test condition 205 for isDt1RspInvalidPolicy()
	 *	@return  Returns true if isDt1RspInvalidPolicy() is 205
	 */
   public boolean isDt1RspInvalidPolicy() throws CFException {
      return (  getDt1RspRespCode()  ==  205  );
   }


	/**
	*  set values 205
	*/
   	public void setDt1RspInvalidPolicyTrue() {  			
    	setDt1RspRespCode( 205);
   	}
	
	/**
	 *	Test condition 206 for isDt1RspInvalidEmployeeId()
	 *	@return  Returns true if isDt1RspInvalidEmployeeId() is 206
	 */
   public boolean isDt1RspInvalidEmployeeId() throws CFException {
      return (  getDt1RspRespCode()  ==  206  );
   }


	/**
	*  set values 206
	*/
   	public void setDt1RspInvalidEmployeeIdTrue() {  			
    	setDt1RspRespCode( 206);
   	}
	
	/**
	 *	Test condition 207 for isDt1RspInvalidRelationship()
	 *	@return  Returns true if isDt1RspInvalidRelationship() is 207
	 */
   public boolean isDt1RspInvalidRelationship() throws CFException {
      return (  getDt1RspRespCode()  ==  207  );
   }


	/**
	*  set values 207
	*/
   	public void setDt1RspInvalidRelationshipTrue() {  			
    	setDt1RspRespCode( 207);
   	}
	
	/**
	 *	Test condition 208 for isDt1RspInvalidName()
	 *	@return  Returns true if isDt1RspInvalidName() is 208
	 */
   public boolean isDt1RspInvalidName() throws CFException {
      return (  getDt1RspRespCode()  ==  208  );
   }


	/**
	*  set values 208
	*/
   	public void setDt1RspInvalidNameTrue() {  			
    	setDt1RspRespCode( 208);
   	}
	
	/**
	 *	Test condition 209 for isDt1RspInvalidTin()
	 *	@return  Returns true if isDt1RspInvalidTin() is 209
	 */
   public boolean isDt1RspInvalidTin() throws CFException {
      return (  getDt1RspRespCode()  ==  209  );
   }


	/**
	*  set values 209
	*/
   	public void setDt1RspInvalidTinTrue() {  			
    	setDt1RspRespCode( 209);
   	}
	
	/**
	 *	Test condition 210 for isDt1RspAuthNbrNotFound()
	 *	@return  Returns true if isDt1RspAuthNbrNotFound() is 210
	 */
   public boolean isDt1RspAuthNbrNotFound() throws CFException {
      return (  getDt1RspRespCode()  ==  210  );
   }


	/**
	*  set values 210
	*/
   	public void setDt1RspAuthNbrNotFoundTrue() {  			
    	setDt1RspRespCode( 210);
   	}
	
	/**
	 *	Test condition 211 for isDt1RspSearchCatReqd()
	 *	@return  Returns true if isDt1RspSearchCatReqd() is 211
	 */
   public boolean isDt1RspSearchCatReqd() throws CFException {
      return (  getDt1RspRespCode()  ==  211  );
   }


	/**
	*  set values 211
	*/
   	public void setDt1RspSearchCatReqdTrue() {  			
    	setDt1RspRespCode( 211);
   	}
	
	/**
	 *	Test condition 221 for isDt1RspInvalidBegDate()
	 *	@return  Returns true if isDt1RspInvalidBegDate() is 221
	 */
   public boolean isDt1RspInvalidBegDate() throws CFException {
      return (  getDt1RspRespCode()  ==  221  );
   }


	/**
	*  set values 221
	*/
   	public void setDt1RspInvalidBegDateTrue() {  			
    	setDt1RspRespCode( 221);
   	}
	
	/**
	 *	Test condition 222 for isDt1RspInvalidEndDate()
	 *	@return  Returns true if isDt1RspInvalidEndDate() is 222
	 */
   public boolean isDt1RspInvalidEndDate() throws CFException {
      return (  getDt1RspRespCode()  ==  222  );
   }


	/**
	*  set values 222
	*/
   	public void setDt1RspInvalidEndDateTrue() {  			
    	setDt1RspRespCode( 222);
   	}
	
	/**
	 *	Test condition 223 for isDt1RspMaxClaimsExceeded()
	 *	@return  Returns true if isDt1RspMaxClaimsExceeded() is 223
	 */
   public boolean isDt1RspMaxClaimsExceeded() throws CFException {
      return (  getDt1RspRespCode()  ==  223  );
   }


	/**
	*  set values 223
	*/
   	public void setDt1RspMaxClaimsExceededTrue() {  			
    	setDt1RspRespCode( 223);
   	}
	
	/**
	 *	Test condition 225 for isDt1RspMissingCatCode()
	 *	@return  Returns true if isDt1RspMissingCatCode() is 225
	 */
   public boolean isDt1RspMissingCatCode() throws CFException {
      return (  getDt1RspRespCode()  ==  225  );
   }


	/**
	*  set values 225
	*/
   	public void setDt1RspMissingCatCodeTrue() {  			
    	setDt1RspRespCode( 225);
   	}
	
	/**
	 *	Test condition 400 for isDt1RspInvalidVersionNbr()
	 *	@return  Returns true if isDt1RspInvalidVersionNbr() is 400
	 */
   public boolean isDt1RspInvalidVersionNbr() throws CFException {
      return (  getDt1RspRespCode()  ==  400  );
   }


	/**
	*  set values 400
	*/
   	public void setDt1RspInvalidVersionNbrTrue() {  			
    	setDt1RspRespCode( 400);
   	}
	
	/**
	 *	Test condition 401 for isDt1RspInvalidViewName()
	 *	@return  Returns true if isDt1RspInvalidViewName() is 401
	 */
   public boolean isDt1RspInvalidViewName() throws CFException {
      return (  getDt1RspRespCode()  ==  401  );
   }


	/**
	*  set values 401
	*/
   	public void setDt1RspInvalidViewNameTrue() {  			
    	setDt1RspRespCode( 401);
   	}
	/**
	 *	Returns the value of dt1RspSqlCode
	 *	@return dt1RspSqlCode
	 */
	public long getDt1RspSqlCode() throws CFException {
       if (isDt1RspSqlCodeModified()) { 
           dt1RspSqlCode = refreshDt1RspSqlCode();
        }
   		return dt1RspSqlCode;
	}
	

	
	   
	/**
	 * 	Update Dt1RspSqlCode with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-SQL-CODE
	 *	@param number
	 */
	public void setDt1RspSqlCode(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspSqlCode = checkDt1RspSqlCodeMaxLimit(number); 
		serializeDt1RspSqlCode(dt1RspSqlCode);
	}
	

	/**
	 * 	Update Dt1RspSqlCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspSqlCode(char[] value) throws CFException {
		 dt1RspSqlCode = serializeDt1RspSqlCode(value);
	}
	/**
	 * 	Update Dt1RspSqlCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspSqlCodeString(char[] value) throws CFException {
		 setDt1RspSqlCode(value);
	}
	/**
	 *	Returns the value of dt1RspErrSection
	 *	@return dt1RspErrSection
	 */
   public char[] getDt1RspErrSection() throws CFException{
     if (isDt1RspErrSectionModified()) { 
        dt1RspErrSection = refreshDt1RspErrSection();
     }
   		return dt1RspErrSection;
   }

  
	/**
	*  set variable dt1RspErrSection
	*  Corresponding COBOL Variable is DT1-RSP-ERR-SECTION
	*  @param value
	**/
   public void setDt1RspErrSection(char[] value) {
      dt1RspErrSection = checkDt1RspErrSectionConstraints(value);
      serializeDt1RspErrSection(dt1RspErrSection);
   } 

     /**
	 * 	Update Dt1RspErrSection 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspErrSection(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspErrSection,dt1RspErrSection.length);
   	
   }
   
   public void setDt1RspErrSection(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspErrSection,dt1RspErrSection.length);
   	
   }
   
     /**
	 * 	Update Dt1RspErrSection 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspErrSection(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspErrSection+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspErrSection with another Field
	 *	@param value
	 */
   public void setDt1RspErrSection(Field source) {
       replace(source,0,source.length(),beginDt1RspErrSection,DT_1_RSP_ERR_SECTION_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspErrSection 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspErrSection(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspErrSection,DT_1_RSP_ERR_SECTION_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspErrSection 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspErrSection(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspErrSection+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Dt1RspLegacyResponseData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1RspReturnCode(0);
                     setDt1RspExplanationCode(0);
                     setDt1RspRespCode(0);
                     setDt1RspSqlCode(0);
         setDt1RspErrSection(CONSTANTS.SPACE_8);
   }

		public static int getDt1RspLegacyResponseDataFieldLength() {
			return DT_1_RSP_LEGACY_RESPONSE_DATA_LENGTH;
		}

}
  
