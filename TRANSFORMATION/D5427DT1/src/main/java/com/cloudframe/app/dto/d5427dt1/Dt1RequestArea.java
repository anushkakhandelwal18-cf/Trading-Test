package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1RequestArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Dt1RequestArea extends Dt1RequestAreaSerialized { 
   

						private char[] dt1ReqViewName = Field.fillLowValue(8);

						private char[] dt1ReqViewVersionNbr = Field.fillLowValue(2);

						private char[] dt1ReqSearchType = Field.fillLowValue(1);

						private char[] dt1ReqEmpid = Field.fillLowValue(10);

						private char[] dt1ReqPolicy = Field.fillLowValue(6);

								private int dt1ReqDepNbr;

						private char[] dt1ReqFirstName = Field.fillLowValue(16);

						private char[] dt1ReqRel = Field.fillLowValue(2);

						private char[] dt1ReqSystem = Field.fillLowValue(1);

								private int dt1ReqFilmOffice;

								private long dt1ReqFln;

						private char[] dt1ReqIcn = Field.fillLowValue(10);

								private long dt1ReqFirstServiceDate;

								private long dt1ReqLastServiceDate;

								private long dt1ReqProviderTin;

						private char[] dt1ReqFundingResp = Field.fillLowValue(1);

						private char[] dt1ReqAuthNbr = Field.fillLowValue(50);

						private char[] dt1ReqServiceCategory = Field.fillLowValue(2);
      private List<char[]> dt1ReqSpiCategoryCd; 


						private char[] dt1ReqNextKey = Field.fillLowValue(80);

						private char[] dt1ReqClmItemsRequested = Field.fillLowValue(5);

						private char[] dt1ReqCptFrom = Field.fillLowValue(7);

						private char[] dt1ReqCptThru = Field.fillLowValue(7);

						private char[] dt1ReqRevFrom = Field.fillLowValue(5);

						private char[] dt1ReqRevThru = Field.fillLowValue(5);

						private char[] dt1ReqRemarkCd = Field.fillLowValue(2);

						private char[] dt1ReqProvSpclCd = Field.fillLowValue(3);

						private char[] dt1ReqCauseCd = Field.fillLowValue(1);

						private char[] dt1ReqAppliedToOopInd = Field.fillLowValue(1);

						private char[] dt1ReqFillerArea = Field.fillLowValue(124);
	
	/**
	* Constructor for Dt1RequestArea
	**/
    public Dt1RequestArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1RequestArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1RequestArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dt1ReqViewName
	 *	@return dt1ReqViewName
	 */
   public char[] getDt1ReqViewName() throws CFException{
     if (isDt1ReqViewNameModified()) { 
        dt1ReqViewName = refreshDt1ReqViewName();
     }
   		return dt1ReqViewName;
   }

  
	/**
	*  set variable dt1ReqViewName
	*  Corresponding COBOL Variable is DT1-REQ-VIEW-NAME
	*  @param value
	**/
   public void setDt1ReqViewName(char[] value) {
      dt1ReqViewName = checkDt1ReqViewNameConstraints(value);
      serializeDt1ReqViewName(dt1ReqViewName);
   } 

     /**
	 * 	Update Dt1ReqViewName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqViewName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqViewName,dt1ReqViewName.length);
   	
   }
   
   public void setDt1ReqViewName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqViewName,dt1ReqViewName.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqViewName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqViewName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqViewName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqViewName with another Field
	 *	@param value
	 */
   public void setDt1ReqViewName(Field source) {
       replace(source,0,source.length(),beginDt1ReqViewName,DT_1_REQ_VIEW_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqViewName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqViewName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqViewName,DT_1_REQ_VIEW_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqViewName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqViewName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqViewName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqViewVersionNbr
	 *	@return dt1ReqViewVersionNbr
	 */
   public char[] getDt1ReqViewVersionNbr() throws CFException{
     if (isDt1ReqViewVersionNbrModified()) { 
        dt1ReqViewVersionNbr = refreshDt1ReqViewVersionNbr();
     }
   		return dt1ReqViewVersionNbr;
   }

  
	/**
	*  set variable dt1ReqViewVersionNbr
	*  Corresponding COBOL Variable is DT1-REQ-VIEW-VERSION-NBR
	*  @param value
	**/
   public void setDt1ReqViewVersionNbr(char[] value) {
      dt1ReqViewVersionNbr = checkDt1ReqViewVersionNbrConstraints(value);
      serializeDt1ReqViewVersionNbr(dt1ReqViewVersionNbr);
   } 

     /**
	 * 	Update Dt1ReqViewVersionNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqViewVersionNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqViewVersionNbr,dt1ReqViewVersionNbr.length);
   	
   }
   
   public void setDt1ReqViewVersionNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqViewVersionNbr,dt1ReqViewVersionNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqViewVersionNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqViewVersionNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqViewVersionNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqViewVersionNbr with another Field
	 *	@param value
	 */
   public void setDt1ReqViewVersionNbr(Field source) {
       replace(source,0,source.length(),beginDt1ReqViewVersionNbr,DT_1_REQ_VIEW_VERSION_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqViewVersionNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqViewVersionNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqViewVersionNbr,DT_1_REQ_VIEW_VERSION_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqViewVersionNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqViewVersionNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqViewVersionNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqSearchType
	 *	@return dt1ReqSearchType
	 */
   public char[] getDt1ReqSearchType() throws CFException{
     if (isDt1ReqSearchTypeModified()) { 
        dt1ReqSearchType = refreshDt1ReqSearchType();
     }
   		return dt1ReqSearchType;
   }

  
	/**
	*  set variable dt1ReqSearchType
	*  Corresponding COBOL Variable is DT1-REQ-SEARCH-TYPE
	*  @param value
	**/
   public void setDt1ReqSearchType(char[] value) {
      dt1ReqSearchType = checkDt1ReqSearchTypeConstraints(value);
      serializeDt1ReqSearchType(dt1ReqSearchType);
   } 

     /**
	 * 	Update Dt1ReqSearchType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqSearchType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqSearchType,dt1ReqSearchType.length);
   	
   }
   
   public void setDt1ReqSearchType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqSearchType,dt1ReqSearchType.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqSearchType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqSearchType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqSearchType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqSearchType with another Field
	 *	@param value
	 */
   public void setDt1ReqSearchType(Field source) {
       replace(source,0,source.length(),beginDt1ReqSearchType,DT_1_REQ_SEARCH_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqSearchType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqSearchType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqSearchType,DT_1_REQ_SEARCH_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqSearchType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqSearchType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqSearchType+targetIndex,targetLen);
    
   }
	char[] dt1ReqValidRequest88Value1 = "1".toCharArray();
char[] dt1ReqValidRequest88Value2 = "4".toCharArray();
char[] dt1ReqValidRequest88Value3 = "5".toCharArray();
char[] dt1ReqValidRequest88Value4 = "6".toCharArray();
char[] dt1ReqValidRequest88Value5 = "7".toCharArray();

	/**
	 *	Test condition "1" "4" "5" "6" "7" for isDt1ReqValidRequest()
	 *	@return  Returns true if isDt1ReqValidRequest() is "1" "4" "5" "6" "7"
	 */
   public boolean isDt1ReqValidRequest() throws CFException {
      return (  compareChars( getDt1ReqSearchType() , dt1ReqValidRequest88Value1)  == 0  ||  compareChars( getDt1ReqSearchType() , dt1ReqValidRequest88Value2)  == 0  ||  compareChars( getDt1ReqSearchType() , dt1ReqValidRequest88Value3)  == 0  ||  compareChars( getDt1ReqSearchType() , dt1ReqValidRequest88Value4)  == 0  ||  compareChars( getDt1ReqSearchType() , dt1ReqValidRequest88Value5)  == 0  );
   }


	/**
	*  set values "1" "4" "5" "6" "7"
	*/
   	public void setDt1ReqValidRequestTrue() {  			
    	setDt1ReqSearchType( dt1ReqValidRequest88Value1);
   	}
	char[] dt1ReqSearchIcnOnly88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isDt1ReqSearchIcnOnly()
	 *	@return  Returns true if isDt1ReqSearchIcnOnly() is "1"
	 */
   public boolean isDt1ReqSearchIcnOnly() throws CFException {
      return (  compareChars( getDt1ReqSearchType() , dt1ReqSearchIcnOnly88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setDt1ReqSearchIcnOnlyTrue() {  			
    	setDt1ReqSearchType( dt1ReqSearchIcnOnly88Value);
   	}
	char[] dt1ReqSearchMemberPlus88Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isDt1ReqSearchMemberPlus()
	 *	@return  Returns true if isDt1ReqSearchMemberPlus() is "4"
	 */
   public boolean isDt1ReqSearchMemberPlus() throws CFException {
      return (  compareChars( getDt1ReqSearchType() , dt1ReqSearchMemberPlus88Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setDt1ReqSearchMemberPlusTrue() {  			
    	setDt1ReqSearchType( dt1ReqSearchMemberPlus88Value);
   	}
	char[] dt1ReqSearchMbrAuthNbr88Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isDt1ReqSearchMbrAuthNbr()
	 *	@return  Returns true if isDt1ReqSearchMbrAuthNbr() is "5"
	 */
   public boolean isDt1ReqSearchMbrAuthNbr() throws CFException {
      return (  compareChars( getDt1ReqSearchType() , dt1ReqSearchMbrAuthNbr88Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setDt1ReqSearchMbrAuthNbrTrue() {  			
    	setDt1ReqSearchType( dt1ReqSearchMbrAuthNbr88Value);
   	}
	char[] dt1ReqSearchAuthsOnly88Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isDt1ReqSearchAuthsOnly()
	 *	@return  Returns true if isDt1ReqSearchAuthsOnly() is "6"
	 */
   public boolean isDt1ReqSearchAuthsOnly() throws CFException {
      return (  compareChars( getDt1ReqSearchType() , dt1ReqSearchAuthsOnly88Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setDt1ReqSearchAuthsOnlyTrue() {  			
    	setDt1ReqSearchType( dt1ReqSearchAuthsOnly88Value);
   	}
	char[] dt1ReqSearchCategory88Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isDt1ReqSearchCategory()
	 *	@return  Returns true if isDt1ReqSearchCategory() is "7"
	 */
   public boolean isDt1ReqSearchCategory() throws CFException {
      return (  compareChars( getDt1ReqSearchType() , dt1ReqSearchCategory88Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setDt1ReqSearchCategoryTrue() {  			
    	setDt1ReqSearchType( dt1ReqSearchCategory88Value);
   	}
	/**
	 *	Returns the value of dt1ReqEmpid
	 *	@return dt1ReqEmpid
	 */
   public char[] getDt1ReqEmpid() throws CFException{
     if (isDt1ReqEmpidModified()) { 
        dt1ReqEmpid = refreshDt1ReqEmpid();
     }
   		return dt1ReqEmpid;
   }

  
	/**
	*  set variable dt1ReqEmpid
	*  Corresponding COBOL Variable is DT1-REQ-EMPID
	*  @param value
	**/
   public void setDt1ReqEmpid(char[] value) {
      dt1ReqEmpid = checkDt1ReqEmpidConstraints(value);
      serializeDt1ReqEmpid(dt1ReqEmpid);
   } 

     /**
	 * 	Update Dt1ReqEmpid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqEmpid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqEmpid,dt1ReqEmpid.length);
   	
   }
   
   public void setDt1ReqEmpid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqEmpid,dt1ReqEmpid.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqEmpid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqEmpid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqEmpid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqEmpid with another Field
	 *	@param value
	 */
   public void setDt1ReqEmpid(Field source) {
       replace(source,0,source.length(),beginDt1ReqEmpid,DT_1_REQ_EMPID_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqEmpid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqEmpid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqEmpid,DT_1_REQ_EMPID_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqEmpid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqEmpid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqEmpid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqPolicy
	 *	@return dt1ReqPolicy
	 */
   public char[] getDt1ReqPolicy() throws CFException{
     if (isDt1ReqPolicyModified()) { 
        dt1ReqPolicy = refreshDt1ReqPolicy();
     }
   		return dt1ReqPolicy;
   }

  
	/**
	*  set variable dt1ReqPolicy
	*  Corresponding COBOL Variable is DT1-REQ-POLICY
	*  @param value
	**/
   public void setDt1ReqPolicy(char[] value) {
      dt1ReqPolicy = checkDt1ReqPolicyConstraints(value);
      serializeDt1ReqPolicy(dt1ReqPolicy);
   } 

     /**
	 * 	Update Dt1ReqPolicy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqPolicy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqPolicy,dt1ReqPolicy.length);
   	
   }
   
   public void setDt1ReqPolicy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqPolicy,dt1ReqPolicy.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqPolicy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqPolicy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqPolicy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqPolicy with another Field
	 *	@param value
	 */
   public void setDt1ReqPolicy(Field source) {
       replace(source,0,source.length(),beginDt1ReqPolicy,DT_1_REQ_POLICY_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqPolicy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqPolicy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqPolicy,DT_1_REQ_POLICY_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqPolicy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqPolicy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqPolicy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqDepNbr
	 *	@return dt1ReqDepNbr
	 */
	public int getDt1ReqDepNbr() throws CFException {
       if (isDt1ReqDepNbrModified()) { 
           dt1ReqDepNbr = refreshDt1ReqDepNbr();
        }
   		return dt1ReqDepNbr;
	}
	

	
	   
	/**
	 * 	Update Dt1ReqDepNbr with the passed value
	 *  Corresponding COBOL Variable is DT1-REQ-DEP-NBR
	 *	@param number
	 */
	public void setDt1ReqDepNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ReqDepNbr = checkDt1ReqDepNbrMaxLimit(number); 
		serializeDt1ReqDepNbr(dt1ReqDepNbr);
	}
	

	public void setDt1ReqDepNbr(long number) {
	    number = checkDt1ReqDepNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ReqDepNbr((int)number);
	}
	
	/**
	 * 	Update Dt1ReqDepNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ReqDepNbr(char[] value) throws CFException {
		 dt1ReqDepNbr = serializeDt1ReqDepNbr(value);
	}
	/**
	 * 	Update Dt1ReqDepNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ReqDepNbrString(char[] value) throws CFException {
		 setDt1ReqDepNbr(value);
	}
	/**
	 *	Returns the value of dt1ReqFirstName
	 *	@return dt1ReqFirstName
	 */
   public char[] getDt1ReqFirstName() throws CFException{
     if (isDt1ReqFirstNameModified()) { 
        dt1ReqFirstName = refreshDt1ReqFirstName();
     }
   		return dt1ReqFirstName;
   }

  
	/**
	*  set variable dt1ReqFirstName
	*  Corresponding COBOL Variable is DT1-REQ-FIRST-NAME
	*  @param value
	**/
   public void setDt1ReqFirstName(char[] value) {
      dt1ReqFirstName = checkDt1ReqFirstNameConstraints(value);
      serializeDt1ReqFirstName(dt1ReqFirstName);
   } 

     /**
	 * 	Update Dt1ReqFirstName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqFirstName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqFirstName,dt1ReqFirstName.length);
   	
   }
   
   public void setDt1ReqFirstName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqFirstName,dt1ReqFirstName.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqFirstName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqFirstName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqFirstName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqFirstName with another Field
	 *	@param value
	 */
   public void setDt1ReqFirstName(Field source) {
       replace(source,0,source.length(),beginDt1ReqFirstName,DT_1_REQ_FIRST_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqFirstName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqFirstName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqFirstName,DT_1_REQ_FIRST_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqFirstName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqFirstName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqFirstName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqRel
	 *	@return dt1ReqRel
	 */
   public char[] getDt1ReqRel() throws CFException{
     if (isDt1ReqRelModified()) { 
        dt1ReqRel = refreshDt1ReqRel();
     }
   		return dt1ReqRel;
   }

  
	/**
	*  set variable dt1ReqRel
	*  Corresponding COBOL Variable is DT1-REQ-REL
	*  @param value
	**/
   public void setDt1ReqRel(char[] value) {
      dt1ReqRel = checkDt1ReqRelConstraints(value);
      serializeDt1ReqRel(dt1ReqRel);
   } 

     /**
	 * 	Update Dt1ReqRel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqRel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqRel,dt1ReqRel.length);
   	
   }
   
   public void setDt1ReqRel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRel,dt1ReqRel.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqRel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqRel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqRel with another Field
	 *	@param value
	 */
   public void setDt1ReqRel(Field source) {
       replace(source,0,source.length(),beginDt1ReqRel,DT_1_REQ_REL_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqRel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqRel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqRel,DT_1_REQ_REL_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqRel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqRel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqSystem
	 *	@return dt1ReqSystem
	 */
   public char[] getDt1ReqSystem() throws CFException{
     if (isDt1ReqSystemModified()) { 
        dt1ReqSystem = refreshDt1ReqSystem();
     }
   		return dt1ReqSystem;
   }

  
	/**
	*  set variable dt1ReqSystem
	*  Corresponding COBOL Variable is DT1-REQ-SYSTEM
	*  @param value
	**/
   public void setDt1ReqSystem(char[] value) {
      dt1ReqSystem = checkDt1ReqSystemConstraints(value);
      serializeDt1ReqSystem(dt1ReqSystem);
   } 

     /**
	 * 	Update Dt1ReqSystem 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqSystem(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqSystem,dt1ReqSystem.length);
   	
   }
   
   public void setDt1ReqSystem(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqSystem,dt1ReqSystem.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqSystem 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqSystem(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqSystem+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqSystem with another Field
	 *	@param value
	 */
   public void setDt1ReqSystem(Field source) {
       replace(source,0,source.length(),beginDt1ReqSystem,DT_1_REQ_SYSTEM_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqSystem 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqSystem(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqSystem,DT_1_REQ_SYSTEM_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqSystem 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqSystem(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqSystem+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqFilmOffice
	 *	@return dt1ReqFilmOffice
	 */
	public int getDt1ReqFilmOffice() throws CFException {
       if (isDt1ReqFilmOfficeModified()) { 
           dt1ReqFilmOffice = refreshDt1ReqFilmOffice();
        }
   		return dt1ReqFilmOffice;
	}
	

	
	   
	/**
	 * 	Update Dt1ReqFilmOffice with the passed value
	 *  Corresponding COBOL Variable is DT1-REQ-FILM-OFFICE
	 *	@param number
	 */
	public void setDt1ReqFilmOffice(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ReqFilmOffice = checkDt1ReqFilmOfficeMaxLimit(number); 
		serializeDt1ReqFilmOffice(dt1ReqFilmOffice);
	}
	

	public void setDt1ReqFilmOffice(long number) {
	    number = checkDt1ReqFilmOfficeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ReqFilmOffice((int)number);
	}
	
	/**
	 * 	Update Dt1ReqFilmOffice with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ReqFilmOffice(char[] value) throws CFException {
		 dt1ReqFilmOffice = serializeDt1ReqFilmOffice(value);
	}
	/**
	 * 	Update Dt1ReqFilmOffice with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ReqFilmOfficeString(char[] value) throws CFException {
		 setDt1ReqFilmOffice(value);
	}
	/**
	 *	Returns the value of dt1ReqFln
	 *	@return dt1ReqFln
	 */
	public long getDt1ReqFln() throws CFException {
       if (isDt1ReqFlnModified()) { 
           dt1ReqFln = refreshDt1ReqFln();
        }
   		return dt1ReqFln;
	}
	

	
	   
	/**
	 * 	Update Dt1ReqFln with the passed value
	 *  Corresponding COBOL Variable is DT1-REQ-FLN
	 *	@param number
	 */
	public void setDt1ReqFln(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ReqFln = checkDt1ReqFlnMaxLimit(number); 
		serializeDt1ReqFln(dt1ReqFln);
	}
	

	/**
	 * 	Update Dt1ReqFln with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ReqFln(char[] value) throws CFException {
		 dt1ReqFln = serializeDt1ReqFln(value);
	}
	/**
	 * 	Update Dt1ReqFln with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ReqFlnString(char[] value) throws CFException {
		 setDt1ReqFln(value);
	}
	/**
	 *	Returns the value of dt1ReqIcn
	 *	@return dt1ReqIcn
	 */
   public char[] getDt1ReqIcn() throws CFException{
     if (isDt1ReqIcnModified()) { 
        dt1ReqIcn = refreshDt1ReqIcn();
     }
   		return dt1ReqIcn;
   }

  
	/**
	*  set variable dt1ReqIcn
	*  Corresponding COBOL Variable is DT1-REQ-ICN
	*  @param value
	**/
   public void setDt1ReqIcn(char[] value) {
      dt1ReqIcn = checkDt1ReqIcnConstraints(value);
      serializeDt1ReqIcn(dt1ReqIcn);
   } 

     /**
	 * 	Update Dt1ReqIcn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqIcn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqIcn,dt1ReqIcn.length);
   	
   }
   
   public void setDt1ReqIcn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqIcn,dt1ReqIcn.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqIcn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqIcn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqIcn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqIcn with another Field
	 *	@param value
	 */
   public void setDt1ReqIcn(Field source) {
       replace(source,0,source.length(),beginDt1ReqIcn,DT_1_REQ_ICN_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqIcn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqIcn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqIcn,DT_1_REQ_ICN_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqIcn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqIcn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqIcn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqFirstServiceDate
	 *	@return dt1ReqFirstServiceDate
	 */
	public long getDt1ReqFirstServiceDate() throws CFException {
       if (isDt1ReqFirstServiceDateModified()) { 
           dt1ReqFirstServiceDate = refreshDt1ReqFirstServiceDate();
        }
   		return dt1ReqFirstServiceDate;
	}
	

	
	   
	/**
	 * 	Update Dt1ReqFirstServiceDate with the passed value
	 *  Corresponding COBOL Variable is DT1-REQ-FIRST-SERVICE-DATE
	 *	@param number
	 */
	public void setDt1ReqFirstServiceDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ReqFirstServiceDate = checkDt1ReqFirstServiceDateMaxLimit(number); 
		serializeDt1ReqFirstServiceDate(dt1ReqFirstServiceDate);
	}
	

	/**
	 * 	Update Dt1ReqFirstServiceDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ReqFirstServiceDate(char[] value) throws CFException {
		 dt1ReqFirstServiceDate = serializeDt1ReqFirstServiceDate(value);
	}
	/**
	 * 	Update Dt1ReqFirstServiceDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ReqFirstServiceDateString(char[] value) throws CFException {
		 setDt1ReqFirstServiceDate(value);
	}
	/**
	 *	Returns the value of dt1ReqLastServiceDate
	 *	@return dt1ReqLastServiceDate
	 */
	public long getDt1ReqLastServiceDate() throws CFException {
       if (isDt1ReqLastServiceDateModified()) { 
           dt1ReqLastServiceDate = refreshDt1ReqLastServiceDate();
        }
   		return dt1ReqLastServiceDate;
	}
	

	
	   
	/**
	 * 	Update Dt1ReqLastServiceDate with the passed value
	 *  Corresponding COBOL Variable is DT1-REQ-LAST-SERVICE-DATE
	 *	@param number
	 */
	public void setDt1ReqLastServiceDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ReqLastServiceDate = checkDt1ReqLastServiceDateMaxLimit(number); 
		serializeDt1ReqLastServiceDate(dt1ReqLastServiceDate);
	}
	

	/**
	 * 	Update Dt1ReqLastServiceDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ReqLastServiceDate(char[] value) throws CFException {
		 dt1ReqLastServiceDate = serializeDt1ReqLastServiceDate(value);
	}
	/**
	 * 	Update Dt1ReqLastServiceDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ReqLastServiceDateString(char[] value) throws CFException {
		 setDt1ReqLastServiceDate(value);
	}
	/**
	 *	Returns the value of dt1ReqProviderTin
	 *	@return dt1ReqProviderTin
	 */
	public long getDt1ReqProviderTin() throws CFException {
       if (isDt1ReqProviderTinModified()) { 
           dt1ReqProviderTin = refreshDt1ReqProviderTin();
        }
   		return dt1ReqProviderTin;
	}
	

	
	   
	/**
	 * 	Update Dt1ReqProviderTin with the passed value
	 *  Corresponding COBOL Variable is DT1-REQ-PROVIDER-TIN
	 *	@param number
	 */
	public void setDt1ReqProviderTin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ReqProviderTin = checkDt1ReqProviderTinMaxLimit(number); 
		serializeDt1ReqProviderTin(dt1ReqProviderTin);
	}
	

	/**
	 * 	Update Dt1ReqProviderTin with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ReqProviderTin(char[] value) throws CFException {
		 dt1ReqProviderTin = serializeDt1ReqProviderTin(value);
	}
	/**
	 * 	Update Dt1ReqProviderTin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ReqProviderTinString(char[] value) throws CFException {
		 setDt1ReqProviderTin(value);
	}
	/**
	 *	Returns the value of dt1ReqFundingResp
	 *	@return dt1ReqFundingResp
	 */
   public char[] getDt1ReqFundingResp() throws CFException{
     if (isDt1ReqFundingRespModified()) { 
        dt1ReqFundingResp = refreshDt1ReqFundingResp();
     }
   		return dt1ReqFundingResp;
   }

  
	/**
	*  set variable dt1ReqFundingResp
	*  Corresponding COBOL Variable is DT1-REQ-FUNDING-RESP
	*  @param value
	**/
   public void setDt1ReqFundingResp(char[] value) {
      dt1ReqFundingResp = checkDt1ReqFundingRespConstraints(value);
      serializeDt1ReqFundingResp(dt1ReqFundingResp);
   } 

     /**
	 * 	Update Dt1ReqFundingResp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqFundingResp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqFundingResp,dt1ReqFundingResp.length);
   	
   }
   
   public void setDt1ReqFundingResp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqFundingResp,dt1ReqFundingResp.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqFundingResp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqFundingResp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqFundingResp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqFundingResp with another Field
	 *	@param value
	 */
   public void setDt1ReqFundingResp(Field source) {
       replace(source,0,source.length(),beginDt1ReqFundingResp,DT_1_REQ_FUNDING_RESP_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqFundingResp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqFundingResp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqFundingResp,DT_1_REQ_FUNDING_RESP_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqFundingResp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqFundingResp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqFundingResp+targetIndex,targetLen);
    
   }
	char[] dt1ReqAllFunding88Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isDt1ReqAllFunding()
	 *	@return  Returns true if isDt1ReqAllFunding() is "0"
	 */
   public boolean isDt1ReqAllFunding() throws CFException {
      return (  compareChars( getDt1ReqFundingResp() , dt1ReqAllFunding88Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setDt1ReqAllFundingTrue() {  			
    	setDt1ReqFundingResp( dt1ReqAllFunding88Value);
   	}
	char[] dt1ReqFullyInsured88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isDt1ReqFullyInsured()
	 *	@return  Returns true if isDt1ReqFullyInsured() is "1"
	 */
   public boolean isDt1ReqFullyInsured() throws CFException {
      return (  compareChars( getDt1ReqFundingResp() , dt1ReqFullyInsured88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setDt1ReqFullyInsuredTrue() {  			
    	setDt1ReqFundingResp( dt1ReqFullyInsured88Value);
   	}
	char[] dt1ReqSelfFunded88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isDt1ReqSelfFunded()
	 *	@return  Returns true if isDt1ReqSelfFunded() is "2"
	 */
   public boolean isDt1ReqSelfFunded() throws CFException {
      return (  compareChars( getDt1ReqFundingResp() , dt1ReqSelfFunded88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setDt1ReqSelfFundedTrue() {  			
    	setDt1ReqFundingResp( dt1ReqSelfFunded88Value);
   	}
	/**
	 *	Returns the value of dt1ReqAuthNbr
	 *	@return dt1ReqAuthNbr
	 */
   public char[] getDt1ReqAuthNbr() throws CFException{
     if (isDt1ReqAuthNbrModified()) { 
        dt1ReqAuthNbr = refreshDt1ReqAuthNbr();
     }
   		return dt1ReqAuthNbr;
   }

  
	/**
	*  set variable dt1ReqAuthNbr
	*  Corresponding COBOL Variable is DT1-REQ-AUTH-NBR
	*  @param value
	**/
   public void setDt1ReqAuthNbr(char[] value) {
      dt1ReqAuthNbr = checkDt1ReqAuthNbrConstraints(value);
      serializeDt1ReqAuthNbr(dt1ReqAuthNbr);
   } 

     /**
	 * 	Update Dt1ReqAuthNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqAuthNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqAuthNbr,dt1ReqAuthNbr.length);
   	
   }
   
   public void setDt1ReqAuthNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqAuthNbr,dt1ReqAuthNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqAuthNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqAuthNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqAuthNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqAuthNbr with another Field
	 *	@param value
	 */
   public void setDt1ReqAuthNbr(Field source) {
       replace(source,0,source.length(),beginDt1ReqAuthNbr,DT_1_REQ_AUTH_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqAuthNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqAuthNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqAuthNbr,DT_1_REQ_AUTH_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqAuthNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqAuthNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqAuthNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqServiceCategory
	 *	@return dt1ReqServiceCategory
	 */
   public char[] getDt1ReqServiceCategory() throws CFException{
     if (isDt1ReqServiceCategoryModified()) { 
        dt1ReqServiceCategory = refreshDt1ReqServiceCategory();
     }
   		return dt1ReqServiceCategory;
   }

  
	/**
	*  set variable dt1ReqServiceCategory
	*  Corresponding COBOL Variable is DT1-REQ-SERVICE-CATEGORY
	*  @param value
	**/
   public void setDt1ReqServiceCategory(char[] value) {
      dt1ReqServiceCategory = checkDt1ReqServiceCategoryConstraints(value);
      serializeDt1ReqServiceCategory(dt1ReqServiceCategory);
   } 

     /**
	 * 	Update Dt1ReqServiceCategory 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqServiceCategory(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqServiceCategory,dt1ReqServiceCategory.length);
   	
   }
   
   public void setDt1ReqServiceCategory(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqServiceCategory,dt1ReqServiceCategory.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqServiceCategory 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqServiceCategory(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqServiceCategory+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqServiceCategory with another Field
	 *	@param value
	 */
   public void setDt1ReqServiceCategory(Field source) {
       replace(source,0,source.length(),beginDt1ReqServiceCategory,DT_1_REQ_SERVICE_CATEGORY_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqServiceCategory 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqServiceCategory(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqServiceCategory,DT_1_REQ_SERVICE_CATEGORY_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqServiceCategory 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqServiceCategory(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqServiceCategory+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of dt1ReqSpiCategoryCd
	 *  Corresponding COBOL Variable is DT1-REQ-SPI-CATEGORY-CD
	 *	@return dt1ReqSpiCategoryCd
	 */
	public List<char[]> getDt1ReqSpiCategoryCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < DT_1_REQ_SPI_CATEGORY_CD_SIZE;index++) {
        	list.add( getDt1ReqSpiCategoryCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return dt1ReqSpiCategoryCd
	 */
	public char[] getDt1ReqSpiCategoryCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getDt1ReqSpiCategoryCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= DT_1_REQ_SPI_CATEGORY_CD_SIZE) {
             	index = DT_1_REQ_SPI_CATEGORY_CD_SIZE -1; // can't exceed max array size
             	logger.trace("dt1ReqSpiCategoryCd - Array index exceeded max Size {}, resetting it to max allowed",DT_1_REQ_SPI_CATEGORY_CD_SIZE); 
	    }
   	      return getCharArray( (beginDt1ReqSpiCategoryCd + index*DT_1_REQ_SPI_CATEGORY_CD_LEN) , DT_1_REQ_SPI_CATEGORY_CD_LEN );
    }
    
    
   public int  dt1ReqSpiCategoryCdFieldLength() {
   	return DT_1_REQ_SPI_CATEGORY_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Dt1ReqSpiCategoryCd with the passed value at a given index
	 *  Corresponding COBOL Variable is DT1-REQ-SPI-CATEGORY-CD
	 *  @param index
	 *	@param value
	 */
  public void setDt1ReqSpiCategoryCd(int index,char[] value) {
   	setDt1ReqSpiCategoryCd(index,value,true);
   }
   
   
   /**
	 *	Update Dt1ReqSpiCategoryCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setDt1ReqSpiCategoryCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setDt1ReqSpiCategoryCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeDt1ReqSpiCategoryCd(index,value);		
       }
   }
   
	/**
	 *	Returns the value of dt1ReqNextKey
	 *	@return dt1ReqNextKey
	 */
   public char[] getDt1ReqNextKey() throws CFException{
     if (isDt1ReqNextKeyModified()) { 
        dt1ReqNextKey = refreshDt1ReqNextKey();
     }
   		return dt1ReqNextKey;
   }

  
	/**
	*  set variable dt1ReqNextKey
	*  Corresponding COBOL Variable is DT1-REQ-NEXT-KEY
	*  @param value
	**/
   public void setDt1ReqNextKey(char[] value) {
      dt1ReqNextKey = checkDt1ReqNextKeyConstraints(value);
      serializeDt1ReqNextKey(dt1ReqNextKey);
   } 

     /**
	 * 	Update Dt1ReqNextKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqNextKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqNextKey,dt1ReqNextKey.length);
   	
   }
   
   public void setDt1ReqNextKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqNextKey,dt1ReqNextKey.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqNextKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqNextKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqNextKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqNextKey with another Field
	 *	@param value
	 */
   public void setDt1ReqNextKey(Field source) {
       replace(source,0,source.length(),beginDt1ReqNextKey,DT_1_REQ_NEXT_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqNextKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqNextKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqNextKey,DT_1_REQ_NEXT_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqNextKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqNextKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqNextKey+targetIndex,targetLen);
    
   }
	char[] dt1ReqStartAtTop88Value = "                                                                                ".toCharArray();
	/**
	 *	Test condition " " for isDt1ReqStartAtTop()
	 *	@return  Returns true if isDt1ReqStartAtTop() is " "
	 */
   public boolean isDt1ReqStartAtTop() throws CFException {
      return (  compareChars( getDt1ReqNextKey() , dt1ReqStartAtTop88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setDt1ReqStartAtTopTrue() {  			
    	setDt1ReqNextKey( dt1ReqStartAtTop88Value);
   	}
	/**
	 *	Returns the value of dt1ReqClmItemsRequested
	 *	@return dt1ReqClmItemsRequested
	 */
   public char[] getDt1ReqClmItemsRequested() throws CFException{
     if (isDt1ReqClmItemsRequestedModified()) { 
        dt1ReqClmItemsRequested = refreshDt1ReqClmItemsRequested();
     }
   		return dt1ReqClmItemsRequested;
   }

  
	/**
	*  set variable dt1ReqClmItemsRequested
	*  Corresponding COBOL Variable is DT1-REQ-CLM-ITEMS-REQUESTED
	*  @param value
	**/
   public void setDt1ReqClmItemsRequested(char[] value) {
      dt1ReqClmItemsRequested = checkDt1ReqClmItemsRequestedConstraints(value);
      serializeDt1ReqClmItemsRequested(dt1ReqClmItemsRequested);
   } 

     /**
	 * 	Update Dt1ReqClmItemsRequested 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqClmItemsRequested(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqClmItemsRequested,dt1ReqClmItemsRequested.length);
   	
   }
   
   public void setDt1ReqClmItemsRequested(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqClmItemsRequested,dt1ReqClmItemsRequested.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqClmItemsRequested 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqClmItemsRequested(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqClmItemsRequested+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqClmItemsRequested with another Field
	 *	@param value
	 */
   public void setDt1ReqClmItemsRequested(Field source) {
       replace(source,0,source.length(),beginDt1ReqClmItemsRequested,DT_1_REQ_CLM_ITEMS_REQUESTED_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqClmItemsRequested 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqClmItemsRequested(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqClmItemsRequested,DT_1_REQ_CLM_ITEMS_REQUESTED_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqClmItemsRequested 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqClmItemsRequested(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqClmItemsRequested+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqCptFrom
	 *	@return dt1ReqCptFrom
	 */
   public char[] getDt1ReqCptFrom() throws CFException{
     if (isDt1ReqCptFromModified()) { 
        dt1ReqCptFrom = refreshDt1ReqCptFrom();
     }
   		return dt1ReqCptFrom;
   }

  
	/**
	*  set variable dt1ReqCptFrom
	*  Corresponding COBOL Variable is DT1-REQ-CPT-FROM
	*  @param value
	**/
   public void setDt1ReqCptFrom(char[] value) {
      dt1ReqCptFrom = checkDt1ReqCptFromConstraints(value);
      serializeDt1ReqCptFrom(dt1ReqCptFrom);
   } 

     /**
	 * 	Update Dt1ReqCptFrom 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqCptFrom(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqCptFrom,dt1ReqCptFrom.length);
   	
   }
   
   public void setDt1ReqCptFrom(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqCptFrom,dt1ReqCptFrom.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqCptFrom 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqCptFrom(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqCptFrom+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqCptFrom with another Field
	 *	@param value
	 */
   public void setDt1ReqCptFrom(Field source) {
       replace(source,0,source.length(),beginDt1ReqCptFrom,DT_1_REQ_CPT_FROM_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqCptFrom 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqCptFrom(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqCptFrom,DT_1_REQ_CPT_FROM_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqCptFrom 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqCptFrom(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqCptFrom+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqCptThru
	 *	@return dt1ReqCptThru
	 */
   public char[] getDt1ReqCptThru() throws CFException{
     if (isDt1ReqCptThruModified()) { 
        dt1ReqCptThru = refreshDt1ReqCptThru();
     }
   		return dt1ReqCptThru;
   }

  
	/**
	*  set variable dt1ReqCptThru
	*  Corresponding COBOL Variable is DT1-REQ-CPT-THRU
	*  @param value
	**/
   public void setDt1ReqCptThru(char[] value) {
      dt1ReqCptThru = checkDt1ReqCptThruConstraints(value);
      serializeDt1ReqCptThru(dt1ReqCptThru);
   } 

     /**
	 * 	Update Dt1ReqCptThru 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqCptThru(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqCptThru,dt1ReqCptThru.length);
   	
   }
   
   public void setDt1ReqCptThru(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqCptThru,dt1ReqCptThru.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqCptThru 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqCptThru(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqCptThru+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqCptThru with another Field
	 *	@param value
	 */
   public void setDt1ReqCptThru(Field source) {
       replace(source,0,source.length(),beginDt1ReqCptThru,DT_1_REQ_CPT_THRU_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqCptThru 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqCptThru(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqCptThru,DT_1_REQ_CPT_THRU_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqCptThru 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqCptThru(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqCptThru+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqRevFrom
	 *	@return dt1ReqRevFrom
	 */
   public char[] getDt1ReqRevFrom() throws CFException{
     if (isDt1ReqRevFromModified()) { 
        dt1ReqRevFrom = refreshDt1ReqRevFrom();
     }
   		return dt1ReqRevFrom;
   }

  
	/**
	*  set variable dt1ReqRevFrom
	*  Corresponding COBOL Variable is DT1-REQ-REV-FROM
	*  @param value
	**/
   public void setDt1ReqRevFrom(char[] value) {
      dt1ReqRevFrom = checkDt1ReqRevFromConstraints(value);
      serializeDt1ReqRevFrom(dt1ReqRevFrom);
   } 

     /**
	 * 	Update Dt1ReqRevFrom 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqRevFrom(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqRevFrom,dt1ReqRevFrom.length);
   	
   }
   
   public void setDt1ReqRevFrom(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRevFrom,dt1ReqRevFrom.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqRevFrom 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqRevFrom(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRevFrom+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqRevFrom with another Field
	 *	@param value
	 */
   public void setDt1ReqRevFrom(Field source) {
       replace(source,0,source.length(),beginDt1ReqRevFrom,DT_1_REQ_REV_FROM_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqRevFrom 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqRevFrom(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqRevFrom,DT_1_REQ_REV_FROM_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqRevFrom 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqRevFrom(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRevFrom+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqRevThru
	 *	@return dt1ReqRevThru
	 */
   public char[] getDt1ReqRevThru() throws CFException{
     if (isDt1ReqRevThruModified()) { 
        dt1ReqRevThru = refreshDt1ReqRevThru();
     }
   		return dt1ReqRevThru;
   }

  
	/**
	*  set variable dt1ReqRevThru
	*  Corresponding COBOL Variable is DT1-REQ-REV-THRU
	*  @param value
	**/
   public void setDt1ReqRevThru(char[] value) {
      dt1ReqRevThru = checkDt1ReqRevThruConstraints(value);
      serializeDt1ReqRevThru(dt1ReqRevThru);
   } 

     /**
	 * 	Update Dt1ReqRevThru 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqRevThru(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqRevThru,dt1ReqRevThru.length);
   	
   }
   
   public void setDt1ReqRevThru(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRevThru,dt1ReqRevThru.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqRevThru 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqRevThru(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRevThru+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqRevThru with another Field
	 *	@param value
	 */
   public void setDt1ReqRevThru(Field source) {
       replace(source,0,source.length(),beginDt1ReqRevThru,DT_1_REQ_REV_THRU_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqRevThru 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqRevThru(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqRevThru,DT_1_REQ_REV_THRU_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqRevThru 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqRevThru(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRevThru+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqRemarkCd
	 *	@return dt1ReqRemarkCd
	 */
   public char[] getDt1ReqRemarkCd() throws CFException{
     if (isDt1ReqRemarkCdModified()) { 
        dt1ReqRemarkCd = refreshDt1ReqRemarkCd();
     }
   		return dt1ReqRemarkCd;
   }

  
	/**
	*  set variable dt1ReqRemarkCd
	*  Corresponding COBOL Variable is DT1-REQ-REMARK-CD
	*  @param value
	**/
   public void setDt1ReqRemarkCd(char[] value) {
      dt1ReqRemarkCd = checkDt1ReqRemarkCdConstraints(value);
      serializeDt1ReqRemarkCd(dt1ReqRemarkCd);
   } 

     /**
	 * 	Update Dt1ReqRemarkCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqRemarkCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqRemarkCd,dt1ReqRemarkCd.length);
   	
   }
   
   public void setDt1ReqRemarkCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRemarkCd,dt1ReqRemarkCd.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqRemarkCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqRemarkCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRemarkCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqRemarkCd with another Field
	 *	@param value
	 */
   public void setDt1ReqRemarkCd(Field source) {
       replace(source,0,source.length(),beginDt1ReqRemarkCd,DT_1_REQ_REMARK_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqRemarkCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqRemarkCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqRemarkCd,DT_1_REQ_REMARK_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqRemarkCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqRemarkCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqRemarkCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqProvSpclCd
	 *	@return dt1ReqProvSpclCd
	 */
   public char[] getDt1ReqProvSpclCd() throws CFException{
     if (isDt1ReqProvSpclCdModified()) { 
        dt1ReqProvSpclCd = refreshDt1ReqProvSpclCd();
     }
   		return dt1ReqProvSpclCd;
   }

  
	/**
	*  set variable dt1ReqProvSpclCd
	*  Corresponding COBOL Variable is DT1-REQ-PROV-SPCL-CD
	*  @param value
	**/
   public void setDt1ReqProvSpclCd(char[] value) {
      dt1ReqProvSpclCd = checkDt1ReqProvSpclCdConstraints(value);
      serializeDt1ReqProvSpclCd(dt1ReqProvSpclCd);
   } 

     /**
	 * 	Update Dt1ReqProvSpclCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqProvSpclCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqProvSpclCd,dt1ReqProvSpclCd.length);
   	
   }
   
   public void setDt1ReqProvSpclCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqProvSpclCd,dt1ReqProvSpclCd.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqProvSpclCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqProvSpclCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqProvSpclCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqProvSpclCd with another Field
	 *	@param value
	 */
   public void setDt1ReqProvSpclCd(Field source) {
       replace(source,0,source.length(),beginDt1ReqProvSpclCd,DT_1_REQ_PROV_SPCL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqProvSpclCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqProvSpclCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqProvSpclCd,DT_1_REQ_PROV_SPCL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqProvSpclCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqProvSpclCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqProvSpclCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqCauseCd
	 *	@return dt1ReqCauseCd
	 */
   public char[] getDt1ReqCauseCd() throws CFException{
     if (isDt1ReqCauseCdModified()) { 
        dt1ReqCauseCd = refreshDt1ReqCauseCd();
     }
   		return dt1ReqCauseCd;
   }

  
	/**
	*  set variable dt1ReqCauseCd
	*  Corresponding COBOL Variable is DT1-REQ-CAUSE-CD
	*  @param value
	**/
   public void setDt1ReqCauseCd(char[] value) {
      dt1ReqCauseCd = checkDt1ReqCauseCdConstraints(value);
      serializeDt1ReqCauseCd(dt1ReqCauseCd);
   } 

     /**
	 * 	Update Dt1ReqCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqCauseCd,dt1ReqCauseCd.length);
   	
   }
   
   public void setDt1ReqCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqCauseCd,dt1ReqCauseCd.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqCauseCd with another Field
	 *	@param value
	 */
   public void setDt1ReqCauseCd(Field source) {
       replace(source,0,source.length(),beginDt1ReqCauseCd,DT_1_REQ_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqCauseCd,DT_1_REQ_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqCauseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1ReqAppliedToOopInd
	 *	@return dt1ReqAppliedToOopInd
	 */
   public char[] getDt1ReqAppliedToOopInd() throws CFException{
     if (isDt1ReqAppliedToOopIndModified()) { 
        dt1ReqAppliedToOopInd = refreshDt1ReqAppliedToOopInd();
     }
   		return dt1ReqAppliedToOopInd;
   }

  
	/**
	*  set variable dt1ReqAppliedToOopInd
	*  Corresponding COBOL Variable is DT1-REQ-APPLIED-TO-OOP-IND
	*  @param value
	**/
   public void setDt1ReqAppliedToOopInd(char[] value) {
      dt1ReqAppliedToOopInd = checkDt1ReqAppliedToOopIndConstraints(value);
      serializeDt1ReqAppliedToOopInd(dt1ReqAppliedToOopInd);
   } 

     /**
	 * 	Update Dt1ReqAppliedToOopInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqAppliedToOopInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqAppliedToOopInd,dt1ReqAppliedToOopInd.length);
   	
   }
   
   public void setDt1ReqAppliedToOopInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqAppliedToOopInd,dt1ReqAppliedToOopInd.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqAppliedToOopInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqAppliedToOopInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqAppliedToOopInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqAppliedToOopInd with another Field
	 *	@param value
	 */
   public void setDt1ReqAppliedToOopInd(Field source) {
       replace(source,0,source.length(),beginDt1ReqAppliedToOopInd,DT_1_REQ_APPLIED_TO_OOP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqAppliedToOopInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqAppliedToOopInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqAppliedToOopInd,DT_1_REQ_APPLIED_TO_OOP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqAppliedToOopInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqAppliedToOopInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqAppliedToOopInd+targetIndex,targetLen);
    
   }
	char[] dt1SelectClaimsWithOop88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDt1SelectClaimsWithOop()
	 *	@return  Returns true if isDt1SelectClaimsWithOop() is "Y"
	 */
   public boolean isDt1SelectClaimsWithOop() throws CFException {
      return (  compareChars( getDt1ReqAppliedToOopInd() , dt1SelectClaimsWithOop88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDt1SelectClaimsWithOopTrue() {  			
    	setDt1ReqAppliedToOopInd( dt1SelectClaimsWithOop88Value);
   	}
	/**
	 *	Returns the value of dt1ReqFillerArea
	 *	@return dt1ReqFillerArea
	 */
   public char[] getDt1ReqFillerArea() throws CFException{
     if (isDt1ReqFillerAreaModified()) { 
        dt1ReqFillerArea = refreshDt1ReqFillerArea();
     }
   		return dt1ReqFillerArea;
   }

  
	/**
	*  set variable dt1ReqFillerArea
	*  Corresponding COBOL Variable is DT1-REQ-FILLER-AREA
	*  @param value
	**/
   public void setDt1ReqFillerArea(char[] value) {
      dt1ReqFillerArea = checkDt1ReqFillerAreaConstraints(value);
      serializeDt1ReqFillerArea(dt1ReqFillerArea);
   } 

     /**
	 * 	Update Dt1ReqFillerArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ReqFillerArea(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ReqFillerArea,dt1ReqFillerArea.length);
   	
   }
   
   public void setDt1ReqFillerArea(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqFillerArea,dt1ReqFillerArea.length);
   	
   }
   
     /**
	 * 	Update Dt1ReqFillerArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqFillerArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqFillerArea+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ReqFillerArea with another Field
	 *	@param value
	 */
   public void setDt1ReqFillerArea(Field source) {
       replace(source,0,source.length(),beginDt1ReqFillerArea,DT_1_REQ_FILLER_AREA_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ReqFillerArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ReqFillerArea(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ReqFillerArea,DT_1_REQ_FILLER_AREA_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ReqFillerArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ReqFillerArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ReqFillerArea+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDt1RequestAreaFieldLength() {
			return DT_1_REQUEST_AREA_LENGTH;
		}

}
  
