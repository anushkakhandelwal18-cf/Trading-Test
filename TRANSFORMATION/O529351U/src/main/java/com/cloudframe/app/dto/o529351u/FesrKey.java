package com.cloudframe.app.dto.o529351u;

/**
*  The class FesrKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesrKey extends FesrKeySerialized { 
   

								private int fesrSpiNbr;

						private char[] fesrToPs = Field.fillLowValue(2);

						private char[] fesrToSvc = Field.fillLowValue(6);

						private char[] fesrToCause = Field.fillLowValue(1);
	
	/**
	* Constructor for FesrKey
	**/
    public FesrKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fesrSpiNbr
	 *	@return fesrSpiNbr
	 */
	public int getFesrSpiNbr() throws CFException {
       if (isFesrSpiNbrModified()) { 
           fesrSpiNbr = refreshFesrSpiNbr();
        }
   		return fesrSpiNbr;
	}
	

    /**
	 *	Returns the String value of fesrSpiNbr
	 *	@return fesrSpiNbr
	 */
	public char[]  getFesrSpiNbrActualString() {
	    String value = String.valueOf(fesrSpiNbr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update FesrSpiNbr with the passed value
	 *  Corresponding COBOL Variable is WS-FESR-SPI-NBR
	 *	@param number
	 */
	public void setFesrSpiNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fesrSpiNbr = checkFesrSpiNbrMaxLimit(number); 
		serializeFesrSpiNbr(fesrSpiNbr);
	}
	

	public void setFesrSpiNbr(long number) {
	    number = checkFesrSpiNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesrSpiNbr((int)number);
	}
	
	/**
	 * 	Update FesrSpiNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setFesrSpiNbr(char[] value) throws CFException {
		 fesrSpiNbr = serializeFesrSpiNbr(value);
	}
	/**
	 * 	Update FesrSpiNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFesrSpiNbrString(char[] value) throws CFException {
		 setFesrSpiNbr(value);
	}
	/**
	 *	Returns the value of fesrToPs
	 *	@return fesrToPs
	 */
   public char[] getFesrToPs() throws CFException{
     if (isFesrToPsModified()) { 
        fesrToPs = refreshFesrToPs();
     }
   		return fesrToPs;
   }

  
	/**
	*  set variable fesrToPs
	*  Corresponding COBOL Variable is WS-FESR-TO-PS
	*  @param value
	**/
   public void setFesrToPs(char[] value) {
      fesrToPs = checkFesrToPsConstraints(value);
      serializeFesrToPs(fesrToPs);
   } 

     /**
	 * 	Update FesrToPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrToPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrToPs,fesrToPs.length);
   	
   }
   
   public void setFesrToPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToPs,fesrToPs.length);
   	
   }
   
     /**
	 * 	Update FesrToPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrToPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrToPs with another Field
	 *	@param value
	 */
   public void setFesrToPs(Field source) {
       replace(source,0,source.length(),beginFesrToPs,FESR_TO_PS_LEN);
   	
   }  
   
     /**
	 * 	Update FesrToPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrToPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrToPs,FESR_TO_PS_LEN);
   	
   }
   
     /**
	 * 	Update FesrToPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrToPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesrToSvc
	 *	@return fesrToSvc
	 */
   public char[] getFesrToSvc() throws CFException{
     if (isFesrToSvcModified()) { 
        fesrToSvc = refreshFesrToSvc();
     }
   		return fesrToSvc;
   }

  
	/**
	*  set variable fesrToSvc
	*  Corresponding COBOL Variable is WS-FESR-TO-SVC
	*  @param value
	**/
   public void setFesrToSvc(char[] value) {
      fesrToSvc = checkFesrToSvcConstraints(value);
      serializeFesrToSvc(fesrToSvc);
   } 

     /**
	 * 	Update FesrToSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrToSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrToSvc,fesrToSvc.length);
   	
   }
   
   public void setFesrToSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToSvc,fesrToSvc.length);
   	
   }
   
     /**
	 * 	Update FesrToSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrToSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrToSvc with another Field
	 *	@param value
	 */
   public void setFesrToSvc(Field source) {
       replace(source,0,source.length(),beginFesrToSvc,FESR_TO_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update FesrToSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrToSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrToSvc,FESR_TO_SVC_LEN);
   	
   }
   
     /**
	 * 	Update FesrToSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrToSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesrToCause
	 *	@return fesrToCause
	 */
   public char[] getFesrToCause() throws CFException{
     if (isFesrToCauseModified()) { 
        fesrToCause = refreshFesrToCause();
     }
   		return fesrToCause;
   }

  
	/**
	*  set variable fesrToCause
	*  Corresponding COBOL Variable is WS-FESR-TO-CAUSE
	*  @param value
	**/
   public void setFesrToCause(char[] value) {
      fesrToCause = checkFesrToCauseConstraints(value);
      serializeFesrToCause(fesrToCause);
   } 

     /**
	 * 	Update FesrToCause 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrToCause(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrToCause,fesrToCause.length);
   	
   }
   
   public void setFesrToCause(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToCause,fesrToCause.length);
   	
   }
   
     /**
	 * 	Update FesrToCause 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrToCause(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToCause+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrToCause with another Field
	 *	@param value
	 */
   public void setFesrToCause(Field source) {
       replace(source,0,source.length(),beginFesrToCause,FESR_TO_CAUSE_LEN);
   	
   }  
   
     /**
	 * 	Update FesrToCause 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrToCause(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrToCause,FESR_TO_CAUSE_LEN);
   	
   }
   
     /**
	 * 	Update FesrToCause 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrToCause(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToCause+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFesrKeyFieldLength() {
			return FESR_KEY_LENGTH;
		}

}
  
