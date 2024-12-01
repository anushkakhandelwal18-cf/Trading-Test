package com.cloudframe.app.dto.o529351u;

/**
*  The class XrfRpData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class XrfRpData extends XrfRpDataSerialized { 
   

						private char[] xrfPlcyRp = Field.fillLowValue(6);

								private short xrfDivRp;

								private short xrfClsRp;

						private char[] xrfSuffRp = Field.fillLowValue(2);
	
	/**
	* Constructor for XrfRpData
	**/
    public XrfRpData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for XrfRpData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfRpData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of xrfPlcyRp
	 *	@return xrfPlcyRp
	 */
   public char[] getXrfPlcyRp() throws CFException{
     if (isXrfPlcyRpModified()) { 
        xrfPlcyRp = refreshXrfPlcyRp();
     }
   		return xrfPlcyRp;
   }

  
	/**
	*  set variable xrfPlcyRp
	*  Corresponding COBOL Variable is XRF-PLCY-RP
	*  @param value
	**/
   public void setXrfPlcyRp(char[] value) {
      xrfPlcyRp = checkXrfPlcyRpConstraints(value);
      serializeXrfPlcyRp(xrfPlcyRp);
   } 

     /**
	 * 	Update XrfPlcyRp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfPlcyRp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfPlcyRp,xrfPlcyRp.length);
   	
   }
   
   public void setXrfPlcyRp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyRp,xrfPlcyRp.length);
   	
   }
   
     /**
	 * 	Update XrfPlcyRp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfPlcyRp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyRp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfPlcyRp with another Field
	 *	@param value
	 */
   public void setXrfPlcyRp(Field source) {
       replace(source,0,source.length(),beginXrfPlcyRp,XRF_PLCY_RP_LEN);
   	
   }  
   
     /**
	 * 	Update XrfPlcyRp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfPlcyRp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfPlcyRp,XRF_PLCY_RP_LEN);
   	
   }
   
     /**
	 * 	Update XrfPlcyRp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfPlcyRp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyRp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfDivRp
	 *	@return xrfDivRp
	 */
	public short getXrfDivRp() throws CFException {
        if (isXrfDivRpModified()) { 
           xrfDivRp = refreshXrfDivRp();
        }
   		return xrfDivRp;
	}
	
	/**
	 * 	Update XrfDivRp with the passed value
	 *  Corresponding COBOL Variable is XRF-DIV-RP
	 *	@param number
	 */
	public void setXrfDivRp(short number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfDivRp = checkXrfDivRpMaxLimit(number); 
		serializeXrfDivRp(xrfDivRp);
	}

	public void setXrfDivRp(int number) {
	    number = checkXrfDivRpMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfDivRp((short)number);
	}
	public void setXrfDivRp(long number) {
	    number = checkXrfDivRpMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfDivRp((short)number);
	}
	

	/**
	 *	Returns the value of xrfClsRp
	 *	@return xrfClsRp
	 */
	public short getXrfClsRp() throws CFException {
        if (isXrfClsRpModified()) { 
           xrfClsRp = refreshXrfClsRp();
        }
   		return xrfClsRp;
	}
	
	/**
	 * 	Update XrfClsRp with the passed value
	 *  Corresponding COBOL Variable is XRF-CLS-RP
	 *	@param number
	 */
	public void setXrfClsRp(short number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfClsRp = checkXrfClsRpMaxLimit(number); 
		serializeXrfClsRp(xrfClsRp);
	}

	public void setXrfClsRp(int number) {
	    number = checkXrfClsRpMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfClsRp((short)number);
	}
	public void setXrfClsRp(long number) {
	    number = checkXrfClsRpMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfClsRp((short)number);
	}
	

	/**
	 *	Returns the value of xrfSuffRp
	 *	@return xrfSuffRp
	 */
   public char[] getXrfSuffRp() throws CFException{
     if (isXrfSuffRpModified()) { 
        xrfSuffRp = refreshXrfSuffRp();
     }
   		return xrfSuffRp;
   }

  
	/**
	*  set variable xrfSuffRp
	*  Corresponding COBOL Variable is XRF-SUFF-RP
	*  @param value
	**/
   public void setXrfSuffRp(char[] value) {
      xrfSuffRp = checkXrfSuffRpConstraints(value);
      serializeXrfSuffRp(xrfSuffRp);
   } 

     /**
	 * 	Update XrfSuffRp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfSuffRp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfSuffRp,xrfSuffRp.length);
   	
   }
   
   public void setXrfSuffRp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSuffRp,xrfSuffRp.length);
   	
   }
   
     /**
	 * 	Update XrfSuffRp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfSuffRp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSuffRp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfSuffRp with another Field
	 *	@param value
	 */
   public void setXrfSuffRp(Field source) {
       replace(source,0,source.length(),beginXrfSuffRp,XRF_SUFF_RP_LEN);
   	
   }  
   
     /**
	 * 	Update XrfSuffRp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfSuffRp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfSuffRp,XRF_SUFF_RP_LEN);
   	
   }
   
     /**
	 * 	Update XrfSuffRp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfSuffRp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSuffRp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getXrfRpDataFieldLength() {
			return XRF_RP_DATA_LENGTH;
		}

}
  
