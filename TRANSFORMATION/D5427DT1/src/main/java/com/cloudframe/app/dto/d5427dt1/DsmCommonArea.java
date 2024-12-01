package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DsmCommonArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DsmCommonArea extends DsmCommonAreaSerialized { 
   

								private int dsmReturnCode;

						private char[] dsmEditErrorField = new char[30];

								private long dsmEditErrorOccurs;
				private DsmEditErrorValueTxt dsmEditErrorValueTxt = new DsmEditErrorValueTxt();

								private int dsmSqlErrorLevel;
	
	/**
	* Constructor for DsmCommonArea
	**/
    public DsmCommonArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DsmCommonArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmCommonArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			dsmEditErrorValueTxt.setParent(this,getStartOffset() + 40);
								setDsmReturnCode(0);
								setDsmEditErrorField(fillSpace(30));
								setDsmEditErrorOccurs(0L);
								setDsmSqlErrorLevel(0);
    } 

	/**
	 *	Returns the value of dsmReturnCode
	 *	@return dsmReturnCode
	 */
	public int getDsmReturnCode() throws CFException {
       if (isDsmReturnCodeModified()) { 
           dsmReturnCode = refreshDsmReturnCode();
        }
   		return dsmReturnCode;
	}
	

	
	   
	/**
	 * 	Update DsmReturnCode with the passed value
	 *  Corresponding COBOL Variable is DSM-RETURN-CODE
	 *	@param number
	 */
	public void setDsmReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dsmReturnCode = checkDsmReturnCodeMaxLimit(number); 
		serializeDsmReturnCode(dsmReturnCode);
	}
	

	public void setDsmReturnCode(long number) {
	    number = checkDsmReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDsmReturnCode((int)number);
	}
	
	/**
	 * 	Update DsmReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setDsmReturnCode(char[] value) throws CFException {
		 dsmReturnCode = serializeDsmReturnCode(value);
	}
	/**
	 * 	Update DsmReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDsmReturnCodeString(char[] value) throws CFException {
		 setDsmReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isDsmNoError()
	 *	@return  Returns true if isDsmNoError() is 0
	 */
   public boolean isDsmNoError() throws CFException {
      return (  getDsmReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setDsmNoErrorTrue() {  			
    	setDsmReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 for isDsmEditError()
	 *	@return  Returns true if isDsmEditError() is 1
	 */
   public boolean isDsmEditError() throws CFException {
      return (  getDsmReturnCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDsmEditErrorTrue() {  			
    	setDsmReturnCode( 1);
   	}
	
	/**
	 *	Test condition 100 for isDsmEntryNotFndInq()
	 *	@return  Returns true if isDsmEntryNotFndInq() is 100
	 */
   public boolean isDsmEntryNotFndInq() throws CFException {
      return (  getDsmReturnCode()  ==  100  );
   }


	/**
	*  set values 100
	*/
   	public void setDsmEntryNotFndInqTrue() {  			
    	setDsmReturnCode( 100);
   	}
	
	/**
	 *	Test condition 900 for isDsmEntryNotFndUpd()
	 *	@return  Returns true if isDsmEntryNotFndUpd() is 900
	 */
   public boolean isDsmEntryNotFndUpd() throws CFException {
      return (  getDsmReturnCode()  ==  900  );
   }


	/**
	*  set values 900
	*/
   	public void setDsmEntryNotFndUpdTrue() {  			
    	setDsmReturnCode( 900);
   	}
	
	/**
	 *	Test condition 998 for isDsmApplError()
	 *	@return  Returns true if isDsmApplError() is 998
	 */
   public boolean isDsmApplError() throws CFException {
      return (  getDsmReturnCode()  ==  998  );
   }


	/**
	*  set values 998
	*/
   	public void setDsmApplErrorTrue() {  			
    	setDsmReturnCode( 998);
   	}
	
	/**
	 *	Test condition 999 for isDsmDb2Error()
	 *	@return  Returns true if isDsmDb2Error() is 999
	 */
   public boolean isDsmDb2Error() throws CFException {
      return (  getDsmReturnCode()  ==  999  );
   }


	/**
	*  set values 999
	*/
   	public void setDsmDb2ErrorTrue() {  			
    	setDsmReturnCode( 999);
   	}
	/**
	 *	Returns the value of dsmEditErrorField
	 *	@return dsmEditErrorField
	 */
   public char[] getDsmEditErrorField() throws CFException{
     if (isDsmEditErrorFieldModified()) { 
        dsmEditErrorField = refreshDsmEditErrorField();
     }
   		return dsmEditErrorField;
   }

  
	/**
	*  set variable dsmEditErrorField
	*  Corresponding COBOL Variable is DSM-EDIT-ERROR-FIELD
	*  @param value
	**/
   public void setDsmEditErrorField(char[] value) {
      dsmEditErrorField = checkDsmEditErrorFieldConstraints(value);
      serializeDsmEditErrorField(dsmEditErrorField);
   } 

     /**
	 * 	Update DsmEditErrorField 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmEditErrorField(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmEditErrorField,dsmEditErrorField.length);
   	
   }
   
   public void setDsmEditErrorField(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmEditErrorField,dsmEditErrorField.length);
   	
   }
   
     /**
	 * 	Update DsmEditErrorField 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmEditErrorField(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmEditErrorField+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmEditErrorField with another Field
	 *	@param value
	 */
   public void setDsmEditErrorField(Field source) {
       replace(source,0,source.length(),beginDsmEditErrorField,DSM_EDIT_ERROR_FIELD_LEN);
   	
   }  
   
     /**
	 * 	Update DsmEditErrorField 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmEditErrorField(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmEditErrorField,DSM_EDIT_ERROR_FIELD_LEN);
   	
   }
   
     /**
	 * 	Update DsmEditErrorField 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmEditErrorField(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmEditErrorField+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dsmEditErrorOccurs
	 *	@return dsmEditErrorOccurs
	 */
	public long getDsmEditErrorOccurs() throws CFException {
       if (isDsmEditErrorOccursModified()) { 
           dsmEditErrorOccurs = refreshDsmEditErrorOccurs();
        }
   		return dsmEditErrorOccurs;
	}
	

	
	   
	/**
	 * 	Update DsmEditErrorOccurs with the passed value
	 *  Corresponding COBOL Variable is DSM-EDIT-ERROR-OCCURS
	 *	@param number
	 */
	public void setDsmEditErrorOccurs(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dsmEditErrorOccurs = checkDsmEditErrorOccursMaxLimit(number); 
		serializeDsmEditErrorOccurs(dsmEditErrorOccurs);
	}
	

	/**
	 * 	Update DsmEditErrorOccurs with the passed value
	 *	@param value (String or char[])
	 */
	public void setDsmEditErrorOccurs(char[] value) throws CFException {
		 dsmEditErrorOccurs = serializeDsmEditErrorOccurs(value);
	}
	/**
	 * 	Update DsmEditErrorOccurs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDsmEditErrorOccursString(char[] value) throws CFException {
		 setDsmEditErrorOccurs(value);
	}
	/**
	 *	Returns the value of dsmEditErrorValueTxt
	 *	@return dsmEditErrorValueTxt
	 */   
	 public DsmEditErrorValueTxt getDsmEditErrorValueTxt() {
   	return dsmEditErrorValueTxt;
   }
   /**
	* 	Update DsmEditErrorValueTxt with the passed value
	*   Corresponding COBOL Variable is DSM-EDIT-ERROR-VALUE-TXT
	*	@param value
	*/
   public void setDsmEditErrorValueTxt(char[] value) {
      dsmEditErrorValueTxt.setString(value); 
   }   
    
     /**
	 * 	Update DsmEditErrorValueTxt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDsmEditErrorValueTxt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dsmEditErrorValueTxt.begin,dsmEditErrorValueTxt.length());
   }
   
     /**
	 * 	Update DsmEditErrorValueTxt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmEditErrorValueTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dsmEditErrorValueTxt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DsmEditErrorValueTxt with another Field
	 *	@param value
	 */
   public void setDsmEditErrorValueTxt(Field source) {
   	replace(source,0,source.length(),dsmEditErrorValueTxt.begin,dsmEditErrorValueTxt.length());
   }  
   
     /**
	 * 	Update DsmEditErrorValueTxt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDsmEditErrorValueTxt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dsmEditErrorValueTxt.begin,dsmEditErrorValueTxt.length());
   }
   
     /**
	 * 	Update DsmEditErrorValueTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmEditErrorValueTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dsmEditErrorValueTxt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dsmSqlErrorLevel
	 *	@return dsmSqlErrorLevel
	 */
	public int getDsmSqlErrorLevel() throws CFException {
       if (isDsmSqlErrorLevelModified()) { 
           dsmSqlErrorLevel = refreshDsmSqlErrorLevel();
        }
   		return dsmSqlErrorLevel;
	}
	

	
	   
	/**
	 * 	Update DsmSqlErrorLevel with the passed value
	 *  Corresponding COBOL Variable is DSM-SQL-ERROR-LEVEL
	 *	@param number
	 */
	public void setDsmSqlErrorLevel(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dsmSqlErrorLevel = checkDsmSqlErrorLevelMaxLimit(number); 
		serializeDsmSqlErrorLevel(dsmSqlErrorLevel);
	}
	

	public void setDsmSqlErrorLevel(long number) {
	    number = checkDsmSqlErrorLevelMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDsmSqlErrorLevel((int)number);
	}
	
	/**
	 * 	Update DsmSqlErrorLevel with the passed value
	 *	@param value (String or char[])
	 */
	public void setDsmSqlErrorLevel(char[] value) throws CFException {
		 dsmSqlErrorLevel = serializeDsmSqlErrorLevel(value);
	}
	/**
	 * 	Update DsmSqlErrorLevel with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDsmSqlErrorLevelString(char[] value) throws CFException {
		 setDsmSqlErrorLevel(value);
	}
	
	/**
	 *	Test condition 70 90 for isDsmCriticalError()
	 *	@return  Returns true if isDsmCriticalError() is 70 90
	 */
   public boolean isDsmCriticalError() throws CFException {
      return (  getDsmSqlErrorLevel()  ==  70  ||  getDsmSqlErrorLevel()  ==  90  );
   }


	/**
	*  set values 70 90
	*/
   	public void setDsmCriticalErrorTrue() {  			
    	setDsmSqlErrorLevel( 70);
   	}
	
	/**
	 *	Test condition 90 for isDsmSystemError()
	 *	@return  Returns true if isDsmSystemError() is 90
	 */
   public boolean isDsmSystemError() throws CFException {
      return (  getDsmSqlErrorLevel()  ==  90  );
   }


	/**
	*  set values 90
	*/
   	public void setDsmSystemErrorTrue() {  			
    	setDsmSqlErrorLevel( 90);
   	}
	
	/**
	 *	Test condition 70 for isDsmPackageError()
	 *	@return  Returns true if isDsmPackageError() is 70
	 */
   public boolean isDsmPackageError() throws CFException {
      return (  getDsmSqlErrorLevel()  ==  70  );
   }


	/**
	*  set values 70
	*/
   	public void setDsmPackageErrorTrue() {  			
    	setDsmSqlErrorLevel( 70);
   	}
	
	/**
	 *	Test condition 50 for isDsmUserError()
	 *	@return  Returns true if isDsmUserError() is 50
	 */
   public boolean isDsmUserError() throws CFException {
      return (  getDsmSqlErrorLevel()  ==  50  );
   }


	/**
	*  set values 50
	*/
   	public void setDsmUserErrorTrue() {  			
    	setDsmSqlErrorLevel( 50);
   	}
	
	/**
	 *	Test condition 30 for isDsmProcessError()
	 *	@return  Returns true if isDsmProcessError() is 30
	 */
   public boolean isDsmProcessError() throws CFException {
      return (  getDsmSqlErrorLevel()  ==  30  );
   }


	/**
	*  set values 30
	*/
   	public void setDsmProcessErrorTrue() {  			
    	setDsmSqlErrorLevel( 30);
   	}
	
	/**
	 *	Test condition 20 for isDsmValueError()
	 *	@return  Returns true if isDsmValueError() is 20
	 */
   public boolean isDsmValueError() throws CFException {
      return (  getDsmSqlErrorLevel()  ==  20  );
   }


	/**
	*  set values 20
	*/
   	public void setDsmValueErrorTrue() {  			
    	setDsmSqlErrorLevel( 20);
   	}
	
	/**
	 *	Test condition 10 for isDsmDuplicateError()
	 *	@return  Returns true if isDsmDuplicateError() is 10
	 */
   public boolean isDsmDuplicateError() throws CFException {
      return (  getDsmSqlErrorLevel()  ==  10  );
   }


	/**
	*  set values 10
	*/
   	public void setDsmDuplicateErrorTrue() {  			
    	setDsmSqlErrorLevel( 10);
   	}
	
	/**
	 *	Test condition 2 for isDsmNotfoundError()
	 *	@return  Returns true if isDsmNotfoundError() is 2
	 */
   public boolean isDsmNotfoundError() throws CFException {
      return (  getDsmSqlErrorLevel()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setDsmNotfoundErrorTrue() {  			
    	setDsmSqlErrorLevel( 2);
   	}
	
	/**
	 *	Test condition 1 for isDsmUndefinedError()
	 *	@return  Returns true if isDsmUndefinedError() is 1
	 */
   public boolean isDsmUndefinedError() throws CFException {
      return (  getDsmSqlErrorLevel()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDsmUndefinedErrorTrue() {  			
    	setDsmSqlErrorLevel( 1);
   	}

	
	
	

		public static int getDsmCommonAreaFieldLength() {
			return DSM_COMMON_AREA_LENGTH;
		}

}
  
