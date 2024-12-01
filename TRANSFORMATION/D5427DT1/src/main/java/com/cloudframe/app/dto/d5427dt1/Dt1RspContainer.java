package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1RspContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1RspContainer extends Dt1RspContainerSerialized { 
   
				private Dt1RspFixedArea dt1RspFixedArea = new Dt1RspFixedArea();
	
	/**
	* Constructor for Dt1RspContainer
	**/
    public Dt1RspContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			dt1RspFixedArea.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dt1RspFixedArea
	 *	@return dt1RspFixedArea
	 */   
	 public Dt1RspFixedArea getDt1RspFixedArea() {
   	return dt1RspFixedArea;
   }
   /**
	* 	Update Dt1RspFixedArea with the passed value
	*   Corresponding COBOL Variable is DT1-RSP-FIXED-AREA
	*	@param value
	*/
   public void setDt1RspFixedArea(char[] value) {
      dt1RspFixedArea.setString(value); 
   }   
    
     /**
	 * 	Update Dt1RspFixedArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1RspFixedArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1RspFixedArea.begin,dt1RspFixedArea.length());
   }
   
     /**
	 * 	Update Dt1RspFixedArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspFixedArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1RspFixedArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1RspFixedArea with another Field
	 *	@param value
	 */
   public void setDt1RspFixedArea(Field source) {
   	replace(source,0,source.length(),dt1RspFixedArea.begin,dt1RspFixedArea.length());
   }  
   
     /**
	 * 	Update Dt1RspFixedArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1RspFixedArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1RspFixedArea.begin,dt1RspFixedArea.length());
   }
   
     /**
	 * 	Update Dt1RspFixedArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1RspFixedArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1RspFixedArea.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Dt1RspContainer
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          dt1RspFixedArea.initialize();
     
   }

		public static int getDt1RspContainerFieldLength() {
			return DT_1_RSP_CONTAINER_LENGTH;
		}

}
  
