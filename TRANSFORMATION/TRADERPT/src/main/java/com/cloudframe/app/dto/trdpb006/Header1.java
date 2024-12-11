package com.cloudframe.app.dto.trdpb006;

/**
*  The class Header1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-11 at 04:18. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.trdpb006.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Header1 extends Header1Serialized { 
   


								private int h1OrderStatusCode;


						private char[] h1OrderStatusDesc = Field.fillLowValue(20);

	
	/**
	* Constructor for Header1
	**/
    public Header1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("Order Status : ").toCharArray()
             , getStartOffset() + 0
             ,15
             );
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 18
             ,3
             );
       replaceValue( // serialize and save the value
             pad(119," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 41
             ,119
             );
    }


 

	/**
	 *	Returns the value of h1OrderStatusCode
	 *	@return h1OrderStatusCode
	 */
	public int getH1OrderStatusCode() throws CFException {
       if (isH1OrderStatusCodeModified()) { 
           h1OrderStatusCode = refreshH1OrderStatusCode();
        }
   		return h1OrderStatusCode;
	}
	

	
	   
	/**
	 * 	Update H1OrderStatusCode with the passed value
	 *  Corresponding COBOL Variable is WS-H1-ORDER-STATUS-CODE
	 *	@param number
	 */
	public void setH1OrderStatusCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    h1OrderStatusCode = checkH1OrderStatusCodeMaxLimit(number); 
		serializeH1OrderStatusCode(h1OrderStatusCode);
	}
	

	public void setH1OrderStatusCode(long number) {
	    number = checkH1OrderStatusCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setH1OrderStatusCode((int)number);
	}
	
	/**
	 * 	Update H1OrderStatusCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setH1OrderStatusCode(char[] value) throws CFException {
		 h1OrderStatusCode = serializeH1OrderStatusCode(value);
	}
	/**
	 * 	Update H1OrderStatusCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setH1OrderStatusCodeString(char[] value) throws CFException {
		 setH1OrderStatusCode(value);
	}
	/**
	 *	Returns the value of h1OrderStatusDesc
	 *	@return h1OrderStatusDesc
	 */
   public char[] getH1OrderStatusDesc() throws CFException{
     if (isH1OrderStatusDescModified()) { 
        h1OrderStatusDesc = refreshH1OrderStatusDesc();
     }
   		return h1OrderStatusDesc;
   }

  
	/**
	*  set variable h1OrderStatusDesc
	*  Corresponding COBOL Variable is WS-H1-ORDER-STATUS-DESC
	*  @param value
	**/
   public void setH1OrderStatusDesc(char[] value) {
      h1OrderStatusDesc = checkH1OrderStatusDescConstraints(value);
      serializeH1OrderStatusDesc(h1OrderStatusDesc);
   } 

     /**
	 * 	Update H1OrderStatusDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setH1OrderStatusDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginH1OrderStatusDesc,h1OrderStatusDesc.length);
   	
   }
   
   public void setH1OrderStatusDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginH1OrderStatusDesc,h1OrderStatusDesc.length);
   	
   }
   
     /**
	 * 	Update H1OrderStatusDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setH1OrderStatusDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginH1OrderStatusDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update H1OrderStatusDesc with another Field
	 *	@param value
	 */
   public void setH1OrderStatusDesc(Field source) {
       replace(source,0,source.length(),beginH1OrderStatusDesc,H_1_ORDER_STATUS_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update H1OrderStatusDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setH1OrderStatusDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginH1OrderStatusDesc,H_1_ORDER_STATUS_DESC_LEN);
   	
   }
   
     /**
	 * 	Update H1OrderStatusDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setH1OrderStatusDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginH1OrderStatusDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHeader1FieldLength() {
			return HEADER_1_LENGTH;
		}

}
  
