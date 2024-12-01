package com.cloudframe.app.dto.o529351u;

/**
*  The class FeServTo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FeServTo extends FeServToSerialized { 
   

						private char[] feSvc15To = new char[5];
	
	/**
	* Constructor for FeServTo
	**/
    public FeServTo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FeServTo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FeServTo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setFeSvc15To(fillSpace(5));
    } 

	/**
	 *	Returns the value of feSvc15To
	 *	@return feSvc15To
	 */
   public char[] getFeSvc15To() throws CFException{
     if (isFeSvc15ToModified()) { 
        feSvc15To = refreshFeSvc15To();
     }
   		return feSvc15To;
   }

  
	/**
	*  set variable feSvc15To
	*  Corresponding COBOL Variable is FE-SVC-1-5-TO
	*  @param value
	**/
   public void setFeSvc15To(char[] value) {
      feSvc15To = checkFeSvc15ToConstraints(value);
      serializeFeSvc15To(feSvc15To);
   } 

     /**
	 * 	Update FeSvc15To 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc15To(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc15To,feSvc15To.length);
   	
   }
   
   public void setFeSvc15To(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc15To,feSvc15To.length);
   	
   }
   
     /**
	 * 	Update FeSvc15To 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc15To(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc15To+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc15To with another Field
	 *	@param value
	 */
   public void setFeSvc15To(Field source) {
       replace(source,0,source.length(),beginFeSvc15To,FE_SVC_15_TO_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc15To 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc15To(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc15To,FE_SVC_15_TO_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc15To 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc15To(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc15To+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFeServToFieldLength() {
			return FE_SERV_TO_LENGTH;
		}

}
  
