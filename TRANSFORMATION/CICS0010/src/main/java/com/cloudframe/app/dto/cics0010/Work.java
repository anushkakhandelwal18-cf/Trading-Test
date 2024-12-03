package com.cloudframe.app.dto.cics0010;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:51. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.cics0010.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private int cicsresp;

								private int cicsresp2;

						private char[] requestData002 = Field.fillLowValue(100);

						private char[] containerName = new char[16];

						private char[] channelName = new char[16];

								private int containerLength;

						private char[] ls003RequestData = Field.fillLowValue(100);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setContainerName(("CLFR-CONTAINER  ").toCharArray());
								setChannelName(("CLFR-CHANNEL    ").toCharArray());
    }


 

	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {
   		return cicsresp;
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *  Corresponding COBOL Variable is CICSRESP
	 *	@param number
	 */
	public void setCicsresp(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cicsresp = checkCicsrespMaxLimit(number); 
	}


	public void setCicsresp(long number) {
	    number = checkCicsrespMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCicsresp((int)number);
	}
	
	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {
   		return cicsresp2;
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *  Corresponding COBOL Variable is CICSRESP2
	 *	@param number
	 */
	public void setCicsresp2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cicsresp2 = checkCicsresp2MaxLimit(number); 
	}


	public void setCicsresp2(long number) {
	    number = checkCicsresp2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCicsresp2((int)number);
	}
	
	/**
	 *	Returns the value of requestData002
	 *	@return requestData002
	 */
   public char[] getRequestData002() throws CFException{
   		return requestData002;
   }

  
	/**
	*  set variable requestData002
	*  Corresponding COBOL Variable is WS-002-REQUEST-DATA
	*  @param value
	**/
   public void setRequestData002(char[] value) {
       value = checkRequestData002Constraints(value);
       arraycopy(value,0,requestData002,0,value.length);
   } 
	public void setRequestData002(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,requestData002,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of containerName
	 *	@return containerName
	 */
   public char[] getContainerName() throws CFException{
   		return containerName;
   }

  
	/**
	*  set variable containerName
	*  Corresponding COBOL Variable is CONTAINER-NAME
	*  @param value
	**/
   public void setContainerName(char[] value) {
       value = checkContainerNameConstraints(value);
       arraycopy(value,0,containerName,0,value.length);
   } 
	public void setContainerName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,containerName,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of channelName
	 *	@return channelName
	 */
   public char[] getChannelName() throws CFException{
   		return channelName;
   }

  
	/**
	*  set variable channelName
	*  Corresponding COBOL Variable is CHANNEL-NAME
	*  @param value
	**/
   public void setChannelName(char[] value) {
       value = checkChannelNameConstraints(value);
       arraycopy(value,0,channelName,0,value.length);
   } 
	public void setChannelName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,channelName,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of containerLength
	 *	@return containerLength
	 */
	public int getContainerLength() throws CFException {
   		return containerLength;
	}
	
	/**
	 * 	Update ContainerLength with the passed value
	 *  Corresponding COBOL Variable is CONTAINER-LENGTH
	 *	@param number
	 */
	public void setContainerLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    containerLength = checkContainerLengthMaxLimit(number); 
	}


	public void setContainerLength(long number) {
	    number = checkContainerLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setContainerLength((int)number);
	}
	
	/**
	 *	Returns the value of ls003RequestData
	 *	@return ls003RequestData
	 */
   public char[] getLs003RequestData() throws CFException{
   		return ls003RequestData;
   }

  
	/**
	*  set variable ls003RequestData
	*  Corresponding COBOL Variable is LS-003-REQUEST-DATA
	*  @param value
	**/
   public void setLs003RequestData(char[] value) {
       value = checkLs003RequestDataConstraints(value);
       arraycopy(value,0,ls003RequestData,0,value.length);
   } 
	public void setLs003RequestData(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ls003RequestData,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
