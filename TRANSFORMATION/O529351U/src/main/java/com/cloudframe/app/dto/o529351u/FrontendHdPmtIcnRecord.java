package com.cloudframe.app.dto.o529351u;

/**
*  The class FrontendHdPmtIcnRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FrontendHdPmtIcnRecord extends FrontendHdPmtIcnRecordSerialized { 
   
				private HdVariableDetailData hdVariableDetailData = new HdVariableDetailData();
	
	/**
	* Constructor for FrontendHdPmtIcnRecord
	**/
    public FrontendHdPmtIcnRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			hdVariableDetailData.setParent(this,getStartOffset() + 31);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of hdVariableDetailData
	 *	@return hdVariableDetailData
	 */   
	 public HdVariableDetailData getHdVariableDetailData() {
   	return hdVariableDetailData;
   }
   /**
	* 	Update HdVariableDetailData with the passed value
	*   Corresponding COBOL Variable is HD-VARIABLE-DETAIL-DATA
	*	@param value
	*/
   public void setHdVariableDetailData(char[] value) {
      hdVariableDetailData.setString(value); 
   }   
    
     /**
	 * 	Update HdVariableDetailData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHdVariableDetailData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hdVariableDetailData.begin,hdVariableDetailData.length());
   }
   
     /**
	 * 	Update HdVariableDetailData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHdVariableDetailData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hdVariableDetailData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HdVariableDetailData with another Field
	 *	@param value
	 */
   public void setHdVariableDetailData(Field source) {
   	replace(source,0,source.length(),hdVariableDetailData.begin,hdVariableDetailData.length());
   }  
   
     /**
	 * 	Update HdVariableDetailData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHdVariableDetailData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hdVariableDetailData.begin,hdVariableDetailData.length());
   }
   
     /**
	 * 	Update HdVariableDetailData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHdVariableDetailData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hdVariableDetailData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getFrontendHdPmtIcnRecordFieldLength() {
			return FRONTEND_HD_PMT_ICN_RECORD_LENGTH;
		}

}
  
