package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HostVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HostVariables extends HostVariablesSerialized { 
   

						private char[] hvProcDt = new char[10];

						private char[] hvProcTm = new char[8];

						private char[] hvPgmIdLstCharVal = new char[1];

								private short hvIcnSufxVersNbr;
				private HvInvnCtlNbrGroup hvInvnCtlNbrGroup = new HvInvnCtlNbrGroup();

						private char[] hvIcnSufxCd = new char[3];

								private short hvLnId;
				private HvFstDtGroup hvFstDtGroup = new HvFstDtGroup();
				private HvLstSrvcDtGroup hvLstSrvcDtGroup = new HvLstSrvcDtGroup();

						private char[] hvProvTinsuff = new char[15];
				private HvProvTinsuffRedefined hvProvTinsuffRedefined = new HvProvTinsuffRedefined();

						private char[] hvProvTinsuff1 = new char[15];
				private HvProvTinsuff1Redefined hvProvTinsuff1Redefined = new HvProvTinsuff1Redefined();
				private HvFlnJulianDtNbrGroup hvFlnJulianDtNbrGroup = new HvFlnJulianDtNbrGroup();
				private HvFlnSrlNbrGroup hvFlnSrlNbrGroup = new HvFlnSrlNbrGroup();
				private HvFilmOfcNbrGroup hvFilmOfcNbrGroup = new HvFilmOfcNbrGroup();
				private HvAuthNbrGroup hvAuthNbrGroup = new HvAuthNbrGroup();
				private HvSrvcCatgyCdGroup hvSrvcCatgyCdGroup = new HvSrvcCatgyCdGroup();
				private HvSpiCtgyCd1Group hvSpiCtgyCd1Group = new HvSpiCtgyCd1Group();
				private HvSpiCtgyCd2Group hvSpiCtgyCd2Group = new HvSpiCtgyCd2Group();
				private HvSpiCtgyCd3Group hvSpiCtgyCd3Group = new HvSpiCtgyCd3Group();
				private HvSpiCtgyCd4Group hvSpiCtgyCd4Group = new HvSpiCtgyCd4Group();
				private HvSpiCtgyCd5Group hvSpiCtgyCd5Group = new HvSpiCtgyCd5Group();

						private char[] hvCptFrom = new char[7];

						private char[] hvCptThru = new char[7];

						private char[] hvRevFrom = new char[5];

						private char[] hvRevThru = new char[5];

						private char[] hvRemarkCd1 = new char[2];

						private char[] hvRemarkCd2 = new char[2];

						private char[] hvProvSpclCd1 = new char[3];

						private char[] hvProvSpclCd2 = new char[3];

						private char[] hvCauseCd1 = new char[1];

						private char[] hvCauseCd2 = new char[1];

						private char[] hvAppliedToOopInd = new char[1];
				private HvExtrNtfyNbrGroup hvExtrNtfyNbrGroup = new HvExtrNtfyNbrGroup();
				private HvNextKey hvNextKey = new HvNextKey();
	
	/**
	* Constructor for HostVariables
	**/
    public HostVariables() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			hvInvnCtlNbrGroup.setParent(this,getStartOffset() + 21);
	       			hvFstDtGroup.setParent(this,getStartOffset() + 36);
	       			hvLstSrvcDtGroup.setParent(this,getStartOffset() + 46);
	       			hvProvTinsuffRedefined.setParent(this,getStartOffset() + 56);
	       			hvProvTinsuff1Redefined.setParent(this,getStartOffset() + 71);
	       			hvFlnJulianDtNbrGroup.setParent(this,getStartOffset() + 86);
	       			hvFlnSrlNbrGroup.setParent(this,getStartOffset() + 91);
	       			hvFilmOfcNbrGroup.setParent(this,getStartOffset() + 96);
	       			hvAuthNbrGroup.setParent(this,getStartOffset() + 100);
	       			hvSrvcCatgyCdGroup.setParent(this,getStartOffset() + 110);
	       			hvSpiCtgyCd1Group.setParent(this,getStartOffset() + 112);
	       			hvSpiCtgyCd2Group.setParent(this,getStartOffset() + 114);
	       			hvSpiCtgyCd3Group.setParent(this,getStartOffset() + 116);
	       			hvSpiCtgyCd4Group.setParent(this,getStartOffset() + 118);
	       			hvSpiCtgyCd5Group.setParent(this,getStartOffset() + 120);
	       			hvExtrNtfyNbrGroup.setParent(this,getStartOffset() + 159);
	       			hvNextKey.setParent(this,getStartOffset() + 209);
	   	/*  end of offset */
								setHvProcDt(("9999-12-31").toCharArray());
								setHvProcTm(("23.59.59").toCharArray());
								setHvPgmIdLstCharVal(("9").toCharArray());
								setHvIcnSufxVersNbr((short)9999);
								setHvIcnSufxCd(("999").toCharArray());
								setHvLnId((short)9999);
								setHvProvTinsuff(("000000000000000").toCharArray());
								setHvProvTinsuff1(("999999999999999").toCharArray());
								setHvCptFrom(fillSpace(7));
								setHvCptThru(fillHighValue(7));
								setHvRevFrom(fillSpace(5));
								setHvRevThru(fillHighValue(5));
								setHvRemarkCd1(fillSpace(2));
								setHvRemarkCd2(fillHighValue(2));
								setHvProvSpclCd1(fillSpace(3));
								setHvProvSpclCd2(fillHighValue(3));
								setHvCauseCd1(fillSpace(1));
								setHvCauseCd2(fillHighValue(1));
								setHvAppliedToOopInd(fillSpace(1));
    }


 

	/**
	 *	Returns the value of hvProcDt
	 *	@return hvProcDt
	 */
   public char[] getHvProcDt() throws CFException{
     if (isHvProcDtModified()) { 
        hvProcDt = refreshHvProcDt();
     }
   		return hvProcDt;
   }

  
	/**
	*  set variable hvProcDt
	*  Corresponding COBOL Variable is HV-PROC-DT
	*  @param value
	**/
   public void setHvProcDt(char[] value) {
      hvProcDt = checkHvProcDtConstraints(value);
      serializeHvProcDt(hvProcDt);
   } 

     /**
	 * 	Update HvProcDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvProcDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvProcDt,hvProcDt.length);
   	
   }
   
   public void setHvProcDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvProcDt,hvProcDt.length);
   	
   }
   
     /**
	 * 	Update HvProcDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProcDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProcDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvProcDt with another Field
	 *	@param value
	 */
   public void setHvProcDt(Field source) {
       replace(source,0,source.length(),beginHvProcDt,HV_PROC_DT_LEN);
   	
   }  
   
     /**
	 * 	Update HvProcDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvProcDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvProcDt,HV_PROC_DT_LEN);
   	
   }
   
     /**
	 * 	Update HvProcDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProcDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProcDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvProcTm
	 *	@return hvProcTm
	 */
   public char[] getHvProcTm() throws CFException{
     if (isHvProcTmModified()) { 
        hvProcTm = refreshHvProcTm();
     }
   		return hvProcTm;
   }

  
	/**
	*  set variable hvProcTm
	*  Corresponding COBOL Variable is HV-PROC-TM
	*  @param value
	**/
   public void setHvProcTm(char[] value) {
      hvProcTm = checkHvProcTmConstraints(value);
      serializeHvProcTm(hvProcTm);
   } 

     /**
	 * 	Update HvProcTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvProcTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvProcTm,hvProcTm.length);
   	
   }
   
   public void setHvProcTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvProcTm,hvProcTm.length);
   	
   }
   
     /**
	 * 	Update HvProcTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProcTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProcTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvProcTm with another Field
	 *	@param value
	 */
   public void setHvProcTm(Field source) {
       replace(source,0,source.length(),beginHvProcTm,HV_PROC_TM_LEN);
   	
   }  
   
     /**
	 * 	Update HvProcTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvProcTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvProcTm,HV_PROC_TM_LEN);
   	
   }
   
     /**
	 * 	Update HvProcTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProcTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProcTm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvPgmIdLstCharVal
	 *	@return hvPgmIdLstCharVal
	 */
   public char[] getHvPgmIdLstCharVal() throws CFException{
     if (isHvPgmIdLstCharValModified()) { 
        hvPgmIdLstCharVal = refreshHvPgmIdLstCharVal();
     }
   		return hvPgmIdLstCharVal;
   }

  
	/**
	*  set variable hvPgmIdLstCharVal
	*  Corresponding COBOL Variable is HV-PGM_ID_LST_CHAR_VAL
	*  @param value
	**/
   public void setHvPgmIdLstCharVal(char[] value) {
      hvPgmIdLstCharVal = checkHvPgmIdLstCharValConstraints(value);
      serializeHvPgmIdLstCharVal(hvPgmIdLstCharVal);
   } 

     /**
	 * 	Update HvPgmIdLstCharVal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvPgmIdLstCharVal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvPgmIdLstCharVal,hvPgmIdLstCharVal.length);
   	
   }
   
   public void setHvPgmIdLstCharVal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvPgmIdLstCharVal,hvPgmIdLstCharVal.length);
   	
   }
   
     /**
	 * 	Update HvPgmIdLstCharVal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvPgmIdLstCharVal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvPgmIdLstCharVal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvPgmIdLstCharVal with another Field
	 *	@param value
	 */
   public void setHvPgmIdLstCharVal(Field source) {
       replace(source,0,source.length(),beginHvPgmIdLstCharVal,HV_PGM_ID_LST_CHAR_VAL_LEN);
   	
   }  
   
     /**
	 * 	Update HvPgmIdLstCharVal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvPgmIdLstCharVal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvPgmIdLstCharVal,HV_PGM_ID_LST_CHAR_VAL_LEN);
   	
   }
   
     /**
	 * 	Update HvPgmIdLstCharVal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvPgmIdLstCharVal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvPgmIdLstCharVal+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvIcnSufxVersNbr
	 *	@return hvIcnSufxVersNbr
	 */
	public short getHvIcnSufxVersNbr() throws CFException {
        if (isHvIcnSufxVersNbrModified()) { 
           hvIcnSufxVersNbr = refreshHvIcnSufxVersNbr();
        }
   		return hvIcnSufxVersNbr;
	}
	
	/**
	 * 	Update HvIcnSufxVersNbr with the passed value
	 *  Corresponding COBOL Variable is HV-ICN_SUFX_VERS_NBR
	 *	@param number
	 */
	public void setHvIcnSufxVersNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    hvIcnSufxVersNbr = checkHvIcnSufxVersNbrMaxLimit(number); 
		serializeHvIcnSufxVersNbr(hvIcnSufxVersNbr);
	}

	public void setHvIcnSufxVersNbr(int number) {
	    number = checkHvIcnSufxVersNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvIcnSufxVersNbr((short)number);
	}
	public void setHvIcnSufxVersNbr(long number) {
	    number = checkHvIcnSufxVersNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvIcnSufxVersNbr((short)number);
	}
	

	/**
	 *	Returns the value of hvInvnCtlNbrGroup
	 *	@return hvInvnCtlNbrGroup
	 */   
	 public HvInvnCtlNbrGroup getHvInvnCtlNbrGroup() {
   	return hvInvnCtlNbrGroup;
   }
   /**
	* 	Update HvInvnCtlNbrGroup with the passed value
	*   Corresponding COBOL Variable is HV-INVN-CTL-NBR-GROUP
	*	@param value
	*/
   public void setHvInvnCtlNbrGroup(char[] value) {
      hvInvnCtlNbrGroup.setString(value); 
   }   
    
     /**
	 * 	Update HvInvnCtlNbrGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvInvnCtlNbrGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvInvnCtlNbrGroup.begin,hvInvnCtlNbrGroup.length());
   }
   
     /**
	 * 	Update HvInvnCtlNbrGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvInvnCtlNbrGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvInvnCtlNbrGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvInvnCtlNbrGroup with another Field
	 *	@param value
	 */
   public void setHvInvnCtlNbrGroup(Field source) {
   	replace(source,0,source.length(),hvInvnCtlNbrGroup.begin,hvInvnCtlNbrGroup.length());
   }  
   
     /**
	 * 	Update HvInvnCtlNbrGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvInvnCtlNbrGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvInvnCtlNbrGroup.begin,hvInvnCtlNbrGroup.length());
   }
   
     /**
	 * 	Update HvInvnCtlNbrGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvInvnCtlNbrGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvInvnCtlNbrGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvIcnSufxCd
	 *	@return hvIcnSufxCd
	 */
   public char[] getHvIcnSufxCd() throws CFException{
     if (isHvIcnSufxCdModified()) { 
        hvIcnSufxCd = refreshHvIcnSufxCd();
     }
   		return hvIcnSufxCd;
   }

  
	/**
	*  set variable hvIcnSufxCd
	*  Corresponding COBOL Variable is HV-ICN_SUFX_CD
	*  @param value
	**/
   public void setHvIcnSufxCd(char[] value) {
      hvIcnSufxCd = checkHvIcnSufxCdConstraints(value);
      serializeHvIcnSufxCd(hvIcnSufxCd);
   } 

     /**
	 * 	Update HvIcnSufxCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvIcnSufxCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvIcnSufxCd,hvIcnSufxCd.length);
   	
   }
   
   public void setHvIcnSufxCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvIcnSufxCd,hvIcnSufxCd.length);
   	
   }
   
     /**
	 * 	Update HvIcnSufxCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvIcnSufxCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvIcnSufxCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvIcnSufxCd with another Field
	 *	@param value
	 */
   public void setHvIcnSufxCd(Field source) {
       replace(source,0,source.length(),beginHvIcnSufxCd,HV_ICN_SUFX_CD_LEN);
   	
   }  
   
     /**
	 * 	Update HvIcnSufxCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvIcnSufxCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvIcnSufxCd,HV_ICN_SUFX_CD_LEN);
   	
   }
   
     /**
	 * 	Update HvIcnSufxCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvIcnSufxCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvIcnSufxCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvLnId
	 *	@return hvLnId
	 */
	public short getHvLnId() throws CFException {
        if (isHvLnIdModified()) { 
           hvLnId = refreshHvLnId();
        }
   		return hvLnId;
	}
	
	/**
	 * 	Update HvLnId with the passed value
	 *  Corresponding COBOL Variable is HV-LN-ID
	 *	@param number
	 */
	public void setHvLnId(short number) {
	     // Truncate if the number is beyond +/- Max range
	    hvLnId = checkHvLnIdMaxLimit(number); 
		serializeHvLnId(hvLnId);
	}

	public void setHvLnId(int number) {
	    number = checkHvLnIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvLnId((short)number);
	}
	public void setHvLnId(long number) {
	    number = checkHvLnIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvLnId((short)number);
	}
	

	/**
	 *	Returns the value of hvFstDtGroup
	 *	@return hvFstDtGroup
	 */   
	 public HvFstDtGroup getHvFstDtGroup() {
   	return hvFstDtGroup;
   }
   /**
	* 	Update HvFstDtGroup with the passed value
	*   Corresponding COBOL Variable is HV-FST-DT-GROUP
	*	@param value
	*/
   public void setHvFstDtGroup(char[] value) {
      hvFstDtGroup.setString(value); 
   }   
    
     /**
	 * 	Update HvFstDtGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvFstDtGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvFstDtGroup.begin,hvFstDtGroup.length());
   }
   
     /**
	 * 	Update HvFstDtGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvFstDtGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvFstDtGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvFstDtGroup with another Field
	 *	@param value
	 */
   public void setHvFstDtGroup(Field source) {
   	replace(source,0,source.length(),hvFstDtGroup.begin,hvFstDtGroup.length());
   }  
   
     /**
	 * 	Update HvFstDtGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvFstDtGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvFstDtGroup.begin,hvFstDtGroup.length());
   }
   
     /**
	 * 	Update HvFstDtGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvFstDtGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvFstDtGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvLstSrvcDtGroup
	 *	@return hvLstSrvcDtGroup
	 */   
	 public HvLstSrvcDtGroup getHvLstSrvcDtGroup() {
   	return hvLstSrvcDtGroup;
   }
   /**
	* 	Update HvLstSrvcDtGroup with the passed value
	*   Corresponding COBOL Variable is HV-LST-SRVC-DT-GROUP
	*	@param value
	*/
   public void setHvLstSrvcDtGroup(char[] value) {
      hvLstSrvcDtGroup.setString(value); 
   }   
    
     /**
	 * 	Update HvLstSrvcDtGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvLstSrvcDtGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvLstSrvcDtGroup.begin,hvLstSrvcDtGroup.length());
   }
   
     /**
	 * 	Update HvLstSrvcDtGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvLstSrvcDtGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvLstSrvcDtGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvLstSrvcDtGroup with another Field
	 *	@param value
	 */
   public void setHvLstSrvcDtGroup(Field source) {
   	replace(source,0,source.length(),hvLstSrvcDtGroup.begin,hvLstSrvcDtGroup.length());
   }  
   
     /**
	 * 	Update HvLstSrvcDtGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvLstSrvcDtGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvLstSrvcDtGroup.begin,hvLstSrvcDtGroup.length());
   }
   
     /**
	 * 	Update HvLstSrvcDtGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvLstSrvcDtGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvLstSrvcDtGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvProvTinsuff
	 *	@return hvProvTinsuff
	 */
   public char[] getHvProvTinsuff() throws CFException{
     if (isHvProvTinsuffModified()) { 
        hvProvTinsuff = refreshHvProvTinsuff();
     }
   		return hvProvTinsuff;
   }

  
	/**
	*  set variable hvProvTinsuff
	*  Corresponding COBOL Variable is HV-PROV-TINSUFF
	*  @param value
	**/
   public void setHvProvTinsuff(char[] value) {
      hvProvTinsuff = checkHvProvTinsuffConstraints(value);
      serializeHvProvTinsuff(hvProvTinsuff);
   } 

     /**
	 * 	Update HvProvTinsuff 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvProvTinsuff(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvProvTinsuff,hvProvTinsuff.length);
   	
   }
   
   public void setHvProvTinsuff(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTinsuff,hvProvTinsuff.length);
   	
   }
   
     /**
	 * 	Update HvProvTinsuff 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTinsuff(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTinsuff+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvProvTinsuff with another Field
	 *	@param value
	 */
   public void setHvProvTinsuff(Field source) {
       replace(source,0,source.length(),beginHvProvTinsuff,HV_PROV_TINSUFF_LEN);
   	
   }  
   
     /**
	 * 	Update HvProvTinsuff 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvProvTinsuff(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvProvTinsuff,HV_PROV_TINSUFF_LEN);
   	
   }
   
     /**
	 * 	Update HvProvTinsuff 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTinsuff(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTinsuff+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvProvTinsuffRedefined
	 *	@return hvProvTinsuffRedefined
	 */   
	 public HvProvTinsuffRedefined getHvProvTinsuffRedefined() {
   	return hvProvTinsuffRedefined;
   }
   /**
	* 	Update HvProvTinsuffRedefined with the passed value
	*   Corresponding COBOL Variable is HV-PROV-TINSUFF-REDEFINED
	*	@param value
	*/
   public void setHvProvTinsuffRedefined(char[] value) {
      hvProvTinsuffRedefined.setString(value); 
   }   
    
     /**
	 * 	Update HvProvTinsuffRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvProvTinsuffRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvProvTinsuffRedefined.begin,hvProvTinsuffRedefined.length());
   }
   
     /**
	 * 	Update HvProvTinsuffRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTinsuffRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvProvTinsuffRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvProvTinsuffRedefined with another Field
	 *	@param value
	 */
   public void setHvProvTinsuffRedefined(Field source) {
   	replace(source,0,source.length(),hvProvTinsuffRedefined.begin,hvProvTinsuffRedefined.length());
   }  
   
     /**
	 * 	Update HvProvTinsuffRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvProvTinsuffRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvProvTinsuffRedefined.begin,hvProvTinsuffRedefined.length());
   }
   
     /**
	 * 	Update HvProvTinsuffRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTinsuffRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvProvTinsuffRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvProvTinsuff1
	 *	@return hvProvTinsuff1
	 */
   public char[] getHvProvTinsuff1() throws CFException{
     if (isHvProvTinsuff1Modified()) { 
        hvProvTinsuff1 = refreshHvProvTinsuff1();
     }
   		return hvProvTinsuff1;
   }

  
	/**
	*  set variable hvProvTinsuff1
	*  Corresponding COBOL Variable is HV-PROV-TINSUFF1
	*  @param value
	**/
   public void setHvProvTinsuff1(char[] value) {
      hvProvTinsuff1 = checkHvProvTinsuff1Constraints(value);
      serializeHvProvTinsuff1(hvProvTinsuff1);
   } 

     /**
	 * 	Update HvProvTinsuff1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvProvTinsuff1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvProvTinsuff1,hvProvTinsuff1.length);
   	
   }
   
   public void setHvProvTinsuff1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTinsuff1,hvProvTinsuff1.length);
   	
   }
   
     /**
	 * 	Update HvProvTinsuff1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTinsuff1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTinsuff1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvProvTinsuff1 with another Field
	 *	@param value
	 */
   public void setHvProvTinsuff1(Field source) {
       replace(source,0,source.length(),beginHvProvTinsuff1,HV_PROV_TINSUFF_1_LEN);
   	
   }  
   
     /**
	 * 	Update HvProvTinsuff1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvProvTinsuff1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvProvTinsuff1,HV_PROV_TINSUFF_1_LEN);
   	
   }
   
     /**
	 * 	Update HvProvTinsuff1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTinsuff1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTinsuff1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvProvTinsuff1Redefined
	 *	@return hvProvTinsuff1Redefined
	 */   
	 public HvProvTinsuff1Redefined getHvProvTinsuff1Redefined() {
   	return hvProvTinsuff1Redefined;
   }
   /**
	* 	Update HvProvTinsuff1Redefined with the passed value
	*   Corresponding COBOL Variable is HV-PROV-TINSUFF1-REDEFINED
	*	@param value
	*/
   public void setHvProvTinsuff1Redefined(char[] value) {
      hvProvTinsuff1Redefined.setString(value); 
   }   
    
     /**
	 * 	Update HvProvTinsuff1Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvProvTinsuff1Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvProvTinsuff1Redefined.begin,hvProvTinsuff1Redefined.length());
   }
   
     /**
	 * 	Update HvProvTinsuff1Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTinsuff1Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvProvTinsuff1Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvProvTinsuff1Redefined with another Field
	 *	@param value
	 */
   public void setHvProvTinsuff1Redefined(Field source) {
   	replace(source,0,source.length(),hvProvTinsuff1Redefined.begin,hvProvTinsuff1Redefined.length());
   }  
   
     /**
	 * 	Update HvProvTinsuff1Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvProvTinsuff1Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvProvTinsuff1Redefined.begin,hvProvTinsuff1Redefined.length());
   }
   
     /**
	 * 	Update HvProvTinsuff1Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTinsuff1Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvProvTinsuff1Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvFlnJulianDtNbrGroup
	 *	@return hvFlnJulianDtNbrGroup
	 */   
	 public HvFlnJulianDtNbrGroup getHvFlnJulianDtNbrGroup() {
   	return hvFlnJulianDtNbrGroup;
   }
   /**
	* 	Update HvFlnJulianDtNbrGroup with the passed value
	*   Corresponding COBOL Variable is HV-FLN-JULIAN-DT-NBR-GROUP
	*	@param value
	*/
   public void setHvFlnJulianDtNbrGroup(char[] value) {
      hvFlnJulianDtNbrGroup.setString(value); 
   }   
    
     /**
	 * 	Update HvFlnJulianDtNbrGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvFlnJulianDtNbrGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvFlnJulianDtNbrGroup.begin,hvFlnJulianDtNbrGroup.length());
   }
   
     /**
	 * 	Update HvFlnJulianDtNbrGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvFlnJulianDtNbrGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvFlnJulianDtNbrGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvFlnJulianDtNbrGroup with another Field
	 *	@param value
	 */
   public void setHvFlnJulianDtNbrGroup(Field source) {
   	replace(source,0,source.length(),hvFlnJulianDtNbrGroup.begin,hvFlnJulianDtNbrGroup.length());
   }  
   
     /**
	 * 	Update HvFlnJulianDtNbrGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvFlnJulianDtNbrGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvFlnJulianDtNbrGroup.begin,hvFlnJulianDtNbrGroup.length());
   }
   
     /**
	 * 	Update HvFlnJulianDtNbrGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvFlnJulianDtNbrGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvFlnJulianDtNbrGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvFlnSrlNbrGroup
	 *	@return hvFlnSrlNbrGroup
	 */   
	 public HvFlnSrlNbrGroup getHvFlnSrlNbrGroup() {
   	return hvFlnSrlNbrGroup;
   }
   /**
	* 	Update HvFlnSrlNbrGroup with the passed value
	*   Corresponding COBOL Variable is HV-FLN-SRL-NBR-GROUP
	*	@param value
	*/
   public void setHvFlnSrlNbrGroup(char[] value) {
      hvFlnSrlNbrGroup.setString(value); 
   }   
    
     /**
	 * 	Update HvFlnSrlNbrGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvFlnSrlNbrGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvFlnSrlNbrGroup.begin,hvFlnSrlNbrGroup.length());
   }
   
     /**
	 * 	Update HvFlnSrlNbrGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvFlnSrlNbrGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvFlnSrlNbrGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvFlnSrlNbrGroup with another Field
	 *	@param value
	 */
   public void setHvFlnSrlNbrGroup(Field source) {
   	replace(source,0,source.length(),hvFlnSrlNbrGroup.begin,hvFlnSrlNbrGroup.length());
   }  
   
     /**
	 * 	Update HvFlnSrlNbrGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvFlnSrlNbrGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvFlnSrlNbrGroup.begin,hvFlnSrlNbrGroup.length());
   }
   
     /**
	 * 	Update HvFlnSrlNbrGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvFlnSrlNbrGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvFlnSrlNbrGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvFilmOfcNbrGroup
	 *	@return hvFilmOfcNbrGroup
	 */   
	 public HvFilmOfcNbrGroup getHvFilmOfcNbrGroup() {
   	return hvFilmOfcNbrGroup;
   }
   /**
	* 	Update HvFilmOfcNbrGroup with the passed value
	*   Corresponding COBOL Variable is HV-FILM-OFC-NBR-GROUP
	*	@param value
	*/
   public void setHvFilmOfcNbrGroup(char[] value) {
      hvFilmOfcNbrGroup.setString(value); 
   }   
    
     /**
	 * 	Update HvFilmOfcNbrGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvFilmOfcNbrGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvFilmOfcNbrGroup.begin,hvFilmOfcNbrGroup.length());
   }
   
     /**
	 * 	Update HvFilmOfcNbrGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvFilmOfcNbrGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvFilmOfcNbrGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvFilmOfcNbrGroup with another Field
	 *	@param value
	 */
   public void setHvFilmOfcNbrGroup(Field source) {
   	replace(source,0,source.length(),hvFilmOfcNbrGroup.begin,hvFilmOfcNbrGroup.length());
   }  
   
     /**
	 * 	Update HvFilmOfcNbrGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvFilmOfcNbrGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvFilmOfcNbrGroup.begin,hvFilmOfcNbrGroup.length());
   }
   
     /**
	 * 	Update HvFilmOfcNbrGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvFilmOfcNbrGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvFilmOfcNbrGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvAuthNbrGroup
	 *	@return hvAuthNbrGroup
	 */   
	 public HvAuthNbrGroup getHvAuthNbrGroup() {
   	return hvAuthNbrGroup;
   }
   /**
	* 	Update HvAuthNbrGroup with the passed value
	*   Corresponding COBOL Variable is HV-AUTH-NBR-GROUP
	*	@param value
	*/
   public void setHvAuthNbrGroup(char[] value) {
      hvAuthNbrGroup.setString(value); 
   }   
    
     /**
	 * 	Update HvAuthNbrGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvAuthNbrGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvAuthNbrGroup.begin,hvAuthNbrGroup.length());
   }
   
     /**
	 * 	Update HvAuthNbrGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvAuthNbrGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvAuthNbrGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvAuthNbrGroup with another Field
	 *	@param value
	 */
   public void setHvAuthNbrGroup(Field source) {
   	replace(source,0,source.length(),hvAuthNbrGroup.begin,hvAuthNbrGroup.length());
   }  
   
     /**
	 * 	Update HvAuthNbrGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvAuthNbrGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvAuthNbrGroup.begin,hvAuthNbrGroup.length());
   }
   
     /**
	 * 	Update HvAuthNbrGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvAuthNbrGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvAuthNbrGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvSrvcCatgyCdGroup
	 *	@return hvSrvcCatgyCdGroup
	 */   
	 public HvSrvcCatgyCdGroup getHvSrvcCatgyCdGroup() {
   	return hvSrvcCatgyCdGroup;
   }
   /**
	* 	Update HvSrvcCatgyCdGroup with the passed value
	*   Corresponding COBOL Variable is HV-SRVC-CATGY-CD-GROUP
	*	@param value
	*/
   public void setHvSrvcCatgyCdGroup(char[] value) {
      hvSrvcCatgyCdGroup.setString(value); 
   }   
    
     /**
	 * 	Update HvSrvcCatgyCdGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvSrvcCatgyCdGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSrvcCatgyCdGroup.begin,hvSrvcCatgyCdGroup.length());
   }
   
     /**
	 * 	Update HvSrvcCatgyCdGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSrvcCatgyCdGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSrvcCatgyCdGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvSrvcCatgyCdGroup with another Field
	 *	@param value
	 */
   public void setHvSrvcCatgyCdGroup(Field source) {
   	replace(source,0,source.length(),hvSrvcCatgyCdGroup.begin,hvSrvcCatgyCdGroup.length());
   }  
   
     /**
	 * 	Update HvSrvcCatgyCdGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvSrvcCatgyCdGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSrvcCatgyCdGroup.begin,hvSrvcCatgyCdGroup.length());
   }
   
     /**
	 * 	Update HvSrvcCatgyCdGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSrvcCatgyCdGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSrvcCatgyCdGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvSpiCtgyCd1Group
	 *	@return hvSpiCtgyCd1Group
	 */   
	 public HvSpiCtgyCd1Group getHvSpiCtgyCd1Group() {
   	return hvSpiCtgyCd1Group;
   }
   /**
	* 	Update HvSpiCtgyCd1Group with the passed value
	*   Corresponding COBOL Variable is HV-SPI-CTGY-CD-1-GROUP
	*	@param value
	*/
   public void setHvSpiCtgyCd1Group(char[] value) {
      hvSpiCtgyCd1Group.setString(value); 
   }   
    
     /**
	 * 	Update HvSpiCtgyCd1Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd1Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd1Group.begin,hvSpiCtgyCd1Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd1Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd1Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd1Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvSpiCtgyCd1Group with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd1Group(Field source) {
   	replace(source,0,source.length(),hvSpiCtgyCd1Group.begin,hvSpiCtgyCd1Group.length());
   }  
   
     /**
	 * 	Update HvSpiCtgyCd1Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd1Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd1Group.begin,hvSpiCtgyCd1Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd1Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd1Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd1Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvSpiCtgyCd2Group
	 *	@return hvSpiCtgyCd2Group
	 */   
	 public HvSpiCtgyCd2Group getHvSpiCtgyCd2Group() {
   	return hvSpiCtgyCd2Group;
   }
   /**
	* 	Update HvSpiCtgyCd2Group with the passed value
	*   Corresponding COBOL Variable is HV-SPI-CTGY-CD-2-GROUP
	*	@param value
	*/
   public void setHvSpiCtgyCd2Group(char[] value) {
      hvSpiCtgyCd2Group.setString(value); 
   }   
    
     /**
	 * 	Update HvSpiCtgyCd2Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd2Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd2Group.begin,hvSpiCtgyCd2Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd2Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd2Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd2Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvSpiCtgyCd2Group with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd2Group(Field source) {
   	replace(source,0,source.length(),hvSpiCtgyCd2Group.begin,hvSpiCtgyCd2Group.length());
   }  
   
     /**
	 * 	Update HvSpiCtgyCd2Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd2Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd2Group.begin,hvSpiCtgyCd2Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd2Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd2Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd2Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvSpiCtgyCd3Group
	 *	@return hvSpiCtgyCd3Group
	 */   
	 public HvSpiCtgyCd3Group getHvSpiCtgyCd3Group() {
   	return hvSpiCtgyCd3Group;
   }
   /**
	* 	Update HvSpiCtgyCd3Group with the passed value
	*   Corresponding COBOL Variable is HV-SPI-CTGY-CD-3-GROUP
	*	@param value
	*/
   public void setHvSpiCtgyCd3Group(char[] value) {
      hvSpiCtgyCd3Group.setString(value); 
   }   
    
     /**
	 * 	Update HvSpiCtgyCd3Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd3Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd3Group.begin,hvSpiCtgyCd3Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd3Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd3Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd3Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvSpiCtgyCd3Group with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd3Group(Field source) {
   	replace(source,0,source.length(),hvSpiCtgyCd3Group.begin,hvSpiCtgyCd3Group.length());
   }  
   
     /**
	 * 	Update HvSpiCtgyCd3Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd3Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd3Group.begin,hvSpiCtgyCd3Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd3Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd3Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd3Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvSpiCtgyCd4Group
	 *	@return hvSpiCtgyCd4Group
	 */   
	 public HvSpiCtgyCd4Group getHvSpiCtgyCd4Group() {
   	return hvSpiCtgyCd4Group;
   }
   /**
	* 	Update HvSpiCtgyCd4Group with the passed value
	*   Corresponding COBOL Variable is HV-SPI-CTGY-CD-4-GROUP
	*	@param value
	*/
   public void setHvSpiCtgyCd4Group(char[] value) {
      hvSpiCtgyCd4Group.setString(value); 
   }   
    
     /**
	 * 	Update HvSpiCtgyCd4Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd4Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd4Group.begin,hvSpiCtgyCd4Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd4Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd4Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd4Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvSpiCtgyCd4Group with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd4Group(Field source) {
   	replace(source,0,source.length(),hvSpiCtgyCd4Group.begin,hvSpiCtgyCd4Group.length());
   }  
   
     /**
	 * 	Update HvSpiCtgyCd4Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd4Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd4Group.begin,hvSpiCtgyCd4Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd4Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd4Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd4Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvSpiCtgyCd5Group
	 *	@return hvSpiCtgyCd5Group
	 */   
	 public HvSpiCtgyCd5Group getHvSpiCtgyCd5Group() {
   	return hvSpiCtgyCd5Group;
   }
   /**
	* 	Update HvSpiCtgyCd5Group with the passed value
	*   Corresponding COBOL Variable is HV-SPI-CTGY-CD-5-GROUP
	*	@param value
	*/
   public void setHvSpiCtgyCd5Group(char[] value) {
      hvSpiCtgyCd5Group.setString(value); 
   }   
    
     /**
	 * 	Update HvSpiCtgyCd5Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd5Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd5Group.begin,hvSpiCtgyCd5Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd5Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd5Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd5Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvSpiCtgyCd5Group with another Field
	 *	@param value
	 */
   public void setHvSpiCtgyCd5Group(Field source) {
   	replace(source,0,source.length(),hvSpiCtgyCd5Group.begin,hvSpiCtgyCd5Group.length());
   }  
   
     /**
	 * 	Update HvSpiCtgyCd5Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvSpiCtgyCd5Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd5Group.begin,hvSpiCtgyCd5Group.length());
   }
   
     /**
	 * 	Update HvSpiCtgyCd5Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvSpiCtgyCd5Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvSpiCtgyCd5Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvCptFrom
	 *	@return hvCptFrom
	 */
   public char[] getHvCptFrom() throws CFException{
     if (isHvCptFromModified()) { 
        hvCptFrom = refreshHvCptFrom();
     }
   		return hvCptFrom;
   }

  
	/**
	*  set variable hvCptFrom
	*  Corresponding COBOL Variable is HV-CPT-FROM
	*  @param value
	**/
   public void setHvCptFrom(char[] value) {
      hvCptFrom = checkHvCptFromConstraints(value);
      serializeHvCptFrom(hvCptFrom);
   } 

     /**
	 * 	Update HvCptFrom 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvCptFrom(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvCptFrom,hvCptFrom.length);
   	
   }
   
   public void setHvCptFrom(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvCptFrom,hvCptFrom.length);
   	
   }
   
     /**
	 * 	Update HvCptFrom 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvCptFrom(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvCptFrom+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvCptFrom with another Field
	 *	@param value
	 */
   public void setHvCptFrom(Field source) {
       replace(source,0,source.length(),beginHvCptFrom,HV_CPT_FROM_LEN);
   	
   }  
   
     /**
	 * 	Update HvCptFrom 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvCptFrom(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvCptFrom,HV_CPT_FROM_LEN);
   	
   }
   
     /**
	 * 	Update HvCptFrom 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvCptFrom(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvCptFrom+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvCptThru
	 *	@return hvCptThru
	 */
   public char[] getHvCptThru() throws CFException{
     if (isHvCptThruModified()) { 
        hvCptThru = refreshHvCptThru();
     }
   		return hvCptThru;
   }

  
	/**
	*  set variable hvCptThru
	*  Corresponding COBOL Variable is HV-CPT-THRU
	*  @param value
	**/
   public void setHvCptThru(char[] value) {
      hvCptThru = checkHvCptThruConstraints(value);
      serializeHvCptThru(hvCptThru);
   } 

     /**
	 * 	Update HvCptThru 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvCptThru(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvCptThru,hvCptThru.length);
   	
   }
   
   public void setHvCptThru(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvCptThru,hvCptThru.length);
   	
   }
   
     /**
	 * 	Update HvCptThru 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvCptThru(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvCptThru+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvCptThru with another Field
	 *	@param value
	 */
   public void setHvCptThru(Field source) {
       replace(source,0,source.length(),beginHvCptThru,HV_CPT_THRU_LEN);
   	
   }  
   
     /**
	 * 	Update HvCptThru 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvCptThru(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvCptThru,HV_CPT_THRU_LEN);
   	
   }
   
     /**
	 * 	Update HvCptThru 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvCptThru(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvCptThru+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvRevFrom
	 *	@return hvRevFrom
	 */
   public char[] getHvRevFrom() throws CFException{
     if (isHvRevFromModified()) { 
        hvRevFrom = refreshHvRevFrom();
     }
   		return hvRevFrom;
   }

  
	/**
	*  set variable hvRevFrom
	*  Corresponding COBOL Variable is HV-REV-FROM
	*  @param value
	**/
   public void setHvRevFrom(char[] value) {
      hvRevFrom = checkHvRevFromConstraints(value);
      serializeHvRevFrom(hvRevFrom);
   } 

     /**
	 * 	Update HvRevFrom 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvRevFrom(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvRevFrom,hvRevFrom.length);
   	
   }
   
   public void setHvRevFrom(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvRevFrom,hvRevFrom.length);
   	
   }
   
     /**
	 * 	Update HvRevFrom 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvRevFrom(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvRevFrom+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvRevFrom with another Field
	 *	@param value
	 */
   public void setHvRevFrom(Field source) {
       replace(source,0,source.length(),beginHvRevFrom,HV_REV_FROM_LEN);
   	
   }  
   
     /**
	 * 	Update HvRevFrom 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvRevFrom(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvRevFrom,HV_REV_FROM_LEN);
   	
   }
   
     /**
	 * 	Update HvRevFrom 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvRevFrom(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvRevFrom+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvRevThru
	 *	@return hvRevThru
	 */
   public char[] getHvRevThru() throws CFException{
     if (isHvRevThruModified()) { 
        hvRevThru = refreshHvRevThru();
     }
   		return hvRevThru;
   }

  
	/**
	*  set variable hvRevThru
	*  Corresponding COBOL Variable is HV-REV-THRU
	*  @param value
	**/
   public void setHvRevThru(char[] value) {
      hvRevThru = checkHvRevThruConstraints(value);
      serializeHvRevThru(hvRevThru);
   } 

     /**
	 * 	Update HvRevThru 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvRevThru(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvRevThru,hvRevThru.length);
   	
   }
   
   public void setHvRevThru(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvRevThru,hvRevThru.length);
   	
   }
   
     /**
	 * 	Update HvRevThru 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvRevThru(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvRevThru+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvRevThru with another Field
	 *	@param value
	 */
   public void setHvRevThru(Field source) {
       replace(source,0,source.length(),beginHvRevThru,HV_REV_THRU_LEN);
   	
   }  
   
     /**
	 * 	Update HvRevThru 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvRevThru(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvRevThru,HV_REV_THRU_LEN);
   	
   }
   
     /**
	 * 	Update HvRevThru 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvRevThru(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvRevThru+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvRemarkCd1
	 *	@return hvRemarkCd1
	 */
   public char[] getHvRemarkCd1() throws CFException{
     if (isHvRemarkCd1Modified()) { 
        hvRemarkCd1 = refreshHvRemarkCd1();
     }
   		return hvRemarkCd1;
   }

  
	/**
	*  set variable hvRemarkCd1
	*  Corresponding COBOL Variable is HV-REMARK-CD1
	*  @param value
	**/
   public void setHvRemarkCd1(char[] value) {
      hvRemarkCd1 = checkHvRemarkCd1Constraints(value);
      serializeHvRemarkCd1(hvRemarkCd1);
   } 

     /**
	 * 	Update HvRemarkCd1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvRemarkCd1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvRemarkCd1,hvRemarkCd1.length);
   	
   }
   
   public void setHvRemarkCd1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvRemarkCd1,hvRemarkCd1.length);
   	
   }
   
     /**
	 * 	Update HvRemarkCd1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvRemarkCd1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvRemarkCd1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvRemarkCd1 with another Field
	 *	@param value
	 */
   public void setHvRemarkCd1(Field source) {
       replace(source,0,source.length(),beginHvRemarkCd1,HV_REMARK_CD_1_LEN);
   	
   }  
   
     /**
	 * 	Update HvRemarkCd1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvRemarkCd1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvRemarkCd1,HV_REMARK_CD_1_LEN);
   	
   }
   
     /**
	 * 	Update HvRemarkCd1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvRemarkCd1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvRemarkCd1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvRemarkCd2
	 *	@return hvRemarkCd2
	 */
   public char[] getHvRemarkCd2() throws CFException{
     if (isHvRemarkCd2Modified()) { 
        hvRemarkCd2 = refreshHvRemarkCd2();
     }
   		return hvRemarkCd2;
   }

  
	/**
	*  set variable hvRemarkCd2
	*  Corresponding COBOL Variable is HV-REMARK-CD2
	*  @param value
	**/
   public void setHvRemarkCd2(char[] value) {
      hvRemarkCd2 = checkHvRemarkCd2Constraints(value);
      serializeHvRemarkCd2(hvRemarkCd2);
   } 

     /**
	 * 	Update HvRemarkCd2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvRemarkCd2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvRemarkCd2,hvRemarkCd2.length);
   	
   }
   
   public void setHvRemarkCd2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvRemarkCd2,hvRemarkCd2.length);
   	
   }
   
     /**
	 * 	Update HvRemarkCd2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvRemarkCd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvRemarkCd2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvRemarkCd2 with another Field
	 *	@param value
	 */
   public void setHvRemarkCd2(Field source) {
       replace(source,0,source.length(),beginHvRemarkCd2,HV_REMARK_CD_2_LEN);
   	
   }  
   
     /**
	 * 	Update HvRemarkCd2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvRemarkCd2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvRemarkCd2,HV_REMARK_CD_2_LEN);
   	
   }
   
     /**
	 * 	Update HvRemarkCd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvRemarkCd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvRemarkCd2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvProvSpclCd1
	 *	@return hvProvSpclCd1
	 */
   public char[] getHvProvSpclCd1() throws CFException{
     if (isHvProvSpclCd1Modified()) { 
        hvProvSpclCd1 = refreshHvProvSpclCd1();
     }
   		return hvProvSpclCd1;
   }

  
	/**
	*  set variable hvProvSpclCd1
	*  Corresponding COBOL Variable is HV-PROV-SPCL-CD1
	*  @param value
	**/
   public void setHvProvSpclCd1(char[] value) {
      hvProvSpclCd1 = checkHvProvSpclCd1Constraints(value);
      serializeHvProvSpclCd1(hvProvSpclCd1);
   } 

     /**
	 * 	Update HvProvSpclCd1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvProvSpclCd1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvProvSpclCd1,hvProvSpclCd1.length);
   	
   }
   
   public void setHvProvSpclCd1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvSpclCd1,hvProvSpclCd1.length);
   	
   }
   
     /**
	 * 	Update HvProvSpclCd1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProvSpclCd1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvSpclCd1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvProvSpclCd1 with another Field
	 *	@param value
	 */
   public void setHvProvSpclCd1(Field source) {
       replace(source,0,source.length(),beginHvProvSpclCd1,HV_PROV_SPCL_CD_1_LEN);
   	
   }  
   
     /**
	 * 	Update HvProvSpclCd1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvProvSpclCd1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvProvSpclCd1,HV_PROV_SPCL_CD_1_LEN);
   	
   }
   
     /**
	 * 	Update HvProvSpclCd1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProvSpclCd1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvSpclCd1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvProvSpclCd2
	 *	@return hvProvSpclCd2
	 */
   public char[] getHvProvSpclCd2() throws CFException{
     if (isHvProvSpclCd2Modified()) { 
        hvProvSpclCd2 = refreshHvProvSpclCd2();
     }
   		return hvProvSpclCd2;
   }

  
	/**
	*  set variable hvProvSpclCd2
	*  Corresponding COBOL Variable is HV-PROV-SPCL-CD2
	*  @param value
	**/
   public void setHvProvSpclCd2(char[] value) {
      hvProvSpclCd2 = checkHvProvSpclCd2Constraints(value);
      serializeHvProvSpclCd2(hvProvSpclCd2);
   } 

     /**
	 * 	Update HvProvSpclCd2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvProvSpclCd2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvProvSpclCd2,hvProvSpclCd2.length);
   	
   }
   
   public void setHvProvSpclCd2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvSpclCd2,hvProvSpclCd2.length);
   	
   }
   
     /**
	 * 	Update HvProvSpclCd2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProvSpclCd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvSpclCd2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvProvSpclCd2 with another Field
	 *	@param value
	 */
   public void setHvProvSpclCd2(Field source) {
       replace(source,0,source.length(),beginHvProvSpclCd2,HV_PROV_SPCL_CD_2_LEN);
   	
   }  
   
     /**
	 * 	Update HvProvSpclCd2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvProvSpclCd2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvProvSpclCd2,HV_PROV_SPCL_CD_2_LEN);
   	
   }
   
     /**
	 * 	Update HvProvSpclCd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProvSpclCd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvSpclCd2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvCauseCd1
	 *	@return hvCauseCd1
	 */
   public char[] getHvCauseCd1() throws CFException{
     if (isHvCauseCd1Modified()) { 
        hvCauseCd1 = refreshHvCauseCd1();
     }
   		return hvCauseCd1;
   }

  
	/**
	*  set variable hvCauseCd1
	*  Corresponding COBOL Variable is HV-CAUSE-CD1
	*  @param value
	**/
   public void setHvCauseCd1(char[] value) {
      hvCauseCd1 = checkHvCauseCd1Constraints(value);
      serializeHvCauseCd1(hvCauseCd1);
   } 

     /**
	 * 	Update HvCauseCd1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvCauseCd1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvCauseCd1,hvCauseCd1.length);
   	
   }
   
   public void setHvCauseCd1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvCauseCd1,hvCauseCd1.length);
   	
   }
   
     /**
	 * 	Update HvCauseCd1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvCauseCd1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvCauseCd1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvCauseCd1 with another Field
	 *	@param value
	 */
   public void setHvCauseCd1(Field source) {
       replace(source,0,source.length(),beginHvCauseCd1,HV_CAUSE_CD_1_LEN);
   	
   }  
   
     /**
	 * 	Update HvCauseCd1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvCauseCd1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvCauseCd1,HV_CAUSE_CD_1_LEN);
   	
   }
   
     /**
	 * 	Update HvCauseCd1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvCauseCd1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvCauseCd1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvCauseCd2
	 *	@return hvCauseCd2
	 */
   public char[] getHvCauseCd2() throws CFException{
     if (isHvCauseCd2Modified()) { 
        hvCauseCd2 = refreshHvCauseCd2();
     }
   		return hvCauseCd2;
   }

  
	/**
	*  set variable hvCauseCd2
	*  Corresponding COBOL Variable is HV-CAUSE-CD2
	*  @param value
	**/
   public void setHvCauseCd2(char[] value) {
      hvCauseCd2 = checkHvCauseCd2Constraints(value);
      serializeHvCauseCd2(hvCauseCd2);
   } 

     /**
	 * 	Update HvCauseCd2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvCauseCd2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvCauseCd2,hvCauseCd2.length);
   	
   }
   
   public void setHvCauseCd2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvCauseCd2,hvCauseCd2.length);
   	
   }
   
     /**
	 * 	Update HvCauseCd2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvCauseCd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvCauseCd2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvCauseCd2 with another Field
	 *	@param value
	 */
   public void setHvCauseCd2(Field source) {
       replace(source,0,source.length(),beginHvCauseCd2,HV_CAUSE_CD_2_LEN);
   	
   }  
   
     /**
	 * 	Update HvCauseCd2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvCauseCd2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvCauseCd2,HV_CAUSE_CD_2_LEN);
   	
   }
   
     /**
	 * 	Update HvCauseCd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvCauseCd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvCauseCd2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvAppliedToOopInd
	 *	@return hvAppliedToOopInd
	 */
   public char[] getHvAppliedToOopInd() throws CFException{
     if (isHvAppliedToOopIndModified()) { 
        hvAppliedToOopInd = refreshHvAppliedToOopInd();
     }
   		return hvAppliedToOopInd;
   }

  
	/**
	*  set variable hvAppliedToOopInd
	*  Corresponding COBOL Variable is HV-APPLIED-TO-OOP-IND
	*  @param value
	**/
   public void setHvAppliedToOopInd(char[] value) {
      hvAppliedToOopInd = checkHvAppliedToOopIndConstraints(value);
      serializeHvAppliedToOopInd(hvAppliedToOopInd);
   } 

     /**
	 * 	Update HvAppliedToOopInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvAppliedToOopInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvAppliedToOopInd,hvAppliedToOopInd.length);
   	
   }
   
   public void setHvAppliedToOopInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvAppliedToOopInd,hvAppliedToOopInd.length);
   	
   }
   
     /**
	 * 	Update HvAppliedToOopInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvAppliedToOopInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvAppliedToOopInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvAppliedToOopInd with another Field
	 *	@param value
	 */
   public void setHvAppliedToOopInd(Field source) {
       replace(source,0,source.length(),beginHvAppliedToOopInd,HV_APPLIED_TO_OOP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update HvAppliedToOopInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvAppliedToOopInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvAppliedToOopInd,HV_APPLIED_TO_OOP_IND_LEN);
   	
   }
   
     /**
	 * 	Update HvAppliedToOopInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvAppliedToOopInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvAppliedToOopInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvExtrNtfyNbrGroup
	 *	@return hvExtrNtfyNbrGroup
	 */   
	 public HvExtrNtfyNbrGroup getHvExtrNtfyNbrGroup() {
   	return hvExtrNtfyNbrGroup;
   }
   /**
	* 	Update HvExtrNtfyNbrGroup with the passed value
	*   Corresponding COBOL Variable is HV-EXTR-NTFY-NBR-GROUP
	*	@param value
	*/
   public void setHvExtrNtfyNbrGroup(char[] value) {
      hvExtrNtfyNbrGroup.setString(value); 
   }   
    
     /**
	 * 	Update HvExtrNtfyNbrGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvExtrNtfyNbrGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvExtrNtfyNbrGroup.begin,hvExtrNtfyNbrGroup.length());
   }
   
     /**
	 * 	Update HvExtrNtfyNbrGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvExtrNtfyNbrGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvExtrNtfyNbrGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvExtrNtfyNbrGroup with another Field
	 *	@param value
	 */
   public void setHvExtrNtfyNbrGroup(Field source) {
   	replace(source,0,source.length(),hvExtrNtfyNbrGroup.begin,hvExtrNtfyNbrGroup.length());
   }  
   
     /**
	 * 	Update HvExtrNtfyNbrGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvExtrNtfyNbrGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvExtrNtfyNbrGroup.begin,hvExtrNtfyNbrGroup.length());
   }
   
     /**
	 * 	Update HvExtrNtfyNbrGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvExtrNtfyNbrGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvExtrNtfyNbrGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hvNextKey
	 *	@return hvNextKey
	 */   
	 public HvNextKey getHvNextKey() {
   	return hvNextKey;
   }
   /**
	* 	Update HvNextKey with the passed value
	*   Corresponding COBOL Variable is HV-NEXT-KEY
	*	@param value
	*/
   public void setHvNextKey(char[] value) {
      hvNextKey.setString(value); 
   }   
    
     /**
	 * 	Update HvNextKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHvNextKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvNextKey.begin,hvNextKey.length());
   }
   
     /**
	 * 	Update HvNextKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvNextKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvNextKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HvNextKey with another Field
	 *	@param value
	 */
   public void setHvNextKey(Field source) {
   	replace(source,0,source.length(),hvNextKey.begin,hvNextKey.length());
   }  
   
     /**
	 * 	Update HvNextKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHvNextKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hvNextKey.begin,hvNextKey.length());
   }
   
     /**
	 * 	Update HvNextKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvNextKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hvNextKey.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getHostVariablesFieldLength() {
			return HOST_VARIABLES_LENGTH;
		}

}
  
