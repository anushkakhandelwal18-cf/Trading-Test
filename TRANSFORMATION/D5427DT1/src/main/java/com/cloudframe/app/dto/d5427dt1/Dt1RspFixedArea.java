package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1RspFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Dt1RspFixedArea extends Dt1RspFixedAreaSerialized { 
   

						private char[] dt1RspViewName = Field.fillLowValue(8);

						private char[] dt1RspViewVersion = Field.fillLowValue(2);
				private Dt1RspLegacyResponseData dt1RspLegacyResponseData = new Dt1RspLegacyResponseData();

						private char[] dt1RspEmpid = Field.fillLowValue(10);

						private char[] dt1RspPolicy = Field.fillLowValue(6);

								private int dt1RspDepNbr;

						private char[] dt1RspFirstName = Field.fillLowValue(12);

						private char[] dt1RspLastName = Field.fillLowValue(20);

						private char[] dt1RspRel = Field.fillLowValue(2);

						private char[] dt1RspSystem = Field.fillLowValue(1);

								private int dt1RspPlanVariation;

								private int dt1RspReportingCode;

						private char[] dt1RspFundingResponsibility = Field.fillLowValue(1);

						private char[] dt1RspPatPhiInd = Field.fillLowValue(1);

						private char[] dt1RspUhpInd = Field.fillLowValue(1);

						private char[] dt1RspCcmRelSrvcInd = Field.fillLowValue(1);

						private char[] dt1RspCcmPriorAuthInd = Field.fillLowValue(1);

						private char[] dt1RspEbrPriorAuthInd = Field.fillLowValue(1);

						private char[] dt1RspEbcPriorAuthInd = Field.fillLowValue(1);

						private char[] dt1RspOncPolPrtcpCd = Field.fillLowValue(1);

								private int dt1RspTotalClaimCount;

								private int dt1RspCurrentClaimCount;

						private char[] dt1RspExplCode = Field.fillLowValue(1);

						private char[] dt1RspNextKey = Field.fillLowValue(80);

						private char[] dt1RspClmContainerName = Field.fillLowValue(16);

								private long dt1RspClmContainerItemCnt;

								private long dt1RspClmContainerItemLen;

						private char[] dt1RspGenTstPrtcpCd = Field.fillLowValue(1);

						private char[] dt1RspSecOpinVendCd = Field.fillLowValue(1);

						private char[] dt1RspUgiInd = Field.fillLowValue(1);

						private char[] dt1RspLgiInd = Field.fillLowValue(1);

						private char[] dt1RspExdInd = Field.fillLowValue(1);

						private char[] dt1RspFillerArea = Field.fillLowValue(154);
	
	/**
	* Constructor for Dt1RspFixedArea
	**/
    public Dt1RspFixedArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1RspFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1RspFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			dt1RspLegacyResponseData.setParent(this,getStartOffset() + 10);
    } 

	/**
	 *	Returns the value of dt1RspViewName
	 *	@return dt1RspViewName
	 */
   public char[] getDt1RspViewName() throws CFException{
     if (isDt1RspViewNameModified()) { 
        dt1RspViewName = refreshDt1RspViewName();
     }
   		return dt1RspViewName;
   }

  
	/**
	*  set variable dt1RspViewName
	*  Corresponding COBOL Variable is DT1-RSP-VIEW-NAME
	*  @param value
	**/
   public void setDt1RspViewName(char[] value) {
      dt1RspViewName = checkDt1RspViewNameConstraints(value);
      serializeDt1RspViewName(dt1RspViewName);
   } 

     /**
	 * 	Update Dt1RspViewName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspViewName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspViewName,dt1RspViewName.length);
   	
   }
   
   public void setDt1RspViewName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspViewName,dt1RspViewName.length);
   	
   }
   
     /**
	 * 	Update Dt1RspViewName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspViewName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspViewName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspViewName with another Field
	 *	@param value
	 */
   public void setDt1RspViewName(Field source) {
       replace(source,0,source.length(),beginDt1RspViewName,DT_1_RSP_VIEW_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspViewName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspViewName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspViewName,DT_1_RSP_VIEW_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspViewName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspViewName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspViewName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspViewVersion
	 *	@return dt1RspViewVersion
	 */
   public char[] getDt1RspViewVersion() throws CFException{
     if (isDt1RspViewVersionModified()) { 
        dt1RspViewVersion = refreshDt1RspViewVersion();
     }
   		return dt1RspViewVersion;
   }

  
	/**
	*  set variable dt1RspViewVersion
	*  Corresponding COBOL Variable is DT1-RSP-VIEW-VERSION
	*  @param value
	**/
   public void setDt1RspViewVersion(char[] value) {
      dt1RspViewVersion = checkDt1RspViewVersionConstraints(value);
      serializeDt1RspViewVersion(dt1RspViewVersion);
   } 

     /**
	 * 	Update Dt1RspViewVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspViewVersion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspViewVersion,dt1RspViewVersion.length);
   	
   }
   
   public void setDt1RspViewVersion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspViewVersion,dt1RspViewVersion.length);
   	
   }
   
     /**
	 * 	Update Dt1RspViewVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspViewVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspViewVersion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspViewVersion with another Field
	 *	@param value
	 */
   public void setDt1RspViewVersion(Field source) {
       replace(source,0,source.length(),beginDt1RspViewVersion,DT_1_RSP_VIEW_VERSION_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspViewVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspViewVersion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspViewVersion,DT_1_RSP_VIEW_VERSION_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspViewVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspViewVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspViewVersion+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspLegacyResponseData
	 *	@return dt1RspLegacyResponseData
	 */   
	 public Dt1RspLegacyResponseData getDt1RspLegacyResponseData() {
   	return dt1RspLegacyResponseData;
   }
   /**
	* 	Update Dt1RspLegacyResponseData with the passed value
	*   Corresponding COBOL Variable is DT1-RSP-LEGACY-RESPONSE-DATA
	*	@param value
	*/
   public void setDt1RspLegacyResponseData(char[] value) {
      dt1RspLegacyResponseData.setString(value); 
   }   
    
     /**
	 * 	Update Dt1RspLegacyResponseData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1RspLegacyResponseData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1RspLegacyResponseData.begin,dt1RspLegacyResponseData.length());
   }
   
     /**
	 * 	Update Dt1RspLegacyResponseData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspLegacyResponseData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1RspLegacyResponseData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1RspLegacyResponseData with another Field
	 *	@param value
	 */
   public void setDt1RspLegacyResponseData(Field source) {
   	replace(source,0,source.length(),dt1RspLegacyResponseData.begin,dt1RspLegacyResponseData.length());
   }  
   
     /**
	 * 	Update Dt1RspLegacyResponseData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1RspLegacyResponseData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1RspLegacyResponseData.begin,dt1RspLegacyResponseData.length());
   }
   
     /**
	 * 	Update Dt1RspLegacyResponseData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspLegacyResponseData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1RspLegacyResponseData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dt1RspEmpid
	 *	@return dt1RspEmpid
	 */
   public char[] getDt1RspEmpid() throws CFException{
     if (isDt1RspEmpidModified()) { 
        dt1RspEmpid = refreshDt1RspEmpid();
     }
   		return dt1RspEmpid;
   }

  
	/**
	*  set variable dt1RspEmpid
	*  Corresponding COBOL Variable is DT1-RSP-EMPID
	*  @param value
	**/
   public void setDt1RspEmpid(char[] value) {
      dt1RspEmpid = checkDt1RspEmpidConstraints(value);
      serializeDt1RspEmpid(dt1RspEmpid);
   } 

     /**
	 * 	Update Dt1RspEmpid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspEmpid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspEmpid,dt1RspEmpid.length);
   	
   }
   
   public void setDt1RspEmpid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspEmpid,dt1RspEmpid.length);
   	
   }
   
     /**
	 * 	Update Dt1RspEmpid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspEmpid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspEmpid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspEmpid with another Field
	 *	@param value
	 */
   public void setDt1RspEmpid(Field source) {
       replace(source,0,source.length(),beginDt1RspEmpid,DT_1_RSP_EMPID_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspEmpid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspEmpid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspEmpid,DT_1_RSP_EMPID_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspEmpid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspEmpid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspEmpid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspPolicy
	 *	@return dt1RspPolicy
	 */
   public char[] getDt1RspPolicy() throws CFException{
     if (isDt1RspPolicyModified()) { 
        dt1RspPolicy = refreshDt1RspPolicy();
     }
   		return dt1RspPolicy;
   }

  
	/**
	*  set variable dt1RspPolicy
	*  Corresponding COBOL Variable is DT1-RSP-POLICY
	*  @param value
	**/
   public void setDt1RspPolicy(char[] value) {
      dt1RspPolicy = checkDt1RspPolicyConstraints(value);
      serializeDt1RspPolicy(dt1RspPolicy);
   } 

     /**
	 * 	Update Dt1RspPolicy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspPolicy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspPolicy,dt1RspPolicy.length);
   	
   }
   
   public void setDt1RspPolicy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspPolicy,dt1RspPolicy.length);
   	
   }
   
     /**
	 * 	Update Dt1RspPolicy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspPolicy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspPolicy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspPolicy with another Field
	 *	@param value
	 */
   public void setDt1RspPolicy(Field source) {
       replace(source,0,source.length(),beginDt1RspPolicy,DT_1_RSP_POLICY_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspPolicy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspPolicy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspPolicy,DT_1_RSP_POLICY_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspPolicy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspPolicy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspPolicy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspDepNbr
	 *	@return dt1RspDepNbr
	 */
	public int getDt1RspDepNbr() throws CFException {
       if (isDt1RspDepNbrModified()) { 
           dt1RspDepNbr = refreshDt1RspDepNbr();
        }
   		return dt1RspDepNbr;
	}
	

	
	   
	/**
	 * 	Update Dt1RspDepNbr with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-DEP-NBR
	 *	@param number
	 */
	public void setDt1RspDepNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspDepNbr = checkDt1RspDepNbrMaxLimit(number); 
		serializeDt1RspDepNbr(dt1RspDepNbr);
	}
	

	public void setDt1RspDepNbr(long number) {
	    number = checkDt1RspDepNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1RspDepNbr((int)number);
	}
	
	/**
	 * 	Update Dt1RspDepNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspDepNbr(char[] value) throws CFException {
		 dt1RspDepNbr = serializeDt1RspDepNbr(value);
	}
	/**
	 * 	Update Dt1RspDepNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspDepNbrString(char[] value) throws CFException {
		 setDt1RspDepNbr(value);
	}
	/**
	 *	Returns the value of dt1RspFirstName
	 *	@return dt1RspFirstName
	 */
   public char[] getDt1RspFirstName() throws CFException{
     if (isDt1RspFirstNameModified()) { 
        dt1RspFirstName = refreshDt1RspFirstName();
     }
   		return dt1RspFirstName;
   }

  
	/**
	*  set variable dt1RspFirstName
	*  Corresponding COBOL Variable is DT1-RSP-FIRST-NAME
	*  @param value
	**/
   public void setDt1RspFirstName(char[] value) {
      dt1RspFirstName = checkDt1RspFirstNameConstraints(value);
      serializeDt1RspFirstName(dt1RspFirstName);
   } 

     /**
	 * 	Update Dt1RspFirstName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspFirstName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspFirstName,dt1RspFirstName.length);
   	
   }
   
   public void setDt1RspFirstName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspFirstName,dt1RspFirstName.length);
   	
   }
   
     /**
	 * 	Update Dt1RspFirstName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspFirstName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspFirstName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspFirstName with another Field
	 *	@param value
	 */
   public void setDt1RspFirstName(Field source) {
       replace(source,0,source.length(),beginDt1RspFirstName,DT_1_RSP_FIRST_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspFirstName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspFirstName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspFirstName,DT_1_RSP_FIRST_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspFirstName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspFirstName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspFirstName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspLastName
	 *	@return dt1RspLastName
	 */
   public char[] getDt1RspLastName() throws CFException{
     if (isDt1RspLastNameModified()) { 
        dt1RspLastName = refreshDt1RspLastName();
     }
   		return dt1RspLastName;
   }

  
	/**
	*  set variable dt1RspLastName
	*  Corresponding COBOL Variable is DT1-RSP-LAST-NAME
	*  @param value
	**/
   public void setDt1RspLastName(char[] value) {
      dt1RspLastName = checkDt1RspLastNameConstraints(value);
      serializeDt1RspLastName(dt1RspLastName);
   } 

     /**
	 * 	Update Dt1RspLastName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspLastName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspLastName,dt1RspLastName.length);
   	
   }
   
   public void setDt1RspLastName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspLastName,dt1RspLastName.length);
   	
   }
   
     /**
	 * 	Update Dt1RspLastName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspLastName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspLastName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspLastName with another Field
	 *	@param value
	 */
   public void setDt1RspLastName(Field source) {
       replace(source,0,source.length(),beginDt1RspLastName,DT_1_RSP_LAST_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspLastName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspLastName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspLastName,DT_1_RSP_LAST_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspLastName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspLastName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspLastName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspRel
	 *	@return dt1RspRel
	 */
   public char[] getDt1RspRel() throws CFException{
     if (isDt1RspRelModified()) { 
        dt1RspRel = refreshDt1RspRel();
     }
   		return dt1RspRel;
   }

  
	/**
	*  set variable dt1RspRel
	*  Corresponding COBOL Variable is DT1-RSP-REL
	*  @param value
	**/
   public void setDt1RspRel(char[] value) {
      dt1RspRel = checkDt1RspRelConstraints(value);
      serializeDt1RspRel(dt1RspRel);
   } 

     /**
	 * 	Update Dt1RspRel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspRel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspRel,dt1RspRel.length);
   	
   }
   
   public void setDt1RspRel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspRel,dt1RspRel.length);
   	
   }
   
     /**
	 * 	Update Dt1RspRel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspRel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspRel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspRel with another Field
	 *	@param value
	 */
   public void setDt1RspRel(Field source) {
       replace(source,0,source.length(),beginDt1RspRel,DT_1_RSP_REL_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspRel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspRel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspRel,DT_1_RSP_REL_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspRel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspRel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspRel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspSystem
	 *	@return dt1RspSystem
	 */
   public char[] getDt1RspSystem() throws CFException{
     if (isDt1RspSystemModified()) { 
        dt1RspSystem = refreshDt1RspSystem();
     }
   		return dt1RspSystem;
   }

  
	/**
	*  set variable dt1RspSystem
	*  Corresponding COBOL Variable is DT1-RSP-SYSTEM
	*  @param value
	**/
   public void setDt1RspSystem(char[] value) {
      dt1RspSystem = checkDt1RspSystemConstraints(value);
      serializeDt1RspSystem(dt1RspSystem);
   } 

     /**
	 * 	Update Dt1RspSystem 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspSystem(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspSystem,dt1RspSystem.length);
   	
   }
   
   public void setDt1RspSystem(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspSystem,dt1RspSystem.length);
   	
   }
   
     /**
	 * 	Update Dt1RspSystem 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspSystem(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspSystem+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspSystem with another Field
	 *	@param value
	 */
   public void setDt1RspSystem(Field source) {
       replace(source,0,source.length(),beginDt1RspSystem,DT_1_RSP_SYSTEM_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspSystem 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspSystem(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspSystem,DT_1_RSP_SYSTEM_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspSystem 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspSystem(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspSystem+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspPlanVariation
	 *	@return dt1RspPlanVariation
	 */
	public int getDt1RspPlanVariation() throws CFException {
       if (isDt1RspPlanVariationModified()) { 
           dt1RspPlanVariation = refreshDt1RspPlanVariation();
        }
   		return dt1RspPlanVariation;
	}
	

	
	   
	/**
	 * 	Update Dt1RspPlanVariation with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-PLAN-VARIATION
	 *	@param number
	 */
	public void setDt1RspPlanVariation(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspPlanVariation = checkDt1RspPlanVariationMaxLimit(number); 
		serializeDt1RspPlanVariation(dt1RspPlanVariation);
	}
	

	public void setDt1RspPlanVariation(long number) {
	    number = checkDt1RspPlanVariationMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1RspPlanVariation((int)number);
	}
	
	/**
	 * 	Update Dt1RspPlanVariation with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspPlanVariation(char[] value) throws CFException {
		 dt1RspPlanVariation = serializeDt1RspPlanVariation(value);
	}
	/**
	 * 	Update Dt1RspPlanVariation with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspPlanVariationString(char[] value) throws CFException {
		 setDt1RspPlanVariation(value);
	}
	/**
	 *	Returns the value of dt1RspReportingCode
	 *	@return dt1RspReportingCode
	 */
	public int getDt1RspReportingCode() throws CFException {
       if (isDt1RspReportingCodeModified()) { 
           dt1RspReportingCode = refreshDt1RspReportingCode();
        }
   		return dt1RspReportingCode;
	}
	

	
	   
	/**
	 * 	Update Dt1RspReportingCode with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-REPORTING-CODE
	 *	@param number
	 */
	public void setDt1RspReportingCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspReportingCode = checkDt1RspReportingCodeMaxLimit(number); 
		serializeDt1RspReportingCode(dt1RspReportingCode);
	}
	

	public void setDt1RspReportingCode(long number) {
	    number = checkDt1RspReportingCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1RspReportingCode((int)number);
	}
	
	/**
	 * 	Update Dt1RspReportingCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspReportingCode(char[] value) throws CFException {
		 dt1RspReportingCode = serializeDt1RspReportingCode(value);
	}
	/**
	 * 	Update Dt1RspReportingCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspReportingCodeString(char[] value) throws CFException {
		 setDt1RspReportingCode(value);
	}
	/**
	 *	Returns the value of dt1RspFundingResponsibility
	 *	@return dt1RspFundingResponsibility
	 */
   public char[] getDt1RspFundingResponsibility() throws CFException{
     if (isDt1RspFundingResponsibilityModified()) { 
        dt1RspFundingResponsibility = refreshDt1RspFundingResponsibility();
     }
   		return dt1RspFundingResponsibility;
   }

  
	/**
	*  set variable dt1RspFundingResponsibility
	*  Corresponding COBOL Variable is DT1-RSP-FUNDING-RESPONSIBILITY
	*  @param value
	**/
   public void setDt1RspFundingResponsibility(char[] value) {
      dt1RspFundingResponsibility = checkDt1RspFundingResponsibilityConstraints(value);
      serializeDt1RspFundingResponsibility(dt1RspFundingResponsibility);
   } 

     /**
	 * 	Update Dt1RspFundingResponsibility 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspFundingResponsibility(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspFundingResponsibility,dt1RspFundingResponsibility.length);
   	
   }
   
   public void setDt1RspFundingResponsibility(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspFundingResponsibility,dt1RspFundingResponsibility.length);
   	
   }
   
     /**
	 * 	Update Dt1RspFundingResponsibility 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspFundingResponsibility(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspFundingResponsibility+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspFundingResponsibility with another Field
	 *	@param value
	 */
   public void setDt1RspFundingResponsibility(Field source) {
       replace(source,0,source.length(),beginDt1RspFundingResponsibility,DT_1_RSP_FUNDING_RESPONSIBILITY_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspFundingResponsibility 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspFundingResponsibility(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspFundingResponsibility,DT_1_RSP_FUNDING_RESPONSIBILITY_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspFundingResponsibility 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspFundingResponsibility(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspFundingResponsibility+targetIndex,targetLen);
    
   }
	char[] dt1RspSelfInsured88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isDt1RspSelfInsured()
	 *	@return  Returns true if isDt1RspSelfInsured() is "1"
	 */
   public boolean isDt1RspSelfInsured() throws CFException {
      return (  compareChars( getDt1RspFundingResponsibility() , dt1RspSelfInsured88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setDt1RspSelfInsuredTrue() {  			
    	setDt1RspFundingResponsibility( dt1RspSelfInsured88Value);
   	}
	char[] dt1RspFullyInsured88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isDt1RspFullyInsured()
	 *	@return  Returns true if isDt1RspFullyInsured() is "2"
	 */
   public boolean isDt1RspFullyInsured() throws CFException {
      return (  compareChars( getDt1RspFundingResponsibility() , dt1RspFullyInsured88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setDt1RspFullyInsuredTrue() {  			
    	setDt1RspFundingResponsibility( dt1RspFullyInsured88Value);
   	}
	/**
	 *	Returns the value of dt1RspPatPhiInd
	 *	@return dt1RspPatPhiInd
	 */
   public char[] getDt1RspPatPhiInd() throws CFException{
     if (isDt1RspPatPhiIndModified()) { 
        dt1RspPatPhiInd = refreshDt1RspPatPhiInd();
     }
   		return dt1RspPatPhiInd;
   }

  
	/**
	*  set variable dt1RspPatPhiInd
	*  Corresponding COBOL Variable is DT1-RSP-PAT-PHI-IND
	*  @param value
	**/
   public void setDt1RspPatPhiInd(char[] value) {
      dt1RspPatPhiInd = checkDt1RspPatPhiIndConstraints(value);
      serializeDt1RspPatPhiInd(dt1RspPatPhiInd);
   } 

     /**
	 * 	Update Dt1RspPatPhiInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspPatPhiInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspPatPhiInd,dt1RspPatPhiInd.length);
   	
   }
   
   public void setDt1RspPatPhiInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspPatPhiInd,dt1RspPatPhiInd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspPatPhiInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspPatPhiInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspPatPhiInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspPatPhiInd with another Field
	 *	@param value
	 */
   public void setDt1RspPatPhiInd(Field source) {
       replace(source,0,source.length(),beginDt1RspPatPhiInd,DT_1_RSP_PAT_PHI_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspPatPhiInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspPatPhiInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspPatPhiInd,DT_1_RSP_PAT_PHI_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspPatPhiInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspPatPhiInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspPatPhiInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspUhpInd
	 *	@return dt1RspUhpInd
	 */
   public char[] getDt1RspUhpInd() throws CFException{
     if (isDt1RspUhpIndModified()) { 
        dt1RspUhpInd = refreshDt1RspUhpInd();
     }
   		return dt1RspUhpInd;
   }

  
	/**
	*  set variable dt1RspUhpInd
	*  Corresponding COBOL Variable is DT1-RSP-UHP-IND
	*  @param value
	**/
   public void setDt1RspUhpInd(char[] value) {
      dt1RspUhpInd = checkDt1RspUhpIndConstraints(value);
      serializeDt1RspUhpInd(dt1RspUhpInd);
   } 

     /**
	 * 	Update Dt1RspUhpInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspUhpInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspUhpInd,dt1RspUhpInd.length);
   	
   }
   
   public void setDt1RspUhpInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspUhpInd,dt1RspUhpInd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspUhpInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspUhpInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspUhpInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspUhpInd with another Field
	 *	@param value
	 */
   public void setDt1RspUhpInd(Field source) {
       replace(source,0,source.length(),beginDt1RspUhpInd,DT_1_RSP_UHP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspUhpInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspUhpInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspUhpInd,DT_1_RSP_UHP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspUhpInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspUhpInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspUhpInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspCcmRelSrvcInd
	 *	@return dt1RspCcmRelSrvcInd
	 */
   public char[] getDt1RspCcmRelSrvcInd() throws CFException{
     if (isDt1RspCcmRelSrvcIndModified()) { 
        dt1RspCcmRelSrvcInd = refreshDt1RspCcmRelSrvcInd();
     }
   		return dt1RspCcmRelSrvcInd;
   }

  
	/**
	*  set variable dt1RspCcmRelSrvcInd
	*  Corresponding COBOL Variable is DT1-RSP-CCM-REL-SRVC-IND
	*  @param value
	**/
   public void setDt1RspCcmRelSrvcInd(char[] value) {
      dt1RspCcmRelSrvcInd = checkDt1RspCcmRelSrvcIndConstraints(value);
      serializeDt1RspCcmRelSrvcInd(dt1RspCcmRelSrvcInd);
   } 

     /**
	 * 	Update Dt1RspCcmRelSrvcInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspCcmRelSrvcInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspCcmRelSrvcInd,dt1RspCcmRelSrvcInd.length);
   	
   }
   
   public void setDt1RspCcmRelSrvcInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspCcmRelSrvcInd,dt1RspCcmRelSrvcInd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspCcmRelSrvcInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspCcmRelSrvcInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspCcmRelSrvcInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspCcmRelSrvcInd with another Field
	 *	@param value
	 */
   public void setDt1RspCcmRelSrvcInd(Field source) {
       replace(source,0,source.length(),beginDt1RspCcmRelSrvcInd,DT_1_RSP_CCM_REL_SRVC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspCcmRelSrvcInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspCcmRelSrvcInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspCcmRelSrvcInd,DT_1_RSP_CCM_REL_SRVC_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspCcmRelSrvcInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspCcmRelSrvcInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspCcmRelSrvcInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspCcmPriorAuthInd
	 *	@return dt1RspCcmPriorAuthInd
	 */
   public char[] getDt1RspCcmPriorAuthInd() throws CFException{
     if (isDt1RspCcmPriorAuthIndModified()) { 
        dt1RspCcmPriorAuthInd = refreshDt1RspCcmPriorAuthInd();
     }
   		return dt1RspCcmPriorAuthInd;
   }

  
	/**
	*  set variable dt1RspCcmPriorAuthInd
	*  Corresponding COBOL Variable is DT1-RSP-CCM-PRIOR-AUTH-IND
	*  @param value
	**/
   public void setDt1RspCcmPriorAuthInd(char[] value) {
      dt1RspCcmPriorAuthInd = checkDt1RspCcmPriorAuthIndConstraints(value);
      serializeDt1RspCcmPriorAuthInd(dt1RspCcmPriorAuthInd);
   } 

     /**
	 * 	Update Dt1RspCcmPriorAuthInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspCcmPriorAuthInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspCcmPriorAuthInd,dt1RspCcmPriorAuthInd.length);
   	
   }
   
   public void setDt1RspCcmPriorAuthInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspCcmPriorAuthInd,dt1RspCcmPriorAuthInd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspCcmPriorAuthInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspCcmPriorAuthInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspCcmPriorAuthInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspCcmPriorAuthInd with another Field
	 *	@param value
	 */
   public void setDt1RspCcmPriorAuthInd(Field source) {
       replace(source,0,source.length(),beginDt1RspCcmPriorAuthInd,DT_1_RSP_CCM_PRIOR_AUTH_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspCcmPriorAuthInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspCcmPriorAuthInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspCcmPriorAuthInd,DT_1_RSP_CCM_PRIOR_AUTH_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspCcmPriorAuthInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspCcmPriorAuthInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspCcmPriorAuthInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspEbrPriorAuthInd
	 *	@return dt1RspEbrPriorAuthInd
	 */
   public char[] getDt1RspEbrPriorAuthInd() throws CFException{
     if (isDt1RspEbrPriorAuthIndModified()) { 
        dt1RspEbrPriorAuthInd = refreshDt1RspEbrPriorAuthInd();
     }
   		return dt1RspEbrPriorAuthInd;
   }

  
	/**
	*  set variable dt1RspEbrPriorAuthInd
	*  Corresponding COBOL Variable is DT1-RSP-EBR-PRIOR-AUTH-IND
	*  @param value
	**/
   public void setDt1RspEbrPriorAuthInd(char[] value) {
      dt1RspEbrPriorAuthInd = checkDt1RspEbrPriorAuthIndConstraints(value);
      serializeDt1RspEbrPriorAuthInd(dt1RspEbrPriorAuthInd);
   } 

     /**
	 * 	Update Dt1RspEbrPriorAuthInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspEbrPriorAuthInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspEbrPriorAuthInd,dt1RspEbrPriorAuthInd.length);
   	
   }
   
   public void setDt1RspEbrPriorAuthInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspEbrPriorAuthInd,dt1RspEbrPriorAuthInd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspEbrPriorAuthInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspEbrPriorAuthInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspEbrPriorAuthInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspEbrPriorAuthInd with another Field
	 *	@param value
	 */
   public void setDt1RspEbrPriorAuthInd(Field source) {
       replace(source,0,source.length(),beginDt1RspEbrPriorAuthInd,DT_1_RSP_EBR_PRIOR_AUTH_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspEbrPriorAuthInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspEbrPriorAuthInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspEbrPriorAuthInd,DT_1_RSP_EBR_PRIOR_AUTH_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspEbrPriorAuthInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspEbrPriorAuthInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspEbrPriorAuthInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspEbcPriorAuthInd
	 *	@return dt1RspEbcPriorAuthInd
	 */
   public char[] getDt1RspEbcPriorAuthInd() throws CFException{
     if (isDt1RspEbcPriorAuthIndModified()) { 
        dt1RspEbcPriorAuthInd = refreshDt1RspEbcPriorAuthInd();
     }
   		return dt1RspEbcPriorAuthInd;
   }

  
	/**
	*  set variable dt1RspEbcPriorAuthInd
	*  Corresponding COBOL Variable is DT1-RSP-EBC-PRIOR-AUTH-IND
	*  @param value
	**/
   public void setDt1RspEbcPriorAuthInd(char[] value) {
      dt1RspEbcPriorAuthInd = checkDt1RspEbcPriorAuthIndConstraints(value);
      serializeDt1RspEbcPriorAuthInd(dt1RspEbcPriorAuthInd);
   } 

     /**
	 * 	Update Dt1RspEbcPriorAuthInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspEbcPriorAuthInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspEbcPriorAuthInd,dt1RspEbcPriorAuthInd.length);
   	
   }
   
   public void setDt1RspEbcPriorAuthInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspEbcPriorAuthInd,dt1RspEbcPriorAuthInd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspEbcPriorAuthInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspEbcPriorAuthInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspEbcPriorAuthInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspEbcPriorAuthInd with another Field
	 *	@param value
	 */
   public void setDt1RspEbcPriorAuthInd(Field source) {
       replace(source,0,source.length(),beginDt1RspEbcPriorAuthInd,DT_1_RSP_EBC_PRIOR_AUTH_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspEbcPriorAuthInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspEbcPriorAuthInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspEbcPriorAuthInd,DT_1_RSP_EBC_PRIOR_AUTH_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspEbcPriorAuthInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspEbcPriorAuthInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspEbcPriorAuthInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspOncPolPrtcpCd
	 *	@return dt1RspOncPolPrtcpCd
	 */
   public char[] getDt1RspOncPolPrtcpCd() throws CFException{
     if (isDt1RspOncPolPrtcpCdModified()) { 
        dt1RspOncPolPrtcpCd = refreshDt1RspOncPolPrtcpCd();
     }
   		return dt1RspOncPolPrtcpCd;
   }

  
	/**
	*  set variable dt1RspOncPolPrtcpCd
	*  Corresponding COBOL Variable is DT1-RSP-ONC-POL-PRTCP-CD
	*  @param value
	**/
   public void setDt1RspOncPolPrtcpCd(char[] value) {
      dt1RspOncPolPrtcpCd = checkDt1RspOncPolPrtcpCdConstraints(value);
      serializeDt1RspOncPolPrtcpCd(dt1RspOncPolPrtcpCd);
   } 

     /**
	 * 	Update Dt1RspOncPolPrtcpCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspOncPolPrtcpCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspOncPolPrtcpCd,dt1RspOncPolPrtcpCd.length);
   	
   }
   
   public void setDt1RspOncPolPrtcpCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspOncPolPrtcpCd,dt1RspOncPolPrtcpCd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspOncPolPrtcpCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspOncPolPrtcpCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspOncPolPrtcpCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspOncPolPrtcpCd with another Field
	 *	@param value
	 */
   public void setDt1RspOncPolPrtcpCd(Field source) {
       replace(source,0,source.length(),beginDt1RspOncPolPrtcpCd,DT_1_RSP_ONC_POL_PRTCP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspOncPolPrtcpCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspOncPolPrtcpCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspOncPolPrtcpCd,DT_1_RSP_ONC_POL_PRTCP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspOncPolPrtcpCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspOncPolPrtcpCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspOncPolPrtcpCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspTotalClaimCount
	 *	@return dt1RspTotalClaimCount
	 */
	public int getDt1RspTotalClaimCount() throws CFException {
       if (isDt1RspTotalClaimCountModified()) { 
           dt1RspTotalClaimCount = refreshDt1RspTotalClaimCount();
        }
   		return dt1RspTotalClaimCount;
	}
	

	
	   
	/**
	 * 	Update Dt1RspTotalClaimCount with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-TOTAL-CLAIM-COUNT
	 *	@param number
	 */
	public void setDt1RspTotalClaimCount(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspTotalClaimCount = checkDt1RspTotalClaimCountMaxLimit(number); 
		serializeDt1RspTotalClaimCount(dt1RspTotalClaimCount);
	}
	

	public void setDt1RspTotalClaimCount(long number) {
	    number = checkDt1RspTotalClaimCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1RspTotalClaimCount((int)number);
	}
	
	/**
	 * 	Update Dt1RspTotalClaimCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspTotalClaimCount(char[] value) throws CFException {
		 dt1RspTotalClaimCount = serializeDt1RspTotalClaimCount(value);
	}
	/**
	 * 	Update Dt1RspTotalClaimCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspTotalClaimCountString(char[] value) throws CFException {
		 setDt1RspTotalClaimCount(value);
	}
	/**
	 *	Returns the value of dt1RspCurrentClaimCount
	 *	@return dt1RspCurrentClaimCount
	 */
	public int getDt1RspCurrentClaimCount() throws CFException {
       if (isDt1RspCurrentClaimCountModified()) { 
           dt1RspCurrentClaimCount = refreshDt1RspCurrentClaimCount();
        }
   		return dt1RspCurrentClaimCount;
	}
	

	
	   
	/**
	 * 	Update Dt1RspCurrentClaimCount with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-CURRENT-CLAIM-COUNT
	 *	@param number
	 */
	public void setDt1RspCurrentClaimCount(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspCurrentClaimCount = checkDt1RspCurrentClaimCountMaxLimit(number); 
		serializeDt1RspCurrentClaimCount(dt1RspCurrentClaimCount);
	}
	

	public void setDt1RspCurrentClaimCount(long number) {
	    number = checkDt1RspCurrentClaimCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1RspCurrentClaimCount((int)number);
	}
	
	/**
	 * 	Update Dt1RspCurrentClaimCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspCurrentClaimCount(char[] value) throws CFException {
		 dt1RspCurrentClaimCount = serializeDt1RspCurrentClaimCount(value);
	}
	/**
	 * 	Update Dt1RspCurrentClaimCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspCurrentClaimCountString(char[] value) throws CFException {
		 setDt1RspCurrentClaimCount(value);
	}
	/**
	 *	Returns the value of dt1RspExplCode
	 *	@return dt1RspExplCode
	 */
   public char[] getDt1RspExplCode() throws CFException{
     if (isDt1RspExplCodeModified()) { 
        dt1RspExplCode = refreshDt1RspExplCode();
     }
   		return dt1RspExplCode;
   }

  
	/**
	*  set variable dt1RspExplCode
	*  Corresponding COBOL Variable is DT1-RSP-EXPL-CODE
	*  @param value
	**/
   public void setDt1RspExplCode(char[] value) {
      dt1RspExplCode = checkDt1RspExplCodeConstraints(value);
      serializeDt1RspExplCode(dt1RspExplCode);
   } 

     /**
	 * 	Update Dt1RspExplCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspExplCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspExplCode,dt1RspExplCode.length);
   	
   }
   
   public void setDt1RspExplCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspExplCode,dt1RspExplCode.length);
   	
   }
   
     /**
	 * 	Update Dt1RspExplCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspExplCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspExplCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspExplCode with another Field
	 *	@param value
	 */
   public void setDt1RspExplCode(Field source) {
       replace(source,0,source.length(),beginDt1RspExplCode,DT_1_RSP_EXPL_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspExplCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspExplCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspExplCode,DT_1_RSP_EXPL_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspExplCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspExplCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspExplCode+targetIndex,targetLen);
    
   }
	char[] dt1RspMultipleRecords88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isDt1RspMultipleRecords()
	 *	@return  Returns true if isDt1RspMultipleRecords() is "1"
	 */
   public boolean isDt1RspMultipleRecords() throws CFException {
      return (  compareChars( getDt1RspExplCode() , dt1RspMultipleRecords88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setDt1RspMultipleRecordsTrue() {  			
    	setDt1RspExplCode( dt1RspMultipleRecords88Value);
   	}
	/**
	 *	Returns the value of dt1RspNextKey
	 *	@return dt1RspNextKey
	 */
   public char[] getDt1RspNextKey() throws CFException{
     if (isDt1RspNextKeyModified()) { 
        dt1RspNextKey = refreshDt1RspNextKey();
     }
   		return dt1RspNextKey;
   }

  
	/**
	*  set variable dt1RspNextKey
	*  Corresponding COBOL Variable is DT1-RSP-NEXT-KEY
	*  @param value
	**/
   public void setDt1RspNextKey(char[] value) {
      dt1RspNextKey = checkDt1RspNextKeyConstraints(value);
      serializeDt1RspNextKey(dt1RspNextKey);
   } 

     /**
	 * 	Update Dt1RspNextKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspNextKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspNextKey,dt1RspNextKey.length);
   	
   }
   
   public void setDt1RspNextKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspNextKey,dt1RspNextKey.length);
   	
   }
   
     /**
	 * 	Update Dt1RspNextKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspNextKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspNextKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspNextKey with another Field
	 *	@param value
	 */
   public void setDt1RspNextKey(Field source) {
       replace(source,0,source.length(),beginDt1RspNextKey,DT_1_RSP_NEXT_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspNextKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspNextKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspNextKey,DT_1_RSP_NEXT_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspNextKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspNextKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspNextKey+targetIndex,targetLen);
    
   }
	char[] dt1RspStartAtTop88Value = "                                                                                ".toCharArray();
	/**
	 *	Test condition " " for isDt1RspStartAtTop()
	 *	@return  Returns true if isDt1RspStartAtTop() is " "
	 */
   public boolean isDt1RspStartAtTop() throws CFException {
      return (  compareChars( getDt1RspNextKey() , dt1RspStartAtTop88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setDt1RspStartAtTopTrue() {  			
    	setDt1RspNextKey( dt1RspStartAtTop88Value);
   	}
	/**
	 *	Returns the value of dt1RspClmContainerName
	 *	@return dt1RspClmContainerName
	 */
   public char[] getDt1RspClmContainerName() throws CFException{
     if (isDt1RspClmContainerNameModified()) { 
        dt1RspClmContainerName = refreshDt1RspClmContainerName();
     }
   		return dt1RspClmContainerName;
   }

  
	/**
	*  set variable dt1RspClmContainerName
	*  Corresponding COBOL Variable is DT1-RSP-CLM-CONTAINER-NAME
	*  @param value
	**/
   public void setDt1RspClmContainerName(char[] value) {
      dt1RspClmContainerName = checkDt1RspClmContainerNameConstraints(value);
      serializeDt1RspClmContainerName(dt1RspClmContainerName);
   } 

     /**
	 * 	Update Dt1RspClmContainerName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspClmContainerName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspClmContainerName,dt1RspClmContainerName.length);
   	
   }
   
   public void setDt1RspClmContainerName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspClmContainerName,dt1RspClmContainerName.length);
   	
   }
   
     /**
	 * 	Update Dt1RspClmContainerName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspClmContainerName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspClmContainerName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspClmContainerName with another Field
	 *	@param value
	 */
   public void setDt1RspClmContainerName(Field source) {
       replace(source,0,source.length(),beginDt1RspClmContainerName,DT_1_RSP_CLM_CONTAINER_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspClmContainerName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspClmContainerName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspClmContainerName,DT_1_RSP_CLM_CONTAINER_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspClmContainerName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspClmContainerName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspClmContainerName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspClmContainerItemCnt
	 *	@return dt1RspClmContainerItemCnt
	 */
	public long getDt1RspClmContainerItemCnt() throws CFException {
       if (isDt1RspClmContainerItemCntModified()) { 
           dt1RspClmContainerItemCnt = refreshDt1RspClmContainerItemCnt();
        }
   		return dt1RspClmContainerItemCnt;
	}
	

	
	   
	/**
	 * 	Update Dt1RspClmContainerItemCnt with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-CLM-CONTAINER-ITEM-CNT
	 *	@param number
	 */
	public void setDt1RspClmContainerItemCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspClmContainerItemCnt = checkDt1RspClmContainerItemCntMaxLimit(number); 
		serializeDt1RspClmContainerItemCnt(dt1RspClmContainerItemCnt);
	}
	

	/**
	 * 	Update Dt1RspClmContainerItemCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspClmContainerItemCnt(char[] value) throws CFException {
		 dt1RspClmContainerItemCnt = serializeDt1RspClmContainerItemCnt(value);
	}
	/**
	 * 	Update Dt1RspClmContainerItemCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspClmContainerItemCntString(char[] value) throws CFException {
		 setDt1RspClmContainerItemCnt(value);
	}
	/**
	 *	Returns the value of dt1RspClmContainerItemLen
	 *	@return dt1RspClmContainerItemLen
	 */
	public long getDt1RspClmContainerItemLen() throws CFException {
       if (isDt1RspClmContainerItemLenModified()) { 
           dt1RspClmContainerItemLen = refreshDt1RspClmContainerItemLen();
        }
   		return dt1RspClmContainerItemLen;
	}
	

	
	   
	/**
	 * 	Update Dt1RspClmContainerItemLen with the passed value
	 *  Corresponding COBOL Variable is DT1-RSP-CLM-CONTAINER-ITEM-LEN
	 *	@param number
	 */
	public void setDt1RspClmContainerItemLen(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1RspClmContainerItemLen = checkDt1RspClmContainerItemLenMaxLimit(number); 
		serializeDt1RspClmContainerItemLen(dt1RspClmContainerItemLen);
	}
	

	/**
	 * 	Update Dt1RspClmContainerItemLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1RspClmContainerItemLen(char[] value) throws CFException {
		 dt1RspClmContainerItemLen = serializeDt1RspClmContainerItemLen(value);
	}
	/**
	 * 	Update Dt1RspClmContainerItemLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1RspClmContainerItemLenString(char[] value) throws CFException {
		 setDt1RspClmContainerItemLen(value);
	}
	/**
	 *	Returns the value of dt1RspGenTstPrtcpCd
	 *	@return dt1RspGenTstPrtcpCd
	 */
   public char[] getDt1RspGenTstPrtcpCd() throws CFException{
     if (isDt1RspGenTstPrtcpCdModified()) { 
        dt1RspGenTstPrtcpCd = refreshDt1RspGenTstPrtcpCd();
     }
   		return dt1RspGenTstPrtcpCd;
   }

  
	/**
	*  set variable dt1RspGenTstPrtcpCd
	*  Corresponding COBOL Variable is DT1-RSP-GEN-TST-PRTCP-CD
	*  @param value
	**/
   public void setDt1RspGenTstPrtcpCd(char[] value) {
      dt1RspGenTstPrtcpCd = checkDt1RspGenTstPrtcpCdConstraints(value);
      serializeDt1RspGenTstPrtcpCd(dt1RspGenTstPrtcpCd);
   } 

     /**
	 * 	Update Dt1RspGenTstPrtcpCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspGenTstPrtcpCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspGenTstPrtcpCd,dt1RspGenTstPrtcpCd.length);
   	
   }
   
   public void setDt1RspGenTstPrtcpCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspGenTstPrtcpCd,dt1RspGenTstPrtcpCd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspGenTstPrtcpCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspGenTstPrtcpCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspGenTstPrtcpCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspGenTstPrtcpCd with another Field
	 *	@param value
	 */
   public void setDt1RspGenTstPrtcpCd(Field source) {
       replace(source,0,source.length(),beginDt1RspGenTstPrtcpCd,DT_1_RSP_GEN_TST_PRTCP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspGenTstPrtcpCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspGenTstPrtcpCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspGenTstPrtcpCd,DT_1_RSP_GEN_TST_PRTCP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspGenTstPrtcpCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspGenTstPrtcpCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspGenTstPrtcpCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspSecOpinVendCd
	 *	@return dt1RspSecOpinVendCd
	 */
   public char[] getDt1RspSecOpinVendCd() throws CFException{
     if (isDt1RspSecOpinVendCdModified()) { 
        dt1RspSecOpinVendCd = refreshDt1RspSecOpinVendCd();
     }
   		return dt1RspSecOpinVendCd;
   }

  
	/**
	*  set variable dt1RspSecOpinVendCd
	*  Corresponding COBOL Variable is DT1-RSP-SEC-OPIN-VEND-CD
	*  @param value
	**/
   public void setDt1RspSecOpinVendCd(char[] value) {
      dt1RspSecOpinVendCd = checkDt1RspSecOpinVendCdConstraints(value);
      serializeDt1RspSecOpinVendCd(dt1RspSecOpinVendCd);
   } 

     /**
	 * 	Update Dt1RspSecOpinVendCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspSecOpinVendCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspSecOpinVendCd,dt1RspSecOpinVendCd.length);
   	
   }
   
   public void setDt1RspSecOpinVendCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspSecOpinVendCd,dt1RspSecOpinVendCd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspSecOpinVendCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspSecOpinVendCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspSecOpinVendCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspSecOpinVendCd with another Field
	 *	@param value
	 */
   public void setDt1RspSecOpinVendCd(Field source) {
       replace(source,0,source.length(),beginDt1RspSecOpinVendCd,DT_1_RSP_SEC_OPIN_VEND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspSecOpinVendCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspSecOpinVendCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspSecOpinVendCd,DT_1_RSP_SEC_OPIN_VEND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspSecOpinVendCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspSecOpinVendCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspSecOpinVendCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspUgiInd
	 *	@return dt1RspUgiInd
	 */
   public char[] getDt1RspUgiInd() throws CFException{
     if (isDt1RspUgiIndModified()) { 
        dt1RspUgiInd = refreshDt1RspUgiInd();
     }
   		return dt1RspUgiInd;
   }

  
	/**
	*  set variable dt1RspUgiInd
	*  Corresponding COBOL Variable is DT1-RSP-UGI-IND
	*  @param value
	**/
   public void setDt1RspUgiInd(char[] value) {
      dt1RspUgiInd = checkDt1RspUgiIndConstraints(value);
      serializeDt1RspUgiInd(dt1RspUgiInd);
   } 

     /**
	 * 	Update Dt1RspUgiInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspUgiInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspUgiInd,dt1RspUgiInd.length);
   	
   }
   
   public void setDt1RspUgiInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspUgiInd,dt1RspUgiInd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspUgiInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspUgiInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspUgiInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspUgiInd with another Field
	 *	@param value
	 */
   public void setDt1RspUgiInd(Field source) {
       replace(source,0,source.length(),beginDt1RspUgiInd,DT_1_RSP_UGI_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspUgiInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspUgiInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspUgiInd,DT_1_RSP_UGI_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspUgiInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspUgiInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspUgiInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspLgiInd
	 *	@return dt1RspLgiInd
	 */
   public char[] getDt1RspLgiInd() throws CFException{
     if (isDt1RspLgiIndModified()) { 
        dt1RspLgiInd = refreshDt1RspLgiInd();
     }
   		return dt1RspLgiInd;
   }

  
	/**
	*  set variable dt1RspLgiInd
	*  Corresponding COBOL Variable is DT1-RSP-LGI-IND
	*  @param value
	**/
   public void setDt1RspLgiInd(char[] value) {
      dt1RspLgiInd = checkDt1RspLgiIndConstraints(value);
      serializeDt1RspLgiInd(dt1RspLgiInd);
   } 

     /**
	 * 	Update Dt1RspLgiInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspLgiInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspLgiInd,dt1RspLgiInd.length);
   	
   }
   
   public void setDt1RspLgiInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspLgiInd,dt1RspLgiInd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspLgiInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspLgiInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspLgiInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspLgiInd with another Field
	 *	@param value
	 */
   public void setDt1RspLgiInd(Field source) {
       replace(source,0,source.length(),beginDt1RspLgiInd,DT_1_RSP_LGI_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspLgiInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspLgiInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspLgiInd,DT_1_RSP_LGI_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspLgiInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspLgiInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspLgiInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspExdInd
	 *	@return dt1RspExdInd
	 */
   public char[] getDt1RspExdInd() throws CFException{
     if (isDt1RspExdIndModified()) { 
        dt1RspExdInd = refreshDt1RspExdInd();
     }
   		return dt1RspExdInd;
   }

  
	/**
	*  set variable dt1RspExdInd
	*  Corresponding COBOL Variable is DT1-RSP-EXD-IND
	*  @param value
	**/
   public void setDt1RspExdInd(char[] value) {
      dt1RspExdInd = checkDt1RspExdIndConstraints(value);
      serializeDt1RspExdInd(dt1RspExdInd);
   } 

     /**
	 * 	Update Dt1RspExdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspExdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspExdInd,dt1RspExdInd.length);
   	
   }
   
   public void setDt1RspExdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspExdInd,dt1RspExdInd.length);
   	
   }
   
     /**
	 * 	Update Dt1RspExdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspExdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspExdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspExdInd with another Field
	 *	@param value
	 */
   public void setDt1RspExdInd(Field source) {
       replace(source,0,source.length(),beginDt1RspExdInd,DT_1_RSP_EXD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspExdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspExdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspExdInd,DT_1_RSP_EXD_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspExdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspExdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspExdInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1RspFillerArea
	 *	@return dt1RspFillerArea
	 */
   public char[] getDt1RspFillerArea() throws CFException{
     if (isDt1RspFillerAreaModified()) { 
        dt1RspFillerArea = refreshDt1RspFillerArea();
     }
   		return dt1RspFillerArea;
   }

  
	/**
	*  set variable dt1RspFillerArea
	*  Corresponding COBOL Variable is DT1-RSP-FILLER-AREA
	*  @param value
	**/
   public void setDt1RspFillerArea(char[] value) {
      dt1RspFillerArea = checkDt1RspFillerAreaConstraints(value);
      serializeDt1RspFillerArea(dt1RspFillerArea);
   } 

     /**
	 * 	Update Dt1RspFillerArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1RspFillerArea(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1RspFillerArea,dt1RspFillerArea.length);
   	
   }
   
   public void setDt1RspFillerArea(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspFillerArea,dt1RspFillerArea.length);
   	
   }
   
     /**
	 * 	Update Dt1RspFillerArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspFillerArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspFillerArea+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1RspFillerArea with another Field
	 *	@param value
	 */
   public void setDt1RspFillerArea(Field source) {
       replace(source,0,source.length(),beginDt1RspFillerArea,DT_1_RSP_FILLER_AREA_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1RspFillerArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1RspFillerArea(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1RspFillerArea,DT_1_RSP_FILLER_AREA_LEN);
   	
   }
   
     /**
	 * 	Update Dt1RspFillerArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspFillerArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1RspFillerArea+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Dt1RspFixedArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDt1RspViewName(CONSTANTS.SPACE_8);
         setDt1RspViewVersion(CONSTANTS.SPACE_2);
          dt1RspLegacyResponseData.initialize();
     
         setDt1RspEmpid(CONSTANTS.SPACE_10);
         setDt1RspPolicy(CONSTANTS.SPACE_6);
                     setDt1RspDepNbr(0);
         setDt1RspFirstName(CONSTANTS.SPACE_12);
         setDt1RspLastName(CONSTANTS.SPACE_20);
         setDt1RspRel(CONSTANTS.SPACE_2);
         setDt1RspSystem(CONSTANTS.SPACE);
                     setDt1RspPlanVariation(0);
                     setDt1RspReportingCode(0);
         setDt1RspFundingResponsibility(CONSTANTS.SPACE);
         setDt1RspPatPhiInd(CONSTANTS.SPACE);
         setDt1RspUhpInd(CONSTANTS.SPACE);
         setDt1RspCcmRelSrvcInd(CONSTANTS.SPACE);
         setDt1RspCcmPriorAuthInd(CONSTANTS.SPACE);
         setDt1RspEbrPriorAuthInd(CONSTANTS.SPACE);
         setDt1RspEbcPriorAuthInd(CONSTANTS.SPACE);
         setDt1RspOncPolPrtcpCd(CONSTANTS.SPACE);
                     setDt1RspTotalClaimCount(0);
                     setDt1RspCurrentClaimCount(0);
         setDt1RspExplCode(CONSTANTS.SPACE);
         setDt1RspNextKey(CONSTANTS.SPACE_80);
         setDt1RspClmContainerName(CONSTANTS.SPACE_16);
                     setDt1RspClmContainerItemCnt(0);
                     setDt1RspClmContainerItemLen(0);
         setDt1RspGenTstPrtcpCd(CONSTANTS.SPACE);
         setDt1RspSecOpinVendCd(CONSTANTS.SPACE);
         setDt1RspUgiInd(CONSTANTS.SPACE);
         setDt1RspLgiInd(CONSTANTS.SPACE);
         setDt1RspExdInd(CONSTANTS.SPACE);
         setDt1RspFillerArea(CONSTANTS.SPACE_154);
   }

		public static int getDt1RspFixedAreaFieldLength() {
			return DT_1_RSP_FIXED_AREA_LENGTH;
		}

}
  
