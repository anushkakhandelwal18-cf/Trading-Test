package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRuleIpa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uRetRuleIpa extends D51uRetRuleIpaSerialized { 
   

						private char[] d51uRipaSpiTblId = Field.fillLowValue(7);

						private char[] d51uRipaDrvPos = Field.fillLowValue(2);

						private char[] d51uRipaDrvSvc = Field.fillLowValue(6);

						private char[] d51uRipaDrvCau = Field.fillLowValue(1);

								private int d51uRipaClmIpa1Cd;

								private int d51uRipaClmIpa2Cd;

								private int d51uRipaClmIpa3Cd;

						private char[] d51uRipaGrpTbl1Nbr = Field.fillLowValue(4);

						private char[] d51uRipaGrpTbl2Nbr = Field.fillLowValue(4);

						private char[] d51uRipaGrpTbl3Nbr = Field.fillLowValue(4);
	
	/**
	* Constructor for D51uRetRuleIpa
	**/
    public D51uRetRuleIpa() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRuleIpa. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleIpa(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uRipaSpiTblId
	 *	@return d51uRipaSpiTblId
	 */
   public char[] getD51uRipaSpiTblId() throws CFException{
     if (isD51uRipaSpiTblIdModified()) { 
        d51uRipaSpiTblId = refreshD51uRipaSpiTblId();
     }
   		return d51uRipaSpiTblId;
   }

  
	/**
	*  set variable d51uRipaSpiTblId
	*  Corresponding COBOL Variable is D51U-RIPA-SPI-TBL-ID
	*  @param value
	**/
   public void setD51uRipaSpiTblId(char[] value) {
      d51uRipaSpiTblId = checkD51uRipaSpiTblIdConstraints(value);
      serializeD51uRipaSpiTblId(d51uRipaSpiTblId);
   } 

     /**
	 * 	Update D51uRipaSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRipaSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRipaSpiTblId,d51uRipaSpiTblId.length);
   	
   }
   
   public void setD51uRipaSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaSpiTblId,d51uRipaSpiTblId.length);
   	
   }
   
     /**
	 * 	Update D51uRipaSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRipaSpiTblId with another Field
	 *	@param value
	 */
   public void setD51uRipaSpiTblId(Field source) {
       replace(source,0,source.length(),beginD51uRipaSpiTblId,D_51U_RIPA_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRipaSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRipaSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRipaSpiTblId,D_51U_RIPA_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update D51uRipaSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRipaDrvPos
	 *	@return d51uRipaDrvPos
	 */
   public char[] getD51uRipaDrvPos() throws CFException{
     if (isD51uRipaDrvPosModified()) { 
        d51uRipaDrvPos = refreshD51uRipaDrvPos();
     }
   		return d51uRipaDrvPos;
   }

  
	/**
	*  set variable d51uRipaDrvPos
	*  Corresponding COBOL Variable is D51U-RIPA-DRV-POS
	*  @param value
	**/
   public void setD51uRipaDrvPos(char[] value) {
      d51uRipaDrvPos = checkD51uRipaDrvPosConstraints(value);
      serializeD51uRipaDrvPos(d51uRipaDrvPos);
   } 

     /**
	 * 	Update D51uRipaDrvPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRipaDrvPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRipaDrvPos,d51uRipaDrvPos.length);
   	
   }
   
   public void setD51uRipaDrvPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaDrvPos,d51uRipaDrvPos.length);
   	
   }
   
     /**
	 * 	Update D51uRipaDrvPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaDrvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaDrvPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRipaDrvPos with another Field
	 *	@param value
	 */
   public void setD51uRipaDrvPos(Field source) {
       replace(source,0,source.length(),beginD51uRipaDrvPos,D_51U_RIPA_DRV_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRipaDrvPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRipaDrvPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRipaDrvPos,D_51U_RIPA_DRV_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uRipaDrvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaDrvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaDrvPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRipaDrvSvc
	 *	@return d51uRipaDrvSvc
	 */
   public char[] getD51uRipaDrvSvc() throws CFException{
     if (isD51uRipaDrvSvcModified()) { 
        d51uRipaDrvSvc = refreshD51uRipaDrvSvc();
     }
   		return d51uRipaDrvSvc;
   }

  
	/**
	*  set variable d51uRipaDrvSvc
	*  Corresponding COBOL Variable is D51U-RIPA-DRV-SVC
	*  @param value
	**/
   public void setD51uRipaDrvSvc(char[] value) {
      d51uRipaDrvSvc = checkD51uRipaDrvSvcConstraints(value);
      serializeD51uRipaDrvSvc(d51uRipaDrvSvc);
   } 

     /**
	 * 	Update D51uRipaDrvSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRipaDrvSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRipaDrvSvc,d51uRipaDrvSvc.length);
   	
   }
   
   public void setD51uRipaDrvSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaDrvSvc,d51uRipaDrvSvc.length);
   	
   }
   
     /**
	 * 	Update D51uRipaDrvSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaDrvSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaDrvSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRipaDrvSvc with another Field
	 *	@param value
	 */
   public void setD51uRipaDrvSvc(Field source) {
       replace(source,0,source.length(),beginD51uRipaDrvSvc,D_51U_RIPA_DRV_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRipaDrvSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRipaDrvSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRipaDrvSvc,D_51U_RIPA_DRV_SVC_LEN);
   	
   }
   
     /**
	 * 	Update D51uRipaDrvSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaDrvSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaDrvSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRipaDrvCau
	 *	@return d51uRipaDrvCau
	 */
   public char[] getD51uRipaDrvCau() throws CFException{
     if (isD51uRipaDrvCauModified()) { 
        d51uRipaDrvCau = refreshD51uRipaDrvCau();
     }
   		return d51uRipaDrvCau;
   }

  
	/**
	*  set variable d51uRipaDrvCau
	*  Corresponding COBOL Variable is D51U-RIPA-DRV-CAU
	*  @param value
	**/
   public void setD51uRipaDrvCau(char[] value) {
      d51uRipaDrvCau = checkD51uRipaDrvCauConstraints(value);
      serializeD51uRipaDrvCau(d51uRipaDrvCau);
   } 

     /**
	 * 	Update D51uRipaDrvCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRipaDrvCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRipaDrvCau,d51uRipaDrvCau.length);
   	
   }
   
   public void setD51uRipaDrvCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaDrvCau,d51uRipaDrvCau.length);
   	
   }
   
     /**
	 * 	Update D51uRipaDrvCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaDrvCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaDrvCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRipaDrvCau with another Field
	 *	@param value
	 */
   public void setD51uRipaDrvCau(Field source) {
       replace(source,0,source.length(),beginD51uRipaDrvCau,D_51U_RIPA_DRV_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRipaDrvCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRipaDrvCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRipaDrvCau,D_51U_RIPA_DRV_CAU_LEN);
   	
   }
   
     /**
	 * 	Update D51uRipaDrvCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaDrvCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaDrvCau+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRipaClmIpa1Cd
	 *	@return d51uRipaClmIpa1Cd
	 */
	public int getD51uRipaClmIpa1Cd() throws CFException {
       if (isD51uRipaClmIpa1CdModified()) { 
           d51uRipaClmIpa1Cd = refreshD51uRipaClmIpa1Cd();
        }
   		return d51uRipaClmIpa1Cd;
	}
	

	
	   
	/**
	 * 	Update D51uRipaClmIpa1Cd with the passed value
	 *  Corresponding COBOL Variable is D51U-RIPA-CLM-IPA-1-CD
	 *	@param number
	 */
	public void setD51uRipaClmIpa1Cd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    d51uRipaClmIpa1Cd = checkD51uRipaClmIpa1CdMaxLimit(number); 
		serializeD51uRipaClmIpa1Cd(d51uRipaClmIpa1Cd);
	}
	

	public void setD51uRipaClmIpa1Cd(long number) {
	    number = checkD51uRipaClmIpa1CdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uRipaClmIpa1Cd((int)number);
	}
	
	/**
	 * 	Update D51uRipaClmIpa1Cd with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51uRipaClmIpa1Cd(char[] value) throws CFException {
		 d51uRipaClmIpa1Cd = serializeD51uRipaClmIpa1Cd(value);
	}
	/**
	 * 	Update D51uRipaClmIpa1Cd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setD51uRipaClmIpa1CdString(char[] value) throws CFException {
		 setD51uRipaClmIpa1Cd(value);
	}
	/**
	 *	Returns the value of d51uRipaClmIpa2Cd
	 *	@return d51uRipaClmIpa2Cd
	 */
	public int getD51uRipaClmIpa2Cd() throws CFException {
       if (isD51uRipaClmIpa2CdModified()) { 
           d51uRipaClmIpa2Cd = refreshD51uRipaClmIpa2Cd();
        }
   		return d51uRipaClmIpa2Cd;
	}
	

	
	   
	/**
	 * 	Update D51uRipaClmIpa2Cd with the passed value
	 *  Corresponding COBOL Variable is D51U-RIPA-CLM-IPA-2-CD
	 *	@param number
	 */
	public void setD51uRipaClmIpa2Cd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    d51uRipaClmIpa2Cd = checkD51uRipaClmIpa2CdMaxLimit(number); 
		serializeD51uRipaClmIpa2Cd(d51uRipaClmIpa2Cd);
	}
	

	public void setD51uRipaClmIpa2Cd(long number) {
	    number = checkD51uRipaClmIpa2CdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uRipaClmIpa2Cd((int)number);
	}
	
	/**
	 * 	Update D51uRipaClmIpa2Cd with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51uRipaClmIpa2Cd(char[] value) throws CFException {
		 d51uRipaClmIpa2Cd = serializeD51uRipaClmIpa2Cd(value);
	}
	/**
	 * 	Update D51uRipaClmIpa2Cd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setD51uRipaClmIpa2CdString(char[] value) throws CFException {
		 setD51uRipaClmIpa2Cd(value);
	}
	/**
	 *	Returns the value of d51uRipaClmIpa3Cd
	 *	@return d51uRipaClmIpa3Cd
	 */
	public int getD51uRipaClmIpa3Cd() throws CFException {
       if (isD51uRipaClmIpa3CdModified()) { 
           d51uRipaClmIpa3Cd = refreshD51uRipaClmIpa3Cd();
        }
   		return d51uRipaClmIpa3Cd;
	}
	

	
	   
	/**
	 * 	Update D51uRipaClmIpa3Cd with the passed value
	 *  Corresponding COBOL Variable is D51U-RIPA-CLM-IPA-3-CD
	 *	@param number
	 */
	public void setD51uRipaClmIpa3Cd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    d51uRipaClmIpa3Cd = checkD51uRipaClmIpa3CdMaxLimit(number); 
		serializeD51uRipaClmIpa3Cd(d51uRipaClmIpa3Cd);
	}
	

	public void setD51uRipaClmIpa3Cd(long number) {
	    number = checkD51uRipaClmIpa3CdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uRipaClmIpa3Cd((int)number);
	}
	
	/**
	 * 	Update D51uRipaClmIpa3Cd with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51uRipaClmIpa3Cd(char[] value) throws CFException {
		 d51uRipaClmIpa3Cd = serializeD51uRipaClmIpa3Cd(value);
	}
	/**
	 * 	Update D51uRipaClmIpa3Cd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setD51uRipaClmIpa3CdString(char[] value) throws CFException {
		 setD51uRipaClmIpa3Cd(value);
	}
	/**
	 *	Returns the value of d51uRipaGrpTbl1Nbr
	 *	@return d51uRipaGrpTbl1Nbr
	 */
   public char[] getD51uRipaGrpTbl1Nbr() throws CFException{
     if (isD51uRipaGrpTbl1NbrModified()) { 
        d51uRipaGrpTbl1Nbr = refreshD51uRipaGrpTbl1Nbr();
     }
   		return d51uRipaGrpTbl1Nbr;
   }

  
	/**
	*  set variable d51uRipaGrpTbl1Nbr
	*  Corresponding COBOL Variable is D51U-RIPA-GRP-TBL-1-NBR
	*  @param value
	**/
   public void setD51uRipaGrpTbl1Nbr(char[] value) {
      d51uRipaGrpTbl1Nbr = checkD51uRipaGrpTbl1NbrConstraints(value);
      serializeD51uRipaGrpTbl1Nbr(d51uRipaGrpTbl1Nbr);
   } 

     /**
	 * 	Update D51uRipaGrpTbl1Nbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRipaGrpTbl1Nbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRipaGrpTbl1Nbr,d51uRipaGrpTbl1Nbr.length);
   	
   }
   
   public void setD51uRipaGrpTbl1Nbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl1Nbr,d51uRipaGrpTbl1Nbr.length);
   	
   }
   
     /**
	 * 	Update D51uRipaGrpTbl1Nbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaGrpTbl1Nbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl1Nbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRipaGrpTbl1Nbr with another Field
	 *	@param value
	 */
   public void setD51uRipaGrpTbl1Nbr(Field source) {
       replace(source,0,source.length(),beginD51uRipaGrpTbl1Nbr,D_51U_RIPA_GRP_TBL_1_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRipaGrpTbl1Nbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRipaGrpTbl1Nbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl1Nbr,D_51U_RIPA_GRP_TBL_1_NBR_LEN);
   	
   }
   
     /**
	 * 	Update D51uRipaGrpTbl1Nbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaGrpTbl1Nbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl1Nbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRipaGrpTbl2Nbr
	 *	@return d51uRipaGrpTbl2Nbr
	 */
   public char[] getD51uRipaGrpTbl2Nbr() throws CFException{
     if (isD51uRipaGrpTbl2NbrModified()) { 
        d51uRipaGrpTbl2Nbr = refreshD51uRipaGrpTbl2Nbr();
     }
   		return d51uRipaGrpTbl2Nbr;
   }

  
	/**
	*  set variable d51uRipaGrpTbl2Nbr
	*  Corresponding COBOL Variable is D51U-RIPA-GRP-TBL-2-NBR
	*  @param value
	**/
   public void setD51uRipaGrpTbl2Nbr(char[] value) {
      d51uRipaGrpTbl2Nbr = checkD51uRipaGrpTbl2NbrConstraints(value);
      serializeD51uRipaGrpTbl2Nbr(d51uRipaGrpTbl2Nbr);
   } 

     /**
	 * 	Update D51uRipaGrpTbl2Nbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRipaGrpTbl2Nbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRipaGrpTbl2Nbr,d51uRipaGrpTbl2Nbr.length);
   	
   }
   
   public void setD51uRipaGrpTbl2Nbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl2Nbr,d51uRipaGrpTbl2Nbr.length);
   	
   }
   
     /**
	 * 	Update D51uRipaGrpTbl2Nbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaGrpTbl2Nbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl2Nbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRipaGrpTbl2Nbr with another Field
	 *	@param value
	 */
   public void setD51uRipaGrpTbl2Nbr(Field source) {
       replace(source,0,source.length(),beginD51uRipaGrpTbl2Nbr,D_51U_RIPA_GRP_TBL_2_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRipaGrpTbl2Nbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRipaGrpTbl2Nbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl2Nbr,D_51U_RIPA_GRP_TBL_2_NBR_LEN);
   	
   }
   
     /**
	 * 	Update D51uRipaGrpTbl2Nbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaGrpTbl2Nbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl2Nbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRipaGrpTbl3Nbr
	 *	@return d51uRipaGrpTbl3Nbr
	 */
   public char[] getD51uRipaGrpTbl3Nbr() throws CFException{
     if (isD51uRipaGrpTbl3NbrModified()) { 
        d51uRipaGrpTbl3Nbr = refreshD51uRipaGrpTbl3Nbr();
     }
   		return d51uRipaGrpTbl3Nbr;
   }

  
	/**
	*  set variable d51uRipaGrpTbl3Nbr
	*  Corresponding COBOL Variable is D51U-RIPA-GRP-TBL-3-NBR
	*  @param value
	**/
   public void setD51uRipaGrpTbl3Nbr(char[] value) {
      d51uRipaGrpTbl3Nbr = checkD51uRipaGrpTbl3NbrConstraints(value);
      serializeD51uRipaGrpTbl3Nbr(d51uRipaGrpTbl3Nbr);
   } 

     /**
	 * 	Update D51uRipaGrpTbl3Nbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRipaGrpTbl3Nbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRipaGrpTbl3Nbr,d51uRipaGrpTbl3Nbr.length);
   	
   }
   
   public void setD51uRipaGrpTbl3Nbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl3Nbr,d51uRipaGrpTbl3Nbr.length);
   	
   }
   
     /**
	 * 	Update D51uRipaGrpTbl3Nbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaGrpTbl3Nbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl3Nbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRipaGrpTbl3Nbr with another Field
	 *	@param value
	 */
   public void setD51uRipaGrpTbl3Nbr(Field source) {
       replace(source,0,source.length(),beginD51uRipaGrpTbl3Nbr,D_51U_RIPA_GRP_TBL_3_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRipaGrpTbl3Nbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRipaGrpTbl3Nbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl3Nbr,D_51U_RIPA_GRP_TBL_3_NBR_LEN);
   	
   }
   
     /**
	 * 	Update D51uRipaGrpTbl3Nbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRipaGrpTbl3Nbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRipaGrpTbl3Nbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uRetRuleIpaFieldLength() {
			return D_51U_RET_RULE_IPA_LENGTH;
		}

}
  
