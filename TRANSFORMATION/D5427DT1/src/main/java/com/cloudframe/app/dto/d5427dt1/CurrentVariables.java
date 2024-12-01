package com.cloudframe.app.dto.d5427dt1;

/**
*  The class CurrentVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentVariables extends CurrentVariablesSerialized { 
   

						private char[] currentChannelName = Field.fillLowValue(16);

						private char[] currentContainerName = Field.fillLowValue(16);

								private int currentContainerLength;

						private char[] currentContainerLayout = Field.fillLowValue(8);

								private int cicsresp;

								private int cicsresp2;
	
	/**
	* Constructor for CurrentVariables
	**/
    public CurrentVariables() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurrentVariables. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentVariables(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of currentChannelName
	 *	@return currentChannelName
	 */
   public char[] getCurrentChannelName() throws CFException{
     if (isCurrentChannelNameModified()) { 
        currentChannelName = refreshCurrentChannelName();
     }
   		return currentChannelName;
   }

  
	/**
	*  set variable currentChannelName
	*  Corresponding COBOL Variable is CURRENT-CHANNEL-NAME
	*  @param value
	**/
   public void setCurrentChannelName(char[] value) {
      currentChannelName = checkCurrentChannelNameConstraints(value);
      serializeCurrentChannelName(currentChannelName);
   } 

     /**
	 * 	Update CurrentChannelName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentChannelName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentChannelName,currentChannelName.length);
   	
   }
   
   public void setCurrentChannelName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentChannelName,currentChannelName.length);
   	
   }
   
     /**
	 * 	Update CurrentChannelName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentChannelName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentChannelName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentChannelName with another Field
	 *	@param value
	 */
   public void setCurrentChannelName(Field source) {
       replace(source,0,source.length(),beginCurrentChannelName,CURRENT_CHANNEL_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentChannelName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentChannelName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentChannelName,CURRENT_CHANNEL_NAME_LEN);
   	
   }
   
     /**
	 * 	Update CurrentChannelName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentChannelName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentChannelName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentContainerName
	 *	@return currentContainerName
	 */
   public char[] getCurrentContainerName() throws CFException{
     if (isCurrentContainerNameModified()) { 
        currentContainerName = refreshCurrentContainerName();
     }
   		return currentContainerName;
   }

  
	/**
	*  set variable currentContainerName
	*  Corresponding COBOL Variable is CURRENT-CONTAINER-NAME
	*  @param value
	**/
   public void setCurrentContainerName(char[] value) {
      currentContainerName = checkCurrentContainerNameConstraints(value);
      serializeCurrentContainerName(currentContainerName);
   } 

     /**
	 * 	Update CurrentContainerName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentContainerName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentContainerName,currentContainerName.length);
   	
   }
   
   public void setCurrentContainerName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentContainerName,currentContainerName.length);
   	
   }
   
     /**
	 * 	Update CurrentContainerName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentContainerName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentContainerName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentContainerName with another Field
	 *	@param value
	 */
   public void setCurrentContainerName(Field source) {
       replace(source,0,source.length(),beginCurrentContainerName,CURRENT_CONTAINER_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentContainerName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentContainerName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentContainerName,CURRENT_CONTAINER_NAME_LEN);
   	
   }
   
     /**
	 * 	Update CurrentContainerName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentContainerName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentContainerName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentContainerLength
	 *	@return currentContainerLength
	 */
	public int getCurrentContainerLength() throws CFException {
        if (isCurrentContainerLengthModified()) { 
           currentContainerLength = refreshCurrentContainerLength();
        }
   		return currentContainerLength;
	}
	
	/**
	 * 	Update CurrentContainerLength with the passed value
	 *  Corresponding COBOL Variable is CURRENT-CONTAINER-LENGTH
	 *	@param number
	 */
	public void setCurrentContainerLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    currentContainerLength = checkCurrentContainerLengthMaxLimit(number); 
		serializeCurrentContainerLength(currentContainerLength);
	}


	public void setCurrentContainerLength(long number) {
	    number = checkCurrentContainerLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCurrentContainerLength((int)number);
	}
	
	/**
	 *	Returns the value of currentContainerLayout
	 *	@return currentContainerLayout
	 */
   public char[] getCurrentContainerLayout() throws CFException{
     if (isCurrentContainerLayoutModified()) { 
        currentContainerLayout = refreshCurrentContainerLayout();
     }
   		return currentContainerLayout;
   }

  
	/**
	*  set variable currentContainerLayout
	*  Corresponding COBOL Variable is CURRENT-CONTAINER-LAYOUT
	*  @param value
	**/
   public void setCurrentContainerLayout(char[] value) {
      currentContainerLayout = checkCurrentContainerLayoutConstraints(value);
      serializeCurrentContainerLayout(currentContainerLayout);
   } 

     /**
	 * 	Update CurrentContainerLayout 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentContainerLayout(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentContainerLayout,currentContainerLayout.length);
   	
   }
   
   public void setCurrentContainerLayout(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentContainerLayout,currentContainerLayout.length);
   	
   }
   
     /**
	 * 	Update CurrentContainerLayout 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentContainerLayout(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentContainerLayout+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentContainerLayout with another Field
	 *	@param value
	 */
   public void setCurrentContainerLayout(Field source) {
       replace(source,0,source.length(),beginCurrentContainerLayout,CURRENT_CONTAINER_LAYOUT_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentContainerLayout 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentContainerLayout(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentContainerLayout,CURRENT_CONTAINER_LAYOUT_LEN);
   	
   }
   
     /**
	 * 	Update CurrentContainerLayout 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentContainerLayout(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentContainerLayout+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {
        if (isCicsrespModified()) { 
           cicsresp = refreshCicsresp();
        }
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
		serializeCicsresp(cicsresp);
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
        if (isCicsresp2Modified()) { 
           cicsresp2 = refreshCicsresp2();
        }
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
		serializeCicsresp2(cicsresp2);
	}


	public void setCicsresp2(long number) {
	    number = checkCicsresp2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCicsresp2((int)number);
	}
	

	
	
	

		public static int getCurrentVariablesFieldLength() {
			return CURRENT_VARIABLES_LENGTH;
		}

}
  
