package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Num3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Num3 extends Num3Serialized { 
   

						private char[] num3X = Field.fillLowValue(3);

								private int num39;
	
	/**
	* Constructor for Num3
	**/
    public Num3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of num3X
	 *	@return num3X
	 */
   public char[] getNum3X() throws CFException{
     if (isNum3XModified()) { 
        num3X = refreshNum3X();
     }
   		return num3X;
   }

  
	/**
	*  set variable num3X
	*  Corresponding COBOL Variable is WS-NUM-3-X
	*  @param value
	**/
   public void setNum3X(char[] value) {
      num3X = checkNum3XConstraints(value);
      serializeNum3X(num3X);
   } 

     /**
	 * 	Update Num3X 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNum3X(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNum3X,num3X.length);
   	
   }
   
   public void setNum3X(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNum3X,num3X.length);
   	
   }
   
     /**
	 * 	Update Num3X 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNum3X(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNum3X+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Num3X with another Field
	 *	@param value
	 */
   public void setNum3X(Field source) {
       replace(source,0,source.length(),beginNum3X,NUM_3_X_LEN);
   	
   }  
   
     /**
	 * 	Update Num3X 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNum3X(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNum3X,NUM_3_X_LEN);
   	
   }
   
     /**
	 * 	Update Num3X 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNum3X(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNum3X+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of num39
	 *	@return num39
	 */
	public int getNum39() throws CFException {
       if (isNum39Modified()) { 
           num39 = refreshNum39();
        }
   		return num39;
	}
	

	
	   
	/**
	 * 	Update Num39 with the passed value
	 *  Corresponding COBOL Variable is WS-NUM-3-9
	 *	@param number
	 */
	public void setNum39(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num39 = checkNum39MaxLimit(number); 
		serializeNum39(num39);
	}
	

	public void setNum39(long number) {
	    number = checkNum39MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum39((int)number);
	}
	
	/**
	 * 	Update Num39 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum39(char[] value) throws CFException {
		 num39 = serializeNum39(value);
	}
	/**
	 * 	Update Num39 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum39String(char[] value) throws CFException {
		 setNum39(value);
	}

	
	
	

		public static int getNum3FieldLength() {
			return NUM_3_LENGTH;
		}

}
  
