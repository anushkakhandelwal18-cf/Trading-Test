package com.cloudframe.app.trdpb007.dto;

/**
*  The class MqodObjectstring is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:38. using version 5.0.0.163
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MqodObjectstring extends MqodObjectstringSerialized { 
   

								private int mqodObjectstringVsptr;

								private int mqodObjectstringVsoffset;

								private int mqodObjectstringVsbufsize;

								private int mqodObjectstringVslength;

								private int mqodObjectstringVsccsid;
	
	/**
	* Constructor for MqodObjectstring
	**/
    public MqodObjectstring() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MqodObjectstring. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MqodObjectstring(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMqodObjectstringVsoffset(0);
								setMqodObjectstringVsbufsize(0);
								setMqodObjectstringVslength(0);
								setMqodObjectstringVsccsid(-3);
    } 

	/**
	 *	Returns the value of mqodObjectstringVsptr
	 *	@return mqodObjectstringVsptr
	 */
	public int getMqodObjectstringVsptr() throws CFException {
        if (isMqodObjectstringVsptrModified()) { 
           mqodObjectstringVsptr = refreshMqodObjectstringVsptr();
        }
   		return mqodObjectstringVsptr;
	}
	
	/**
	 * 	Update MqodObjectstringVsptr with the passed value
	 *  Corresponding COBOL Variable is MQOD-OBJECTSTRING-VSPTR
	 *	@param number
	 */
	public void setMqodObjectstringVsptr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodObjectstringVsptr = checkMqodObjectstringVsptrMaxLimit(number); 
		serializeMqodObjectstringVsptr(mqodObjectstringVsptr);
	}


	public void setMqodObjectstringVsptr(long number) {
	    number = checkMqodObjectstringVsptrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodObjectstringVsptr((int)number);
	}
	
	/**
	 *	Returns the value of mqodObjectstringVsoffset
	 *	@return mqodObjectstringVsoffset
	 */
	public int getMqodObjectstringVsoffset() throws CFException {
        if (isMqodObjectstringVsoffsetModified()) { 
           mqodObjectstringVsoffset = refreshMqodObjectstringVsoffset();
        }
   		return mqodObjectstringVsoffset;
	}
	
	/**
	 * 	Update MqodObjectstringVsoffset with the passed value
	 *  Corresponding COBOL Variable is MQOD-OBJECTSTRING-VSOFFSET
	 *	@param number
	 */
	public void setMqodObjectstringVsoffset(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodObjectstringVsoffset = checkMqodObjectstringVsoffsetMaxLimit(number); 
		serializeMqodObjectstringVsoffset(mqodObjectstringVsoffset);
	}


	public void setMqodObjectstringVsoffset(long number) {
	    number = checkMqodObjectstringVsoffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodObjectstringVsoffset((int)number);
	}
	
	/**
	 *	Returns the value of mqodObjectstringVsbufsize
	 *	@return mqodObjectstringVsbufsize
	 */
	public int getMqodObjectstringVsbufsize() throws CFException {
        if (isMqodObjectstringVsbufsizeModified()) { 
           mqodObjectstringVsbufsize = refreshMqodObjectstringVsbufsize();
        }
   		return mqodObjectstringVsbufsize;
	}
	
	/**
	 * 	Update MqodObjectstringVsbufsize with the passed value
	 *  Corresponding COBOL Variable is MQOD-OBJECTSTRING-VSBUFSIZE
	 *	@param number
	 */
	public void setMqodObjectstringVsbufsize(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodObjectstringVsbufsize = checkMqodObjectstringVsbufsizeMaxLimit(number); 
		serializeMqodObjectstringVsbufsize(mqodObjectstringVsbufsize);
	}


	public void setMqodObjectstringVsbufsize(long number) {
	    number = checkMqodObjectstringVsbufsizeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodObjectstringVsbufsize((int)number);
	}
	
	/**
	 *	Returns the value of mqodObjectstringVslength
	 *	@return mqodObjectstringVslength
	 */
	public int getMqodObjectstringVslength() throws CFException {
        if (isMqodObjectstringVslengthModified()) { 
           mqodObjectstringVslength = refreshMqodObjectstringVslength();
        }
   		return mqodObjectstringVslength;
	}
	
	/**
	 * 	Update MqodObjectstringVslength with the passed value
	 *  Corresponding COBOL Variable is MQOD-OBJECTSTRING-VSLENGTH
	 *	@param number
	 */
	public void setMqodObjectstringVslength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodObjectstringVslength = checkMqodObjectstringVslengthMaxLimit(number); 
		serializeMqodObjectstringVslength(mqodObjectstringVslength);
	}


	public void setMqodObjectstringVslength(long number) {
	    number = checkMqodObjectstringVslengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodObjectstringVslength((int)number);
	}
	
	/**
	 *	Returns the value of mqodObjectstringVsccsid
	 *	@return mqodObjectstringVsccsid
	 */
	public int getMqodObjectstringVsccsid() throws CFException {
        if (isMqodObjectstringVsccsidModified()) { 
           mqodObjectstringVsccsid = refreshMqodObjectstringVsccsid();
        }
   		return mqodObjectstringVsccsid;
	}
	
	/**
	 * 	Update MqodObjectstringVsccsid with the passed value
	 *  Corresponding COBOL Variable is MQOD-OBJECTSTRING-VSCCSID
	 *	@param number
	 */
	public void setMqodObjectstringVsccsid(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodObjectstringVsccsid = checkMqodObjectstringVsccsidMaxLimit(number); 
		serializeMqodObjectstringVsccsid(mqodObjectstringVsccsid);
	}


	public void setMqodObjectstringVsccsid(long number) {
	    number = checkMqodObjectstringVsccsidMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodObjectstringVsccsid((int)number);
	}
	

	
	
	

		public static int getMqodObjectstringFieldLength() {
			return MQOD_OBJECTSTRING_LENGTH;
		}

}
  
