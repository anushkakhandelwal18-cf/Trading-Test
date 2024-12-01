package com.cloudframe.app.dto.o529351u;

/**
*  The class W02DsplMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class W02DsplMsgArea extends W02DsplMsgAreaSerialized { 
   


						private char[] w02MqTime = Field.fillLowValue(8);


						private char[] w02DsplErrInd = Field.fillLowValue(3);

						private char[] w02DsplMsg = new char[73];


								private long w02RespCd;


						private char[] w02AbendingProg = Field.fillLowValue(8);


						private char[] w02MainProg = Field.fillLowValue(3);


						private char[] w02FnuIcn = Field.fillLowValue(10);
	
	/**
	* Constructor for W02DsplMsgArea
	**/
    public W02DsplMsgArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TM:").toCharArray()
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             (" C:").toCharArray()
             , getStartOffset() + 11
             ,3
             );
								setW02DsplMsg(pad(73," ".toCharArray(),' ',RIGHT_PAD));
       replaceValue( // serialize and save the value
             (",R:").toCharArray()
             , getStartOffset() + 90
             ,3
             );
       replaceValue( // serialize and save the value
             (",PRG: ").toCharArray()
             , getStartOffset() + 101
             ,6
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 115
             ,1
             );
       replaceValue( // serialize and save the value
             (",I:").toCharArray()
             , getStartOffset() + 119
             ,3
             );
    }


 

	/**
	 *	Returns the value of w02MqTime
	 *	@return w02MqTime
	 */
   public char[] getW02MqTime() throws CFException{
     if (isW02MqTimeModified()) { 
        w02MqTime = refreshW02MqTime();
     }
   		return w02MqTime;
   }

  
	/**
	*  set variable w02MqTime
	*  Corresponding COBOL Variable is W02-MQ-TIME
	*  @param value
	**/
   public void setW02MqTime(char[] value) {
      w02MqTime = checkW02MqTimeConstraints(value);
      serializeW02MqTime(w02MqTime);
   } 

     /**
	 * 	Update W02MqTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02MqTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02MqTime,w02MqTime.length);
   	
   }
   
   public void setW02MqTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02MqTime,w02MqTime.length);
   	
   }
   
     /**
	 * 	Update W02MqTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02MqTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02MqTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02MqTime with another Field
	 *	@param value
	 */
   public void setW02MqTime(Field source) {
       replace(source,0,source.length(),beginW02MqTime,W_02_MQ_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update W02MqTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02MqTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02MqTime,W_02_MQ_TIME_LEN);
   	
   }
   
     /**
	 * 	Update W02MqTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02MqTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02MqTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02DsplErrInd
	 *	@return w02DsplErrInd
	 */
   public char[] getW02DsplErrInd() throws CFException{
     if (isW02DsplErrIndModified()) { 
        w02DsplErrInd = refreshW02DsplErrInd();
     }
   		return w02DsplErrInd;
   }

  
	/**
	*  set variable w02DsplErrInd
	*  Corresponding COBOL Variable is W02-DSPL-ERR-IND
	*  @param value
	**/
   public void setW02DsplErrInd(char[] value) {
      w02DsplErrInd = checkW02DsplErrIndConstraints(value);
      serializeW02DsplErrInd(w02DsplErrInd);
   } 

     /**
	 * 	Update W02DsplErrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02DsplErrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02DsplErrInd,w02DsplErrInd.length);
   	
   }
   
   public void setW02DsplErrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02DsplErrInd,w02DsplErrInd.length);
   	
   }
   
     /**
	 * 	Update W02DsplErrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02DsplErrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02DsplErrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02DsplErrInd with another Field
	 *	@param value
	 */
   public void setW02DsplErrInd(Field source) {
       replace(source,0,source.length(),beginW02DsplErrInd,W_02_DSPL_ERR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update W02DsplErrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02DsplErrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02DsplErrInd,W_02_DSPL_ERR_IND_LEN);
   	
   }
   
     /**
	 * 	Update W02DsplErrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02DsplErrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02DsplErrInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02DsplMsg
	 *	@return w02DsplMsg
	 */
   public char[] getW02DsplMsg() throws CFException{
     if (isW02DsplMsgModified()) { 
        w02DsplMsg = refreshW02DsplMsg();
     }
   		return w02DsplMsg;
   }

  
	/**
	*  set variable w02DsplMsg
	*  Corresponding COBOL Variable is W02-DSPL-MSG
	*  @param value
	**/
   public void setW02DsplMsg(char[] value) {
      w02DsplMsg = checkW02DsplMsgConstraints(value);
      serializeW02DsplMsg(w02DsplMsg);
   } 

     /**
	 * 	Update W02DsplMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02DsplMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02DsplMsg,w02DsplMsg.length);
   	
   }
   
   public void setW02DsplMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02DsplMsg,w02DsplMsg.length);
   	
   }
   
     /**
	 * 	Update W02DsplMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02DsplMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02DsplMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02DsplMsg with another Field
	 *	@param value
	 */
   public void setW02DsplMsg(Field source) {
       replace(source,0,source.length(),beginW02DsplMsg,W_02_DSPL_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update W02DsplMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02DsplMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02DsplMsg,W_02_DSPL_MSG_LEN);
   	
   }
   
     /**
	 * 	Update W02DsplMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02DsplMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02DsplMsg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02RespCd
	 *	@return w02RespCd
	 */
	public long getW02RespCd() throws CFException {
       if (isW02RespCdModified()) { 
           w02RespCd = refreshW02RespCd();
        }
   		return w02RespCd;
	}
	

	
	   
	/**
	 * 	Update W02RespCd with the passed value
	 *  Corresponding COBOL Variable is W02-RESP-CD
	 *	@param number
	 */
	public void setW02RespCd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    w02RespCd = checkW02RespCdMaxLimit(number); 
		serializeW02RespCd(w02RespCd);
	}
	

	/**
	 * 	Update W02RespCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setW02RespCd(char[] value) throws CFException {
		 w02RespCd = serializeW02RespCd(value);
	}
	/**
	 * 	Update W02RespCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setW02RespCdString(char[] value) throws CFException {
		 setW02RespCd(value);
	}
	/**
	 *	Returns the value of w02AbendingProg
	 *	@return w02AbendingProg
	 */
   public char[] getW02AbendingProg() throws CFException{
     if (isW02AbendingProgModified()) { 
        w02AbendingProg = refreshW02AbendingProg();
     }
   		return w02AbendingProg;
   }

  
	/**
	*  set variable w02AbendingProg
	*  Corresponding COBOL Variable is W02-ABENDING-PROG
	*  @param value
	**/
   public void setW02AbendingProg(char[] value) {
      w02AbendingProg = checkW02AbendingProgConstraints(value);
      serializeW02AbendingProg(w02AbendingProg);
   } 

     /**
	 * 	Update W02AbendingProg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02AbendingProg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02AbendingProg,w02AbendingProg.length);
   	
   }
   
   public void setW02AbendingProg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02AbendingProg,w02AbendingProg.length);
   	
   }
   
     /**
	 * 	Update W02AbendingProg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02AbendingProg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02AbendingProg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02AbendingProg with another Field
	 *	@param value
	 */
   public void setW02AbendingProg(Field source) {
       replace(source,0,source.length(),beginW02AbendingProg,W_02_ABENDING_PROG_LEN);
   	
   }  
   
     /**
	 * 	Update W02AbendingProg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02AbendingProg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02AbendingProg,W_02_ABENDING_PROG_LEN);
   	
   }
   
     /**
	 * 	Update W02AbendingProg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02AbendingProg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02AbendingProg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02MainProg
	 *	@return w02MainProg
	 */
   public char[] getW02MainProg() throws CFException{
     if (isW02MainProgModified()) { 
        w02MainProg = refreshW02MainProg();
     }
   		return w02MainProg;
   }

  
	/**
	*  set variable w02MainProg
	*  Corresponding COBOL Variable is W02-MAIN-PROG
	*  @param value
	**/
   public void setW02MainProg(char[] value) {
      w02MainProg = checkW02MainProgConstraints(value);
      serializeW02MainProg(w02MainProg);
   } 

     /**
	 * 	Update W02MainProg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02MainProg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02MainProg,w02MainProg.length);
   	
   }
   
   public void setW02MainProg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02MainProg,w02MainProg.length);
   	
   }
   
     /**
	 * 	Update W02MainProg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02MainProg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02MainProg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02MainProg with another Field
	 *	@param value
	 */
   public void setW02MainProg(Field source) {
       replace(source,0,source.length(),beginW02MainProg,W_02_MAIN_PROG_LEN);
   	
   }  
   
     /**
	 * 	Update W02MainProg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02MainProg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02MainProg,W_02_MAIN_PROG_LEN);
   	
   }
   
     /**
	 * 	Update W02MainProg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02MainProg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02MainProg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w02FnuIcn
	 *	@return w02FnuIcn
	 */
   public char[] getW02FnuIcn() throws CFException{
     if (isW02FnuIcnModified()) { 
        w02FnuIcn = refreshW02FnuIcn();
     }
   		return w02FnuIcn;
   }

  
	/**
	*  set variable w02FnuIcn
	*  Corresponding COBOL Variable is W02-FNU-ICN
	*  @param value
	**/
   public void setW02FnuIcn(char[] value) {
      w02FnuIcn = checkW02FnuIcnConstraints(value);
      serializeW02FnuIcn(w02FnuIcn);
   } 

     /**
	 * 	Update W02FnuIcn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW02FnuIcn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW02FnuIcn,w02FnuIcn.length);
   	
   }
   
   public void setW02FnuIcn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuIcn,w02FnuIcn.length);
   	
   }
   
     /**
	 * 	Update W02FnuIcn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuIcn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuIcn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W02FnuIcn with another Field
	 *	@param value
	 */
   public void setW02FnuIcn(Field source) {
       replace(source,0,source.length(),beginW02FnuIcn,W_02_FNU_ICN_LEN);
   	
   }  
   
     /**
	 * 	Update W02FnuIcn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW02FnuIcn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW02FnuIcn,W_02_FNU_ICN_LEN);
   	
   }
   
     /**
	 * 	Update W02FnuIcn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW02FnuIcn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW02FnuIcn+targetIndex,targetLen);
    
   }

	
	
	

		public static int getW02DsplMsgAreaFieldLength() {
			return W_02_DSPL_MSG_AREA_LENGTH;
		}

}
  
