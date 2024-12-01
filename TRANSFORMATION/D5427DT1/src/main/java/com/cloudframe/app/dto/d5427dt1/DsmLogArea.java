package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DsmLogArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DsmLogArea extends DsmLogAreaSerialized { 
   
				private DsmSqlErrorMsgArea dsmSqlErrorMsgArea = new DsmSqlErrorMsgArea();
	
	/**
	* Constructor for DsmLogArea
	**/
    public DsmLogArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DsmLogArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmLogArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			dsmSqlErrorMsgArea.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of dsmSqlErrorMsgArea
	 *	@return dsmSqlErrorMsgArea
	 */   
	 public DsmSqlErrorMsgArea getDsmSqlErrorMsgArea() {
   	return dsmSqlErrorMsgArea;
   }
   /**
	* 	Update DsmSqlErrorMsgArea with the passed value
	*   Corresponding COBOL Variable is DSM-SQL-ERROR-MSG-AREA
	*	@param value
	*/
   public void setDsmSqlErrorMsgArea(char[] value) {
      dsmSqlErrorMsgArea.setString(value); 
   }   
    
     /**
	 * 	Update DsmSqlErrorMsgArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDsmSqlErrorMsgArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dsmSqlErrorMsgArea.begin,dsmSqlErrorMsgArea.length());
   }
   
     /**
	 * 	Update DsmSqlErrorMsgArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmSqlErrorMsgArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dsmSqlErrorMsgArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DsmSqlErrorMsgArea with another Field
	 *	@param value
	 */
   public void setDsmSqlErrorMsgArea(Field source) {
   	replace(source,0,source.length(),dsmSqlErrorMsgArea.begin,dsmSqlErrorMsgArea.length());
   }  
   
     /**
	 * 	Update DsmSqlErrorMsgArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDsmSqlErrorMsgArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dsmSqlErrorMsgArea.begin,dsmSqlErrorMsgArea.length());
   }
   
     /**
	 * 	Update DsmSqlErrorMsgArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmSqlErrorMsgArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dsmSqlErrorMsgArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDsmLogAreaFieldLength() {
			return DSM_LOG_AREA_LENGTH;
		}

}
  
