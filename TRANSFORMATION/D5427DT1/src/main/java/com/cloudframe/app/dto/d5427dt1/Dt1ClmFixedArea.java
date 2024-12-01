package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1ClmFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1ClmFixedArea extends Dt1ClmFixedAreaSerialized { 
   

								private long dt1ClmClmContainerItemCnt;

								private long dt1ClmClmContainerItemLen;
	
	/**
	* Constructor for Dt1ClmFixedArea
	**/
    public Dt1ClmFixedArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1ClmFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dt1ClmClmContainerItemCnt
	 *	@return dt1ClmClmContainerItemCnt
	 */
	public long getDt1ClmClmContainerItemCnt() throws CFException {
       if (isDt1ClmClmContainerItemCntModified()) { 
           dt1ClmClmContainerItemCnt = refreshDt1ClmClmContainerItemCnt();
        }
   		return dt1ClmClmContainerItemCnt;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmClmContainerItemCnt with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-CLM-CONTAINER-ITEM-CNT
	 *	@param number
	 */
	public void setDt1ClmClmContainerItemCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmClmContainerItemCnt = checkDt1ClmClmContainerItemCntMaxLimit(number); 
		serializeDt1ClmClmContainerItemCnt(dt1ClmClmContainerItemCnt);
	}
	

	/**
	 * 	Update Dt1ClmClmContainerItemCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmClmContainerItemCnt(char[] value) throws CFException {
		 dt1ClmClmContainerItemCnt = serializeDt1ClmClmContainerItemCnt(value);
	}
	/**
	 * 	Update Dt1ClmClmContainerItemCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmClmContainerItemCntString(char[] value) throws CFException {
		 setDt1ClmClmContainerItemCnt(value);
	}
	/**
	 *	Returns the value of dt1ClmClmContainerItemLen
	 *	@return dt1ClmClmContainerItemLen
	 */
	public long getDt1ClmClmContainerItemLen() throws CFException {
       if (isDt1ClmClmContainerItemLenModified()) { 
           dt1ClmClmContainerItemLen = refreshDt1ClmClmContainerItemLen();
        }
   		return dt1ClmClmContainerItemLen;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmClmContainerItemLen with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-CLM-CONTAINER-ITEM-LEN
	 *	@param number
	 */
	public void setDt1ClmClmContainerItemLen(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmClmContainerItemLen = checkDt1ClmClmContainerItemLenMaxLimit(number); 
		serializeDt1ClmClmContainerItemLen(dt1ClmClmContainerItemLen);
	}
	

	/**
	 * 	Update Dt1ClmClmContainerItemLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmClmContainerItemLen(char[] value) throws CFException {
		 dt1ClmClmContainerItemLen = serializeDt1ClmClmContainerItemLen(value);
	}
	/**
	 * 	Update Dt1ClmClmContainerItemLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmClmContainerItemLenString(char[] value) throws CFException {
		 setDt1ClmClmContainerItemLen(value);
	}

	
	
	
	/**
	 * 	initializes Dt1ClmFixedArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1ClmClmContainerItemCnt(0);
                     setDt1ClmClmContainerItemLen(0);
   }

		public static int getDt1ClmFixedAreaFieldLength() {
			return DT_1_CLM_FIXED_AREA_LENGTH;
		}

}
  
