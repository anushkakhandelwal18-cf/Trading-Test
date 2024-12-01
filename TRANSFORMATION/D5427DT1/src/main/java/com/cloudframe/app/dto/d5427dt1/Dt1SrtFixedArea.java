package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1SrtFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1SrtFixedArea extends Dt1SrtFixedAreaSerialized { 
   

								private int dt1SrtItemCnt;
	
	/**
	* Constructor for Dt1SrtFixedArea
	**/
    public Dt1SrtFixedArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1SrtFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dt1SrtItemCnt
	 *	@return dt1SrtItemCnt
	 */
	public int getDt1SrtItemCnt() throws CFException {
       if (isDt1SrtItemCntModified()) { 
           dt1SrtItemCnt = refreshDt1SrtItemCnt();
        }
   		return dt1SrtItemCnt;
	}
	

	
	   
	/**
	 * 	Update Dt1SrtItemCnt with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-ITEM-CNT
	 *	@param number
	 */
	public void setDt1SrtItemCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1SrtItemCnt = checkDt1SrtItemCntMaxLimit(number); 
		serializeDt1SrtItemCnt(dt1SrtItemCnt);
	}
	

	public void setDt1SrtItemCnt(long number) {
	    number = checkDt1SrtItemCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1SrtItemCnt((int)number);
	}
	
	/**
	 * 	Update Dt1SrtItemCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1SrtItemCnt(char[] value) throws CFException {
		 dt1SrtItemCnt = serializeDt1SrtItemCnt(value);
	}
	/**
	 * 	Update Dt1SrtItemCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1SrtItemCntString(char[] value) throws CFException {
		 setDt1SrtItemCnt(value);
	}

	
	
	
	/**
	 * 	initializes Dt1SrtFixedArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1SrtItemCnt(0);
   }

		public static int getDt1SrtFixedAreaFieldLength() {
			return DT_1_SRT_FIXED_AREA_LENGTH;
		}

}
  
