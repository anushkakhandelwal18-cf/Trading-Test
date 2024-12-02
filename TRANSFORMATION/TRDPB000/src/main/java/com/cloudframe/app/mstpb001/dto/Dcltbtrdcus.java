package com.cloudframe.app.mstpb001.dto;

/**
*  The class Dcltbtrdcus is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:20. using version 5.0.0.161
**/


import com.cloudframe.app.mstpb001.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbtrdcus extends DcltbtrdcusSerialized { 
   

						private char[] cusCustomerId = Field.fillLowValue(12);

						private char[] cusCurrency = Field.fillLowValue(3);

						private char[] cusDescription = Field.fillLowValue(40);

						private char[] cusStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for Dcltbtrdcus
	**/
    public Dcltbtrdcus() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of cusCustomerId
	 *	@return cusCustomerId
	 */
   public char[] getCusCustomerId() throws CFException{
     if (isCusCustomerIdModified()) { 
        cusCustomerId = refreshCusCustomerId();
     }
   		return cusCustomerId;
   }

  
	/**
	*  set variable cusCustomerId
	*  Corresponding COBOL Variable is CUS-CUSTOMER-ID
	*  @param value
	**/
   public void setCusCustomerId(char[] value) {
      cusCustomerId = checkCusCustomerIdConstraints(value);
      serializeCusCustomerId(cusCustomerId);
   } 

     /**
	 * 	Update CusCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusCustomerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCusCustomerId,cusCustomerId.length);
   	
   }
   
   public void setCusCustomerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCusCustomerId,cusCustomerId.length);
   	
   }
   
     /**
	 * 	Update CusCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusCustomerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CusCustomerId with another Field
	 *	@param value
	 */
   public void setCusCustomerId(Field source) {
       replace(source,0,source.length(),beginCusCustomerId,CUS_CUSTOMER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CusCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusCustomerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCusCustomerId,CUS_CUSTOMER_ID_LEN);
   	
   }
   
     /**
	 * 	Update CusCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusCustomerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cusCurrency
	 *	@return cusCurrency
	 */
   public char[] getCusCurrency() throws CFException{
     if (isCusCurrencyModified()) { 
        cusCurrency = refreshCusCurrency();
     }
   		return cusCurrency;
   }

  
	/**
	*  set variable cusCurrency
	*  Corresponding COBOL Variable is CUS-CURRENCY
	*  @param value
	**/
   public void setCusCurrency(char[] value) {
      cusCurrency = checkCusCurrencyConstraints(value);
      serializeCusCurrency(cusCurrency);
   } 

     /**
	 * 	Update CusCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCusCurrency,cusCurrency.length);
   	
   }
   
   public void setCusCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCusCurrency,cusCurrency.length);
   	
   }
   
     /**
	 * 	Update CusCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CusCurrency with another Field
	 *	@param value
	 */
   public void setCusCurrency(Field source) {
       replace(source,0,source.length(),beginCusCurrency,CUS_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update CusCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCusCurrency,CUS_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update CusCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cusDescription
	 *	@return cusDescription
	 */
   public char[] getCusDescription() throws CFException{
     if (isCusDescriptionModified()) { 
        cusDescription = refreshCusDescription();
     }
   		return cusDescription;
   }

  
	/**
	*  set variable cusDescription
	*  Corresponding COBOL Variable is CUS-DESCRIPTION
	*  @param value
	**/
   public void setCusDescription(char[] value) {
      cusDescription = checkCusDescriptionConstraints(value);
      serializeCusDescription(cusDescription);
   } 

     /**
	 * 	Update CusDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusDescription(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCusDescription,cusDescription.length);
   	
   }
   
   public void setCusDescription(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCusDescription,cusDescription.length);
   	
   }
   
     /**
	 * 	Update CusDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusDescription+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CusDescription with another Field
	 *	@param value
	 */
   public void setCusDescription(Field source) {
       replace(source,0,source.length(),beginCusDescription,CUS_DESCRIPTION_LEN);
   	
   }  
   
     /**
	 * 	Update CusDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusDescription(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCusDescription,CUS_DESCRIPTION_LEN);
   	
   }
   
     /**
	 * 	Update CusDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusDescription+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cusStatus
	 *	@return cusStatus
	 */
   public char[] getCusStatus() throws CFException{
     if (isCusStatusModified()) { 
        cusStatus = refreshCusStatus();
     }
   		return cusStatus;
   }

  
	/**
	*  set variable cusStatus
	*  Corresponding COBOL Variable is CUS-STATUS
	*  @param value
	**/
   public void setCusStatus(char[] value) {
      cusStatus = checkCusStatusConstraints(value);
      serializeCusStatus(cusStatus);
   } 

     /**
	 * 	Update CusStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCusStatus,cusStatus.length);
   	
   }
   
   public void setCusStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCusStatus,cusStatus.length);
   	
   }
   
     /**
	 * 	Update CusStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CusStatus with another Field
	 *	@param value
	 */
   public void setCusStatus(Field source) {
       replace(source,0,source.length(),beginCusStatus,CUS_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update CusStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCusStatus,CUS_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update CusStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusStatus+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbtrdcusFieldLength() {
			return DCLTBTRDCUS_LENGTH;
		}

}
  
