package com.cloudframe.app.dto.o529351u;

/**
*  The class Ioi02bInterface is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ioi02bInterface extends Ioi02bInterfaceSerialized { 
   

								private int ioi02bPassedRecAddr;

								private int ioi02bPassedRecPtr;
				private Ioi02bCurRecAddrArea ioi02bCurRecAddrArea = new Ioi02bCurRecAddrArea();

						private char[] ioi02bError = Field.fillLowValue(1);
				private Ioi02bReserveArea ioi02bReserveArea = new Ioi02bReserveArea();
	
	/**
	* Constructor for Ioi02bInterface
	**/
    public Ioi02bInterface() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ioi02bCurRecAddrArea.setParent(this,getStartOffset() + 24);
	       			ioi02bReserveArea.setParent(this,getStartOffset() + 350);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ioi02bPassedRecAddr
	 *	@return ioi02bPassedRecAddr
	 */
	public int getIoi02bPassedRecAddr() throws CFException {
        if (isIoi02bPassedRecAddrModified()) { 
           ioi02bPassedRecAddr = refreshIoi02bPassedRecAddr();
        }
   		return ioi02bPassedRecAddr;
	}
	
	/**
	 * 	Update Ioi02bPassedRecAddr with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-PASSED-REC-ADDR
	 *	@param number
	 */
	public void setIoi02bPassedRecAddr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bPassedRecAddr = checkIoi02bPassedRecAddrMaxLimit(number); 
		serializeIoi02bPassedRecAddr(ioi02bPassedRecAddr);
	}


	public void setIoi02bPassedRecAddr(long number) {
	    number = checkIoi02bPassedRecAddrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bPassedRecAddr((int)number);
	}
	
	/**
	 *	Returns the value of ioi02bPassedRecPtr
	 *	@return ioi02bPassedRecPtr
	 */
	public int getIoi02bPassedRecPtr() throws CFException {
        if (isIoi02bPassedRecPtrModified()) { 
           ioi02bPassedRecPtr = refreshIoi02bPassedRecPtr();
        }
   		return ioi02bPassedRecPtr;
	}
	
	/**
	 * 	Update Ioi02bPassedRecPtr with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-PASSED-REC-PTR
	 *	@param number
	 */
	public void setIoi02bPassedRecPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bPassedRecPtr = checkIoi02bPassedRecPtrMaxLimit(number); 
		serializeIoi02bPassedRecPtr(ioi02bPassedRecPtr);
	}


	public void setIoi02bPassedRecPtr(long number) {
	    number = checkIoi02bPassedRecPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bPassedRecPtr((int)number);
	}
	
	/**
	 *	Returns the value of ioi02bCurRecAddrArea
	 *	@return ioi02bCurRecAddrArea
	 */   
	 public Ioi02bCurRecAddrArea getIoi02bCurRecAddrArea() {
   	return ioi02bCurRecAddrArea;
   }
   /**
	* 	Update Ioi02bCurRecAddrArea with the passed value
	*   Corresponding COBOL Variable is IOI-02B-CUR-REC-ADDR-AREA
	*	@param value
	*/
   public void setIoi02bCurRecAddrArea(char[] value) {
      ioi02bCurRecAddrArea.setString(value); 
   }   
    
     /**
	 * 	Update Ioi02bCurRecAddrArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIoi02bCurRecAddrArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ioi02bCurRecAddrArea.begin,ioi02bCurRecAddrArea.length());
   }
   
     /**
	 * 	Update Ioi02bCurRecAddrArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIoi02bCurRecAddrArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ioi02bCurRecAddrArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ioi02bCurRecAddrArea with another Field
	 *	@param value
	 */
   public void setIoi02bCurRecAddrArea(Field source) {
   	replace(source,0,source.length(),ioi02bCurRecAddrArea.begin,ioi02bCurRecAddrArea.length());
   }  
   
     /**
	 * 	Update Ioi02bCurRecAddrArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIoi02bCurRecAddrArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ioi02bCurRecAddrArea.begin,ioi02bCurRecAddrArea.length());
   }
   
     /**
	 * 	Update Ioi02bCurRecAddrArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIoi02bCurRecAddrArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ioi02bCurRecAddrArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ioi02bError
	 *	@return ioi02bError
	 */
   public char[] getIoi02bError() throws CFException{
     if (isIoi02bErrorModified()) { 
        ioi02bError = refreshIoi02bError();
     }
   		return ioi02bError;
   }

  
	/**
	*  set variable ioi02bError
	*  Corresponding COBOL Variable is IOI-02B-ERROR
	*  @param value
	**/
   public void setIoi02bError(char[] value) {
      ioi02bError = checkIoi02bErrorConstraints(value);
      serializeIoi02bError(ioi02bError);
   } 

     /**
	 * 	Update Ioi02bError 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIoi02bError(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIoi02bError,ioi02bError.length);
   	
   }
   
   public void setIoi02bError(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIoi02bError,ioi02bError.length);
   	
   }
   
     /**
	 * 	Update Ioi02bError 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIoi02bError(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIoi02bError+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ioi02bError with another Field
	 *	@param value
	 */
   public void setIoi02bError(Field source) {
       replace(source,0,source.length(),beginIoi02bError,IOI_02B_ERROR_LEN);
   	
   }  
   
     /**
	 * 	Update Ioi02bError 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIoi02bError(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIoi02bError,IOI_02B_ERROR_LEN);
   	
   }
   
     /**
	 * 	Update Ioi02bError 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIoi02bError(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIoi02bError+targetIndex,targetLen);
    
   }
	char[] ioi02bNotFound88Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isIoi02bNotFound()
	 *	@return  Returns true if isIoi02bNotFound() is "F"
	 */
   public boolean isIoi02bNotFound() throws CFException {
      return (  compareChars( getIoi02bError() , ioi02bNotFound88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setIoi02bNotFoundTrue() {  			
    	setIoi02bError( ioi02bNotFound88Value);
   	}
	char[] ioi02bEof88Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIoi02bEof()
	 *	@return  Returns true if isIoi02bEof() is "E"
	 */
   public boolean isIoi02bEof() throws CFException {
      return (  compareChars( getIoi02bError() , ioi02bEof88Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIoi02bEofTrue() {  			
    	setIoi02bError( ioi02bEof88Value);
   	}
	char[] ioi02bGood88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIoi02bGood()
	 *	@return  Returns true if isIoi02bGood() is " "
	 */
   public boolean isIoi02bGood() throws CFException {
      return (  compareChars( getIoi02bError() , ioi02bGood88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIoi02bGoodTrue() {  			
    	setIoi02bError( ioi02bGood88Value);
   	}
	char[] ioi02bBadRequest88Value1 = "B".toCharArray();
char[] ioi02bBadRequest88Value2 = "N".toCharArray();

	/**
	 *	Test condition "B" "N" for isIoi02bBadRequest()
	 *	@return  Returns true if isIoi02bBadRequest() is "B" "N"
	 */
   public boolean isIoi02bBadRequest() throws CFException {
      return (  compareChars( getIoi02bError() , ioi02bBadRequest88Value1)  == 0  ||  compareChars( getIoi02bError() , ioi02bBadRequest88Value2)  == 0  );
   }


	/**
	*  set values "B" "N"
	*/
   	public void setIoi02bBadRequestTrue() {  			
    	setIoi02bError( ioi02bBadRequest88Value1);
   	}
	char[] ioi02bNotInitialized88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIoi02bNotInitialized()
	 *	@return  Returns true if isIoi02bNotInitialized() is "N"
	 */
   public boolean isIoi02bNotInitialized() throws CFException {
      return (  compareChars( getIoi02bError() , ioi02bNotInitialized88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIoi02bNotInitializedTrue() {  			
    	setIoi02bError( ioi02bNotInitialized88Value);
   	}
	/**
	 *	Returns the value of ioi02bReserveArea
	 *	@return ioi02bReserveArea
	 */   
	 public Ioi02bReserveArea getIoi02bReserveArea() {
   	return ioi02bReserveArea;
   }
   /**
	* 	Update Ioi02bReserveArea with the passed value
	*   Corresponding COBOL Variable is IOI-02B-RESERVE-AREA
	*	@param value
	*/
   public void setIoi02bReserveArea(char[] value) {
      ioi02bReserveArea.setString(value); 
   }   
    
     /**
	 * 	Update Ioi02bReserveArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIoi02bReserveArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ioi02bReserveArea.begin,ioi02bReserveArea.length());
   }
   
     /**
	 * 	Update Ioi02bReserveArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIoi02bReserveArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ioi02bReserveArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ioi02bReserveArea with another Field
	 *	@param value
	 */
   public void setIoi02bReserveArea(Field source) {
   	replace(source,0,source.length(),ioi02bReserveArea.begin,ioi02bReserveArea.length());
   }  
   
     /**
	 * 	Update Ioi02bReserveArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIoi02bReserveArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ioi02bReserveArea.begin,ioi02bReserveArea.length());
   }
   
     /**
	 * 	Update Ioi02bReserveArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIoi02bReserveArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ioi02bReserveArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIoi02bInterfaceFieldLength() {
			return IOI_02B_INTERFACE_LENGTH;
		}

}
  
