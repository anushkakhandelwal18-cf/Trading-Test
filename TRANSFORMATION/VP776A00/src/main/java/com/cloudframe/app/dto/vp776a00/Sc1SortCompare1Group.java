package com.cloudframe.app.dto.vp776a00;

/**
*  The class Sc1SortCompare1Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.vp776a00.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sc1SortCompare1Group extends Sc1SortCompare1GroupSerialized { 
   

						private char[] sc1SortCompare1 = Field.fillLowValue(32767);
	
	/**
	* Constructor for Sc1SortCompare1Group
	**/
    public Sc1SortCompare1Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sc1SortCompare1
	 *	@return sc1SortCompare1
	 */
   public char[] getSc1SortCompare1() throws CFException{
     if (isSc1SortCompare1Modified()) { 
        sc1SortCompare1 = refreshSc1SortCompare1();
     }
   		return sc1SortCompare1;
   }

  
	/**
	*  set variable sc1SortCompare1
	*  Corresponding COBOL Variable is SC1-SORT-COMPARE-1
	*  @param value
	**/
   public void setSc1SortCompare1(char[] value) {
      sc1SortCompare1 = checkSc1SortCompare1Constraints(value);
      serializeSc1SortCompare1(sc1SortCompare1);
   } 

     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSc1SortCompare1,sc1SortCompare1.length);
   	
   }
   
   public void setSc1SortCompare1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSc1SortCompare1,sc1SortCompare1.length);
   	
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSc1SortCompare1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sc1SortCompare1 with another Field
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source) {
       replace(source,0,source.length(),beginSc1SortCompare1,SC_1_SORT_COMPARE_1_LEN);
   	
   }  
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSc1SortCompare1,SC_1_SORT_COMPARE_1_LEN);
   	
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSc1SortCompare1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSc1SortCompare1GroupFieldLength() {
			return SC_1_SORT_COMPARE_1_GROUP_LENGTH;
		}

}
  
