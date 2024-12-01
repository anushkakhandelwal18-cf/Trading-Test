package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1ClmClaimItem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.utility.CFUtil;


public class Dt1ClmClaimItem extends Dt1ClmClaimItemSerialized { 
   

								private int dt1ClmFilmOffice;

								private long dt1ClmFln;

						private char[] dt1ClmIcn = Field.fillLowValue(10);

								private int dt1ClmSuffixCd;

						private char[] dt1ClmProcDt = Field.fillLowValue(10);

						private char[] dt1ClmProcTm = Field.fillLowValue(8);

						private char[] dt1ClmFlnFormatDt = Field.fillLowValue(10);

								private int dt1ClmHeaderCt;

								private long dt1ClmDraftNo;

								private long dt1ClmFirstServiceDate;

								private long dt1ClmLastServiceDate;

						private char[] dt1ClmProviderName = Field.fillLowValue(40);
				private Dt1ClmProviderId dt1ClmProviderId = new Dt1ClmProviderId();

								private char[] dt1ClmChargeAmount = Field.fillLowValue(10);

								private char[] dt1ClmPaidAmount = Field.fillLowValue(10);

								private char[] dt1ClmDeductibleAmount = Field.fillLowValue(10);
				private Dt1ClmClaimStatus dt1ClmClaimStatus = new Dt1ClmClaimStatus();

						private char[] dt1ClmClmLevelRc = Field.fillLowValue(2);

								private int dt1ClmAdjNbr;

						private char[] dt1ClmAdjInd = Field.fillLowValue(1);

						private char[] dt1ClmPpoInd = Field.fillLowValue(1);

						private char[] dt1ClmClmPhiInd = Field.fillLowValue(1);

						private char[] dt1ClmT1ProcessInd = Field.fillLowValue(1);

						private char[] dt1ClmDlgteInd = Field.fillLowValue(2);

						private char[] dt1ClmAuthNbr = Field.fillLowValue(50);

						private char[] dt1ClmAuthSrcId = Field.fillLowValue(3);

						private char[] dt1ClmAuthProcCd = Field.fillLowValue(5);

						private char[] dt1ClmAuthClmLevelInd = Field.fillLowValue(1);

								private int dt1ClmAuthUniqueCnt;

						private char[] dt1ClmPrimaryDiagnosis = Field.fillLowValue(7);

						private char[] dt1ClmParsWaivInd = Field.fillLowValue(1);

						private char[] dt1ClmParInd = Field.fillLowValue(1);

						private char[] dt1ClmNonParInd = Field.fillLowValue(1);

						private char[] dt1ClmProviderTier = Field.fillLowValue(1);

						private char[] dt1ClmTpsmCd = Field.fillLowValue(3);

						private char[] dt1ClmMskInd = Field.fillLowValue(1);

								private char[] dt1ClmPtntRespAmt = Field.fillLowValue(10);

						private char[] dt1ClmProvSpclCd = Field.fillLowValue(3);

						private char[] dt1ClmNdbContrId = Field.fillLowValue(9);

						private char[] dt1ClmDrgNbr = Field.fillLowValue(5);

						private char[] dt1ClmProvMedcdReclmInd = Field.fillLowValue(1);

						private char[] dt1ClmHospProfInd = Field.fillLowValue(1);

						private char[] dt1ClmSmbAppCd = Field.fillLowValue(1);

						private char[] dt1ClmSmbStCd = Field.fillLowValue(2);

						private char[] dt1ClmItemFillerArea = Field.fillLowValue(117);
	
	/**
	* Constructor for Dt1ClmClaimItem
	**/
    public Dt1ClmClaimItem() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1ClmClaimItem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmClaimItem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			dt1ClmProviderId.setParent(this,getStartOffset() + 123);
	       			dt1ClmClaimStatus.setParent(this,getStartOffset() + 168);
    } 

	/**
	 *	Returns the value of dt1ClmFilmOffice
	 *	@return dt1ClmFilmOffice
	 */
	public int getDt1ClmFilmOffice() throws CFException {
       if (isDt1ClmFilmOfficeModified()) { 
           dt1ClmFilmOffice = refreshDt1ClmFilmOffice();
        }
   		return dt1ClmFilmOffice;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmFilmOffice with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-FILM-OFFICE
	 *	@param number
	 */
	public void setDt1ClmFilmOffice(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmFilmOffice = checkDt1ClmFilmOfficeMaxLimit(number); 
		serializeDt1ClmFilmOffice(dt1ClmFilmOffice);
	}
	

	public void setDt1ClmFilmOffice(long number) {
	    number = checkDt1ClmFilmOfficeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ClmFilmOffice((int)number);
	}
	
	/**
	 * 	Update Dt1ClmFilmOffice with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmFilmOffice(char[] value) throws CFException {
		 dt1ClmFilmOffice = serializeDt1ClmFilmOffice(value);
	}
	/**
	 * 	Update Dt1ClmFilmOffice with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmFilmOfficeString(char[] value) throws CFException {
		 setDt1ClmFilmOffice(value);
	}
	/**
	 *	Returns the value of dt1ClmFln
	 *	@return dt1ClmFln
	 */
	public long getDt1ClmFln() throws CFException {
       if (isDt1ClmFlnModified()) { 
           dt1ClmFln = refreshDt1ClmFln();
        }
   		return dt1ClmFln;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmFln with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-FLN
	 *	@param number
	 */
	public void setDt1ClmFln(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmFln = checkDt1ClmFlnMaxLimit(number); 
		serializeDt1ClmFln(dt1ClmFln);
	}
	

	/**
	 * 	Update Dt1ClmFln with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmFln(char[] value) throws CFException {
		 dt1ClmFln = serializeDt1ClmFln(value);
	}
	/**
	 * 	Update Dt1ClmFln with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmFlnString(char[] value) throws CFException {
		 setDt1ClmFln(value);
	}
	/**
	 *	Returns the value of dt1ClmIcn
	 *	@return dt1ClmIcn
	 */
   public char[] getDt1ClmIcn() throws CFException{
     if (isDt1ClmIcnModified()) { 
        dt1ClmIcn = refreshDt1ClmIcn();
     }
   		return dt1ClmIcn;
   }

  
	/**
	*  set variable dt1ClmIcn
	*  Corresponding COBOL Variable is DT1-CLM-ICN
	*  @param value
	**/
   public void setDt1ClmIcn(char[] value) {
      dt1ClmIcn = checkDt1ClmIcnConstraints(value);
      serializeDt1ClmIcn(dt1ClmIcn);
   } 

     /**
	 * 	Update Dt1ClmIcn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmIcn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmIcn,dt1ClmIcn.length);
   	
   }
   
   public void setDt1ClmIcn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmIcn,dt1ClmIcn.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmIcn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmIcn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmIcn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmIcn with another Field
	 *	@param value
	 */
   public void setDt1ClmIcn(Field source) {
       replace(source,0,source.length(),beginDt1ClmIcn,DT_1_CLM_ICN_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmIcn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmIcn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmIcn,DT_1_CLM_ICN_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmIcn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmIcn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmIcn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmSuffixCd
	 *	@return dt1ClmSuffixCd
	 */
	public int getDt1ClmSuffixCd() throws CFException {
       if (isDt1ClmSuffixCdModified()) { 
           dt1ClmSuffixCd = refreshDt1ClmSuffixCd();
        }
   		return dt1ClmSuffixCd;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmSuffixCd with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-SUFFIX-CD
	 *	@param number
	 */
	public void setDt1ClmSuffixCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmSuffixCd = checkDt1ClmSuffixCdMaxLimit(number); 
		serializeDt1ClmSuffixCd(dt1ClmSuffixCd);
	}
	

	public void setDt1ClmSuffixCd(long number) {
	    number = checkDt1ClmSuffixCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ClmSuffixCd((int)number);
	}
	
	/**
	 * 	Update Dt1ClmSuffixCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmSuffixCd(char[] value) throws CFException {
		 dt1ClmSuffixCd = serializeDt1ClmSuffixCd(value);
	}
	/**
	 * 	Update Dt1ClmSuffixCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmSuffixCdString(char[] value) throws CFException {
		 setDt1ClmSuffixCd(value);
	}
	/**
	 *	Returns the value of dt1ClmProcDt
	 *	@return dt1ClmProcDt
	 */
   public char[] getDt1ClmProcDt() throws CFException{
     if (isDt1ClmProcDtModified()) { 
        dt1ClmProcDt = refreshDt1ClmProcDt();
     }
   		return dt1ClmProcDt;
   }

  
	/**
	*  set variable dt1ClmProcDt
	*  Corresponding COBOL Variable is DT1-CLM-PROC-DT
	*  @param value
	**/
   public void setDt1ClmProcDt(char[] value) {
      dt1ClmProcDt = checkDt1ClmProcDtConstraints(value);
      serializeDt1ClmProcDt(dt1ClmProcDt);
   } 

     /**
	 * 	Update Dt1ClmProcDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmProcDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmProcDt,dt1ClmProcDt.length);
   	
   }
   
   public void setDt1ClmProcDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProcDt,dt1ClmProcDt.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmProcDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProcDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProcDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmProcDt with another Field
	 *	@param value
	 */
   public void setDt1ClmProcDt(Field source) {
       replace(source,0,source.length(),beginDt1ClmProcDt,DT_1_CLM_PROC_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmProcDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmProcDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmProcDt,DT_1_CLM_PROC_DT_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmProcDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProcDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProcDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmProcTm
	 *	@return dt1ClmProcTm
	 */
   public char[] getDt1ClmProcTm() throws CFException{
     if (isDt1ClmProcTmModified()) { 
        dt1ClmProcTm = refreshDt1ClmProcTm();
     }
   		return dt1ClmProcTm;
   }

  
	/**
	*  set variable dt1ClmProcTm
	*  Corresponding COBOL Variable is DT1-CLM-PROC-TM
	*  @param value
	**/
   public void setDt1ClmProcTm(char[] value) {
      dt1ClmProcTm = checkDt1ClmProcTmConstraints(value);
      serializeDt1ClmProcTm(dt1ClmProcTm);
   } 

     /**
	 * 	Update Dt1ClmProcTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmProcTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmProcTm,dt1ClmProcTm.length);
   	
   }
   
   public void setDt1ClmProcTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProcTm,dt1ClmProcTm.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmProcTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProcTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProcTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmProcTm with another Field
	 *	@param value
	 */
   public void setDt1ClmProcTm(Field source) {
       replace(source,0,source.length(),beginDt1ClmProcTm,DT_1_CLM_PROC_TM_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmProcTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmProcTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmProcTm,DT_1_CLM_PROC_TM_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmProcTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProcTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProcTm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmFlnFormatDt
	 *	@return dt1ClmFlnFormatDt
	 */
   public char[] getDt1ClmFlnFormatDt() throws CFException{
     if (isDt1ClmFlnFormatDtModified()) { 
        dt1ClmFlnFormatDt = refreshDt1ClmFlnFormatDt();
     }
   		return dt1ClmFlnFormatDt;
   }

  
	/**
	*  set variable dt1ClmFlnFormatDt
	*  Corresponding COBOL Variable is DT1-CLM-FLN-FORMAT-DT
	*  @param value
	**/
   public void setDt1ClmFlnFormatDt(char[] value) {
      dt1ClmFlnFormatDt = checkDt1ClmFlnFormatDtConstraints(value);
      serializeDt1ClmFlnFormatDt(dt1ClmFlnFormatDt);
   } 

     /**
	 * 	Update Dt1ClmFlnFormatDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmFlnFormatDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmFlnFormatDt,dt1ClmFlnFormatDt.length);
   	
   }
   
   public void setDt1ClmFlnFormatDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmFlnFormatDt,dt1ClmFlnFormatDt.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmFlnFormatDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmFlnFormatDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmFlnFormatDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmFlnFormatDt with another Field
	 *	@param value
	 */
   public void setDt1ClmFlnFormatDt(Field source) {
       replace(source,0,source.length(),beginDt1ClmFlnFormatDt,DT_1_CLM_FLN_FORMAT_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmFlnFormatDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmFlnFormatDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmFlnFormatDt,DT_1_CLM_FLN_FORMAT_DT_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmFlnFormatDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmFlnFormatDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmFlnFormatDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmHeaderCt
	 *	@return dt1ClmHeaderCt
	 */
	public int getDt1ClmHeaderCt() throws CFException {
       if (isDt1ClmHeaderCtModified()) { 
           dt1ClmHeaderCt = refreshDt1ClmHeaderCt();
        }
   		return dt1ClmHeaderCt;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmHeaderCt with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-HEADER-CT
	 *	@param number
	 */
	public void setDt1ClmHeaderCt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmHeaderCt = checkDt1ClmHeaderCtMaxLimit(number); 
		serializeDt1ClmHeaderCt(dt1ClmHeaderCt);
	}
	

	public void setDt1ClmHeaderCt(long number) {
	    number = checkDt1ClmHeaderCtMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ClmHeaderCt((int)number);
	}
	
	/**
	 * 	Update Dt1ClmHeaderCt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmHeaderCt(char[] value) throws CFException {
		 dt1ClmHeaderCt = serializeDt1ClmHeaderCt(value);
	}
	/**
	 * 	Update Dt1ClmHeaderCt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmHeaderCtString(char[] value) throws CFException {
		 setDt1ClmHeaderCt(value);
	}
	/**
	 *	Returns the value of dt1ClmDraftNo
	 *	@return dt1ClmDraftNo
	 */
	public long getDt1ClmDraftNo() throws CFException {
       if (isDt1ClmDraftNoModified()) { 
           dt1ClmDraftNo = refreshDt1ClmDraftNo();
        }
   		return dt1ClmDraftNo;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmDraftNo with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-DRAFT-NO
	 *	@param number
	 */
	public void setDt1ClmDraftNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmDraftNo = checkDt1ClmDraftNoMaxLimit(number); 
		serializeDt1ClmDraftNo(dt1ClmDraftNo);
	}
	

	/**
	 * 	Update Dt1ClmDraftNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmDraftNo(char[] value) throws CFException {
		 dt1ClmDraftNo = serializeDt1ClmDraftNo(value);
	}
	/**
	 * 	Update Dt1ClmDraftNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmDraftNoString(char[] value) throws CFException {
		 setDt1ClmDraftNo(value);
	}
	/**
	 *	Returns the value of dt1ClmFirstServiceDate
	 *	@return dt1ClmFirstServiceDate
	 */
	public long getDt1ClmFirstServiceDate() throws CFException {
       if (isDt1ClmFirstServiceDateModified()) { 
           dt1ClmFirstServiceDate = refreshDt1ClmFirstServiceDate();
        }
   		return dt1ClmFirstServiceDate;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmFirstServiceDate with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-FIRST-SERVICE-DATE
	 *	@param number
	 */
	public void setDt1ClmFirstServiceDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmFirstServiceDate = checkDt1ClmFirstServiceDateMaxLimit(number); 
		serializeDt1ClmFirstServiceDate(dt1ClmFirstServiceDate);
	}
	

	/**
	 * 	Update Dt1ClmFirstServiceDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmFirstServiceDate(char[] value) throws CFException {
		 dt1ClmFirstServiceDate = serializeDt1ClmFirstServiceDate(value);
	}
	/**
	 * 	Update Dt1ClmFirstServiceDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmFirstServiceDateString(char[] value) throws CFException {
		 setDt1ClmFirstServiceDate(value);
	}
	/**
	 *	Returns the value of dt1ClmLastServiceDate
	 *	@return dt1ClmLastServiceDate
	 */
	public long getDt1ClmLastServiceDate() throws CFException {
       if (isDt1ClmLastServiceDateModified()) { 
           dt1ClmLastServiceDate = refreshDt1ClmLastServiceDate();
        }
   		return dt1ClmLastServiceDate;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmLastServiceDate with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-LAST-SERVICE-DATE
	 *	@param number
	 */
	public void setDt1ClmLastServiceDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmLastServiceDate = checkDt1ClmLastServiceDateMaxLimit(number); 
		serializeDt1ClmLastServiceDate(dt1ClmLastServiceDate);
	}
	

	/**
	 * 	Update Dt1ClmLastServiceDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmLastServiceDate(char[] value) throws CFException {
		 dt1ClmLastServiceDate = serializeDt1ClmLastServiceDate(value);
	}
	/**
	 * 	Update Dt1ClmLastServiceDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmLastServiceDateString(char[] value) throws CFException {
		 setDt1ClmLastServiceDate(value);
	}
	/**
	 *	Returns the value of dt1ClmProviderName
	 *	@return dt1ClmProviderName
	 */
   public char[] getDt1ClmProviderName() throws CFException{
     if (isDt1ClmProviderNameModified()) { 
        dt1ClmProviderName = refreshDt1ClmProviderName();
     }
   		return dt1ClmProviderName;
   }

  
	/**
	*  set variable dt1ClmProviderName
	*  Corresponding COBOL Variable is DT1-CLM-PROVIDER-NAME
	*  @param value
	**/
   public void setDt1ClmProviderName(char[] value) {
      dt1ClmProviderName = checkDt1ClmProviderNameConstraints(value);
      serializeDt1ClmProviderName(dt1ClmProviderName);
   } 

     /**
	 * 	Update Dt1ClmProviderName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmProviderName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmProviderName,dt1ClmProviderName.length);
   	
   }
   
   public void setDt1ClmProviderName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProviderName,dt1ClmProviderName.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmProviderName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProviderName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProviderName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmProviderName with another Field
	 *	@param value
	 */
   public void setDt1ClmProviderName(Field source) {
       replace(source,0,source.length(),beginDt1ClmProviderName,DT_1_CLM_PROVIDER_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmProviderName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmProviderName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmProviderName,DT_1_CLM_PROVIDER_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmProviderName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProviderName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProviderName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmProviderId
	 *	@return dt1ClmProviderId
	 */   
	 public Dt1ClmProviderId getDt1ClmProviderId() {
   	return dt1ClmProviderId;
   }
   /**
	* 	Update Dt1ClmProviderId with the passed value
	*   Corresponding COBOL Variable is DT1-CLM-PROVIDER-ID
	*	@param value
	*/
   public void setDt1ClmProviderId(char[] value) {
      dt1ClmProviderId.setString(value); 
   }   
    
     /**
	 * 	Update Dt1ClmProviderId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmProviderId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmProviderId.begin,dt1ClmProviderId.length());
   }
   
     /**
	 * 	Update Dt1ClmProviderId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProviderId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmProviderId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1ClmProviderId with another Field
	 *	@param value
	 */
   public void setDt1ClmProviderId(Field source) {
   	replace(source,0,source.length(),dt1ClmProviderId.begin,dt1ClmProviderId.length());
   }  
   
     /**
	 * 	Update Dt1ClmProviderId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmProviderId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmProviderId.begin,dt1ClmProviderId.length());
   }
   
     /**
	 * 	Update Dt1ClmProviderId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProviderId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmProviderId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dt1ClmChargeAmount
	 *	@return dt1ClmChargeAmount
	 */
   public char[] getDt1ClmChargeAmount() throws CFException{
     if (isDt1ClmChargeAmountModified()) { 
        dt1ClmChargeAmount = refreshDt1ClmChargeAmount();
     }
   		return dt1ClmChargeAmount;
   }

  
	/**
	*  set variable dt1ClmChargeAmount
	*  Corresponding COBOL Variable is DT1-CLM-CHARGE-AMOUNT
	*  @param value
	**/
   public void setDt1ClmChargeAmount(char[] value) {
      dt1ClmChargeAmount = checkDt1ClmChargeAmountConstraints(value);
      serializeDt1ClmChargeAmount(dt1ClmChargeAmount);
   } 

     /**
	 * 	Update Dt1ClmChargeAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmChargeAmount(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmChargeAmount,dt1ClmChargeAmount.length);
   	
   }
   
   public void setDt1ClmChargeAmount(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmChargeAmount,dt1ClmChargeAmount.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmChargeAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmChargeAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmChargeAmount+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmChargeAmount with another Field
	 *	@param value
	 */
   public void setDt1ClmChargeAmount(Field source) {
       replace(source,0,source.length(),beginDt1ClmChargeAmount,DT_1_CLM_CHARGE_AMOUNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmChargeAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmChargeAmount(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmChargeAmount,DT_1_CLM_CHARGE_AMOUNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmChargeAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmChargeAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmChargeAmount+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmPaidAmount
	 *	@return dt1ClmPaidAmount
	 */
   public char[] getDt1ClmPaidAmount() throws CFException{
     if (isDt1ClmPaidAmountModified()) { 
        dt1ClmPaidAmount = refreshDt1ClmPaidAmount();
     }
   		return dt1ClmPaidAmount;
   }

  
	/**
	*  set variable dt1ClmPaidAmount
	*  Corresponding COBOL Variable is DT1-CLM-PAID-AMOUNT
	*  @param value
	**/
   public void setDt1ClmPaidAmount(char[] value) {
      dt1ClmPaidAmount = checkDt1ClmPaidAmountConstraints(value);
      serializeDt1ClmPaidAmount(dt1ClmPaidAmount);
   } 

     /**
	 * 	Update Dt1ClmPaidAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmPaidAmount(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmPaidAmount,dt1ClmPaidAmount.length);
   	
   }
   
   public void setDt1ClmPaidAmount(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPaidAmount,dt1ClmPaidAmount.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmPaidAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPaidAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPaidAmount+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmPaidAmount with another Field
	 *	@param value
	 */
   public void setDt1ClmPaidAmount(Field source) {
       replace(source,0,source.length(),beginDt1ClmPaidAmount,DT_1_CLM_PAID_AMOUNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmPaidAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmPaidAmount(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmPaidAmount,DT_1_CLM_PAID_AMOUNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmPaidAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPaidAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPaidAmount+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmDeductibleAmount
	 *	@return dt1ClmDeductibleAmount
	 */
   public char[] getDt1ClmDeductibleAmount() throws CFException{
     if (isDt1ClmDeductibleAmountModified()) { 
        dt1ClmDeductibleAmount = refreshDt1ClmDeductibleAmount();
     }
   		return dt1ClmDeductibleAmount;
   }

  
	/**
	*  set variable dt1ClmDeductibleAmount
	*  Corresponding COBOL Variable is DT1-CLM-DEDUCTIBLE-AMOUNT
	*  @param value
	**/
   public void setDt1ClmDeductibleAmount(char[] value) {
      dt1ClmDeductibleAmount = checkDt1ClmDeductibleAmountConstraints(value);
      serializeDt1ClmDeductibleAmount(dt1ClmDeductibleAmount);
   } 

     /**
	 * 	Update Dt1ClmDeductibleAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmDeductibleAmount(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmDeductibleAmount,dt1ClmDeductibleAmount.length);
   	
   }
   
   public void setDt1ClmDeductibleAmount(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmDeductibleAmount,dt1ClmDeductibleAmount.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmDeductibleAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmDeductibleAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmDeductibleAmount+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmDeductibleAmount with another Field
	 *	@param value
	 */
   public void setDt1ClmDeductibleAmount(Field source) {
       replace(source,0,source.length(),beginDt1ClmDeductibleAmount,DT_1_CLM_DEDUCTIBLE_AMOUNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmDeductibleAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmDeductibleAmount(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmDeductibleAmount,DT_1_CLM_DEDUCTIBLE_AMOUNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmDeductibleAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmDeductibleAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmDeductibleAmount+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmClaimStatus
	 *	@return dt1ClmClaimStatus
	 */   
	 public Dt1ClmClaimStatus getDt1ClmClaimStatus() {
   	return dt1ClmClaimStatus;
   }
   /**
	* 	Update Dt1ClmClaimStatus with the passed value
	*   Corresponding COBOL Variable is DT1-CLM-CLAIM-STATUS
	*	@param value
	*/
   public void setDt1ClmClaimStatus(char[] value) {
      dt1ClmClaimStatus.setString(value); 
   }   
    
     /**
	 * 	Update Dt1ClmClaimStatus 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmClaimStatus(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmClaimStatus.begin,dt1ClmClaimStatus.length());
   }
   
     /**
	 * 	Update Dt1ClmClaimStatus 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmClaimStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmClaimStatus.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1ClmClaimStatus with another Field
	 *	@param value
	 */
   public void setDt1ClmClaimStatus(Field source) {
   	replace(source,0,source.length(),dt1ClmClaimStatus.begin,dt1ClmClaimStatus.length());
   }  
   
     /**
	 * 	Update Dt1ClmClaimStatus 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmClaimStatus(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmClaimStatus.begin,dt1ClmClaimStatus.length());
   }
   
     /**
	 * 	Update Dt1ClmClaimStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmClaimStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmClaimStatus.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dt1ClmClmLevelRc
	 *	@return dt1ClmClmLevelRc
	 */
   public char[] getDt1ClmClmLevelRc() throws CFException{
     if (isDt1ClmClmLevelRcModified()) { 
        dt1ClmClmLevelRc = refreshDt1ClmClmLevelRc();
     }
   		return dt1ClmClmLevelRc;
   }

  
	/**
	*  set variable dt1ClmClmLevelRc
	*  Corresponding COBOL Variable is DT1-CLM-CLM-LEVEL-RC
	*  @param value
	**/
   public void setDt1ClmClmLevelRc(char[] value) {
      dt1ClmClmLevelRc = checkDt1ClmClmLevelRcConstraints(value);
      serializeDt1ClmClmLevelRc(dt1ClmClmLevelRc);
   } 

     /**
	 * 	Update Dt1ClmClmLevelRc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmClmLevelRc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmClmLevelRc,dt1ClmClmLevelRc.length);
   	
   }
   
   public void setDt1ClmClmLevelRc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmClmLevelRc,dt1ClmClmLevelRc.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmClmLevelRc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmClmLevelRc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmClmLevelRc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmClmLevelRc with another Field
	 *	@param value
	 */
   public void setDt1ClmClmLevelRc(Field source) {
       replace(source,0,source.length(),beginDt1ClmClmLevelRc,DT_1_CLM_CLM_LEVEL_RC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmClmLevelRc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmClmLevelRc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmClmLevelRc,DT_1_CLM_CLM_LEVEL_RC_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmClmLevelRc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmClmLevelRc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmClmLevelRc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmAdjNbr
	 *	@return dt1ClmAdjNbr
	 */
	public int getDt1ClmAdjNbr() throws CFException {
       if (isDt1ClmAdjNbrModified()) { 
           dt1ClmAdjNbr = refreshDt1ClmAdjNbr();
        }
   		return dt1ClmAdjNbr;
	}
	

    /**
	 *	Returns the String value of dt1ClmAdjNbr
	 *	@return dt1ClmAdjNbr
	 */
	public char[]  getDt1ClmAdjNbrActualString() {
	    String value = String.valueOf(dt1ClmAdjNbr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Dt1ClmAdjNbr with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-ADJ-NBR
	 *	@param number
	 */
	public void setDt1ClmAdjNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmAdjNbr = checkDt1ClmAdjNbrMaxLimit(number); 
		serializeDt1ClmAdjNbr(dt1ClmAdjNbr);
	}
	

	public void setDt1ClmAdjNbr(long number) {
	    number = checkDt1ClmAdjNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ClmAdjNbr((int)number);
	}
	
	/**
	 * 	Update Dt1ClmAdjNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmAdjNbr(char[] value) throws CFException {
		 dt1ClmAdjNbr = serializeDt1ClmAdjNbr(value);
	}
	/**
	 * 	Update Dt1ClmAdjNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmAdjNbrString(char[] value) throws CFException {
		 setDt1ClmAdjNbr(value);
	}
	/**
	 *	Returns the value of dt1ClmAdjInd
	 *	@return dt1ClmAdjInd
	 */
   public char[] getDt1ClmAdjInd() throws CFException{
     if (isDt1ClmAdjIndModified()) { 
        dt1ClmAdjInd = refreshDt1ClmAdjInd();
     }
   		return dt1ClmAdjInd;
   }

  
	/**
	*  set variable dt1ClmAdjInd
	*  Corresponding COBOL Variable is DT1-CLM-ADJ-IND
	*  @param value
	**/
   public void setDt1ClmAdjInd(char[] value) {
      dt1ClmAdjInd = checkDt1ClmAdjIndConstraints(value);
      serializeDt1ClmAdjInd(dt1ClmAdjInd);
   } 

     /**
	 * 	Update Dt1ClmAdjInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmAdjInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmAdjInd,dt1ClmAdjInd.length);
   	
   }
   
   public void setDt1ClmAdjInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAdjInd,dt1ClmAdjInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmAdjInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAdjInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAdjInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmAdjInd with another Field
	 *	@param value
	 */
   public void setDt1ClmAdjInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmAdjInd,DT_1_CLM_ADJ_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmAdjInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmAdjInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmAdjInd,DT_1_CLM_ADJ_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmAdjInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAdjInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAdjInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmPpoInd
	 *	@return dt1ClmPpoInd
	 */
   public char[] getDt1ClmPpoInd() throws CFException{
     if (isDt1ClmPpoIndModified()) { 
        dt1ClmPpoInd = refreshDt1ClmPpoInd();
     }
   		return dt1ClmPpoInd;
   }

  
	/**
	*  set variable dt1ClmPpoInd
	*  Corresponding COBOL Variable is DT1-CLM-PPO-IND
	*  @param value
	**/
   public void setDt1ClmPpoInd(char[] value) {
      dt1ClmPpoInd = checkDt1ClmPpoIndConstraints(value);
      serializeDt1ClmPpoInd(dt1ClmPpoInd);
   } 

     /**
	 * 	Update Dt1ClmPpoInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmPpoInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmPpoInd,dt1ClmPpoInd.length);
   	
   }
   
   public void setDt1ClmPpoInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPpoInd,dt1ClmPpoInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmPpoInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPpoInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPpoInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmPpoInd with another Field
	 *	@param value
	 */
   public void setDt1ClmPpoInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmPpoInd,DT_1_CLM_PPO_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmPpoInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmPpoInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmPpoInd,DT_1_CLM_PPO_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmPpoInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPpoInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPpoInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmClmPhiInd
	 *	@return dt1ClmClmPhiInd
	 */
   public char[] getDt1ClmClmPhiInd() throws CFException{
     if (isDt1ClmClmPhiIndModified()) { 
        dt1ClmClmPhiInd = refreshDt1ClmClmPhiInd();
     }
   		return dt1ClmClmPhiInd;
   }

  
	/**
	*  set variable dt1ClmClmPhiInd
	*  Corresponding COBOL Variable is DT1-CLM-CLM-PHI-IND
	*  @param value
	**/
   public void setDt1ClmClmPhiInd(char[] value) {
      dt1ClmClmPhiInd = checkDt1ClmClmPhiIndConstraints(value);
      serializeDt1ClmClmPhiInd(dt1ClmClmPhiInd);
   } 

     /**
	 * 	Update Dt1ClmClmPhiInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmClmPhiInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmClmPhiInd,dt1ClmClmPhiInd.length);
   	
   }
   
   public void setDt1ClmClmPhiInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmClmPhiInd,dt1ClmClmPhiInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmClmPhiInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmClmPhiInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmClmPhiInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmClmPhiInd with another Field
	 *	@param value
	 */
   public void setDt1ClmClmPhiInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmClmPhiInd,DT_1_CLM_CLM_PHI_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmClmPhiInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmClmPhiInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmClmPhiInd,DT_1_CLM_CLM_PHI_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmClmPhiInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmClmPhiInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmClmPhiInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmT1ProcessInd
	 *	@return dt1ClmT1ProcessInd
	 */
   public char[] getDt1ClmT1ProcessInd() throws CFException{
     if (isDt1ClmT1ProcessIndModified()) { 
        dt1ClmT1ProcessInd = refreshDt1ClmT1ProcessInd();
     }
   		return dt1ClmT1ProcessInd;
   }

  
	/**
	*  set variable dt1ClmT1ProcessInd
	*  Corresponding COBOL Variable is DT1-CLM-T1-PROCESS-IND
	*  @param value
	**/
   public void setDt1ClmT1ProcessInd(char[] value) {
      dt1ClmT1ProcessInd = checkDt1ClmT1ProcessIndConstraints(value);
      serializeDt1ClmT1ProcessInd(dt1ClmT1ProcessInd);
   } 

     /**
	 * 	Update Dt1ClmT1ProcessInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmT1ProcessInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmT1ProcessInd,dt1ClmT1ProcessInd.length);
   	
   }
   
   public void setDt1ClmT1ProcessInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmT1ProcessInd,dt1ClmT1ProcessInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmT1ProcessInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmT1ProcessInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmT1ProcessInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmT1ProcessInd with another Field
	 *	@param value
	 */
   public void setDt1ClmT1ProcessInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmT1ProcessInd,DT_1_CLM_T_1_PROCESS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmT1ProcessInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmT1ProcessInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmT1ProcessInd,DT_1_CLM_T_1_PROCESS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmT1ProcessInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmT1ProcessInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmT1ProcessInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmDlgteInd
	 *	@return dt1ClmDlgteInd
	 */
   public char[] getDt1ClmDlgteInd() throws CFException{
     if (isDt1ClmDlgteIndModified()) { 
        dt1ClmDlgteInd = refreshDt1ClmDlgteInd();
     }
   		return dt1ClmDlgteInd;
   }

  
	/**
	*  set variable dt1ClmDlgteInd
	*  Corresponding COBOL Variable is DT1-CLM-DLGTE-IND
	*  @param value
	**/
   public void setDt1ClmDlgteInd(char[] value) {
      dt1ClmDlgteInd = checkDt1ClmDlgteIndConstraints(value);
      serializeDt1ClmDlgteInd(dt1ClmDlgteInd);
   } 

     /**
	 * 	Update Dt1ClmDlgteInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmDlgteInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmDlgteInd,dt1ClmDlgteInd.length);
   	
   }
   
   public void setDt1ClmDlgteInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmDlgteInd,dt1ClmDlgteInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmDlgteInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmDlgteInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmDlgteInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmDlgteInd with another Field
	 *	@param value
	 */
   public void setDt1ClmDlgteInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmDlgteInd,DT_1_CLM_DLGTE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmDlgteInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmDlgteInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmDlgteInd,DT_1_CLM_DLGTE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmDlgteInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmDlgteInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmDlgteInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmAuthNbr
	 *	@return dt1ClmAuthNbr
	 */
   public char[] getDt1ClmAuthNbr() throws CFException{
     if (isDt1ClmAuthNbrModified()) { 
        dt1ClmAuthNbr = refreshDt1ClmAuthNbr();
     }
   		return dt1ClmAuthNbr;
   }

  
	/**
	*  set variable dt1ClmAuthNbr
	*  Corresponding COBOL Variable is DT1-CLM-AUTH-NBR
	*  @param value
	**/
   public void setDt1ClmAuthNbr(char[] value) {
      dt1ClmAuthNbr = checkDt1ClmAuthNbrConstraints(value);
      serializeDt1ClmAuthNbr(dt1ClmAuthNbr);
   } 

     /**
	 * 	Update Dt1ClmAuthNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmAuthNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmAuthNbr,dt1ClmAuthNbr.length);
   	
   }
   
   public void setDt1ClmAuthNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthNbr,dt1ClmAuthNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmAuthNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAuthNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmAuthNbr with another Field
	 *	@param value
	 */
   public void setDt1ClmAuthNbr(Field source) {
       replace(source,0,source.length(),beginDt1ClmAuthNbr,DT_1_CLM_AUTH_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmAuthNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmAuthNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmAuthNbr,DT_1_CLM_AUTH_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmAuthNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAuthNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmAuthSrcId
	 *	@return dt1ClmAuthSrcId
	 */
   public char[] getDt1ClmAuthSrcId() throws CFException{
     if (isDt1ClmAuthSrcIdModified()) { 
        dt1ClmAuthSrcId = refreshDt1ClmAuthSrcId();
     }
   		return dt1ClmAuthSrcId;
   }

  
	/**
	*  set variable dt1ClmAuthSrcId
	*  Corresponding COBOL Variable is DT1-CLM-AUTH-SRC-ID
	*  @param value
	**/
   public void setDt1ClmAuthSrcId(char[] value) {
      dt1ClmAuthSrcId = checkDt1ClmAuthSrcIdConstraints(value);
      serializeDt1ClmAuthSrcId(dt1ClmAuthSrcId);
   } 

     /**
	 * 	Update Dt1ClmAuthSrcId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmAuthSrcId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmAuthSrcId,dt1ClmAuthSrcId.length);
   	
   }
   
   public void setDt1ClmAuthSrcId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthSrcId,dt1ClmAuthSrcId.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmAuthSrcId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAuthSrcId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthSrcId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmAuthSrcId with another Field
	 *	@param value
	 */
   public void setDt1ClmAuthSrcId(Field source) {
       replace(source,0,source.length(),beginDt1ClmAuthSrcId,DT_1_CLM_AUTH_SRC_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmAuthSrcId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmAuthSrcId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmAuthSrcId,DT_1_CLM_AUTH_SRC_ID_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmAuthSrcId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAuthSrcId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthSrcId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmAuthProcCd
	 *	@return dt1ClmAuthProcCd
	 */
   public char[] getDt1ClmAuthProcCd() throws CFException{
     if (isDt1ClmAuthProcCdModified()) { 
        dt1ClmAuthProcCd = refreshDt1ClmAuthProcCd();
     }
   		return dt1ClmAuthProcCd;
   }

  
	/**
	*  set variable dt1ClmAuthProcCd
	*  Corresponding COBOL Variable is DT1-CLM-AUTH-PROC-CD
	*  @param value
	**/
   public void setDt1ClmAuthProcCd(char[] value) {
      dt1ClmAuthProcCd = checkDt1ClmAuthProcCdConstraints(value);
      serializeDt1ClmAuthProcCd(dt1ClmAuthProcCd);
   } 

     /**
	 * 	Update Dt1ClmAuthProcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmAuthProcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmAuthProcCd,dt1ClmAuthProcCd.length);
   	
   }
   
   public void setDt1ClmAuthProcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthProcCd,dt1ClmAuthProcCd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmAuthProcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAuthProcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthProcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmAuthProcCd with another Field
	 *	@param value
	 */
   public void setDt1ClmAuthProcCd(Field source) {
       replace(source,0,source.length(),beginDt1ClmAuthProcCd,DT_1_CLM_AUTH_PROC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmAuthProcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmAuthProcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmAuthProcCd,DT_1_CLM_AUTH_PROC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmAuthProcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAuthProcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthProcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmAuthClmLevelInd
	 *	@return dt1ClmAuthClmLevelInd
	 */
   public char[] getDt1ClmAuthClmLevelInd() throws CFException{
     if (isDt1ClmAuthClmLevelIndModified()) { 
        dt1ClmAuthClmLevelInd = refreshDt1ClmAuthClmLevelInd();
     }
   		return dt1ClmAuthClmLevelInd;
   }

  
	/**
	*  set variable dt1ClmAuthClmLevelInd
	*  Corresponding COBOL Variable is DT1-CLM-AUTH-CLM-LEVEL-IND
	*  @param value
	**/
   public void setDt1ClmAuthClmLevelInd(char[] value) {
      dt1ClmAuthClmLevelInd = checkDt1ClmAuthClmLevelIndConstraints(value);
      serializeDt1ClmAuthClmLevelInd(dt1ClmAuthClmLevelInd);
   } 

     /**
	 * 	Update Dt1ClmAuthClmLevelInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmAuthClmLevelInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmAuthClmLevelInd,dt1ClmAuthClmLevelInd.length);
   	
   }
   
   public void setDt1ClmAuthClmLevelInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthClmLevelInd,dt1ClmAuthClmLevelInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmAuthClmLevelInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAuthClmLevelInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthClmLevelInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmAuthClmLevelInd with another Field
	 *	@param value
	 */
   public void setDt1ClmAuthClmLevelInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmAuthClmLevelInd,DT_1_CLM_AUTH_CLM_LEVEL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmAuthClmLevelInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmAuthClmLevelInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmAuthClmLevelInd,DT_1_CLM_AUTH_CLM_LEVEL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmAuthClmLevelInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmAuthClmLevelInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmAuthClmLevelInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmAuthUniqueCnt
	 *	@return dt1ClmAuthUniqueCnt
	 */
	public int getDt1ClmAuthUniqueCnt() throws CFException {
       if (isDt1ClmAuthUniqueCntModified()) { 
           dt1ClmAuthUniqueCnt = refreshDt1ClmAuthUniqueCnt();
        }
   		return dt1ClmAuthUniqueCnt;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmAuthUniqueCnt with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-AUTH-UNIQUE-CNT
	 *	@param number
	 */
	public void setDt1ClmAuthUniqueCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmAuthUniqueCnt = checkDt1ClmAuthUniqueCntMaxLimit(number); 
		serializeDt1ClmAuthUniqueCnt(dt1ClmAuthUniqueCnt);
	}
	

	public void setDt1ClmAuthUniqueCnt(long number) {
	    number = checkDt1ClmAuthUniqueCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ClmAuthUniqueCnt((int)number);
	}
	
	/**
	 * 	Update Dt1ClmAuthUniqueCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmAuthUniqueCnt(char[] value) throws CFException {
		 dt1ClmAuthUniqueCnt = serializeDt1ClmAuthUniqueCnt(value);
	}
	/**
	 * 	Update Dt1ClmAuthUniqueCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmAuthUniqueCntString(char[] value) throws CFException {
		 setDt1ClmAuthUniqueCnt(value);
	}
	/**
	 *	Returns the value of dt1ClmPrimaryDiagnosis
	 *	@return dt1ClmPrimaryDiagnosis
	 */
   public char[] getDt1ClmPrimaryDiagnosis() throws CFException{
     if (isDt1ClmPrimaryDiagnosisModified()) { 
        dt1ClmPrimaryDiagnosis = refreshDt1ClmPrimaryDiagnosis();
     }
   		return dt1ClmPrimaryDiagnosis;
   }

  
	/**
	*  set variable dt1ClmPrimaryDiagnosis
	*  Corresponding COBOL Variable is DT1-CLM-PRIMARY-DIAGNOSIS
	*  @param value
	**/
   public void setDt1ClmPrimaryDiagnosis(char[] value) {
      dt1ClmPrimaryDiagnosis = checkDt1ClmPrimaryDiagnosisConstraints(value);
      serializeDt1ClmPrimaryDiagnosis(dt1ClmPrimaryDiagnosis);
   } 

     /**
	 * 	Update Dt1ClmPrimaryDiagnosis 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmPrimaryDiagnosis(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmPrimaryDiagnosis,dt1ClmPrimaryDiagnosis.length);
   	
   }
   
   public void setDt1ClmPrimaryDiagnosis(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPrimaryDiagnosis,dt1ClmPrimaryDiagnosis.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmPrimaryDiagnosis 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPrimaryDiagnosis(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPrimaryDiagnosis+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmPrimaryDiagnosis with another Field
	 *	@param value
	 */
   public void setDt1ClmPrimaryDiagnosis(Field source) {
       replace(source,0,source.length(),beginDt1ClmPrimaryDiagnosis,DT_1_CLM_PRIMARY_DIAGNOSIS_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmPrimaryDiagnosis 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmPrimaryDiagnosis(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmPrimaryDiagnosis,DT_1_CLM_PRIMARY_DIAGNOSIS_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmPrimaryDiagnosis 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPrimaryDiagnosis(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPrimaryDiagnosis+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmParsWaivInd
	 *	@return dt1ClmParsWaivInd
	 */
   public char[] getDt1ClmParsWaivInd() throws CFException{
     if (isDt1ClmParsWaivIndModified()) { 
        dt1ClmParsWaivInd = refreshDt1ClmParsWaivInd();
     }
   		return dt1ClmParsWaivInd;
   }

  
	/**
	*  set variable dt1ClmParsWaivInd
	*  Corresponding COBOL Variable is DT1-CLM-PARS-WAIV-IND
	*  @param value
	**/
   public void setDt1ClmParsWaivInd(char[] value) {
      dt1ClmParsWaivInd = checkDt1ClmParsWaivIndConstraints(value);
      serializeDt1ClmParsWaivInd(dt1ClmParsWaivInd);
   } 

     /**
	 * 	Update Dt1ClmParsWaivInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmParsWaivInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmParsWaivInd,dt1ClmParsWaivInd.length);
   	
   }
   
   public void setDt1ClmParsWaivInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmParsWaivInd,dt1ClmParsWaivInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmParsWaivInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmParsWaivInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmParsWaivInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmParsWaivInd with another Field
	 *	@param value
	 */
   public void setDt1ClmParsWaivInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmParsWaivInd,DT_1_CLM_PARS_WAIV_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmParsWaivInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmParsWaivInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmParsWaivInd,DT_1_CLM_PARS_WAIV_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmParsWaivInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmParsWaivInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmParsWaivInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmParInd
	 *	@return dt1ClmParInd
	 */
   public char[] getDt1ClmParInd() throws CFException{
     if (isDt1ClmParIndModified()) { 
        dt1ClmParInd = refreshDt1ClmParInd();
     }
   		return dt1ClmParInd;
   }

  
	/**
	*  set variable dt1ClmParInd
	*  Corresponding COBOL Variable is DT1-CLM-PAR-IND
	*  @param value
	**/
   public void setDt1ClmParInd(char[] value) {
      dt1ClmParInd = checkDt1ClmParIndConstraints(value);
      serializeDt1ClmParInd(dt1ClmParInd);
   } 

     /**
	 * 	Update Dt1ClmParInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmParInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmParInd,dt1ClmParInd.length);
   	
   }
   
   public void setDt1ClmParInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmParInd,dt1ClmParInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmParInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmParInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmParInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmParInd with another Field
	 *	@param value
	 */
   public void setDt1ClmParInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmParInd,DT_1_CLM_PAR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmParInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmParInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmParInd,DT_1_CLM_PAR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmParInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmParInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmParInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmNonParInd
	 *	@return dt1ClmNonParInd
	 */
   public char[] getDt1ClmNonParInd() throws CFException{
     if (isDt1ClmNonParIndModified()) { 
        dt1ClmNonParInd = refreshDt1ClmNonParInd();
     }
   		return dt1ClmNonParInd;
   }

  
	/**
	*  set variable dt1ClmNonParInd
	*  Corresponding COBOL Variable is DT1-CLM-NON-PAR-IND
	*  @param value
	**/
   public void setDt1ClmNonParInd(char[] value) {
      dt1ClmNonParInd = checkDt1ClmNonParIndConstraints(value);
      serializeDt1ClmNonParInd(dt1ClmNonParInd);
   } 

     /**
	 * 	Update Dt1ClmNonParInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmNonParInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmNonParInd,dt1ClmNonParInd.length);
   	
   }
   
   public void setDt1ClmNonParInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmNonParInd,dt1ClmNonParInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmNonParInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmNonParInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmNonParInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmNonParInd with another Field
	 *	@param value
	 */
   public void setDt1ClmNonParInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmNonParInd,DT_1_CLM_NON_PAR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmNonParInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmNonParInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmNonParInd,DT_1_CLM_NON_PAR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmNonParInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmNonParInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmNonParInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmProviderTier
	 *	@return dt1ClmProviderTier
	 */
   public char[] getDt1ClmProviderTier() throws CFException{
     if (isDt1ClmProviderTierModified()) { 
        dt1ClmProviderTier = refreshDt1ClmProviderTier();
     }
   		return dt1ClmProviderTier;
   }

  
	/**
	*  set variable dt1ClmProviderTier
	*  Corresponding COBOL Variable is DT1-CLM-PROVIDER-TIER
	*  @param value
	**/
   public void setDt1ClmProviderTier(char[] value) {
      dt1ClmProviderTier = checkDt1ClmProviderTierConstraints(value);
      serializeDt1ClmProviderTier(dt1ClmProviderTier);
   } 

     /**
	 * 	Update Dt1ClmProviderTier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmProviderTier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmProviderTier,dt1ClmProviderTier.length);
   	
   }
   
   public void setDt1ClmProviderTier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProviderTier,dt1ClmProviderTier.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmProviderTier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProviderTier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProviderTier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmProviderTier with another Field
	 *	@param value
	 */
   public void setDt1ClmProviderTier(Field source) {
       replace(source,0,source.length(),beginDt1ClmProviderTier,DT_1_CLM_PROVIDER_TIER_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmProviderTier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmProviderTier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmProviderTier,DT_1_CLM_PROVIDER_TIER_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmProviderTier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProviderTier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProviderTier+targetIndex,targetLen);
    
   }
	char[] dt1ClmProviderTierT188Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isDt1ClmProviderTierT1()
	 *	@return  Returns true if isDt1ClmProviderTierT1() is "T"
	 */
   public boolean isDt1ClmProviderTierT1() throws CFException {
      return (  compareChars( getDt1ClmProviderTier() , dt1ClmProviderTierT188Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setDt1ClmProviderTierT1True() {  			
    	setDt1ClmProviderTier( dt1ClmProviderTierT188Value);
   	}
	char[] dt1ClmProviderTierInn88Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isDt1ClmProviderTierInn()
	 *	@return  Returns true if isDt1ClmProviderTierInn() is "I"
	 */
   public boolean isDt1ClmProviderTierInn() throws CFException {
      return (  compareChars( getDt1ClmProviderTier() , dt1ClmProviderTierInn88Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setDt1ClmProviderTierInnTrue() {  			
    	setDt1ClmProviderTier( dt1ClmProviderTierInn88Value);
   	}
	char[] dt1ClmProviderTierOon88Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isDt1ClmProviderTierOon()
	 *	@return  Returns true if isDt1ClmProviderTierOon() is "O"
	 */
   public boolean isDt1ClmProviderTierOon() throws CFException {
      return (  compareChars( getDt1ClmProviderTier() , dt1ClmProviderTierOon88Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setDt1ClmProviderTierOonTrue() {  			
    	setDt1ClmProviderTier( dt1ClmProviderTierOon88Value);
   	}
	/**
	 *	Returns the value of dt1ClmTpsmCd
	 *	@return dt1ClmTpsmCd
	 */
   public char[] getDt1ClmTpsmCd() throws CFException{
     if (isDt1ClmTpsmCdModified()) { 
        dt1ClmTpsmCd = refreshDt1ClmTpsmCd();
     }
   		return dt1ClmTpsmCd;
   }

  
	/**
	*  set variable dt1ClmTpsmCd
	*  Corresponding COBOL Variable is DT1-CLM-TPSM-CD
	*  @param value
	**/
   public void setDt1ClmTpsmCd(char[] value) {
      dt1ClmTpsmCd = checkDt1ClmTpsmCdConstraints(value);
      serializeDt1ClmTpsmCd(dt1ClmTpsmCd);
   } 

     /**
	 * 	Update Dt1ClmTpsmCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmTpsmCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmTpsmCd,dt1ClmTpsmCd.length);
   	
   }
   
   public void setDt1ClmTpsmCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmTpsmCd,dt1ClmTpsmCd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmTpsmCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmTpsmCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmTpsmCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmTpsmCd with another Field
	 *	@param value
	 */
   public void setDt1ClmTpsmCd(Field source) {
       replace(source,0,source.length(),beginDt1ClmTpsmCd,DT_1_CLM_TPSM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmTpsmCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmTpsmCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmTpsmCd,DT_1_CLM_TPSM_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmTpsmCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmTpsmCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmTpsmCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmMskInd
	 *	@return dt1ClmMskInd
	 */
   public char[] getDt1ClmMskInd() throws CFException{
     if (isDt1ClmMskIndModified()) { 
        dt1ClmMskInd = refreshDt1ClmMskInd();
     }
   		return dt1ClmMskInd;
   }

  
	/**
	*  set variable dt1ClmMskInd
	*  Corresponding COBOL Variable is DT1-CLM-MSK-IND
	*  @param value
	**/
   public void setDt1ClmMskInd(char[] value) {
      dt1ClmMskInd = checkDt1ClmMskIndConstraints(value);
      serializeDt1ClmMskInd(dt1ClmMskInd);
   } 

     /**
	 * 	Update Dt1ClmMskInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmMskInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmMskInd,dt1ClmMskInd.length);
   	
   }
   
   public void setDt1ClmMskInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmMskInd,dt1ClmMskInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmMskInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmMskInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmMskInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmMskInd with another Field
	 *	@param value
	 */
   public void setDt1ClmMskInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmMskInd,DT_1_CLM_MSK_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmMskInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmMskInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmMskInd,DT_1_CLM_MSK_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmMskInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmMskInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmMskInd+targetIndex,targetLen);
    
   }
	char[] dt1ClmMskUsed88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDt1ClmMskUsed()
	 *	@return  Returns true if isDt1ClmMskUsed() is "Y"
	 */
   public boolean isDt1ClmMskUsed() throws CFException {
      return (  compareChars( getDt1ClmMskInd() , dt1ClmMskUsed88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDt1ClmMskUsedTrue() {  			
    	setDt1ClmMskInd( dt1ClmMskUsed88Value);
   	}
	char[] dt1ClmMskNotUsed88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDt1ClmMskNotUsed()
	 *	@return  Returns true if isDt1ClmMskNotUsed() is "N"
	 */
   public boolean isDt1ClmMskNotUsed() throws CFException {
      return (  compareChars( getDt1ClmMskInd() , dt1ClmMskNotUsed88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDt1ClmMskNotUsedTrue() {  			
    	setDt1ClmMskInd( dt1ClmMskNotUsed88Value);
   	}
	/**
	 *	Returns the value of dt1ClmPtntRespAmt
	 *	@return dt1ClmPtntRespAmt
	 */
   public char[] getDt1ClmPtntRespAmt() throws CFException{
     if (isDt1ClmPtntRespAmtModified()) { 
        dt1ClmPtntRespAmt = refreshDt1ClmPtntRespAmt();
     }
   		return dt1ClmPtntRespAmt;
   }

  
	/**
	*  set variable dt1ClmPtntRespAmt
	*  Corresponding COBOL Variable is DT1-CLM-PTNT-RESP-AMT
	*  @param value
	**/
   public void setDt1ClmPtntRespAmt(char[] value) {
      dt1ClmPtntRespAmt = checkDt1ClmPtntRespAmtConstraints(value);
      serializeDt1ClmPtntRespAmt(dt1ClmPtntRespAmt);
   } 

     /**
	 * 	Update Dt1ClmPtntRespAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmPtntRespAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmPtntRespAmt,dt1ClmPtntRespAmt.length);
   	
   }
   
   public void setDt1ClmPtntRespAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPtntRespAmt,dt1ClmPtntRespAmt.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmPtntRespAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPtntRespAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPtntRespAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmPtntRespAmt with another Field
	 *	@param value
	 */
   public void setDt1ClmPtntRespAmt(Field source) {
       replace(source,0,source.length(),beginDt1ClmPtntRespAmt,DT_1_CLM_PTNT_RESP_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmPtntRespAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmPtntRespAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmPtntRespAmt,DT_1_CLM_PTNT_RESP_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmPtntRespAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmPtntRespAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmPtntRespAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmProvSpclCd
	 *	@return dt1ClmProvSpclCd
	 */
   public char[] getDt1ClmProvSpclCd() throws CFException{
     if (isDt1ClmProvSpclCdModified()) { 
        dt1ClmProvSpclCd = refreshDt1ClmProvSpclCd();
     }
   		return dt1ClmProvSpclCd;
   }

  
	/**
	*  set variable dt1ClmProvSpclCd
	*  Corresponding COBOL Variable is DT1-CLM-PROV-SPCL-CD
	*  @param value
	**/
   public void setDt1ClmProvSpclCd(char[] value) {
      dt1ClmProvSpclCd = checkDt1ClmProvSpclCdConstraints(value);
      serializeDt1ClmProvSpclCd(dt1ClmProvSpclCd);
   } 

     /**
	 * 	Update Dt1ClmProvSpclCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmProvSpclCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmProvSpclCd,dt1ClmProvSpclCd.length);
   	
   }
   
   public void setDt1ClmProvSpclCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProvSpclCd,dt1ClmProvSpclCd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmProvSpclCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProvSpclCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProvSpclCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmProvSpclCd with another Field
	 *	@param value
	 */
   public void setDt1ClmProvSpclCd(Field source) {
       replace(source,0,source.length(),beginDt1ClmProvSpclCd,DT_1_CLM_PROV_SPCL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmProvSpclCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmProvSpclCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmProvSpclCd,DT_1_CLM_PROV_SPCL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmProvSpclCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProvSpclCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProvSpclCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmNdbContrId
	 *	@return dt1ClmNdbContrId
	 */
   public char[] getDt1ClmNdbContrId() throws CFException{
     if (isDt1ClmNdbContrIdModified()) { 
        dt1ClmNdbContrId = refreshDt1ClmNdbContrId();
     }
   		return dt1ClmNdbContrId;
   }

  
	/**
	*  set variable dt1ClmNdbContrId
	*  Corresponding COBOL Variable is DT1-CLM-NDB-CONTR-ID
	*  @param value
	**/
   public void setDt1ClmNdbContrId(char[] value) {
      dt1ClmNdbContrId = checkDt1ClmNdbContrIdConstraints(value);
      serializeDt1ClmNdbContrId(dt1ClmNdbContrId);
   } 

     /**
	 * 	Update Dt1ClmNdbContrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmNdbContrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmNdbContrId,dt1ClmNdbContrId.length);
   	
   }
   
   public void setDt1ClmNdbContrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmNdbContrId,dt1ClmNdbContrId.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmNdbContrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmNdbContrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmNdbContrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmNdbContrId with another Field
	 *	@param value
	 */
   public void setDt1ClmNdbContrId(Field source) {
       replace(source,0,source.length(),beginDt1ClmNdbContrId,DT_1_CLM_NDB_CONTR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmNdbContrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmNdbContrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmNdbContrId,DT_1_CLM_NDB_CONTR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmNdbContrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmNdbContrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmNdbContrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmDrgNbr
	 *	@return dt1ClmDrgNbr
	 */
   public char[] getDt1ClmDrgNbr() throws CFException{
     if (isDt1ClmDrgNbrModified()) { 
        dt1ClmDrgNbr = refreshDt1ClmDrgNbr();
     }
   		return dt1ClmDrgNbr;
   }

  
	/**
	*  set variable dt1ClmDrgNbr
	*  Corresponding COBOL Variable is DT1-CLM-DRG-NBR
	*  @param value
	**/
   public void setDt1ClmDrgNbr(char[] value) {
      dt1ClmDrgNbr = checkDt1ClmDrgNbrConstraints(value);
      serializeDt1ClmDrgNbr(dt1ClmDrgNbr);
   } 

     /**
	 * 	Update Dt1ClmDrgNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmDrgNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmDrgNbr,dt1ClmDrgNbr.length);
   	
   }
   
   public void setDt1ClmDrgNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmDrgNbr,dt1ClmDrgNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmDrgNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmDrgNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmDrgNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmDrgNbr with another Field
	 *	@param value
	 */
   public void setDt1ClmDrgNbr(Field source) {
       replace(source,0,source.length(),beginDt1ClmDrgNbr,DT_1_CLM_DRG_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmDrgNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmDrgNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmDrgNbr,DT_1_CLM_DRG_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmDrgNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmDrgNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmDrgNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmProvMedcdReclmInd
	 *	@return dt1ClmProvMedcdReclmInd
	 */
   public char[] getDt1ClmProvMedcdReclmInd() throws CFException{
     if (isDt1ClmProvMedcdReclmIndModified()) { 
        dt1ClmProvMedcdReclmInd = refreshDt1ClmProvMedcdReclmInd();
     }
   		return dt1ClmProvMedcdReclmInd;
   }

  
	/**
	*  set variable dt1ClmProvMedcdReclmInd
	*  Corresponding COBOL Variable is DT1-CLM-PROV-MEDCD-RECLM-IND
	*  @param value
	**/
   public void setDt1ClmProvMedcdReclmInd(char[] value) {
      dt1ClmProvMedcdReclmInd = checkDt1ClmProvMedcdReclmIndConstraints(value);
      serializeDt1ClmProvMedcdReclmInd(dt1ClmProvMedcdReclmInd);
   } 

     /**
	 * 	Update Dt1ClmProvMedcdReclmInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmProvMedcdReclmInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmProvMedcdReclmInd,dt1ClmProvMedcdReclmInd.length);
   	
   }
   
   public void setDt1ClmProvMedcdReclmInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProvMedcdReclmInd,dt1ClmProvMedcdReclmInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmProvMedcdReclmInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProvMedcdReclmInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProvMedcdReclmInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmProvMedcdReclmInd with another Field
	 *	@param value
	 */
   public void setDt1ClmProvMedcdReclmInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmProvMedcdReclmInd,DT_1_CLM_PROV_MEDCD_RECLM_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmProvMedcdReclmInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmProvMedcdReclmInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmProvMedcdReclmInd,DT_1_CLM_PROV_MEDCD_RECLM_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmProvMedcdReclmInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmProvMedcdReclmInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmProvMedcdReclmInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmHospProfInd
	 *	@return dt1ClmHospProfInd
	 */
   public char[] getDt1ClmHospProfInd() throws CFException{
     if (isDt1ClmHospProfIndModified()) { 
        dt1ClmHospProfInd = refreshDt1ClmHospProfInd();
     }
   		return dt1ClmHospProfInd;
   }

  
	/**
	*  set variable dt1ClmHospProfInd
	*  Corresponding COBOL Variable is DT1-CLM-HOSP-PROF-IND
	*  @param value
	**/
   public void setDt1ClmHospProfInd(char[] value) {
      dt1ClmHospProfInd = checkDt1ClmHospProfIndConstraints(value);
      serializeDt1ClmHospProfInd(dt1ClmHospProfInd);
   } 

     /**
	 * 	Update Dt1ClmHospProfInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmHospProfInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmHospProfInd,dt1ClmHospProfInd.length);
   	
   }
   
   public void setDt1ClmHospProfInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmHospProfInd,dt1ClmHospProfInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmHospProfInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmHospProfInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmHospProfInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmHospProfInd with another Field
	 *	@param value
	 */
   public void setDt1ClmHospProfInd(Field source) {
       replace(source,0,source.length(),beginDt1ClmHospProfInd,DT_1_CLM_HOSP_PROF_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmHospProfInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmHospProfInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmHospProfInd,DT_1_CLM_HOSP_PROF_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmHospProfInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmHospProfInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmHospProfInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmSmbAppCd
	 *	@return dt1ClmSmbAppCd
	 */
   public char[] getDt1ClmSmbAppCd() throws CFException{
     if (isDt1ClmSmbAppCdModified()) { 
        dt1ClmSmbAppCd = refreshDt1ClmSmbAppCd();
     }
   		return dt1ClmSmbAppCd;
   }

  
	/**
	*  set variable dt1ClmSmbAppCd
	*  Corresponding COBOL Variable is DT1-CLM-SMB-APP-CD
	*  @param value
	**/
   public void setDt1ClmSmbAppCd(char[] value) {
      dt1ClmSmbAppCd = checkDt1ClmSmbAppCdConstraints(value);
      serializeDt1ClmSmbAppCd(dt1ClmSmbAppCd);
   } 

     /**
	 * 	Update Dt1ClmSmbAppCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmSmbAppCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmSmbAppCd,dt1ClmSmbAppCd.length);
   	
   }
   
   public void setDt1ClmSmbAppCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmSmbAppCd,dt1ClmSmbAppCd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmSmbAppCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmSmbAppCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmSmbAppCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmSmbAppCd with another Field
	 *	@param value
	 */
   public void setDt1ClmSmbAppCd(Field source) {
       replace(source,0,source.length(),beginDt1ClmSmbAppCd,DT_1_CLM_SMB_APP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmSmbAppCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmSmbAppCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmSmbAppCd,DT_1_CLM_SMB_APP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmSmbAppCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmSmbAppCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmSmbAppCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmSmbStCd
	 *	@return dt1ClmSmbStCd
	 */
   public char[] getDt1ClmSmbStCd() throws CFException{
     if (isDt1ClmSmbStCdModified()) { 
        dt1ClmSmbStCd = refreshDt1ClmSmbStCd();
     }
   		return dt1ClmSmbStCd;
   }

  
	/**
	*  set variable dt1ClmSmbStCd
	*  Corresponding COBOL Variable is DT1-CLM-SMB-ST-CD
	*  @param value
	**/
   public void setDt1ClmSmbStCd(char[] value) {
      dt1ClmSmbStCd = checkDt1ClmSmbStCdConstraints(value);
      serializeDt1ClmSmbStCd(dt1ClmSmbStCd);
   } 

     /**
	 * 	Update Dt1ClmSmbStCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmSmbStCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmSmbStCd,dt1ClmSmbStCd.length);
   	
   }
   
   public void setDt1ClmSmbStCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmSmbStCd,dt1ClmSmbStCd.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmSmbStCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmSmbStCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmSmbStCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmSmbStCd with another Field
	 *	@param value
	 */
   public void setDt1ClmSmbStCd(Field source) {
       replace(source,0,source.length(),beginDt1ClmSmbStCd,DT_1_CLM_SMB_ST_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmSmbStCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmSmbStCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmSmbStCd,DT_1_CLM_SMB_ST_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmSmbStCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmSmbStCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmSmbStCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ClmItemFillerArea
	 *	@return dt1ClmItemFillerArea
	 */
   public char[] getDt1ClmItemFillerArea() throws CFException{
     if (isDt1ClmItemFillerAreaModified()) { 
        dt1ClmItemFillerArea = refreshDt1ClmItemFillerArea();
     }
   		return dt1ClmItemFillerArea;
   }

  
	/**
	*  set variable dt1ClmItemFillerArea
	*  Corresponding COBOL Variable is DT1-CLM-ITEM-FILLER-AREA
	*  @param value
	**/
   public void setDt1ClmItemFillerArea(char[] value) {
      dt1ClmItemFillerArea = checkDt1ClmItemFillerAreaConstraints(value);
      serializeDt1ClmItemFillerArea(dt1ClmItemFillerArea);
   } 

     /**
	 * 	Update Dt1ClmItemFillerArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmItemFillerArea(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClmItemFillerArea,dt1ClmItemFillerArea.length);
   	
   }
   
   public void setDt1ClmItemFillerArea(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmItemFillerArea,dt1ClmItemFillerArea.length);
   	
   }
   
     /**
	 * 	Update Dt1ClmItemFillerArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmItemFillerArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmItemFillerArea+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClmItemFillerArea with another Field
	 *	@param value
	 */
   public void setDt1ClmItemFillerArea(Field source) {
       replace(source,0,source.length(),beginDt1ClmItemFillerArea,DT_1_CLM_ITEM_FILLER_AREA_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClmItemFillerArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClmItemFillerArea(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClmItemFillerArea,DT_1_CLM_ITEM_FILLER_AREA_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClmItemFillerArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmItemFillerArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClmItemFillerArea+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Dt1ClmClaimItem
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1ClmFilmOffice(0);
                     setDt1ClmFln(0);
         setDt1ClmIcn(CONSTANTS.SPACE_10);
                     setDt1ClmSuffixCd(0);
         setDt1ClmProcDt(CONSTANTS.SPACE_10);
         setDt1ClmProcTm(CONSTANTS.SPACE_8);
         setDt1ClmFlnFormatDt(CONSTANTS.SPACE_10);
                     setDt1ClmHeaderCt(0);
                     setDt1ClmDraftNo(0);
                     setDt1ClmFirstServiceDate(0);
                     setDt1ClmLastServiceDate(0);
         setDt1ClmProviderName(CONSTANTS.SPACE_40);
          dt1ClmProviderId.initialize();
     
                    setDt1ClmChargeAmount(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
                    setDt1ClmPaidAmount(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
                    setDt1ClmDeductibleAmount(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
          dt1ClmClaimStatus.initialize();
     
         setDt1ClmClmLevelRc(CONSTANTS.SPACE_2);
                     setDt1ClmAdjNbr(0);
         setDt1ClmAdjInd(CONSTANTS.SPACE);
         setDt1ClmPpoInd(CONSTANTS.SPACE);
         setDt1ClmClmPhiInd(CONSTANTS.SPACE);
         setDt1ClmT1ProcessInd(CONSTANTS.SPACE);
         setDt1ClmDlgteInd(CONSTANTS.SPACE_2);
         setDt1ClmAuthNbr(CONSTANTS.SPACE_50);
         setDt1ClmAuthSrcId(CONSTANTS.SPACE_3);
         setDt1ClmAuthProcCd(CONSTANTS.SPACE_5);
         setDt1ClmAuthClmLevelInd(CONSTANTS.SPACE);
                     setDt1ClmAuthUniqueCnt(0);
         setDt1ClmPrimaryDiagnosis(CONSTANTS.SPACE_7);
         setDt1ClmParsWaivInd(CONSTANTS.SPACE);
         setDt1ClmParInd(CONSTANTS.SPACE);
         setDt1ClmNonParInd(CONSTANTS.SPACE);
         setDt1ClmProviderTier(CONSTANTS.SPACE);
         setDt1ClmTpsmCd(CONSTANTS.SPACE_3);
         setDt1ClmMskInd(CONSTANTS.SPACE);
                    setDt1ClmPtntRespAmt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
         setDt1ClmProvSpclCd(CONSTANTS.SPACE_3);
         setDt1ClmNdbContrId(CONSTANTS.SPACE_9);
         setDt1ClmDrgNbr(CONSTANTS.SPACE_5);
         setDt1ClmProvMedcdReclmInd(CONSTANTS.SPACE);
         setDt1ClmHospProfInd(CONSTANTS.SPACE);
         setDt1ClmSmbAppCd(CONSTANTS.SPACE);
         setDt1ClmSmbStCd(CONSTANTS.SPACE_2);
         setDt1ClmItemFillerArea(CONSTANTS.SPACE_117);
   }

		public static int getDt1ClmClaimItemFieldLength() {
			return DT_1_CLM_CLAIM_ITEM_LENGTH;
		}

}
  
