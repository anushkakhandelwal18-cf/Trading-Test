package com.cloudframe.app.dto.o529351u;

/**
*  The class W02FnuLineReadnext is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class W02FnuLineReadnext extends W02FnuLineReadnextSerialized { 
   

						private char[] w02FnuTranRdnxt = new char[4];


						private char[] w02FnuFileRdnxt = Field.fillLowValue(8);


						private char[] w02FnuKeyRdnxt = Field.fillLowValue(38);
	
	/**
	* Constructor for W02FnuLineReadnext
	**/
    public W02FnuLineReadnext() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setW02FnuTranRdnxt(("BTMQ").toCharArray());
       replaceValue( // serialize and save the value
             (":RDNXT FAILED IN ").toCharArray()
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
	 *	Returns the value of w02FnuTranRdnxt
	 *	@return w02FnuTranRdnxt
	 */
   public char[] getW02FnuTranRdnxt() throws CFException{
     if (isW02FnuTranRdnxtModified()) { 
        w02FnuTranRdnxt = refreshW02FnuTranRdnxt();
     }
   		return w02FnuTranRdnxt;
   }

  
	/**
	*  set variable w02FnuTranRdnxt
	*  Corresponding COBOL Variable is W02-FNU-TRAN-RDNXT
	*  @param value
	**/
   public void setW02FnuTranRdnxt(char[] value) {
      w02FnuTranRdnxt = checkW02FnuTranRdnxtConstraints(value);
      serializeW02FnuTranRdnxt(w02FnuTranRdnxt);
   } 

     /**
	 * 	Update W02FnuTranRdnxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuTranRdnxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuTranRdnxt,w02FnuTranRdnxt.length);
   	
   }
   
   public void setW02FnuTranRdnxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuTranRdnxt,w02FnuTranRdnxt.length);
   	
   }
   
     /**
	 * 	Update W02FnuTranRdnxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuTranRdnxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuTranRdnxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuTranRdnxt with another Field
	 *	@param value
	 */
   public void setW02FnuTranRdnxt(Field source) {
       replace(source,0,source.length(),beginW02FnuTranRdnxt,W_02_FNU_TRAN_RDNXT_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuTranRdnxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuTranRdnxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuTranRdnxt,W_02_FNU_TRAN_RDNXT_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuTranRdnxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuTranRdnxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuTranRdnxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02FnuFileRdnxt
	 *	@return w02FnuFileRdnxt
	 */
   public char[] getW02FnuFileRdnxt() throws CFException{
     if (isW02FnuFileRdnxtModified()) { 
        w02FnuFileRdnxt = refreshW02FnuFileRdnxt();
     }
   		return w02FnuFileRdnxt;
   }

  
	/**
	*  set variable w02FnuFileRdnxt
	*  Corresponding COBOL Variable is W02-FNU-FILE-RDNXT
	*  @param value
	**/
   public void setW02FnuFileRdnxt(char[] value) {
      w02FnuFileRdnxt = checkW02FnuFileRdnxtConstraints(value);
      serializeW02FnuFileRdnxt(w02FnuFileRdnxt);
   } 

     /**
	 * 	Update W02FnuFileRdnxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuFileRdnxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuFileRdnxt,w02FnuFileRdnxt.length);
   	
   }
   
   public void setW02FnuFileRdnxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuFileRdnxt,w02FnuFileRdnxt.length);
   	
   }
   
     /**
	 * 	Update W02FnuFileRdnxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuFileRdnxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuFileRdnxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuFileRdnxt with another Field
	 *	@param value
	 */
   public void setW02FnuFileRdnxt(Field source) {
       replace(source,0,source.length(),beginW02FnuFileRdnxt,W_02_FNU_FILE_RDNXT_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuFileRdnxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuFileRdnxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuFileRdnxt,W_02_FNU_FILE_RDNXT_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuFileRdnxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuFileRdnxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuFileRdnxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02FnuKeyRdnxt
	 *	@return w02FnuKeyRdnxt
	 */
   public char[] getW02FnuKeyRdnxt() throws CFException{
     if (isW02FnuKeyRdnxtModified()) { 
        w02FnuKeyRdnxt = refreshW02FnuKeyRdnxt();
     }
   		return w02FnuKeyRdnxt;
   }

  
	/**
	*  set variable w02FnuKeyRdnxt
	*  Corresponding COBOL Variable is W02-FNU-KEY-RDNXT
	*  @param value
	**/
   public void setW02FnuKeyRdnxt(char[] value) {
      w02FnuKeyRdnxt = checkW02FnuKeyRdnxtConstraints(value);
      serializeW02FnuKeyRdnxt(w02FnuKeyRdnxt);
   } 

     /**
	 * 	Update W02FnuKeyRdnxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuKeyRdnxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuKeyRdnxt,w02FnuKeyRdnxt.length);
   	
   }
   
   public void setW02FnuKeyRdnxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuKeyRdnxt,w02FnuKeyRdnxt.length);
   	
   }
   
     /**
	 * 	Update W02FnuKeyRdnxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuKeyRdnxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuKeyRdnxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuKeyRdnxt with another Field
	 *	@param value
	 */
   public void setW02FnuKeyRdnxt(Field source) {
       replace(source,0,source.length(),beginW02FnuKeyRdnxt,W_02_FNU_KEY_RDNXT_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuKeyRdnxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuKeyRdnxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuKeyRdnxt,W_02_FNU_KEY_RDNXT_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuKeyRdnxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuKeyRdnxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuKeyRdnxt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getW02FnuLineReadnextFieldLength() {
			return W_02_FNU_LINE_READNEXT_LENGTH;
		}

}
  
