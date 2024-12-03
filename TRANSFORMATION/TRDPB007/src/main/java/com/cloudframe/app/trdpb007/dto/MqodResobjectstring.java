package com.cloudframe.app.trdpb007.dto;

/**
*  The class MqodResobjectstring is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 14:02. using version 5.0.0.162
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MqodResobjectstring extends MqodResobjectstringSerialized { 
   

								private int mqodResobjectstringVsptr;

								private int mqodResobjectstringVsoffset;

								private int mqodResobjectstringVsbufsize;

								private int mqodResobjectstringVslength;

								private int mqodResobjectstringVsccsid;
	
	/**
	* Constructor for MqodResobjectstring
	**/
    public MqodResobjectstring() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MqodResobjectstring. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MqodResobjectstring(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMqodResobjectstringVsoffset(0);
								setMqodResobjectstringVsbufsize(0);
								setMqodResobjectstringVslength(0);
								setMqodResobjectstringVsccsid(-3);
    } 

	/**
	 *	Returns the value of mqodResobjectstringVsptr
	 *	@return mqodResobjectstringVsptr
	 */
	public int getMqodResobjectstringVsptr() throws CFException {
        if (isMqodResobjectstringVsptrModified()) { 
           mqodResobjectstringVsptr = refreshMqodResobjectstringVsptr();
        }
   		return mqodResobjectstringVsptr;
	}
	
	/**
	 * 	Update MqodResobjectstringVsptr with the passed value
	 *  Corresponding COBOL Variable is MQOD-RESOBJECTSTRING-VSPTR
	 *	@param number
	 */
	public void setMqodResobjectstringVsptr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodResobjectstringVsptr = checkMqodResobjectstringVsptrMaxLimit(number); 
		serializeMqodResobjectstringVsptr(mqodResobjectstringVsptr);
	}


	public void setMqodResobjectstringVsptr(long number) {
	    number = checkMqodResobjectstringVsptrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodResobjectstringVsptr((int)number);
	}
	
	/**
	 *	Returns the value of mqodResobjectstringVsoffset
	 *	@return mqodResobjectstringVsoffset
	 */
	public int getMqodResobjectstringVsoffset() throws CFException {
        if (isMqodResobjectstringVsoffsetModified()) { 
           mqodResobjectstringVsoffset = refreshMqodResobjectstringVsoffset();
        }
   		return mqodResobjectstringVsoffset;
	}
	
	/**
	 * 	Update MqodResobjectstringVsoffset with the passed value
	 *  Corresponding COBOL Variable is MQOD-RESOBJECTSTRING-VSOFFSET
	 *	@param number
	 */
	public void setMqodResobjectstringVsoffset(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodResobjectstringVsoffset = checkMqodResobjectstringVsoffsetMaxLimit(number); 
		serializeMqodResobjectstringVsoffset(mqodResobjectstringVsoffset);
	}


	public void setMqodResobjectstringVsoffset(long number) {
	    number = checkMqodResobjectstringVsoffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodResobjectstringVsoffset((int)number);
	}
	
	/**
	 *	Returns the value of mqodResobjectstringVsbufsize
	 *	@return mqodResobjectstringVsbufsize
	 */
	public int getMqodResobjectstringVsbufsize() throws CFException {
        if (isMqodResobjectstringVsbufsizeModified()) { 
           mqodResobjectstringVsbufsize = refreshMqodResobjectstringVsbufsize();
        }
   		return mqodResobjectstringVsbufsize;
	}
	
	/**
	 * 	Update MqodResobjectstringVsbufsize with the passed value
	 *  Corresponding COBOL Variable is MQOD-RESOBJECTSTRING-VSBUFSIZE
	 *	@param number
	 */
	public void setMqodResobjectstringVsbufsize(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodResobjectstringVsbufsize = checkMqodResobjectstringVsbufsizeMaxLimit(number); 
		serializeMqodResobjectstringVsbufsize(mqodResobjectstringVsbufsize);
	}


	public void setMqodResobjectstringVsbufsize(long number) {
	    number = checkMqodResobjectstringVsbufsizeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodResobjectstringVsbufsize((int)number);
	}
	
	/**
	 *	Returns the value of mqodResobjectstringVslength
	 *	@return mqodResobjectstringVslength
	 */
	public int getMqodResobjectstringVslength() throws CFException {
        if (isMqodResobjectstringVslengthModified()) { 
           mqodResobjectstringVslength = refreshMqodResobjectstringVslength();
        }
   		return mqodResobjectstringVslength;
	}
	
	/**
	 * 	Update MqodResobjectstringVslength with the passed value
	 *  Corresponding COBOL Variable is MQOD-RESOBJECTSTRING-VSLENGTH
	 *	@param number
	 */
	public void setMqodResobjectstringVslength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodResobjectstringVslength = checkMqodResobjectstringVslengthMaxLimit(number); 
		serializeMqodResobjectstringVslength(mqodResobjectstringVslength);
	}


	public void setMqodResobjectstringVslength(long number) {
	    number = checkMqodResobjectstringVslengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodResobjectstringVslength((int)number);
	}
	
	/**
	 *	Returns the value of mqodResobjectstringVsccsid
	 *	@return mqodResobjectstringVsccsid
	 */
	public int getMqodResobjectstringVsccsid() throws CFException {
        if (isMqodResobjectstringVsccsidModified()) { 
           mqodResobjectstringVsccsid = refreshMqodResobjectstringVsccsid();
        }
   		return mqodResobjectstringVsccsid;
	}
	
	/**
	 * 	Update MqodResobjectstringVsccsid with the passed value
	 *  Corresponding COBOL Variable is MQOD-RESOBJECTSTRING-VSCCSID
	 *	@param number
	 */
	public void setMqodResobjectstringVsccsid(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodResobjectstringVsccsid = checkMqodResobjectstringVsccsidMaxLimit(number); 
		serializeMqodResobjectstringVsccsid(mqodResobjectstringVsccsid);
	}


	public void setMqodResobjectstringVsccsid(long number) {
	    number = checkMqodResobjectstringVsccsidMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodResobjectstringVsccsid((int)number);
	}
	

	
	
	

		public static int getMqodResobjectstringFieldLength() {
			return MQOD_RESOBJECTSTRING_LENGTH;
		}

}
  
