package com.cloudframe.app.trdpb007.dto;

/**
*  The class MqodSelectionstring is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:38. using version 5.0.0.163
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MqodSelectionstring extends MqodSelectionstringSerialized { 
   

								private int mqodSelectionstringVsptr;

								private int mqodSelectionstringVsoffset;

								private int mqodSelectionstringVsbufsize;

								private int mqodSelectionstringVslength;

								private int mqodSelectionstringVsccsid;
	
	/**
	* Constructor for MqodSelectionstring
	**/
    public MqodSelectionstring() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MqodSelectionstring. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MqodSelectionstring(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMqodSelectionstringVsoffset(0);
								setMqodSelectionstringVsbufsize(0);
								setMqodSelectionstringVslength(0);
								setMqodSelectionstringVsccsid(-3);
    } 

	/**
	 *	Returns the value of mqodSelectionstringVsptr
	 *	@return mqodSelectionstringVsptr
	 */
	public int getMqodSelectionstringVsptr() throws CFException {
        if (isMqodSelectionstringVsptrModified()) { 
           mqodSelectionstringVsptr = refreshMqodSelectionstringVsptr();
        }
   		return mqodSelectionstringVsptr;
	}
	
	/**
	 * 	Update MqodSelectionstringVsptr with the passed value
	 *  Corresponding COBOL Variable is MQOD-SELECTIONSTRING-VSPTR
	 *	@param number
	 */
	public void setMqodSelectionstringVsptr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodSelectionstringVsptr = checkMqodSelectionstringVsptrMaxLimit(number); 
		serializeMqodSelectionstringVsptr(mqodSelectionstringVsptr);
	}


	public void setMqodSelectionstringVsptr(long number) {
	    number = checkMqodSelectionstringVsptrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodSelectionstringVsptr((int)number);
	}
	
	/**
	 *	Returns the value of mqodSelectionstringVsoffset
	 *	@return mqodSelectionstringVsoffset
	 */
	public int getMqodSelectionstringVsoffset() throws CFException {
        if (isMqodSelectionstringVsoffsetModified()) { 
           mqodSelectionstringVsoffset = refreshMqodSelectionstringVsoffset();
        }
   		return mqodSelectionstringVsoffset;
	}
	
	/**
	 * 	Update MqodSelectionstringVsoffset with the passed value
	 *  Corresponding COBOL Variable is MQOD-SELECTIONSTRING-VSOFFSET
	 *	@param number
	 */
	public void setMqodSelectionstringVsoffset(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodSelectionstringVsoffset = checkMqodSelectionstringVsoffsetMaxLimit(number); 
		serializeMqodSelectionstringVsoffset(mqodSelectionstringVsoffset);
	}


	public void setMqodSelectionstringVsoffset(long number) {
	    number = checkMqodSelectionstringVsoffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodSelectionstringVsoffset((int)number);
	}
	
	/**
	 *	Returns the value of mqodSelectionstringVsbufsize
	 *	@return mqodSelectionstringVsbufsize
	 */
	public int getMqodSelectionstringVsbufsize() throws CFException {
        if (isMqodSelectionstringVsbufsizeModified()) { 
           mqodSelectionstringVsbufsize = refreshMqodSelectionstringVsbufsize();
        }
   		return mqodSelectionstringVsbufsize;
	}
	
	/**
	 * 	Update MqodSelectionstringVsbufsize with the passed value
	 *  Corresponding COBOL Variable is MQOD-SELECTIONSTRING-VSBUFSIZE
	 *	@param number
	 */
	public void setMqodSelectionstringVsbufsize(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodSelectionstringVsbufsize = checkMqodSelectionstringVsbufsizeMaxLimit(number); 
		serializeMqodSelectionstringVsbufsize(mqodSelectionstringVsbufsize);
	}


	public void setMqodSelectionstringVsbufsize(long number) {
	    number = checkMqodSelectionstringVsbufsizeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodSelectionstringVsbufsize((int)number);
	}
	
	/**
	 *	Returns the value of mqodSelectionstringVslength
	 *	@return mqodSelectionstringVslength
	 */
	public int getMqodSelectionstringVslength() throws CFException {
        if (isMqodSelectionstringVslengthModified()) { 
           mqodSelectionstringVslength = refreshMqodSelectionstringVslength();
        }
   		return mqodSelectionstringVslength;
	}
	
	/**
	 * 	Update MqodSelectionstringVslength with the passed value
	 *  Corresponding COBOL Variable is MQOD-SELECTIONSTRING-VSLENGTH
	 *	@param number
	 */
	public void setMqodSelectionstringVslength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodSelectionstringVslength = checkMqodSelectionstringVslengthMaxLimit(number); 
		serializeMqodSelectionstringVslength(mqodSelectionstringVslength);
	}


	public void setMqodSelectionstringVslength(long number) {
	    number = checkMqodSelectionstringVslengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodSelectionstringVslength((int)number);
	}
	
	/**
	 *	Returns the value of mqodSelectionstringVsccsid
	 *	@return mqodSelectionstringVsccsid
	 */
	public int getMqodSelectionstringVsccsid() throws CFException {
        if (isMqodSelectionstringVsccsidModified()) { 
           mqodSelectionstringVsccsid = refreshMqodSelectionstringVsccsid();
        }
   		return mqodSelectionstringVsccsid;
	}
	
	/**
	 * 	Update MqodSelectionstringVsccsid with the passed value
	 *  Corresponding COBOL Variable is MQOD-SELECTIONSTRING-VSCCSID
	 *	@param number
	 */
	public void setMqodSelectionstringVsccsid(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodSelectionstringVsccsid = checkMqodSelectionstringVsccsidMaxLimit(number); 
		serializeMqodSelectionstringVsccsid(mqodSelectionstringVsccsid);
	}


	public void setMqodSelectionstringVsccsid(long number) {
	    number = checkMqodSelectionstringVsccsidMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodSelectionstringVsccsid((int)number);
	}
	

	
	
	

		public static int getMqodSelectionstringFieldLength() {
			return MQOD_SELECTIONSTRING_LENGTH;
		}

}
  
