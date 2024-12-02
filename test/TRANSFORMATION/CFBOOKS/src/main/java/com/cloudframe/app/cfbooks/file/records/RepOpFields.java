package com.cloudframe.app.cfbooks.file.records;

/**
*  The class RepOpFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/


import com.cloudframe.app.cfbooks.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RepOpFields extends RepOpFieldsSerialized { 
   

						private char[] opBookid = Field.fillLowValue(8);

						private char[] opTitle = Field.fillLowValue(77);

						private char[] opPages = Field.fillLowValue(4);

						private char[] opRating = Field.fillLowValue(4);

						private char[] opIsbn = Field.fillLowValue(13);

						private char[] opPubdate = Field.fillLowValue(10);

						private char[] opPubid = Field.fillLowValue(4);
	
	/**
	* Constructor for RepOpFields
	**/
    public RepOpFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of opBookid
	 *	@return opBookid
	 */
   public char[] getOpBookid() throws CFException{
     if (isOpBookidModified()) { 
        opBookid = refreshOpBookid();
     }
   		return opBookid;
   }

  
	/**
	*  set variable opBookid
	*  Corresponding COBOL Variable is OP-BOOKID
	*  @param value
	**/
   public void setOpBookid(char[] value) {
      opBookid = checkOpBookidConstraints(value);
      serializeOpBookid(opBookid);
   } 

     /**
	 * 	Update OpBookid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpBookid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOpBookid,opBookid.length);
   	
   }
   
   public void setOpBookid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOpBookid,opBookid.length);
   	
   }
   
     /**
	 * 	Update OpBookid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpBookid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpBookid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OpBookid with another Field
	 *	@param value
	 */
   public void setOpBookid(Field source) {
       replace(source,0,source.length(),beginOpBookid,OP_BOOKID_LEN);
   	
   }  
   
     /**
	 * 	Update OpBookid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpBookid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOpBookid,OP_BOOKID_LEN);
   	
   }
   
     /**
	 * 	Update OpBookid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpBookid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpBookid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of opTitle
	 *	@return opTitle
	 */
   public char[] getOpTitle() throws CFException{
     if (isOpTitleModified()) { 
        opTitle = refreshOpTitle();
     }
   		return opTitle;
   }

  
	/**
	*  set variable opTitle
	*  Corresponding COBOL Variable is OP-TITLE
	*  @param value
	**/
   public void setOpTitle(char[] value) {
      opTitle = checkOpTitleConstraints(value);
      serializeOpTitle(opTitle);
   } 

     /**
	 * 	Update OpTitle 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpTitle(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOpTitle,opTitle.length);
   	
   }
   
   public void setOpTitle(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOpTitle,opTitle.length);
   	
   }
   
     /**
	 * 	Update OpTitle 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpTitle(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpTitle+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OpTitle with another Field
	 *	@param value
	 */
   public void setOpTitle(Field source) {
       replace(source,0,source.length(),beginOpTitle,OP_TITLE_LEN);
   	
   }  
   
     /**
	 * 	Update OpTitle 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpTitle(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOpTitle,OP_TITLE_LEN);
   	
   }
   
     /**
	 * 	Update OpTitle 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpTitle(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpTitle+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of opPages
	 *	@return opPages
	 */
   public char[] getOpPages() throws CFException{
     if (isOpPagesModified()) { 
        opPages = refreshOpPages();
     }
   		return opPages;
   }

  
	/**
	*  set variable opPages
	*  Corresponding COBOL Variable is OP-PAGES
	*  @param value
	**/
   public void setOpPages(char[] value) {
      opPages = checkOpPagesConstraints(value);
      serializeOpPages(opPages);
   } 

     /**
	 * 	Update OpPages 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpPages(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOpPages,opPages.length);
   	
   }
   
   public void setOpPages(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOpPages,opPages.length);
   	
   }
   
     /**
	 * 	Update OpPages 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpPages(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpPages+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OpPages with another Field
	 *	@param value
	 */
   public void setOpPages(Field source) {
       replace(source,0,source.length(),beginOpPages,OP_PAGES_LEN);
   	
   }  
   
     /**
	 * 	Update OpPages 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpPages(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOpPages,OP_PAGES_LEN);
   	
   }
   
     /**
	 * 	Update OpPages 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpPages(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpPages+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of opRating
	 *	@return opRating
	 */
   public char[] getOpRating() throws CFException{
     if (isOpRatingModified()) { 
        opRating = refreshOpRating();
     }
   		return opRating;
   }

  
	/**
	*  set variable opRating
	*  Corresponding COBOL Variable is OP-RATING
	*  @param value
	**/
   public void setOpRating(char[] value) {
      opRating = checkOpRatingConstraints(value);
      serializeOpRating(opRating);
   } 

     /**
	 * 	Update OpRating 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpRating(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOpRating,opRating.length);
   	
   }
   
   public void setOpRating(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOpRating,opRating.length);
   	
   }
   
     /**
	 * 	Update OpRating 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpRating(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpRating+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OpRating with another Field
	 *	@param value
	 */
   public void setOpRating(Field source) {
       replace(source,0,source.length(),beginOpRating,OP_RATING_LEN);
   	
   }  
   
     /**
	 * 	Update OpRating 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpRating(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOpRating,OP_RATING_LEN);
   	
   }
   
     /**
	 * 	Update OpRating 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpRating(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpRating+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of opIsbn
	 *	@return opIsbn
	 */
   public char[] getOpIsbn() throws CFException{
     if (isOpIsbnModified()) { 
        opIsbn = refreshOpIsbn();
     }
   		return opIsbn;
   }

  
	/**
	*  set variable opIsbn
	*  Corresponding COBOL Variable is OP-ISBN
	*  @param value
	**/
   public void setOpIsbn(char[] value) {
      opIsbn = checkOpIsbnConstraints(value);
      serializeOpIsbn(opIsbn);
   } 

     /**
	 * 	Update OpIsbn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpIsbn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOpIsbn,opIsbn.length);
   	
   }
   
   public void setOpIsbn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOpIsbn,opIsbn.length);
   	
   }
   
     /**
	 * 	Update OpIsbn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpIsbn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpIsbn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OpIsbn with another Field
	 *	@param value
	 */
   public void setOpIsbn(Field source) {
       replace(source,0,source.length(),beginOpIsbn,OP_ISBN_LEN);
   	
   }  
   
     /**
	 * 	Update OpIsbn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpIsbn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOpIsbn,OP_ISBN_LEN);
   	
   }
   
     /**
	 * 	Update OpIsbn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpIsbn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpIsbn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of opPubdate
	 *	@return opPubdate
	 */
   public char[] getOpPubdate() throws CFException{
     if (isOpPubdateModified()) { 
        opPubdate = refreshOpPubdate();
     }
   		return opPubdate;
   }

  
	/**
	*  set variable opPubdate
	*  Corresponding COBOL Variable is OP-PUBDATE
	*  @param value
	**/
   public void setOpPubdate(char[] value) {
      opPubdate = checkOpPubdateConstraints(value);
      serializeOpPubdate(opPubdate);
   } 

     /**
	 * 	Update OpPubdate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpPubdate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOpPubdate,opPubdate.length);
   	
   }
   
   public void setOpPubdate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOpPubdate,opPubdate.length);
   	
   }
   
     /**
	 * 	Update OpPubdate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpPubdate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpPubdate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OpPubdate with another Field
	 *	@param value
	 */
   public void setOpPubdate(Field source) {
       replace(source,0,source.length(),beginOpPubdate,OP_PUBDATE_LEN);
   	
   }  
   
     /**
	 * 	Update OpPubdate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpPubdate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOpPubdate,OP_PUBDATE_LEN);
   	
   }
   
     /**
	 * 	Update OpPubdate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpPubdate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpPubdate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of opPubid
	 *	@return opPubid
	 */
   public char[] getOpPubid() throws CFException{
     if (isOpPubidModified()) { 
        opPubid = refreshOpPubid();
     }
   		return opPubid;
   }

  
	/**
	*  set variable opPubid
	*  Corresponding COBOL Variable is OP-PUBID
	*  @param value
	**/
   public void setOpPubid(char[] value) {
      opPubid = checkOpPubidConstraints(value);
      serializeOpPubid(opPubid);
   } 

     /**
	 * 	Update OpPubid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpPubid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOpPubid,opPubid.length);
   	
   }
   
   public void setOpPubid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOpPubid,opPubid.length);
   	
   }
   
     /**
	 * 	Update OpPubid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpPubid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpPubid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OpPubid with another Field
	 *	@param value
	 */
   public void setOpPubid(Field source) {
       replace(source,0,source.length(),beginOpPubid,OP_PUBID_LEN);
   	
   }  
   
     /**
	 * 	Update OpPubid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpPubid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOpPubid,OP_PUBID_LEN);
   	
   }
   
     /**
	 * 	Update OpPubid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpPubid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpPubid+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRepOpFieldsFieldLength() {
			return REP_OP_FIELDS_LENGTH;
		}

}
  
