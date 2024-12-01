package com.cloudframe.app.dto.o529351u;

/**
*  The class PrevMatchedKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PrevMatchedKey extends PrevMatchedKeySerialized { 
   

						private char[] prevPs = new char[2];

						private char[] prevSvc = new char[6];

						private char[] prevCauseCd = new char[1];
	
	/**
	* Constructor for PrevMatchedKey
	**/
    public PrevMatchedKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PrevMatchedKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PrevMatchedKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPrevPs(fillSpace(2));
								setPrevSvc(fillSpace(6));
								setPrevCauseCd(fillSpace(1));
    } 

	/**
	 *	Returns the value of prevPs
	 *	@return prevPs
	 */
   public char[] getPrevPs() throws CFException{
     if (isPrevPsModified()) { 
        prevPs = refreshPrevPs();
     }
   		return prevPs;
   }

  
	/**
	*  set variable prevPs
	*  Corresponding COBOL Variable is WS-PREV-PS
	*  @param value
	**/
   public void setPrevPs(char[] value) {
      prevPs = checkPrevPsConstraints(value);
      serializePrevPs(prevPs);
   } 

     /**
	 * 	Update PrevPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrevPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrevPs,prevPs.length);
   	
   }
   
   public void setPrevPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrevPs,prevPs.length);
   	
   }
   
     /**
	 * 	Update PrevPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrevPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrevPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrevPs with another Field
	 *	@param value
	 */
   public void setPrevPs(Field source) {
       replace(source,0,source.length(),beginPrevPs,PREV_PS_LEN);
   	
   }  
   
     /**
	 * 	Update PrevPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrevPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrevPs,PREV_PS_LEN);
   	
   }
   
     /**
	 * 	Update PrevPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrevPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrevPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prevSvc
	 *	@return prevSvc
	 */
   public char[] getPrevSvc() throws CFException{
     if (isPrevSvcModified()) { 
        prevSvc = refreshPrevSvc();
     }
   		return prevSvc;
   }

  
	/**
	*  set variable prevSvc
	*  Corresponding COBOL Variable is WS-PREV-SVC
	*  @param value
	**/
   public void setPrevSvc(char[] value) {
      prevSvc = checkPrevSvcConstraints(value);
      serializePrevSvc(prevSvc);
   } 

     /**
	 * 	Update PrevSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrevSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrevSvc,prevSvc.length);
   	
   }
   
   public void setPrevSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrevSvc,prevSvc.length);
   	
   }
   
     /**
	 * 	Update PrevSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrevSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrevSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrevSvc with another Field
	 *	@param value
	 */
   public void setPrevSvc(Field source) {
       replace(source,0,source.length(),beginPrevSvc,PREV_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update PrevSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrevSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrevSvc,PREV_SVC_LEN);
   	
   }
   
     /**
	 * 	Update PrevSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrevSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrevSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prevCauseCd
	 *	@return prevCauseCd
	 */
   public char[] getPrevCauseCd() throws CFException{
     if (isPrevCauseCdModified()) { 
        prevCauseCd = refreshPrevCauseCd();
     }
   		return prevCauseCd;
   }

  
	/**
	*  set variable prevCauseCd
	*  Corresponding COBOL Variable is WS-PREV-CAUSE-CD
	*  @param value
	**/
   public void setPrevCauseCd(char[] value) {
      prevCauseCd = checkPrevCauseCdConstraints(value);
      serializePrevCauseCd(prevCauseCd);
   } 

     /**
	 * 	Update PrevCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrevCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrevCauseCd,prevCauseCd.length);
   	
   }
   
   public void setPrevCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrevCauseCd,prevCauseCd.length);
   	
   }
   
     /**
	 * 	Update PrevCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrevCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrevCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrevCauseCd with another Field
	 *	@param value
	 */
   public void setPrevCauseCd(Field source) {
       replace(source,0,source.length(),beginPrevCauseCd,PREV_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update PrevCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrevCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrevCauseCd,PREV_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update PrevCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrevCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrevCauseCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPrevMatchedKeyFieldLength() {
			return PREV_MATCHED_KEY_LENGTH;
		}

}
  
