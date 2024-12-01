package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uReturnData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uReturnData extends D51uReturnDataSerialized { 
   

						private char[] d51uRetFeSpi = Field.fillLowValue(7);

						private char[] d51uRetPolicy = Field.fillLowValue(6);

								private int d51uRetPlan;

						private char[] d51uRetEffDt = Field.fillLowValue(10);

						private char[] d51uRetCanDt = Field.fillLowValue(10);

						private char[] d51uRetStatus = Field.fillLowValue(1);

						private char[] d51uRetPosTierCd = Field.fillLowValue(1);

						private char[] d51uRetPriDiagInd = Field.fillLowValue(1);

						private char[] d51uRetDiagElgInd = Field.fillLowValue(1);
	
	/**
	* Constructor for D51uReturnData
	**/
    public D51uReturnData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uReturnData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uReturnData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uRetFeSpi
	 *	@return d51uRetFeSpi
	 */
   public char[] getD51uRetFeSpi() throws CFException{
     if (isD51uRetFeSpiModified()) { 
        d51uRetFeSpi = refreshD51uRetFeSpi();
     }
   		return d51uRetFeSpi;
   }

  
	/**
	*  set variable d51uRetFeSpi
	*  Corresponding COBOL Variable is D51U-RET-FE-SPI
	*  @param value
	**/
   public void setD51uRetFeSpi(char[] value) {
      d51uRetFeSpi = checkD51uRetFeSpiConstraints(value);
      serializeD51uRetFeSpi(d51uRetFeSpi);
   } 

     /**
	 * 	Update D51uRetFeSpi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetFeSpi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetFeSpi,d51uRetFeSpi.length);
   	
   }
   
   public void setD51uRetFeSpi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetFeSpi,d51uRetFeSpi.length);
   	
   }
   
     /**
	 * 	Update D51uRetFeSpi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetFeSpi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetFeSpi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetFeSpi with another Field
	 *	@param value
	 */
   public void setD51uRetFeSpi(Field source) {
       replace(source,0,source.length(),beginD51uRetFeSpi,D_51U_RET_FE_SPI_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetFeSpi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetFeSpi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetFeSpi,D_51U_RET_FE_SPI_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetFeSpi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetFeSpi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetFeSpi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetPolicy
	 *	@return d51uRetPolicy
	 */
   public char[] getD51uRetPolicy() throws CFException{
     if (isD51uRetPolicyModified()) { 
        d51uRetPolicy = refreshD51uRetPolicy();
     }
   		return d51uRetPolicy;
   }

  
	/**
	*  set variable d51uRetPolicy
	*  Corresponding COBOL Variable is D51U-RET-POLICY
	*  @param value
	**/
   public void setD51uRetPolicy(char[] value) {
      d51uRetPolicy = checkD51uRetPolicyConstraints(value);
      serializeD51uRetPolicy(d51uRetPolicy);
   } 

     /**
	 * 	Update D51uRetPolicy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetPolicy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetPolicy,d51uRetPolicy.length);
   	
   }
   
   public void setD51uRetPolicy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetPolicy,d51uRetPolicy.length);
   	
   }
   
     /**
	 * 	Update D51uRetPolicy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetPolicy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetPolicy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetPolicy with another Field
	 *	@param value
	 */
   public void setD51uRetPolicy(Field source) {
       replace(source,0,source.length(),beginD51uRetPolicy,D_51U_RET_POLICY_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetPolicy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetPolicy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetPolicy,D_51U_RET_POLICY_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetPolicy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetPolicy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetPolicy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetPlan
	 *	@return d51uRetPlan
	 */
	public int getD51uRetPlan() throws CFException {
       if (isD51uRetPlanModified()) { 
           d51uRetPlan = refreshD51uRetPlan();
        }
   		return d51uRetPlan;
	}
	

	
	   
	/**
	 * 	Update D51uRetPlan with the passed value
	 *  Corresponding COBOL Variable is D51U-RET-PLAN
	 *	@param number
	 */
	public void setD51uRetPlan(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    d51uRetPlan = checkD51uRetPlanMaxLimit(number); 
		serializeD51uRetPlan(d51uRetPlan);
	}
	

	public void setD51uRetPlan(long number) {
	    number = checkD51uRetPlanMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uRetPlan((int)number);
	}
	
	/**
	 * 	Update D51uRetPlan with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51uRetPlan(char[] value) throws CFException {
		 d51uRetPlan = serializeD51uRetPlan(value);
	}
	/**
	 * 	Update D51uRetPlan with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setD51uRetPlanString(char[] value) throws CFException {
		 setD51uRetPlan(value);
	}
	/**
	 *	Returns the value of d51uRetEffDt
	 *	@return d51uRetEffDt
	 */
   public char[] getD51uRetEffDt() throws CFException{
     if (isD51uRetEffDtModified()) { 
        d51uRetEffDt = refreshD51uRetEffDt();
     }
   		return d51uRetEffDt;
   }

  
	/**
	*  set variable d51uRetEffDt
	*  Corresponding COBOL Variable is D51U-RET-EFF-DT
	*  @param value
	**/
   public void setD51uRetEffDt(char[] value) {
      d51uRetEffDt = checkD51uRetEffDtConstraints(value);
      serializeD51uRetEffDt(d51uRetEffDt);
   } 

     /**
	 * 	Update D51uRetEffDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetEffDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetEffDt,d51uRetEffDt.length);
   	
   }
   
   public void setD51uRetEffDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetEffDt,d51uRetEffDt.length);
   	
   }
   
     /**
	 * 	Update D51uRetEffDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetEffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetEffDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetEffDt with another Field
	 *	@param value
	 */
   public void setD51uRetEffDt(Field source) {
       replace(source,0,source.length(),beginD51uRetEffDt,D_51U_RET_EFF_DT_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetEffDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetEffDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetEffDt,D_51U_RET_EFF_DT_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetEffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetEffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetEffDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetCanDt
	 *	@return d51uRetCanDt
	 */
   public char[] getD51uRetCanDt() throws CFException{
     if (isD51uRetCanDtModified()) { 
        d51uRetCanDt = refreshD51uRetCanDt();
     }
   		return d51uRetCanDt;
   }

  
	/**
	*  set variable d51uRetCanDt
	*  Corresponding COBOL Variable is D51U-RET-CAN-DT
	*  @param value
	**/
   public void setD51uRetCanDt(char[] value) {
      d51uRetCanDt = checkD51uRetCanDtConstraints(value);
      serializeD51uRetCanDt(d51uRetCanDt);
   } 

     /**
	 * 	Update D51uRetCanDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetCanDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetCanDt,d51uRetCanDt.length);
   	
   }
   
   public void setD51uRetCanDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetCanDt,d51uRetCanDt.length);
   	
   }
   
     /**
	 * 	Update D51uRetCanDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetCanDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetCanDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetCanDt with another Field
	 *	@param value
	 */
   public void setD51uRetCanDt(Field source) {
       replace(source,0,source.length(),beginD51uRetCanDt,D_51U_RET_CAN_DT_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetCanDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetCanDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetCanDt,D_51U_RET_CAN_DT_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetCanDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetCanDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetCanDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetStatus
	 *	@return d51uRetStatus
	 */
   public char[] getD51uRetStatus() throws CFException{
     if (isD51uRetStatusModified()) { 
        d51uRetStatus = refreshD51uRetStatus();
     }
   		return d51uRetStatus;
   }

  
	/**
	*  set variable d51uRetStatus
	*  Corresponding COBOL Variable is D51U-RET-STATUS
	*  @param value
	**/
   public void setD51uRetStatus(char[] value) {
      d51uRetStatus = checkD51uRetStatusConstraints(value);
      serializeD51uRetStatus(d51uRetStatus);
   } 

     /**
	 * 	Update D51uRetStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetStatus,d51uRetStatus.length);
   	
   }
   
   public void setD51uRetStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetStatus,d51uRetStatus.length);
   	
   }
   
     /**
	 * 	Update D51uRetStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetStatus with another Field
	 *	@param value
	 */
   public void setD51uRetStatus(Field source) {
       replace(source,0,source.length(),beginD51uRetStatus,D_51U_RET_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetStatus,D_51U_RET_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetPosTierCd
	 *	@return d51uRetPosTierCd
	 */
   public char[] getD51uRetPosTierCd() throws CFException{
     if (isD51uRetPosTierCdModified()) { 
        d51uRetPosTierCd = refreshD51uRetPosTierCd();
     }
   		return d51uRetPosTierCd;
   }

  
	/**
	*  set variable d51uRetPosTierCd
	*  Corresponding COBOL Variable is D51U-RET-POS-TIER-CD
	*  @param value
	**/
   public void setD51uRetPosTierCd(char[] value) {
      d51uRetPosTierCd = checkD51uRetPosTierCdConstraints(value);
      serializeD51uRetPosTierCd(d51uRetPosTierCd);
   } 

     /**
	 * 	Update D51uRetPosTierCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetPosTierCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetPosTierCd,d51uRetPosTierCd.length);
   	
   }
   
   public void setD51uRetPosTierCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetPosTierCd,d51uRetPosTierCd.length);
   	
   }
   
     /**
	 * 	Update D51uRetPosTierCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetPosTierCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetPosTierCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetPosTierCd with another Field
	 *	@param value
	 */
   public void setD51uRetPosTierCd(Field source) {
       replace(source,0,source.length(),beginD51uRetPosTierCd,D_51U_RET_POS_TIER_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetPosTierCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetPosTierCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetPosTierCd,D_51U_RET_POS_TIER_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetPosTierCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetPosTierCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetPosTierCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetPriDiagInd
	 *	@return d51uRetPriDiagInd
	 */
   public char[] getD51uRetPriDiagInd() throws CFException{
     if (isD51uRetPriDiagIndModified()) { 
        d51uRetPriDiagInd = refreshD51uRetPriDiagInd();
     }
   		return d51uRetPriDiagInd;
   }

  
	/**
	*  set variable d51uRetPriDiagInd
	*  Corresponding COBOL Variable is D51U-RET-PRI-DIAG-IND
	*  @param value
	**/
   public void setD51uRetPriDiagInd(char[] value) {
      d51uRetPriDiagInd = checkD51uRetPriDiagIndConstraints(value);
      serializeD51uRetPriDiagInd(d51uRetPriDiagInd);
   } 

     /**
	 * 	Update D51uRetPriDiagInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetPriDiagInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetPriDiagInd,d51uRetPriDiagInd.length);
   	
   }
   
   public void setD51uRetPriDiagInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetPriDiagInd,d51uRetPriDiagInd.length);
   	
   }
   
     /**
	 * 	Update D51uRetPriDiagInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetPriDiagInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetPriDiagInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetPriDiagInd with another Field
	 *	@param value
	 */
   public void setD51uRetPriDiagInd(Field source) {
       replace(source,0,source.length(),beginD51uRetPriDiagInd,D_51U_RET_PRI_DIAG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetPriDiagInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetPriDiagInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetPriDiagInd,D_51U_RET_PRI_DIAG_IND_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetPriDiagInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetPriDiagInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetPriDiagInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetDiagElgInd
	 *	@return d51uRetDiagElgInd
	 */
   public char[] getD51uRetDiagElgInd() throws CFException{
     if (isD51uRetDiagElgIndModified()) { 
        d51uRetDiagElgInd = refreshD51uRetDiagElgInd();
     }
   		return d51uRetDiagElgInd;
   }

  
	/**
	*  set variable d51uRetDiagElgInd
	*  Corresponding COBOL Variable is D51U-RET-DIAG-ELG-IND
	*  @param value
	**/
   public void setD51uRetDiagElgInd(char[] value) {
      d51uRetDiagElgInd = checkD51uRetDiagElgIndConstraints(value);
      serializeD51uRetDiagElgInd(d51uRetDiagElgInd);
   } 

     /**
	 * 	Update D51uRetDiagElgInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetDiagElgInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetDiagElgInd,d51uRetDiagElgInd.length);
   	
   }
   
   public void setD51uRetDiagElgInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDiagElgInd,d51uRetDiagElgInd.length);
   	
   }
   
     /**
	 * 	Update D51uRetDiagElgInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetDiagElgInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDiagElgInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetDiagElgInd with another Field
	 *	@param value
	 */
   public void setD51uRetDiagElgInd(Field source) {
       replace(source,0,source.length(),beginD51uRetDiagElgInd,D_51U_RET_DIAG_ELG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetDiagElgInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetDiagElgInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetDiagElgInd,D_51U_RET_DIAG_ELG_IND_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetDiagElgInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetDiagElgInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDiagElgInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uReturnDataFieldLength() {
			return D_51U_RETURN_DATA_LENGTH;
		}

}
  
