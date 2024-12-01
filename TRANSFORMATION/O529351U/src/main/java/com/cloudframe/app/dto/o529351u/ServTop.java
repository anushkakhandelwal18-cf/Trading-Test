package com.cloudframe.app.dto.o529351u;

/**
*  The class ServTop is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ServTop extends ServTopSerialized { 
   

						private char[] svc15 = new char[5];

						private char[] svc6 = Field.fillLowValue(1);
	
	/**
	* Constructor for ServTop
	**/
    public ServTop() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ServTop. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServTop(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSvc15(fillSpace(5));
    } 

	/**
	 *	Returns the value of svc15
	 *	@return svc15
	 */
   public char[] getSvc15() throws CFException{
     if (isSvc15Modified()) { 
        svc15 = refreshSvc15();
     }
   		return svc15;
   }

  
	/**
	*  set variable svc15
	*  Corresponding COBOL Variable is SVC-1-5
	*  @param value
	**/
   public void setSvc15(char[] value) {
      svc15 = checkSvc15Constraints(value);
      serializeSvc15(svc15);
   } 

     /**
	 * 	Update Svc15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvc15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvc15,svc15.length);
   	
   }
   
   public void setSvc15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvc15,svc15.length);
   	
   }
   
     /**
	 * 	Update Svc15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvc15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Svc15 with another Field
	 *	@param value
	 */
   public void setSvc15(Field source) {
       replace(source,0,source.length(),beginSvc15,SVC_15_LEN);
   	
   }  
   
     /**
	 * 	Update Svc15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvc15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvc15,SVC_15_LEN);
   	
   }
   
     /**
	 * 	Update Svc15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvc15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of svc6
	 *	@return svc6
	 */
   public char[] getSvc6() throws CFException{
     if (isSvc6Modified()) { 
        svc6 = refreshSvc6();
     }
   		return svc6;
   }

  
	/**
	*  set variable svc6
	*  Corresponding COBOL Variable is SVC-6
	*  @param value
	**/
   public void setSvc6(char[] value) {
      svc6 = checkSvc6Constraints(value);
      serializeSvc6(svc6);
   } 

     /**
	 * 	Update Svc6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvc6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvc6,svc6.length);
   	
   }
   
   public void setSvc6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvc6,svc6.length);
   	
   }
   
     /**
	 * 	Update Svc6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvc6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Svc6 with another Field
	 *	@param value
	 */
   public void setSvc6(Field source) {
       replace(source,0,source.length(),beginSvc6,SVC_6_LEN);
   	
   }  
   
     /**
	 * 	Update Svc6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvc6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvc6,SVC_6_LEN);
   	
   }
   
     /**
	 * 	Update Svc6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvc6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc6+targetIndex,targetLen);
    
   }

	
	
	

		public static int getServTopFieldLength() {
			return SERV_TOP_LENGTH;
		}

}
  
