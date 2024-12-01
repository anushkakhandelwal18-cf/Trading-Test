package com.cloudframe.app.dto.o529351u;

/**
*  The class DrstReturnArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DrstReturnArea extends DrstReturnAreaSerialized { 
   

								private int drstReturnCode;

						private char[] drstEditErrorField = new char[20];
				private DrstEditErrorValueTxt drstEditErrorValueTxt = new DrstEditErrorValueTxt();
	
	/**
	* Constructor for DrstReturnArea
	**/
    public DrstReturnArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DrstReturnArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstReturnArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			drstEditErrorValueTxt.setParent(this,getStartOffset() + 23);
								setDrstReturnCode(0);
								setDrstEditErrorField(fillSpace(20));
    } 

	/**
	 *	Returns the value of drstReturnCode
	 *	@return drstReturnCode
	 */
	public int getDrstReturnCode() throws CFException {
       if (isDrstReturnCodeModified()) { 
           drstReturnCode = refreshDrstReturnCode();
        }
   		return drstReturnCode;
	}
	

	
	   
	/**
	 * 	Update DrstReturnCode with the passed value
	 *  Corresponding COBOL Variable is DRST-RETURN-CODE
	 *	@param number
	 */
	public void setDrstReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    drstReturnCode = checkDrstReturnCodeMaxLimit(number); 
		serializeDrstReturnCode(drstReturnCode);
	}
	

	public void setDrstReturnCode(long number) {
	    number = checkDrstReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDrstReturnCode((int)number);
	}
	
	/**
	 * 	Update DrstReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setDrstReturnCode(char[] value) throws CFException {
		 drstReturnCode = serializeDrstReturnCode(value);
	}
	/**
	 * 	Update DrstReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDrstReturnCodeString(char[] value) throws CFException {
		 setDrstReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isDrstNoError()
	 *	@return  Returns true if isDrstNoError() is 0
	 */
   public boolean isDrstNoError() throws CFException {
      return (  getDrstReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setDrstNoErrorTrue() {  			
    	setDrstReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 for isDrstEditError()
	 *	@return  Returns true if isDrstEditError() is 1
	 */
   public boolean isDrstEditError() throws CFException {
      return (  getDrstReturnCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDrstEditErrorTrue() {  			
    	setDrstReturnCode( 1);
   	}
	
	/**
	 *	Test condition 2 for isDrstCicsError()
	 *	@return  Returns true if isDrstCicsError() is 2
	 */
   public boolean isDrstCicsError() throws CFException {
      return (  getDrstReturnCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setDrstCicsErrorTrue() {  			
    	setDrstReturnCode( 2);
   	}
	
	/**
	 *	Test condition 999 for isDrstDb2Error()
	 *	@return  Returns true if isDrstDb2Error() is 999
	 */
   public boolean isDrstDb2Error() throws CFException {
      return (  getDrstReturnCode()  ==  999  );
   }


	/**
	*  set values 999
	*/
   	public void setDrstDb2ErrorTrue() {  			
    	setDrstReturnCode( 999);
   	}
	/**
	 *	Returns the value of drstEditErrorField
	 *	@return drstEditErrorField
	 */
   public char[] getDrstEditErrorField() throws CFException{
     if (isDrstEditErrorFieldModified()) { 
        drstEditErrorField = refreshDrstEditErrorField();
     }
   		return drstEditErrorField;
   }

  
	/**
	*  set variable drstEditErrorField
	*  Corresponding COBOL Variable is DRST-EDIT-ERROR-FIELD
	*  @param value
	**/
   public void setDrstEditErrorField(char[] value) {
      drstEditErrorField = checkDrstEditErrorFieldConstraints(value);
      serializeDrstEditErrorField(drstEditErrorField);
   } 

     /**
	 * 	Update DrstEditErrorField 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrstEditErrorField(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrstEditErrorField,drstEditErrorField.length);
   	
   }
   
   public void setDrstEditErrorField(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrstEditErrorField,drstEditErrorField.length);
   	
   }
   
     /**
	 * 	Update DrstEditErrorField 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstEditErrorField(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstEditErrorField+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrstEditErrorField with another Field
	 *	@param value
	 */
   public void setDrstEditErrorField(Field source) {
       replace(source,0,source.length(),beginDrstEditErrorField,DRST_EDIT_ERROR_FIELD_LEN);
   	
   }  
   
     /**
	 * 	Update DrstEditErrorField 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrstEditErrorField(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrstEditErrorField,DRST_EDIT_ERROR_FIELD_LEN);
   	
   }
   
     /**
	 * 	Update DrstEditErrorField 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstEditErrorField(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstEditErrorField+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of drstEditErrorValueTxt
	 *	@return drstEditErrorValueTxt
	 */   
	 public DrstEditErrorValueTxt getDrstEditErrorValueTxt() {
   	return drstEditErrorValueTxt;
   }
   /**
	* 	Update DrstEditErrorValueTxt with the passed value
	*   Corresponding COBOL Variable is DRST-EDIT-ERROR-VALUE-TXT
	*	@param value
	*/
   public void setDrstEditErrorValueTxt(char[] value) {
      drstEditErrorValueTxt.setString(value); 
   }   
    
     /**
	 * 	Update DrstEditErrorValueTxt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDrstEditErrorValueTxt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstEditErrorValueTxt.begin,drstEditErrorValueTxt.length());
   }
   
     /**
	 * 	Update DrstEditErrorValueTxt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstEditErrorValueTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstEditErrorValueTxt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DrstEditErrorValueTxt with another Field
	 *	@param value
	 */
   public void setDrstEditErrorValueTxt(Field source) {
   	replace(source,0,source.length(),drstEditErrorValueTxt.begin,drstEditErrorValueTxt.length());
   }  
   
     /**
	 * 	Update DrstEditErrorValueTxt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDrstEditErrorValueTxt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstEditErrorValueTxt.begin,drstEditErrorValueTxt.length());
   }
   
     /**
	 * 	Update DrstEditErrorValueTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstEditErrorValueTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstEditErrorValueTxt.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDrstReturnAreaFieldLength() {
			return DRST_RETURN_AREA_LENGTH;
		}

}
  
