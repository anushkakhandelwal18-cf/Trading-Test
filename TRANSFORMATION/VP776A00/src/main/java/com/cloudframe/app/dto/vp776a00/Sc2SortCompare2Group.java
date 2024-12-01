package com.cloudframe.app.dto.vp776a00;

/**
*  The class Sc2SortCompare2Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.vp776a00.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sc2SortCompare2Group extends Sc2SortCompare2GroupSerialized { 
   

						private char[] sc2SortCompare2 = Field.fillLowValue(32767);
	
	/**
	* Constructor for Sc2SortCompare2Group
	**/
    public Sc2SortCompare2Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sc2SortCompare2
	 *	@return sc2SortCompare2
	 */
   public char[] getSc2SortCompare2() throws CFException{
     if (isSc2SortCompare2Modified()) { 
        sc2SortCompare2 = refreshSc2SortCompare2();
     }
   		return sc2SortCompare2;
   }

  
	/**
	*  set variable sc2SortCompare2
	*  Corresponding COBOL Variable is SC2-SORT-COMPARE-2
	*  @param value
	**/
   public void setSc2SortCompare2(char[] value) {
      sc2SortCompare2 = checkSc2SortCompare2Constraints(value);
      serializeSc2SortCompare2(sc2SortCompare2);
   } 

     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSc2SortCompare2,sc2SortCompare2.length);
   	
   }
   
   public void setSc2SortCompare2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSc2SortCompare2,sc2SortCompare2.length);
   	
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSc2SortCompare2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sc2SortCompare2 with another Field
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source) {
       replace(source,0,source.length(),beginSc2SortCompare2,SC_2_SORT_COMPARE_2_LEN);
   	
   }  
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSc2SortCompare2,SC_2_SORT_COMPARE_2_LEN);
   	
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSc2SortCompare2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSc2SortCompare2GroupFieldLength() {
			return SC_2_SORT_COMPARE_2_GROUP_LENGTH;
		}

}
  
