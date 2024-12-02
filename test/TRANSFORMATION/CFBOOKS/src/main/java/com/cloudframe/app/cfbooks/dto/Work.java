package com.cloudframe.app.cfbooks.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/


import com.cloudframe.app.cfbooks.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

						private char[] space = new char[1];

						private char[] headerLabel = new char[132];

						private char[] headerLine = new char[132];

						private char[] pageBreak = new char[132];

						private char[] footer = new char[132];

						private char[] errPgm = new char[6];

						private char[] errLoc = new char[20];

						private char[] errMsg = new char[30];

								private long errCode;

								private int repopStat;

						private char[] eofFlag = new char[1];

								private int writeRec;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSpace(fillSpace(1));
								setHeaderLabel("BOOK ID  TITLE                                                                          PAGE  RATE  ISBN NO.       P.DATE      P.ID ".toCharArray());
								setHeaderLine("-------- -----------------------------------------------------------------------------  ----  ----  -------------  ----------  ---- ".toCharArray());
								setPageBreak("----------------------------------------------------------------------------------------------------------------------------------- ".toCharArray());
								setFooter("========================================================== END OF REPORT ===========================================================".toCharArray());
								setErrPgm(("DB2REP").toCharArray());
								setErrLoc(fillSpace(20));
								setErrMsg(fillSpace(30));
								setErrCode(0L);
								setRepopStat(0);
								setEofFlag(("N").toCharArray());
								setWriteRec(0);
    }


 

	/**
	 *	Returns the value of space
	 *	@return space
	 */
   public char[] getSpace() throws CFException{
   		return space;
   }

  
	/**
	*  set variable space
	*  Corresponding COBOL Variable is WS-SPACE
	*  @param value
	**/
   public void setSpace(char[] value) {
       value = checkSpaceConstraints(value);
       arraycopy(value,0,space,0,value.length);
   } 
	public void setSpace(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,space,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of headerLabel
	 *	@return headerLabel
	 */
   public char[] getHeaderLabel() throws CFException{
   		return headerLabel;
   }

  
	/**
	*  set variable headerLabel
	*  Corresponding COBOL Variable is WS-HEADER-LABEL
	*  @param value
	**/
   public void setHeaderLabel(char[] value) {
       value = checkHeaderLabelConstraints(value);
       arraycopy(value,0,headerLabel,0,value.length);
   } 
	public void setHeaderLabel(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,headerLabel,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of headerLine
	 *	@return headerLine
	 */
   public char[] getHeaderLine() throws CFException{
   		return headerLine;
   }

  
	/**
	*  set variable headerLine
	*  Corresponding COBOL Variable is WS-HEADER-LINE
	*  @param value
	**/
   public void setHeaderLine(char[] value) {
       value = checkHeaderLineConstraints(value);
       arraycopy(value,0,headerLine,0,value.length);
   } 
	public void setHeaderLine(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,headerLine,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pageBreak
	 *	@return pageBreak
	 */
   public char[] getPageBreak() throws CFException{
   		return pageBreak;
   }

  
	/**
	*  set variable pageBreak
	*  Corresponding COBOL Variable is WS-PAGE-BREAK
	*  @param value
	**/
   public void setPageBreak(char[] value) {
       value = checkPageBreakConstraints(value);
       arraycopy(value,0,pageBreak,0,value.length);
   } 
	public void setPageBreak(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pageBreak,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of footer
	 *	@return footer
	 */
   public char[] getFooter() throws CFException{
   		return footer;
   }

  
	/**
	*  set variable footer
	*  Corresponding COBOL Variable is WS-FOOTER
	*  @param value
	**/
   public void setFooter(char[] value) {
       value = checkFooterConstraints(value);
       arraycopy(value,0,footer,0,value.length);
   } 
	public void setFooter(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,footer,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errPgm
	 *	@return errPgm
	 */
   public char[] getErrPgm() throws CFException{
   		return errPgm;
   }

  
	/**
	*  set variable errPgm
	*  Corresponding COBOL Variable is ERR-PGM
	*  @param value
	**/
   public void setErrPgm(char[] value) {
       value = checkErrPgmConstraints(value);
       arraycopy(value,0,errPgm,0,value.length);
   } 
	public void setErrPgm(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errPgm,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException{
   		return errLoc;
   }

  
	/**
	*  set variable errLoc
	*  Corresponding COBOL Variable is ERR-LOC
	*  @param value
	**/
   public void setErrLoc(char[] value) {
       value = checkErrLocConstraints(value);
       arraycopy(value,0,errLoc,0,value.length);
   } 
	public void setErrLoc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errLoc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException{
   		return errMsg;
   }

  
	/**
	*  set variable errMsg
	*  Corresponding COBOL Variable is ERR-MSG
	*  @param value
	**/
   public void setErrMsg(char[] value) {
       value = checkErrMsgConstraints(value);
       arraycopy(value,0,errMsg,0,value.length);
   } 
	public void setErrMsg(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errCode
	 *	@return errCode
	 */
	public long getErrCode() throws CFException {
       if (isErrCodeModified()) { 
           errCode = refreshErrCode();
        }
   		return errCode;
	}
	

	
	   
	/**
	 * 	Update ErrCode with the passed value
	 *  Corresponding COBOL Variable is ERR-CODE
	 *	@param number
	 */
	public void setErrCode(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    errCode = checkErrCodeMaxLimit(number); 
		serializeErrCode(errCode);
	}
	

	/**
	 * 	Update ErrCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrCode(char[] value) throws CFException {
		 errCode = serializeErrCode(value);
	}
	/**
	 * 	Update ErrCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrCodeString(char[] value) throws CFException {
		 setErrCode(value);
	}
	/**
	 *	Returns the value of repopStat
	 *	@return repopStat
	 */
	public int getRepopStat() throws CFException {
       if (isRepopStatModified()) { 
           repopStat = refreshRepopStat();
        }
   		return repopStat;
	}
	

	
	   
	/**
	 * 	Update RepopStat with the passed value
	 *  Corresponding COBOL Variable is REPOP-STAT
	 *	@param number
	 */
	public void setRepopStat(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    repopStat = checkRepopStatMaxLimit(number); 
		serializeRepopStat(repopStat);
	}
	

	public void setRepopStat(long number) {
	    number = checkRepopStatMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRepopStat((int)number);
	}
	
	/**
	 * 	Update RepopStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setRepopStat(char[] value) throws CFException {
		 repopStat = serializeRepopStat(value);
	}
	/**
	 * 	Update RepopStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRepopStatString(char[] value) throws CFException {
		 setRepopStat(value);
	}
	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
   public char[] getEofFlag() throws CFException{
   		return eofFlag;
   }

  
	/**
	*  set variable eofFlag
	*  Corresponding COBOL Variable is EOF-FLAG
	*  @param value
	**/
   public void setEofFlag(char[] value) {
       value = checkEofFlagConstraints(value);
       arraycopy(value,0,eofFlag,0,value.length);
   } 
	public void setEofFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofFlag,0,beginIndex + endIndex);
   }
	char[] endOfFile88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return (  compareChars( getEofFlag() , endOfFile88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue() {  			
    	setEofFlag( endOfFile88Value);
   	}
	/**
	 *	Returns the value of writeRec
	 *	@return writeRec
	 */
	public int getWriteRec() throws CFException {
       if (isWriteRecModified()) { 
           writeRec = refreshWriteRec();
        }
   		return writeRec;
	}
	

	
	   
	/**
	 * 	Update WriteRec with the passed value
	 *  Corresponding COBOL Variable is WS-WRITE-REC
	 *	@param number
	 */
	public void setWriteRec(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    writeRec = checkWriteRecMaxLimit(number); 
		serializeWriteRec(writeRec);
	}
	

	public void setWriteRec(long number) {
	    number = checkWriteRecMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWriteRec((int)number);
	}
	
	/**
	 * 	Update WriteRec with the passed value
	 *	@param value (String or char[])
	 */
	public void setWriteRec(char[] value) throws CFException {
		 writeRec = serializeWriteRec(value);
	}
	/**
	 * 	Update WriteRec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWriteRecString(char[] value) throws CFException {
		 setWriteRec(value);
	}
	
	/**
	 *	Test condition 0 for isWriteRec88()
	 *	@return  Returns true if isWriteRec88() is 0
	 */
   public boolean isWriteRec88() throws CFException {
      return (  getWriteRec()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setWriteRec88True() {  			
    	setWriteRec( 0);
   	}
	
	/**
	 *	Test condition 1 for isDontWriteRec88()
	 *	@return  Returns true if isDontWriteRec88() is 1
	 */
   public boolean isDontWriteRec88() throws CFException {
      return (  getWriteRec()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDontWriteRec88True() {  			
    	setWriteRec( 1);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
