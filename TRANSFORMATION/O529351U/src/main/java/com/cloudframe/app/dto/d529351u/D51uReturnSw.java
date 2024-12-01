package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uReturnSw is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uReturnSw extends D51uReturnSwSerialized { 
   

						private char[] planFoundSw = Field.fillLowValue(1);

						private char[] posFoundSw = Field.fillLowValue(1);

						private char[] svcFoundSw = Field.fillLowValue(1);

						private char[] provFoundSw = Field.fillLowValue(1);

						private char[] icdFoundSw = Field.fillLowValue(1);

						private char[] ipaFoundSw = Field.fillLowValue(1);

						private char[] causFoundSw = Field.fillLowValue(1);

						private char[] moreIcdFoundSw = Field.fillLowValue(1);

						private char[] cflgFoundSw = Field.fillLowValue(1);
				private D51uTableCounts d51uTableCounts = new D51uTableCounts();

						private char[] d51uReturnFiller = Field.fillLowValue(2);
	
	/**
	* Constructor for D51uReturnSw
	**/
    public D51uReturnSw() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uReturnSw. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uReturnSw(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			d51uTableCounts.setParent(this,getStartOffset() + 9);
    } 

	/**
	 *	Returns the value of planFoundSw
	 *	@return planFoundSw
	 */
   public char[] getPlanFoundSw() throws CFException{
     if (isPlanFoundSwModified()) { 
        planFoundSw = refreshPlanFoundSw();
     }
   		return planFoundSw;
   }

  
	/**
	*  set variable planFoundSw
	*  Corresponding COBOL Variable is PLAN-FOUND-SW
	*  @param value
	**/
   public void setPlanFoundSw(char[] value) {
      planFoundSw = checkPlanFoundSwConstraints(value);
      serializePlanFoundSw(planFoundSw);
   } 

     /**
	 * 	Update PlanFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlanFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlanFoundSw,planFoundSw.length);
   	
   }
   
   public void setPlanFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlanFoundSw,planFoundSw.length);
   	
   }
   
     /**
	 * 	Update PlanFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlanFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlanFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlanFoundSw with another Field
	 *	@param value
	 */
   public void setPlanFoundSw(Field source) {
       replace(source,0,source.length(),beginPlanFoundSw,PLAN_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update PlanFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlanFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlanFoundSw,PLAN_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update PlanFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlanFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlanFoundSw+targetIndex,targetLen);
    
   }
	char[] planFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isPlanFound()
	 *	@return  Returns true if isPlanFound() is "Y"
	 */
   public boolean isPlanFound() throws CFException {
      return (  compareChars( getPlanFoundSw() , planFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setPlanFoundTrue() {  			
    	setPlanFoundSw( planFound88Value);
   	}
	char[] planNotFound88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isPlanNotFound()
	 *	@return  Returns true if isPlanNotFound() is " "
	 */
   public boolean isPlanNotFound() throws CFException {
      return (  compareChars( getPlanFoundSw() , planNotFound88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setPlanNotFoundTrue() {  			
    	setPlanFoundSw( planNotFound88Value);
   	}
	/**
	 *	Returns the value of posFoundSw
	 *	@return posFoundSw
	 */
   public char[] getPosFoundSw() throws CFException{
     if (isPosFoundSwModified()) { 
        posFoundSw = refreshPosFoundSw();
     }
   		return posFoundSw;
   }

  
	/**
	*  set variable posFoundSw
	*  Corresponding COBOL Variable is POS-FOUND-SW
	*  @param value
	**/
   public void setPosFoundSw(char[] value) {
      posFoundSw = checkPosFoundSwConstraints(value);
      serializePosFoundSw(posFoundSw);
   } 

     /**
	 * 	Update PosFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPosFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPosFoundSw,posFoundSw.length);
   	
   }
   
   public void setPosFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPosFoundSw,posFoundSw.length);
   	
   }
   
     /**
	 * 	Update PosFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPosFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PosFoundSw with another Field
	 *	@param value
	 */
   public void setPosFoundSw(Field source) {
       replace(source,0,source.length(),beginPosFoundSw,POS_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update PosFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPosFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPosFoundSw,POS_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update PosFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPosFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPosFoundSw+targetIndex,targetLen);
    
   }
	char[] posFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isPosFound()
	 *	@return  Returns true if isPosFound() is "Y"
	 */
   public boolean isPosFound() throws CFException {
      return (  compareChars( getPosFoundSw() , posFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setPosFoundTrue() {  			
    	setPosFoundSw( posFound88Value);
   	}
	char[] posNotFound88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isPosNotFound()
	 *	@return  Returns true if isPosNotFound() is " "
	 */
   public boolean isPosNotFound() throws CFException {
      return (  compareChars( getPosFoundSw() , posNotFound88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setPosNotFoundTrue() {  			
    	setPosFoundSw( posNotFound88Value);
   	}
	/**
	 *	Returns the value of svcFoundSw
	 *	@return svcFoundSw
	 */
   public char[] getSvcFoundSw() throws CFException{
     if (isSvcFoundSwModified()) { 
        svcFoundSw = refreshSvcFoundSw();
     }
   		return svcFoundSw;
   }

  
	/**
	*  set variable svcFoundSw
	*  Corresponding COBOL Variable is SVC-FOUND-SW
	*  @param value
	**/
   public void setSvcFoundSw(char[] value) {
      svcFoundSw = checkSvcFoundSwConstraints(value);
      serializeSvcFoundSw(svcFoundSw);
   } 

     /**
	 * 	Update SvcFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvcFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvcFoundSw,svcFoundSw.length);
   	
   }
   
   public void setSvcFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvcFoundSw,svcFoundSw.length);
   	
   }
   
     /**
	 * 	Update SvcFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvcFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvcFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SvcFoundSw with another Field
	 *	@param value
	 */
   public void setSvcFoundSw(Field source) {
       replace(source,0,source.length(),beginSvcFoundSw,SVC_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update SvcFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvcFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvcFoundSw,SVC_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update SvcFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvcFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvcFoundSw+targetIndex,targetLen);
    
   }
	char[] svcdFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSvcdFound()
	 *	@return  Returns true if isSvcdFound() is "Y"
	 */
   public boolean isSvcdFound() throws CFException {
      return (  compareChars( getSvcFoundSw() , svcdFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSvcdFoundTrue() {  			
    	setSvcFoundSw( svcdFound88Value);
   	}
	char[] svcdNotFound88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isSvcdNotFound()
	 *	@return  Returns true if isSvcdNotFound() is " "
	 */
   public boolean isSvcdNotFound() throws CFException {
      return (  compareChars( getSvcFoundSw() , svcdNotFound88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setSvcdNotFoundTrue() {  			
    	setSvcFoundSw( svcdNotFound88Value);
   	}
	/**
	 *	Returns the value of provFoundSw
	 *	@return provFoundSw
	 */
   public char[] getProvFoundSw() throws CFException{
     if (isProvFoundSwModified()) { 
        provFoundSw = refreshProvFoundSw();
     }
   		return provFoundSw;
   }

  
	/**
	*  set variable provFoundSw
	*  Corresponding COBOL Variable is PROV-FOUND-SW
	*  @param value
	**/
   public void setProvFoundSw(char[] value) {
      provFoundSw = checkProvFoundSwConstraints(value);
      serializeProvFoundSw(provFoundSw);
   } 

     /**
	 * 	Update ProvFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProvFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProvFoundSw,provFoundSw.length);
   	
   }
   
   public void setProvFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProvFoundSw,provFoundSw.length);
   	
   }
   
     /**
	 * 	Update ProvFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProvFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProvFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProvFoundSw with another Field
	 *	@param value
	 */
   public void setProvFoundSw(Field source) {
       replace(source,0,source.length(),beginProvFoundSw,PROV_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update ProvFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProvFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProvFoundSw,PROV_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update ProvFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProvFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProvFoundSw+targetIndex,targetLen);
    
   }
	char[] provtypFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isProvtypFound()
	 *	@return  Returns true if isProvtypFound() is "Y"
	 */
   public boolean isProvtypFound() throws CFException {
      return (  compareChars( getProvFoundSw() , provtypFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setProvtypFoundTrue() {  			
    	setProvFoundSw( provtypFound88Value);
   	}
	char[] provtypNotFound88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isProvtypNotFound()
	 *	@return  Returns true if isProvtypNotFound() is " "
	 */
   public boolean isProvtypNotFound() throws CFException {
      return (  compareChars( getProvFoundSw() , provtypNotFound88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setProvtypNotFoundTrue() {  			
    	setProvFoundSw( provtypNotFound88Value);
   	}
	/**
	 *	Returns the value of icdFoundSw
	 *	@return icdFoundSw
	 */
   public char[] getIcdFoundSw() throws CFException{
     if (isIcdFoundSwModified()) { 
        icdFoundSw = refreshIcdFoundSw();
     }
   		return icdFoundSw;
   }

  
	/**
	*  set variable icdFoundSw
	*  Corresponding COBOL Variable is ICD-FOUND-SW
	*  @param value
	**/
   public void setIcdFoundSw(char[] value) {
      icdFoundSw = checkIcdFoundSwConstraints(value);
      serializeIcdFoundSw(icdFoundSw);
   } 

     /**
	 * 	Update IcdFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIcdFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIcdFoundSw,icdFoundSw.length);
   	
   }
   
   public void setIcdFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIcdFoundSw,icdFoundSw.length);
   	
   }
   
     /**
	 * 	Update IcdFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIcdFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIcdFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IcdFoundSw with another Field
	 *	@param value
	 */
   public void setIcdFoundSw(Field source) {
       replace(source,0,source.length(),beginIcdFoundSw,ICD_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update IcdFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIcdFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIcdFoundSw,ICD_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update IcdFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIcdFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIcdFoundSw+targetIndex,targetLen);
    
   }
	char[] icdFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIcdFound()
	 *	@return  Returns true if isIcdFound() is "Y"
	 */
   public boolean isIcdFound() throws CFException {
      return (  compareChars( getIcdFoundSw() , icdFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIcdFoundTrue() {  			
    	setIcdFoundSw( icdFound88Value);
   	}
	char[] icdNotFound88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIcdNotFound()
	 *	@return  Returns true if isIcdNotFound() is " "
	 */
   public boolean isIcdNotFound() throws CFException {
      return (  compareChars( getIcdFoundSw() , icdNotFound88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIcdNotFoundTrue() {  			
    	setIcdFoundSw( icdNotFound88Value);
   	}
	/**
	 *	Returns the value of ipaFoundSw
	 *	@return ipaFoundSw
	 */
   public char[] getIpaFoundSw() throws CFException{
     if (isIpaFoundSwModified()) { 
        ipaFoundSw = refreshIpaFoundSw();
     }
   		return ipaFoundSw;
   }

  
	/**
	*  set variable ipaFoundSw
	*  Corresponding COBOL Variable is IPA-FOUND-SW
	*  @param value
	**/
   public void setIpaFoundSw(char[] value) {
      ipaFoundSw = checkIpaFoundSwConstraints(value);
      serializeIpaFoundSw(ipaFoundSw);
   } 

     /**
	 * 	Update IpaFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpaFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIpaFoundSw,ipaFoundSw.length);
   	
   }
   
   public void setIpaFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIpaFoundSw,ipaFoundSw.length);
   	
   }
   
     /**
	 * 	Update IpaFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpaFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpaFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IpaFoundSw with another Field
	 *	@param value
	 */
   public void setIpaFoundSw(Field source) {
       replace(source,0,source.length(),beginIpaFoundSw,IPA_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update IpaFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpaFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIpaFoundSw,IPA_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update IpaFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpaFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpaFoundSw+targetIndex,targetLen);
    
   }
	char[] ipaFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIpaFound()
	 *	@return  Returns true if isIpaFound() is "Y"
	 */
   public boolean isIpaFound() throws CFException {
      return (  compareChars( getIpaFoundSw() , ipaFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIpaFoundTrue() {  			
    	setIpaFoundSw( ipaFound88Value);
   	}
	char[] ipaNotFound88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIpaNotFound()
	 *	@return  Returns true if isIpaNotFound() is " "
	 */
   public boolean isIpaNotFound() throws CFException {
      return (  compareChars( getIpaFoundSw() , ipaNotFound88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIpaNotFoundTrue() {  			
    	setIpaFoundSw( ipaNotFound88Value);
   	}
	/**
	 *	Returns the value of causFoundSw
	 *	@return causFoundSw
	 */
   public char[] getCausFoundSw() throws CFException{
     if (isCausFoundSwModified()) { 
        causFoundSw = refreshCausFoundSw();
     }
   		return causFoundSw;
   }

  
	/**
	*  set variable causFoundSw
	*  Corresponding COBOL Variable is CAUS-FOUND-SW
	*  @param value
	**/
   public void setCausFoundSw(char[] value) {
      causFoundSw = checkCausFoundSwConstraints(value);
      serializeCausFoundSw(causFoundSw);
   } 

     /**
	 * 	Update CausFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausFoundSw,causFoundSw.length);
   	
   }
   
   public void setCausFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausFoundSw,causFoundSw.length);
   	
   }
   
     /**
	 * 	Update CausFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausFoundSw with another Field
	 *	@param value
	 */
   public void setCausFoundSw(Field source) {
       replace(source,0,source.length(),beginCausFoundSw,CAUS_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update CausFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausFoundSw,CAUS_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update CausFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausFoundSw+targetIndex,targetLen);
    
   }
	char[] causecdFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isCausecdFound()
	 *	@return  Returns true if isCausecdFound() is "Y"
	 */
   public boolean isCausecdFound() throws CFException {
      return (  compareChars( getCausFoundSw() , causecdFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setCausecdFoundTrue() {  			
    	setCausFoundSw( causecdFound88Value);
   	}
	char[] causecdNotFound88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isCausecdNotFound()
	 *	@return  Returns true if isCausecdNotFound() is " "
	 */
   public boolean isCausecdNotFound() throws CFException {
      return (  compareChars( getCausFoundSw() , causecdNotFound88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setCausecdNotFoundTrue() {  			
    	setCausFoundSw( causecdNotFound88Value);
   	}
	/**
	 *	Returns the value of moreIcdFoundSw
	 *	@return moreIcdFoundSw
	 */
   public char[] getMoreIcdFoundSw() throws CFException{
     if (isMoreIcdFoundSwModified()) { 
        moreIcdFoundSw = refreshMoreIcdFoundSw();
     }
   		return moreIcdFoundSw;
   }

  
	/**
	*  set variable moreIcdFoundSw
	*  Corresponding COBOL Variable is MORE-ICD-FOUND-SW
	*  @param value
	**/
   public void setMoreIcdFoundSw(char[] value) {
      moreIcdFoundSw = checkMoreIcdFoundSwConstraints(value);
      serializeMoreIcdFoundSw(moreIcdFoundSw);
   } 

     /**
	 * 	Update MoreIcdFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMoreIcdFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMoreIcdFoundSw,moreIcdFoundSw.length);
   	
   }
   
   public void setMoreIcdFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMoreIcdFoundSw,moreIcdFoundSw.length);
   	
   }
   
     /**
	 * 	Update MoreIcdFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMoreIcdFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMoreIcdFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MoreIcdFoundSw with another Field
	 *	@param value
	 */
   public void setMoreIcdFoundSw(Field source) {
       replace(source,0,source.length(),beginMoreIcdFoundSw,MORE_ICD_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update MoreIcdFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMoreIcdFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMoreIcdFoundSw,MORE_ICD_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update MoreIcdFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMoreIcdFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMoreIcdFoundSw+targetIndex,targetLen);
    
   }
	char[] moreIcdFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isMoreIcdFound()
	 *	@return  Returns true if isMoreIcdFound() is "Y"
	 */
   public boolean isMoreIcdFound() throws CFException {
      return (  compareChars( getMoreIcdFoundSw() , moreIcdFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setMoreIcdFoundTrue() {  			
    	setMoreIcdFoundSw( moreIcdFound88Value);
   	}
	char[] moreIcdNotFound88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isMoreIcdNotFound()
	 *	@return  Returns true if isMoreIcdNotFound() is " "
	 */
   public boolean isMoreIcdNotFound() throws CFException {
      return (  compareChars( getMoreIcdFoundSw() , moreIcdNotFound88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setMoreIcdNotFoundTrue() {  			
    	setMoreIcdFoundSw( moreIcdNotFound88Value);
   	}
	/**
	 *	Returns the value of cflgFoundSw
	 *	@return cflgFoundSw
	 */
   public char[] getCflgFoundSw() throws CFException{
     if (isCflgFoundSwModified()) { 
        cflgFoundSw = refreshCflgFoundSw();
     }
   		return cflgFoundSw;
   }

  
	/**
	*  set variable cflgFoundSw
	*  Corresponding COBOL Variable is CFLG-FOUND-SW
	*  @param value
	**/
   public void setCflgFoundSw(char[] value) {
      cflgFoundSw = checkCflgFoundSwConstraints(value);
      serializeCflgFoundSw(cflgFoundSw);
   } 

     /**
	 * 	Update CflgFoundSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCflgFoundSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCflgFoundSw,cflgFoundSw.length);
   	
   }
   
   public void setCflgFoundSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCflgFoundSw,cflgFoundSw.length);
   	
   }
   
     /**
	 * 	Update CflgFoundSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCflgFoundSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCflgFoundSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CflgFoundSw with another Field
	 *	@param value
	 */
   public void setCflgFoundSw(Field source) {
       replace(source,0,source.length(),beginCflgFoundSw,CFLG_FOUND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update CflgFoundSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCflgFoundSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCflgFoundSw,CFLG_FOUND_SW_LEN);
   	
   }
   
     /**
	 * 	Update CflgFoundSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCflgFoundSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCflgFoundSw+targetIndex,targetLen);
    
   }
	char[] cflgFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isCflgFound()
	 *	@return  Returns true if isCflgFound() is "Y"
	 */
   public boolean isCflgFound() throws CFException {
      return (  compareChars( getCflgFoundSw() , cflgFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setCflgFoundTrue() {  			
    	setCflgFoundSw( cflgFound88Value);
   	}
	char[] cflgNotFound88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isCflgNotFound()
	 *	@return  Returns true if isCflgNotFound() is " "
	 */
   public boolean isCflgNotFound() throws CFException {
      return (  compareChars( getCflgFoundSw() , cflgNotFound88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setCflgNotFoundTrue() {  			
    	setCflgFoundSw( cflgNotFound88Value);
   	}
	/**
	 *	Returns the value of d51uTableCounts
	 *	@return d51uTableCounts
	 */   
	 public D51uTableCounts getD51uTableCounts() {
   	return d51uTableCounts;
   }
   /**
	* 	Update D51uTableCounts with the passed value
	*   Corresponding COBOL Variable is D51U-TABLE-COUNTS
	*	@param value
	*/
   public void setD51uTableCounts(char[] value) {
      d51uTableCounts.setString(value); 
   }   
    
     /**
	 * 	Update D51uTableCounts 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uTableCounts(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uTableCounts.begin,d51uTableCounts.length());
   }
   
     /**
	 * 	Update D51uTableCounts 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTableCounts(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uTableCounts.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uTableCounts with another Field
	 *	@param value
	 */
   public void setD51uTableCounts(Field source) {
   	replace(source,0,source.length(),d51uTableCounts.begin,d51uTableCounts.length());
   }  
   
     /**
	 * 	Update D51uTableCounts 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uTableCounts(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uTableCounts.begin,d51uTableCounts.length());
   }
   
     /**
	 * 	Update D51uTableCounts 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTableCounts(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uTableCounts.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uReturnFiller
	 *	@return d51uReturnFiller
	 */
   public char[] getD51uReturnFiller() throws CFException{
     if (isD51uReturnFillerModified()) { 
        d51uReturnFiller = refreshD51uReturnFiller();
     }
   		return d51uReturnFiller;
   }

  
	/**
	*  set variable d51uReturnFiller
	*  Corresponding COBOL Variable is D51U-RETURN-FILLER
	*  @param value
	**/
   public void setD51uReturnFiller(char[] value) {
      d51uReturnFiller = checkD51uReturnFillerConstraints(value);
      serializeD51uReturnFiller(d51uReturnFiller);
   } 

     /**
	 * 	Update D51uReturnFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uReturnFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uReturnFiller,d51uReturnFiller.length);
   	
   }
   
   public void setD51uReturnFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReturnFiller,d51uReturnFiller.length);
   	
   }
   
     /**
	 * 	Update D51uReturnFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uReturnFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReturnFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uReturnFiller with another Field
	 *	@param value
	 */
   public void setD51uReturnFiller(Field source) {
       replace(source,0,source.length(),beginD51uReturnFiller,D_51U_RETURN_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update D51uReturnFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uReturnFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uReturnFiller,D_51U_RETURN_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update D51uReturnFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uReturnFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReturnFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uReturnSwFieldLength() {
			return D_51U_RETURN_SW_LENGTH;
		}

}
  
