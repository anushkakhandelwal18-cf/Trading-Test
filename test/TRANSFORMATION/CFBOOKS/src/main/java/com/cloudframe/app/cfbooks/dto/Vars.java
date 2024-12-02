package com.cloudframe.app.cfbooks.dto;

/**
*  The class Vars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/


import com.cloudframe.app.cfbooks.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Vars extends VarsSerialized { 
   

						private char[] timestamp = new char[23];

								private long bookid;

								private char[] rating = new char[4];
							

								private int pages;

								private int pubid;

								private int recCount;

						private char[] recBuffer = new char[132];
	
	/**
	* Constructor for Vars
	**/
    public Vars() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTimestamp(fillSpace(23));
								setBookid(0L);
								setRating(CFUtil.cobolNumberFormatter("9.99".toCharArray(),"0".toCharArray()));
								setPages(0);
								setPubid(0);
								setRecCount(0);
								setRecBuffer(pad(132," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of timestamp
	 *	@return timestamp
	 */
   public char[] getTimestamp() throws CFException{
     if (isTimestampModified()) { 
        timestamp = refreshTimestamp();
     }
   		return timestamp;
   }

  
	/**
	*  set variable timestamp
	*  Corresponding COBOL Variable is WS-TIMESTAMP
	*  @param value
	**/
   public void setTimestamp(char[] value) {
      timestamp = checkTimestampConstraints(value);
      serializeTimestamp(timestamp);
   } 

     /**
	 * 	Update Timestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimestamp,timestamp.length);
   	
   }
   
   public void setTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp,timestamp.length);
   	
   }
   
     /**
	 * 	Update Timestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Timestamp with another Field
	 *	@param value
	 */
   public void setTimestamp(Field source) {
       replace(source,0,source.length(),beginTimestamp,TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Timestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimestamp,TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Timestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bookid
	 *	@return bookid
	 */
	public long getBookid() throws CFException {
       if (isBookidModified()) { 
           bookid = refreshBookid();
        }
   		return bookid;
	}
	

	
	   
	/**
	 * 	Update Bookid with the passed value
	 *  Corresponding COBOL Variable is WS-BOOKID
	 *	@param number
	 */
	public void setBookid(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bookid = checkBookidMaxLimit(number); 
		serializeBookid(bookid);
	}
	

	/**
	 * 	Update Bookid with the passed value
	 *	@param value (String or char[])
	 */
	public void setBookid(char[] value) throws CFException {
		 bookid = serializeBookid(value);
	}
	/**
	 * 	Update Bookid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBookidString(char[] value) throws CFException {
		 setBookid(value);
	}
	/**
	 *	Returns the value of rating
	 *	@return rating
	 */
   public char[] getRating() throws CFException{
     if (isRatingModified()) { 
        rating = refreshRating();
     }
   		return rating;
   }

  
	/**
	*  set variable rating
	*  Corresponding COBOL Variable is WS-RATING
	*  @param value
	**/
   public void setRating(char[] value) {
      rating = checkRatingConstraints(value);
      serializeRating(rating);
   } 

     /**
	 * 	Update Rating 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRating(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRating,rating.length);
   	
   }
   
   public void setRating(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRating,rating.length);
   	
   }
   
     /**
	 * 	Update Rating 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRating(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRating+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rating with another Field
	 *	@param value
	 */
   public void setRating(Field source) {
       replace(source,0,source.length(),beginRating,RATING_LEN);
   	
   }  
   
     /**
	 * 	Update Rating 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRating(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRating,RATING_LEN);
   	
   }
   
     /**
	 * 	Update Rating 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRating(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRating+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pages
	 *	@return pages
	 */
	public int getPages() throws CFException {
       if (isPagesModified()) { 
           pages = refreshPages();
        }
   		return pages;
	}
	

	
	   
	/**
	 * 	Update Pages with the passed value
	 *  Corresponding COBOL Variable is WS-PAGES
	 *	@param number
	 */
	public void setPages(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pages = checkPagesMaxLimit(number); 
		serializePages(pages);
	}
	

	public void setPages(long number) {
	    number = checkPagesMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPages((int)number);
	}
	
	/**
	 * 	Update Pages with the passed value
	 *	@param value (String or char[])
	 */
	public void setPages(char[] value) throws CFException {
		 pages = serializePages(value);
	}
	/**
	 * 	Update Pages with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPagesString(char[] value) throws CFException {
		 setPages(value);
	}
	/**
	 *	Returns the value of pubid
	 *	@return pubid
	 */
	public int getPubid() throws CFException {
       if (isPubidModified()) { 
           pubid = refreshPubid();
        }
   		return pubid;
	}
	

	
	   
	/**
	 * 	Update Pubid with the passed value
	 *  Corresponding COBOL Variable is WS-PUBID
	 *	@param number
	 */
	public void setPubid(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pubid = checkPubidMaxLimit(number); 
		serializePubid(pubid);
	}
	

	public void setPubid(long number) {
	    number = checkPubidMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPubid((int)number);
	}
	
	/**
	 * 	Update Pubid with the passed value
	 *	@param value (String or char[])
	 */
	public void setPubid(char[] value) throws CFException {
		 pubid = serializePubid(value);
	}
	/**
	 * 	Update Pubid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPubidString(char[] value) throws CFException {
		 setPubid(value);
	}
	/**
	 *	Returns the value of recCount
	 *	@return recCount
	 */
	public int getRecCount() throws CFException {
       if (isRecCountModified()) { 
           recCount = refreshRecCount();
        }
   		return recCount;
	}
	

	
	   
	/**
	 * 	Update RecCount with the passed value
	 *  Corresponding COBOL Variable is WS-REC-COUNT
	 *	@param number
	 */
	public void setRecCount(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    recCount = checkRecCountMaxLimit(number); 
		serializeRecCount(recCount);
	}
	

	public void setRecCount(long number) {
	    number = checkRecCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecCount((int)number);
	}
	
	/**
	 * 	Update RecCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setRecCount(char[] value) throws CFException {
		 recCount = serializeRecCount(value);
	}
	/**
	 * 	Update RecCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRecCountString(char[] value) throws CFException {
		 setRecCount(value);
	}
	/**
	 *	Returns the value of recBuffer
	 *	@return recBuffer
	 */
   public char[] getRecBuffer() throws CFException{
     if (isRecBufferModified()) { 
        recBuffer = refreshRecBuffer();
     }
   		return recBuffer;
   }

  
	/**
	*  set variable recBuffer
	*  Corresponding COBOL Variable is WS-REC-BUFFER
	*  @param value
	**/
   public void setRecBuffer(char[] value) {
      recBuffer = checkRecBufferConstraints(value);
      serializeRecBuffer(recBuffer);
   } 

     /**
	 * 	Update RecBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecBuffer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecBuffer,recBuffer.length);
   	
   }
   
   public void setRecBuffer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecBuffer,recBuffer.length);
   	
   }
   
     /**
	 * 	Update RecBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecBuffer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecBuffer with another Field
	 *	@param value
	 */
   public void setRecBuffer(Field source) {
       replace(source,0,source.length(),beginRecBuffer,REC_BUFFER_LEN);
   	
   }  
   
     /**
	 * 	Update RecBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecBuffer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecBuffer,REC_BUFFER_LEN);
   	
   }
   
     /**
	 * 	Update RecBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecBuffer+targetIndex,targetLen);
    
   }

	
	
	

		public static int getVarsFieldLength() {
			return VARS_LENGTH;
		}

}
  
