package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uArrayData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uArrayData extends D51uArrayDataSerialized { 
   
				private D51uRetData d51uRetData = new D51uRetData();
				private D51uRetRulKeys d51uRetRulKeys = new D51uRetRulKeys();
				private D51uRetRulFrToSvc d51uRetRulFrToSvc = new D51uRetRulFrToSvc();
				private D51uRetRulProvTyp d51uRetRulProvTyp = new D51uRetRulProvTyp();
				private D51uRetRulIpa d51uRetRulIpa = new D51uRetRulIpa();
				private D51uRetRulCauseData d51uRetRulCauseData = new D51uRetRulCauseData();
				private D51uRetRulFrCondPos d51uRetRulFrCondPos = new D51uRetRulFrCondPos();
				private D51uRetRulIcd d51uRetRulIcd = new D51uRetRulIcd();
				private D51uRetRulCpeFlgData d51uRetRulCpeFlgData = new D51uRetRulCpeFlgData();
	
	/**
	* Constructor for D51uArrayData
	**/
    public D51uArrayData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uArrayData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uArrayData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			d51uRetData.setParent(this,getStartOffset() + 0);
	       			d51uRetRulKeys.setParent(this,getStartOffset() + 409959);
	       			d51uRetRulFrToSvc.setParent(this,getStartOffset() + 411642);
	       			d51uRetRulProvTyp.setParent(this,getStartOffset() + 631620);
	       			d51uRetRulIpa.setParent(this,getStartOffset() + 632709);
	       			d51uRetRulCauseData.setParent(this,getStartOffset() + 636372);
	       			d51uRetRulFrCondPos.setParent(this,getStartOffset() + 638055);
	       			d51uRetRulIcd.setParent(this,getStartOffset() + 639243);
	       			d51uRetRulCpeFlgData.setParent(this,getStartOffset() + 879219);
    } 

	/**
	 *	Returns the value of d51uRetData
	 *	@return d51uRetData
	 */   
	 public D51uRetData getD51uRetData() {
   	return d51uRetData;
   }
   /**
	* 	Update D51uRetData with the passed value
	*   Corresponding COBOL Variable is D51U-RET-DATA
	*	@param value
	*/
   public void setD51uRetData(char[] value) {
      d51uRetData.setString(value); 
   }   
    
     /**
	 * 	Update D51uRetData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRetData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetData.begin,d51uRetData.length());
   }
   
     /**
	 * 	Update D51uRetData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRetData with another Field
	 *	@param value
	 */
   public void setD51uRetData(Field source) {
   	replace(source,0,source.length(),d51uRetData.begin,d51uRetData.length());
   }  
   
     /**
	 * 	Update D51uRetData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRetData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetData.begin,d51uRetData.length());
   }
   
     /**
	 * 	Update D51uRetData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uRetRulKeys
	 *	@return d51uRetRulKeys
	 */   
	 public D51uRetRulKeys getD51uRetRulKeys() {
   	return d51uRetRulKeys;
   }
   /**
	* 	Update D51uRetRulKeys with the passed value
	*   Corresponding COBOL Variable is D51U-RET-RUL-KEYS
	*	@param value
	*/
   public void setD51uRetRulKeys(char[] value) {
      d51uRetRulKeys.setString(value); 
   }   
    
     /**
	 * 	Update D51uRetRulKeys 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulKeys(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulKeys.begin,d51uRetRulKeys.length());
   }
   
     /**
	 * 	Update D51uRetRulKeys 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulKeys(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulKeys.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRetRulKeys with another Field
	 *	@param value
	 */
   public void setD51uRetRulKeys(Field source) {
   	replace(source,0,source.length(),d51uRetRulKeys.begin,d51uRetRulKeys.length());
   }  
   
     /**
	 * 	Update D51uRetRulKeys 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulKeys(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulKeys.begin,d51uRetRulKeys.length());
   }
   
     /**
	 * 	Update D51uRetRulKeys 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulKeys(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulKeys.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uRetRulFrToSvc
	 *	@return d51uRetRulFrToSvc
	 */   
	 public D51uRetRulFrToSvc getD51uRetRulFrToSvc() {
   	return d51uRetRulFrToSvc;
   }
   /**
	* 	Update D51uRetRulFrToSvc with the passed value
	*   Corresponding COBOL Variable is D51U-RET-RUL-FR-TO-SVC
	*	@param value
	*/
   public void setD51uRetRulFrToSvc(char[] value) {
      d51uRetRulFrToSvc.setString(value); 
   }   
    
     /**
	 * 	Update D51uRetRulFrToSvc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulFrToSvc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulFrToSvc.begin,d51uRetRulFrToSvc.length());
   }
   
     /**
	 * 	Update D51uRetRulFrToSvc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulFrToSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulFrToSvc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRetRulFrToSvc with another Field
	 *	@param value
	 */
   public void setD51uRetRulFrToSvc(Field source) {
   	replace(source,0,source.length(),d51uRetRulFrToSvc.begin,d51uRetRulFrToSvc.length());
   }  
   
     /**
	 * 	Update D51uRetRulFrToSvc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulFrToSvc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulFrToSvc.begin,d51uRetRulFrToSvc.length());
   }
   
     /**
	 * 	Update D51uRetRulFrToSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulFrToSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulFrToSvc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uRetRulProvTyp
	 *	@return d51uRetRulProvTyp
	 */   
	 public D51uRetRulProvTyp getD51uRetRulProvTyp() {
   	return d51uRetRulProvTyp;
   }
   /**
	* 	Update D51uRetRulProvTyp with the passed value
	*   Corresponding COBOL Variable is D51U-RET-RUL-PROV-TYP
	*	@param value
	*/
   public void setD51uRetRulProvTyp(char[] value) {
      d51uRetRulProvTyp.setString(value); 
   }   
    
     /**
	 * 	Update D51uRetRulProvTyp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulProvTyp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulProvTyp.begin,d51uRetRulProvTyp.length());
   }
   
     /**
	 * 	Update D51uRetRulProvTyp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulProvTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulProvTyp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRetRulProvTyp with another Field
	 *	@param value
	 */
   public void setD51uRetRulProvTyp(Field source) {
   	replace(source,0,source.length(),d51uRetRulProvTyp.begin,d51uRetRulProvTyp.length());
   }  
   
     /**
	 * 	Update D51uRetRulProvTyp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulProvTyp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulProvTyp.begin,d51uRetRulProvTyp.length());
   }
   
     /**
	 * 	Update D51uRetRulProvTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulProvTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulProvTyp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uRetRulIpa
	 *	@return d51uRetRulIpa
	 */   
	 public D51uRetRulIpa getD51uRetRulIpa() {
   	return d51uRetRulIpa;
   }
   /**
	* 	Update D51uRetRulIpa with the passed value
	*   Corresponding COBOL Variable is D51U-RET-RUL-IPA
	*	@param value
	*/
   public void setD51uRetRulIpa(char[] value) {
      d51uRetRulIpa.setString(value); 
   }   
    
     /**
	 * 	Update D51uRetRulIpa 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulIpa(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulIpa.begin,d51uRetRulIpa.length());
   }
   
     /**
	 * 	Update D51uRetRulIpa 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulIpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulIpa.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRetRulIpa with another Field
	 *	@param value
	 */
   public void setD51uRetRulIpa(Field source) {
   	replace(source,0,source.length(),d51uRetRulIpa.begin,d51uRetRulIpa.length());
   }  
   
     /**
	 * 	Update D51uRetRulIpa 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulIpa(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulIpa.begin,d51uRetRulIpa.length());
   }
   
     /**
	 * 	Update D51uRetRulIpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulIpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulIpa.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uRetRulCauseData
	 *	@return d51uRetRulCauseData
	 */   
	 public D51uRetRulCauseData getD51uRetRulCauseData() {
   	return d51uRetRulCauseData;
   }
   /**
	* 	Update D51uRetRulCauseData with the passed value
	*   Corresponding COBOL Variable is D51U-RET-RUL-CAUSE-DATA
	*	@param value
	*/
   public void setD51uRetRulCauseData(char[] value) {
      d51uRetRulCauseData.setString(value); 
   }   
    
     /**
	 * 	Update D51uRetRulCauseData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulCauseData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulCauseData.begin,d51uRetRulCauseData.length());
   }
   
     /**
	 * 	Update D51uRetRulCauseData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulCauseData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulCauseData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRetRulCauseData with another Field
	 *	@param value
	 */
   public void setD51uRetRulCauseData(Field source) {
   	replace(source,0,source.length(),d51uRetRulCauseData.begin,d51uRetRulCauseData.length());
   }  
   
     /**
	 * 	Update D51uRetRulCauseData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulCauseData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulCauseData.begin,d51uRetRulCauseData.length());
   }
   
     /**
	 * 	Update D51uRetRulCauseData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulCauseData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulCauseData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uRetRulFrCondPos
	 *	@return d51uRetRulFrCondPos
	 */   
	 public D51uRetRulFrCondPos getD51uRetRulFrCondPos() {
   	return d51uRetRulFrCondPos;
   }
   /**
	* 	Update D51uRetRulFrCondPos with the passed value
	*   Corresponding COBOL Variable is D51U-RET-RUL-FR-COND-POS
	*	@param value
	*/
   public void setD51uRetRulFrCondPos(char[] value) {
      d51uRetRulFrCondPos.setString(value); 
   }   
    
     /**
	 * 	Update D51uRetRulFrCondPos 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulFrCondPos(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulFrCondPos.begin,d51uRetRulFrCondPos.length());
   }
   
     /**
	 * 	Update D51uRetRulFrCondPos 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulFrCondPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulFrCondPos.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRetRulFrCondPos with another Field
	 *	@param value
	 */
   public void setD51uRetRulFrCondPos(Field source) {
   	replace(source,0,source.length(),d51uRetRulFrCondPos.begin,d51uRetRulFrCondPos.length());
   }  
   
     /**
	 * 	Update D51uRetRulFrCondPos 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulFrCondPos(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulFrCondPos.begin,d51uRetRulFrCondPos.length());
   }
   
     /**
	 * 	Update D51uRetRulFrCondPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulFrCondPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulFrCondPos.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uRetRulIcd
	 *	@return d51uRetRulIcd
	 */   
	 public D51uRetRulIcd getD51uRetRulIcd() {
   	return d51uRetRulIcd;
   }
   /**
	* 	Update D51uRetRulIcd with the passed value
	*   Corresponding COBOL Variable is D51U-RET-RUL-ICD
	*	@param value
	*/
   public void setD51uRetRulIcd(char[] value) {
      d51uRetRulIcd.setString(value); 
   }   
    
     /**
	 * 	Update D51uRetRulIcd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulIcd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulIcd.begin,d51uRetRulIcd.length());
   }
   
     /**
	 * 	Update D51uRetRulIcd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulIcd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulIcd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRetRulIcd with another Field
	 *	@param value
	 */
   public void setD51uRetRulIcd(Field source) {
   	replace(source,0,source.length(),d51uRetRulIcd.begin,d51uRetRulIcd.length());
   }  
   
     /**
	 * 	Update D51uRetRulIcd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulIcd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulIcd.begin,d51uRetRulIcd.length());
   }
   
     /**
	 * 	Update D51uRetRulIcd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulIcd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulIcd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uRetRulCpeFlgData
	 *	@return d51uRetRulCpeFlgData
	 */   
	 public D51uRetRulCpeFlgData getD51uRetRulCpeFlgData() {
   	return d51uRetRulCpeFlgData;
   }
   /**
	* 	Update D51uRetRulCpeFlgData with the passed value
	*   Corresponding COBOL Variable is D51U-RET-RUL-CPE-FLG-DATA
	*	@param value
	*/
   public void setD51uRetRulCpeFlgData(char[] value) {
      d51uRetRulCpeFlgData.setString(value); 
   }   
    
     /**
	 * 	Update D51uRetRulCpeFlgData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulCpeFlgData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulCpeFlgData.begin,d51uRetRulCpeFlgData.length());
   }
   
     /**
	 * 	Update D51uRetRulCpeFlgData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulCpeFlgData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulCpeFlgData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRetRulCpeFlgData with another Field
	 *	@param value
	 */
   public void setD51uRetRulCpeFlgData(Field source) {
   	replace(source,0,source.length(),d51uRetRulCpeFlgData.begin,d51uRetRulCpeFlgData.length());
   }  
   
     /**
	 * 	Update D51uRetRulCpeFlgData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRulCpeFlgData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulCpeFlgData.begin,d51uRetRulCpeFlgData.length());
   }
   
     /**
	 * 	Update D51uRetRulCpeFlgData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRulCpeFlgData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRetRulCpeFlgData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getD51uArrayDataFieldLength() {
			return D_51U_ARRAY_DATA_LENGTH;
		}

}
  
