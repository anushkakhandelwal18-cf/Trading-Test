package com.cloudframe.app.dto.o529351u;

/**
*  The class FesrFromCondFrToSvc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesrFromCondFrToSvc extends FesrFromCondFrToSvcSerialized { 
   

						private char[] fesrFromFrSvc = Field.fillLowValue(7);

						private char[] fesrFromToSvc = Field.fillLowValue(7);

						private char[] fesrSvcInd = Field.fillLowValue(1);
	
	/**
	* Constructor for FesrFromCondFrToSvc
	**/
    public FesrFromCondFrToSvc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesrFromCondFrToSvc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondFrToSvc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fesrFromFrSvc
	 *	@return fesrFromFrSvc
	 */
   public char[] getFesrFromFrSvc() throws CFException{
     if (isFesrFromFrSvcModified()) { 
        fesrFromFrSvc = refreshFesrFromFrSvc();
     }
   		return fesrFromFrSvc;
   }

  
	/**
	*  set variable fesrFromFrSvc
	*  Corresponding COBOL Variable is FESR-FROM-FR-SVC
	*  @param value
	**/
   public void setFesrFromFrSvc(char[] value) {
      fesrFromFrSvc = checkFesrFromFrSvcConstraints(value);
      serializeFesrFromFrSvc(fesrFromFrSvc);
   } 

     /**
	 * 	Update FesrFromFrSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrFromFrSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrFromFrSvc,fesrFromFrSvc.length);
   	
   }
   
   public void setFesrFromFrSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromFrSvc,fesrFromFrSvc.length);
   	
   }
   
     /**
	 * 	Update FesrFromFrSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromFrSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromFrSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrFromFrSvc with another Field
	 *	@param value
	 */
   public void setFesrFromFrSvc(Field source) {
       replace(source,0,source.length(),beginFesrFromFrSvc,FESR_FROM_FR_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update FesrFromFrSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrFromFrSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrFromFrSvc,FESR_FROM_FR_SVC_LEN);
   	
   }
   
     /**
	 * 	Update FesrFromFrSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromFrSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromFrSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesrFromToSvc
	 *	@return fesrFromToSvc
	 */
   public char[] getFesrFromToSvc() throws CFException{
     if (isFesrFromToSvcModified()) { 
        fesrFromToSvc = refreshFesrFromToSvc();
     }
   		return fesrFromToSvc;
   }

  
	/**
	*  set variable fesrFromToSvc
	*  Corresponding COBOL Variable is FESR-FROM-TO-SVC
	*  @param value
	**/
   public void setFesrFromToSvc(char[] value) {
      fesrFromToSvc = checkFesrFromToSvcConstraints(value);
      serializeFesrFromToSvc(fesrFromToSvc);
   } 

     /**
	 * 	Update FesrFromToSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrFromToSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrFromToSvc,fesrFromToSvc.length);
   	
   }
   
   public void setFesrFromToSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromToSvc,fesrFromToSvc.length);
   	
   }
   
     /**
	 * 	Update FesrFromToSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromToSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromToSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrFromToSvc with another Field
	 *	@param value
	 */
   public void setFesrFromToSvc(Field source) {
       replace(source,0,source.length(),beginFesrFromToSvc,FESR_FROM_TO_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update FesrFromToSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrFromToSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrFromToSvc,FESR_FROM_TO_SVC_LEN);
   	
   }
   
     /**
	 * 	Update FesrFromToSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromToSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromToSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesrSvcInd
	 *	@return fesrSvcInd
	 */
   public char[] getFesrSvcInd() throws CFException{
     if (isFesrSvcIndModified()) { 
        fesrSvcInd = refreshFesrSvcInd();
     }
   		return fesrSvcInd;
   }

  
	/**
	*  set variable fesrSvcInd
	*  Corresponding COBOL Variable is FESR-SVC-IND
	*  @param value
	**/
   public void setFesrSvcInd(char[] value) {
      fesrSvcInd = checkFesrSvcIndConstraints(value);
      serializeFesrSvcInd(fesrSvcInd);
   } 

     /**
	 * 	Update FesrSvcInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrSvcInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrSvcInd,fesrSvcInd.length);
   	
   }
   
   public void setFesrSvcInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrSvcInd,fesrSvcInd.length);
   	
   }
   
     /**
	 * 	Update FesrSvcInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrSvcInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrSvcInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrSvcInd with another Field
	 *	@param value
	 */
   public void setFesrSvcInd(Field source) {
       replace(source,0,source.length(),beginFesrSvcInd,FESR_SVC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update FesrSvcInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrSvcInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrSvcInd,FESR_SVC_IND_LEN);
   	
   }
   
     /**
	 * 	Update FesrSvcInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrSvcInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrSvcInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFesrFromCondFrToSvcFieldLength() {
			return FESR_FROM_COND_FR_TO_SVC_LENGTH;
		}

}
  
