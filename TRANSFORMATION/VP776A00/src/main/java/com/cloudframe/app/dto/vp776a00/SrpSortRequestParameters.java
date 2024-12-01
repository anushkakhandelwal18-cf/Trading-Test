package com.cloudframe.app.dto.vp776a00;

/**
*  The class SrpSortRequestParameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.vp776a00.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SrpSortRequestParameters extends SrpSortRequestParametersSerialized { 
   

						private char[] srpReturnCode = Field.fillLowValue(2);

								private int srpEntryCount;

								private int srpEntryLength;

								private int srpKeyStart;

								private int srpKeyLength;

						private char[] srpSequence = Field.fillLowValue(1);
	
	/**
	* Constructor for SrpSortRequestParameters
	**/
    public SrpSortRequestParameters() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of srpReturnCode
	 *	@return srpReturnCode
	 */
   public char[] getSrpReturnCode() throws CFException{
     if (isSrpReturnCodeModified()) { 
        srpReturnCode = refreshSrpReturnCode();
     }
   		return srpReturnCode;
   }

  
	/**
	*  set variable srpReturnCode
	*  Corresponding COBOL Variable is SRP-RETURN-CODE
	*  @param value
	**/
   public void setSrpReturnCode(char[] value) {
      srpReturnCode = checkSrpReturnCodeConstraints(value);
      serializeSrpReturnCode(srpReturnCode);
   } 

     /**
	 * 	Update SrpReturnCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrpReturnCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSrpReturnCode,srpReturnCode.length);
   	
   }
   
   public void setSrpReturnCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSrpReturnCode,srpReturnCode.length);
   	
   }
   
     /**
	 * 	Update SrpReturnCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrpReturnCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrpReturnCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SrpReturnCode with another Field
	 *	@param value
	 */
   public void setSrpReturnCode(Field source) {
       replace(source,0,source.length(),beginSrpReturnCode,SRP_RETURN_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update SrpReturnCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrpReturnCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSrpReturnCode,SRP_RETURN_CODE_LEN);
   	
   }
   
     /**
	 * 	Update SrpReturnCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrpReturnCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrpReturnCode+targetIndex,targetLen);
    
   }
	char[] srpGoodReturn88Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSrpGoodReturn()
	 *	@return  Returns true if isSrpGoodReturn() is "00"
	 */
   public boolean isSrpGoodReturn() throws CFException {
      return (  compareChars( getSrpReturnCode() , srpGoodReturn88Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSrpGoodReturnTrue() {  			
    	setSrpReturnCode( srpGoodReturn88Value);
   	}
	char[] srpAddressMissing88Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isSrpAddressMissing()
	 *	@return  Returns true if isSrpAddressMissing() is "01"
	 */
   public boolean isSrpAddressMissing() throws CFException {
      return (  compareChars( getSrpReturnCode() , srpAddressMissing88Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setSrpAddressMissingTrue() {  			
    	setSrpReturnCode( srpAddressMissing88Value);
   	}
	char[] srpCountError88Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isSrpCountError()
	 *	@return  Returns true if isSrpCountError() is "02"
	 */
   public boolean isSrpCountError() throws CFException {
      return (  compareChars( getSrpReturnCode() , srpCountError88Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setSrpCountErrorTrue() {  			
    	setSrpReturnCode( srpCountError88Value);
   	}
	char[] srpEntryLengthError88Value = "03".toCharArray();
	/**
	 *	Test condition "03" for isSrpEntryLengthError()
	 *	@return  Returns true if isSrpEntryLengthError() is "03"
	 */
   public boolean isSrpEntryLengthError() throws CFException {
      return (  compareChars( getSrpReturnCode() , srpEntryLengthError88Value)  == 0  );
   }


	/**
	*  set values "03"
	*/
   	public void setSrpEntryLengthErrorTrue() {  			
    	setSrpReturnCode( srpEntryLengthError88Value);
   	}
	char[] srpKeyStartError88Value = "04".toCharArray();
	/**
	 *	Test condition "04" for isSrpKeyStartError()
	 *	@return  Returns true if isSrpKeyStartError() is "04"
	 */
   public boolean isSrpKeyStartError() throws CFException {
      return (  compareChars( getSrpReturnCode() , srpKeyStartError88Value)  == 0  );
   }


	/**
	*  set values "04"
	*/
   	public void setSrpKeyStartErrorTrue() {  			
    	setSrpReturnCode( srpKeyStartError88Value);
   	}
	char[] srpKeyLengthError88Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSrpKeyLengthError()
	 *	@return  Returns true if isSrpKeyLengthError() is "05"
	 */
   public boolean isSrpKeyLengthError() throws CFException {
      return (  compareChars( getSrpReturnCode() , srpKeyLengthError88Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSrpKeyLengthErrorTrue() {  			
    	setSrpReturnCode( srpKeyLengthError88Value);
   	}
	char[] srpSequenceError88Value = "06".toCharArray();
	/**
	 *	Test condition "06" for isSrpSequenceError()
	 *	@return  Returns true if isSrpSequenceError() is "06"
	 */
   public boolean isSrpSequenceError() throws CFException {
      return (  compareChars( getSrpReturnCode() , srpSequenceError88Value)  == 0  );
   }


	/**
	*  set values "06"
	*/
   	public void setSrpSequenceErrorTrue() {  			
    	setSrpReturnCode( srpSequenceError88Value);
   	}
	public int getSrpEntryCount() throws CFException {
        if (isSrpEntryCountModified()) { 
           srpEntryCount = refreshSrpEntryCount();
        }
   		return srpEntryCount;
	}
	
	/**
	 * 	Update SrpEntryCount with the passed value
	 *  Corresponding COBOL Variable is SRP-ENTRY-COUNT
	 *	@param number
	 */
	public void setSrpEntryCount(int number) {
			srpEntryCount = checkSrpEntryCountMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSrpEntryCount(srpEntryCount);
	}


	public void setSrpEntryCount(long number) {
	    number = checkSrpEntryCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSrpEntryCount((int)number);
	}
	
	public int getSrpEntryLength() throws CFException {
        if (isSrpEntryLengthModified()) { 
           srpEntryLength = refreshSrpEntryLength();
        }
   		return srpEntryLength;
	}
	
	/**
	 * 	Update SrpEntryLength with the passed value
	 *  Corresponding COBOL Variable is SRP-ENTRY-LENGTH
	 *	@param number
	 */
	public void setSrpEntryLength(int number) {
			srpEntryLength = checkSrpEntryLengthMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSrpEntryLength(srpEntryLength);
	}


	public void setSrpEntryLength(long number) {
	    number = checkSrpEntryLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSrpEntryLength((int)number);
	}
	
	public int getSrpKeyStart() throws CFException {
        if (isSrpKeyStartModified()) { 
           srpKeyStart = refreshSrpKeyStart();
        }
   		return srpKeyStart;
	}
	
	/**
	 * 	Update SrpKeyStart with the passed value
	 *  Corresponding COBOL Variable is SRP-KEY-START
	 *	@param number
	 */
	public void setSrpKeyStart(int number) {
			srpKeyStart = checkSrpKeyStartMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSrpKeyStart(srpKeyStart);
	}


	public void setSrpKeyStart(long number) {
	    number = checkSrpKeyStartMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSrpKeyStart((int)number);
	}
	
	public int getSrpKeyLength() throws CFException {
        if (isSrpKeyLengthModified()) { 
           srpKeyLength = refreshSrpKeyLength();
        }
   		return srpKeyLength;
	}
	
	/**
	 * 	Update SrpKeyLength with the passed value
	 *  Corresponding COBOL Variable is SRP-KEY-LENGTH
	 *	@param number
	 */
	public void setSrpKeyLength(int number) {
			srpKeyLength = checkSrpKeyLengthMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSrpKeyLength(srpKeyLength);
	}


	public void setSrpKeyLength(long number) {
	    number = checkSrpKeyLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSrpKeyLength((int)number);
	}
	
	/**
	 *	Returns the value of srpSequence
	 *	@return srpSequence
	 */
   public char[] getSrpSequence() throws CFException{
     if (isSrpSequenceModified()) { 
        srpSequence = refreshSrpSequence();
     }
   		return srpSequence;
   }

  
	/**
	*  set variable srpSequence
	*  Corresponding COBOL Variable is SRP-SEQUENCE
	*  @param value
	**/
   public void setSrpSequence(char[] value) {
      srpSequence = checkSrpSequenceConstraints(value);
      serializeSrpSequence(srpSequence);
   } 

     /**
	 * 	Update SrpSequence 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrpSequence(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSrpSequence,srpSequence.length);
   	
   }
   
   public void setSrpSequence(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSrpSequence,srpSequence.length);
   	
   }
   
     /**
	 * 	Update SrpSequence 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrpSequence(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrpSequence+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SrpSequence with another Field
	 *	@param value
	 */
   public void setSrpSequence(Field source) {
       replace(source,0,source.length(),beginSrpSequence,SRP_SEQUENCE_LEN);
   	
   }  
   
     /**
	 * 	Update SrpSequence 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrpSequence(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSrpSequence,SRP_SEQUENCE_LEN);
   	
   }
   
     /**
	 * 	Update SrpSequence 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrpSequence(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrpSequence+targetIndex,targetLen);
    
   }
	char[] srpAscendingSort88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isSrpAscendingSort()
	 *	@return  Returns true if isSrpAscendingSort() is "A"
	 */
   public boolean isSrpAscendingSort() throws CFException {
      return (  compareChars( getSrpSequence() , srpAscendingSort88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setSrpAscendingSortTrue() {  			
    	setSrpSequence( srpAscendingSort88Value);
   	}
	char[] srpDescendingSort88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isSrpDescendingSort()
	 *	@return  Returns true if isSrpDescendingSort() is "D"
	 */
   public boolean isSrpDescendingSort() throws CFException {
      return (  compareChars( getSrpSequence() , srpDescendingSort88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setSrpDescendingSortTrue() {  			
    	setSrpSequence( srpDescendingSort88Value);
   	}

	
	
	

		public static int getSrpSortRequestParametersFieldLength() {
			return SRP_SORT_REQUEST_PARAMETERS_LENGTH;
		}

}
  
