package com.cloudframe.app.dto.cics0010;

/**
*  The class LsDfhcommarea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:51. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.cics0010.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsDfhcommarea extends LsDfhcommareaSerialized { 
   

								private int lsRequestType;

						private char[] lsRequestData = Field.fillLowValue(100);

								private int lsReturnCode;

								private long lsReturnEibresp;

								private long lsReturnEibresp2;
	
	/**
	* Constructor for LsDfhcommarea
	**/
    public LsDfhcommarea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsRequestType
	 *	@return lsRequestType
	 */
	public int getLsRequestType() throws CFException {
        if (isLsRequestTypeModified()) { 
           lsRequestType = refreshLsRequestType();
        }
   		return lsRequestType;
	}
	
	/**
	 * 	Update LsRequestType with the passed value
	 *  Corresponding COBOL Variable is LS-REQUEST-TYPE
	 *	@param number
	 */
	public void setLsRequestType(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsRequestType = checkLsRequestTypeMaxLimit(number); 
		serializeLsRequestType(lsRequestType);
	}


	public void setLsRequestType(long number) {
	    number = checkLsRequestTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsRequestType((int)number);
	}
	
	/**
	 *	Returns the value of lsRequestData
	 *	@return lsRequestData
	 */
   public char[] getLsRequestData() throws CFException{
     if (isLsRequestDataModified()) { 
        lsRequestData = refreshLsRequestData();
     }
   		return lsRequestData;
   }

  
	/**
	*  set variable lsRequestData
	*  Corresponding COBOL Variable is LS-REQUEST-DATA
	*  @param value
	**/
   public void setLsRequestData(char[] value) {
      lsRequestData = checkLsRequestDataConstraints(value);
      serializeLsRequestData(lsRequestData);
   } 

     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsRequestData,lsRequestData.length);
   	
   }
   
   public void setLsRequestData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsRequestData,lsRequestData.length);
   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsRequestData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsRequestData with another Field
	 *	@param value
	 */
   public void setLsRequestData(Field source) {
       replace(source,0,source.length(),beginLsRequestData,LS_REQUEST_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsRequestData,LS_REQUEST_DATA_LEN);
   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsRequestData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
       if (isLsReturnCodeModified()) { 
           lsReturnCode = refreshLsReturnCode();
        }
   		return lsReturnCode;
	}
	

	
	   
	/**
	 * 	Update LsReturnCode with the passed value
	 *  Corresponding COBOL Variable is LS-RETURN-CODE
	 *	@param number
	 */
	public void setLsReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsReturnCode = checkLsReturnCodeMaxLimit(number); 
		serializeLsReturnCode(lsReturnCode);
	}
	

	public void setLsReturnCode(long number) {
	    number = checkLsReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsReturnCode((int)number);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value) throws CFException {
		 lsReturnCode = serializeLsReturnCode(value);
	}
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value) throws CFException {
		 setLsReturnCode(value);
	}
	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
       if (isLsReturnEibrespModified()) { 
           lsReturnEibresp = refreshLsReturnEibresp();
        }
   		return lsReturnEibresp;
	}
	

	
	   
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *  Corresponding COBOL Variable is LS-RETURN-EIBRESP
	 *	@param number
	 */
	public void setLsReturnEibresp(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsReturnEibresp = checkLsReturnEibrespMaxLimit(number); 
		serializeLsReturnEibresp(lsReturnEibresp);
	}
	

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value) throws CFException {
		 lsReturnEibresp = serializeLsReturnEibresp(value);
	}
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value) throws CFException {
		 setLsReturnEibresp(value);
	}
	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
       if (isLsReturnEibresp2Modified()) { 
           lsReturnEibresp2 = refreshLsReturnEibresp2();
        }
   		return lsReturnEibresp2;
	}
	

	
	   
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *  Corresponding COBOL Variable is LS-RETURN-EIBRESP2
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsReturnEibresp2 = checkLsReturnEibresp2MaxLimit(number); 
		serializeLsReturnEibresp2(lsReturnEibresp2);
	}
	

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value) throws CFException {
		 lsReturnEibresp2 = serializeLsReturnEibresp2(value);
	}
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value) throws CFException {
		 setLsReturnEibresp2(value);
	}

	
	
	

		public static int getLsDfhcommareaFieldLength() {
			return LS_DFHCOMMAREA_LENGTH;
		}

}
  
