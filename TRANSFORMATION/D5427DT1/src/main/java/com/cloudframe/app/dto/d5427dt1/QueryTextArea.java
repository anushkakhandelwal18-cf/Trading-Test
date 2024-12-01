package com.cloudframe.app.dto.d5427dt1;

/**
*  The class QueryTextArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class QueryTextArea extends QueryTextAreaSerialized { 
   

								private short queryTextLeng;

						private char[] queryTextData = Field.fillLowValue(32000);
	
	/**
	* Constructor for QueryTextArea
	**/
    public QueryTextArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of queryTextLeng
	 *	@return queryTextLeng
	 */
	public short getQueryTextLeng() throws CFException {
        if (isQueryTextLengModified()) { 
           queryTextLeng = refreshQueryTextLeng();
        }
   		return queryTextLeng;
	}
	
	/**
	 * 	Update QueryTextLeng with the passed value
	 *  Corresponding COBOL Variable is QUERY-TEXT-LENG
	 *	@param number
	 */
	public void setQueryTextLeng(short number) {
	     // Truncate if the number is beyond +/- Max range
	    queryTextLeng = checkQueryTextLengMaxLimit(number); 
		serializeQueryTextLeng(queryTextLeng);
	}

	public void setQueryTextLeng(int number) {
	    number = checkQueryTextLengMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setQueryTextLeng((short)number);
	}
	public void setQueryTextLeng(long number) {
	    number = checkQueryTextLengMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setQueryTextLeng((short)number);
	}
	

	/**
	 *	Returns the value of queryTextData
	 *	@return queryTextData
	 */
   public char[] getQueryTextData() throws CFException{
     if (isQueryTextDataModified()) { 
        queryTextData = refreshQueryTextData();
     }
   		return queryTextData;
   }

  
	/**
	*  set variable queryTextData
	*  Corresponding COBOL Variable is QUERY-TEXT-DATA
	*  @param value
	**/
   public void setQueryTextData(char[] value) {
      queryTextData = checkQueryTextDataConstraints(value);
      serializeQueryTextData(queryTextData);
   } 

     /**
	 * 	Update QueryTextData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setQueryTextData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginQueryTextData,queryTextData.length);
   	
   }
   
   public void setQueryTextData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginQueryTextData,queryTextData.length);
   	
   }
   
     /**
	 * 	Update QueryTextData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setQueryTextData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginQueryTextData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update QueryTextData with another Field
	 *	@param value
	 */
   public void setQueryTextData(Field source) {
       replace(source,0,source.length(),beginQueryTextData,QUERY_TEXT_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update QueryTextData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setQueryTextData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginQueryTextData,QUERY_TEXT_DATA_LEN);
   	
   }
   
     /**
	 * 	Update QueryTextData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setQueryTextData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginQueryTextData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getQueryTextAreaFieldLength() {
			return QUERY_TEXT_AREA_LENGTH;
		}

}
  
