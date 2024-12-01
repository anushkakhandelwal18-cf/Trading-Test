package com.cloudframe.app.dto.o529351u;

/**
*  The class HdVariableDetailData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdVariableDetailData extends HdVariableDetailDataSerialized { 
   
				private HdPmtiProvX hdPmtiProvX = new HdPmtiProvX();

								private long hdPmtiTin;
	
	/**
	* Constructor for HdVariableDetailData
	**/
    public HdVariableDetailData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HdVariableDetailData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HdVariableDetailData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			hdPmtiProvX.setParent(this,getStartOffset() + 28);
    } 

	/**
	 *	Returns the value of hdPmtiProvX
	 *	@return hdPmtiProvX
	 */   
	 public HdPmtiProvX getHdPmtiProvX() {
   	return hdPmtiProvX;
   }
   /**
	* 	Update HdPmtiProvX with the passed value
	*   Corresponding COBOL Variable is HD-PMTI-PROV-X
	*	@param value
	*/
   public void setHdPmtiProvX(char[] value) {
      hdPmtiProvX.setString(value); 
   }   
    
     /**
	 * 	Update HdPmtiProvX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHdPmtiProvX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hdPmtiProvX.begin,hdPmtiProvX.length());
   }
   
     /**
	 * 	Update HdPmtiProvX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHdPmtiProvX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hdPmtiProvX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HdPmtiProvX with another Field
	 *	@param value
	 */
   public void setHdPmtiProvX(Field source) {
   	replace(source,0,source.length(),hdPmtiProvX.begin,hdPmtiProvX.length());
   }  
   
     /**
	 * 	Update HdPmtiProvX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHdPmtiProvX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hdPmtiProvX.begin,hdPmtiProvX.length());
   }
   
     /**
	 * 	Update HdPmtiProvX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHdPmtiProvX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hdPmtiProvX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hdPmtiTin
	 *	@return hdPmtiTin
	 */
	public long getHdPmtiTin() throws CFException {
       if (isHdPmtiTinModified()) { 
           hdPmtiTin = refreshHdPmtiTin();
        }
   		return hdPmtiTin;
	}
	

	
	   
	/**
	 * 	Update HdPmtiTin with the passed value
	 *  Corresponding COBOL Variable is HD-PMTI-TIN
	 *	@param number
	 */
	public void setHdPmtiTin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    hdPmtiTin = checkHdPmtiTinMaxLimit(number); 
		serializeHdPmtiTin(hdPmtiTin);
	}
	

	/**
	 * 	Update HdPmtiTin with the passed value
	 *	@param value (String or char[])
	 */
	public void setHdPmtiTin(char[] value) throws CFException {
		 hdPmtiTin = serializeHdPmtiTin(value);
	}
	/**
	 * 	Update HdPmtiTin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHdPmtiTinString(char[] value) throws CFException {
		 setHdPmtiTin(value);
	}

	
	
	

		public static int getHdVariableDetailDataFieldLength() {
			return HD_VARIABLE_DETAIL_DATA_LENGTH;
		}

}
  
