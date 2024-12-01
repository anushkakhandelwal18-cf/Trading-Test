package com.cloudframe.app.dto.o529351u;

/**
*  The class DrstRestartDataArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DrstRestartDataArea extends DrstRestartDataAreaSerialized { 
   
				private DrstReturnArea drstReturnArea = new DrstReturnArea();
				private DrstSqlErrorMsgArea drstSqlErrorMsgArea = new DrstSqlErrorMsgArea();
				private DrstCicsErrorMsgArea drstCicsErrorMsgArea = new DrstCicsErrorMsgArea();
				private DrstRetSupplementalArea drstRetSupplementalArea = new DrstRetSupplementalArea();

						private char[] drstRetLbmsub90Area = Field.fillLowValue(750);
	
	/**
	* Constructor for DrstRestartDataArea
	**/
    public DrstRestartDataArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			drstReturnArea.setParent(this,getStartOffset() + 299);
	       			drstSqlErrorMsgArea.setParent(this,getStartOffset() + 342);
	       			drstCicsErrorMsgArea.setParent(this,getStartOffset() + 342);
	       			drstRetSupplementalArea.setParent(this,getStartOffset() + 459);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of drstReturnArea
	 *	@return drstReturnArea
	 */   
	 public DrstReturnArea getDrstReturnArea() {
   	return drstReturnArea;
   }
   /**
	* 	Update DrstReturnArea with the passed value
	*   Corresponding COBOL Variable is DRST-RETURN-AREA
	*	@param value
	*/
   public void setDrstReturnArea(char[] value) {
      drstReturnArea.setString(value); 
   }   
    
     /**
	 * 	Update DrstReturnArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDrstReturnArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstReturnArea.begin,drstReturnArea.length());
   }
   
     /**
	 * 	Update DrstReturnArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstReturnArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstReturnArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DrstReturnArea with another Field
	 *	@param value
	 */
   public void setDrstReturnArea(Field source) {
   	replace(source,0,source.length(),drstReturnArea.begin,drstReturnArea.length());
   }  
   
     /**
	 * 	Update DrstReturnArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDrstReturnArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstReturnArea.begin,drstReturnArea.length());
   }
   
     /**
	 * 	Update DrstReturnArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstReturnArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstReturnArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of drstSqlErrorMsgArea
	 *	@return drstSqlErrorMsgArea
	 */   
	 public DrstSqlErrorMsgArea getDrstSqlErrorMsgArea() {
   	return drstSqlErrorMsgArea;
   }
   /**
	* 	Update DrstSqlErrorMsgArea with the passed value
	*   Corresponding COBOL Variable is DRST-SQL-ERROR-MSG-AREA
	*	@param value
	*/
   public void setDrstSqlErrorMsgArea(char[] value) {
      drstSqlErrorMsgArea.setString(value); 
   }   
    
     /**
	 * 	Update DrstSqlErrorMsgArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDrstSqlErrorMsgArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstSqlErrorMsgArea.begin,drstSqlErrorMsgArea.length());
   }
   
     /**
	 * 	Update DrstSqlErrorMsgArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstSqlErrorMsgArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstSqlErrorMsgArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DrstSqlErrorMsgArea with another Field
	 *	@param value
	 */
   public void setDrstSqlErrorMsgArea(Field source) {
   	replace(source,0,source.length(),drstSqlErrorMsgArea.begin,drstSqlErrorMsgArea.length());
   }  
   
     /**
	 * 	Update DrstSqlErrorMsgArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDrstSqlErrorMsgArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstSqlErrorMsgArea.begin,drstSqlErrorMsgArea.length());
   }
   
     /**
	 * 	Update DrstSqlErrorMsgArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstSqlErrorMsgArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstSqlErrorMsgArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of drstCicsErrorMsgArea
	 *	@return drstCicsErrorMsgArea
	 */   
	 public DrstCicsErrorMsgArea getDrstCicsErrorMsgArea() {
   	return drstCicsErrorMsgArea;
   }
   /**
	* 	Update DrstCicsErrorMsgArea with the passed value
	*   Corresponding COBOL Variable is DRST-CICS-ERROR-MSG-AREA
	*	@param value
	*/
   public void setDrstCicsErrorMsgArea(char[] value) {
      drstCicsErrorMsgArea.setString(value); 
   }   
    
     /**
	 * 	Update DrstCicsErrorMsgArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDrstCicsErrorMsgArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstCicsErrorMsgArea.begin,drstCicsErrorMsgArea.length());
   }
   
     /**
	 * 	Update DrstCicsErrorMsgArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstCicsErrorMsgArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstCicsErrorMsgArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DrstCicsErrorMsgArea with another Field
	 *	@param value
	 */
   public void setDrstCicsErrorMsgArea(Field source) {
   	replace(source,0,source.length(),drstCicsErrorMsgArea.begin,drstCicsErrorMsgArea.length());
   }  
   
     /**
	 * 	Update DrstCicsErrorMsgArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDrstCicsErrorMsgArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstCicsErrorMsgArea.begin,drstCicsErrorMsgArea.length());
   }
   
     /**
	 * 	Update DrstCicsErrorMsgArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstCicsErrorMsgArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstCicsErrorMsgArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of drstRetSupplementalArea
	 *	@return drstRetSupplementalArea
	 */   
	 public DrstRetSupplementalArea getDrstRetSupplementalArea() {
   	return drstRetSupplementalArea;
   }
   /**
	* 	Update DrstRetSupplementalArea with the passed value
	*   Corresponding COBOL Variable is DRST-RET-SUPPLEMENTAL-AREA
	*	@param value
	*/
   public void setDrstRetSupplementalArea(char[] value) {
      drstRetSupplementalArea.setString(value); 
   }   
    
     /**
	 * 	Update DrstRetSupplementalArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDrstRetSupplementalArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstRetSupplementalArea.begin,drstRetSupplementalArea.length());
   }
   
     /**
	 * 	Update DrstRetSupplementalArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstRetSupplementalArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstRetSupplementalArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DrstRetSupplementalArea with another Field
	 *	@param value
	 */
   public void setDrstRetSupplementalArea(Field source) {
   	replace(source,0,source.length(),drstRetSupplementalArea.begin,drstRetSupplementalArea.length());
   }  
   
     /**
	 * 	Update DrstRetSupplementalArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDrstRetSupplementalArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,drstRetSupplementalArea.begin,drstRetSupplementalArea.length());
   }
   
     /**
	 * 	Update DrstRetSupplementalArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstRetSupplementalArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,drstRetSupplementalArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of drstRetLbmsub90Area
	 *	@return drstRetLbmsub90Area
	 */
   public char[] getDrstRetLbmsub90Area() throws CFException{
     if (isDrstRetLbmsub90AreaModified()) { 
        drstRetLbmsub90Area = refreshDrstRetLbmsub90Area();
     }
   		return drstRetLbmsub90Area;
   }

  
	/**
	*  set variable drstRetLbmsub90Area
	*  Corresponding COBOL Variable is DRST-RET-LBMSUB90-AREA
	*  @param value
	**/
   public void setDrstRetLbmsub90Area(char[] value) {
      drstRetLbmsub90Area = checkDrstRetLbmsub90AreaConstraints(value);
      serializeDrstRetLbmsub90Area(drstRetLbmsub90Area);
   } 

     /**
	 * 	Update DrstRetLbmsub90Area 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrstRetLbmsub90Area(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrstRetLbmsub90Area,drstRetLbmsub90Area.length);
   	
   }
   
   public void setDrstRetLbmsub90Area(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrstRetLbmsub90Area,drstRetLbmsub90Area.length);
   	
   }
   
     /**
	 * 	Update DrstRetLbmsub90Area 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstRetLbmsub90Area(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstRetLbmsub90Area+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrstRetLbmsub90Area with another Field
	 *	@param value
	 */
   public void setDrstRetLbmsub90Area(Field source) {
       replace(source,0,source.length(),beginDrstRetLbmsub90Area,DRST_RET_LBMSUB_90_AREA_LEN);
   	
   }  
   
     /**
	 * 	Update DrstRetLbmsub90Area 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrstRetLbmsub90Area(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrstRetLbmsub90Area,DRST_RET_LBMSUB_90_AREA_LEN);
   	
   }
   
     /**
	 * 	Update DrstRetLbmsub90Area 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstRetLbmsub90Area(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstRetLbmsub90Area+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDrstRestartDataAreaFieldLength() {
			return DRST_RESTART_DATA_AREA_LENGTH;
		}

}
  
