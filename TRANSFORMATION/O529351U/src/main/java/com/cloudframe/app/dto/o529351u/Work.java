package com.cloudframe.app.dto.o529351u;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Work extends WorkSerialized { 
   

								private long w02AbsoluteTime;

						private char[] ddSpirules = new char[8];

						private char[] ddPlanvara = new char[8];

								private int cicsDfhrespCode;

						private char[] firstTimeThru = Field.fillLowValue(1);

						private char[] planVarFoundSw = Field.fillLowValue(1);

						private char[] posTierFoundSw = Field.fillLowValue(1);

						private char[] newPlanVarFoundSw = Field.fillLowValue(1);

						private char[] endOfPlanAlt = Field.fillLowValue(1);

						private char[] endOfSpiRule = Field.fillLowValue(1);

						private char[] topsCnvSvc = Field.fillLowValue(1);

						private char[] nbrEqual = Field.fillLowValue(1);

						private char[] searchComplete = Field.fillLowValue(1);

						private char[] fromPsFound = Field.fillLowValue(1);

						private char[] fromSvcFound = Field.fillLowValue(1);

						private char[] fromPrvFound = Field.fillLowValue(1);

						private char[] fromIcd9Found = Field.fillLowValue(1);

						private char[] fromCauseFound = Field.fillLowValue(1);

						private char[] useDiagnosisSw = Field.fillLowValue(1);

						private char[] ipaCodeFound = Field.fillLowValue(1);

						private char[] cpeFlgFound = Field.fillLowValue(1);

						private char[] ipaAndGtnFound = Field.fillLowValue(1);

						private char[] gtnLoaded = Field.fillLowValue(1);

						private char[] sameTable = Field.fillLowValue(1);

						private char[] keyComplete = Field.fillLowValue(1);

						private char[] withMmiSw2010 = Field.fillLowValue(1);

						private char[] mmiFoundSw = Field.fillLowValue(1);

						private char[] primDiagFound = Field.fillLowValue(1);

						private char[] d529351uDb2Dsm = new char[8];

						private char[] newSpiSw = Field.fillLowValue(1);

						private char[] primeSpiSw = Field.fillLowValue(1);

								private short medSvcNbr;

						private char[] medSvc = new char[6];

						private char[] feSpiEnableInd = new char[3];

						private char[] fePrimeSpiEnableInd = new char[3];

								private int keySub;

								private int sub;

								private int posSub;

								private int genSub;

								private int newSub;

								private int psSub;

								private int svcSub;

								private int pvSub;

								private int icd9Sub;

								private int causeSub;

								private int ipaSub;

								private int cflgSub;

								private int sub01;

								private int diagSub;

								private int s1;

								private int dSub;

								private int iSub;

								private int s2;

								private short savHpriceCount;

								private short savNbrOfOccurances2;
      private List<char[]> savHcdsChargeInfo; 


								private short savMpriceCount;

								private short savNbrOfOccurances3;

								private int sazgrpNumGrp;
      private List<char[]> sazgrpGroups; 


						private char[] functionFlag = Field.fillLowValue(2);

						private char[] illogicalCond = Field.fillLowValue(1);

								private int dfhb0020;

								private int dfhb0021;

						private char[] dfhc0040 = Field.fillLowValue(4);

						private char[] dfheiv0 = Field.fillLowValue(77);

						private char[] lsEqiRecord = Field.fillLowValue(48);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setW02AbsoluteTime(0L);
								setDdSpirules(("SPIRUL00").toCharArray());
								setDdPlanvara(("PLNVAR00").toCharArray());
								setD529351uDb2Dsm(("D529351U").toCharArray());
								setMedSvcNbr((short)0);
								setMedSvc(fillSpace(6));
								setFeSpiEnableInd(("ON ").toCharArray());
								setFePrimeSpiEnableInd(("ON ").toCharArray());
								setKeySub(0);
								setSub(0);
								setPosSub(0);
								setGenSub(0);
								setNewSub(0);
								setPsSub(1);
								setSvcSub(1);
								setPvSub(1);
								setIcd9Sub(1);
								setCauseSub(1);
								setIpaSub(0);
								setCflgSub(0);
								setSub01(0);
								setDiagSub(0);
								setS1(0);
								setDSub(0);
								setISub(0);
								setS2(0);
    }


 

	/**
	 *	Returns the value of w02AbsoluteTime
	 *	@return w02AbsoluteTime
	 */
	public long getW02AbsoluteTime() throws CFException {
   		return w02AbsoluteTime;
	}
	
	/**
	 * 	Update W02AbsoluteTime with the passed value
	 *  Corresponding COBOL Variable is W02-ABSOLUTE-TIME
	 *	@param number
	 */
	public void setW02AbsoluteTime(long number) {
	     // Truncate if the number is beyond +/- Max range
	    w02AbsoluteTime = checkW02AbsoluteTimeMaxLimit(number); 
	}


	/**
	 *	Returns the value of ddSpirules
	 *	@return ddSpirules
	 */
   public char[] getDdSpirules() throws CFException{
   		return ddSpirules;
   }

  
	/**
	*  set variable ddSpirules
	*  Corresponding COBOL Variable is DD-SPIRULES
	*  @param value
	**/
   public void setDdSpirules(char[] value) {
       value = checkDdSpirulesConstraints(value);
       arraycopy(value,0,ddSpirules,0,value.length);
   } 
	public void setDdSpirules(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ddSpirules,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ddPlanvara
	 *	@return ddPlanvara
	 */
   public char[] getDdPlanvara() throws CFException{
   		return ddPlanvara;
   }

  
	/**
	*  set variable ddPlanvara
	*  Corresponding COBOL Variable is DD-PLANVARA
	*  @param value
	**/
   public void setDdPlanvara(char[] value) {
       value = checkDdPlanvaraConstraints(value);
       arraycopy(value,0,ddPlanvara,0,value.length);
   } 
	public void setDdPlanvara(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ddPlanvara,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cicsDfhrespCode
	 *	@return cicsDfhrespCode
	 */
	public int getCicsDfhrespCode() throws CFException {
   		return cicsDfhrespCode;
	}
	
	/**
	 * 	Update CicsDfhrespCode with the passed value
	 *  Corresponding COBOL Variable is CICS-DFHRESP-CODE
	 *	@param number
	 */
	public void setCicsDfhrespCode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cicsDfhrespCode = checkCicsDfhrespCodeMaxLimit(number); 
	}


	public void setCicsDfhrespCode(long number) {
	    number = checkCicsDfhrespCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCicsDfhrespCode((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isCicsNormal()
	 *	@return  Returns true if isCicsNormal() is 0
	 */
   public boolean isCicsNormal() throws CFException {
      return (  getCicsDfhrespCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setCicsNormalTrue() {  			
    	setCicsDfhrespCode( 0);
   	}
	
	/**
	 *	Test condition 1 for isCicsError()
	 *	@return  Returns true if isCicsError() is 1
	 */
   public boolean isCicsError() throws CFException {
      return (  getCicsDfhrespCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCicsErrorTrue() {  			
    	setCicsDfhrespCode( 1);
   	}
	
	/**
	 *	Test condition 2 for isCicsRdatt()
	 *	@return  Returns true if isCicsRdatt() is 2
	 */
   public boolean isCicsRdatt() throws CFException {
      return (  getCicsDfhrespCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setCicsRdattTrue() {  			
    	setCicsDfhrespCode( 2);
   	}
	
	/**
	 *	Test condition 3 for isCicsWrbrk()
	 *	@return  Returns true if isCicsWrbrk() is 3
	 */
   public boolean isCicsWrbrk() throws CFException {
      return (  getCicsDfhrespCode()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setCicsWrbrkTrue() {  			
    	setCicsDfhrespCode( 3);
   	}
	
	/**
	 *	Test condition 4 for isCicsEof()
	 *	@return  Returns true if isCicsEof() is 4
	 */
   public boolean isCicsEof() throws CFException {
      return (  getCicsDfhrespCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setCicsEofTrue() {  			
    	setCicsDfhrespCode( 4);
   	}
	
	/**
	 *	Test condition 5 for isCicsEods()
	 *	@return  Returns true if isCicsEods() is 5
	 */
   public boolean isCicsEods() throws CFException {
      return (  getCicsDfhrespCode()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setCicsEodsTrue() {  			
    	setCicsDfhrespCode( 5);
   	}
	
	/**
	 *	Test condition 6 for isCicsEoc()
	 *	@return  Returns true if isCicsEoc() is 6
	 */
   public boolean isCicsEoc() throws CFException {
      return (  getCicsDfhrespCode()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setCicsEocTrue() {  			
    	setCicsDfhrespCode( 6);
   	}
	
	/**
	 *	Test condition 7 for isCicsInbfmh()
	 *	@return  Returns true if isCicsInbfmh() is 7
	 */
   public boolean isCicsInbfmh() throws CFException {
      return (  getCicsDfhrespCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setCicsInbfmhTrue() {  			
    	setCicsDfhrespCode( 7);
   	}
	
	/**
	 *	Test condition 8 for isCicsEndinpt()
	 *	@return  Returns true if isCicsEndinpt() is 8
	 */
   public boolean isCicsEndinpt() throws CFException {
      return (  getCicsDfhrespCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setCicsEndinptTrue() {  			
    	setCicsDfhrespCode( 8);
   	}
	
	/**
	 *	Test condition 9 for isCicsNonval()
	 *	@return  Returns true if isCicsNonval() is 9
	 */
   public boolean isCicsNonval() throws CFException {
      return (  getCicsDfhrespCode()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setCicsNonvalTrue() {  			
    	setCicsDfhrespCode( 9);
   	}
	
	/**
	 *	Test condition 10 for isCicsNostart()
	 *	@return  Returns true if isCicsNostart() is 10
	 */
   public boolean isCicsNostart() throws CFException {
      return (  getCicsDfhrespCode()  ==  10  );
   }


	/**
	*  set values 10
	*/
   	public void setCicsNostartTrue() {  			
    	setCicsDfhrespCode( 10);
   	}
	
	/**
	 *	Test condition 11 for isCicsTermiderr()
	 *	@return  Returns true if isCicsTermiderr() is 11
	 */
   public boolean isCicsTermiderr() throws CFException {
      return (  getCicsDfhrespCode()  ==  11  );
   }


	/**
	*  set values 11
	*/
   	public void setCicsTermiderrTrue() {  			
    	setCicsDfhrespCode( 11);
   	}
	
	/**
	 *	Test condition 12 for isCicsDsiderr()
	 *	@return  Returns true if isCicsDsiderr() is 12
	 */
   public boolean isCicsDsiderr() throws CFException {
      return (  getCicsDfhrespCode()  ==  12  );
   }


	/**
	*  set values 12
	*/
   	public void setCicsDsiderrTrue() {  			
    	setCicsDfhrespCode( 12);
   	}
	
	/**
	 *	Test condition 13 for isCicsNotfnd()
	 *	@return  Returns true if isCicsNotfnd() is 13
	 */
   public boolean isCicsNotfnd() throws CFException {
      return (  getCicsDfhrespCode()  ==  13  );
   }


	/**
	*  set values 13
	*/
   	public void setCicsNotfndTrue() {  			
    	setCicsDfhrespCode( 13);
   	}
	
	/**
	 *	Test condition 14 for isCicsDuprec()
	 *	@return  Returns true if isCicsDuprec() is 14
	 */
   public boolean isCicsDuprec() throws CFException {
      return (  getCicsDfhrespCode()  ==  14  );
   }


	/**
	*  set values 14
	*/
   	public void setCicsDuprecTrue() {  			
    	setCicsDfhrespCode( 14);
   	}
	
	/**
	 *	Test condition 15 for isCicsDupkey()
	 *	@return  Returns true if isCicsDupkey() is 15
	 */
   public boolean isCicsDupkey() throws CFException {
      return (  getCicsDfhrespCode()  ==  15  );
   }


	/**
	*  set values 15
	*/
   	public void setCicsDupkeyTrue() {  			
    	setCicsDfhrespCode( 15);
   	}
	
	/**
	 *	Test condition 16 for isCicsInvreq()
	 *	@return  Returns true if isCicsInvreq() is 16
	 */
   public boolean isCicsInvreq() throws CFException {
      return (  getCicsDfhrespCode()  ==  16  );
   }


	/**
	*  set values 16
	*/
   	public void setCicsInvreqTrue() {  			
    	setCicsDfhrespCode( 16);
   	}
	
	/**
	 *	Test condition 17 for isCicsIoerr()
	 *	@return  Returns true if isCicsIoerr() is 17
	 */
   public boolean isCicsIoerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  17  );
   }


	/**
	*  set values 17
	*/
   	public void setCicsIoerrTrue() {  			
    	setCicsDfhrespCode( 17);
   	}
	
	/**
	 *	Test condition 18 for isCicsNospace()
	 *	@return  Returns true if isCicsNospace() is 18
	 */
   public boolean isCicsNospace() throws CFException {
      return (  getCicsDfhrespCode()  ==  18  );
   }


	/**
	*  set values 18
	*/
   	public void setCicsNospaceTrue() {  			
    	setCicsDfhrespCode( 18);
   	}
	
	/**
	 *	Test condition 19 for isCicsNotopen()
	 *	@return  Returns true if isCicsNotopen() is 19
	 */
   public boolean isCicsNotopen() throws CFException {
      return (  getCicsDfhrespCode()  ==  19  );
   }


	/**
	*  set values 19
	*/
   	public void setCicsNotopenTrue() {  			
    	setCicsDfhrespCode( 19);
   	}
	
	/**
	 *	Test condition 20 for isCicsEndfile()
	 *	@return  Returns true if isCicsEndfile() is 20
	 */
   public boolean isCicsEndfile() throws CFException {
      return (  getCicsDfhrespCode()  ==  20  );
   }


	/**
	*  set values 20
	*/
   	public void setCicsEndfileTrue() {  			
    	setCicsDfhrespCode( 20);
   	}
	
	/**
	 *	Test condition 21 for isCicsIllogic()
	 *	@return  Returns true if isCicsIllogic() is 21
	 */
   public boolean isCicsIllogic() throws CFException {
      return (  getCicsDfhrespCode()  ==  21  );
   }


	/**
	*  set values 21
	*/
   	public void setCicsIllogicTrue() {  			
    	setCicsDfhrespCode( 21);
   	}
	
	/**
	 *	Test condition 22 for isCicsLengerr()
	 *	@return  Returns true if isCicsLengerr() is 22
	 */
   public boolean isCicsLengerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  22  );
   }


	/**
	*  set values 22
	*/
   	public void setCicsLengerrTrue() {  			
    	setCicsDfhrespCode( 22);
   	}
	
	/**
	 *	Test condition 23 for isCicsQzero()
	 *	@return  Returns true if isCicsQzero() is 23
	 */
   public boolean isCicsQzero() throws CFException {
      return (  getCicsDfhrespCode()  ==  23  );
   }


	/**
	*  set values 23
	*/
   	public void setCicsQzeroTrue() {  			
    	setCicsDfhrespCode( 23);
   	}
	
	/**
	 *	Test condition 24 for isCicsSignal()
	 *	@return  Returns true if isCicsSignal() is 24
	 */
   public boolean isCicsSignal() throws CFException {
      return (  getCicsDfhrespCode()  ==  24  );
   }


	/**
	*  set values 24
	*/
   	public void setCicsSignalTrue() {  			
    	setCicsDfhrespCode( 24);
   	}
	
	/**
	 *	Test condition 25 for isCicsQbusy()
	 *	@return  Returns true if isCicsQbusy() is 25
	 */
   public boolean isCicsQbusy() throws CFException {
      return (  getCicsDfhrespCode()  ==  25  );
   }


	/**
	*  set values 25
	*/
   	public void setCicsQbusyTrue() {  			
    	setCicsDfhrespCode( 25);
   	}
	
	/**
	 *	Test condition 26 for isCicsItemerr()
	 *	@return  Returns true if isCicsItemerr() is 26
	 */
   public boolean isCicsItemerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  26  );
   }


	/**
	*  set values 26
	*/
   	public void setCicsItemerrTrue() {  			
    	setCicsDfhrespCode( 26);
   	}
	
	/**
	 *	Test condition 27 for isCicsPgmiderr()
	 *	@return  Returns true if isCicsPgmiderr() is 27
	 */
   public boolean isCicsPgmiderr() throws CFException {
      return (  getCicsDfhrespCode()  ==  27  );
   }


	/**
	*  set values 27
	*/
   	public void setCicsPgmiderrTrue() {  			
    	setCicsDfhrespCode( 27);
   	}
	
	/**
	 *	Test condition 28 for isCicsTransiderr()
	 *	@return  Returns true if isCicsTransiderr() is 28
	 */
   public boolean isCicsTransiderr() throws CFException {
      return (  getCicsDfhrespCode()  ==  28  );
   }


	/**
	*  set values 28
	*/
   	public void setCicsTransiderrTrue() {  			
    	setCicsDfhrespCode( 28);
   	}
	
	/**
	 *	Test condition 29 for isCicsEnddata()
	 *	@return  Returns true if isCicsEnddata() is 29
	 */
   public boolean isCicsEnddata() throws CFException {
      return (  getCicsDfhrespCode()  ==  29  );
   }


	/**
	*  set values 29
	*/
   	public void setCicsEnddataTrue() {  			
    	setCicsDfhrespCode( 29);
   	}
	
	/**
	 *	Test condition 30 for isCicsInvtsreq()
	 *	@return  Returns true if isCicsInvtsreq() is 30
	 */
   public boolean isCicsInvtsreq() throws CFException {
      return (  getCicsDfhrespCode()  ==  30  );
   }


	/**
	*  set values 30
	*/
   	public void setCicsInvtsreqTrue() {  			
    	setCicsDfhrespCode( 30);
   	}
	
	/**
	 *	Test condition 31 for isCicsExpired()
	 *	@return  Returns true if isCicsExpired() is 31
	 */
   public boolean isCicsExpired() throws CFException {
      return (  getCicsDfhrespCode()  ==  31  );
   }


	/**
	*  set values 31
	*/
   	public void setCicsExpiredTrue() {  			
    	setCicsDfhrespCode( 31);
   	}
	
	/**
	 *	Test condition 32 for isCicsRetpage()
	 *	@return  Returns true if isCicsRetpage() is 32
	 */
   public boolean isCicsRetpage() throws CFException {
      return (  getCicsDfhrespCode()  ==  32  );
   }


	/**
	*  set values 32
	*/
   	public void setCicsRetpageTrue() {  			
    	setCicsDfhrespCode( 32);
   	}
	
	/**
	 *	Test condition 33 for isCicsRtefail()
	 *	@return  Returns true if isCicsRtefail() is 33
	 */
   public boolean isCicsRtefail() throws CFException {
      return (  getCicsDfhrespCode()  ==  33  );
   }


	/**
	*  set values 33
	*/
   	public void setCicsRtefailTrue() {  			
    	setCicsDfhrespCode( 33);
   	}
	
	/**
	 *	Test condition 34 for isCicsRtesome()
	 *	@return  Returns true if isCicsRtesome() is 34
	 */
   public boolean isCicsRtesome() throws CFException {
      return (  getCicsDfhrespCode()  ==  34  );
   }


	/**
	*  set values 34
	*/
   	public void setCicsRtesomeTrue() {  			
    	setCicsDfhrespCode( 34);
   	}
	
	/**
	 *	Test condition 35 for isCicsTsioerr()
	 *	@return  Returns true if isCicsTsioerr() is 35
	 */
   public boolean isCicsTsioerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  35  );
   }


	/**
	*  set values 35
	*/
   	public void setCicsTsioerrTrue() {  			
    	setCicsDfhrespCode( 35);
   	}
	
	/**
	 *	Test condition 36 for isCicsMapfail()
	 *	@return  Returns true if isCicsMapfail() is 36
	 */
   public boolean isCicsMapfail() throws CFException {
      return (  getCicsDfhrespCode()  ==  36  );
   }


	/**
	*  set values 36
	*/
   	public void setCicsMapfailTrue() {  			
    	setCicsDfhrespCode( 36);
   	}
	
	/**
	 *	Test condition 37 for isCicsInverrterm()
	 *	@return  Returns true if isCicsInverrterm() is 37
	 */
   public boolean isCicsInverrterm() throws CFException {
      return (  getCicsDfhrespCode()  ==  37  );
   }


	/**
	*  set values 37
	*/
   	public void setCicsInverrtermTrue() {  			
    	setCicsDfhrespCode( 37);
   	}
	
	/**
	 *	Test condition 38 for isCicsInvmpsz()
	 *	@return  Returns true if isCicsInvmpsz() is 38
	 */
   public boolean isCicsInvmpsz() throws CFException {
      return (  getCicsDfhrespCode()  ==  38  );
   }


	/**
	*  set values 38
	*/
   	public void setCicsInvmpszTrue() {  			
    	setCicsDfhrespCode( 38);
   	}
	
	/**
	 *	Test condition 39 for isCicsIgreqid()
	 *	@return  Returns true if isCicsIgreqid() is 39
	 */
   public boolean isCicsIgreqid() throws CFException {
      return (  getCicsDfhrespCode()  ==  39  );
   }


	/**
	*  set values 39
	*/
   	public void setCicsIgreqidTrue() {  			
    	setCicsDfhrespCode( 39);
   	}
	
	/**
	 *	Test condition 40 for isCicsOverflow()
	 *	@return  Returns true if isCicsOverflow() is 40
	 */
   public boolean isCicsOverflow() throws CFException {
      return (  getCicsDfhrespCode()  ==  40  );
   }


	/**
	*  set values 40
	*/
   	public void setCicsOverflowTrue() {  			
    	setCicsDfhrespCode( 40);
   	}
	
	/**
	 *	Test condition 41 for isCicsInvldc()
	 *	@return  Returns true if isCicsInvldc() is 41
	 */
   public boolean isCicsInvldc() throws CFException {
      return (  getCicsDfhrespCode()  ==  41  );
   }


	/**
	*  set values 41
	*/
   	public void setCicsInvldcTrue() {  			
    	setCicsDfhrespCode( 41);
   	}
	
	/**
	 *	Test condition 42 for isCicsNostg()
	 *	@return  Returns true if isCicsNostg() is 42
	 */
   public boolean isCicsNostg() throws CFException {
      return (  getCicsDfhrespCode()  ==  42  );
   }


	/**
	*  set values 42
	*/
   	public void setCicsNostgTrue() {  			
    	setCicsDfhrespCode( 42);
   	}
	
	/**
	 *	Test condition 43 for isCicsJiderr()
	 *	@return  Returns true if isCicsJiderr() is 43
	 */
   public boolean isCicsJiderr() throws CFException {
      return (  getCicsDfhrespCode()  ==  43  );
   }


	/**
	*  set values 43
	*/
   	public void setCicsJiderrTrue() {  			
    	setCicsDfhrespCode( 43);
   	}
	
	/**
	 *	Test condition 44 for isCicsQiderr()
	 *	@return  Returns true if isCicsQiderr() is 44
	 */
   public boolean isCicsQiderr() throws CFException {
      return (  getCicsDfhrespCode()  ==  44  );
   }


	/**
	*  set values 44
	*/
   	public void setCicsQiderrTrue() {  			
    	setCicsDfhrespCode( 44);
   	}
	
	/**
	 *	Test condition 45 for isCicsNojbufsp()
	 *	@return  Returns true if isCicsNojbufsp() is 45
	 */
   public boolean isCicsNojbufsp() throws CFException {
      return (  getCicsDfhrespCode()  ==  45  );
   }


	/**
	*  set values 45
	*/
   	public void setCicsNojbufspTrue() {  			
    	setCicsDfhrespCode( 45);
   	}
	
	/**
	 *	Test condition 46 for isCicsDsstat()
	 *	@return  Returns true if isCicsDsstat() is 46
	 */
   public boolean isCicsDsstat() throws CFException {
      return (  getCicsDfhrespCode()  ==  46  );
   }


	/**
	*  set values 46
	*/
   	public void setCicsDsstatTrue() {  			
    	setCicsDfhrespCode( 46);
   	}
	
	/**
	 *	Test condition 47 for isCicsSelnerr()
	 *	@return  Returns true if isCicsSelnerr() is 47
	 */
   public boolean isCicsSelnerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  47  );
   }


	/**
	*  set values 47
	*/
   	public void setCicsSelnerrTrue() {  			
    	setCicsDfhrespCode( 47);
   	}
	
	/**
	 *	Test condition 48 for isCicsFuncerr()
	 *	@return  Returns true if isCicsFuncerr() is 48
	 */
   public boolean isCicsFuncerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  48  );
   }


	/**
	*  set values 48
	*/
   	public void setCicsFuncerrTrue() {  			
    	setCicsDfhrespCode( 48);
   	}
	
	/**
	 *	Test condition 49 for isCicsUnexpin()
	 *	@return  Returns true if isCicsUnexpin() is 49
	 */
   public boolean isCicsUnexpin() throws CFException {
      return (  getCicsDfhrespCode()  ==  49  );
   }


	/**
	*  set values 49
	*/
   	public void setCicsUnexpinTrue() {  			
    	setCicsDfhrespCode( 49);
   	}
	
	/**
	 *	Test condition 50 for isCicsNopassbkrd()
	 *	@return  Returns true if isCicsNopassbkrd() is 50
	 */
   public boolean isCicsNopassbkrd() throws CFException {
      return (  getCicsDfhrespCode()  ==  50  );
   }


	/**
	*  set values 50
	*/
   	public void setCicsNopassbkrdTrue() {  			
    	setCicsDfhrespCode( 50);
   	}
	
	/**
	 *	Test condition 51 for isCicsNopassbkwr()
	 *	@return  Returns true if isCicsNopassbkwr() is 51
	 */
   public boolean isCicsNopassbkwr() throws CFException {
      return (  getCicsDfhrespCode()  ==  51  );
   }


	/**
	*  set values 51
	*/
   	public void setCicsNopassbkwrTrue() {  			
    	setCicsDfhrespCode( 51);
   	}
	
	/**
	 *	Test condition 53 for isCicsSysiderr()
	 *	@return  Returns true if isCicsSysiderr() is 53
	 */
   public boolean isCicsSysiderr() throws CFException {
      return (  getCicsDfhrespCode()  ==  53  );
   }


	/**
	*  set values 53
	*/
   	public void setCicsSysiderrTrue() {  			
    	setCicsDfhrespCode( 53);
   	}
	
	/**
	 *	Test condition 54 for isCicsIscinvreq()
	 *	@return  Returns true if isCicsIscinvreq() is 54
	 */
   public boolean isCicsIscinvreq() throws CFException {
      return (  getCicsDfhrespCode()  ==  54  );
   }


	/**
	*  set values 54
	*/
   	public void setCicsIscinvreqTrue() {  			
    	setCicsDfhrespCode( 54);
   	}
	
	/**
	 *	Test condition 55 for isCicsEnqbusy()
	 *	@return  Returns true if isCicsEnqbusy() is 55
	 */
   public boolean isCicsEnqbusy() throws CFException {
      return (  getCicsDfhrespCode()  ==  55  );
   }


	/**
	*  set values 55
	*/
   	public void setCicsEnqbusyTrue() {  			
    	setCicsDfhrespCode( 55);
   	}
	
	/**
	 *	Test condition 56 for isCicsEnvdeferr()
	 *	@return  Returns true if isCicsEnvdeferr() is 56
	 */
   public boolean isCicsEnvdeferr() throws CFException {
      return (  getCicsDfhrespCode()  ==  56  );
   }


	/**
	*  set values 56
	*/
   	public void setCicsEnvdeferrTrue() {  			
    	setCicsDfhrespCode( 56);
   	}
	
	/**
	 *	Test condition 57 for isCicsIgreqcd()
	 *	@return  Returns true if isCicsIgreqcd() is 57
	 */
   public boolean isCicsIgreqcd() throws CFException {
      return (  getCicsDfhrespCode()  ==  57  );
   }


	/**
	*  set values 57
	*/
   	public void setCicsIgreqcdTrue() {  			
    	setCicsDfhrespCode( 57);
   	}
	
	/**
	 *	Test condition 58 for isCicsSessionerr()
	 *	@return  Returns true if isCicsSessionerr() is 58
	 */
   public boolean isCicsSessionerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  58  );
   }


	/**
	*  set values 58
	*/
   	public void setCicsSessionerrTrue() {  			
    	setCicsDfhrespCode( 58);
   	}
	
	/**
	 *	Test condition 59 for isCicsSysbusy()
	 *	@return  Returns true if isCicsSysbusy() is 59
	 */
   public boolean isCicsSysbusy() throws CFException {
      return (  getCicsDfhrespCode()  ==  59  );
   }


	/**
	*  set values 59
	*/
   	public void setCicsSysbusyTrue() {  			
    	setCicsDfhrespCode( 59);
   	}
	
	/**
	 *	Test condition 60 for isCicsSessbusy()
	 *	@return  Returns true if isCicsSessbusy() is 60
	 */
   public boolean isCicsSessbusy() throws CFException {
      return (  getCicsDfhrespCode()  ==  60  );
   }


	/**
	*  set values 60
	*/
   	public void setCicsSessbusyTrue() {  			
    	setCicsDfhrespCode( 60);
   	}
	
	/**
	 *	Test condition 61 for isCicsNotalloc()
	 *	@return  Returns true if isCicsNotalloc() is 61
	 */
   public boolean isCicsNotalloc() throws CFException {
      return (  getCicsDfhrespCode()  ==  61  );
   }


	/**
	*  set values 61
	*/
   	public void setCicsNotallocTrue() {  			
    	setCicsDfhrespCode( 61);
   	}
	
	/**
	 *	Test condition 62 for isCicsCbiderr()
	 *	@return  Returns true if isCicsCbiderr() is 62
	 */
   public boolean isCicsCbiderr() throws CFException {
      return (  getCicsDfhrespCode()  ==  62  );
   }


	/**
	*  set values 62
	*/
   	public void setCicsCbiderrTrue() {  			
    	setCicsDfhrespCode( 62);
   	}
	
	/**
	 *	Test condition 64 for isCicsInvpartnset()
	 *	@return  Returns true if isCicsInvpartnset() is 64
	 */
   public boolean isCicsInvpartnset() throws CFException {
      return (  getCicsDfhrespCode()  ==  64  );
   }


	/**
	*  set values 64
	*/
   	public void setCicsInvpartnsetTrue() {  			
    	setCicsDfhrespCode( 64);
   	}
	
	/**
	 *	Test condition 65 for isCicsInvpartn()
	 *	@return  Returns true if isCicsInvpartn() is 65
	 */
   public boolean isCicsInvpartn() throws CFException {
      return (  getCicsDfhrespCode()  ==  65  );
   }


	/**
	*  set values 65
	*/
   	public void setCicsInvpartnTrue() {  			
    	setCicsDfhrespCode( 65);
   	}
	
	/**
	 *	Test condition 66 for isCicsPartnfail()
	 *	@return  Returns true if isCicsPartnfail() is 66
	 */
   public boolean isCicsPartnfail() throws CFException {
      return (  getCicsDfhrespCode()  ==  66  );
   }


	/**
	*  set values 66
	*/
   	public void setCicsPartnfailTrue() {  			
    	setCicsDfhrespCode( 66);
   	}
	
	/**
	 *	Test condition 70 for isCicsNotauth()
	 *	@return  Returns true if isCicsNotauth() is 70
	 */
   public boolean isCicsNotauth() throws CFException {
      return (  getCicsDfhrespCode()  ==  70  );
   }


	/**
	*  set values 70
	*/
   	public void setCicsNotauthTrue() {  			
    	setCicsDfhrespCode( 70);
   	}
	
	/**
	 *	Test condition 80 for isCicsNospool()
	 *	@return  Returns true if isCicsNospool() is 80
	 */
   public boolean isCicsNospool() throws CFException {
      return (  getCicsDfhrespCode()  ==  80  );
   }


	/**
	*  set values 80
	*/
   	public void setCicsNospoolTrue() {  			
    	setCicsDfhrespCode( 80);
   	}
	
	/**
	 *	Test condition 81 for isCicsTermerr()
	 *	@return  Returns true if isCicsTermerr() is 81
	 */
   public boolean isCicsTermerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  81  );
   }


	/**
	*  set values 81
	*/
   	public void setCicsTermerrTrue() {  			
    	setCicsDfhrespCode( 81);
   	}
	
	/**
	 *	Test condition 82 for isCicsRolledback()
	 *	@return  Returns true if isCicsRolledback() is 82
	 */
   public boolean isCicsRolledback() throws CFException {
      return (  getCicsDfhrespCode()  ==  82  );
   }


	/**
	*  set values 82
	*/
   	public void setCicsRolledbackTrue() {  			
    	setCicsDfhrespCode( 82);
   	}
	
	/**
	 *	Test condition 83 for isCicsEnd()
	 *	@return  Returns true if isCicsEnd() is 83
	 */
   public boolean isCicsEnd() throws CFException {
      return (  getCicsDfhrespCode()  ==  83  );
   }


	/**
	*  set values 83
	*/
   	public void setCicsEndTrue() {  			
    	setCicsDfhrespCode( 83);
   	}
	
	/**
	 *	Test condition 84 for isCicsDisabled()
	 *	@return  Returns true if isCicsDisabled() is 84
	 */
   public boolean isCicsDisabled() throws CFException {
      return (  getCicsDfhrespCode()  ==  84  );
   }


	/**
	*  set values 84
	*/
   	public void setCicsDisabledTrue() {  			
    	setCicsDfhrespCode( 84);
   	}
	
	/**
	 *	Test condition 85 for isCicsAllocerr()
	 *	@return  Returns true if isCicsAllocerr() is 85
	 */
   public boolean isCicsAllocerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  85  );
   }


	/**
	*  set values 85
	*/
   	public void setCicsAllocerrTrue() {  			
    	setCicsDfhrespCode( 85);
   	}
	
	/**
	 *	Test condition 86 for isCicsStrelerr()
	 *	@return  Returns true if isCicsStrelerr() is 86
	 */
   public boolean isCicsStrelerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  86  );
   }


	/**
	*  set values 86
	*/
   	public void setCicsStrelerrTrue() {  			
    	setCicsDfhrespCode( 86);
   	}
	
	/**
	 *	Test condition 87 for isCicsOpenerr()
	 *	@return  Returns true if isCicsOpenerr() is 87
	 */
   public boolean isCicsOpenerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  87  );
   }


	/**
	*  set values 87
	*/
   	public void setCicsOpenerrTrue() {  			
    	setCicsDfhrespCode( 87);
   	}
	
	/**
	 *	Test condition 88 for isCicsSpolbusy()
	 *	@return  Returns true if isCicsSpolbusy() is 88
	 */
   public boolean isCicsSpolbusy() throws CFException {
      return (  getCicsDfhrespCode()  ==  88  );
   }


	/**
	*  set values 88
	*/
   	public void setCicsSpolbusyTrue() {  			
    	setCicsDfhrespCode( 88);
   	}
	
	/**
	 *	Test condition 89 for isCicsSpolerr()
	 *	@return  Returns true if isCicsSpolerr() is 89
	 */
   public boolean isCicsSpolerr() throws CFException {
      return (  getCicsDfhrespCode()  ==  89  );
   }


	/**
	*  set values 89
	*/
   	public void setCicsSpolerrTrue() {  			
    	setCicsDfhrespCode( 89);
   	}
	/**
	 *	Returns the value of firstTimeThru
	 *	@return firstTimeThru
	 */
   public char[] getFirstTimeThru() throws CFException{
   		return firstTimeThru;
   }

  
	/**
	*  set variable firstTimeThru
	*  Corresponding COBOL Variable is WS-FIRST-TIME-THRU
	*  @param value
	**/
   public void setFirstTimeThru(char[] value) {
       value = checkFirstTimeThruConstraints(value);
       arraycopy(value,0,firstTimeThru,0,value.length);
   } 
	public void setFirstTimeThru(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,firstTimeThru,0,beginIndex + endIndex);
   }
	char[] firstTimeThru188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFirstTimeThru1()
	 *	@return  Returns true if isFirstTimeThru1() is "Y"
	 */
   public boolean isFirstTimeThru1() throws CFException {
      return (  compareChars( getFirstTimeThru() , firstTimeThru188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFirstTimeThru1True() {  			
    	setFirstTimeThru( firstTimeThru188Value);
   	}
	/**
	 *	Returns the value of planVarFoundSw
	 *	@return planVarFoundSw
	 */
   public char[] getPlanVarFoundSw() throws CFException{
   		return planVarFoundSw;
   }

  
	/**
	*  set variable planVarFoundSw
	*  Corresponding COBOL Variable is WS-PLAN-VAR-FOUND-SW
	*  @param value
	**/
   public void setPlanVarFoundSw(char[] value) {
       value = checkPlanVarFoundSwConstraints(value);
       arraycopy(value,0,planVarFoundSw,0,value.length);
   } 
	public void setPlanVarFoundSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,planVarFoundSw,0,beginIndex + endIndex);
   }
	char[] planVarFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isPlanVarFound()
	 *	@return  Returns true if isPlanVarFound() is "Y"
	 */
   public boolean isPlanVarFound() throws CFException {
      return (  compareChars( getPlanVarFoundSw() , planVarFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setPlanVarFoundTrue() {  			
    	setPlanVarFoundSw( planVarFound88Value);
   	}
	char[] planVarNotFound88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isPlanVarNotFound()
	 *	@return  Returns true if isPlanVarNotFound() is "N"
	 */
   public boolean isPlanVarNotFound() throws CFException {
      return (  compareChars( getPlanVarFoundSw() , planVarNotFound88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setPlanVarNotFoundTrue() {  			
    	setPlanVarFoundSw( planVarNotFound88Value);
   	}
	/**
	 *	Returns the value of posTierFoundSw
	 *	@return posTierFoundSw
	 */
   public char[] getPosTierFoundSw() throws CFException{
   		return posTierFoundSw;
   }

  
	/**
	*  set variable posTierFoundSw
	*  Corresponding COBOL Variable is WS-POS-TIER-FOUND-SW
	*  @param value
	**/
   public void setPosTierFoundSw(char[] value) {
       value = checkPosTierFoundSwConstraints(value);
       arraycopy(value,0,posTierFoundSw,0,value.length);
   } 
	public void setPosTierFoundSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,posTierFoundSw,0,beginIndex + endIndex);
   }
	char[] holdPosFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isHoldPosFound()
	 *	@return  Returns true if isHoldPosFound() is "Y"
	 */
   public boolean isHoldPosFound() throws CFException {
      return (  compareChars( getPosTierFoundSw() , holdPosFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setHoldPosFoundTrue() {  			
    	setPosTierFoundSw( holdPosFound88Value);
   	}
	char[] holdPosNotFound88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isHoldPosNotFound()
	 *	@return  Returns true if isHoldPosNotFound() is "N"
	 */
   public boolean isHoldPosNotFound() throws CFException {
      return (  compareChars( getPosTierFoundSw() , holdPosNotFound88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setHoldPosNotFoundTrue() {  			
    	setPosTierFoundSw( holdPosNotFound88Value);
   	}
	/**
	 *	Returns the value of newPlanVarFoundSw
	 *	@return newPlanVarFoundSw
	 */
   public char[] getNewPlanVarFoundSw() throws CFException{
   		return newPlanVarFoundSw;
   }

  
	/**
	*  set variable newPlanVarFoundSw
	*  Corresponding COBOL Variable is WS-NEW-PLAN-VAR-FOUND-SW
	*  @param value
	**/
   public void setNewPlanVarFoundSw(char[] value) {
       value = checkNewPlanVarFoundSwConstraints(value);
       arraycopy(value,0,newPlanVarFoundSw,0,value.length);
   } 
	public void setNewPlanVarFoundSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,newPlanVarFoundSw,0,beginIndex + endIndex);
   }
	char[] newPlanVarFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isNewPlanVarFound()
	 *	@return  Returns true if isNewPlanVarFound() is "Y"
	 */
   public boolean isNewPlanVarFound() throws CFException {
      return (  compareChars( getNewPlanVarFoundSw() , newPlanVarFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setNewPlanVarFoundTrue() {  			
    	setNewPlanVarFoundSw( newPlanVarFound88Value);
   	}
	/**
	 *	Returns the value of endOfPlanAlt
	 *	@return endOfPlanAlt
	 */
   public char[] getEndOfPlanAlt() throws CFException{
   		return endOfPlanAlt;
   }

  
	/**
	*  set variable endOfPlanAlt
	*  Corresponding COBOL Variable is WS-END-OF-PLAN-ALT
	*  @param value
	**/
   public void setEndOfPlanAlt(char[] value) {
       value = checkEndOfPlanAltConstraints(value);
       arraycopy(value,0,endOfPlanAlt,0,value.length);
   } 
	public void setEndOfPlanAlt(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,endOfPlanAlt,0,beginIndex + endIndex);
   }
	char[] endOfPlanAlt188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfPlanAlt1()
	 *	@return  Returns true if isEndOfPlanAlt1() is "Y"
	 */
   public boolean isEndOfPlanAlt1() throws CFException {
      return (  compareChars( getEndOfPlanAlt() , endOfPlanAlt188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfPlanAlt1True() {  			
    	setEndOfPlanAlt( endOfPlanAlt188Value);
   	}
	/**
	 *	Returns the value of endOfSpiRule
	 *	@return endOfSpiRule
	 */
   public char[] getEndOfSpiRule() throws CFException{
   		return endOfSpiRule;
   }

  
	/**
	*  set variable endOfSpiRule
	*  Corresponding COBOL Variable is WS-END-OF-SPI-RULE
	*  @param value
	**/
   public void setEndOfSpiRule(char[] value) {
       value = checkEndOfSpiRuleConstraints(value);
       arraycopy(value,0,endOfSpiRule,0,value.length);
   } 
	public void setEndOfSpiRule(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,endOfSpiRule,0,beginIndex + endIndex);
   }
	char[] endOfSpiRule188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfSpiRule1()
	 *	@return  Returns true if isEndOfSpiRule1() is "Y"
	 */
   public boolean isEndOfSpiRule1() throws CFException {
      return (  compareChars( getEndOfSpiRule() , endOfSpiRule188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfSpiRule1True() {  			
    	setEndOfSpiRule( endOfSpiRule188Value);
   	}
	/**
	 *	Returns the value of topsCnvSvc
	 *	@return topsCnvSvc
	 */
   public char[] getTopsCnvSvc() throws CFException{
   		return topsCnvSvc;
   }

  
	/**
	*  set variable topsCnvSvc
	*  Corresponding COBOL Variable is WS-TOPS-CNV-SVC
	*  @param value
	**/
   public void setTopsCnvSvc(char[] value) {
       value = checkTopsCnvSvcConstraints(value);
       arraycopy(value,0,topsCnvSvc,0,value.length);
   } 
	public void setTopsCnvSvc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,topsCnvSvc,0,beginIndex + endIndex);
   }
	char[] topsCnvSvc188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isTopsCnvSvc1()
	 *	@return  Returns true if isTopsCnvSvc1() is "Y"
	 */
   public boolean isTopsCnvSvc1() throws CFException {
      return (  compareChars( getTopsCnvSvc() , topsCnvSvc188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setTopsCnvSvc1True() {  			
    	setTopsCnvSvc( topsCnvSvc188Value);
   	}
	/**
	 *	Returns the value of nbrEqual
	 *	@return nbrEqual
	 */
   public char[] getNbrEqual() throws CFException{
   		return nbrEqual;
   }

  
	/**
	*  set variable nbrEqual
	*  Corresponding COBOL Variable is WS-NBR-EQUAL
	*  @param value
	**/
   public void setNbrEqual(char[] value) {
       value = checkNbrEqualConstraints(value);
       arraycopy(value,0,nbrEqual,0,value.length);
   } 
	public void setNbrEqual(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,nbrEqual,0,beginIndex + endIndex);
   }
	char[] nbrEqual188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isNbrEqual1()
	 *	@return  Returns true if isNbrEqual1() is "Y"
	 */
   public boolean isNbrEqual1() throws CFException {
      return (  compareChars( getNbrEqual() , nbrEqual188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setNbrEqual1True() {  			
    	setNbrEqual( nbrEqual188Value);
   	}
	char[] notNbrEqual88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotNbrEqual()
	 *	@return  Returns true if isNotNbrEqual() is "N"
	 */
   public boolean isNotNbrEqual() throws CFException {
      return (  compareChars( getNbrEqual() , notNbrEqual88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotNbrEqualTrue() {  			
    	setNbrEqual( notNbrEqual88Value);
   	}
	/**
	 *	Returns the value of searchComplete
	 *	@return searchComplete
	 */
   public char[] getSearchComplete() throws CFException{
   		return searchComplete;
   }

  
	/**
	*  set variable searchComplete
	*  Corresponding COBOL Variable is WS-SEARCH-COMPLETE
	*  @param value
	**/
   public void setSearchComplete(char[] value) {
       value = checkSearchCompleteConstraints(value);
       arraycopy(value,0,searchComplete,0,value.length);
   } 
	public void setSearchComplete(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,searchComplete,0,beginIndex + endIndex);
   }
	char[] searchComplete188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSearchComplete1()
	 *	@return  Returns true if isSearchComplete1() is "Y"
	 */
   public boolean isSearchComplete1() throws CFException {
      return (  compareChars( getSearchComplete() , searchComplete188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSearchComplete1True() {  			
    	setSearchComplete( searchComplete188Value);
   	}
	/**
	 *	Returns the value of fromPsFound
	 *	@return fromPsFound
	 */
   public char[] getFromPsFound() throws CFException{
   		return fromPsFound;
   }

  
	/**
	*  set variable fromPsFound
	*  Corresponding COBOL Variable is WS-FROM-PS-FOUND
	*  @param value
	**/
   public void setFromPsFound(char[] value) {
       value = checkFromPsFoundConstraints(value);
       arraycopy(value,0,fromPsFound,0,value.length);
   } 
	public void setFromPsFound(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fromPsFound,0,beginIndex + endIndex);
   }
	char[] fromPsFound188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFromPsFound1()
	 *	@return  Returns true if isFromPsFound1() is "Y"
	 */
   public boolean isFromPsFound1() throws CFException {
      return (  compareChars( getFromPsFound() , fromPsFound188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFromPsFound1True() {  			
    	setFromPsFound( fromPsFound188Value);
   	}
	/**
	 *	Returns the value of fromSvcFound
	 *	@return fromSvcFound
	 */
   public char[] getFromSvcFound() throws CFException{
   		return fromSvcFound;
   }

  
	/**
	*  set variable fromSvcFound
	*  Corresponding COBOL Variable is WS-FROM-SVC-FOUND
	*  @param value
	**/
   public void setFromSvcFound(char[] value) {
       value = checkFromSvcFoundConstraints(value);
       arraycopy(value,0,fromSvcFound,0,value.length);
   } 
	public void setFromSvcFound(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fromSvcFound,0,beginIndex + endIndex);
   }
	char[] fromSvcFound188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFromSvcFound1()
	 *	@return  Returns true if isFromSvcFound1() is "Y"
	 */
   public boolean isFromSvcFound1() throws CFException {
      return (  compareChars( getFromSvcFound() , fromSvcFound188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFromSvcFound1True() {  			
    	setFromSvcFound( fromSvcFound188Value);
   	}
	/**
	 *	Returns the value of fromPrvFound
	 *	@return fromPrvFound
	 */
   public char[] getFromPrvFound() throws CFException{
   		return fromPrvFound;
   }

  
	/**
	*  set variable fromPrvFound
	*  Corresponding COBOL Variable is WS-FROM-PRV-FOUND
	*  @param value
	**/
   public void setFromPrvFound(char[] value) {
       value = checkFromPrvFoundConstraints(value);
       arraycopy(value,0,fromPrvFound,0,value.length);
   } 
	public void setFromPrvFound(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fromPrvFound,0,beginIndex + endIndex);
   }
	char[] fromPrvFound188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFromPrvFound1()
	 *	@return  Returns true if isFromPrvFound1() is "Y"
	 */
   public boolean isFromPrvFound1() throws CFException {
      return (  compareChars( getFromPrvFound() , fromPrvFound188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFromPrvFound1True() {  			
    	setFromPrvFound( fromPrvFound188Value);
   	}
	/**
	 *	Returns the value of fromIcd9Found
	 *	@return fromIcd9Found
	 */
   public char[] getFromIcd9Found() throws CFException{
   		return fromIcd9Found;
   }

  
	/**
	*  set variable fromIcd9Found
	*  Corresponding COBOL Variable is WS-FROM-ICD9-FOUND
	*  @param value
	**/
   public void setFromIcd9Found(char[] value) {
       value = checkFromIcd9FoundConstraints(value);
       arraycopy(value,0,fromIcd9Found,0,value.length);
   } 
	public void setFromIcd9Found(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fromIcd9Found,0,beginIndex + endIndex);
   }
	char[] fromIcd9Found188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFromIcd9Found1()
	 *	@return  Returns true if isFromIcd9Found1() is "Y"
	 */
   public boolean isFromIcd9Found1() throws CFException {
      return (  compareChars( getFromIcd9Found() , fromIcd9Found188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFromIcd9Found1True() {  			
    	setFromIcd9Found( fromIcd9Found188Value);
   	}
	/**
	 *	Returns the value of fromCauseFound
	 *	@return fromCauseFound
	 */
   public char[] getFromCauseFound() throws CFException{
   		return fromCauseFound;
   }

  
	/**
	*  set variable fromCauseFound
	*  Corresponding COBOL Variable is WS-FROM-CAUSE-FOUND
	*  @param value
	**/
   public void setFromCauseFound(char[] value) {
       value = checkFromCauseFoundConstraints(value);
       arraycopy(value,0,fromCauseFound,0,value.length);
   } 
	public void setFromCauseFound(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fromCauseFound,0,beginIndex + endIndex);
   }
	char[] fromCauseFound188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFromCauseFound1()
	 *	@return  Returns true if isFromCauseFound1() is "Y"
	 */
   public boolean isFromCauseFound1() throws CFException {
      return (  compareChars( getFromCauseFound() , fromCauseFound188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFromCauseFound1True() {  			
    	setFromCauseFound( fromCauseFound188Value);
   	}
	/**
	 *	Returns the value of useDiagnosisSw
	 *	@return useDiagnosisSw
	 */
   public char[] getUseDiagnosisSw() throws CFException{
   		return useDiagnosisSw;
   }

  
	/**
	*  set variable useDiagnosisSw
	*  Corresponding COBOL Variable is USE-DIAGNOSIS-SW
	*  @param value
	**/
   public void setUseDiagnosisSw(char[] value) {
       value = checkUseDiagnosisSwConstraints(value);
       arraycopy(value,0,useDiagnosisSw,0,value.length);
   } 
	public void setUseDiagnosisSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,useDiagnosisSw,0,beginIndex + endIndex);
   }
	char[] useDiagnosis88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isUseDiagnosis()
	 *	@return  Returns true if isUseDiagnosis() is "Y"
	 */
   public boolean isUseDiagnosis() throws CFException {
      return (  compareChars( getUseDiagnosisSw() , useDiagnosis88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setUseDiagnosisTrue() {  			
    	setUseDiagnosisSw( useDiagnosis88Value);
   	}
	/**
	 *	Returns the value of ipaCodeFound
	 *	@return ipaCodeFound
	 */
   public char[] getIpaCodeFound() throws CFException{
   		return ipaCodeFound;
   }

  
	/**
	*  set variable ipaCodeFound
	*  Corresponding COBOL Variable is WS-IPA-CODE-FOUND
	*  @param value
	**/
   public void setIpaCodeFound(char[] value) {
       value = checkIpaCodeFoundConstraints(value);
       arraycopy(value,0,ipaCodeFound,0,value.length);
   } 
	public void setIpaCodeFound(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ipaCodeFound,0,beginIndex + endIndex);
   }
	char[] ipaCodeFound188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIpaCodeFound1()
	 *	@return  Returns true if isIpaCodeFound1() is "Y"
	 */
   public boolean isIpaCodeFound1() throws CFException {
      return (  compareChars( getIpaCodeFound() , ipaCodeFound188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIpaCodeFound1True() {  			
    	setIpaCodeFound( ipaCodeFound188Value);
   	}
	/**
	 *	Returns the value of cpeFlgFound
	 *	@return cpeFlgFound
	 */
   public char[] getCpeFlgFound() throws CFException{
   		return cpeFlgFound;
   }

  
	/**
	*  set variable cpeFlgFound
	*  Corresponding COBOL Variable is WS-CPE-FLG-FOUND
	*  @param value
	**/
   public void setCpeFlgFound(char[] value) {
       value = checkCpeFlgFoundConstraints(value);
       arraycopy(value,0,cpeFlgFound,0,value.length);
   } 
	public void setCpeFlgFound(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cpeFlgFound,0,beginIndex + endIndex);
   }
	char[] cpeFlgFound188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isCpeFlgFound1()
	 *	@return  Returns true if isCpeFlgFound1() is "Y"
	 */
   public boolean isCpeFlgFound1() throws CFException {
      return (  compareChars( getCpeFlgFound() , cpeFlgFound188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setCpeFlgFound1True() {  			
    	setCpeFlgFound( cpeFlgFound188Value);
   	}
	/**
	 *	Returns the value of ipaAndGtnFound
	 *	@return ipaAndGtnFound
	 */
   public char[] getIpaAndGtnFound() throws CFException{
   		return ipaAndGtnFound;
   }

  
	/**
	*  set variable ipaAndGtnFound
	*  Corresponding COBOL Variable is WS-IPA-AND-GTN-FOUND
	*  @param value
	**/
   public void setIpaAndGtnFound(char[] value) {
       value = checkIpaAndGtnFoundConstraints(value);
       arraycopy(value,0,ipaAndGtnFound,0,value.length);
   } 
	public void setIpaAndGtnFound(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ipaAndGtnFound,0,beginIndex + endIndex);
   }
	char[] ipaAndGtnFound188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIpaAndGtnFound1()
	 *	@return  Returns true if isIpaAndGtnFound1() is "Y"
	 */
   public boolean isIpaAndGtnFound1() throws CFException {
      return (  compareChars( getIpaAndGtnFound() , ipaAndGtnFound188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIpaAndGtnFound1True() {  			
    	setIpaAndGtnFound( ipaAndGtnFound188Value);
   	}
	/**
	 *	Returns the value of gtnLoaded
	 *	@return gtnLoaded
	 */
   public char[] getGtnLoaded() throws CFException{
   		return gtnLoaded;
   }

  
	/**
	*  set variable gtnLoaded
	*  Corresponding COBOL Variable is WS-GTN-LOADED
	*  @param value
	**/
   public void setGtnLoaded(char[] value) {
       value = checkGtnLoadedConstraints(value);
       arraycopy(value,0,gtnLoaded,0,value.length);
   } 
	public void setGtnLoaded(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,gtnLoaded,0,beginIndex + endIndex);
   }
	char[] gtnLoaded188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isGtnLoaded1()
	 *	@return  Returns true if isGtnLoaded1() is "Y"
	 */
   public boolean isGtnLoaded1() throws CFException {
      return (  compareChars( getGtnLoaded() , gtnLoaded188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setGtnLoaded1True() {  			
    	setGtnLoaded( gtnLoaded188Value);
   	}
	/**
	 *	Returns the value of sameTable
	 *	@return sameTable
	 */
   public char[] getSameTable() throws CFException{
   		return sameTable;
   }

  
	/**
	*  set variable sameTable
	*  Corresponding COBOL Variable is WS-SAME-TABLE
	*  @param value
	**/
   public void setSameTable(char[] value) {
       value = checkSameTableConstraints(value);
       arraycopy(value,0,sameTable,0,value.length);
   } 
	public void setSameTable(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sameTable,0,beginIndex + endIndex);
   }
	char[] sameTable188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSameTable1()
	 *	@return  Returns true if isSameTable1() is "Y"
	 */
   public boolean isSameTable1() throws CFException {
      return (  compareChars( getSameTable() , sameTable188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSameTable1True() {  			
    	setSameTable( sameTable188Value);
   	}
	/**
	 *	Returns the value of keyComplete
	 *	@return keyComplete
	 */
   public char[] getKeyComplete() throws CFException{
   		return keyComplete;
   }

  
	/**
	*  set variable keyComplete
	*  Corresponding COBOL Variable is WS-KEY-COMPLETE
	*  @param value
	**/
   public void setKeyComplete(char[] value) {
       value = checkKeyCompleteConstraints(value);
       arraycopy(value,0,keyComplete,0,value.length);
   } 
	public void setKeyComplete(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,keyComplete,0,beginIndex + endIndex);
   }
	char[] keyComplete188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isKeyComplete1()
	 *	@return  Returns true if isKeyComplete1() is "Y"
	 */
   public boolean isKeyComplete1() throws CFException {
      return (  compareChars( getKeyComplete() , keyComplete188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setKeyComplete1True() {  			
    	setKeyComplete( keyComplete188Value);
   	}
	/**
	 *	Returns the value of withMmiSw2010
	 *	@return withMmiSw2010
	 */
   public char[] getWithMmiSw2010() throws CFException{
   		return withMmiSw2010;
   }

  
	/**
	*  set variable withMmiSw2010
	*  Corresponding COBOL Variable is WS-2010-WITH-MMI-SW
	*  @param value
	**/
   public void setWithMmiSw2010(char[] value) {
       value = checkWithMmiSw2010Constraints(value);
       arraycopy(value,0,withMmiSw2010,0,value.length);
   } 
	public void setWithMmiSw2010(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,withMmiSw2010,0,beginIndex + endIndex);
   }
	char[] withMmiPol201088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isWithMmiPol2010()
	 *	@return  Returns true if isWithMmiPol2010() is "Y"
	 */
   public boolean isWithMmiPol2010() throws CFException {
      return (  compareChars( getWithMmiSw2010() , withMmiPol201088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setWithMmiPol2010True() {  			
    	setWithMmiSw2010( withMmiPol201088Value);
   	}
	/**
	 *	Returns the value of mmiFoundSw
	 *	@return mmiFoundSw
	 */
   public char[] getMmiFoundSw() throws CFException{
   		return mmiFoundSw;
   }

  
	/**
	*  set variable mmiFoundSw
	*  Corresponding COBOL Variable is WS-MMI-FOUND-SW
	*  @param value
	**/
   public void setMmiFoundSw(char[] value) {
       value = checkMmiFoundSwConstraints(value);
       arraycopy(value,0,mmiFoundSw,0,value.length);
   } 
	public void setMmiFoundSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mmiFoundSw,0,beginIndex + endIndex);
   }
	char[] mmiAltNotFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isMmiAltNotFound()
	 *	@return  Returns true if isMmiAltNotFound() is "Y"
	 */
   public boolean isMmiAltNotFound() throws CFException {
      return (  compareChars( getMmiFoundSw() , mmiAltNotFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setMmiAltNotFoundTrue() {  			
    	setMmiFoundSw( mmiAltNotFound88Value);
   	}
	/**
	 *	Returns the value of primDiagFound
	 *	@return primDiagFound
	 */
   public char[] getPrimDiagFound() throws CFException{
   		return primDiagFound;
   }

  
	/**
	*  set variable primDiagFound
	*  Corresponding COBOL Variable is WS-PRIM-DIAG-FOUND
	*  @param value
	**/
   public void setPrimDiagFound(char[] value) {
       value = checkPrimDiagFoundConstraints(value);
       arraycopy(value,0,primDiagFound,0,value.length);
   } 
	public void setPrimDiagFound(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,primDiagFound,0,beginIndex + endIndex);
   }
	char[] primDiagFound188Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isPrimDiagFound1()
	 *	@return  Returns true if isPrimDiagFound1() is "Y"
	 */
   public boolean isPrimDiagFound1() throws CFException {
      return (  compareChars( getPrimDiagFound() , primDiagFound188Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setPrimDiagFound1True() {  			
    	setPrimDiagFound( primDiagFound188Value);
   	}
	/**
	 *	Returns the value of d529351uDb2Dsm
	 *	@return d529351uDb2Dsm
	 */
   public char[] getD529351uDb2Dsm() throws CFException{
   		return d529351uDb2Dsm;
   }

  
	/**
	*  set variable d529351uDb2Dsm
	*  Corresponding COBOL Variable is WS-D529351U-DB2-DSM
	*  @param value
	**/
   public void setD529351uDb2Dsm(char[] value) {
       value = checkD529351uDb2DsmConstraints(value);
       arraycopy(value,0,d529351uDb2Dsm,0,value.length);
   } 
	public void setD529351uDb2Dsm(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,d529351uDb2Dsm,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of newSpiSw
	 *	@return newSpiSw
	 */
   public char[] getNewSpiSw() throws CFException{
   		return newSpiSw;
   }

  
	/**
	*  set variable newSpiSw
	*  Corresponding COBOL Variable is WS-NEW-SPI-SW
	*  @param value
	**/
   public void setNewSpiSw(char[] value) {
       value = checkNewSpiSwConstraints(value);
       arraycopy(value,0,newSpiSw,0,value.length);
   } 
	public void setNewSpiSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,newSpiSw,0,beginIndex + endIndex);
   }
	char[] feSpiTurnedOn88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFeSpiTurnedOn()
	 *	@return  Returns true if isFeSpiTurnedOn() is "Y"
	 */
   public boolean isFeSpiTurnedOn() throws CFException {
      return (  compareChars( getNewSpiSw() , feSpiTurnedOn88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFeSpiTurnedOnTrue() {  			
    	setNewSpiSw( feSpiTurnedOn88Value);
   	}
	char[] feSpiTurnedOff88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isFeSpiTurnedOff()
	 *	@return  Returns true if isFeSpiTurnedOff() is "N"
	 */
   public boolean isFeSpiTurnedOff() throws CFException {
      return (  compareChars( getNewSpiSw() , feSpiTurnedOff88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setFeSpiTurnedOffTrue() {  			
    	setNewSpiSw( feSpiTurnedOff88Value);
   	}
	/**
	 *	Returns the value of primeSpiSw
	 *	@return primeSpiSw
	 */
   public char[] getPrimeSpiSw() throws CFException{
   		return primeSpiSw;
   }

  
	/**
	*  set variable primeSpiSw
	*  Corresponding COBOL Variable is WS-PRIME-SPI-SW
	*  @param value
	**/
   public void setPrimeSpiSw(char[] value) {
       value = checkPrimeSpiSwConstraints(value);
       arraycopy(value,0,primeSpiSw,0,value.length);
   } 
	public void setPrimeSpiSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,primeSpiSw,0,beginIndex + endIndex);
   }
	char[] fePrimeSpiTurnedOn88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFePrimeSpiTurnedOn()
	 *	@return  Returns true if isFePrimeSpiTurnedOn() is "Y"
	 */
   public boolean isFePrimeSpiTurnedOn() throws CFException {
      return (  compareChars( getPrimeSpiSw() , fePrimeSpiTurnedOn88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFePrimeSpiTurnedOnTrue() {  			
    	setPrimeSpiSw( fePrimeSpiTurnedOn88Value);
   	}
	char[] fePrimeSpiTurnedOff88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isFePrimeSpiTurnedOff()
	 *	@return  Returns true if isFePrimeSpiTurnedOff() is "N"
	 */
   public boolean isFePrimeSpiTurnedOff() throws CFException {
      return (  compareChars( getPrimeSpiSw() , fePrimeSpiTurnedOff88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setFePrimeSpiTurnedOffTrue() {  			
    	setPrimeSpiSw( fePrimeSpiTurnedOff88Value);
   	}
	/**
	 *	Returns the value of medSvcNbr
	 *	@return medSvcNbr
	 */
	public short getMedSvcNbr() throws CFException {
   		return medSvcNbr;
	}
	
	/**
	 * 	Update MedSvcNbr with the passed value
	 *  Corresponding COBOL Variable is MED-SVC-NBR
	 *	@param number
	 */
	public void setMedSvcNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    medSvcNbr = checkMedSvcNbrMaxLimit(number); 
	}

	public void setMedSvcNbr(int number) {
	    number = checkMedSvcNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMedSvcNbr((short)number);
	}
	public void setMedSvcNbr(long number) {
	    number = checkMedSvcNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMedSvcNbr((short)number);
	}
	

	/**
	 *	Returns the value of medSvc
	 *	@return medSvc
	 */
   public char[] getMedSvc() throws CFException{
   		return medSvc;
   }

  
	/**
	*  set variable medSvc
	*  Corresponding COBOL Variable is MED-SVC
	*  @param value
	**/
   public void setMedSvc(char[] value) {
       value = checkMedSvcConstraints(value);
       arraycopy(value,0,medSvc,0,value.length);
   } 
	public void setMedSvc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,medSvc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of feSpiEnableInd
	 *	@return feSpiEnableInd
	 */
   public char[] getFeSpiEnableInd() throws CFException{
   		return feSpiEnableInd;
   }

  
	/**
	*  set variable feSpiEnableInd
	*  Corresponding COBOL Variable is FE-SPI-ENABLE-IND
	*  @param value
	**/
   public void setFeSpiEnableInd(char[] value) {
       value = checkFeSpiEnableIndConstraints(value);
       arraycopy(value,0,feSpiEnableInd,0,value.length);
   } 
	public void setFeSpiEnableInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,feSpiEnableInd,0,beginIndex + endIndex);
   }
	char[] feSpiEnabled88Value = "ON ".toCharArray();
	/**
	 *	Test condition "ON " for isFeSpiEnabled()
	 *	@return  Returns true if isFeSpiEnabled() is "ON "
	 */
   public boolean isFeSpiEnabled() throws CFException {
      return (  compareChars( getFeSpiEnableInd() , feSpiEnabled88Value)  == 0  );
   }


	/**
	*  set values "ON "
	*/
   	public void setFeSpiEnabledTrue() {  			
    	setFeSpiEnableInd( feSpiEnabled88Value);
   	}
	char[] feSpiDisabled88Value = "OFF".toCharArray();
	/**
	 *	Test condition "OFF" for isFeSpiDisabled()
	 *	@return  Returns true if isFeSpiDisabled() is "OFF"
	 */
   public boolean isFeSpiDisabled() throws CFException {
      return (  compareChars( getFeSpiEnableInd() , feSpiDisabled88Value)  == 0  );
   }


	/**
	*  set values "OFF"
	*/
   	public void setFeSpiDisabledTrue() {  			
    	setFeSpiEnableInd( feSpiDisabled88Value);
   	}
	/**
	 *	Returns the value of fePrimeSpiEnableInd
	 *	@return fePrimeSpiEnableInd
	 */
   public char[] getFePrimeSpiEnableInd() throws CFException{
   		return fePrimeSpiEnableInd;
   }

  
	/**
	*  set variable fePrimeSpiEnableInd
	*  Corresponding COBOL Variable is FE-PRIME-SPI-ENABLE-IND
	*  @param value
	**/
   public void setFePrimeSpiEnableInd(char[] value) {
       value = checkFePrimeSpiEnableIndConstraints(value);
       arraycopy(value,0,fePrimeSpiEnableInd,0,value.length);
   } 
	public void setFePrimeSpiEnableInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fePrimeSpiEnableInd,0,beginIndex + endIndex);
   }
	char[] fePrimeSpiEnabled88Value = "ON ".toCharArray();
	/**
	 *	Test condition "ON " for isFePrimeSpiEnabled()
	 *	@return  Returns true if isFePrimeSpiEnabled() is "ON "
	 */
   public boolean isFePrimeSpiEnabled() throws CFException {
      return (  compareChars( getFePrimeSpiEnableInd() , fePrimeSpiEnabled88Value)  == 0  );
   }


	/**
	*  set values "ON "
	*/
   	public void setFePrimeSpiEnabledTrue() {  			
    	setFePrimeSpiEnableInd( fePrimeSpiEnabled88Value);
   	}
	char[] fePrimeSpiDisabled88Value = "OFF".toCharArray();
	/**
	 *	Test condition "OFF" for isFePrimeSpiDisabled()
	 *	@return  Returns true if isFePrimeSpiDisabled() is "OFF"
	 */
   public boolean isFePrimeSpiDisabled() throws CFException {
      return (  compareChars( getFePrimeSpiEnableInd() , fePrimeSpiDisabled88Value)  == 0  );
   }


	/**
	*  set values "OFF"
	*/
   	public void setFePrimeSpiDisabledTrue() {  			
    	setFePrimeSpiEnableInd( fePrimeSpiDisabled88Value);
   	}
	/**
	 *	Returns the value of keySub
	 *	@return keySub
	 */
	public int getKeySub() throws CFException {
   		return keySub;
	}
	
	/**
	 * 	Update KeySub with the passed value
	 *  Corresponding COBOL Variable is KEY-SUB
	 *	@param number
	 */
	public void setKeySub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    keySub = checkKeySubMaxLimit(number); 
	}


	public void setKeySub(long number) {
	    number = checkKeySubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setKeySub((int)number);
	}
	
	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {
   		return sub;
	}
	
	/**
	 * 	Update Sub with the passed value
	 *  Corresponding COBOL Variable is WS-SUB
	 *	@param number
	 */
	public void setSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sub = checkSubMaxLimit(number); 
	}


	public void setSub(long number) {
	    number = checkSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSub((int)number);
	}
	
	/**
	 *	Returns the value of posSub
	 *	@return posSub
	 */
	public int getPosSub() throws CFException {
   		return posSub;
	}
	
	/**
	 * 	Update PosSub with the passed value
	 *  Corresponding COBOL Variable is WS-POS-SUB
	 *	@param number
	 */
	public void setPosSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    posSub = checkPosSubMaxLimit(number); 
	}


	public void setPosSub(long number) {
	    number = checkPosSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPosSub((int)number);
	}
	
	/**
	 *	Returns the value of genSub
	 *	@return genSub
	 */
	public int getGenSub() throws CFException {
   		return genSub;
	}
	
	/**
	 * 	Update GenSub with the passed value
	 *  Corresponding COBOL Variable is WS-GEN-SUB
	 *	@param number
	 */
	public void setGenSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    genSub = checkGenSubMaxLimit(number); 
	}


	public void setGenSub(long number) {
	    number = checkGenSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGenSub((int)number);
	}
	
	/**
	 *	Returns the value of newSub
	 *	@return newSub
	 */
	public int getNewSub() throws CFException {
   		return newSub;
	}
	
	/**
	 * 	Update NewSub with the passed value
	 *  Corresponding COBOL Variable is WS-NEW-SUB
	 *	@param number
	 */
	public void setNewSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    newSub = checkNewSubMaxLimit(number); 
	}


	public void setNewSub(long number) {
	    number = checkNewSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNewSub((int)number);
	}
	
	/**
	 *	Returns the value of psSub
	 *	@return psSub
	 */
	public int getPsSub() throws CFException {
   		return psSub;
	}
	
	/**
	 * 	Update PsSub with the passed value
	 *  Corresponding COBOL Variable is PS-SUB
	 *	@param number
	 */
	public void setPsSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    psSub = checkPsSubMaxLimit(number); 
	}


	public void setPsSub(long number) {
	    number = checkPsSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPsSub((int)number);
	}
	
	/**
	 *	Returns the value of svcSub
	 *	@return svcSub
	 */
	public int getSvcSub() throws CFException {
   		return svcSub;
	}
	
	/**
	 * 	Update SvcSub with the passed value
	 *  Corresponding COBOL Variable is SVC-SUB
	 *	@param number
	 */
	public void setSvcSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    svcSub = checkSvcSubMaxLimit(number); 
	}


	public void setSvcSub(long number) {
	    number = checkSvcSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSvcSub((int)number);
	}
	
	/**
	 *	Returns the value of pvSub
	 *	@return pvSub
	 */
	public int getPvSub() throws CFException {
   		return pvSub;
	}
	
	/**
	 * 	Update PvSub with the passed value
	 *  Corresponding COBOL Variable is PV-SUB
	 *	@param number
	 */
	public void setPvSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    pvSub = checkPvSubMaxLimit(number); 
	}


	public void setPvSub(long number) {
	    number = checkPvSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPvSub((int)number);
	}
	
	/**
	 *	Returns the value of icd9Sub
	 *	@return icd9Sub
	 */
	public int getIcd9Sub() throws CFException {
   		return icd9Sub;
	}
	
	/**
	 * 	Update Icd9Sub with the passed value
	 *  Corresponding COBOL Variable is ICD9-SUB
	 *	@param number
	 */
	public void setIcd9Sub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    icd9Sub = checkIcd9SubMaxLimit(number); 
	}


	public void setIcd9Sub(long number) {
	    number = checkIcd9SubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIcd9Sub((int)number);
	}
	
	/**
	 *	Returns the value of causeSub
	 *	@return causeSub
	 */
	public int getCauseSub() throws CFException {
   		return causeSub;
	}
	
	/**
	 * 	Update CauseSub with the passed value
	 *  Corresponding COBOL Variable is CAUSE-SUB
	 *	@param number
	 */
	public void setCauseSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    causeSub = checkCauseSubMaxLimit(number); 
	}


	public void setCauseSub(long number) {
	    number = checkCauseSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCauseSub((int)number);
	}
	
	/**
	 *	Returns the value of ipaSub
	 *	@return ipaSub
	 */
	public int getIpaSub() throws CFException {
   		return ipaSub;
	}
	
	/**
	 * 	Update IpaSub with the passed value
	 *  Corresponding COBOL Variable is IPA-SUB
	 *	@param number
	 */
	public void setIpaSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ipaSub = checkIpaSubMaxLimit(number); 
	}


	public void setIpaSub(long number) {
	    number = checkIpaSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIpaSub((int)number);
	}
	
	/**
	 *	Returns the value of cflgSub
	 *	@return cflgSub
	 */
	public int getCflgSub() throws CFException {
   		return cflgSub;
	}
	
	/**
	 * 	Update CflgSub with the passed value
	 *  Corresponding COBOL Variable is CFLG-SUB
	 *	@param number
	 */
	public void setCflgSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cflgSub = checkCflgSubMaxLimit(number); 
	}


	public void setCflgSub(long number) {
	    number = checkCflgSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCflgSub((int)number);
	}
	
	/**
	 *	Returns the value of sub01
	 *	@return sub01
	 */
	public int getSub01() throws CFException {
   		return sub01;
	}
	
	/**
	 * 	Update Sub01 with the passed value
	 *  Corresponding COBOL Variable is LK-SUB
	 *	@param number
	 */
	public void setSub01(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sub01 = checkSub01MaxLimit(number); 
	}


	public void setSub01(long number) {
	    number = checkSub01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSub01((int)number);
	}
	
	/**
	 *	Returns the value of diagSub
	 *	@return diagSub
	 */
	public int getDiagSub() throws CFException {
   		return diagSub;
	}
	
	/**
	 * 	Update DiagSub with the passed value
	 *  Corresponding COBOL Variable is WS-DIAG-SUB
	 *	@param number
	 */
	public void setDiagSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    diagSub = checkDiagSubMaxLimit(number); 
	}


	public void setDiagSub(long number) {
	    number = checkDiagSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDiagSub((int)number);
	}
	
	/**
	 *	Returns the value of s1
	 *	@return s1
	 */
	public int getS1() throws CFException {
   		return s1;
	}
	
	/**
	 * 	Update S1 with the passed value
	 *  Corresponding COBOL Variable is S1
	 *	@param number
	 */
	public void setS1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    s1 = checkS1MaxLimit(number); 
	}


	public void setS1(long number) {
	    number = checkS1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setS1((int)number);
	}
	
	/**
	 *	Returns the value of dSub
	 *	@return dSub
	 */
	public int getDSub() throws CFException {
   		return dSub;
	}
	
	/**
	 * 	Update DSub with the passed value
	 *  Corresponding COBOL Variable is D-SUB
	 *	@param number
	 */
	public void setDSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dSub = checkDSubMaxLimit(number); 
	}


	public void setDSub(long number) {
	    number = checkDSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDSub((int)number);
	}
	
	/**
	 *	Returns the value of iSub
	 *	@return iSub
	 */
	public int getISub() throws CFException {
   		return iSub;
	}
	
	/**
	 * 	Update ISub with the passed value
	 *  Corresponding COBOL Variable is I-SUB
	 *	@param number
	 */
	public void setISub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    iSub = checkISubMaxLimit(number); 
	}


	public void setISub(long number) {
	    number = checkISubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setISub((int)number);
	}
	
	/**
	 *	Returns the value of s2
	 *	@return s2
	 */
	public int getS2() throws CFException {
   		return s2;
	}
	
	/**
	 * 	Update S2 with the passed value
	 *  Corresponding COBOL Variable is S2
	 *	@param number
	 */
	public void setS2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    s2 = checkS2MaxLimit(number); 
	}


	public void setS2(long number) {
	    number = checkS2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setS2((int)number);
	}
	
	/**
	 *	Returns the value of savHpriceCount
	 *	@return savHpriceCount
	 */
	public short getSavHpriceCount() throws CFException {
   		return savHpriceCount;
	}
	
	/**
	 * 	Update SavHpriceCount with the passed value
	 *  Corresponding COBOL Variable is SAV-HPRICE-COUNT
	 *	@param number
	 */
	public void setSavHpriceCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    savHpriceCount = checkSavHpriceCountMaxLimit(number); 
	}

	public void setSavHpriceCount(int number) {
	    number = checkSavHpriceCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavHpriceCount((short)number);
	}
	public void setSavHpriceCount(long number) {
	    number = checkSavHpriceCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavHpriceCount((short)number);
	}
	

	/**
	 *	Returns the value of savNbrOfOccurances2
	 *	@return savNbrOfOccurances2
	 */
	public short getSavNbrOfOccurances2() throws CFException {
   		return savNbrOfOccurances2;
	}
	
	/**
	 * 	Update SavNbrOfOccurances2 with the passed value
	 *  Corresponding COBOL Variable is SAV-NBR-OF-OCCURANCES-2
	 *	@param number
	 */
	public void setSavNbrOfOccurances2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    savNbrOfOccurances2 = checkSavNbrOfOccurances2MaxLimit(number); 
	}

	public void setSavNbrOfOccurances2(int number) {
	    number = checkSavNbrOfOccurances2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrOfOccurances2((short)number);
	}
	public void setSavNbrOfOccurances2(long number) {
	    number = checkSavNbrOfOccurances2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrOfOccurances2((short)number);
	}
	

    /**
	 *	Returns the value of savHcdsChargeInfo
	 *  Corresponding COBOL Variable is SAV-HCDS-CHARGE-INFO
	 *	@return savHcdsChargeInfo
	 */
	public List<char[]> getSavHcdsChargeInfo() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < SAV_HCDS_CHARGE_INFO_SIZE;index++) {
        	list.add( getSavHcdsChargeInfo( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return savHcdsChargeInfo
	 */
	public char[] getSavHcdsChargeInfo(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSavHcdsChargeInfo(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SAV_HCDS_CHARGE_INFO_SIZE) {
             	index = SAV_HCDS_CHARGE_INFO_SIZE -1; // can't exceed max array size
             	logger.trace("savHcdsChargeInfo - Array index exceeded max Size {}, resetting it to max allowed",SAV_HCDS_CHARGE_INFO_SIZE); 
	    }
   	      return getCharArray( (beginSavHcdsChargeInfo + index*SAV_HCDS_CHARGE_INFO_LEN) , SAV_HCDS_CHARGE_INFO_LEN );
    }
    
    
   public int  savHcdsChargeInfoFieldLength() {
   	return SAV_HCDS_CHARGE_INFO_LEN;
   }
   
	

  
  	/**
	 *	Update SavHcdsChargeInfo with the passed value at a given index
	 *  Corresponding COBOL Variable is SAV-HCDS-CHARGE-INFO
	 *  @param index
	 *	@param value
	 */
  public void setSavHcdsChargeInfo(int index,char[] value) {
   	setSavHcdsChargeInfo(index,value,true);
   }
   
   
   /**
	 *	Update SavHcdsChargeInfo with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setSavHcdsChargeInfo(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSavHcdsChargeInfo(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 215)  {     
		       value = substring(value,0,215);
           }  else if (value.length < 215) {
		       value = pad(215, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(215).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeSavHcdsChargeInfo(index,value);		
       }
   }
   
	/**
	 *	Returns the value of savMpriceCount
	 *	@return savMpriceCount
	 */
	public short getSavMpriceCount() throws CFException {
   		return savMpriceCount;
	}
	
	/**
	 * 	Update SavMpriceCount with the passed value
	 *  Corresponding COBOL Variable is SAV-MPRICE-COUNT
	 *	@param number
	 */
	public void setSavMpriceCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    savMpriceCount = checkSavMpriceCountMaxLimit(number); 
	}

	public void setSavMpriceCount(int number) {
	    number = checkSavMpriceCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavMpriceCount((short)number);
	}
	public void setSavMpriceCount(long number) {
	    number = checkSavMpriceCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavMpriceCount((short)number);
	}
	

	/**
	 *	Returns the value of savNbrOfOccurances3
	 *	@return savNbrOfOccurances3
	 */
	public short getSavNbrOfOccurances3() throws CFException {
   		return savNbrOfOccurances3;
	}
	
	/**
	 * 	Update SavNbrOfOccurances3 with the passed value
	 *  Corresponding COBOL Variable is SAV-NBR-OF-OCCURANCES-3
	 *	@param number
	 */
	public void setSavNbrOfOccurances3(short number) {
	     // Truncate if the number is beyond +/- Max range
	    savNbrOfOccurances3 = checkSavNbrOfOccurances3MaxLimit(number); 
	}

	public void setSavNbrOfOccurances3(int number) {
	    number = checkSavNbrOfOccurances3MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrOfOccurances3((short)number);
	}
	public void setSavNbrOfOccurances3(long number) {
	    number = checkSavNbrOfOccurances3MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrOfOccurances3((short)number);
	}
	

	public int getSazgrpNumGrp() throws CFException {
        if (isSazgrpNumGrpModified()) { 
           sazgrpNumGrp = refreshSazgrpNumGrp();
        }
   		return sazgrpNumGrp;
	}
	
	/**
	 * 	Update SazgrpNumGrp with the passed value
	 *  Corresponding COBOL Variable is SAZGRP-NUM-GRP
	 *	@param number
	 */
	public void setSazgrpNumGrp(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			sazgrpNumGrp = checkSazgrpNumGrpMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSazgrpNumGrp(sazgrpNumGrp);
	}


	public void setSazgrpNumGrp(long number) {
	    number = checkSazgrpNumGrpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSazgrpNumGrp((int)number);
	}
	
    /**
	 *	Returns the value of sazgrpGroups
	 *  Corresponding COBOL Variable is SAZGRP-GROUPS
	 *	@return sazgrpGroups
	 */
	public List<char[]> getSazgrpGroups() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < SAZGRP_GROUPS_SIZE;index++) {
        	list.add( getSazgrpGroups( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return sazgrpGroups
	 */
	public char[] getSazgrpGroups(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSazgrpGroups(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SAZGRP_GROUPS_SIZE) {
             	index = SAZGRP_GROUPS_SIZE -1; // can't exceed max array size
             	logger.trace("sazgrpGroups - Array index exceeded max Size {}, resetting it to max allowed",SAZGRP_GROUPS_SIZE); 
	    }
   	      return getCharArray( (beginSazgrpGroups + index*SAZGRP_GROUPS_LEN) , SAZGRP_GROUPS_LEN );
    }
    
    
   public int  sazgrpGroupsFieldLength() {
   	return SAZGRP_GROUPS_LEN;
   }
   
	

  
  	/**
	 *	Update SazgrpGroups with the passed value at a given index
	 *  Corresponding COBOL Variable is SAZGRP-GROUPS
	 *  @param index
	 *	@param value
	 */
  public void setSazgrpGroups(int index,char[] value) {
   	setSazgrpGroups(index,value,true);
   }
   
   
   /**
	 *	Update SazgrpGroups with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setSazgrpGroups(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSazgrpGroups(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 200)  {     
		       value = substring(value,0,200);
           }  else if (value.length < 200) {
		       value = pad(200, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(200).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeSazgrpGroups(index,value);		
       }
   }
   
	/**
	 *	Returns the value of functionFlag
	 *	@return functionFlag
	 */
   public char[] getFunctionFlag() throws CFException{
   		return functionFlag;
   }

  
	/**
	*  set variable functionFlag
	*  Corresponding COBOL Variable is LK-FUNCTION-FLAG
	*  @param value
	**/
   public void setFunctionFlag(char[] value) {
       value = checkFunctionFlagConstraints(value);
       arraycopy(value,0,functionFlag,0,value.length);
   } 
	public void setFunctionFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,functionFlag,0,beginIndex + endIndex);
   }
	char[] batchProcessing88Value = "BP".toCharArray();
	/**
	 *	Test condition "BP" for isBatchProcessing()
	 *	@return  Returns true if isBatchProcessing() is "BP"
	 */
   public boolean isBatchProcessing() throws CFException {
      return (  compareChars( getFunctionFlag() , batchProcessing88Value)  == 0  );
   }


	/**
	*  set values "BP"
	*/
   	public void setBatchProcessingTrue() {  			
    	setFunctionFlag( batchProcessing88Value);
   	}
	char[] rtaProcessing88Value = "RP".toCharArray();
	/**
	 *	Test condition "RP" for isRtaProcessing()
	 *	@return  Returns true if isRtaProcessing() is "RP"
	 */
   public boolean isRtaProcessing() throws CFException {
      return (  compareChars( getFunctionFlag() , rtaProcessing88Value)  == 0  );
   }


	/**
	*  set values "RP"
	*/
   	public void setRtaProcessingTrue() {  			
    	setFunctionFlag( rtaProcessing88Value);
   	}
	/**
	 *	Returns the value of illogicalCond
	 *	@return illogicalCond
	 */
   public char[] getIllogicalCond() throws CFException{
   		return illogicalCond;
   }

  
	/**
	*  set variable illogicalCond
	*  Corresponding COBOL Variable is LK-ILLOGICAL-COND
	*  @param value
	**/
   public void setIllogicalCond(char[] value) {
       value = checkIllogicalCondConstraints(value);
       arraycopy(value,0,illogicalCond,0,value.length);
   } 
	public void setIllogicalCond(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,illogicalCond,0,beginIndex + endIndex);
   }
	char[] illogicalCond188Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIllogicalCond1()
	 *	@return  Returns true if isIllogicalCond1() is "I"
	 */
   public boolean isIllogicalCond1() throws CFException {
      return (  compareChars( getIllogicalCond() , illogicalCond188Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIllogicalCond1True() {  			
    	setIllogicalCond( illogicalCond188Value);
   	}
	/**
	 *	Returns the value of dfhb0020
	 *	@return dfhb0020
	 */
	public int getDfhb0020() throws CFException {
   		return dfhb0020;
	}
	
	/**
	 * 	Update Dfhb0020 with the passed value
	 *  Corresponding COBOL Variable is DFHB0020
	 *	@param number
	 */
	public void setDfhb0020(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dfhb0020 = checkDfhb0020MaxLimit(number); 
	}


	public void setDfhb0020(long number) {
	    number = checkDfhb0020MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDfhb0020((int)number);
	}
	
	/**
	 *	Returns the value of dfhb0021
	 *	@return dfhb0021
	 */
	public int getDfhb0021() throws CFException {
   		return dfhb0021;
	}
	
	/**
	 * 	Update Dfhb0021 with the passed value
	 *  Corresponding COBOL Variable is DFHB0021
	 *	@param number
	 */
	public void setDfhb0021(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dfhb0021 = checkDfhb0021MaxLimit(number); 
	}


	public void setDfhb0021(long number) {
	    number = checkDfhb0021MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDfhb0021((int)number);
	}
	
	/**
	 *	Returns the value of dfhc0040
	 *	@return dfhc0040
	 */
   public char[] getDfhc0040() throws CFException{
   		return dfhc0040;
   }

  
	/**
	*  set variable dfhc0040
	*  Corresponding COBOL Variable is DFHC0040
	*  @param value
	**/
   public void setDfhc0040(char[] value) {
       value = checkDfhc0040Constraints(value);
       arraycopy(value,0,dfhc0040,0,value.length);
   } 
	public void setDfhc0040(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dfhc0040,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dfheiv0
	 *	@return dfheiv0
	 */
   public char[] getDfheiv0() throws CFException{
   		return dfheiv0;
   }

  
	/**
	*  set variable dfheiv0
	*  Corresponding COBOL Variable is DFHEIV0
	*  @param value
	**/
   public void setDfheiv0(char[] value) {
       value = checkDfheiv0Constraints(value);
       arraycopy(value,0,dfheiv0,0,value.length);
   } 
	public void setDfheiv0(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dfheiv0,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lsEqiRecord
	 *	@return lsEqiRecord
	 */
   public char[] getLsEqiRecord() throws CFException{
   		return lsEqiRecord;
   }

  
	/**
	*  set variable lsEqiRecord
	*  Corresponding COBOL Variable is LS-EQI-RECORD
	*  @param value
	**/
   public void setLsEqiRecord(char[] value) {
       value = checkLsEqiRecordConstraints(value);
       arraycopy(value,0,lsEqiRecord,0,value.length);
   } 
	public void setLsEqiRecord(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lsEqiRecord,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
