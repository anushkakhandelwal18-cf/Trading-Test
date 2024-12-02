package com.cloudframe.app.trdpb007.dto;

/**
*  The class W03Csq4biim is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:21. using version 5.0.0.161
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class W03Csq4biim extends W03Csq4biimSerialized { 
   
				private Csq4biimMsg csq4biimMsg = new Csq4biimMsg();
	
	/**
	* Constructor for W03Csq4biim
	**/
    public W03Csq4biim() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for W03Csq4biim. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public W03Csq4biim(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			csq4biimMsg.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of csq4biimMsg
	 *	@return csq4biimMsg
	 */   
	 public Csq4biimMsg getCsq4biimMsg() {
   	return csq4biimMsg;
   }
   /**
	* 	Update Csq4biimMsg with the passed value
	*   Corresponding COBOL Variable is CSQ4BIIM-MSG
	*	@param value
	*/
   public void setCsq4biimMsg(char[] value) {
      csq4biimMsg.setString(value); 
   }   
    
     /**
	 * 	Update Csq4biimMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimMsg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,csq4biimMsg.begin,csq4biimMsg.length());
   }
   
     /**
	 * 	Update Csq4biimMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,csq4biimMsg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Csq4biimMsg with another Field
	 *	@param value
	 */
   public void setCsq4biimMsg(Field source) {
   	replace(source,0,source.length(),csq4biimMsg.begin,csq4biimMsg.length());
   }  
   
     /**
	 * 	Update Csq4biimMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimMsg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,csq4biimMsg.begin,csq4biimMsg.length());
   }
   
     /**
	 * 	Update Csq4biimMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,csq4biimMsg.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getW03Csq4biimFieldLength() {
			return W_03_CSQ_4BIIM_LENGTH;
		}

}
  
