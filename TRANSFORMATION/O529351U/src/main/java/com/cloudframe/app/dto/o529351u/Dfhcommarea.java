package com.cloudframe.app.dto.o529351u;

/**
*  The class Dfhcommarea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea extends DfhcommareaSerialized { 
   
				private XrefRecord xrefRecord = new XrefRecord();
				private XrefCmInfo xrefCmInfo = new XrefCmInfo();
				private LinkAreaM51u linkAreaM51u = new LinkAreaM51u();
				private PpaPpoaltRecord ppaPpoaltRecord = new PpaPpoaltRecord();
	
	/**
	* Constructor for Dfhcommarea
	**/
    public Dfhcommarea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			xrefRecord.setParent(this,getStartOffset() + 0);
	       			xrefCmInfo.setParent(this,getStartOffset() + 2340);
	       			linkAreaM51u.setParent(this,getStartOffset() + 2592);
	       			ppaPpoaltRecord.setParent(this,getStartOffset() + 11961);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of xrefRecord
	 *	@return xrefRecord
	 */   
	 public XrefRecord getXrefRecord() {
   	return xrefRecord;
   }
   /**
	* 	Update XrefRecord with the passed value
	*   Corresponding COBOL Variable is XREF-RECORD
	*	@param value
	*/
   public void setXrefRecord(char[] value) {
      xrefRecord.setString(value); 
   }   
    
     /**
	 * 	Update XrefRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXrefRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrefRecord.begin,xrefRecord.length());
   }
   
     /**
	 * 	Update XrefRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrefRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrefRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XrefRecord with another Field
	 *	@param value
	 */
   public void setXrefRecord(Field source) {
   	replace(source,0,source.length(),xrefRecord.begin,xrefRecord.length());
   }  
   
     /**
	 * 	Update XrefRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXrefRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrefRecord.begin,xrefRecord.length());
   }
   
     /**
	 * 	Update XrefRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrefRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrefRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of xrefCmInfo
	 *	@return xrefCmInfo
	 */   
	 public XrefCmInfo getXrefCmInfo() {
   	return xrefCmInfo;
   }
   /**
	* 	Update XrefCmInfo with the passed value
	*   Corresponding COBOL Variable is XREF-CM-INFO
	*	@param value
	*/
   public void setXrefCmInfo(char[] value) {
      xrefCmInfo.setString(value); 
   }   
    
     /**
	 * 	Update XrefCmInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXrefCmInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrefCmInfo.begin,xrefCmInfo.length());
   }
   
     /**
	 * 	Update XrefCmInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrefCmInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrefCmInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XrefCmInfo with another Field
	 *	@param value
	 */
   public void setXrefCmInfo(Field source) {
   	replace(source,0,source.length(),xrefCmInfo.begin,xrefCmInfo.length());
   }  
   
     /**
	 * 	Update XrefCmInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXrefCmInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrefCmInfo.begin,xrefCmInfo.length());
   }
   
     /**
	 * 	Update XrefCmInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrefCmInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrefCmInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of linkAreaM51u
	 *	@return linkAreaM51u
	 */   
	 public LinkAreaM51u getLinkAreaM51u() {
   	return linkAreaM51u;
   }
   /**
	* 	Update LinkAreaM51u with the passed value
	*   Corresponding COBOL Variable is LINK-AREA-M51U
	*	@param value
	*/
   public void setLinkAreaM51u(char[] value) {
      linkAreaM51u.setString(value); 
   }   
    
     /**
	 * 	Update LinkAreaM51u 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLinkAreaM51u(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,linkAreaM51u.begin,linkAreaM51u.length());
   }
   
     /**
	 * 	Update LinkAreaM51u 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLinkAreaM51u(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,linkAreaM51u.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update LinkAreaM51u with another Field
	 *	@param value
	 */
   public void setLinkAreaM51u(Field source) {
   	replace(source,0,source.length(),linkAreaM51u.begin,linkAreaM51u.length());
   }  
   
     /**
	 * 	Update LinkAreaM51u 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLinkAreaM51u(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,linkAreaM51u.begin,linkAreaM51u.length());
   }
   
     /**
	 * 	Update LinkAreaM51u 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLinkAreaM51u(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,linkAreaM51u.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ppaPpoaltRecord
	 *	@return ppaPpoaltRecord
	 */   
	 public PpaPpoaltRecord getPpaPpoaltRecord() {
   	return ppaPpoaltRecord;
   }
   /**
	* 	Update PpaPpoaltRecord with the passed value
	*   Corresponding COBOL Variable is PPA-PPOALT-RECORD
	*	@param value
	*/
   public void setPpaPpoaltRecord(char[] value) {
      ppaPpoaltRecord.setString(value); 
   }   
    
     /**
	 * 	Update PpaPpoaltRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPpaPpoaltRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ppaPpoaltRecord.begin,ppaPpoaltRecord.length());
   }
   
     /**
	 * 	Update PpaPpoaltRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPpaPpoaltRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ppaPpoaltRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PpaPpoaltRecord with another Field
	 *	@param value
	 */
   public void setPpaPpoaltRecord(Field source) {
   	replace(source,0,source.length(),ppaPpoaltRecord.begin,ppaPpoaltRecord.length());
   }  
   
     /**
	 * 	Update PpaPpoaltRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPpaPpoaltRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ppaPpoaltRecord.begin,ppaPpoaltRecord.length());
   }
   
     /**
	 * 	Update PpaPpoaltRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPpaPpoaltRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ppaPpoaltRecord.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDfhcommareaFieldLength() {
			return DFHCOMMAREA_LENGTH;
		}

}
  
