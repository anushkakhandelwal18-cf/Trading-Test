package com.cloudframe.app.trdpb007.dto;

/**
*  The class Csq4biimMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-21 at 09:21. using version 5.0.0.153
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Csq4biimMsg extends Csq4biimMsgSerialized { 
   

						private char[] csq4biimMsgid = Field.fillLowValue(8);
				private Csq4biimGroup csq4biimGroup = new Csq4biimGroup();
	
	/**
	* Constructor for Csq4biimMsg
	**/
    public Csq4biimMsg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Csq4biimMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Csq4biimMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			csq4biimGroup.setParent(this,getStartOffset() + 8);
    } 

	/**
	 *	Returns the value of csq4biimMsgid
	 *	@return csq4biimMsgid
	 */
   public char[] getCsq4biimMsgid() throws CFException{
     if (isCsq4biimMsgidModified()) { 
        csq4biimMsgid = refreshCsq4biimMsgid();
     }
   		return csq4biimMsgid;
   }

  
	/**
	*  set variable csq4biimMsgid
	*  Corresponding COBOL Variable is CSQ4BIIM-MSGID
	*  @param value
	**/
   public void setCsq4biimMsgid(char[] value) {
      csq4biimMsgid = checkCsq4biimMsgidConstraints(value);
      serializeCsq4biimMsgid(csq4biimMsgid);
   } 

     /**
	 * 	Update Csq4biimMsgid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimMsgid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsq4biimMsgid,csq4biimMsgid.length);
   	
   }
   
   public void setCsq4biimMsgid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimMsgid,csq4biimMsgid.length);
   	
   }
   
     /**
	 * 	Update Csq4biimMsgid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimMsgid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimMsgid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Csq4biimMsgid with another Field
	 *	@param value
	 */
   public void setCsq4biimMsgid(Field source) {
       replace(source,0,source.length(),beginCsq4biimMsgid,CSQ_4BIIM_MSGID_LEN);
   	
   }  
   
     /**
	 * 	Update Csq4biimMsgid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsq4biimMsgid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsq4biimMsgid,CSQ_4BIIM_MSGID_LEN);
   	
   }
   
     /**
	 * 	Update Csq4biimMsgid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimMsgid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimMsgid+targetIndex,targetLen);
    
   }
	char[] initialInquiryMessage88Value = "CSQ4BIIM".toCharArray();
	/**
	 *	Test condition "CSQ4BIIM" for isInitialInquiryMessage()
	 *	@return  Returns true if isInitialInquiryMessage() is "CSQ4BIIM"
	 */
   public boolean isInitialInquiryMessage() throws CFException {
      return (  compareChars( getCsq4biimMsgid() , initialInquiryMessage88Value)  == 0  );
   }


	/**
	*  set values "CSQ4BIIM"
	*/
   	public void setInitialInquiryMessageTrue() {  			
    	setCsq4biimMsgid( initialInquiryMessage88Value);
   	}
	/**
	 *	Returns the value of csq4biimGroup
	 *	@return csq4biimGroup
	 */   
	 public Csq4biimGroup getCsq4biimGroup() {
   	return csq4biimGroup;
   }
   /**
	* 	Update Csq4biimGroup with the passed value
	*   Corresponding COBOL Variable is CSQ4BIIM-GROUP
	*	@param value
	*/
   public void setCsq4biimGroup(char[] value) {
      csq4biimGroup.setString(value); 
   }   
    
     /**
	 * 	Update Csq4biimGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,csq4biimGroup.begin,csq4biimGroup.length());
   }
   
     /**
	 * 	Update Csq4biimGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,csq4biimGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Csq4biimGroup with another Field
	 *	@param value
	 */
   public void setCsq4biimGroup(Field source) {
   	replace(source,0,source.length(),csq4biimGroup.begin,csq4biimGroup.length());
   }  
   
     /**
	 * 	Update Csq4biimGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,csq4biimGroup.begin,csq4biimGroup.length());
   }
   
     /**
	 * 	Update Csq4biimGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,csq4biimGroup.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCsq4biimMsgFieldLength() {
			return CSQ_4BIIM_MSG_LENGTH;
		}

}
  
