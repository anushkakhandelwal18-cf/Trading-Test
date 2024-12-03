package com.cloudframe.app.dto.trdpb006;

/**
*  The class Dcltbtrdcus is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:37. using version 5.0.0.162
**/


import com.cloudframe.app.dto.serialize.trdpb006.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbtrdcus extends DcltbtrdcusSerialized { 
   

						private char[] cusDescription = Field.fillLowValue(40);
	
	/**
	* Constructor for Dcltbtrdcus
	**/
    public Dcltbtrdcus() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
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

	
	
	

		public static int getDcltbtrdcusFieldLength() {
			return DCLTBTRDCUS_LENGTH;
		}

}
  
