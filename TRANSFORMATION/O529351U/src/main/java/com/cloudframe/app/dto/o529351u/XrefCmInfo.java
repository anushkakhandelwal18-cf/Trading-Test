package com.cloudframe.app.dto.o529351u;

/**
*  The class XrefCmInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class XrefCmInfo extends XrefCmInfoSerialized { 
   
				private XrfCmInfo xrfCmInfo = new XrfCmInfo();
	
	/**
	* Constructor for XrefCmInfo
	**/
    public XrefCmInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for XrefCmInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrefCmInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			xrfCmInfo.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of xrfCmInfo
	 *	@return xrfCmInfo
	 */   
	 public XrfCmInfo getXrfCmInfo() {
   	return xrfCmInfo;
   }
   /**
	* 	Update XrfCmInfo with the passed value
	*   Corresponding COBOL Variable is XRF-CM-INFO
	*	@param value
	*/
   public void setXrfCmInfo(char[] value) {
      xrfCmInfo.setString(value); 
   }   
    
     /**
	 * 	Update XrfCmInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXrfCmInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrfCmInfo.begin,xrfCmInfo.length());
   }
   
     /**
	 * 	Update XrfCmInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfCmInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrfCmInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XrfCmInfo with another Field
	 *	@param value
	 */
   public void setXrfCmInfo(Field source) {
   	replace(source,0,source.length(),xrfCmInfo.begin,xrfCmInfo.length());
   }  
   
     /**
	 * 	Update XrfCmInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXrfCmInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrfCmInfo.begin,xrfCmInfo.length());
   }
   
     /**
	 * 	Update XrfCmInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfCmInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrfCmInfo.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getXrefCmInfoFieldLength() {
			return XREF_CM_INFO_LENGTH;
		}

}
  
