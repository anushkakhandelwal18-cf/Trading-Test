package com.cloudframe.app.dto.o529351u;

/**
*  The class GenTransSpiTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class GenTransSpiTableGroup extends GenTransSpiTableGroupSerialized { 
   

						private char[] genTransSpiTable = new char[54];
					private GenTransSpiTableR genTransSpiTableR = new GenTransSpiTableR();
	
	/**
	* Constructor for GenTransSpiTableGroup
	**/
    public GenTransSpiTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			genTransSpiTableR.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setGenTransSpiTable(("009001009002009003009004009005009006009007009008009009").toCharArray());
    }


 

	/**
	 *	Returns the value of genTransSpiTable
	 *	@return genTransSpiTable
	 */
   public char[] getGenTransSpiTable() throws CFException{
     if (isGenTransSpiTableModified()) { 
        genTransSpiTable = refreshGenTransSpiTable();
     }
   		return genTransSpiTable;
   }

  
	/**
	*  set variable genTransSpiTable
	*  Corresponding COBOL Variable is GEN-TRANS-SPI-TABLE
	*  @param value
	**/
   public void setGenTransSpiTable(char[] value) {
      genTransSpiTable = checkGenTransSpiTableConstraints(value);
      serializeGenTransSpiTable(genTransSpiTable);
   } 

     /**
	 * 	Update GenTransSpiTable 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGenTransSpiTable(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGenTransSpiTable,genTransSpiTable.length);
   	
   }
   
   public void setGenTransSpiTable(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGenTransSpiTable,genTransSpiTable.length);
   	
   }
   
     /**
	 * 	Update GenTransSpiTable 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGenTransSpiTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGenTransSpiTable+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GenTransSpiTable with another Field
	 *	@param value
	 */
   public void setGenTransSpiTable(Field source) {
       replace(source,0,source.length(),beginGenTransSpiTable,GEN_TRANS_SPI_TABLE_LEN);
   	
   }  
   
     /**
	 * 	Update GenTransSpiTable 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGenTransSpiTable(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGenTransSpiTable,GEN_TRANS_SPI_TABLE_LEN);
   	
   }
   
     /**
	 * 	Update GenTransSpiTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGenTransSpiTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGenTransSpiTable+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of genTransSpiTableR
	 *	@return genTransSpiTableR
	 */   
	 public GenTransSpiTableR getGenTransSpiTableR() {
   	return genTransSpiTableR;
   }
   /**
	* 	Update GenTransSpiTableR with the passed value
	*   Corresponding COBOL Variable is GEN-TRANS-SPI-TABLE-R
	*	@param value
	*/
   public void setGenTransSpiTableR(char[] value) {
      genTransSpiTableR.setString(value); 
   }   
    
     /**
	 * 	Update GenTransSpiTableR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGenTransSpiTableR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,genTransSpiTableR.begin,genTransSpiTableR.length());
   }
   
     /**
	 * 	Update GenTransSpiTableR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGenTransSpiTableR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,genTransSpiTableR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update GenTransSpiTableR with another Field
	 *	@param value
	 */
   public void setGenTransSpiTableR(Field source) {
   	replace(source,0,source.length(),genTransSpiTableR.begin,genTransSpiTableR.length());
   }  
   
     /**
	 * 	Update GenTransSpiTableR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGenTransSpiTableR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,genTransSpiTableR.begin,genTransSpiTableR.length());
   }
   
     /**
	 * 	Update GenTransSpiTableR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGenTransSpiTableR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,genTransSpiTableR.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getGenTransSpiTableGroupFieldLength() {
			return GEN_TRANS_SPI_TABLE_GROUP_LENGTH;
		}

}
  
