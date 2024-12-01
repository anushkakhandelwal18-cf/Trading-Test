package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Sqlvar is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sqlvar extends SqlvarSerialized { 
   
				private Sqlvar1 sqlvar1 = new Sqlvar1();
				private Sqlvar2 sqlvar2 = new Sqlvar2();
	
	/**
	* Constructor for Sqlvar
	**/
    public Sqlvar() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sqlvar. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlvar(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sqlvar1.setParent(this,getStartOffset() + 0);
	       			sqlvar2.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of sqlvar1
	 *	@return sqlvar1
	 */   
	 public Sqlvar1 getSqlvar1() {
   	return sqlvar1;
   }
   /**
	* 	Update Sqlvar1 with the passed value
	*   Corresponding COBOL Variable is SQLVAR1
	*	@param value
	*/
   public void setSqlvar1(char[] value) {
      sqlvar1.setString(value); 
   }   
    
     /**
	 * 	Update Sqlvar1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlvar1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlvar1.begin,sqlvar1.length());
   }
   
     /**
	 * 	Update Sqlvar1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlvar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlvar1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sqlvar1 with another Field
	 *	@param value
	 */
   public void setSqlvar1(Field source) {
   	replace(source,0,source.length(),sqlvar1.begin,sqlvar1.length());
   }  
   
     /**
	 * 	Update Sqlvar1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlvar1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlvar1.begin,sqlvar1.length());
   }
   
     /**
	 * 	Update Sqlvar1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlvar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlvar1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sqlvar2
	 *	@return sqlvar2
	 */   
	 public Sqlvar2 getSqlvar2() {
   	return sqlvar2;
   }
   /**
	* 	Update Sqlvar2 with the passed value
	*   Corresponding COBOL Variable is SQLVAR2
	*	@param value
	*/
   public void setSqlvar2(char[] value) {
      sqlvar2.setString(value); 
   }   
    
     /**
	 * 	Update Sqlvar2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlvar2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlvar2.begin,sqlvar2.length());
   }
   
     /**
	 * 	Update Sqlvar2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlvar2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlvar2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sqlvar2 with another Field
	 *	@param value
	 */
   public void setSqlvar2(Field source) {
   	replace(source,0,source.length(),sqlvar2.begin,sqlvar2.length());
   }  
   
     /**
	 * 	Update Sqlvar2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlvar2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlvar2.begin,sqlvar2.length());
   }
   
     /**
	 * 	Update Sqlvar2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlvar2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlvar2.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSqlvarFieldLength() {
			return SQLVAR_LENGTH;
		}

}
  
