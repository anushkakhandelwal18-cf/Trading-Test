package com.cloudframe.app.dto.trdpb006;

/**
*  The class Dcltbtrdsec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 20:09. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.trdpb006.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbtrdsec extends DcltbtrdsecSerialized { 
   

						private char[] secDescription = Field.fillLowValue(40);

						private char[] secSymbol = Field.fillLowValue(20);

						private char[] secType = Field.fillLowValue(20);
	
	/**
	* Constructor for Dcltbtrdsec
	**/
    public Dcltbtrdsec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of secDescription
	 *	@return secDescription
	 */
   public char[] getSecDescription() throws CFException{
     if (isSecDescriptionModified()) { 
        secDescription = refreshSecDescription();
     }
   		return secDescription;
   }

  
	/**
	*  set variable secDescription
	*  Corresponding COBOL Variable is SEC-DESCRIPTION
	*  @param value
	**/
   public void setSecDescription(char[] value) {
      secDescription = checkSecDescriptionConstraints(value);
      serializeSecDescription(secDescription);
   } 

     /**
	 * 	Update SecDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecDescription(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecDescription,secDescription.length);
   	
   }
   
   public void setSecDescription(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecDescription,secDescription.length);
   	
   }
   
     /**
	 * 	Update SecDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecDescription+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecDescription with another Field
	 *	@param value
	 */
   public void setSecDescription(Field source) {
       replace(source,0,source.length(),beginSecDescription,SEC_DESCRIPTION_LEN);
   	
   }  
   
     /**
	 * 	Update SecDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecDescription(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecDescription,SEC_DESCRIPTION_LEN);
   	
   }
   
     /**
	 * 	Update SecDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecDescription+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of secSymbol
	 *	@return secSymbol
	 */
   public char[] getSecSymbol() throws CFException{
     if (isSecSymbolModified()) { 
        secSymbol = refreshSecSymbol();
     }
   		return secSymbol;
   }

  
	/**
	*  set variable secSymbol
	*  Corresponding COBOL Variable is SEC-SYMBOL
	*  @param value
	**/
   public void setSecSymbol(char[] value) {
      secSymbol = checkSecSymbolConstraints(value);
      serializeSecSymbol(secSymbol);
   } 

     /**
	 * 	Update SecSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecSymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecSymbol,secSymbol.length);
   	
   }
   
   public void setSecSymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecSymbol,secSymbol.length);
   	
   }
   
     /**
	 * 	Update SecSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecSymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecSymbol with another Field
	 *	@param value
	 */
   public void setSecSymbol(Field source) {
       replace(source,0,source.length(),beginSecSymbol,SEC_SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update SecSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecSymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecSymbol,SEC_SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update SecSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecSymbol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of secType
	 *	@return secType
	 */
   public char[] getSecType() throws CFException{
     if (isSecTypeModified()) { 
        secType = refreshSecType();
     }
   		return secType;
   }

  
	/**
	*  set variable secType
	*  Corresponding COBOL Variable is SEC-TYPE
	*  @param value
	**/
   public void setSecType(char[] value) {
      secType = checkSecTypeConstraints(value);
      serializeSecType(secType);
   } 

     /**
	 * 	Update SecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecType,secType.length);
   	
   }
   
   public void setSecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecType,secType.length);
   	
   }
   
     /**
	 * 	Update SecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecType with another Field
	 *	@param value
	 */
   public void setSecType(Field source) {
       replace(source,0,source.length(),beginSecType,SEC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update SecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecType,SEC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update SecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecType+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbtrdsecFieldLength() {
			return DCLTBTRDSEC_LENGTH;
		}

}
  
