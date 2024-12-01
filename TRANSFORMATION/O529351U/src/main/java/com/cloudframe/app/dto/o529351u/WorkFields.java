package com.cloudframe.app.dto.o529351u;

/**
*  The class WorkFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkFields extends WorkFieldsSerialized { 
   

						private char[] paragraph = Field.fillLowValue(4);
				private PlanVarInputLines planVarInputLines = new PlanVarInputLines();
				private HoldTransData holdTransData = new HoldTransData();
				private PrevMatchedKey prevMatchedKey = new PrevMatchedKey();
				private HoldTransData2 holdTransData2 = new HoldTransData2();

								private short nbrMatched;

								private short nbrMatchedPrev;
				private Point point = new Point();
				private Datecj datecj = new Datecj();

						private char[] datecjIn = Field.fillLowValue(8);

						private char[] datecjOut = Field.fillLowValue(5);

								private long datecjNum;

								private long complimentDate;

								private long julEffDate;

								private long planEffDate;
				private PlanEffDt planEffDt = new PlanEffDt();

								private long planCanDate;
				private PlanCanDt planCanDt = new PlanCanDt();

								private long planDosDate;
				private PlanDosDt planDosDt = new PlanDosDt();

								private long planDate;
				private PlanDt planDt = new PlanDt();

								private int number;

						private char[] polNo = Field.fillLowValue(6);

								private long plnNo;

						private char[] hold51uPolicy = Field.fillLowValue(6);

								private long hold51uPlan;

						private char[] ctlCntId1 = new char[1];

								private int zero;

						private char[] newServiceCode = Field.fillLowValue(6);
				private CkServCls ckServCls = new CkServCls();
				private ServTop servTop = new ServTop();
				private ServAlphaf servAlphaf = new ServAlphaf();
				private ServAlphal servAlphal = new ServAlphal();
				private FeServFr feServFr = new FeServFr();
				private ServToAlphaff servToAlphaff = new ServToAlphaff();
				private ServToAlphafl servToAlphafl = new ServToAlphafl();
				private FeServTo feServTo = new FeServTo();
				private ServToAlphatf servToAlphatf = new ServToAlphatf();
				private ServToAlphatl servToAlphatl = new ServToAlphatl();

								private int nbrOfLines;

								private int nbrOfPlanVar;

								private short nbrOfNewPlanVar;

								private short planVarPrev;

								private short newPlanVarPrev;

								private int latestLastDate;

						private char[] holdServCd = new char[6];

								private int prevDateServ;

								private int mcrCondCtr;

								private short chargeSub;

						private char[] chargeCombined = Field.fillLowValue(1);

						private char[] toCauseCdChanged = Field.fillLowValue(1);
				private McrCheckTable mcrCheckTable = new McrCheckTable();
	
	/**
	* Constructor for WorkFields
	**/
    public WorkFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			planVarInputLines.setParent(this,getStartOffset() + 4);
	       			holdTransData.setParent(this,getStartOffset() + 199984);
	       			prevMatchedKey.setParent(this,getStartOffset() + 200009);
	       			holdTransData2.setParent(this,getStartOffset() + 200018);
	       			point.setParent(this,getStartOffset() + 200087);
	       			datecj.setParent(this,getStartOffset() + 200095);
	       			planEffDt.setParent(this,getStartOffset() + 200118);
	       			planCanDt.setParent(this,getStartOffset() + 200126);
	       			planDosDt.setParent(this,getStartOffset() + 200134);
	       			planDt.setParent(this,getStartOffset() + 200140);
	       			ckServCls.setParent(this,getStartOffset() + 200175);
	       			servTop.setParent(this,getStartOffset() + 200181);
	       			servAlphaf.setParent(this,getStartOffset() + 200181);
	       			servAlphal.setParent(this,getStartOffset() + 200181);
	       			feServFr.setParent(this,getStartOffset() + 200187);
	       			servToAlphaff.setParent(this,getStartOffset() + 200187);
	       			servToAlphafl.setParent(this,getStartOffset() + 200187);
	       			feServTo.setParent(this,getStartOffset() + 200193);
	       			servToAlphatf.setParent(this,getStartOffset() + 200193);
	       			servToAlphatl.setParent(this,getStartOffset() + 200193);
	       			mcrCheckTable.setParent(this,getStartOffset() + 200246);
	   	/*  end of offset */
								setNbrMatched((short)0);
								setNbrMatchedPrev((short)0);
								setComplimentDate(0L);
								setJulEffDate(0L);
								setPlanEffDate(0L);
								setPlanCanDate(0L);
								setPlanDosDate(0L);
								setPlanDate(0L);
								setNumber(1);
								setPlnNo(0L);
								setHold51uPlan(0L);
								setCtlCntId1(fillSpace(1));
								setZero(0);
								setPlanVarPrev((short)0);
								setNewPlanVarPrev((short)0);
								setLatestLastDate(0);
								setHoldServCd(fillSpace(6));
								setMcrCondCtr(0);
								setChargeSub((short)0);
    }


 

	/**
	 *	Returns the value of paragraph
	 *	@return paragraph
	 */
   public char[] getParagraph() throws CFException{
     if (isParagraphModified()) { 
        paragraph = refreshParagraph();
     }
   		return paragraph;
   }

  
	/**
	*  set variable paragraph
	*  Corresponding COBOL Variable is WS-PARAGRAPH
	*  @param value
	**/
   public void setParagraph(char[] value) {
      paragraph = checkParagraphConstraints(value);
      serializeParagraph(paragraph);
   } 

     /**
	 * 	Update Paragraph 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParagraph(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParagraph,paragraph.length);
   	
   }
   
   public void setParagraph(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParagraph,paragraph.length);
   	
   }
   
     /**
	 * 	Update Paragraph 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParagraph(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParagraph+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Paragraph with another Field
	 *	@param value
	 */
   public void setParagraph(Field source) {
       replace(source,0,source.length(),beginParagraph,PARAGRAPH_LEN);
   	
   }  
   
     /**
	 * 	Update Paragraph 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParagraph(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParagraph,PARAGRAPH_LEN);
   	
   }
   
     /**
	 * 	Update Paragraph 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParagraph(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParagraph+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of planVarInputLines
	 *	@return planVarInputLines
	 */   
	 public PlanVarInputLines getPlanVarInputLines() {
   	return planVarInputLines;
   }
   /**
	* 	Update PlanVarInputLines with the passed value
	*   Corresponding COBOL Variable is WS-PLAN-VAR-INPUT-LINES
	*	@param value
	*/
   public void setPlanVarInputLines(char[] value) {
      planVarInputLines.setString(value); 
   }   
    
     /**
	 * 	Update PlanVarInputLines 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPlanVarInputLines(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planVarInputLines.begin,planVarInputLines.length());
   }
   
     /**
	 * 	Update PlanVarInputLines 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlanVarInputLines(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planVarInputLines.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PlanVarInputLines with another Field
	 *	@param value
	 */
   public void setPlanVarInputLines(Field source) {
   	replace(source,0,source.length(),planVarInputLines.begin,planVarInputLines.length());
   }  
   
     /**
	 * 	Update PlanVarInputLines 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPlanVarInputLines(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planVarInputLines.begin,planVarInputLines.length());
   }
   
     /**
	 * 	Update PlanVarInputLines 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlanVarInputLines(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planVarInputLines.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of holdTransData
	 *	@return holdTransData
	 */   
	 public HoldTransData getHoldTransData() {
   	return holdTransData;
   }
   /**
	* 	Update HoldTransData with the passed value
	*   Corresponding COBOL Variable is WS-HOLD-TRANS-DATA
	*	@param value
	*/
   public void setHoldTransData(char[] value) {
      holdTransData.setString(value); 
   }   
    
     /**
	 * 	Update HoldTransData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHoldTransData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,holdTransData.begin,holdTransData.length());
   }
   
     /**
	 * 	Update HoldTransData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldTransData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,holdTransData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HoldTransData with another Field
	 *	@param value
	 */
   public void setHoldTransData(Field source) {
   	replace(source,0,source.length(),holdTransData.begin,holdTransData.length());
   }  
   
     /**
	 * 	Update HoldTransData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHoldTransData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,holdTransData.begin,holdTransData.length());
   }
   
     /**
	 * 	Update HoldTransData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldTransData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,holdTransData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of prevMatchedKey
	 *	@return prevMatchedKey
	 */   
	 public PrevMatchedKey getPrevMatchedKey() {
   	return prevMatchedKey;
   }
   /**
	* 	Update PrevMatchedKey with the passed value
	*   Corresponding COBOL Variable is WS-PREV-MATCHED-KEY
	*	@param value
	*/
   public void setPrevMatchedKey(char[] value) {
      prevMatchedKey.setString(value); 
   }   
    
     /**
	 * 	Update PrevMatchedKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPrevMatchedKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,prevMatchedKey.begin,prevMatchedKey.length());
   }
   
     /**
	 * 	Update PrevMatchedKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrevMatchedKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,prevMatchedKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PrevMatchedKey with another Field
	 *	@param value
	 */
   public void setPrevMatchedKey(Field source) {
   	replace(source,0,source.length(),prevMatchedKey.begin,prevMatchedKey.length());
   }  
   
     /**
	 * 	Update PrevMatchedKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPrevMatchedKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,prevMatchedKey.begin,prevMatchedKey.length());
   }
   
     /**
	 * 	Update PrevMatchedKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrevMatchedKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,prevMatchedKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of holdTransData2
	 *	@return holdTransData2
	 */   
	 public HoldTransData2 getHoldTransData2() {
   	return holdTransData2;
   }
   /**
	* 	Update HoldTransData2 with the passed value
	*   Corresponding COBOL Variable is WS-HOLD-TRANS-DATA2
	*	@param value
	*/
   public void setHoldTransData2(char[] value) {
      holdTransData2.setString(value); 
   }   
    
     /**
	 * 	Update HoldTransData2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHoldTransData2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,holdTransData2.begin,holdTransData2.length());
   }
   
     /**
	 * 	Update HoldTransData2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldTransData2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,holdTransData2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HoldTransData2 with another Field
	 *	@param value
	 */
   public void setHoldTransData2(Field source) {
   	replace(source,0,source.length(),holdTransData2.begin,holdTransData2.length());
   }  
   
     /**
	 * 	Update HoldTransData2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHoldTransData2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,holdTransData2.begin,holdTransData2.length());
   }
   
     /**
	 * 	Update HoldTransData2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldTransData2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,holdTransData2.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of nbrMatched
	 *	@return nbrMatched
	 */
	public short getNbrMatched() throws CFException {
       if (isNbrMatchedModified()) { 
           nbrMatched = refreshNbrMatched();
        }
   		return nbrMatched;
	}
	

    /**
	 *	Returns the String value of nbrMatched
	 *	@return nbrMatched
	 */
	public char[]  getNbrMatchedActualString() {
	    String value = String.valueOf(nbrMatched).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NbrMatched with the passed value
	 *  Corresponding COBOL Variable is WS-NBR-MATCHED
	 *	@param number
	 */
	public void setNbrMatched(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    nbrMatched = checkNbrMatchedMaxLimit(number); 
		serializeNbrMatched(nbrMatched);
	}
	
	public void setNbrMatched(int number) {
	    number = checkNbrMatchedMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNbrMatched((short)number);
	}
	public void setNbrMatched(long number) {
	    number = checkNbrMatchedMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNbrMatched((short)number);
	}
	

	/**
	 * 	Update NbrMatched with the passed value
	 *	@param value (String or char[])
	 */
	public void setNbrMatched(char[] value) throws CFException {
		 nbrMatched = serializeNbrMatched(value);
	}
	/**
	 * 	Update NbrMatched with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNbrMatchedString(char[] value) throws CFException {
		 setNbrMatched(value);
	}
	/**
	 *	Returns the value of nbrMatchedPrev
	 *	@return nbrMatchedPrev
	 */
	public short getNbrMatchedPrev() throws CFException {
       if (isNbrMatchedPrevModified()) { 
           nbrMatchedPrev = refreshNbrMatchedPrev();
        }
   		return nbrMatchedPrev;
	}
	

    /**
	 *	Returns the String value of nbrMatchedPrev
	 *	@return nbrMatchedPrev
	 */
	public char[]  getNbrMatchedPrevActualString() {
	    String value = String.valueOf(nbrMatchedPrev).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NbrMatchedPrev with the passed value
	 *  Corresponding COBOL Variable is WS-NBR-MATCHED-PREV
	 *	@param number
	 */
	public void setNbrMatchedPrev(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    nbrMatchedPrev = checkNbrMatchedPrevMaxLimit(number); 
		serializeNbrMatchedPrev(nbrMatchedPrev);
	}
	
	public void setNbrMatchedPrev(int number) {
	    number = checkNbrMatchedPrevMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNbrMatchedPrev((short)number);
	}
	public void setNbrMatchedPrev(long number) {
	    number = checkNbrMatchedPrevMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNbrMatchedPrev((short)number);
	}
	

	/**
	 * 	Update NbrMatchedPrev with the passed value
	 *	@param value (String or char[])
	 */
	public void setNbrMatchedPrev(char[] value) throws CFException {
		 nbrMatchedPrev = serializeNbrMatchedPrev(value);
	}
	/**
	 * 	Update NbrMatchedPrev with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNbrMatchedPrevString(char[] value) throws CFException {
		 setNbrMatchedPrev(value);
	}
	/**
	 *	Returns the value of point
	 *	@return point
	 */   
	 public Point getPoint() {
   	return point;
   }
   /**
	* 	Update Point with the passed value
	*   Corresponding COBOL Variable is WS-POINT
	*	@param value
	*/
   public void setPoint(char[] value) {
      point.setString(value); 
   }   
    
     /**
	 * 	Update Point 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPoint(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,point.begin,point.length());
   }
   
     /**
	 * 	Update Point 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPoint(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,point.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Point with another Field
	 *	@param value
	 */
   public void setPoint(Field source) {
   	replace(source,0,source.length(),point.begin,point.length());
   }  
   
     /**
	 * 	Update Point 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPoint(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,point.begin,point.length());
   }
   
     /**
	 * 	Update Point 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPoint(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,point.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of datecj
	 *	@return datecj
	 */   
	 public Datecj getDatecj() {
   	return datecj;
   }
   /**
	* 	Update Datecj with the passed value
	*   Corresponding COBOL Variable is WS-DATECJ
	*	@param value
	*/
   public void setDatecj(char[] value) {
      datecj.setString(value); 
   }   
    
     /**
	 * 	Update Datecj 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDatecj(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,datecj.begin,datecj.length());
   }
   
     /**
	 * 	Update Datecj 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDatecj(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,datecj.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Datecj with another Field
	 *	@param value
	 */
   public void setDatecj(Field source) {
   	replace(source,0,source.length(),datecj.begin,datecj.length());
   }  
   
     /**
	 * 	Update Datecj 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDatecj(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,datecj.begin,datecj.length());
   }
   
     /**
	 * 	Update Datecj 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDatecj(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,datecj.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of datecjIn
	 *	@return datecjIn
	 */
   public char[] getDatecjIn() throws CFException{
     if (isDatecjInModified()) { 
        datecjIn = refreshDatecjIn();
     }
   		return datecjIn;
   }

  
	/**
	*  set variable datecjIn
	*  Corresponding COBOL Variable is WS-DATECJ-IN
	*  @param value
	**/
   public void setDatecjIn(char[] value) {
      datecjIn = checkDatecjInConstraints(value);
      serializeDatecjIn(datecjIn);
   } 

     /**
	 * 	Update DatecjIn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDatecjIn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDatecjIn,datecjIn.length);
   	
   }
   
   public void setDatecjIn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDatecjIn,datecjIn.length);
   	
   }
   
     /**
	 * 	Update DatecjIn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDatecjIn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDatecjIn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DatecjIn with another Field
	 *	@param value
	 */
   public void setDatecjIn(Field source) {
       replace(source,0,source.length(),beginDatecjIn,DATECJ_IN_LEN);
   	
   }  
   
     /**
	 * 	Update DatecjIn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDatecjIn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDatecjIn,DATECJ_IN_LEN);
   	
   }
   
     /**
	 * 	Update DatecjIn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDatecjIn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDatecjIn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of datecjOut
	 *	@return datecjOut
	 */
   public char[] getDatecjOut() throws CFException{
     if (isDatecjOutModified()) { 
        datecjOut = refreshDatecjOut();
     }
   		return datecjOut;
   }

  
	/**
	*  set variable datecjOut
	*  Corresponding COBOL Variable is WS-DATECJ-OUT
	*  @param value
	**/
   public void setDatecjOut(char[] value) {
      datecjOut = checkDatecjOutConstraints(value);
      serializeDatecjOut(datecjOut);
   } 

     /**
	 * 	Update DatecjOut 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDatecjOut(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDatecjOut,datecjOut.length);
   	
   }
   
   public void setDatecjOut(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDatecjOut,datecjOut.length);
   	
   }
   
     /**
	 * 	Update DatecjOut 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDatecjOut(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDatecjOut+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DatecjOut with another Field
	 *	@param value
	 */
   public void setDatecjOut(Field source) {
       replace(source,0,source.length(),beginDatecjOut,DATECJ_OUT_LEN);
   	
   }  
   
     /**
	 * 	Update DatecjOut 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDatecjOut(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDatecjOut,DATECJ_OUT_LEN);
   	
   }
   
     /**
	 * 	Update DatecjOut 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDatecjOut(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDatecjOut+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of datecjNum
	 *	@return datecjNum
	 */
	public long getDatecjNum() throws CFException {
       if (isDatecjNumModified()) { 
           datecjNum = refreshDatecjNum();
        }
   		return datecjNum;
	}
	

	
	   
	/**
	 * 	Update DatecjNum with the passed value
	 *  Corresponding COBOL Variable is WS-DATECJ-NUM
	 *	@param number
	 */
	public void setDatecjNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    datecjNum = checkDatecjNumMaxLimit(number); 
		serializeDatecjNum(datecjNum);
	}
	

	/**
	 * 	Update DatecjNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setDatecjNum(char[] value) throws CFException {
		 datecjNum = serializeDatecjNum(value);
	}
	/**
	 * 	Update DatecjNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDatecjNumString(char[] value) throws CFException {
		 setDatecjNum(value);
	}
	/**
	 *	Returns the value of complimentDate
	 *	@return complimentDate
	 */
	public long getComplimentDate() throws CFException {
       if (isComplimentDateModified()) { 
           complimentDate = refreshComplimentDate();
        }
   		return complimentDate;
	}
	

	
	   
	/**
	 * 	Update ComplimentDate with the passed value
	 *  Corresponding COBOL Variable is WS-COMPLIMENT-DATE
	 *	@param number
	 */
	public void setComplimentDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    complimentDate = checkComplimentDateMaxLimit(number); 
		serializeComplimentDate(complimentDate);
	}
	

	/**
	 * 	Update ComplimentDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setComplimentDate(char[] value) throws CFException {
		 complimentDate = serializeComplimentDate(value);
	}
	/**
	 * 	Update ComplimentDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setComplimentDateString(char[] value) throws CFException {
		 setComplimentDate(value);
	}
	/**
	 *	Returns the value of julEffDate
	 *	@return julEffDate
	 */
	public long getJulEffDate() throws CFException {
       if (isJulEffDateModified()) { 
           julEffDate = refreshJulEffDate();
        }
   		return julEffDate;
	}
	

	
	   
	/**
	 * 	Update JulEffDate with the passed value
	 *  Corresponding COBOL Variable is WS-JUL-EFF-DATE
	 *	@param number
	 */
	public void setJulEffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    julEffDate = checkJulEffDateMaxLimit(number); 
		serializeJulEffDate(julEffDate);
	}
	

	/**
	 * 	Update JulEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulEffDate(char[] value) throws CFException {
		 julEffDate = serializeJulEffDate(value);
	}
	/**
	 * 	Update JulEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulEffDateString(char[] value) throws CFException {
		 setJulEffDate(value);
	}
	/**
	 *	Returns the value of planEffDate
	 *	@return planEffDate
	 */
	public long getPlanEffDate() throws CFException {
       if (isPlanEffDateModified()) { 
           planEffDate = refreshPlanEffDate();
        }
   		return planEffDate;
	}
	

	
	   
	/**
	 * 	Update PlanEffDate with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-EFF-DATE
	 *	@param number
	 */
	public void setPlanEffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    planEffDate = checkPlanEffDateMaxLimit(number); 
		serializePlanEffDate(planEffDate);
	}
	

	/**
	 * 	Update PlanEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanEffDate(char[] value) throws CFException {
		 planEffDate = serializePlanEffDate(value);
	}
	/**
	 * 	Update PlanEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanEffDateString(char[] value) throws CFException {
		 setPlanEffDate(value);
	}
	/**
	 *	Returns the value of planEffDt
	 *	@return planEffDt
	 */   
	 public PlanEffDt getPlanEffDt() {
   	return planEffDt;
   }
   /**
	* 	Update PlanEffDt with the passed value
	*   Corresponding COBOL Variable is WS-PLAN-EFF-DT
	*	@param value
	*/
   public void setPlanEffDt(char[] value) {
      planEffDt.setString(value); 
   }   
    
     /**
	 * 	Update PlanEffDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPlanEffDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planEffDt.begin,planEffDt.length());
   }
   
     /**
	 * 	Update PlanEffDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlanEffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planEffDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PlanEffDt with another Field
	 *	@param value
	 */
   public void setPlanEffDt(Field source) {
   	replace(source,0,source.length(),planEffDt.begin,planEffDt.length());
   }  
   
     /**
	 * 	Update PlanEffDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPlanEffDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planEffDt.begin,planEffDt.length());
   }
   
     /**
	 * 	Update PlanEffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlanEffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planEffDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of planCanDate
	 *	@return planCanDate
	 */
	public long getPlanCanDate() throws CFException {
       if (isPlanCanDateModified()) { 
           planCanDate = refreshPlanCanDate();
        }
   		return planCanDate;
	}
	

	
	   
	/**
	 * 	Update PlanCanDate with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-CAN-DATE
	 *	@param number
	 */
	public void setPlanCanDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    planCanDate = checkPlanCanDateMaxLimit(number); 
		serializePlanCanDate(planCanDate);
	}
	

	/**
	 * 	Update PlanCanDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanCanDate(char[] value) throws CFException {
		 planCanDate = serializePlanCanDate(value);
	}
	/**
	 * 	Update PlanCanDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanCanDateString(char[] value) throws CFException {
		 setPlanCanDate(value);
	}
	/**
	 *	Returns the value of planCanDt
	 *	@return planCanDt
	 */   
	 public PlanCanDt getPlanCanDt() {
   	return planCanDt;
   }
   /**
	* 	Update PlanCanDt with the passed value
	*   Corresponding COBOL Variable is WS-PLAN-CAN-DT
	*	@param value
	*/
   public void setPlanCanDt(char[] value) {
      planCanDt.setString(value); 
   }   
    
     /**
	 * 	Update PlanCanDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPlanCanDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planCanDt.begin,planCanDt.length());
   }
   
     /**
	 * 	Update PlanCanDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlanCanDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planCanDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PlanCanDt with another Field
	 *	@param value
	 */
   public void setPlanCanDt(Field source) {
   	replace(source,0,source.length(),planCanDt.begin,planCanDt.length());
   }  
   
     /**
	 * 	Update PlanCanDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPlanCanDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planCanDt.begin,planCanDt.length());
   }
   
     /**
	 * 	Update PlanCanDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlanCanDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planCanDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of planDosDate
	 *	@return planDosDate
	 */
	public long getPlanDosDate() throws CFException {
       if (isPlanDosDateModified()) { 
           planDosDate = refreshPlanDosDate();
        }
   		return planDosDate;
	}
	

	
	   
	/**
	 * 	Update PlanDosDate with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-DOS-DATE
	 *	@param number
	 */
	public void setPlanDosDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    planDosDate = checkPlanDosDateMaxLimit(number); 
		serializePlanDosDate(planDosDate);
	}
	

	/**
	 * 	Update PlanDosDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanDosDate(char[] value) throws CFException {
		 planDosDate = serializePlanDosDate(value);
	}
	/**
	 * 	Update PlanDosDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanDosDateString(char[] value) throws CFException {
		 setPlanDosDate(value);
	}
	/**
	 *	Returns the value of planDosDt
	 *	@return planDosDt
	 */   
	 public PlanDosDt getPlanDosDt() {
   	return planDosDt;
   }
   /**
	* 	Update PlanDosDt with the passed value
	*   Corresponding COBOL Variable is WS-PLAN-DOS-DT
	*	@param value
	*/
   public void setPlanDosDt(char[] value) {
      planDosDt.setString(value); 
   }   
    
     /**
	 * 	Update PlanDosDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPlanDosDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planDosDt.begin,planDosDt.length());
   }
   
     /**
	 * 	Update PlanDosDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlanDosDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planDosDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PlanDosDt with another Field
	 *	@param value
	 */
   public void setPlanDosDt(Field source) {
   	replace(source,0,source.length(),planDosDt.begin,planDosDt.length());
   }  
   
     /**
	 * 	Update PlanDosDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPlanDosDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planDosDt.begin,planDosDt.length());
   }
   
     /**
	 * 	Update PlanDosDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlanDosDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planDosDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of planDate
	 *	@return planDate
	 */
	public long getPlanDate() throws CFException {
       if (isPlanDateModified()) { 
           planDate = refreshPlanDate();
        }
   		return planDate;
	}
	

	
	   
	/**
	 * 	Update PlanDate with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-DATE
	 *	@param number
	 */
	public void setPlanDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    planDate = checkPlanDateMaxLimit(number); 
		serializePlanDate(planDate);
	}
	

	/**
	 * 	Update PlanDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanDate(char[] value) throws CFException {
		 planDate = serializePlanDate(value);
	}
	/**
	 * 	Update PlanDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanDateString(char[] value) throws CFException {
		 setPlanDate(value);
	}
	/**
	 *	Returns the value of planDt
	 *	@return planDt
	 */   
	 public PlanDt getPlanDt() {
   	return planDt;
   }
   /**
	* 	Update PlanDt with the passed value
	*   Corresponding COBOL Variable is WS-PLAN-DT
	*	@param value
	*/
   public void setPlanDt(char[] value) {
      planDt.setString(value); 
   }   
    
     /**
	 * 	Update PlanDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPlanDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planDt.begin,planDt.length());
   }
   
     /**
	 * 	Update PlanDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlanDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PlanDt with another Field
	 *	@param value
	 */
   public void setPlanDt(Field source) {
   	replace(source,0,source.length(),planDt.begin,planDt.length());
   }  
   
     /**
	 * 	Update PlanDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPlanDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,planDt.begin,planDt.length());
   }
   
     /**
	 * 	Update PlanDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlanDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,planDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of number
	 *	@return number
	 */
	public int getNumber() throws CFException {
       if (isNumberModified()) { 
           number = refreshNumber();
        }
   		return number;
	}
	

	
	   
	/**
	 * 	Update Number with the passed value
	 *  Corresponding COBOL Variable is WS-NUMBER
	 *	@param number
	 */
	public void setNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    number = checkNumberMaxLimit(number); 
		serializeNumber(number);
	}
	

	public void setNumber(long number) {
	    number = checkNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNumber((int)number);
	}
	
	/**
	 * 	Update Number with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumber(char[] value) throws CFException {
		 number = serializeNumber(value);
	}
	/**
	 * 	Update Number with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumberString(char[] value) throws CFException {
		 setNumber(value);
	}
	/**
	 *	Returns the value of polNo
	 *	@return polNo
	 */
   public char[] getPolNo() throws CFException{
     if (isPolNoModified()) { 
        polNo = refreshPolNo();
     }
   		return polNo;
   }

  
	/**
	*  set variable polNo
	*  Corresponding COBOL Variable is WS-POL-NO
	*  @param value
	**/
   public void setPolNo(char[] value) {
      polNo = checkPolNoConstraints(value);
      serializePolNo(polNo);
   } 

     /**
	 * 	Update PolNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPolNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPolNo,polNo.length);
   	
   }
   
   public void setPolNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPolNo,polNo.length);
   	
   }
   
     /**
	 * 	Update PolNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPolNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPolNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PolNo with another Field
	 *	@param value
	 */
   public void setPolNo(Field source) {
       replace(source,0,source.length(),beginPolNo,POL_NO_LEN);
   	
   }  
   
     /**
	 * 	Update PolNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPolNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPolNo,POL_NO_LEN);
   	
   }
   
     /**
	 * 	Update PolNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPolNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPolNo+targetIndex,targetLen);
    
   }
	public long getPlnNo() throws CFException {
        if (isPlnNoModified()) { 
           plnNo = refreshPlnNo();
        }
   		return plnNo;
	}
	
	/**
	 * 	Update PlnNo with the passed value
	 *  Corresponding COBOL Variable is WS-PLN-NO
	 *	@param number
	 */
	public void setPlnNo(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			plnNo = checkPlnNoMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePlnNo(plnNo);
	}


	/**
	 *	Returns the value of hold51uPolicy
	 *	@return hold51uPolicy
	 */
   public char[] getHold51uPolicy() throws CFException{
     if (isHold51uPolicyModified()) { 
        hold51uPolicy = refreshHold51uPolicy();
     }
   		return hold51uPolicy;
   }

  
	/**
	*  set variable hold51uPolicy
	*  Corresponding COBOL Variable is WS-HOLD-51U-POLICY
	*  @param value
	**/
   public void setHold51uPolicy(char[] value) {
      hold51uPolicy = checkHold51uPolicyConstraints(value);
      serializeHold51uPolicy(hold51uPolicy);
   } 

     /**
	 * 	Update Hold51uPolicy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHold51uPolicy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHold51uPolicy,hold51uPolicy.length);
   	
   }
   
   public void setHold51uPolicy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHold51uPolicy,hold51uPolicy.length);
   	
   }
   
     /**
	 * 	Update Hold51uPolicy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHold51uPolicy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHold51uPolicy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hold51uPolicy with another Field
	 *	@param value
	 */
   public void setHold51uPolicy(Field source) {
       replace(source,0,source.length(),beginHold51uPolicy,HOLD_51U_POLICY_LEN);
   	
   }  
   
     /**
	 * 	Update Hold51uPolicy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHold51uPolicy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHold51uPolicy,HOLD_51U_POLICY_LEN);
   	
   }
   
     /**
	 * 	Update Hold51uPolicy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHold51uPolicy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHold51uPolicy+targetIndex,targetLen);
    
   }
	public long getHold51uPlan() throws CFException {
        if (isHold51uPlanModified()) { 
           hold51uPlan = refreshHold51uPlan();
        }
   		return hold51uPlan;
	}
	
	/**
	 * 	Update Hold51uPlan with the passed value
	 *  Corresponding COBOL Variable is WS-HOLD-51U-PLAN
	 *	@param number
	 */
	public void setHold51uPlan(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			hold51uPlan = checkHold51uPlanMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeHold51uPlan(hold51uPlan);
	}


	/**
	 *	Returns the value of ctlCntId1
	 *	@return ctlCntId1
	 */
   public char[] getCtlCntId1() throws CFException{
     if (isCtlCntId1Modified()) { 
        ctlCntId1 = refreshCtlCntId1();
     }
   		return ctlCntId1;
   }

  
	/**
	*  set variable ctlCntId1
	*  Corresponding COBOL Variable is CTL-CNT-ID1
	*  @param value
	**/
   public void setCtlCntId1(char[] value) {
      ctlCntId1 = checkCtlCntId1Constraints(value);
      serializeCtlCntId1(ctlCntId1);
   } 

     /**
	 * 	Update CtlCntId1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCtlCntId1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCtlCntId1,ctlCntId1.length);
   	
   }
   
   public void setCtlCntId1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCtlCntId1,ctlCntId1.length);
   	
   }
   
     /**
	 * 	Update CtlCntId1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCtlCntId1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCtlCntId1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CtlCntId1 with another Field
	 *	@param value
	 */
   public void setCtlCntId1(Field source) {
       replace(source,0,source.length(),beginCtlCntId1,CTL_CNT_ID_1_LEN);
   	
   }  
   
     /**
	 * 	Update CtlCntId1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCtlCntId1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCtlCntId1,CTL_CNT_ID_1_LEN);
   	
   }
   
     /**
	 * 	Update CtlCntId1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCtlCntId1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCtlCntId1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of zero
	 *	@return zero
	 */
	public int getZero() throws CFException {
       if (isZeroModified()) { 
           zero = refreshZero();
        }
   		return zero;
	}
	

	
	   
	/**
	 * 	Update Zero with the passed value
	 *  Corresponding COBOL Variable is WS-ZERO
	 *	@param number
	 */
	public void setZero(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    zero = checkZeroMaxLimit(number); 
		serializeZero(zero);
	}
	

	public void setZero(long number) {
	    number = checkZeroMaxLimit(number); // Truncate if value is beyond +/- Max range
		setZero((int)number);
	}
	
	/**
	 * 	Update Zero with the passed value
	 *	@param value (String or char[])
	 */
	public void setZero(char[] value) throws CFException {
		 zero = serializeZero(value);
	}
	/**
	 * 	Update Zero with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZeroString(char[] value) throws CFException {
		 setZero(value);
	}
	/**
	 *	Returns the value of newServiceCode
	 *	@return newServiceCode
	 */
   public char[] getNewServiceCode() throws CFException{
     if (isNewServiceCodeModified()) { 
        newServiceCode = refreshNewServiceCode();
     }
   		return newServiceCode;
   }

  
	/**
	*  set variable newServiceCode
	*  Corresponding COBOL Variable is WS-NEW-SERVICE-CODE
	*  @param value
	**/
   public void setNewServiceCode(char[] value) {
      newServiceCode = checkNewServiceCodeConstraints(value);
      serializeNewServiceCode(newServiceCode);
   } 

     /**
	 * 	Update NewServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNewServiceCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNewServiceCode,newServiceCode.length);
   	
   }
   
   public void setNewServiceCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNewServiceCode,newServiceCode.length);
   	
   }
   
     /**
	 * 	Update NewServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewServiceCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewServiceCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NewServiceCode with another Field
	 *	@param value
	 */
   public void setNewServiceCode(Field source) {
       replace(source,0,source.length(),beginNewServiceCode,NEW_SERVICE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update NewServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNewServiceCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNewServiceCode,NEW_SERVICE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update NewServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewServiceCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewServiceCode+targetIndex,targetLen);
    
   }
	
	/**
	 *	Test condition "SC76  " THRU "SC99  " for isNewSvcCd()
	 *	@return  Returns true if isNewSvcCd() is "SC76  " THRU "SC99  "
	 */
   public boolean isNewSvcCd() throws CFException {
      return (  isGreaterOrEqual(getNewServiceCode(), "SC76  " ) &&  isLessOrEqual(getNewServiceCode(),"SC99  " )  );
   }


	/**
	*  set values "SC76  " THRU "SC99  "
	*/
   	public void setNewSvcCdTrue() {  			
    	setNewServiceCode( "SC76  ".toCharArray());
   	}
	/**
	 *	Returns the value of ckServCls
	 *	@return ckServCls
	 */   
	 public CkServCls getCkServCls() {
   	return ckServCls;
   }
   /**
	* 	Update CkServCls with the passed value
	*   Corresponding COBOL Variable is CK-SERV-CLS
	*	@param value
	*/
   public void setCkServCls(char[] value) {
      ckServCls.setString(value); 
   }   
    
     /**
	 * 	Update CkServCls 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCkServCls(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ckServCls.begin,ckServCls.length());
   }
   
     /**
	 * 	Update CkServCls 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCkServCls(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ckServCls.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CkServCls with another Field
	 *	@param value
	 */
   public void setCkServCls(Field source) {
   	replace(source,0,source.length(),ckServCls.begin,ckServCls.length());
   }  
   
     /**
	 * 	Update CkServCls 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCkServCls(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ckServCls.begin,ckServCls.length());
   }
   
     /**
	 * 	Update CkServCls 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCkServCls(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ckServCls.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of servTop
	 *	@return servTop
	 */   
	 public ServTop getServTop() {
   	return servTop;
   }
   /**
	* 	Update ServTop with the passed value
	*   Corresponding COBOL Variable is WS-SERV-TOP
	*	@param value
	*/
   public void setServTop(char[] value) {
      servTop.setString(value); 
   }   
    
     /**
	 * 	Update ServTop 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setServTop(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servTop.begin,servTop.length());
   }
   
     /**
	 * 	Update ServTop 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServTop(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servTop.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ServTop with another Field
	 *	@param value
	 */
   public void setServTop(Field source) {
   	replace(source,0,source.length(),servTop.begin,servTop.length());
   }  
   
     /**
	 * 	Update ServTop 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setServTop(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servTop.begin,servTop.length());
   }
   
     /**
	 * 	Update ServTop 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServTop(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servTop.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of servAlphaf
	 *	@return servAlphaf
	 */   
	 public ServAlphaf getServAlphaf() {
   	return servAlphaf;
   }
   /**
	* 	Update ServAlphaf with the passed value
	*   Corresponding COBOL Variable is WS-SERV-ALPHAF
	*	@param value
	*/
   public void setServAlphaf(char[] value) {
      servAlphaf.setString(value); 
   }   
    
     /**
	 * 	Update ServAlphaf 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setServAlphaf(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servAlphaf.begin,servAlphaf.length());
   }
   
     /**
	 * 	Update ServAlphaf 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServAlphaf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servAlphaf.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ServAlphaf with another Field
	 *	@param value
	 */
   public void setServAlphaf(Field source) {
   	replace(source,0,source.length(),servAlphaf.begin,servAlphaf.length());
   }  
   
     /**
	 * 	Update ServAlphaf 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setServAlphaf(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servAlphaf.begin,servAlphaf.length());
   }
   
     /**
	 * 	Update ServAlphaf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServAlphaf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servAlphaf.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of servAlphal
	 *	@return servAlphal
	 */   
	 public ServAlphal getServAlphal() {
   	return servAlphal;
   }
   /**
	* 	Update ServAlphal with the passed value
	*   Corresponding COBOL Variable is WS-SERV-ALPHAL
	*	@param value
	*/
   public void setServAlphal(char[] value) {
      servAlphal.setString(value); 
   }   
    
     /**
	 * 	Update ServAlphal 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setServAlphal(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servAlphal.begin,servAlphal.length());
   }
   
     /**
	 * 	Update ServAlphal 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServAlphal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servAlphal.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ServAlphal with another Field
	 *	@param value
	 */
   public void setServAlphal(Field source) {
   	replace(source,0,source.length(),servAlphal.begin,servAlphal.length());
   }  
   
     /**
	 * 	Update ServAlphal 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setServAlphal(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servAlphal.begin,servAlphal.length());
   }
   
     /**
	 * 	Update ServAlphal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServAlphal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servAlphal.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of feServFr
	 *	@return feServFr
	 */   
	 public FeServFr getFeServFr() {
   	return feServFr;
   }
   /**
	* 	Update FeServFr with the passed value
	*   Corresponding COBOL Variable is FE-SERV-FR
	*	@param value
	*/
   public void setFeServFr(char[] value) {
      feServFr.setString(value); 
   }   
    
     /**
	 * 	Update FeServFr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFeServFr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,feServFr.begin,feServFr.length());
   }
   
     /**
	 * 	Update FeServFr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeServFr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,feServFr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FeServFr with another Field
	 *	@param value
	 */
   public void setFeServFr(Field source) {
   	replace(source,0,source.length(),feServFr.begin,feServFr.length());
   }  
   
     /**
	 * 	Update FeServFr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFeServFr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,feServFr.begin,feServFr.length());
   }
   
     /**
	 * 	Update FeServFr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeServFr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,feServFr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of servToAlphaff
	 *	@return servToAlphaff
	 */   
	 public ServToAlphaff getServToAlphaff() {
   	return servToAlphaff;
   }
   /**
	* 	Update ServToAlphaff with the passed value
	*   Corresponding COBOL Variable is WS-SERV-TO-ALPHAFF
	*	@param value
	*/
   public void setServToAlphaff(char[] value) {
      servToAlphaff.setString(value); 
   }   
    
     /**
	 * 	Update ServToAlphaff 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setServToAlphaff(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphaff.begin,servToAlphaff.length());
   }
   
     /**
	 * 	Update ServToAlphaff 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServToAlphaff(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphaff.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ServToAlphaff with another Field
	 *	@param value
	 */
   public void setServToAlphaff(Field source) {
   	replace(source,0,source.length(),servToAlphaff.begin,servToAlphaff.length());
   }  
   
     /**
	 * 	Update ServToAlphaff 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setServToAlphaff(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphaff.begin,servToAlphaff.length());
   }
   
     /**
	 * 	Update ServToAlphaff 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServToAlphaff(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphaff.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of servToAlphafl
	 *	@return servToAlphafl
	 */   
	 public ServToAlphafl getServToAlphafl() {
   	return servToAlphafl;
   }
   /**
	* 	Update ServToAlphafl with the passed value
	*   Corresponding COBOL Variable is WS-SERV-TO-ALPHAFL
	*	@param value
	*/
   public void setServToAlphafl(char[] value) {
      servToAlphafl.setString(value); 
   }   
    
     /**
	 * 	Update ServToAlphafl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setServToAlphafl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphafl.begin,servToAlphafl.length());
   }
   
     /**
	 * 	Update ServToAlphafl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServToAlphafl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphafl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ServToAlphafl with another Field
	 *	@param value
	 */
   public void setServToAlphafl(Field source) {
   	replace(source,0,source.length(),servToAlphafl.begin,servToAlphafl.length());
   }  
   
     /**
	 * 	Update ServToAlphafl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setServToAlphafl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphafl.begin,servToAlphafl.length());
   }
   
     /**
	 * 	Update ServToAlphafl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServToAlphafl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphafl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of feServTo
	 *	@return feServTo
	 */   
	 public FeServTo getFeServTo() {
   	return feServTo;
   }
   /**
	* 	Update FeServTo with the passed value
	*   Corresponding COBOL Variable is FE-SERV-TO
	*	@param value
	*/
   public void setFeServTo(char[] value) {
      feServTo.setString(value); 
   }   
    
     /**
	 * 	Update FeServTo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFeServTo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,feServTo.begin,feServTo.length());
   }
   
     /**
	 * 	Update FeServTo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeServTo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,feServTo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FeServTo with another Field
	 *	@param value
	 */
   public void setFeServTo(Field source) {
   	replace(source,0,source.length(),feServTo.begin,feServTo.length());
   }  
   
     /**
	 * 	Update FeServTo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFeServTo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,feServTo.begin,feServTo.length());
   }
   
     /**
	 * 	Update FeServTo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeServTo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,feServTo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of servToAlphatf
	 *	@return servToAlphatf
	 */   
	 public ServToAlphatf getServToAlphatf() {
   	return servToAlphatf;
   }
   /**
	* 	Update ServToAlphatf with the passed value
	*   Corresponding COBOL Variable is WS-SERV-TO-ALPHATF
	*	@param value
	*/
   public void setServToAlphatf(char[] value) {
      servToAlphatf.setString(value); 
   }   
    
     /**
	 * 	Update ServToAlphatf 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setServToAlphatf(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphatf.begin,servToAlphatf.length());
   }
   
     /**
	 * 	Update ServToAlphatf 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServToAlphatf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphatf.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ServToAlphatf with another Field
	 *	@param value
	 */
   public void setServToAlphatf(Field source) {
   	replace(source,0,source.length(),servToAlphatf.begin,servToAlphatf.length());
   }  
   
     /**
	 * 	Update ServToAlphatf 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setServToAlphatf(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphatf.begin,servToAlphatf.length());
   }
   
     /**
	 * 	Update ServToAlphatf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServToAlphatf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphatf.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of servToAlphatl
	 *	@return servToAlphatl
	 */   
	 public ServToAlphatl getServToAlphatl() {
   	return servToAlphatl;
   }
   /**
	* 	Update ServToAlphatl with the passed value
	*   Corresponding COBOL Variable is WS-SERV-TO-ALPHATL
	*	@param value
	*/
   public void setServToAlphatl(char[] value) {
      servToAlphatl.setString(value); 
   }   
    
     /**
	 * 	Update ServToAlphatl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setServToAlphatl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphatl.begin,servToAlphatl.length());
   }
   
     /**
	 * 	Update ServToAlphatl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServToAlphatl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphatl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ServToAlphatl with another Field
	 *	@param value
	 */
   public void setServToAlphatl(Field source) {
   	replace(source,0,source.length(),servToAlphatl.begin,servToAlphatl.length());
   }  
   
     /**
	 * 	Update ServToAlphatl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setServToAlphatl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphatl.begin,servToAlphatl.length());
   }
   
     /**
	 * 	Update ServToAlphatl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServToAlphatl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,servToAlphatl.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of nbrOfLines
	 *	@return nbrOfLines
	 */
	public int getNbrOfLines() throws CFException {
        if (isNbrOfLinesModified()) { 
           nbrOfLines = refreshNbrOfLines();
        }
   		return nbrOfLines;
	}
	
	/**
	 * 	Update NbrOfLines with the passed value
	 *  Corresponding COBOL Variable is WS-NBR-OF-LINES
	 *	@param number
	 */
	public void setNbrOfLines(int number) {
	     // Truncate if the number is beyond +/- Max range
	    nbrOfLines = checkNbrOfLinesMaxLimit(number); 
		serializeNbrOfLines(nbrOfLines);
	}


	public void setNbrOfLines(long number) {
	    number = checkNbrOfLinesMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNbrOfLines((int)number);
	}
	
	/**
	 *	Returns the value of nbrOfPlanVar
	 *	@return nbrOfPlanVar
	 */
	public int getNbrOfPlanVar() throws CFException {
        if (isNbrOfPlanVarModified()) { 
           nbrOfPlanVar = refreshNbrOfPlanVar();
        }
   		return nbrOfPlanVar;
	}
	
	/**
	 * 	Update NbrOfPlanVar with the passed value
	 *  Corresponding COBOL Variable is WS-NBR-OF-PLAN-VAR
	 *	@param number
	 */
	public void setNbrOfPlanVar(int number) {
	     // Truncate if the number is beyond +/- Max range
	    nbrOfPlanVar = checkNbrOfPlanVarMaxLimit(number); 
		serializeNbrOfPlanVar(nbrOfPlanVar);
	}


	public void setNbrOfPlanVar(long number) {
	    number = checkNbrOfPlanVarMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNbrOfPlanVar((int)number);
	}
	
	public short getNbrOfNewPlanVar() throws CFException {
        if (isNbrOfNewPlanVarModified()) { 
           nbrOfNewPlanVar = refreshNbrOfNewPlanVar();
        }
   		return nbrOfNewPlanVar;
	}
	
	/**
	 * 	Update NbrOfNewPlanVar with the passed value
	 *  Corresponding COBOL Variable is WS-NBR-OF-NEW-PLAN-VAR
	 *	@param number
	 */
	public void setNbrOfNewPlanVar(short number) {
			nbrOfNewPlanVar = checkNbrOfNewPlanVarMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeNbrOfNewPlanVar(nbrOfNewPlanVar);
	}

	public void setNbrOfNewPlanVar(int number) {
	    number = checkNbrOfNewPlanVarMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNbrOfNewPlanVar((short)number);
	}
	public void setNbrOfNewPlanVar(long number) {
	    number = checkNbrOfNewPlanVarMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNbrOfNewPlanVar((short)number);
	}
	

	/**
	 *	Returns the value of planVarPrev
	 *	@return planVarPrev
	 */
	public short getPlanVarPrev() throws CFException {
        if (isPlanVarPrevModified()) { 
           planVarPrev = refreshPlanVarPrev();
        }
   		return planVarPrev;
	}
	
	/**
	 * 	Update PlanVarPrev with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-VAR-PREV
	 *	@param number
	 */
	public void setPlanVarPrev(short number) {
	     // Truncate if the number is beyond +/- Max range
	    planVarPrev = checkPlanVarPrevMaxLimit(number); 
		serializePlanVarPrev(planVarPrev);
	}

	public void setPlanVarPrev(int number) {
	    number = checkPlanVarPrevMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPlanVarPrev((short)number);
	}
	public void setPlanVarPrev(long number) {
	    number = checkPlanVarPrevMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPlanVarPrev((short)number);
	}
	

	/**
	 *	Returns the value of newPlanVarPrev
	 *	@return newPlanVarPrev
	 */
	public short getNewPlanVarPrev() throws CFException {
        if (isNewPlanVarPrevModified()) { 
           newPlanVarPrev = refreshNewPlanVarPrev();
        }
   		return newPlanVarPrev;
	}
	
	/**
	 * 	Update NewPlanVarPrev with the passed value
	 *  Corresponding COBOL Variable is WS-NEW-PLAN-VAR-PREV
	 *	@param number
	 */
	public void setNewPlanVarPrev(short number) {
	     // Truncate if the number is beyond +/- Max range
	    newPlanVarPrev = checkNewPlanVarPrevMaxLimit(number); 
		serializeNewPlanVarPrev(newPlanVarPrev);
	}

	public void setNewPlanVarPrev(int number) {
	    number = checkNewPlanVarPrevMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewPlanVarPrev((short)number);
	}
	public void setNewPlanVarPrev(long number) {
	    number = checkNewPlanVarPrevMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewPlanVarPrev((short)number);
	}
	

	public int getLatestLastDate() throws CFException {
        if (isLatestLastDateModified()) { 
           latestLastDate = refreshLatestLastDate();
        }
   		return latestLastDate;
	}
	
	/**
	 * 	Update LatestLastDate with the passed value
	 *  Corresponding COBOL Variable is WS-LATEST-LAST-DATE
	 *	@param number
	 */
	public void setLatestLastDate(int number) {
			latestLastDate = checkLatestLastDateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeLatestLastDate(latestLastDate);
	}


	public void setLatestLastDate(long number) {
	    number = checkLatestLastDateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLatestLastDate((int)number);
	}
	
	/**
	 *	Returns the value of holdServCd
	 *	@return holdServCd
	 */
   public char[] getHoldServCd() throws CFException{
     if (isHoldServCdModified()) { 
        holdServCd = refreshHoldServCd();
     }
   		return holdServCd;
   }

  
	/**
	*  set variable holdServCd
	*  Corresponding COBOL Variable is WS-HOLD-SERV-CD
	*  @param value
	**/
   public void setHoldServCd(char[] value) {
      holdServCd = checkHoldServCdConstraints(value);
      serializeHoldServCd(holdServCd);
   } 

     /**
	 * 	Update HoldServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHoldServCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHoldServCd,holdServCd.length);
   	
   }
   
   public void setHoldServCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHoldServCd,holdServCd.length);
   	
   }
   
     /**
	 * 	Update HoldServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldServCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HoldServCd with another Field
	 *	@param value
	 */
   public void setHoldServCd(Field source) {
       replace(source,0,source.length(),beginHoldServCd,HOLD_SERV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update HoldServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHoldServCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHoldServCd,HOLD_SERV_CD_LEN);
   	
   }
   
     /**
	 * 	Update HoldServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldServCd+targetIndex,targetLen);
    
   }
	static java.util.Set<String> informationalServCd88Value = new java.util.HashSet<>();
static { 
	informationalServCd88Value.add( "      ");
	informationalServCd88Value.add( "PARS  ");
	informationalServCd88Value.add( "COBDT ");
	informationalServCd88Value.add( "SSO   ");
	informationalServCd88Value.add( "COPAY ");
	informationalServCd88Value.add( "NCOPAY");
	informationalServCd88Value.add( "PCOPAY");
	informationalServCd88Value.add( "ACPD  ");
	informationalServCd88Value.add( "TDPD  ");
	informationalServCd88Value.add( "POD   ");
	informationalServCd88Value.add( "PRE   ");
	informationalServCd88Value.add( "OI    ");
	informationalServCd88Value.add( "FW    ");
	informationalServCd88Value.add( "EMER  ");
	informationalServCd88Value.add( "CFPD  ");
	informationalServCd88Value.add( "COMAC ");
	informationalServCd88Value.add( "MATDC ");
	informationalServCd88Value.add( "OIM   ");
	informationalServCd88Value.add( "OIMEDI");
	informationalServCd88Value.add( "PLPRE ");
	informationalServCd88Value.add( "CXINT ");
	informationalServCd88Value.add( "CXMED ");
	informationalServCd88Value.add( "CXLEG ");
	informationalServCd88Value.add( "CXMISC");
	informationalServCd88Value.add( "CXAUDT");
	informationalServCd88Value.add( "DISCO ");
	informationalServCd88Value.add( "DRGIN ");
	informationalServCd88Value.add( "DRGOUT");
	informationalServCd88Value.add( "CB0   ");
	informationalServCd88Value.add( "CB1   ");
	informationalServCd88Value.add( "CB2   ");
	informationalServCd88Value.add( "CB3   ");
	informationalServCd88Value.add( "CB4   ");
	informationalServCd88Value.add( "CB5   ");
	informationalServCd88Value.add( "CB6   ");
	informationalServCd88Value.add( "CB7   ");
	informationalServCd88Value.add( "CB8   ");
	informationalServCd88Value.add( "CB9   ");
} 

	/**
	 *	Test condition "      " "PARS  " "COBDT " "SSO   " "COPAY " "NCOPAY" "PCOPAY" "ACPD  " "TDPD  " "POD   " "PRE   " "OI    " "FW    " "EMER  " "CFPD  " "COMAC " "MATDC " "OIM   " "OIMEDI" "PLPRE " "CXINT " "CXMED " "CXLEG " "CXMISC" "CXAUDT" "DISCO " "DRGIN " "DRGOUT" "CB0   " "CB1   " "CB2   " "CB3   " "CB4   " "CB5   " "CB6   " "CB7   " "CB8   " "CB9   " for isInformationalServCd()
	 *	@return  Returns true if isInformationalServCd() is "      " "PARS  " "COBDT " "SSO   " "COPAY " "NCOPAY" "PCOPAY" "ACPD  " "TDPD  " "POD   " "PRE   " "OI    " "FW    " "EMER  " "CFPD  " "COMAC " "MATDC " "OIM   " "OIMEDI" "PLPRE " "CXINT " "CXMED " "CXLEG " "CXMISC" "CXAUDT" "DISCO " "DRGIN " "DRGOUT" "CB0   " "CB1   " "CB2   " "CB3   " "CB4   " "CB5   " "CB6   " "CB7   " "CB8   " "CB9   "
	 */
   public boolean isInformationalServCd() throws CFException {
      return   informationalServCd88Value.contains(String.valueOf(getHoldServCd()));
   }


	/**
	*  set values "      " "PARS  " "COBDT " "SSO   " "COPAY " "NCOPAY" "PCOPAY" "ACPD  " "TDPD  " "POD   " "PRE   " "OI    " "FW    " "EMER  " "CFPD  " "COMAC " "MATDC " "OIM   " "OIMEDI" "PLPRE " "CXINT " "CXMED " "CXLEG " "CXMISC" "CXAUDT" "DISCO " "DRGIN " "DRGOUT" "CB0   " "CB1   " "CB2   " "CB3   " "CB4   " "CB5   " "CB6   " "CB7   " "CB8   " "CB9   "
	*/
   	public void setInformationalServCdTrue() {  			
    	  setHoldServCd(informationalServCd88Value.iterator().next().toCharArray());
   	}
	public int getPrevDateServ() throws CFException {
        if (isPrevDateServModified()) { 
           prevDateServ = refreshPrevDateServ();
        }
   		return prevDateServ;
	}
	
	/**
	 * 	Update PrevDateServ with the passed value
	 *  Corresponding COBOL Variable is WS-PREV-DATE-SERV
	 *	@param number
	 */
	public void setPrevDateServ(int number) {
			prevDateServ = checkPrevDateServMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePrevDateServ(prevDateServ);
	}


	public void setPrevDateServ(long number) {
	    number = checkPrevDateServMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPrevDateServ((int)number);
	}
	
	public int getMcrCondCtr() throws CFException {
        if (isMcrCondCtrModified()) { 
           mcrCondCtr = refreshMcrCondCtr();
        }
   		return mcrCondCtr;
	}
	
	/**
	 * 	Update McrCondCtr with the passed value
	 *  Corresponding COBOL Variable is MCR-COND-CTR
	 *	@param number
	 */
	public void setMcrCondCtr(int number) {
			mcrCondCtr = checkMcrCondCtrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMcrCondCtr(mcrCondCtr);
	}


	public void setMcrCondCtr(long number) {
	    number = checkMcrCondCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMcrCondCtr((int)number);
	}
	
	public short getChargeSub() throws CFException {
        if (isChargeSubModified()) { 
           chargeSub = refreshChargeSub();
        }
   		return chargeSub;
	}
	
	/**
	 * 	Update ChargeSub with the passed value
	 *  Corresponding COBOL Variable is CHARGE-SUB
	 *	@param number
	 */
	public void setChargeSub(short number) {
			chargeSub = checkChargeSubMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeChargeSub(chargeSub);
	}

	public void setChargeSub(int number) {
	    number = checkChargeSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setChargeSub((short)number);
	}
	public void setChargeSub(long number) {
	    number = checkChargeSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setChargeSub((short)number);
	}
	

	/**
	 *	Returns the value of chargeCombined
	 *	@return chargeCombined
	 */
   public char[] getChargeCombined() throws CFException{
     if (isChargeCombinedModified()) { 
        chargeCombined = refreshChargeCombined();
     }
   		return chargeCombined;
   }

  
	/**
	*  set variable chargeCombined
	*  Corresponding COBOL Variable is WS-CHARGE-COMBINED
	*  @param value
	**/
   public void setChargeCombined(char[] value) {
      chargeCombined = checkChargeCombinedConstraints(value);
      serializeChargeCombined(chargeCombined);
   } 

     /**
	 * 	Update ChargeCombined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChargeCombined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChargeCombined,chargeCombined.length);
   	
   }
   
   public void setChargeCombined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChargeCombined,chargeCombined.length);
   	
   }
   
     /**
	 * 	Update ChargeCombined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChargeCombined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChargeCombined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ChargeCombined with another Field
	 *	@param value
	 */
   public void setChargeCombined(Field source) {
       replace(source,0,source.length(),beginChargeCombined,CHARGE_COMBINED_LEN);
   	
   }  
   
     /**
	 * 	Update ChargeCombined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChargeCombined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChargeCombined,CHARGE_COMBINED_LEN);
   	
   }
   
     /**
	 * 	Update ChargeCombined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChargeCombined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChargeCombined+targetIndex,targetLen);
    
   }
	char[] chargeCombined188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isChargeCombined1()
	 *	@return  Returns true if isChargeCombined1() is "Y"
	 */
   public boolean isChargeCombined1() throws CFException {
      return (  compareChars( getChargeCombined() , chargeCombined188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setChargeCombined1True() {  			
    	setChargeCombined( chargeCombined188Value);
   	}
	/**
	 *	Returns the value of toCauseCdChanged
	 *	@return toCauseCdChanged
	 */
   public char[] getToCauseCdChanged() throws CFException{
     if (isToCauseCdChangedModified()) { 
        toCauseCdChanged = refreshToCauseCdChanged();
     }
   		return toCauseCdChanged;
   }

  
	/**
	*  set variable toCauseCdChanged
	*  Corresponding COBOL Variable is WS-TO-CAUSE-CD-CHANGED
	*  @param value
	**/
   public void setToCauseCdChanged(char[] value) {
      toCauseCdChanged = checkToCauseCdChangedConstraints(value);
      serializeToCauseCdChanged(toCauseCdChanged);
   } 

     /**
	 * 	Update ToCauseCdChanged 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setToCauseCdChanged(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginToCauseCdChanged,toCauseCdChanged.length);
   	
   }
   
   public void setToCauseCdChanged(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginToCauseCdChanged,toCauseCdChanged.length);
   	
   }
   
     /**
	 * 	Update ToCauseCdChanged 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setToCauseCdChanged(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginToCauseCdChanged+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ToCauseCdChanged with another Field
	 *	@param value
	 */
   public void setToCauseCdChanged(Field source) {
       replace(source,0,source.length(),beginToCauseCdChanged,TO_CAUSE_CD_CHANGED_LEN);
   	
   }  
   
     /**
	 * 	Update ToCauseCdChanged 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setToCauseCdChanged(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginToCauseCdChanged,TO_CAUSE_CD_CHANGED_LEN);
   	
   }
   
     /**
	 * 	Update ToCauseCdChanged 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setToCauseCdChanged(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginToCauseCdChanged+targetIndex,targetLen);
    
   }
	char[] toCauseCdChanged188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isToCauseCdChanged1()
	 *	@return  Returns true if isToCauseCdChanged1() is "Y"
	 */
   public boolean isToCauseCdChanged1() throws CFException {
      return (  compareChars( getToCauseCdChanged() , toCauseCdChanged188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setToCauseCdChanged1True() {  			
    	setToCauseCdChanged( toCauseCdChanged188Value);
   	}
	/**
	 *	Returns the value of mcrCheckTable
	 *	@return mcrCheckTable
	 */   
	 public McrCheckTable getMcrCheckTable() {
   	return mcrCheckTable;
   }
   /**
	* 	Update McrCheckTable with the passed value
	*   Corresponding COBOL Variable is MCR-CHECK-TABLE
	*	@param value
	*/
   public void setMcrCheckTable(char[] value) {
      mcrCheckTable.setString(value); 
   }   
    
     /**
	 * 	Update McrCheckTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMcrCheckTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mcrCheckTable.begin,mcrCheckTable.length());
   }
   
     /**
	 * 	Update McrCheckTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcrCheckTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mcrCheckTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update McrCheckTable with another Field
	 *	@param value
	 */
   public void setMcrCheckTable(Field source) {
   	replace(source,0,source.length(),mcrCheckTable.begin,mcrCheckTable.length());
   }  
   
     /**
	 * 	Update McrCheckTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMcrCheckTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mcrCheckTable.begin,mcrCheckTable.length());
   }
   
     /**
	 * 	Update McrCheckTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcrCheckTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mcrCheckTable.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWorkFieldsFieldLength() {
			return WORK_FIELDS_LENGTH;
		}

}
  
