package com.cloudframe.app.dto.o529351u;

/**
*  The class LinkAreaM51u is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LinkAreaM51u extends LinkAreaM51uSerialized { 
   
				private M51uFlags m51uFlags = new M51uFlags();
				private M51uLinkage m51uLinkage = new M51uLinkage();
				private UGenericTranslation51 uGenericTranslation51 = new UGenericTranslation51();

						private char[] uCcmNOSvcInd51 = Field.fillLowValue(1);

						private char[] uSpiTblId51 = Field.fillLowValue(7);

						private char[] uHcrProcessSw51 = Field.fillLowValue(1);

						private char[] uHcrSpiSw51 = Field.fillLowValue(3);
	
	/**
	* Constructor for LinkAreaM51u
	**/
    public LinkAreaM51u() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LinkAreaM51u. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LinkAreaM51u(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			m51uFlags.setParent(this,getStartOffset() + 0);
	       			m51uLinkage.setParent(this,getStartOffset() + 3);
	       			uGenericTranslation51.setParent(this,getStartOffset() + 9348);
    } 

	/**
	 *	Returns the value of m51uFlags
	 *	@return m51uFlags
	 */   
	 public M51uFlags getM51uFlags() {
   	return m51uFlags;
   }
   /**
	* 	Update M51uFlags with the passed value
	*   Corresponding COBOL Variable is M51U-FLAGS
	*	@param value
	*/
   public void setM51uFlags(char[] value) {
      m51uFlags.setString(value); 
   }   
    
     /**
	 * 	Update M51uFlags 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setM51uFlags(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,m51uFlags.begin,m51uFlags.length());
   }
   
     /**
	 * 	Update M51uFlags 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setM51uFlags(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,m51uFlags.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update M51uFlags with another Field
	 *	@param value
	 */
   public void setM51uFlags(Field source) {
   	replace(source,0,source.length(),m51uFlags.begin,m51uFlags.length());
   }  
   
     /**
	 * 	Update M51uFlags 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setM51uFlags(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,m51uFlags.begin,m51uFlags.length());
   }
   
     /**
	 * 	Update M51uFlags 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setM51uFlags(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,m51uFlags.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of m51uLinkage
	 *	@return m51uLinkage
	 */   
	 public M51uLinkage getM51uLinkage() {
   	return m51uLinkage;
   }
   /**
	* 	Update M51uLinkage with the passed value
	*   Corresponding COBOL Variable is M51U-LINKAGE
	*	@param value
	*/
   public void setM51uLinkage(char[] value) {
      m51uLinkage.setString(value); 
   }   
    
     /**
	 * 	Update M51uLinkage 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setM51uLinkage(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,m51uLinkage.begin,m51uLinkage.length());
   }
   
     /**
	 * 	Update M51uLinkage 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setM51uLinkage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,m51uLinkage.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update M51uLinkage with another Field
	 *	@param value
	 */
   public void setM51uLinkage(Field source) {
   	replace(source,0,source.length(),m51uLinkage.begin,m51uLinkage.length());
   }  
   
     /**
	 * 	Update M51uLinkage 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setM51uLinkage(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,m51uLinkage.begin,m51uLinkage.length());
   }
   
     /**
	 * 	Update M51uLinkage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setM51uLinkage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,m51uLinkage.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of uGenericTranslation51
	 *	@return uGenericTranslation51
	 */   
	 public UGenericTranslation51 getUGenericTranslation51() {
   	return uGenericTranslation51;
   }
   /**
	* 	Update UGenericTranslation51 with the passed value
	*   Corresponding COBOL Variable is LK-51U-GENERIC-TRANSLATION
	*	@param value
	*/
   public void setUGenericTranslation51(char[] value) {
      uGenericTranslation51.setString(value); 
   }   
    
     /**
	 * 	Update UGenericTranslation51 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setUGenericTranslation51(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,uGenericTranslation51.begin,uGenericTranslation51.length());
   }
   
     /**
	 * 	Update UGenericTranslation51 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUGenericTranslation51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,uGenericTranslation51.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update UGenericTranslation51 with another Field
	 *	@param value
	 */
   public void setUGenericTranslation51(Field source) {
   	replace(source,0,source.length(),uGenericTranslation51.begin,uGenericTranslation51.length());
   }  
   
     /**
	 * 	Update UGenericTranslation51 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setUGenericTranslation51(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,uGenericTranslation51.begin,uGenericTranslation51.length());
   }
   
     /**
	 * 	Update UGenericTranslation51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUGenericTranslation51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,uGenericTranslation51.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of uCcmNOSvcInd51
	 *	@return uCcmNOSvcInd51
	 */
   public char[] getUCcmNOSvcInd51() throws CFException{
     if (isUCcmNOSvcInd51Modified()) { 
        uCcmNOSvcInd51 = refreshUCcmNOSvcInd51();
     }
   		return uCcmNOSvcInd51;
   }

  
	/**
	*  set variable uCcmNOSvcInd51
	*  Corresponding COBOL Variable is LK-51U-CCM-N-O-SVC-IND
	*  @param value
	**/
   public void setUCcmNOSvcInd51(char[] value) {
      uCcmNOSvcInd51 = checkUCcmNOSvcInd51Constraints(value);
      serializeUCcmNOSvcInd51(uCcmNOSvcInd51);
   } 

     /**
	 * 	Update UCcmNOSvcInd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUCcmNOSvcInd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUCcmNOSvcInd51,uCcmNOSvcInd51.length);
   	
   }
   
   public void setUCcmNOSvcInd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUCcmNOSvcInd51,uCcmNOSvcInd51.length);
   	
   }
   
     /**
	 * 	Update UCcmNOSvcInd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUCcmNOSvcInd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUCcmNOSvcInd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UCcmNOSvcInd51 with another Field
	 *	@param value
	 */
   public void setUCcmNOSvcInd51(Field source) {
       replace(source,0,source.length(),beginUCcmNOSvcInd51,U_CCM_NOSVC_IND_51_LEN);
   	
   }  
   
     /**
	 * 	Update UCcmNOSvcInd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUCcmNOSvcInd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUCcmNOSvcInd51,U_CCM_NOSVC_IND_51_LEN);
   	
   }
   
     /**
	 * 	Update UCcmNOSvcInd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUCcmNOSvcInd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUCcmNOSvcInd51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uSpiTblId51
	 *	@return uSpiTblId51
	 */
   public char[] getUSpiTblId51() throws CFException{
     if (isUSpiTblId51Modified()) { 
        uSpiTblId51 = refreshUSpiTblId51();
     }
   		return uSpiTblId51;
   }

  
	/**
	*  set variable uSpiTblId51
	*  Corresponding COBOL Variable is LK-51U-SPI-TBL-ID
	*  @param value
	**/
   public void setUSpiTblId51(char[] value) {
      uSpiTblId51 = checkUSpiTblId51Constraints(value);
      serializeUSpiTblId51(uSpiTblId51);
   } 

     /**
	 * 	Update USpiTblId51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUSpiTblId51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUSpiTblId51,uSpiTblId51.length);
   	
   }
   
   public void setUSpiTblId51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUSpiTblId51,uSpiTblId51.length);
   	
   }
   
     /**
	 * 	Update USpiTblId51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUSpiTblId51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUSpiTblId51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update USpiTblId51 with another Field
	 *	@param value
	 */
   public void setUSpiTblId51(Field source) {
       replace(source,0,source.length(),beginUSpiTblId51,U_SPI_TBL_ID_51_LEN);
   	
   }  
   
     /**
	 * 	Update USpiTblId51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUSpiTblId51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUSpiTblId51,U_SPI_TBL_ID_51_LEN);
   	
   }
   
     /**
	 * 	Update USpiTblId51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUSpiTblId51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUSpiTblId51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uHcrProcessSw51
	 *	@return uHcrProcessSw51
	 */
   public char[] getUHcrProcessSw51() throws CFException{
     if (isUHcrProcessSw51Modified()) { 
        uHcrProcessSw51 = refreshUHcrProcessSw51();
     }
   		return uHcrProcessSw51;
   }

  
	/**
	*  set variable uHcrProcessSw51
	*  Corresponding COBOL Variable is LK-51U-HCR-PROCESS-SW
	*  @param value
	**/
   public void setUHcrProcessSw51(char[] value) {
      uHcrProcessSw51 = checkUHcrProcessSw51Constraints(value);
      serializeUHcrProcessSw51(uHcrProcessSw51);
   } 

     /**
	 * 	Update UHcrProcessSw51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUHcrProcessSw51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUHcrProcessSw51,uHcrProcessSw51.length);
   	
   }
   
   public void setUHcrProcessSw51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUHcrProcessSw51,uHcrProcessSw51.length);
   	
   }
   
     /**
	 * 	Update UHcrProcessSw51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUHcrProcessSw51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUHcrProcessSw51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UHcrProcessSw51 with another Field
	 *	@param value
	 */
   public void setUHcrProcessSw51(Field source) {
       replace(source,0,source.length(),beginUHcrProcessSw51,U_HCR_PROCESS_SW_51_LEN);
   	
   }  
   
     /**
	 * 	Update UHcrProcessSw51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUHcrProcessSw51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUHcrProcessSw51,U_HCR_PROCESS_SW_51_LEN);
   	
   }
   
     /**
	 * 	Update UHcrProcessSw51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUHcrProcessSw51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUHcrProcessSw51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uHcrSpiSw51
	 *	@return uHcrSpiSw51
	 */
   public char[] getUHcrSpiSw51() throws CFException{
     if (isUHcrSpiSw51Modified()) { 
        uHcrSpiSw51 = refreshUHcrSpiSw51();
     }
   		return uHcrSpiSw51;
   }

  
	/**
	*  set variable uHcrSpiSw51
	*  Corresponding COBOL Variable is LK-51U-HCR-SPI-SW
	*  @param value
	**/
   public void setUHcrSpiSw51(char[] value) {
      uHcrSpiSw51 = checkUHcrSpiSw51Constraints(value);
      serializeUHcrSpiSw51(uHcrSpiSw51);
   } 

     /**
	 * 	Update UHcrSpiSw51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUHcrSpiSw51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUHcrSpiSw51,uHcrSpiSw51.length);
   	
   }
   
   public void setUHcrSpiSw51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUHcrSpiSw51,uHcrSpiSw51.length);
   	
   }
   
     /**
	 * 	Update UHcrSpiSw51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUHcrSpiSw51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUHcrSpiSw51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UHcrSpiSw51 with another Field
	 *	@param value
	 */
   public void setUHcrSpiSw51(Field source) {
       replace(source,0,source.length(),beginUHcrSpiSw51,U_HCR_SPI_SW_51_LEN);
   	
   }  
   
     /**
	 * 	Update UHcrSpiSw51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUHcrSpiSw51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUHcrSpiSw51,U_HCR_SPI_SW_51_LEN);
   	
   }
   
     /**
	 * 	Update UHcrSpiSw51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUHcrSpiSw51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUHcrSpiSw51+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLinkAreaM51uFieldLength() {
			return LINK_AREA_M_51U_LENGTH;
		}

}
  
