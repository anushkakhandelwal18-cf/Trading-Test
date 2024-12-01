package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Num15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Num15 extends Num15Serialized { 
   

						private char[] num15X = Field.fillLowValue(15);

								private long num159;
	
	/**
	* Constructor for Num15
	**/
    public Num15() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of num15X
	 *	@return num15X
	 */
   public char[] getNum15X() throws CFException{
     if (isNum15XModified()) { 
        num15X = refreshNum15X();
     }
   		return num15X;
   }

  
	/**
	*  set variable num15X
	*  Corresponding COBOL Variable is WS-NUM-15-X
	*  @param value
	**/
   public void setNum15X(char[] value) {
      num15X = checkNum15XConstraints(value);
      serializeNum15X(num15X);
   } 

     /**
	 * 	Update Num15X 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNum15X(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNum15X,num15X.length);
   	
   }
   
   public void setNum15X(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNum15X,num15X.length);
   	
   }
   
     /**
	 * 	Update Num15X 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNum15X(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNum15X+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Num15X with another Field
	 *	@param value
	 */
   public void setNum15X(Field source) {
       replace(source,0,source.length(),beginNum15X,NUM_15_X_LEN);
   	
   }  
   
     /**
	 * 	Update Num15X 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNum15X(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNum15X,NUM_15_X_LEN);
   	
   }
   
     /**
	 * 	Update Num15X 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNum15X(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNum15X+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of num159
	 *	@return num159
	 */
	public long getNum159() throws CFException {
       if (isNum159Modified()) { 
           num159 = refreshNum159();
        }
   		return num159;
	}
	

	
	   
	/**
	 * 	Update Num159 with the passed value
	 *  Corresponding COBOL Variable is WS-NUM-15-9
	 *	@param number
	 */
	public void setNum159(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    num159 = checkNum159MaxLimit(number); 
		serializeNum159(num159);
	}
	

	/**
	 * 	Update Num159 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum159(char[] value) throws CFException {
		 num159 = serializeNum159(value);
	}
	/**
	 * 	Update Num159 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum159String(char[] value) throws CFException {
		 setNum159(value);
	}

	
	
	

		public static int getNum15FieldLength() {
			return NUM_15_LENGTH;
		}

}
  
