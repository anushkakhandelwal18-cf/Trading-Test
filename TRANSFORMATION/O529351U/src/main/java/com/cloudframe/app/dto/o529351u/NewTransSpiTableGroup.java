package com.cloudframe.app.dto.o529351u;

/**
*  The class NewTransSpiTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class NewTransSpiTableGroup extends NewTransSpiTableGroupSerialized { 
   

						private char[] newTransSpiTable = new char[12];
					private NewTransSpiTableR newTransSpiTableR = new NewTransSpiTableR();
	
	/**
	* Constructor for NewTransSpiTableGroup
	**/
    public NewTransSpiTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			newTransSpiTableR.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setNewTransSpiTable(("006000006001").toCharArray());
    }


 

	/**
	 *	Returns the value of newTransSpiTable
	 *	@return newTransSpiTable
	 */
   public char[] getNewTransSpiTable() throws CFException{
     if (isNewTransSpiTableModified()) { 
        newTransSpiTable = refreshNewTransSpiTable();
     }
   		return newTransSpiTable;
   }

  
	/**
	*  set variable newTransSpiTable
	*  Corresponding COBOL Variable is NEW-TRANS-SPI-TABLE
	*  @param value
	**/
   public void setNewTransSpiTable(char[] value) {
      newTransSpiTable = checkNewTransSpiTableConstraints(value);
      serializeNewTransSpiTable(newTransSpiTable);
   } 

     /**
	 * 	Update NewTransSpiTable 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNewTransSpiTable(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNewTransSpiTable,newTransSpiTable.length);
   	
   }
   
   public void setNewTransSpiTable(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNewTransSpiTable,newTransSpiTable.length);
   	
   }
   
     /**
	 * 	Update NewTransSpiTable 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewTransSpiTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewTransSpiTable+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NewTransSpiTable with another Field
	 *	@param value
	 */
   public void setNewTransSpiTable(Field source) {
       replace(source,0,source.length(),beginNewTransSpiTable,NEW_TRANS_SPI_TABLE_LEN);
   	
   }  
   
     /**
	 * 	Update NewTransSpiTable 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNewTransSpiTable(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNewTransSpiTable,NEW_TRANS_SPI_TABLE_LEN);
   	
   }
   
     /**
	 * 	Update NewTransSpiTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewTransSpiTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewTransSpiTable+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of newTransSpiTableR
	 *	@return newTransSpiTableR
	 */   
	 public NewTransSpiTableR getNewTransSpiTableR() {
   	return newTransSpiTableR;
   }
   /**
	* 	Update NewTransSpiTableR with the passed value
	*   Corresponding COBOL Variable is NEW-TRANS-SPI-TABLE-R
	*	@param value
	*/
   public void setNewTransSpiTableR(char[] value) {
      newTransSpiTableR.setString(value); 
   }   
    
     /**
	 * 	Update NewTransSpiTableR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setNewTransSpiTableR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,newTransSpiTableR.begin,newTransSpiTableR.length());
   }
   
     /**
	 * 	Update NewTransSpiTableR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewTransSpiTableR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,newTransSpiTableR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update NewTransSpiTableR with another Field
	 *	@param value
	 */
   public void setNewTransSpiTableR(Field source) {
   	replace(source,0,source.length(),newTransSpiTableR.begin,newTransSpiTableR.length());
   }  
   
     /**
	 * 	Update NewTransSpiTableR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setNewTransSpiTableR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,newTransSpiTableR.begin,newTransSpiTableR.length());
   }
   
     /**
	 * 	Update NewTransSpiTableR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewTransSpiTableR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,newTransSpiTableR.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getNewTransSpiTableGroupFieldLength() {
			return NEW_TRANS_SPI_TABLE_GROUP_LENGTH;
		}

}
  
