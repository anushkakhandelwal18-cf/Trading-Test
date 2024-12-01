package com.cloudframe.app.dto.o529351u;

/**
*  The class DsmRecDetailsArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DsmRecDetailsArea extends DsmRecDetailsAreaSerialized { 
   

						private char[] dsmRecIcn = Field.fillLowValue(10);

						private char[] dsmRecIcnSufxCd = Field.fillLowValue(2);

								private int dsmRecVersNbr;

						private char[] dsmRecProcDate = Field.fillLowValue(10);

						private char[] dsmRecProcTime = Field.fillLowValue(8);
	
	/**
	* Constructor for DsmRecDetailsArea
	**/
    public DsmRecDetailsArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DsmRecDetailsArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmRecDetailsArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dsmRecIcn
	 *	@return dsmRecIcn
	 */
   public char[] getDsmRecIcn() throws CFException{
     if (isDsmRecIcnModified()) { 
        dsmRecIcn = refreshDsmRecIcn();
     }
   		return dsmRecIcn;
   }

  
	/**
	*  set variable dsmRecIcn
	*  Corresponding COBOL Variable is DSM-REC-ICN
	*  @param value
	**/
   public void setDsmRecIcn(char[] value) {
      dsmRecIcn = checkDsmRecIcnConstraints(value);
      serializeDsmRecIcn(dsmRecIcn);
   } 

     /**
	 * 	Update DsmRecIcn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmRecIcn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmRecIcn,dsmRecIcn.length);
   	
   }
   
   public void setDsmRecIcn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecIcn,dsmRecIcn.length);
   	
   }
   
     /**
	 * 	Update DsmRecIcn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmRecIcn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecIcn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmRecIcn with another Field
	 *	@param value
	 */
   public void setDsmRecIcn(Field source) {
       replace(source,0,source.length(),beginDsmRecIcn,DSM_REC_ICN_LEN);
   	
   }  
   
     /**
	 * 	Update DsmRecIcn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmRecIcn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmRecIcn,DSM_REC_ICN_LEN);
   	
   }
   
     /**
	 * 	Update DsmRecIcn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmRecIcn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecIcn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dsmRecIcnSufxCd
	 *	@return dsmRecIcnSufxCd
	 */
   public char[] getDsmRecIcnSufxCd() throws CFException{
     if (isDsmRecIcnSufxCdModified()) { 
        dsmRecIcnSufxCd = refreshDsmRecIcnSufxCd();
     }
   		return dsmRecIcnSufxCd;
   }

  
	/**
	*  set variable dsmRecIcnSufxCd
	*  Corresponding COBOL Variable is DSM-REC-ICN-SUFX-CD
	*  @param value
	**/
   public void setDsmRecIcnSufxCd(char[] value) {
      dsmRecIcnSufxCd = checkDsmRecIcnSufxCdConstraints(value);
      serializeDsmRecIcnSufxCd(dsmRecIcnSufxCd);
   } 

     /**
	 * 	Update DsmRecIcnSufxCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmRecIcnSufxCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmRecIcnSufxCd,dsmRecIcnSufxCd.length);
   	
   }
   
   public void setDsmRecIcnSufxCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecIcnSufxCd,dsmRecIcnSufxCd.length);
   	
   }
   
     /**
	 * 	Update DsmRecIcnSufxCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmRecIcnSufxCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecIcnSufxCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmRecIcnSufxCd with another Field
	 *	@param value
	 */
   public void setDsmRecIcnSufxCd(Field source) {
       replace(source,0,source.length(),beginDsmRecIcnSufxCd,DSM_REC_ICN_SUFX_CD_LEN);
   	
   }  
   
     /**
	 * 	Update DsmRecIcnSufxCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmRecIcnSufxCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmRecIcnSufxCd,DSM_REC_ICN_SUFX_CD_LEN);
   	
   }
   
     /**
	 * 	Update DsmRecIcnSufxCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmRecIcnSufxCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecIcnSufxCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dsmRecVersNbr
	 *	@return dsmRecVersNbr
	 */
	public int getDsmRecVersNbr() throws CFException {
       if (isDsmRecVersNbrModified()) { 
           dsmRecVersNbr = refreshDsmRecVersNbr();
        }
   		return dsmRecVersNbr;
	}
	

	
	   
	/**
	 * 	Update DsmRecVersNbr with the passed value
	 *  Corresponding COBOL Variable is DSM-REC-VERS-NBR
	 *	@param number
	 */
	public void setDsmRecVersNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dsmRecVersNbr = checkDsmRecVersNbrMaxLimit(number); 
		serializeDsmRecVersNbr(dsmRecVersNbr);
	}
	

	public void setDsmRecVersNbr(long number) {
	    number = checkDsmRecVersNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDsmRecVersNbr((int)number);
	}
	
	/**
	 * 	Update DsmRecVersNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setDsmRecVersNbr(char[] value) throws CFException {
		 dsmRecVersNbr = serializeDsmRecVersNbr(value);
	}
	/**
	 * 	Update DsmRecVersNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDsmRecVersNbrString(char[] value) throws CFException {
		 setDsmRecVersNbr(value);
	}
	/**
	 *	Returns the value of dsmRecProcDate
	 *	@return dsmRecProcDate
	 */
   public char[] getDsmRecProcDate() throws CFException{
     if (isDsmRecProcDateModified()) { 
        dsmRecProcDate = refreshDsmRecProcDate();
     }
   		return dsmRecProcDate;
   }

  
	/**
	*  set variable dsmRecProcDate
	*  Corresponding COBOL Variable is DSM-REC-PROC-DATE
	*  @param value
	**/
   public void setDsmRecProcDate(char[] value) {
      dsmRecProcDate = checkDsmRecProcDateConstraints(value);
      serializeDsmRecProcDate(dsmRecProcDate);
   } 

     /**
	 * 	Update DsmRecProcDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmRecProcDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmRecProcDate,dsmRecProcDate.length);
   	
   }
   
   public void setDsmRecProcDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecProcDate,dsmRecProcDate.length);
   	
   }
   
     /**
	 * 	Update DsmRecProcDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmRecProcDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecProcDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmRecProcDate with another Field
	 *	@param value
	 */
   public void setDsmRecProcDate(Field source) {
       replace(source,0,source.length(),beginDsmRecProcDate,DSM_REC_PROC_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update DsmRecProcDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmRecProcDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmRecProcDate,DSM_REC_PROC_DATE_LEN);
   	
   }
   
     /**
	 * 	Update DsmRecProcDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmRecProcDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecProcDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dsmRecProcTime
	 *	@return dsmRecProcTime
	 */
   public char[] getDsmRecProcTime() throws CFException{
     if (isDsmRecProcTimeModified()) { 
        dsmRecProcTime = refreshDsmRecProcTime();
     }
   		return dsmRecProcTime;
   }

  
	/**
	*  set variable dsmRecProcTime
	*  Corresponding COBOL Variable is DSM-REC-PROC-TIME
	*  @param value
	**/
   public void setDsmRecProcTime(char[] value) {
      dsmRecProcTime = checkDsmRecProcTimeConstraints(value);
      serializeDsmRecProcTime(dsmRecProcTime);
   } 

     /**
	 * 	Update DsmRecProcTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmRecProcTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmRecProcTime,dsmRecProcTime.length);
   	
   }
   
   public void setDsmRecProcTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecProcTime,dsmRecProcTime.length);
   	
   }
   
     /**
	 * 	Update DsmRecProcTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmRecProcTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecProcTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmRecProcTime with another Field
	 *	@param value
	 */
   public void setDsmRecProcTime(Field source) {
       replace(source,0,source.length(),beginDsmRecProcTime,DSM_REC_PROC_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update DsmRecProcTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmRecProcTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmRecProcTime,DSM_REC_PROC_TIME_LEN);
   	
   }
   
     /**
	 * 	Update DsmRecProcTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmRecProcTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmRecProcTime+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DsmRecDetailsArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDsmRecIcn(CONSTANTS.SPACE_10);
         setDsmRecIcnSufxCd(CONSTANTS.SPACE_2);
                     setDsmRecVersNbr(0);
         setDsmRecProcDate(CONSTANTS.SPACE_10);
         setDsmRecProcTime(CONSTANTS.SPACE_8);
   }

		public static int getDsmRecDetailsAreaFieldLength() {
			return DSM_REC_DETAILS_AREA_LENGTH;
		}

}
  
