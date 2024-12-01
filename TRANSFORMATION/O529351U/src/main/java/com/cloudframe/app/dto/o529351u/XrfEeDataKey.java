package com.cloudframe.app.dto.o529351u;

/**
*  The class XrfEeDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class XrfEeDataKey extends XrfEeDataKeySerialized { 
   

								private int xrfMvdEe;

						private char[] xrfPlcyEe = Field.fillLowValue(6);


								private short xrfDivEe;

								private short xrfClsEe;
	
	/**
	* Constructor for XrfEeDataKey
	**/
    public XrfEeDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for XrfEeDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfEeDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of xrfMvdEe
	 *	@return xrfMvdEe
	 */
	public int getXrfMvdEe() throws CFException {
       if (isXrfMvdEeModified()) { 
           xrfMvdEe = refreshXrfMvdEe();
        }
   		return xrfMvdEe;
	}
	

	
	   
	/**
	 * 	Update XrfMvdEe with the passed value
	 *  Corresponding COBOL Variable is XRF-MVD-EE
	 *	@param number
	 */
	public void setXrfMvdEe(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    xrfMvdEe = checkXrfMvdEeMaxLimit(number); 
		serializeXrfMvdEe(xrfMvdEe);
	}
	

	public void setXrfMvdEe(long number) {
	    number = checkXrfMvdEeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfMvdEe((int)number);
	}
	
	/**
	 * 	Update XrfMvdEe with the passed value
	 *	@param value (String or char[])
	 */
	public void setXrfMvdEe(char[] value) throws CFException {
		 xrfMvdEe = serializeXrfMvdEe(value);
	}
	/**
	 * 	Update XrfMvdEe with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXrfMvdEeString(char[] value) throws CFException {
		 setXrfMvdEe(value);
	}
	/**
	 *	Returns the value of xrfPlcyEe
	 *	@return xrfPlcyEe
	 */
   public char[] getXrfPlcyEe() throws CFException{
     if (isXrfPlcyEeModified()) { 
        xrfPlcyEe = refreshXrfPlcyEe();
     }
   		return xrfPlcyEe;
   }

  
	/**
	*  set variable xrfPlcyEe
	*  Corresponding COBOL Variable is XRF-PLCY-EE
	*  @param value
	**/
   public void setXrfPlcyEe(char[] value) {
      xrfPlcyEe = checkXrfPlcyEeConstraints(value);
      serializeXrfPlcyEe(xrfPlcyEe);
   } 

     /**
	 * 	Update XrfPlcyEe 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfPlcyEe(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfPlcyEe,xrfPlcyEe.length);
   	
   }
   
   public void setXrfPlcyEe(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyEe,xrfPlcyEe.length);
   	
   }
   
     /**
	 * 	Update XrfPlcyEe 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfPlcyEe(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyEe+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfPlcyEe with another Field
	 *	@param value
	 */
   public void setXrfPlcyEe(Field source) {
       replace(source,0,source.length(),beginXrfPlcyEe,XRF_PLCY_EE_LEN);
   	
   }  
   
     /**
	 * 	Update XrfPlcyEe 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfPlcyEe(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfPlcyEe,XRF_PLCY_EE_LEN);
   	
   }
   
     /**
	 * 	Update XrfPlcyEe 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfPlcyEe(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyEe+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfDivEe
	 *	@return xrfDivEe
	 */
	public short getXrfDivEe() throws CFException {
        if (isXrfDivEeModified()) { 
           xrfDivEe = refreshXrfDivEe();
        }
   		return xrfDivEe;
	}
	
	/**
	 * 	Update XrfDivEe with the passed value
	 *  Corresponding COBOL Variable is XRF-DIV-EE
	 *	@param number
	 */
	public void setXrfDivEe(short number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfDivEe = checkXrfDivEeMaxLimit(number); 
		serializeXrfDivEe(xrfDivEe);
	}

	public void setXrfDivEe(int number) {
	    number = checkXrfDivEeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfDivEe((short)number);
	}
	public void setXrfDivEe(long number) {
	    number = checkXrfDivEeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfDivEe((short)number);
	}
	

	/**
	 *	Returns the value of xrfClsEe
	 *	@return xrfClsEe
	 */
	public short getXrfClsEe() throws CFException {
        if (isXrfClsEeModified()) { 
           xrfClsEe = refreshXrfClsEe();
        }
   		return xrfClsEe;
	}
	
	/**
	 * 	Update XrfClsEe with the passed value
	 *  Corresponding COBOL Variable is XRF-CLS-EE
	 *	@param number
	 */
	public void setXrfClsEe(short number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfClsEe = checkXrfClsEeMaxLimit(number); 
		serializeXrfClsEe(xrfClsEe);
	}

	public void setXrfClsEe(int number) {
	    number = checkXrfClsEeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfClsEe((short)number);
	}
	public void setXrfClsEe(long number) {
	    number = checkXrfClsEeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfClsEe((short)number);
	}
	


	
	
	

		public static int getXrfEeDataKeyFieldLength() {
			return XRF_EE_DATA_KEY_LENGTH;
		}

}
  
