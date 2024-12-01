package com.cloudframe.app.dto.o529351u;

/**
*  The class ServAlphal is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ServAlphal extends ServAlphalSerialized { 
   

						private char[] svc14al = Field.fillLowValue(4);

						private char[] svc5al = Field.fillLowValue(1);
	
	/**
	* Constructor for ServAlphal
	**/
    public ServAlphal() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ServAlphal. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServAlphal(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of svc14al
	 *	@return svc14al
	 */
   public char[] getSvc14al() throws CFException{
     if (isSvc14alModified()) { 
        svc14al = refreshSvc14al();
     }
   		return svc14al;
   }

  
	/**
	*  set variable svc14al
	*  Corresponding COBOL Variable is SVC-1-4AL
	*  @param value
	**/
   public void setSvc14al(char[] value) {
      svc14al = checkSvc14alConstraints(value);
      serializeSvc14al(svc14al);
   } 

     /**
	 * 	Update Svc14al 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvc14al(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvc14al,svc14al.length);
   	
   }
   
   public void setSvc14al(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvc14al,svc14al.length);
   	
   }
   
     /**
	 * 	Update Svc14al 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvc14al(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc14al+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Svc14al with another Field
	 *	@param value
	 */
   public void setSvc14al(Field source) {
       replace(source,0,source.length(),beginSvc14al,SVC_14AL_LEN);
   	
   }  
   
     /**
	 * 	Update Svc14al 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvc14al(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvc14al,SVC_14AL_LEN);
   	
   }
   
     /**
	 * 	Update Svc14al 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvc14al(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc14al+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of svc5al
	 *	@return svc5al
	 */
   public char[] getSvc5al() throws CFException{
     if (isSvc5alModified()) { 
        svc5al = refreshSvc5al();
     }
   		return svc5al;
   }

  
	/**
	*  set variable svc5al
	*  Corresponding COBOL Variable is SVC-5AL
	*  @param value
	**/
   public void setSvc5al(char[] value) {
      svc5al = checkSvc5alConstraints(value);
      serializeSvc5al(svc5al);
   } 

     /**
	 * 	Update Svc5al 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvc5al(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvc5al,svc5al.length);
   	
   }
   
   public void setSvc5al(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvc5al,svc5al.length);
   	
   }
   
     /**
	 * 	Update Svc5al 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvc5al(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc5al+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Svc5al with another Field
	 *	@param value
	 */
   public void setSvc5al(Field source) {
       replace(source,0,source.length(),beginSvc5al,SVC_5AL_LEN);
   	
   }  
   
     /**
	 * 	Update Svc5al 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvc5al(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvc5al,SVC_5AL_LEN);
   	
   }
   
     /**
	 * 	Update Svc5al 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvc5al(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc5al+targetIndex,targetLen);
    
   }

	
	
	

		public static int getServAlphalFieldLength() {
			return SERV_ALPHAL_LENGTH;
		}

}
  
