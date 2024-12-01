package com.cloudframe.app.dto.o529351u;

/**
*  The class FesaKey1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesaKey1 extends FesaKey1Serialized { 
   

						private char[] fesaPolicy1 = Field.fillLowValue(6);

								private int fesaPlanVar1;

								private int fesaEffDate1;

								private int fesaSpiNbr1;
	
	/**
	* Constructor for FesaKey1
	**/
    public FesaKey1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fesaPolicy1
	 *	@return fesaPolicy1
	 */
   public char[] getFesaPolicy1() throws CFException{
     if (isFesaPolicy1Modified()) { 
        fesaPolicy1 = refreshFesaPolicy1();
     }
   		return fesaPolicy1;
   }

  
	/**
	*  set variable fesaPolicy1
	*  Corresponding COBOL Variable is FESA-POLICY1
	*  @param value
	**/
   public void setFesaPolicy1(char[] value) {
      fesaPolicy1 = checkFesaPolicy1Constraints(value);
      serializeFesaPolicy1(fesaPolicy1);
   } 

     /**
	 * 	Update FesaPolicy1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesaPolicy1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesaPolicy1,fesaPolicy1.length);
   	
   }
   
   public void setFesaPolicy1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPolicy1,fesaPolicy1.length);
   	
   }
   
     /**
	 * 	Update FesaPolicy1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesaPolicy1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPolicy1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesaPolicy1 with another Field
	 *	@param value
	 */
   public void setFesaPolicy1(Field source) {
       replace(source,0,source.length(),beginFesaPolicy1,FESA_POLICY_1_LEN);
   	
   }  
   
     /**
	 * 	Update FesaPolicy1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesaPolicy1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesaPolicy1,FESA_POLICY_1_LEN);
   	
   }
   
     /**
	 * 	Update FesaPolicy1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesaPolicy1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPolicy1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesaPlanVar1
	 *	@return fesaPlanVar1
	 */
	public int getFesaPlanVar1() throws CFException {
       if (isFesaPlanVar1Modified()) { 
           fesaPlanVar1 = refreshFesaPlanVar1();
        }
   		return fesaPlanVar1;
	}
	

    /**
	 *	Returns the String value of fesaPlanVar1
	 *	@return fesaPlanVar1
	 */
	public char[]  getFesaPlanVar1ActualString() {
	    String value = String.valueOf(fesaPlanVar1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update FesaPlanVar1 with the passed value
	 *  Corresponding COBOL Variable is FESA-PLAN-VAR1
	 *	@param number
	 */
	public void setFesaPlanVar1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fesaPlanVar1 = checkFesaPlanVar1MaxLimit(number); 
		serializeFesaPlanVar1(fesaPlanVar1);
	}
	

	public void setFesaPlanVar1(long number) {
	    number = checkFesaPlanVar1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaPlanVar1((int)number);
	}
	
	/**
	 * 	Update FesaPlanVar1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFesaPlanVar1(char[] value) throws CFException {
		 fesaPlanVar1 = serializeFesaPlanVar1(value);
	}
	/**
	 * 	Update FesaPlanVar1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFesaPlanVar1String(char[] value) throws CFException {
		 setFesaPlanVar1(value);
	}
	/**
	 *	Returns the value of fesaEffDate1
	 *	@return fesaEffDate1
	 */
	public int getFesaEffDate1() throws CFException {
       if (isFesaEffDate1Modified()) { 
           fesaEffDate1 = refreshFesaEffDate1();
        }
   		return fesaEffDate1;
	}
	

    /**
	 *	Returns the String value of fesaEffDate1
	 *	@return fesaEffDate1
	 */
	public char[]  getFesaEffDate1ActualString() {
	    String value = String.valueOf(fesaEffDate1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update FesaEffDate1 with the passed value
	 *  Corresponding COBOL Variable is FESA-EFF-DATE1
	 *	@param number
	 */
	public void setFesaEffDate1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fesaEffDate1 = checkFesaEffDate1MaxLimit(number); 
		serializeFesaEffDate1(fesaEffDate1);
	}
	

	public void setFesaEffDate1(long number) {
	    number = checkFesaEffDate1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaEffDate1((int)number);
	}
	
	/**
	 * 	Update FesaEffDate1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFesaEffDate1(char[] value) throws CFException {
		 fesaEffDate1 = serializeFesaEffDate1(value);
	}
	/**
	 * 	Update FesaEffDate1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFesaEffDate1String(char[] value) throws CFException {
		 setFesaEffDate1(value);
	}
	/**
	 *	Returns the value of fesaSpiNbr1
	 *	@return fesaSpiNbr1
	 */
	public int getFesaSpiNbr1() throws CFException {
       if (isFesaSpiNbr1Modified()) { 
           fesaSpiNbr1 = refreshFesaSpiNbr1();
        }
   		return fesaSpiNbr1;
	}
	

    /**
	 *	Returns the String value of fesaSpiNbr1
	 *	@return fesaSpiNbr1
	 */
	public char[]  getFesaSpiNbr1ActualString() {
	    String value = String.valueOf(fesaSpiNbr1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update FesaSpiNbr1 with the passed value
	 *  Corresponding COBOL Variable is FESA-SPI-NBR1
	 *	@param number
	 */
	public void setFesaSpiNbr1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fesaSpiNbr1 = checkFesaSpiNbr1MaxLimit(number); 
		serializeFesaSpiNbr1(fesaSpiNbr1);
	}
	

	public void setFesaSpiNbr1(long number) {
	    number = checkFesaSpiNbr1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaSpiNbr1((int)number);
	}
	
	/**
	 * 	Update FesaSpiNbr1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFesaSpiNbr1(char[] value) throws CFException {
		 fesaSpiNbr1 = serializeFesaSpiNbr1(value);
	}
	/**
	 * 	Update FesaSpiNbr1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFesaSpiNbr1String(char[] value) throws CFException {
		 setFesaSpiNbr1(value);
	}

	
	
	

		public static int getFesaKey1FieldLength() {
			return FESA_KEY_1_LENGTH;
		}

}
  
