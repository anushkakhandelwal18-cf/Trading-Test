package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uTableCounts is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uTableCounts extends D51uTableCountsSerialized { 
   

								private int d51uPlnvCnt;

								private int d51uSpiCnt;

								private int d51uFrtoCnt;

								private int d51uPtypCnt;

								private int d51uIpaCnt;

								private int d51uCausCnt;

								private int d51uFcndCnt;

								private int d51uIcdCnt;

								private int d51uMoreIcdCnt;

								private int d51uCflgCnt;
	
	/**
	* Constructor for D51uTableCounts
	**/
    public D51uTableCounts() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uTableCounts. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uTableCounts(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uPlnvCnt
	 *	@return d51uPlnvCnt
	 */
	public int getD51uPlnvCnt() throws CFException {
        if (isD51uPlnvCntModified()) { 
           d51uPlnvCnt = refreshD51uPlnvCnt();
        }
   		return d51uPlnvCnt;
	}
	
	/**
	 * 	Update D51uPlnvCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-PLNV-CNT
	 *	@param number
	 */
	public void setD51uPlnvCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uPlnvCnt = checkD51uPlnvCntMaxLimit(number); 
		serializeD51uPlnvCnt(d51uPlnvCnt);
	}


	public void setD51uPlnvCnt(long number) {
	    number = checkD51uPlnvCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uPlnvCnt((int)number);
	}
	
	/**
	 *	Returns the value of d51uSpiCnt
	 *	@return d51uSpiCnt
	 */
	public int getD51uSpiCnt() throws CFException {
        if (isD51uSpiCntModified()) { 
           d51uSpiCnt = refreshD51uSpiCnt();
        }
   		return d51uSpiCnt;
	}
	
	/**
	 * 	Update D51uSpiCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-SPI-CNT
	 *	@param number
	 */
	public void setD51uSpiCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uSpiCnt = checkD51uSpiCntMaxLimit(number); 
		serializeD51uSpiCnt(d51uSpiCnt);
	}


	public void setD51uSpiCnt(long number) {
	    number = checkD51uSpiCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uSpiCnt((int)number);
	}
	
	/**
	 *	Returns the value of d51uFrtoCnt
	 *	@return d51uFrtoCnt
	 */
	public int getD51uFrtoCnt() throws CFException {
        if (isD51uFrtoCntModified()) { 
           d51uFrtoCnt = refreshD51uFrtoCnt();
        }
   		return d51uFrtoCnt;
	}
	
	/**
	 * 	Update D51uFrtoCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-FRTO-CNT
	 *	@param number
	 */
	public void setD51uFrtoCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uFrtoCnt = checkD51uFrtoCntMaxLimit(number); 
		serializeD51uFrtoCnt(d51uFrtoCnt);
	}


	public void setD51uFrtoCnt(long number) {
	    number = checkD51uFrtoCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uFrtoCnt((int)number);
	}
	
	/**
	 *	Returns the value of d51uPtypCnt
	 *	@return d51uPtypCnt
	 */
	public int getD51uPtypCnt() throws CFException {
        if (isD51uPtypCntModified()) { 
           d51uPtypCnt = refreshD51uPtypCnt();
        }
   		return d51uPtypCnt;
	}
	
	/**
	 * 	Update D51uPtypCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-PTYP-CNT
	 *	@param number
	 */
	public void setD51uPtypCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uPtypCnt = checkD51uPtypCntMaxLimit(number); 
		serializeD51uPtypCnt(d51uPtypCnt);
	}


	public void setD51uPtypCnt(long number) {
	    number = checkD51uPtypCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uPtypCnt((int)number);
	}
	
	/**
	 *	Returns the value of d51uIpaCnt
	 *	@return d51uIpaCnt
	 */
	public int getD51uIpaCnt() throws CFException {
        if (isD51uIpaCntModified()) { 
           d51uIpaCnt = refreshD51uIpaCnt();
        }
   		return d51uIpaCnt;
	}
	
	/**
	 * 	Update D51uIpaCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-IPA-CNT
	 *	@param number
	 */
	public void setD51uIpaCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uIpaCnt = checkD51uIpaCntMaxLimit(number); 
		serializeD51uIpaCnt(d51uIpaCnt);
	}


	public void setD51uIpaCnt(long number) {
	    number = checkD51uIpaCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uIpaCnt((int)number);
	}
	
	/**
	 *	Returns the value of d51uCausCnt
	 *	@return d51uCausCnt
	 */
	public int getD51uCausCnt() throws CFException {
        if (isD51uCausCntModified()) { 
           d51uCausCnt = refreshD51uCausCnt();
        }
   		return d51uCausCnt;
	}
	
	/**
	 * 	Update D51uCausCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-CAUS-CNT
	 *	@param number
	 */
	public void setD51uCausCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uCausCnt = checkD51uCausCntMaxLimit(number); 
		serializeD51uCausCnt(d51uCausCnt);
	}


	public void setD51uCausCnt(long number) {
	    number = checkD51uCausCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uCausCnt((int)number);
	}
	
	/**
	 *	Returns the value of d51uFcndCnt
	 *	@return d51uFcndCnt
	 */
	public int getD51uFcndCnt() throws CFException {
        if (isD51uFcndCntModified()) { 
           d51uFcndCnt = refreshD51uFcndCnt();
        }
   		return d51uFcndCnt;
	}
	
	/**
	 * 	Update D51uFcndCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-FCND-CNT
	 *	@param number
	 */
	public void setD51uFcndCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uFcndCnt = checkD51uFcndCntMaxLimit(number); 
		serializeD51uFcndCnt(d51uFcndCnt);
	}


	public void setD51uFcndCnt(long number) {
	    number = checkD51uFcndCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uFcndCnt((int)number);
	}
	
	/**
	 *	Returns the value of d51uIcdCnt
	 *	@return d51uIcdCnt
	 */
	public int getD51uIcdCnt() throws CFException {
        if (isD51uIcdCntModified()) { 
           d51uIcdCnt = refreshD51uIcdCnt();
        }
   		return d51uIcdCnt;
	}
	
	/**
	 * 	Update D51uIcdCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-ICD-CNT
	 *	@param number
	 */
	public void setD51uIcdCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uIcdCnt = checkD51uIcdCntMaxLimit(number); 
		serializeD51uIcdCnt(d51uIcdCnt);
	}


	public void setD51uIcdCnt(long number) {
	    number = checkD51uIcdCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uIcdCnt((int)number);
	}
	
	/**
	 *	Returns the value of d51uMoreIcdCnt
	 *	@return d51uMoreIcdCnt
	 */
	public int getD51uMoreIcdCnt() throws CFException {
        if (isD51uMoreIcdCntModified()) { 
           d51uMoreIcdCnt = refreshD51uMoreIcdCnt();
        }
   		return d51uMoreIcdCnt;
	}
	
	/**
	 * 	Update D51uMoreIcdCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-MORE-ICD-CNT
	 *	@param number
	 */
	public void setD51uMoreIcdCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uMoreIcdCnt = checkD51uMoreIcdCntMaxLimit(number); 
		serializeD51uMoreIcdCnt(d51uMoreIcdCnt);
	}


	public void setD51uMoreIcdCnt(long number) {
	    number = checkD51uMoreIcdCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uMoreIcdCnt((int)number);
	}
	
	/**
	 *	Returns the value of d51uCflgCnt
	 *	@return d51uCflgCnt
	 */
	public int getD51uCflgCnt() throws CFException {
        if (isD51uCflgCntModified()) { 
           d51uCflgCnt = refreshD51uCflgCnt();
        }
   		return d51uCflgCnt;
	}
	
	/**
	 * 	Update D51uCflgCnt with the passed value
	 *  Corresponding COBOL Variable is D51U-CFLG-CNT
	 *	@param number
	 */
	public void setD51uCflgCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    d51uCflgCnt = checkD51uCflgCntMaxLimit(number); 
		serializeD51uCflgCnt(d51uCflgCnt);
	}


	public void setD51uCflgCnt(long number) {
	    number = checkD51uCflgCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uCflgCnt((int)number);
	}
	

	
	
	

		public static int getD51uTableCountsFieldLength() {
			return D_51U_TABLE_COUNTS_LENGTH;
		}

}
  
