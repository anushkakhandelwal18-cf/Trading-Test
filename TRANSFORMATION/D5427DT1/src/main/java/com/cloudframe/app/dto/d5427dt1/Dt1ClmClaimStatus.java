package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1ClmClaimStatus is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Dt1ClmClaimStatus extends Dt1ClmClaimStatusSerialized { 
   

						private char[] dt1ClmUnprocFlag = Field.fillLowValue(1);

						private char[] dt1ClmClosedFlag = Field.fillLowValue(1);

						private char[] dt1ClmPendedFlag = Field.fillLowValue(1);

						private char[] dt1ClmRejectedFlag = Field.fillLowValue(1);

						private char[] dt1ClmPaidFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for Dt1ClmClaimStatus
	**/
    public Dt1ClmClaimStatus() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1ClmClaimStatus. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmClaimStatus(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dt1ClmUnprocFlag
	 *	@return dt1ClmUnprocFlag
	 */
   public char[] getDt1ClmUnprocFlag() throws CFException{
     if (isDt1ClmUnprocFlagModified()) { 
        dt1ClmUnprocFlag = refreshDt1ClmUnprocFlag();
     }
   		return dt1ClmUnprocFlag;
   }

  
	/**
	*  set variable dt1ClmUnprocFlag
	*  Corresponding COBOL Variable is DT1-CLM-UNPROC-FLAG
	*  @param value
	**/
   public void setDt1ClmUnprocFlag(char[] value) {
      dt1ClmUnprocFlag = checkDt1ClmUnprocFlagConstraints(value);
      serializeDt1ClmUnprocFlag(dt1ClmUnprocFlag);
   } 

     /**
	 * 	Update Dt1ClmUnprocFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmUnprocFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmUnprocFlag,dt1ClmUnprocFlag.length);
   	
   }
   
   public void setDt1ClmUnprocFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmUnprocFlag,dt1ClmUnprocFlag.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmUnprocFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmUnprocFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmUnprocFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmUnprocFlag with another Field
	 *	@param value
	 */
   public void setDt1ClmUnprocFlag(Field source) {
       replace(source,0,source.length(),beginDt1ClmUnprocFlag,DT_1_CLM_UNPROC_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmUnprocFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmUnprocFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmUnprocFlag,DT_1_CLM_UNPROC_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmUnprocFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmUnprocFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmUnprocFlag+targetIndex,targetLen);
    
   }
	char[] dt1ClmUnprocessed88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDt1ClmUnprocessed()
	 *	@return  Returns true if isDt1ClmUnprocessed() is "Y"
	 */
   public boolean isDt1ClmUnprocessed() throws CFException {
      return (  compareChars( getDt1ClmUnprocFlag() , dt1ClmUnprocessed88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDt1ClmUnprocessedTrue() {  			
    	setDt1ClmUnprocFlag( dt1ClmUnprocessed88Value);
   	}
	/**
	 *	Returns the value of dt1ClmClosedFlag
	 *	@return dt1ClmClosedFlag
	 */
   public char[] getDt1ClmClosedFlag() throws CFException{
     if (isDt1ClmClosedFlagModified()) { 
        dt1ClmClosedFlag = refreshDt1ClmClosedFlag();
     }
   		return dt1ClmClosedFlag;
   }

  
	/**
	*  set variable dt1ClmClosedFlag
	*  Corresponding COBOL Variable is DT1-CLM-CLOSED-FLAG
	*  @param value
	**/
   public void setDt1ClmClosedFlag(char[] value) {
      dt1ClmClosedFlag = checkDt1ClmClosedFlagConstraints(value);
      serializeDt1ClmClosedFlag(dt1ClmClosedFlag);
   } 

     /**
	 * 	Update Dt1ClmClosedFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmClosedFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmClosedFlag,dt1ClmClosedFlag.length);
   	
   }
   
   public void setDt1ClmClosedFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmClosedFlag,dt1ClmClosedFlag.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmClosedFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmClosedFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmClosedFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmClosedFlag with another Field
	 *	@param value
	 */
   public void setDt1ClmClosedFlag(Field source) {
       replace(source,0,source.length(),beginDt1ClmClosedFlag,DT_1_CLM_CLOSED_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmClosedFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmClosedFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmClosedFlag,DT_1_CLM_CLOSED_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmClosedFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmClosedFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmClosedFlag+targetIndex,targetLen);
    
   }
	char[] dt1ClmClosed88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDt1ClmClosed()
	 *	@return  Returns true if isDt1ClmClosed() is "Y"
	 */
   public boolean isDt1ClmClosed() throws CFException {
      return (  compareChars( getDt1ClmClosedFlag() , dt1ClmClosed88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDt1ClmClosedTrue() {  			
    	setDt1ClmClosedFlag( dt1ClmClosed88Value);
   	}
	/**
	 *	Returns the value of dt1ClmPendedFlag
	 *	@return dt1ClmPendedFlag
	 */
   public char[] getDt1ClmPendedFlag() throws CFException{
     if (isDt1ClmPendedFlagModified()) { 
        dt1ClmPendedFlag = refreshDt1ClmPendedFlag();
     }
   		return dt1ClmPendedFlag;
   }

  
	/**
	*  set variable dt1ClmPendedFlag
	*  Corresponding COBOL Variable is DT1-CLM-PENDED-FLAG
	*  @param value
	**/
   public void setDt1ClmPendedFlag(char[] value) {
      dt1ClmPendedFlag = checkDt1ClmPendedFlagConstraints(value);
      serializeDt1ClmPendedFlag(dt1ClmPendedFlag);
   } 

     /**
	 * 	Update Dt1ClmPendedFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmPendedFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmPendedFlag,dt1ClmPendedFlag.length);
   	
   }
   
   public void setDt1ClmPendedFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPendedFlag,dt1ClmPendedFlag.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmPendedFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPendedFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPendedFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmPendedFlag with another Field
	 *	@param value
	 */
   public void setDt1ClmPendedFlag(Field source) {
       replace(source,0,source.length(),beginDt1ClmPendedFlag,DT_1_CLM_PENDED_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmPendedFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmPendedFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmPendedFlag,DT_1_CLM_PENDED_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmPendedFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPendedFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPendedFlag+targetIndex,targetLen);
    
   }
	char[] dt1ClmPended88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDt1ClmPended()
	 *	@return  Returns true if isDt1ClmPended() is "Y"
	 */
   public boolean isDt1ClmPended() throws CFException {
      return (  compareChars( getDt1ClmPendedFlag() , dt1ClmPended88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDt1ClmPendedTrue() {  			
    	setDt1ClmPendedFlag( dt1ClmPended88Value);
   	}
	/**
	 *	Returns the value of dt1ClmRejectedFlag
	 *	@return dt1ClmRejectedFlag
	 */
   public char[] getDt1ClmRejectedFlag() throws CFException{
     if (isDt1ClmRejectedFlagModified()) { 
        dt1ClmRejectedFlag = refreshDt1ClmRejectedFlag();
     }
   		return dt1ClmRejectedFlag;
   }

  
	/**
	*  set variable dt1ClmRejectedFlag
	*  Corresponding COBOL Variable is DT1-CLM-REJECTED-FLAG
	*  @param value
	**/
   public void setDt1ClmRejectedFlag(char[] value) {
      dt1ClmRejectedFlag = checkDt1ClmRejectedFlagConstraints(value);
      serializeDt1ClmRejectedFlag(dt1ClmRejectedFlag);
   } 

     /**
	 * 	Update Dt1ClmRejectedFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmRejectedFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmRejectedFlag,dt1ClmRejectedFlag.length);
   	
   }
   
   public void setDt1ClmRejectedFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmRejectedFlag,dt1ClmRejectedFlag.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmRejectedFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmRejectedFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmRejectedFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmRejectedFlag with another Field
	 *	@param value
	 */
   public void setDt1ClmRejectedFlag(Field source) {
       replace(source,0,source.length(),beginDt1ClmRejectedFlag,DT_1_CLM_REJECTED_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmRejectedFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmRejectedFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmRejectedFlag,DT_1_CLM_REJECTED_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmRejectedFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmRejectedFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmRejectedFlag+targetIndex,targetLen);
    
   }
	char[] dt1ClmRejected88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDt1ClmRejected()
	 *	@return  Returns true if isDt1ClmRejected() is "Y"
	 */
   public boolean isDt1ClmRejected() throws CFException {
      return (  compareChars( getDt1ClmRejectedFlag() , dt1ClmRejected88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDt1ClmRejectedTrue() {  			
    	setDt1ClmRejectedFlag( dt1ClmRejected88Value);
   	}
	/**
	 *	Returns the value of dt1ClmPaidFlag
	 *	@return dt1ClmPaidFlag
	 */
   public char[] getDt1ClmPaidFlag() throws CFException{
     if (isDt1ClmPaidFlagModified()) { 
        dt1ClmPaidFlag = refreshDt1ClmPaidFlag();
     }
   		return dt1ClmPaidFlag;
   }

  
	/**
	*  set variable dt1ClmPaidFlag
	*  Corresponding COBOL Variable is DT1-CLM-PAID-FLAG
	*  @param value
	**/
   public void setDt1ClmPaidFlag(char[] value) {
      dt1ClmPaidFlag = checkDt1ClmPaidFlagConstraints(value);
      serializeDt1ClmPaidFlag(dt1ClmPaidFlag);
   } 

     /**
	 * 	Update Dt1ClmPaidFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmPaidFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmPaidFlag,dt1ClmPaidFlag.length);
   	
   }
   
   public void setDt1ClmPaidFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPaidFlag,dt1ClmPaidFlag.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmPaidFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPaidFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPaidFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmPaidFlag with another Field
	 *	@param value
	 */
   public void setDt1ClmPaidFlag(Field source) {
       replace(source,0,source.length(),beginDt1ClmPaidFlag,DT_1_CLM_PAID_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmPaidFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmPaidFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmPaidFlag,DT_1_CLM_PAID_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmPaidFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPaidFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPaidFlag+targetIndex,targetLen);
    
   }
	char[] dt1ClmPaid88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDt1ClmPaid()
	 *	@return  Returns true if isDt1ClmPaid() is "Y"
	 */
   public boolean isDt1ClmPaid() throws CFException {
      return (  compareChars( getDt1ClmPaidFlag() , dt1ClmPaid88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDt1ClmPaidTrue() {  			
    	setDt1ClmPaidFlag( dt1ClmPaid88Value);
   	}

	
	
	
	/**
	 * 	initializes Dt1ClmClaimStatus
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDt1ClmUnprocFlag(CONSTANTS.SPACE);
         setDt1ClmClosedFlag(CONSTANTS.SPACE);
         setDt1ClmPendedFlag(CONSTANTS.SPACE);
         setDt1ClmRejectedFlag(CONSTANTS.SPACE);
         setDt1ClmPaidFlag(CONSTANTS.SPACE);
   }

		public static int getDt1ClmClaimStatusFieldLength() {
			return DT_1_CLM_CLAIM_STATUS_LENGTH;
		}

}
  
