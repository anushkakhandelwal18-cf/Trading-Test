package com.cloudframe.app.dto.vp776a00;

/**
*  The class SdtSortDataTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.vp776a00.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SdtSortDataTableGroup extends SdtSortDataTableGroupSerialized { 
   

						private char[] sdtSortDataTable = Field.fillLowValue(1);
	
	/**
	* Constructor for SdtSortDataTableGroup
	**/
    public SdtSortDataTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sdtSortDataTable
	 *	@return sdtSortDataTable
	 */
   public char[] getSdtSortDataTable() throws CFException{
     if (isSdtSortDataTableModified()) { 
        sdtSortDataTable = refreshSdtSortDataTable();
     }
   		return sdtSortDataTable;
   }

  
	/**
	*  set variable sdtSortDataTable
	*  Corresponding COBOL Variable is SDT-SORT-DATA-TABLE
	*  @param value
	**/
   public void setSdtSortDataTable(char[] value) {
      sdtSortDataTable = checkSdtSortDataTableConstraints(value);
      serializeSdtSortDataTable(sdtSortDataTable);
   } 

     /**
	 * 	Update SdtSortDataTable 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdtSortDataTable(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdtSortDataTable,sdtSortDataTable.length);
   	
   }
   
   public void setSdtSortDataTable(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdtSortDataTable,sdtSortDataTable.length);
   	
   }
   
     /**
	 * 	Update SdtSortDataTable 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdtSortDataTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdtSortDataTable+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SdtSortDataTable with another Field
	 *	@param value
	 */
   public void setSdtSortDataTable(Field source) {
       replace(source,0,source.length(),beginSdtSortDataTable,SDT_SORT_DATA_TABLE_LEN);
   	
   }  
   
     /**
	 * 	Update SdtSortDataTable 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdtSortDataTable(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdtSortDataTable,SDT_SORT_DATA_TABLE_LEN);
   	
   }
   
     /**
	 * 	Update SdtSortDataTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdtSortDataTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdtSortDataTable+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSdtSortDataTableGroupFieldLength() {
			return SDT_SORT_DATA_TABLE_GROUP_LENGTH;
		}

}
  
