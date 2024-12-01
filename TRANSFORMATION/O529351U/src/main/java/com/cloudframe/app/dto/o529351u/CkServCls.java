package com.cloudframe.app.dto.o529351u;

/**
*  The class CkServCls is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CkServCls extends CkServClsSerialized { 
   

								private long cls15;
	
	/**
	* Constructor for CkServCls
	**/
    public CkServCls() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CkServCls. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CkServCls(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCls15(0L);
    } 

	/**
	 *	Returns the value of cls15
	 *	@return cls15
	 */
	public long getCls15() throws CFException {
       if (isCls15Modified()) { 
           cls15 = refreshCls15();
        }
   		return cls15;
	}
	

	
	   
	/**
	 * 	Update Cls15 with the passed value
	 *  Corresponding COBOL Variable is CLS-1-5
	 *	@param number
	 */
	public void setCls15(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cls15 = checkCls15MaxLimit(number); 
		serializeCls15(cls15);
	}
	

	/**
	 * 	Update Cls15 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCls15(char[] value) throws CFException {
		 cls15 = serializeCls15(value);
	}
	/**
	 * 	Update Cls15 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCls15String(char[] value) throws CFException {
		 setCls15(value);
	}

	
	
	

		public static int getCkServClsFieldLength() {
			return CK_SERV_CLS_LENGTH;
		}

}
  
