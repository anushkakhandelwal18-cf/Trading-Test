package com.cloudframe.app.dto.o529351u;

/**
*  The class W02FnuLineRead is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class W02FnuLineRead extends W02FnuLineReadSerialized { 
   

						private char[] w02FnuTranRd = new char[4];


						private char[] w02FnuFileRd = Field.fillLowValue(8);


						private char[] w02FnuKeyRd = Field.fillLowValue(38);
	
	/**
	* Constructor for W02FnuLineRead
	**/
    public W02FnuLineRead() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setW02FnuTranRd(("BTMQ").toCharArray());
       replaceValue( // serialize and save the value
             (":READ FAILED IN ").toCharArray()
             , getStartOffset() + 4
             ,16
             );
       replaceValue( // serialize and save the value
             (",KEY= ").toCharArray()
             , getStartOffset() + 28
             ,6
             );
    }


 

	/**
	 *	Returns the value of w02FnuTranRd
	 *	@return w02FnuTranRd
	 */
   public char[] getW02FnuTranRd() throws CFException{
     if (isW02FnuTranRdModified()) { 
        w02FnuTranRd = refreshW02FnuTranRd();
     }
   		return w02FnuTranRd;
   }

  
	/**
	*  set variable w02FnuTranRd
	*  Corresponding COBOL Variable is W02-FNU-TRAN-RD
	*  @param value
	**/
   public void setW02FnuTranRd(char[] value) {
      w02FnuTranRd = checkW02FnuTranRdConstraints(value);
      serializeW02FnuTranRd(w02FnuTranRd);
   } 

     /**
	 * 	Update W02FnuTranRd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuTranRd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuTranRd,w02FnuTranRd.length);
   	
   }
   
   public void setW02FnuTranRd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuTranRd,w02FnuTranRd.length);
   	
   }
   
     /**
	 * 	Update W02FnuTranRd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuTranRd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuTranRd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuTranRd with another Field
	 *	@param value
	 */
   public void setW02FnuTranRd(Field source) {
       replace(source,0,source.length(),beginW02FnuTranRd,W_02_FNU_TRAN_RD_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuTranRd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuTranRd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuTranRd,W_02_FNU_TRAN_RD_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuTranRd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuTranRd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuTranRd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02FnuFileRd
	 *	@return w02FnuFileRd
	 */
   public char[] getW02FnuFileRd() throws CFException{
     if (isW02FnuFileRdModified()) { 
        w02FnuFileRd = refreshW02FnuFileRd();
     }
   		return w02FnuFileRd;
   }

  
	/**
	*  set variable w02FnuFileRd
	*  Corresponding COBOL Variable is W02-FNU-FILE-RD
	*  @param value
	**/
   public void setW02FnuFileRd(char[] value) {
      w02FnuFileRd = checkW02FnuFileRdConstraints(value);
      serializeW02FnuFileRd(w02FnuFileRd);
   } 

     /**
	 * 	Update W02FnuFileRd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuFileRd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuFileRd,w02FnuFileRd.length);
   	
   }
   
   public void setW02FnuFileRd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuFileRd,w02FnuFileRd.length);
   	
   }
   
     /**
	 * 	Update W02FnuFileRd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuFileRd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuFileRd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuFileRd with another Field
	 *	@param value
	 */
   public void setW02FnuFileRd(Field source) {
       replace(source,0,source.length(),beginW02FnuFileRd,W_02_FNU_FILE_RD_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuFileRd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuFileRd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuFileRd,W_02_FNU_FILE_RD_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuFileRd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuFileRd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuFileRd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02FnuKeyRd
	 *	@return w02FnuKeyRd
	 */
   public char[] getW02FnuKeyRd() throws CFException{
     if (isW02FnuKeyRdModified()) { 
        w02FnuKeyRd = refreshW02FnuKeyRd();
     }
   		return w02FnuKeyRd;
   }

  
	/**
	*  set variable w02FnuKeyRd
	*  Corresponding COBOL Variable is W02-FNU-KEY-RD
	*  @param value
	**/
   public void setW02FnuKeyRd(char[] value) {
      w02FnuKeyRd = checkW02FnuKeyRdConstraints(value);
      serializeW02FnuKeyRd(w02FnuKeyRd);
   } 

     /**
	 * 	Update W02FnuKeyRd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuKeyRd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuKeyRd,w02FnuKeyRd.length);
   	
   }
   
   public void setW02FnuKeyRd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuKeyRd,w02FnuKeyRd.length);
   	
   }
   
     /**
	 * 	Update W02FnuKeyRd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuKeyRd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuKeyRd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuKeyRd with another Field
	 *	@param value
	 */
   public void setW02FnuKeyRd(Field source) {
       replace(source,0,source.length(),beginW02FnuKeyRd,W_02_FNU_KEY_RD_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuKeyRd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuKeyRd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuKeyRd,W_02_FNU_KEY_RD_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuKeyRd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuKeyRd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuKeyRd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getW02FnuLineReadFieldLength() {
			return W_02_FNU_LINE_READ_LENGTH;
		}

}
  
