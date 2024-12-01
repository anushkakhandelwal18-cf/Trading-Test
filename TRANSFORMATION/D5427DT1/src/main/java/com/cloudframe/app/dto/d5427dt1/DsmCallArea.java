package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DsmCallArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DsmCallArea extends DsmCallAreaSerialized { 
   

				private DsmCommonArea dsmCommonArea = new DsmCommonArea();
				private DsmLogArea dsmLogArea = new DsmLogArea();
	
	/**
	* Constructor for DsmCallArea
	**/
    public DsmCallArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			dsmCommonArea.setParent(this,getStartOffset() + 24);
	       			dsmLogArea.setParent(this,getStartOffset() + 990);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("VYDSMPRC - STARTS HERE  ").toCharArray()
             , getStartOffset() + 0
             ,24
             );
    }


 

	/**
	 *	Returns the value of dsmCommonArea
	 *	@return dsmCommonArea
	 */   
	 public DsmCommonArea getDsmCommonArea() {
   	return dsmCommonArea;
   }
   /**
	* 	Update DsmCommonArea with the passed value
	*   Corresponding COBOL Variable is DSM-COMMON-AREA
	*	@param value
	*/
   public void setDsmCommonArea(char[] value) {
      dsmCommonArea.setString(value); 
   }   
    
     /**
	 * 	Update DsmCommonArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDsmCommonArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dsmCommonArea.begin,dsmCommonArea.length());
   }
   
     /**
	 * 	Update DsmCommonArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmCommonArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dsmCommonArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DsmCommonArea with another Field
	 *	@param value
	 */
   public void setDsmCommonArea(Field source) {
   	replace(source,0,source.length(),dsmCommonArea.begin,dsmCommonArea.length());
   }  
   
     /**
	 * 	Update DsmCommonArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDsmCommonArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dsmCommonArea.begin,dsmCommonArea.length());
   }
   
     /**
	 * 	Update DsmCommonArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmCommonArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dsmCommonArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dsmLogArea
	 *	@return dsmLogArea
	 */   
	 public DsmLogArea getDsmLogArea() {
   	return dsmLogArea;
   }
   /**
	* 	Update DsmLogArea with the passed value
	*   Corresponding COBOL Variable is DSM-LOG-AREA
	*	@param value
	*/
   public void setDsmLogArea(char[] value) {
      dsmLogArea.setString(value); 
   }   
    
     /**
	 * 	Update DsmLogArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDsmLogArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dsmLogArea.begin,dsmLogArea.length());
   }
   
     /**
	 * 	Update DsmLogArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmLogArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dsmLogArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DsmLogArea with another Field
	 *	@param value
	 */
   public void setDsmLogArea(Field source) {
   	replace(source,0,source.length(),dsmLogArea.begin,dsmLogArea.length());
   }  
   
     /**
	 * 	Update DsmLogArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDsmLogArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dsmLogArea.begin,dsmLogArea.length());
   }
   
     /**
	 * 	Update DsmLogArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmLogArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dsmLogArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDsmCallAreaFieldLength() {
			return DSM_CALL_AREA_LENGTH;
		}

}
  
