package com.cloudframe.app.dto.o529351u;

/**
*  The class W02FnuLineStartbr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class W02FnuLineStartbr extends W02FnuLineStartbrSerialized { 
   

						private char[] w02FnuTranStbr = new char[4];


						private char[] w02FnuFileStbr = Field.fillLowValue(8);


						private char[] w02FnuKeyStbr = Field.fillLowValue(38);
	
	/**
	* Constructor for W02FnuLineStartbr
	**/
    public W02FnuLineStartbr() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setW02FnuTranStbr(("BTMQ").toCharArray());
       replaceValue( // serialize and save the value
             (":SRTBR FAILED IN ").toCharArray()
             , getStartOffset() + 4
             ,17
             );
       replaceValue( // serialize and save the value
             (",KEY= ").toCharArray()
             , getStartOffset() + 29
             ,6
             );
    }


 

	/**
	 *	Returns the value of w02FnuTranStbr
	 *	@return w02FnuTranStbr
	 */
   public char[] getW02FnuTranStbr() throws CFException{
     if (isW02FnuTranStbrModified()) { 
        w02FnuTranStbr = refreshW02FnuTranStbr();
     }
   		return w02FnuTranStbr;
   }

  
	/**
	*  set variable w02FnuTranStbr
	*  Corresponding COBOL Variable is W02-FNU-TRAN-STBR
	*  @param value
	**/
   public void setW02FnuTranStbr(char[] value) {
      w02FnuTranStbr = checkW02FnuTranStbrConstraints(value);
      serializeW02FnuTranStbr(w02FnuTranStbr);
   } 

     /**
	 * 	Update W02FnuTranStbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuTranStbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuTranStbr,w02FnuTranStbr.length);
   	
   }
   
   public void setW02FnuTranStbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuTranStbr,w02FnuTranStbr.length);
   	
   }
   
     /**
	 * 	Update W02FnuTranStbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuTranStbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuTranStbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuTranStbr with another Field
	 *	@param value
	 */
   public void setW02FnuTranStbr(Field source) {
       replace(source,0,source.length(),beginW02FnuTranStbr,W_02_FNU_TRAN_STBR_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuTranStbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuTranStbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuTranStbr,W_02_FNU_TRAN_STBR_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuTranStbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuTranStbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuTranStbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02FnuFileStbr
	 *	@return w02FnuFileStbr
	 */
   public char[] getW02FnuFileStbr() throws CFException{
     if (isW02FnuFileStbrModified()) { 
        w02FnuFileStbr = refreshW02FnuFileStbr();
     }
   		return w02FnuFileStbr;
   }

  
	/**
	*  set variable w02FnuFileStbr
	*  Corresponding COBOL Variable is W02-FNU-FILE-STBR
	*  @param value
	**/
   public void setW02FnuFileStbr(char[] value) {
      w02FnuFileStbr = checkW02FnuFileStbrConstraints(value);
      serializeW02FnuFileStbr(w02FnuFileStbr);
   } 

     /**
	 * 	Update W02FnuFileStbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuFileStbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuFileStbr,w02FnuFileStbr.length);
   	
   }
   
   public void setW02FnuFileStbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuFileStbr,w02FnuFileStbr.length);
   	
   }
   
     /**
	 * 	Update W02FnuFileStbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuFileStbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuFileStbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuFileStbr with another Field
	 *	@param value
	 */
   public void setW02FnuFileStbr(Field source) {
       replace(source,0,source.length(),beginW02FnuFileStbr,W_02_FNU_FILE_STBR_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuFileStbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuFileStbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuFileStbr,W_02_FNU_FILE_STBR_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuFileStbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuFileStbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuFileStbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02FnuKeyStbr
	 *	@return w02FnuKeyStbr
	 */
   public char[] getW02FnuKeyStbr() throws CFException{
     if (isW02FnuKeyStbrModified()) { 
        w02FnuKeyStbr = refreshW02FnuKeyStbr();
     }
   		return w02FnuKeyStbr;
   }

  
	/**
	*  set variable w02FnuKeyStbr
	*  Corresponding COBOL Variable is W02-FNU-KEY-STBR
	*  @param value
	**/
   public void setW02FnuKeyStbr(char[] value) {
      w02FnuKeyStbr = checkW02FnuKeyStbrConstraints(value);
      serializeW02FnuKeyStbr(w02FnuKeyStbr);
   } 

     /**
	 * 	Update W02FnuKeyStbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuKeyStbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuKeyStbr,w02FnuKeyStbr.length);
   	
   }
   
   public void setW02FnuKeyStbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuKeyStbr,w02FnuKeyStbr.length);
   	
   }
   
     /**
	 * 	Update W02FnuKeyStbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuKeyStbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuKeyStbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuKeyStbr with another Field
	 *	@param value
	 */
   public void setW02FnuKeyStbr(Field source) {
       replace(source,0,source.length(),beginW02FnuKeyStbr,W_02_FNU_KEY_STBR_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuKeyStbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuKeyStbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuKeyStbr,W_02_FNU_KEY_STBR_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuKeyStbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuKeyStbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuKeyStbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getW02FnuLineStartbrFieldLength() {
			return W_02_FNU_LINE_STARTBR_LENGTH;
		}

}
  
