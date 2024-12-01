package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Fc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Fc extends FcSerialized { 
   

						private char[] conditionTokenValue = Field.fillLowValue(8);
	
	/**
	* Constructor for Fc
	**/
    public Fc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Fc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Fc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of conditionTokenValue
	 *	@return conditionTokenValue
	 */
   public char[] getConditionTokenValue() throws CFException{
     if (isConditionTokenValueModified()) { 
        conditionTokenValue = refreshConditionTokenValue();
     }
   		return conditionTokenValue;
   }

  
	/**
	*  set variable conditionTokenValue
	*  Corresponding COBOL Variable is CONDITION-TOKEN-VALUE
	*  @param value
	**/
   public void setConditionTokenValue(char[] value) {
      conditionTokenValue = checkConditionTokenValueConstraints(value);
      serializeConditionTokenValue(conditionTokenValue);
   } 

     /**
	 * 	Update ConditionTokenValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setConditionTokenValue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginConditionTokenValue,conditionTokenValue.length);
   	
   }
   
   public void setConditionTokenValue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginConditionTokenValue,conditionTokenValue.length);
   	
   }
   
     /**
	 * 	Update ConditionTokenValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setConditionTokenValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConditionTokenValue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ConditionTokenValue with another Field
	 *	@param value
	 */
   public void setConditionTokenValue(Field source) {
       replace(source,0,source.length(),beginConditionTokenValue,CONDITION_TOKEN_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update ConditionTokenValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setConditionTokenValue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginConditionTokenValue,CONDITION_TOKEN_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update ConditionTokenValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setConditionTokenValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginConditionTokenValue+targetIndex,targetLen);
    
   }
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00} for isCee000()
	 *	@return  Returns true if isCee000() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00}
	 */
   public boolean isCee000() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00}
	*/
   	public void setCee000True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x01,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee001()
	 *	@return  Returns true if isCee001() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x01,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee001() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x01,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x01,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee001True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x01,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x02,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee002()
	 *	@return  Returns true if isCee002() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x02,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee002() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x02,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x02,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee002True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x02,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x03,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee003()
	 *	@return  Returns true if isCee003() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x03,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee003() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x03,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x03,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee003True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x03,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x04,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee004()
	 *	@return  Returns true if isCee004() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x04,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee004() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x04,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x04,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee004True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x04,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x05,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee005()
	 *	@return  Returns true if isCee005() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x05,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee005() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x05,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x05,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee005True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x05,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x06,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee006()
	 *	@return  Returns true if isCee006() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x06,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee006() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x06,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x06,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee006True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x06,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x07,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee007()
	 *	@return  Returns true if isCee007() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x07,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee007() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x07,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x07,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee007True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x07,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x08,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee008()
	 *	@return  Returns true if isCee008() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x08,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee008() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x08,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x08,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee008True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x08,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x09,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee009()
	 *	@return  Returns true if isCee009() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x09,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee009() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x09,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x09,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee009True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x09,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00a()
	 *	@return  Returns true if isCee00a() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00a() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00aTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00b()
	 *	@return  Returns true if isCee00b() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00b() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00bTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00c()
	 *	@return  Returns true if isCee00c() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00c() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00cTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00d()
	 *	@return  Returns true if isCee00d() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00d() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00dTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00e()
	 *	@return  Returns true if isCee00e() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00e() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00eTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00f()
	 *	@return  Returns true if isCee00f() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00f() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00fTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x10,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00g()
	 *	@return  Returns true if isCee00g() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x10,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00g() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x10,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x10,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00gTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x10,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00h()
	 *	@return  Returns true if isCee00h() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00h() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00hTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00i()
	 *	@return  Returns true if isCee00i() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00i() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00iTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00j()
	 *	@return  Returns true if isCee00j() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00j() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00jTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00l()
	 *	@return  Returns true if isCee00l() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00l() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00lTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00m()
	 *	@return  Returns true if isCee00m() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00m() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00mTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00n()
	 *	@return  Returns true if isCee00n() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00n() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00nTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00o()
	 *	@return  Returns true if isCee00o() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00o() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00oTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00p()
	 *	@return  Returns true if isCee00p() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00p() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00pTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00q()
	 *	@return  Returns true if isCee00q() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00r()
	 *	@return  Returns true if isCee00r() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00r() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00rTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00s()
	 *	@return  Returns true if isCee00s() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00t()
	 *	@return  Returns true if isCee00t() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00u()
	 *	@return  Returns true if isCee00u() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee00v()
	 *	@return  Returns true if isCee00v() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee00v() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee00vTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee010()
	 *	@return  Returns true if isCee010() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee010() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee010True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee011()
	 *	@return  Returns true if isCee011() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee011() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee011True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee012()
	 *	@return  Returns true if isCee012() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee012() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee012True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee013()
	 *	@return  Returns true if isCee013() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee013() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee013True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee014()
	 *	@return  Returns true if isCee014() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee014() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee014True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee015()
	 *	@return  Returns true if isCee015() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee015() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee015True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee016()
	 *	@return  Returns true if isCee016() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee016() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee016True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee017()
	 *	@return  Returns true if isCee017() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee017() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee017True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee036()
	 *	@return  Returns true if isCee036() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee036() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee036True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee03e()
	 *	@return  Returns true if isCee03e() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee03e() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee03eTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee03f()
	 *	@return  Returns true if isCee03f() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee03f() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee03fTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee03g()
	 *	@return  Returns true if isCee03g() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee03g() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee03gTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee03h()
	 *	@return  Returns true if isCee03h() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee03h() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee03hTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee066()
	 *	@return  Returns true if isCee066() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee066() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee066True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee067()
	 *	@return  Returns true if isCee067() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee067() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee067True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee069()
	 *	@return  Returns true if isCee069() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee069() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee069True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x00,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee07q()
	 *	@return  Returns true if isCee07q() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee07q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee07qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee07s()
	 *	@return  Returns true if isCee07s() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee07s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee07sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee07t()
	 *	@return  Returns true if isCee07t() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee07t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee07tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee07u()
	 *	@return  Returns true if isCee07u() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee07u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee07uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x00,(byte)0xFE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee07v()
	 *	@return  Returns true if isCee07v() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee07v() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee07vTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x00,(byte)0xFF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x00,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee080()
	 *	@return  Returns true if isCee080() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x00,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee080() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x00,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x00,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee080True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x00,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x01,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee081()
	 *	@return  Returns true if isCee081() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x01,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee081() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x01,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x01,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee081True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x01,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee083()
	 *	@return  Returns true if isCee083() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee083() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee083True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee084()
	 *	@return  Returns true if isCee084() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee084() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee084True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x08,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee088()
	 *	@return  Returns true if isCee088() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x08,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee088() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x08,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x08,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee088True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x08,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x15,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee08l()
	 *	@return  Returns true if isCee08l() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x15,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee08l() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x15,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x15,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee08lTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x15,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x63,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0b3()
	 *	@return  Returns true if isCee0b3() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x63,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0b3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x63,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x63,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0b3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x63,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x64,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0b4()
	 *	@return  Returns true if isCee0b4() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x64,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0b4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x64,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x64,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0b4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x64,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x76,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0bm()
	 *	@return  Returns true if isCee0bm() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x76,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0bm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x76,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x76,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0bmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x01,(byte)0x76,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8E,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ce()
	 *	@return  Returns true if isCee0ce() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8E,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ce() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8E,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8E,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0ceTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8E,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0cf()
	 *	@return  Returns true if isCee0cf() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0cf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0cfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x8F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x01,(byte)0x90,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0cg()
	 *	@return  Returns true if isCee0cg() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x01,(byte)0x90,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0cg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x01,(byte)0x90,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x01,(byte)0x90,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0cgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x01,(byte)0x90,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ch()
	 *	@return  Returns true if isCee0ch() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ch() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0chTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ci()
	 *	@return  Returns true if isCee0ci() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ci() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0ciTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0cj()
	 *	@return  Returns true if isCee0cj() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0cj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0cjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x94,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ck()
	 *	@return  Returns true if isCee0ck() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x94,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ck() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x94,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x94,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0ckTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x94,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0e2()
	 *	@return  Returns true if isCee0e2() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0e2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0e2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0e3()
	 *	@return  Returns true if isCee0e3() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0e3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0e3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0e4()
	 *	@return  Returns true if isCee0e4() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0e4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0e4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0e6()
	 *	@return  Returns true if isCee0e6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0e6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0e6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0e7()
	 *	@return  Returns true if isCee0e7() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0e7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0e7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xC7,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0e9()
	 *	@return  Returns true if isCee0e9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0e9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0e9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ea()
	 *	@return  Returns true if isCee0ea() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ea() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0eaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0eb()
	 *	@return  Returns true if isCee0eb() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0eb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0ebTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xCC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ec()
	 *	@return  Returns true if isCee0ec() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xCC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ec() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xCC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xCC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0ecTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x01,(byte)0xCC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ed()
	 *	@return  Returns true if isCee0ed() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ed() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0edTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ee()
	 *	@return  Returns true if isCee0ee() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ee() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0eeTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ef()
	 *	@return  Returns true if isCee0ef() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ef() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0efTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0eg()
	 *	@return  Returns true if isCee0eg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0eg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0egTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0fm()
	 *	@return  Returns true if isCee0fm() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0fm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0fmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x01,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x02,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0h9()
	 *	@return  Returns true if isCee0h9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x02,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0h9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x02,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x02,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0h9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x02,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x02,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0ha()
	 *	@return  Returns true if isCee0ha() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x02,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0ha() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x02,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x02,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0haTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x02,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x03,(byte)0x22,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0p2()
	 *	@return  Returns true if isCee0p2() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x03,(byte)0x22,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0p2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x03,(byte)0x22,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x03,(byte)0x22,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0p2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x03,(byte)0x22,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0p3()
	 *	@return  Returns true if isCee0p3() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0p3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0p3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x24,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0p4()
	 *	@return  Returns true if isCee0p4() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x24,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0p4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x24,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x24,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0p4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x24,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0p5()
	 *	@return  Returns true if isCee0p5() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0p5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0p5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x26,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0p6()
	 *	@return  Returns true if isCee0p6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x26,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0p6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x26,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x26,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0p6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x26,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x27,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0p7()
	 *	@return  Returns true if isCee0p7() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x27,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0p7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x27,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x27,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0p7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x27,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x28,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0p8()
	 *	@return  Returns true if isCee0p8() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x28,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0p8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x28,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x28,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0p8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x28,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0p9()
	 *	@return  Returns true if isCee0p9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0p9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0p9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0pa()
	 *	@return  Returns true if isCee0pa() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0pa() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0paTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0pc()
	 *	@return  Returns true if isCee0pc() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0pc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0pcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0pd()
	 *	@return  Returns true if isCee0pd() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0pd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0pdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0pe()
	 *	@return  Returns true if isCee0pe() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0pe() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0peTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0x2E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0v8()
	 *	@return  Returns true if isCee0v8() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0v8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0v8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x03,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x03,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee0v9()
	 *	@return  Returns true if isCee0v9() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x03,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee0v9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x03,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x03,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee0v9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x03,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1uh()
	 *	@return  Returns true if isCee1uh() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1uh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1uhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1ui()
	 *	@return  Returns true if isCee1ui() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1ui() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1uiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1uj()
	 *	@return  Returns true if isCee1uj() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1uj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1ujTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1uk()
	 *	@return  Returns true if isCee1uk() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1uk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1ukTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1ul()
	 *	@return  Returns true if isCee1ul() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1ul() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1ulTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1um()
	 *	@return  Returns true if isCee1um() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1um() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1umTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1un()
	 *	@return  Returns true if isCee1un() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1un() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1unTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1uo()
	 *	@return  Returns true if isCee1uo() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1uo() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1uoTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1up()
	 *	@return  Returns true if isCee1up() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1up() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1upTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1uq()
	 *	@return  Returns true if isCee1uq() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1uq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1uqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1ur()
	 *	@return  Returns true if isCee1ur() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1ur() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1urTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1us()
	 *	@return  Returns true if isCee1us() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1us() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1usTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDD,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1ut()
	 *	@return  Returns true if isCee1ut() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDD,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1ut() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDD,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDD,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1utTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDD,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1uu()
	 *	@return  Returns true if isCee1uu() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1uu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1uuTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1uv()
	 *	@return  Returns true if isCee1uv() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1uv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1uvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1v0()
	 *	@return  Returns true if isCee1v0() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1v0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1v0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1v1()
	 *	@return  Returns true if isCee1v1() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1v1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1v1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1v2()
	 *	@return  Returns true if isCee1v2() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1v2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1v2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1v3()
	 *	@return  Returns true if isCee1v3() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1v3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1v3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1v4()
	 *	@return  Returns true if isCee1v4() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1v4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1v4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1v5()
	 *	@return  Returns true if isCee1v5() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1v5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1v5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1v6()
	 *	@return  Returns true if isCee1v6() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1v6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1v6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1v8()
	 *	@return  Returns true if isCee1v8() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1v8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1v8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xE8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x07,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1v9()
	 *	@return  Returns true if isCee1v9() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x07,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1v9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x07,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x07,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1v9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x07,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1vc()
	 *	@return  Returns true if isCee1vc() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1vc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1vcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xED,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1vd()
	 *	@return  Returns true if isCee1vd() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xED,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1vd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xED,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xED,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1vdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xED,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1ve()
	 *	@return  Returns true if isCee1ve() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1ve() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1veTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1vf()
	 *	@return  Returns true if isCee1vf() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1vf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1vfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xEF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1vo()
	 *	@return  Returns true if isCee1vo() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1vo() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1voTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1vp()
	 *	@return  Returns true if isCee1vp() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1vp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1vpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xF9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1vq()
	 *	@return  Returns true if isCee1vq() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1vq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1vqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee1vr()
	 *	@return  Returns true if isCee1vr() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee1vr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee1vrTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x07,(byte)0xFB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee202()
	 *	@return  Returns true if isCee202() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee202() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee202True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee203()
	 *	@return  Returns true if isCee203() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee203() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee203True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x03,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee204()
	 *	@return  Returns true if isCee204() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee204() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee204True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x04,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x05,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee205()
	 *	@return  Returns true if isCee205() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x05,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee205() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x05,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x05,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee205True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x08,(byte)0x05,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2e6()
	 *	@return  Returns true if isCee2e6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2e6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2e6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2e7()
	 *	@return  Returns true if isCee2e7() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2e7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2e7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2e9()
	 *	@return  Returns true if isCee2e9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2e9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2e9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xC9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ea()
	 *	@return  Returns true if isCee2ea() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ea() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2eaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2eb()
	 *	@return  Returns true if isCee2eb() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2eb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ebTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ec()
	 *	@return  Returns true if isCee2ec() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ec() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ecTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ed()
	 *	@return  Returns true if isCee2ed() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ed() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2edTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ee()
	 *	@return  Returns true if isCee2ee() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ee() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2eeTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ef()
	 *	@return  Returns true if isCee2ef() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ef() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2efTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2eg()
	 *	@return  Returns true if isCee2eg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2eg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2egTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2eh()
	 *	@return  Returns true if isCee2eh() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2eh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ehTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ei()
	 *	@return  Returns true if isCee2ei() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ei() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2eiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ej()
	 *	@return  Returns true if isCee2ej() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ej() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ejTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ek()
	 *	@return  Returns true if isCee2ek() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ek() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ekTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2el()
	 *	@return  Returns true if isCee2el() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2el() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2elTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2em()
	 *	@return  Returns true if isCee2em() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2em() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2emTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2en()
	 *	@return  Returns true if isCee2en() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2en() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2enTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2eo()
	 *	@return  Returns true if isCee2eo() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2eo() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2eoTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ep()
	 *	@return  Returns true if isCee2ep() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ep() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2epTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xD9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2eq()
	 *	@return  Returns true if isCee2eq() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2eq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2eqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xDB,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2er()
	 *	@return  Returns true if isCee2er() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xDB,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2er() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xDB,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xDB,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2erTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xDB,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2es()
	 *	@return  Returns true if isCee2es() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2es() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2esTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2et()
	 *	@return  Returns true if isCee2et() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2et() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2etTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2eu()
	 *	@return  Returns true if isCee2eu() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2eu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2euTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ev()
	 *	@return  Returns true if isCee2ev() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ev() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2evTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x09,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2f1()
	 *	@return  Returns true if isCee2f1() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2f1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2f1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2f2()
	 *	@return  Returns true if isCee2f2() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2f2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2f2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2f3()
	 *	@return  Returns true if isCee2f3() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2f3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2f3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2f5()
	 *	@return  Returns true if isCee2f5() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2f5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2f5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE6,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2f6()
	 *	@return  Returns true if isCee2f6() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE6,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2f6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE6,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE6,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2f6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE6,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2f7()
	 *	@return  Returns true if isCee2f7() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2f7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2f7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x09,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2f9()
	 *	@return  Returns true if isCee2f9() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2f9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2f9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x09,(byte)0xE9,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2h8()
	 *	@return  Returns true if isCee2h8() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2h8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2h8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2h9()
	 *	@return  Returns true if isCee2h9() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2h9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2h9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ha()
	 *	@return  Returns true if isCee2ha() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ha() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2haTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2hb()
	 *	@return  Returns true if isCee2hb() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2hb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2hbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2hc()
	 *	@return  Returns true if isCee2hc() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2hc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2hcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0A,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2he()
	 *	@return  Returns true if isCee2he() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2he() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2heTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2hf()
	 *	@return  Returns true if isCee2hf() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2hf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2hfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x2F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x30,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2hg()
	 *	@return  Returns true if isCee2hg() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x30,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2hg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x30,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x30,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2hgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0A,(byte)0x30,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2kd()
	 *	@return  Returns true if isCee2kd() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2kd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2kdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ke()
	 *	@return  Returns true if isCee2ke() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ke() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2keTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0A,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x0B,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2tn()
	 *	@return  Returns true if isCee2tn() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x0B,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2tn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0B,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x0B,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2tnTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0B,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2to()
	 *	@return  Returns true if isCee2to() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2to() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2toTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2tp()
	 *	@return  Returns true if isCee2tp() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2tp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2tpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xB9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2tq()
	 *	@return  Returns true if isCee2tq() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2tq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2tqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2tr()
	 *	@return  Returns true if isCee2tr() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2tr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2trTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ts()
	 *	@return  Returns true if isCee2ts() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ts() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2tsTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2tt()
	 *	@return  Returns true if isCee2tt() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2tt() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ttTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2tu()
	 *	@return  Returns true if isCee2tu() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2tu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2tuTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2tv()
	 *	@return  Returns true if isCee2tv() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2tv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2tvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xBF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u0()
	 *	@return  Returns true if isCee2u0() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u1()
	 *	@return  Returns true if isCee2u1() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u2()
	 *	@return  Returns true if isCee2u2() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u3()
	 *	@return  Returns true if isCee2u3() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u4()
	 *	@return  Returns true if isCee2u4() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u5()
	 *	@return  Returns true if isCee2u5() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u6()
	 *	@return  Returns true if isCee2u6() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u7()
	 *	@return  Returns true if isCee2u7() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u8()
	 *	@return  Returns true if isCee2u8() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2u9()
	 *	@return  Returns true if isCee2u9() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2u9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2u9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xC9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ua()
	 *	@return  Returns true if isCee2ua() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ua() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2uaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ub()
	 *	@return  Returns true if isCee2ub() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ub() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ubTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2uc()
	 *	@return  Returns true if isCee2uc() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2uc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ucTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ud()
	 *	@return  Returns true if isCee2ud() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ud() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2udTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ue()
	 *	@return  Returns true if isCee2ue() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ue() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ueTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2uf()
	 *	@return  Returns true if isCee2uf() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2uf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ufTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xCF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ug()
	 *	@return  Returns true if isCee2ug() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ug() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ugTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2uh()
	 *	@return  Returns true if isCee2uh() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2uh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2uhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ui()
	 *	@return  Returns true if isCee2ui() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ui() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2uiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2uj()
	 *	@return  Returns true if isCee2uj() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2uj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ujTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2uk()
	 *	@return  Returns true if isCee2uk() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2uk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ukTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ul()
	 *	@return  Returns true if isCee2ul() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ul() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2ulTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2um()
	 *	@return  Returns true if isCee2um() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2um() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2umTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2un()
	 *	@return  Returns true if isCee2un() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2un() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2unTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2uo()
	 *	@return  Returns true if isCee2uo() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2uo() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2uoTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2up()
	 *	@return  Returns true if isCee2up() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2up() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2upTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xD9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2uq()
	 *	@return  Returns true if isCee2uq() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2uq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2uqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ur()
	 *	@return  Returns true if isCee2ur() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ur() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2urTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2us()
	 *	@return  Returns true if isCee2us() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2us() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2usTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ut()
	 *	@return  Returns true if isCee2ut() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ut() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2utTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDD,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2uu()
	 *	@return  Returns true if isCee2uu() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2uu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2uuTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2uv()
	 *	@return  Returns true if isCee2uv() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2uv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2uvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xDF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v0()
	 *	@return  Returns true if isCee2v0() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v1()
	 *	@return  Returns true if isCee2v1() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v2()
	 *	@return  Returns true if isCee2v2() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v3()
	 *	@return  Returns true if isCee2v3() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v4()
	 *	@return  Returns true if isCee2v4() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v5()
	 *	@return  Returns true if isCee2v5() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v6()
	 *	@return  Returns true if isCee2v6() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v7()
	 *	@return  Returns true if isCee2v7() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v8()
	 *	@return  Returns true if isCee2v8() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2v9()
	 *	@return  Returns true if isCee2v9() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2v9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2v9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xE9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2va()
	 *	@return  Returns true if isCee2va() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2va() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vb()
	 *	@return  Returns true if isCee2vb() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vc()
	 *	@return  Returns true if isCee2vc() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vd()
	 *	@return  Returns true if isCee2vd() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2ve()
	 *	@return  Returns true if isCee2ve() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2ve() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2veTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vf()
	 *	@return  Returns true if isCee2vf() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vg()
	 *	@return  Returns true if isCee2vg() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vh()
	 *	@return  Returns true if isCee2vh() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vi()
	 *	@return  Returns true if isCee2vi() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vi() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2viTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vj()
	 *	@return  Returns true if isCee2vj() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vk()
	 *	@return  Returns true if isCee2vk() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vkTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vl()
	 *	@return  Returns true if isCee2vl() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vl() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vlTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vm()
	 *	@return  Returns true if isCee2vm() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vn()
	 *	@return  Returns true if isCee2vn() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vnTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vo()
	 *	@return  Returns true if isCee2vo() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vo() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2voTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vp()
	 *	@return  Returns true if isCee2vp() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee2vq()
	 *	@return  Returns true if isCee2vq() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee2vq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee2vqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0B,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee30q()
	 *	@return  Returns true if isCee30q() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee30q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee30qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee30t()
	 *	@return  Returns true if isCee30t() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee30t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee30tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee30u()
	 *	@return  Returns true if isCee30u() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee30u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee30uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee30v()
	 *	@return  Returns true if isCee30v() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee30v() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee30vTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee310()
	 *	@return  Returns true if isCee310() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee310() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee310True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x21,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee311()
	 *	@return  Returns true if isCee311() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x21,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee311() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x21,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x21,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee311True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x21,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee312()
	 *	@return  Returns true if isCee312() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee312() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee312True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x23,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee313()
	 *	@return  Returns true if isCee313() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x23,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee313() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x23,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x23,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee313True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x23,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x24,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee314()
	 *	@return  Returns true if isCee314() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x24,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee314() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x24,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x24,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee314True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x24,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee315()
	 *	@return  Returns true if isCee315() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee315() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee315True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31c()
	 *	@return  Returns true if isCee31c() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31c() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31cTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31d()
	 *	@return  Returns true if isCee31d() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31d() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31dTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31e()
	 *	@return  Returns true if isCee31e() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31e() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31eTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31g()
	 *	@return  Returns true if isCee31g() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31g() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31gTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x31,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31h()
	 *	@return  Returns true if isCee31h() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x31,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31h() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x31,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x31,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31hTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x31,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31i()
	 *	@return  Returns true if isCee31i() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31i() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31iTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31j()
	 *	@return  Returns true if isCee31j() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31j() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31jTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31k()
	 *	@return  Returns true if isCee31k() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31k() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31kTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31l()
	 *	@return  Returns true if isCee31l() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31l() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31lTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31m()
	 *	@return  Returns true if isCee31m() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31m() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31mTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31n()
	 *	@return  Returns true if isCee31n() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31n() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31nTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x38,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31o()
	 *	@return  Returns true if isCee31o() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x38,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31o() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x38,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x38,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31oTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x38,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31p()
	 *	@return  Returns true if isCee31p() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31p() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31pTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31q()
	 *	@return  Returns true if isCee31q() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31r()
	 *	@return  Returns true if isCee31r() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31r() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31rTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31s()
	 *	@return  Returns true if isCee31s() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31t()
	 *	@return  Returns true if isCee31t() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee31u()
	 *	@return  Returns true if isCee31u() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee31u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee31uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x40,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee320()
	 *	@return  Returns true if isCee320() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x40,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee320() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x40,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x40,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee320True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x40,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee321()
	 *	@return  Returns true if isCee321() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee321() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee321True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x41,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee322()
	 *	@return  Returns true if isCee322() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee322() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee322True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee323()
	 *	@return  Returns true if isCee323() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee323() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee323True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee324()
	 *	@return  Returns true if isCee324() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee324() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee324True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee325()
	 *	@return  Returns true if isCee325() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee325() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee325True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee326()
	 *	@return  Returns true if isCee326() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee326() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee326True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee327()
	 *	@return  Returns true if isCee327() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee327() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee327True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee328()
	 *	@return  Returns true if isCee328() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee328() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee328True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee329()
	 *	@return  Returns true if isCee329() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee329() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee329True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32a()
	 *	@return  Returns true if isCee32a() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32a() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32aTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32b()
	 *	@return  Returns true if isCee32b() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32b() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32bTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32c()
	 *	@return  Returns true if isCee32c() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32c() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32cTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32d()
	 *	@return  Returns true if isCee32d() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32d() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32dTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32e()
	 *	@return  Returns true if isCee32e() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32e() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32eTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32f()
	 *	@return  Returns true if isCee32f() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32f() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32fTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32g()
	 *	@return  Returns true if isCee32g() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32g() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32gTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32h()
	 *	@return  Returns true if isCee32h() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32h() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32hTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32i()
	 *	@return  Returns true if isCee32i() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32i() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32iTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32j()
	 *	@return  Returns true if isCee32j() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32j() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32jTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32k()
	 *	@return  Returns true if isCee32k() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32k() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32kTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32l()
	 *	@return  Returns true if isCee32l() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32l() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32lTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32m()
	 *	@return  Returns true if isCee32m() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32m() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32mTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32n()
	 *	@return  Returns true if isCee32n() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32n() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32nTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32o()
	 *	@return  Returns true if isCee32o() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32o() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32oTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32p()
	 *	@return  Returns true if isCee32p() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32p() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32pTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32q()
	 *	@return  Returns true if isCee32q() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32r()
	 *	@return  Returns true if isCee32r() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32r() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32rTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32s()
	 *	@return  Returns true if isCee32s() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32t()
	 *	@return  Returns true if isCee32t() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32u()
	 *	@return  Returns true if isCee32u() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee32v()
	 *	@return  Returns true if isCee32v() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee32v() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee32vTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee330()
	 *	@return  Returns true if isCee330() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee330() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee330True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee331()
	 *	@return  Returns true if isCee331() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee331() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee331True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee332()
	 *	@return  Returns true if isCee332() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee332() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee332True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee333()
	 *	@return  Returns true if isCee333() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee333() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee333True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee334()
	 *	@return  Returns true if isCee334() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee334() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee334True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee335()
	 *	@return  Returns true if isCee335() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee335() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee335True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee336()
	 *	@return  Returns true if isCee336() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee336() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee336True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee337()
	 *	@return  Returns true if isCee337() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee337() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee337True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee338()
	 *	@return  Returns true if isCee338() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee338() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee338True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee339()
	 *	@return  Returns true if isCee339() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee339() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee339True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33a()
	 *	@return  Returns true if isCee33a() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33a() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33aTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33b()
	 *	@return  Returns true if isCee33b() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33b() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33bTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33c()
	 *	@return  Returns true if isCee33c() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33c() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33cTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33d()
	 *	@return  Returns true if isCee33d() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33d() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33dTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33e()
	 *	@return  Returns true if isCee33e() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33e() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33eTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33f()
	 *	@return  Returns true if isCee33f() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33f() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33fTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33g()
	 *	@return  Returns true if isCee33g() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33g() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33gTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33h()
	 *	@return  Returns true if isCee33h() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33h() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33hTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x72,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33i()
	 *	@return  Returns true if isCee33i() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x72,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33i() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x72,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x72,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33iTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x72,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33j()
	 *	@return  Returns true if isCee33j() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33j() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33jTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33k()
	 *	@return  Returns true if isCee33k() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33k() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33kTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x75,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33l()
	 *	@return  Returns true if isCee33l() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x75,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33l() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x75,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x75,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33lTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x75,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x76,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33m()
	 *	@return  Returns true if isCee33m() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x76,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33m() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x76,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x76,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33mTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x76,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x77,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33n()
	 *	@return  Returns true if isCee33n() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x77,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33n() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x77,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x77,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33nTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x77,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0x78,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33o()
	 *	@return  Returns true if isCee33o() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0x78,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33o() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0x78,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0x78,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33oTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0x78,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33p()
	 *	@return  Returns true if isCee33p() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33p() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33pTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33q()
	 *	@return  Returns true if isCee33q() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7B,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33r()
	 *	@return  Returns true if isCee33r() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7B,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33r() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7B,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7B,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33rTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7B,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7C,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33s()
	 *	@return  Returns true if isCee33s() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7C,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7C,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7C,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7C,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33t()
	 *	@return  Returns true if isCee33t() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0x7D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33u()
	 *	@return  Returns true if isCee33u() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee33v()
	 *	@return  Returns true if isCee33v() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee33v() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee33vTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x7F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee341()
	 *	@return  Returns true if isCee341() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee341() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee341True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x82,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee342()
	 *	@return  Returns true if isCee342() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x82,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee342() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x82,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x82,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee342True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x82,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee343()
	 *	@return  Returns true if isCee343() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee343() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee343True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee344()
	 *	@return  Returns true if isCee344() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee344() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee344True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee345()
	 *	@return  Returns true if isCee345() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee345() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee345True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee346()
	 *	@return  Returns true if isCee346() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee346() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee346True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x87,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee347()
	 *	@return  Returns true if isCee347() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x87,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee347() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x87,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x87,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee347True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x87,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee348()
	 *	@return  Returns true if isCee348() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee348() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee348True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee349()
	 *	@return  Returns true if isCee349() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee349() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee349True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34a()
	 *	@return  Returns true if isCee34a() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34a() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34aTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34b()
	 *	@return  Returns true if isCee34b() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34b() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34bTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34c()
	 *	@return  Returns true if isCee34c() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34c() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34cTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34d()
	 *	@return  Returns true if isCee34d() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34d() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34dTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34e()
	 *	@return  Returns true if isCee34e() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34e() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34eTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34f()
	 *	@return  Returns true if isCee34f() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34f() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34fTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34g()
	 *	@return  Returns true if isCee34g() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34g() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34gTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34h()
	 *	@return  Returns true if isCee34h() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34h() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34hTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34i()
	 *	@return  Returns true if isCee34i() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34i() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34iTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34j()
	 *	@return  Returns true if isCee34j() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34j() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34jTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34k()
	 *	@return  Returns true if isCee34k() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34k() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34kTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x95,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34l()
	 *	@return  Returns true if isCee34l() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x95,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34l() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x95,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x95,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34lTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x95,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34m()
	 *	@return  Returns true if isCee34m() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34m() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34mTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34n()
	 *	@return  Returns true if isCee34n() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34n() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34nTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34o()
	 *	@return  Returns true if isCee34o() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34o() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34oTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34p()
	 *	@return  Returns true if isCee34p() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34p() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34pTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x9E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee34u()
	 *	@return  Returns true if isCee34u() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x9E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee34u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x9E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x9E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee34uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0x9E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35h()
	 *	@return  Returns true if isCee35h() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35h() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35hTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB2,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35i()
	 *	@return  Returns true if isCee35i() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB2,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35i() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB2,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB2,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35iTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB2,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35j()
	 *	@return  Returns true if isCee35j() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35j() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35jTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xB3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB5,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35l()
	 *	@return  Returns true if isCee35l() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB5,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35l() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB5,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB5,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35lTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB5,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB6,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35m()
	 *	@return  Returns true if isCee35m() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB6,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35m() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB6,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB6,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35mTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB6,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35n()
	 *	@return  Returns true if isCee35n() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35n() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35nTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xB7,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35s()
	 *	@return  Returns true if isCee35s() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35t()
	 *	@return  Returns true if isCee35t() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBD,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35u()
	 *	@return  Returns true if isCee35u() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xBE,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xBF,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee35v()
	 *	@return  Returns true if isCee35v() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xBF,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee35v() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xBF,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xBF,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee35vTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xBF,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee360()
	 *	@return  Returns true if isCee360() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee360() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee360True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0C,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xDC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee36s()
	 *	@return  Returns true if isCee36s() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xDC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee36s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xDC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xDC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee36sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0C,(byte)0xDC,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xDD,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee36t()
	 *	@return  Returns true if isCee36t() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xDD,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee36t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xDD,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xDD,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee36tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0C,(byte)0xDD,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee36u()
	 *	@return  Returns true if isCee36u() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee36u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee36uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee36v()
	 *	@return  Returns true if isCee36v() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee36v() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee36vTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xDF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee370()
	 *	@return  Returns true if isCee370() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee370() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee370True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE0,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee371()
	 *	@return  Returns true if isCee371() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee371() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee371True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee372()
	 *	@return  Returns true if isCee372() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee372() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee372True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE2,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee373()
	 *	@return  Returns true if isCee373() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee373() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee373True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE3,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee374()
	 *	@return  Returns true if isCee374() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee374() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee374True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE4,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee375()
	 *	@return  Returns true if isCee375() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee375() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee375True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0C,(byte)0xE5,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee376()
	 *	@return  Returns true if isCee376() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee376() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee376True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0C,(byte)0xE6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x16,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee38m()
	 *	@return  Returns true if isCee38m() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x16,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee38m() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x16,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x16,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee38mTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x16,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x17,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee38n()
	 *	@return  Returns true if isCee38n() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x17,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee38n() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x17,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x17,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee38nTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x17,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x18,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee38o()
	 *	@return  Returns true if isCee38o() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x18,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee38o() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x18,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x18,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee38oTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x18,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee38p()
	 *	@return  Returns true if isCee38p() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee38p() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee38pTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee38q()
	 *	@return  Returns true if isCee38q() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee38q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee38qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee38r()
	 *	@return  Returns true if isCee38r() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee38r() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee38rTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee38s()
	 *	@return  Returns true if isCee38s() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee38s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee38sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee38t()
	 *	@return  Returns true if isCee38t() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee38t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee38tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x1D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee38u()
	 *	@return  Returns true if isCee38u() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee38u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee38uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x1E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee390()
	 *	@return  Returns true if isCee390() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee390() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee390True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x21,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee391()
	 *	@return  Returns true if isCee391() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x21,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee391() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x21,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x21,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee391True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x21,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee392()
	 *	@return  Returns true if isCee392() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee392() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee392True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee393()
	 *	@return  Returns true if isCee393() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee393() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee393True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x24,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee394()
	 *	@return  Returns true if isCee394() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x24,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee394() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x24,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x24,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee394True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x24,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee395()
	 *	@return  Returns true if isCee395() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee395() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee395True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x25,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee39a()
	 *	@return  Returns true if isCee39a() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee39a() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee39aTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x2A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x34,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee39k()
	 *	@return  Returns true if isCee39k() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x34,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee39k() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x34,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x34,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee39kTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x34,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x48,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3a8()
	 *	@return  Returns true if isCee3a8() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x48,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3a8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x48,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x48,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3a8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x48,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x49,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3a9()
	 *	@return  Returns true if isCee3a9() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x49,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3a9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x49,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x49,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3a9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0x49,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x4A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3aa()
	 *	@return  Returns true if isCee3aa() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x4A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3aa() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x4A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x4A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3aaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x4A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x60,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3b0()
	 *	@return  Returns true if isCee3b0() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x60,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3b0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x60,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x60,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3b0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x60,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3b1()
	 *	@return  Returns true if isCee3b1() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3b1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3b1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3b2()
	 *	@return  Returns true if isCee3b2() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3b2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3b2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3b3()
	 *	@return  Returns true if isCee3b3() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3b3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3b3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3b4()
	 *	@return  Returns true if isCee3b4() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3b4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3b4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3b5()
	 *	@return  Returns true if isCee3b5() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3b5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3b5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x79,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3bp()
	 *	@return  Returns true if isCee3bp() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x79,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3bp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x79,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x79,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3bpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x79,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3bq()
	 *	@return  Returns true if isCee3bq() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3bq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3bqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3br()
	 *	@return  Returns true if isCee3br() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3br() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3brTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3bs()
	 *	@return  Returns true if isCee3bs() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3bs() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3bsTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3bu()
	 *	@return  Returns true if isCee3bu() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3bu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3buTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x7E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3bv()
	 *	@return  Returns true if isCee3bv() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3bv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3bvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x7F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x80,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3c0()
	 *	@return  Returns true if isCee3c0() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x80,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3c0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x80,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x80,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3c0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x80,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3c1()
	 *	@return  Returns true if isCee3c1() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3c1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3c1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x81,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3c3()
	 *	@return  Returns true if isCee3c3() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3c3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3c3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x83,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x84,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3c4()
	 *	@return  Returns true if isCee3c4() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x84,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3c4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x84,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x84,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3c4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x84,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x85,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3c5()
	 *	@return  Returns true if isCee3c5() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x85,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3c5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x85,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x85,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3c5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x85,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x86,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3c6()
	 *	@return  Returns true if isCee3c6() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x86,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3c6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x86,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x86,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3c6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x86,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x87,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3c7()
	 *	@return  Returns true if isCee3c7() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x87,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3c7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x87,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x87,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3c7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x87,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x88,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3c8()
	 *	@return  Returns true if isCee3c8() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x88,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3c8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x88,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x88,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3c8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x88,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x89,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3c9()
	 *	@return  Returns true if isCee3c9() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x89,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3c9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x89,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x89,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3c9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x89,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ca()
	 *	@return  Returns true if isCee3ca() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ca() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3caTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8A,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8B,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cb()
	 *	@return  Returns true if isCee3cb() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8B,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8B,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8B,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3cbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8B,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cc()
	 *	@return  Returns true if isCee3cc() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ccTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cd()
	 *	@return  Returns true if isCee3cd() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3cdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8D,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ce()
	 *	@return  Returns true if isCee3ce() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ce() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ceTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8E,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cf()
	 *	@return  Returns true if isCee3cf() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3cfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x8F,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cg()
	 *	@return  Returns true if isCee3cg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3cgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ch()
	 *	@return  Returns true if isCee3ch() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ch() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3chTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cj()
	 *	@return  Returns true if isCee3cj() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3cjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x93,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ck()
	 *	@return  Returns true if isCee3ck() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ck() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ckTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x94,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3co()
	 *	@return  Returns true if isCee3co() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3co() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3coTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cp()
	 *	@return  Returns true if isCee3cp() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3cpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cq()
	 *	@return  Returns true if isCee3cq() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3cqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x9C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cs()
	 *	@return  Returns true if isCee3cs() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x9C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cs() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x9C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x9C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3csTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0x9C,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ct()
	 *	@return  Returns true if isCee3ct() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ct() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ctTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cu()
	 *	@return  Returns true if isCee3cu() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3cuTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3cv()
	 *	@return  Returns true if isCee3cv() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3cv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3cvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0x9F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d0()
	 *	@return  Returns true if isCee3d0() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d1()
	 *	@return  Returns true if isCee3d1() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d2()
	 *	@return  Returns true if isCee3d2() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d3()
	 *	@return  Returns true if isCee3d3() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d4()
	 *	@return  Returns true if isCee3d4() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0xA5,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d5()
	 *	@return  Returns true if isCee3d5() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0xA5,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0xA5,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0xA5,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0D,(byte)0xA5,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d6()
	 *	@return  Returns true if isCee3d6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d7()
	 *	@return  Returns true if isCee3d7() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xA7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xA8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d8()
	 *	@return  Returns true if isCee3d8() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xA8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xA8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xA8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xA8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xA9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3d9()
	 *	@return  Returns true if isCee3d9() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xA9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3d9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xA9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xA9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3d9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xA9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xAA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3da()
	 *	@return  Returns true if isCee3da() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xAA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3da() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xAA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xAA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3daTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xAA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xAB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3db()
	 *	@return  Returns true if isCee3db() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xAB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3db() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xAB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xAB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xAB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dc()
	 *	@return  Returns true if isCee3dc() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dd()
	 *	@return  Returns true if isCee3dd() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ddTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3de()
	 *	@return  Returns true if isCee3de() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3de() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3deTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3df()
	 *	@return  Returns true if isCee3df() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3df() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dg()
	 *	@return  Returns true if isCee3dg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dh()
	 *	@return  Returns true if isCee3dh() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3di()
	 *	@return  Returns true if isCee3di() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3di() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3diTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dj()
	 *	@return  Returns true if isCee3dj() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3djTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dk()
	 *	@return  Returns true if isCee3dk() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dkTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dl()
	 *	@return  Returns true if isCee3dl() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dl() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dlTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dm()
	 *	@return  Returns true if isCee3dm() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dn()
	 *	@return  Returns true if isCee3dn() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dnTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3do()
	 *	@return  Returns true if isCee3do() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3do() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3doTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dp()
	 *	@return  Returns true if isCee3dp() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xB9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x0D,(byte)0xBA,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dq()
	 *	@return  Returns true if isCee3dq() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x0D,(byte)0xBA,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0D,(byte)0xBA,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x0D,(byte)0xBA,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x0D,(byte)0xBA,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dr()
	 *	@return  Returns true if isCee3dr() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3drTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ds()
	 *	@return  Returns true if isCee3ds() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ds() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dsTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xBC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3dt()
	 *	@return  Returns true if isCee3dt() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3dt() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3dtTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3du()
	 *	@return  Returns true if isCee3du() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3du() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3duTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xBE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3e0()
	 *	@return  Returns true if isCee3e0() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3e0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3e0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xC0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3e1()
	 *	@return  Returns true if isCee3e1() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3e1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3e1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3e2()
	 *	@return  Returns true if isCee3e2() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3e2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3e2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC2,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3e3()
	 *	@return  Returns true if isCee3e3() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3e3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3e3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC3,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3e4()
	 *	@return  Returns true if isCee3e4() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3e4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3e4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3e5()
	 *	@return  Returns true if isCee3e5() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3e5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3e5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3e6()
	 *	@return  Returns true if isCee3e6() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3e6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3e6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xC6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ea()
	 *	@return  Returns true if isCee3ea() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ea() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3eaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3eb()
	 *	@return  Returns true if isCee3eb() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3eb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ebTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ec()
	 *	@return  Returns true if isCee3ec() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ec() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ecTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ed()
	 *	@return  Returns true if isCee3ed() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ed() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3edTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ee()
	 *	@return  Returns true if isCee3ee() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ee() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3eeTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ef()
	 *	@return  Returns true if isCee3ef() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ef() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3efTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xCF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3eg()
	 *	@return  Returns true if isCee3eg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3eg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3egTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3eh()
	 *	@return  Returns true if isCee3eh() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3eh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ehTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ei()
	 *	@return  Returns true if isCee3ei() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ei() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3eiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ej()
	 *	@return  Returns true if isCee3ej() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ej() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ejTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ek()
	 *	@return  Returns true if isCee3ek() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ek() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ekTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3el()
	 *	@return  Returns true if isCee3el() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3el() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3elTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3em()
	 *	@return  Returns true if isCee3em() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3em() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3emTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xD6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3en()
	 *	@return  Returns true if isCee3en() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3en() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3enTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD7,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3eo()
	 *	@return  Returns true if isCee3eo() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3eo() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3eoTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD8,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ep()
	 *	@return  Returns true if isCee3ep() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ep() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3epTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xD9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3eq()
	 *	@return  Returns true if isCee3eq() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3eq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3eqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3er()
	 *	@return  Returns true if isCee3er() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3er() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3erTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDB,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3es()
	 *	@return  Returns true if isCee3es() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3es() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3esTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xDC,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3et()
	 *	@return  Returns true if isCee3et() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3et() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3etTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3eu()
	 *	@return  Returns true if isCee3eu() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3eu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3euTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ev()
	 *	@return  Returns true if isCee3ev() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ev() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3evTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xDF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f0()
	 *	@return  Returns true if isCee3f0() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f1()
	 *	@return  Returns true if isCee3f1() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f2()
	 *	@return  Returns true if isCee3f2() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f3()
	 *	@return  Returns true if isCee3f3() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f4()
	 *	@return  Returns true if isCee3f4() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f5()
	 *	@return  Returns true if isCee3f5() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f6()
	 *	@return  Returns true if isCee3f6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f7()
	 *	@return  Returns true if isCee3f7() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f8()
	 *	@return  Returns true if isCee3f8() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3f9()
	 *	@return  Returns true if isCee3f9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3f9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3f9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fa()
	 *	@return  Returns true if isCee3fa() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fa() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3faTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fb()
	 *	@return  Returns true if isCee3fb() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fc()
	 *	@return  Returns true if isCee3fc() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fd()
	 *	@return  Returns true if isCee3fd() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fe()
	 *	@return  Returns true if isCee3fe() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fe() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3feTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ff()
	 *	@return  Returns true if isCee3ff() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ff() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ffTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fg()
	 *	@return  Returns true if isCee3fg() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xF1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fh()
	 *	@return  Returns true if isCee3fh() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xF1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xF1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xF1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xF1,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fi()
	 *	@return  Returns true if isCee3fi() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fi() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fj()
	 *	@return  Returns true if isCee3fj() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xF3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fk()
	 *	@return  Returns true if isCee3fk() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fkTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF4,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fl()
	 *	@return  Returns true if isCee3fl() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fl() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3flTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fm()
	 *	@return  Returns true if isCee3fm() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF6,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fn()
	 *	@return  Returns true if isCee3fn() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fnTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF7,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fo()
	 *	@return  Returns true if isCee3fo() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fo() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3foTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF8,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fp()
	 *	@return  Returns true if isCee3fp() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xF9,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fq()
	 *	@return  Returns true if isCee3fq() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0D,(byte)0xFA,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fr()
	 *	@return  Returns true if isCee3fr() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3frTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fs()
	 *	@return  Returns true if isCee3fs() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fs() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fsTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ft()
	 *	@return  Returns true if isCee3ft() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ft() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ftTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fu()
	 *	@return  Returns true if isCee3fu() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fuTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0D,(byte)0xFE,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xFF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3fv()
	 *	@return  Returns true if isCee3fv() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xFF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3fv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xFF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xFF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3fvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0D,(byte)0xFF,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x00,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3g0()
	 *	@return  Returns true if isCee3g0() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x00,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3g0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x00,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x00,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3g0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x00,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x01,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3g1()
	 *	@return  Returns true if isCee3g1() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x01,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3g1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x01,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x01,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3g1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0x01,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3g2()
	 *	@return  Returns true if isCee3g2() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3g2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3g2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x02,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gh()
	 *	@return  Returns true if isCee3gh() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ghTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x11,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gi()
	 *	@return  Returns true if isCee3gi() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gi() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3giTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x12,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gj()
	 *	@return  Returns true if isCee3gj() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3gjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x13,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x14,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gk()
	 *	@return  Returns true if isCee3gk() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x14,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x14,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x14,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3gkTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x14,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gl()
	 *	@return  Returns true if isCee3gl() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gl() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3glTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x15,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gm()
	 *	@return  Returns true if isCee3gm() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3gmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x16,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gn()
	 *	@return  Returns true if isCee3gn() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3gnTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x17,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3go()
	 *	@return  Returns true if isCee3go() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3go() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3goTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x18,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gp()
	 *	@return  Returns true if isCee3gp() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3gpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x19,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gq()
	 *	@return  Returns true if isCee3gq() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3gqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gr()
	 *	@return  Returns true if isCee3gr() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3grTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gs()
	 *	@return  Returns true if isCee3gs() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gs() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3gsTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gt()
	 *	@return  Returns true if isCee3gt() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gt() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3gtTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gu()
	 *	@return  Returns true if isCee3gu() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3guTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3gv()
	 *	@return  Returns true if isCee3gv() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3gv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3gvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x1F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h0()
	 *	@return  Returns true if isCee3h0() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x20,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h1()
	 *	@return  Returns true if isCee3h1() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x21,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h2()
	 *	@return  Returns true if isCee3h2() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x22,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h3()
	 *	@return  Returns true if isCee3h3() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x23,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h4()
	 *	@return  Returns true if isCee3h4() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x24,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h5()
	 *	@return  Returns true if isCee3h5() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x25,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h6()
	 *	@return  Returns true if isCee3h6() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x26,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h7()
	 *	@return  Returns true if isCee3h7() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x27,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h8()
	 *	@return  Returns true if isCee3h8() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x28,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3h9()
	 *	@return  Returns true if isCee3h9() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3h9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3h9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x29,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ha()
	 *	@return  Returns true if isCee3ha() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ha() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3haTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hb()
	 *	@return  Returns true if isCee3hb() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hc()
	 *	@return  Returns true if isCee3hc() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hd()
	 *	@return  Returns true if isCee3hd() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3he()
	 *	@return  Returns true if isCee3he() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3he() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3heTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hf()
	 *	@return  Returns true if isCee3hf() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x2F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hg()
	 *	@return  Returns true if isCee3hg() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x30,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x31,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hh()
	 *	@return  Returns true if isCee3hh() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x31,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x31,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x31,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x31,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hi()
	 *	@return  Returns true if isCee3hi() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hi() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x32,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hj()
	 *	@return  Returns true if isCee3hj() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x33,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hk()
	 *	@return  Returns true if isCee3hk() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hkTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x34,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hl()
	 *	@return  Returns true if isCee3hl() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hl() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hlTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x35,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hm()
	 *	@return  Returns true if isCee3hm() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x36,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hn()
	 *	@return  Returns true if isCee3hn() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hnTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x37,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x38,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ho()
	 *	@return  Returns true if isCee3ho() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x38,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ho() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x38,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x38,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hoTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x38,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hp()
	 *	@return  Returns true if isCee3hp() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x39,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hq()
	 *	@return  Returns true if isCee3hq() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hr()
	 *	@return  Returns true if isCee3hr() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hrTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hs()
	 *	@return  Returns true if isCee3hs() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hs() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hsTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ht()
	 *	@return  Returns true if isCee3ht() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ht() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3htTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hu()
	 *	@return  Returns true if isCee3hu() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3huTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3hv()
	 *	@return  Returns true if isCee3hv() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3hv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3hvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x3F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x40,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i0()
	 *	@return  Returns true if isCee3i0() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x40,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x40,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x40,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x40,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x41,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i1()
	 *	@return  Returns true if isCee3i1() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x41,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x41,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x41,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x41,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i2()
	 *	@return  Returns true if isCee3i2() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x42,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i3()
	 *	@return  Returns true if isCee3i3() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x43,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i4()
	 *	@return  Returns true if isCee3i4() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x44,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i5()
	 *	@return  Returns true if isCee3i5() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x45,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i6()
	 *	@return  Returns true if isCee3i6() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x46,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i7()
	 *	@return  Returns true if isCee3i7() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x47,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i8()
	 *	@return  Returns true if isCee3i8() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x48,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3i9()
	 *	@return  Returns true if isCee3i9() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3i9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3i9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x49,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ia()
	 *	@return  Returns true if isCee3ia() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ia() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3iaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ib()
	 *	@return  Returns true if isCee3ib() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ib() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ibTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ic()
	 *	@return  Returns true if isCee3ic() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ic() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3icTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3id()
	 *	@return  Returns true if isCee3id() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3id() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3idTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ie()
	 *	@return  Returns true if isCee3ie() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ie() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ieTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3if()
	 *	@return  Returns true if isCee3if() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3if() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ifTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x4F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ig()
	 *	@return  Returns true if isCee3ig() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ig() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3igTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x50,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ih()
	 *	@return  Returns true if isCee3ih() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ih() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ihTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x51,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ii()
	 *	@return  Returns true if isCee3ii() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ii() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3iiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x52,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ij()
	 *	@return  Returns true if isCee3ij() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ij() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ijTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x53,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ik()
	 *	@return  Returns true if isCee3ik() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ik() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ikTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x54,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3il()
	 *	@return  Returns true if isCee3il() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3il() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ilTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x55,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3im()
	 *	@return  Returns true if isCee3im() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3im() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3imTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x56,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3in()
	 *	@return  Returns true if isCee3in() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3in() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3inTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x57,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3io()
	 *	@return  Returns true if isCee3io() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3io() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ioTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x58,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ip()
	 *	@return  Returns true if isCee3ip() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ip() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ipTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3iq()
	 *	@return  Returns true if isCee3iq() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3iq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3iqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ir()
	 *	@return  Returns true if isCee3ir() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ir() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3irTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3is()
	 *	@return  Returns true if isCee3is() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3is() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3isTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3it()
	 *	@return  Returns true if isCee3it() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3it() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3itTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3iu()
	 *	@return  Returns true if isCee3iu() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3iu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3iuTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3iv()
	 *	@return  Returns true if isCee3iv() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3iv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ivTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x5F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j0()
	 *	@return  Returns true if isCee3j0() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x60,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j1()
	 *	@return  Returns true if isCee3j1() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x61,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j2()
	 *	@return  Returns true if isCee3j2() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x62,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j3()
	 *	@return  Returns true if isCee3j3() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x63,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j4()
	 *	@return  Returns true if isCee3j4() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x64,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j5()
	 *	@return  Returns true if isCee3j5() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x65,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j6()
	 *	@return  Returns true if isCee3j6() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x66,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j7()
	 *	@return  Returns true if isCee3j7() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x67,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j8()
	 *	@return  Returns true if isCee3j8() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3j9()
	 *	@return  Returns true if isCee3j9() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3j9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3j9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x69,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ja()
	 *	@return  Returns true if isCee3ja() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ja() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jb()
	 *	@return  Returns true if isCee3jb() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jc()
	 *	@return  Returns true if isCee3jc() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jd()
	 *	@return  Returns true if isCee3jd() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3je()
	 *	@return  Returns true if isCee3je() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3je() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jeTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jf()
	 *	@return  Returns true if isCee3jf() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x6F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jg()
	 *	@return  Returns true if isCee3jg() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x70,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jh()
	 *	@return  Returns true if isCee3jh() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x71,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ji()
	 *	@return  Returns true if isCee3ji() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ji() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jj()
	 *	@return  Returns true if isCee3jj() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x73,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jk()
	 *	@return  Returns true if isCee3jk() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jkTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x74,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x75,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jl()
	 *	@return  Returns true if isCee3jl() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x75,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jl() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x75,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x75,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jlTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0x75,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jm()
	 *	@return  Returns true if isCee3jm() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x77,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jn()
	 *	@return  Returns true if isCee3jn() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x77,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x77,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x77,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jnTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x77,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x78,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jo()
	 *	@return  Returns true if isCee3jo() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x78,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jo() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x78,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x78,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3joTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x78,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jp()
	 *	@return  Returns true if isCee3jp() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x79,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jq()
	 *	@return  Returns true if isCee3jq() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jr()
	 *	@return  Returns true if isCee3jr() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jrTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3js()
	 *	@return  Returns true if isCee3js() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3js() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jsTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jt()
	 *	@return  Returns true if isCee3jt() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jt() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jtTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ju()
	 *	@return  Returns true if isCee3ju() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ju() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3juTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3jv()
	 *	@return  Returns true if isCee3jv() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3jv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3jvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x7F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x88,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3k8()
	 *	@return  Returns true if isCee3k8() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x88,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3k8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x88,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x88,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3k8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x88,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x89,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3k9()
	 *	@return  Returns true if isCee3k9() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x89,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3k9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x89,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x89,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3k9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x89,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ka()
	 *	@return  Returns true if isCee3ka() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ka() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3kaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3kb()
	 *	@return  Returns true if isCee3kb() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3kb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3kbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3kc()
	 *	@return  Returns true if isCee3kc() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3kc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3kcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3kd()
	 *	@return  Returns true if isCee3kd() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3kd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3kdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ke()
	 *	@return  Returns true if isCee3ke() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ke() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3keTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3kf()
	 *	@return  Returns true if isCee3kf() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3kf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3kfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0x8F,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3kg()
	 *	@return  Returns true if isCee3kg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3kg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3kgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0xBF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3lv()
	 *	@return  Returns true if isCee3lv() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0xBF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3lv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0xBF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0xBF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3lvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x0E,(byte)0xBF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3m5()
	 *	@return  Returns true if isCee3m5() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3m5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3m5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xC5,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xC6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3m6()
	 *	@return  Returns true if isCee3m6() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xC6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3m6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xC6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xC6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3m6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xC6,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3mo()
	 *	@return  Returns true if isCee3mo() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3mo() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3moTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0E,(byte)0xD8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3n9()
	 *	@return  Returns true if isCee3n9() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3n9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3n9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xE9,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xEA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3na()
	 *	@return  Returns true if isCee3na() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xEA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3na() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xEA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xEA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3naTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x0E,(byte)0xEA,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3nb()
	 *	@return  Returns true if isCee3nb() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3nb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3nbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEB,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3nc()
	 *	@return  Returns true if isCee3nc() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3nc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ncTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEC,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3nd()
	 *	@return  Returns true if isCee3nd() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3nd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ndTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xED,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ne()
	 *	@return  Returns true if isCee3ne() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ne() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3neTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEE,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3nf()
	 *	@return  Returns true if isCee3nf() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3nf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3nfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xEF,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ng()
	 *	@return  Returns true if isCee3ng() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ng() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ngTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF0,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3nh()
	 *	@return  Returns true if isCee3nh() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3nh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3nhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0E,(byte)0xF1,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3ps()
	 *	@return  Returns true if isCee3ps() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3ps() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3psTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3pt()
	 *	@return  Returns true if isCee3pt() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3pt() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3ptTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x3D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3q6()
	 *	@return  Returns true if isCee3q6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3q6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3q6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3q7()
	 *	@return  Returns true if isCee3q7() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3q7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3q7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x48,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3q8()
	 *	@return  Returns true if isCee3q8() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x48,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3q8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x48,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x48,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3q8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x48,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3q9()
	 *	@return  Returns true if isCee3q9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3q9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3q9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3qa()
	 *	@return  Returns true if isCee3qa() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3qa() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3qaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3qb()
	 *	@return  Returns true if isCee3qb() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3qb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3qbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3qc()
	 *	@return  Returns true if isCee3qc() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3qc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3qcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3qd()
	 *	@return  Returns true if isCee3qd() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3qd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3qdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3qe()
	 *	@return  Returns true if isCee3qe() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3qe() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3qeTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x0F,(byte)0x4E,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3qf()
	 *	@return  Returns true if isCee3qf() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3qf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3qfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3t1()
	 *	@return  Returns true if isCee3t1() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3t1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3t1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xA1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3tf()
	 *	@return  Returns true if isCee3tf() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3tf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3tfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee3vm()
	 *	@return  Returns true if isCee3vm() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee3vm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee3vmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x0F,(byte)0xF6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee4s9()
	 *	@return  Returns true if isCee4s9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee4s9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee4s9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee4sa()
	 *	@return  Returns true if isCee4sa() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee4sa() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee4saTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x13,(byte)0xED,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee4vd()
	 *	@return  Returns true if isCee4vd() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x13,(byte)0xED,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee4vd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x13,(byte)0xED,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x13,(byte)0xED,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee4vdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x13,(byte)0xED,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x13,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee4ve()
	 *	@return  Returns true if isCee4ve() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x13,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee4ve() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x13,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x13,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee4veTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x13,(byte)0xEE,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x13,(byte)0xEF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee4vf()
	 *	@return  Returns true if isCee4vf() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x13,(byte)0xEF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee4vf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x13,(byte)0xEF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x13,(byte)0xEF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee4vfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x13,(byte)0xEF,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee4vg()
	 *	@return  Returns true if isCee4vg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee4vg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee4vgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee4vh()
	 *	@return  Returns true if isCee4vh() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee4vh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee4vhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee4vi()
	 *	@return  Returns true if isCee4vi() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee4vi() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee4viTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x13,(byte)0xF2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee50v()
	 *	@return  Returns true if isCee50v() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee50v() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee50vTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x1F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee510()
	 *	@return  Returns true if isCee510() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee510() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee510True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x20,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee512()
	 *	@return  Returns true if isCee512() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee512() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee512True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x22,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee513()
	 *	@return  Returns true if isCee513() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee513() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee513True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x23,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee519()
	 *	@return  Returns true if isCee519() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee519() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee519True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x29,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee51a()
	 *	@return  Returns true if isCee51a() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee51a() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee51aTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x2A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x38,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee51o()
	 *	@return  Returns true if isCee51o() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x38,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee51o() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x38,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x38,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee51oTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x38,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x39,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee51p()
	 *	@return  Returns true if isCee51p() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x39,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee51p() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x39,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x39,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee51pTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x39,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee51q()
	 *	@return  Returns true if isCee51q() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee51q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee51qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee51r()
	 *	@return  Returns true if isCee51r() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee51r() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee51rTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x3B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee51s()
	 *	@return  Returns true if isCee51s() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee51s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee51sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x3C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52h()
	 *	@return  Returns true if isCee52h() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52h() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52hTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52i()
	 *	@return  Returns true if isCee52i() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52i() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52iTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52j()
	 *	@return  Returns true if isCee52j() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52j() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52jTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x54,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52k()
	 *	@return  Returns true if isCee52k() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x54,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52k() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x54,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x54,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52kTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x54,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x55,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52l()
	 *	@return  Returns true if isCee52l() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x55,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52l() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x55,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x55,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52lTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x55,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x56,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52m()
	 *	@return  Returns true if isCee52m() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x56,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52m() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x56,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x56,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52mTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x56,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x02,(byte)0x14,(byte)0x57,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52n()
	 *	@return  Returns true if isCee52n() is new byte[] {(byte)0x00,(byte)0x02,(byte)0x14,(byte)0x57,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52n() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x14,(byte)0x57,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x02,(byte)0x14,(byte)0x57,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52nTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x02,(byte)0x14,(byte)0x57,(byte)0x51,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x58,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52o()
	 *	@return  Returns true if isCee52o() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x58,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52o() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x58,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x58,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52oTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x58,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x59,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52p()
	 *	@return  Returns true if isCee52p() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x59,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52p() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x59,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x59,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52pTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x59,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52q()
	 *	@return  Returns true if isCee52q() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52r()
	 *	@return  Returns true if isCee52r() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52r() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52rTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x14,(byte)0x5C,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52s()
	 *	@return  Returns true if isCee52s() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x14,(byte)0x5C,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x14,(byte)0x5C,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x14,(byte)0x5C,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x14,(byte)0x5C,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52t()
	 *	@return  Returns true if isCee52t() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52u()
	 *	@return  Returns true if isCee52u() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52u() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52uTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x5F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee52v()
	 *	@return  Returns true if isCee52v() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x5F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee52v() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x5F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x5F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee52vTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x5F,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x60,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee530()
	 *	@return  Returns true if isCee530() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x60,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee530() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x60,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x60,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee530True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x60,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee531()
	 *	@return  Returns true if isCee531() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee531() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee531True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee532()
	 *	@return  Returns true if isCee532() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee532() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee532True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x63,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee533()
	 *	@return  Returns true if isCee533() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x63,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee533() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x63,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x63,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee533True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x63,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee534()
	 *	@return  Returns true if isCee534() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee534() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee534True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee535()
	 *	@return  Returns true if isCee535() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee535() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee535True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee536()
	 *	@return  Returns true if isCee536() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee536() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee536True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x67,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee537()
	 *	@return  Returns true if isCee537() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x67,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee537() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x67,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x67,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee537True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x67,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x68,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee538()
	 *	@return  Returns true if isCee538() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x68,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee538() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x68,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x68,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee538True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x68,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee539()
	 *	@return  Returns true if isCee539() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee539() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee539True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee53a()
	 *	@return  Returns true if isCee53a() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee53a() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee53aTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6A,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee53b()
	 *	@return  Returns true if isCee53b() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee53b() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee53bTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee53c()
	 *	@return  Returns true if isCee53c() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee53c() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee53cTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee53d()
	 *	@return  Returns true if isCee53d() is new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee53d() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee53dTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x01,(byte)0x14,(byte)0x6D,(byte)0x49,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee53e()
	 *	@return  Returns true if isCee53e() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee53e() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee53eTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee53f()
	 *	@return  Returns true if isCee53f() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee53f() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee53fTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee53g()
	 *	@return  Returns true if isCee53g() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee53g() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee53gTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee53h()
	 *	@return  Returns true if isCee53h() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee53h() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee53hTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0x71,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee53i()
	 *	@return  Returns true if isCee53i() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee53i() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee53iTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x14,(byte)0x72,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee55l()
	 *	@return  Returns true if isCee55l() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee55l() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee55lTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee55m()
	 *	@return  Returns true if isCee55m() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee55m() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee55mTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x14,(byte)0xB6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee58p()
	 *	@return  Returns true if isCee58p() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee58p() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee58pTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x19,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee58q()
	 *	@return  Returns true if isCee58q() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee58q() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee58qTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee58r()
	 *	@return  Returns true if isCee58r() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee58r() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee58rTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee58s()
	 *	@return  Returns true if isCee58s() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee58s() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee58sTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee58t()
	 *	@return  Returns true if isCee58t() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee58t() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee58tTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x15,(byte)0x1D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5cm()
	 *	@return  Returns true if isCee5cm() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5cm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5cmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5cn()
	 *	@return  Returns true if isCee5cn() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5cn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5cnTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x97,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5co()
	 *	@return  Returns true if isCee5co() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5co() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5coTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x98,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5cp()
	 *	@return  Returns true if isCee5cp() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5cp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5cpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x99,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5cq()
	 *	@return  Returns true if isCee5cq() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5cq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5cqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5cr()
	 *	@return  Returns true if isCee5cr() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5cr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5crTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5cs()
	 *	@return  Returns true if isCee5cs() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5cs() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5csTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ct()
	 *	@return  Returns true if isCee5ct() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ct() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ctTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0x9D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5df()
	 *	@return  Returns true if isCee5df() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5df() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5dfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xAF,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5dg()
	 *	@return  Returns true if isCee5dg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5dg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5dgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB0,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5dh()
	 *	@return  Returns true if isCee5dh() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5dh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5dhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xB1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5f1()
	 *	@return  Returns true if isCee5f1() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5f1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5f1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE1,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5f2()
	 *	@return  Returns true if isCee5f2() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5f2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5f2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE2,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5f3()
	 *	@return  Returns true if isCee5f3() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5f3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5f3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE3,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5f4()
	 *	@return  Returns true if isCee5f4() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5f4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5f4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE4,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5f5()
	 *	@return  Returns true if isCee5f5() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5f5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5f5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE5,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5f6()
	 *	@return  Returns true if isCee5f6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5f6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5f6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE6,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5f7()
	 *	@return  Returns true if isCee5f7() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5f7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5f7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE7,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5f8()
	 *	@return  Returns true if isCee5f8() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5f8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5f8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE8,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5f9()
	 *	@return  Returns true if isCee5f9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5f9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5f9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xE9,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5fc()
	 *	@return  Returns true if isCee5fc() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5fc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5fcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xEC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xED,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5fd()
	 *	@return  Returns true if isCee5fd() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xED,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5fd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xED,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xED,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5fdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xED,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5fq()
	 *	@return  Returns true if isCee5fq() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5fq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5fqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFA,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5fr()
	 *	@return  Returns true if isCee5fr() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5fr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5frTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFB,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5fs()
	 *	@return  Returns true if isCee5fs() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5fs() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5fsTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFC,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ft()
	 *	@return  Returns true if isCee5ft() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ft() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ftTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x15,(byte)0xFD,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x13,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5gj()
	 *	@return  Returns true if isCee5gj() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x13,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5gj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x13,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x13,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5gjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x13,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x45,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5i5()
	 *	@return  Returns true if isCee5i5() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x45,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5i5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x45,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x45,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5i5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x45,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5i6()
	 *	@return  Returns true if isCee5i6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5i6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5i6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x46,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5i7()
	 *	@return  Returns true if isCee5i7() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5i7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5i7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x47,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x48,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5i8()
	 *	@return  Returns true if isCee5i8() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x48,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5i8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x48,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x48,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5i8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x48,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5i9()
	 *	@return  Returns true if isCee5i9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5i9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5i9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x49,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ia()
	 *	@return  Returns true if isCee5ia() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ia() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5iaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ib()
	 *	@return  Returns true if isCee5ib() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ib() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ibTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x4B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ic()
	 *	@return  Returns true if isCee5ic() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ic() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5icTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5id()
	 *	@return  Returns true if isCee5id() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5id() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5idTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ie()
	 *	@return  Returns true if isCee5ie() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ie() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ieTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5if()
	 *	@return  Returns true if isCee5if() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5if() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ifTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x4F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x50,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ig()
	 *	@return  Returns true if isCee5ig() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x50,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ig() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x50,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x50,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5igTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x50,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ih()
	 *	@return  Returns true if isCee5ih() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ih() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ihTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x51,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ii()
	 *	@return  Returns true if isCee5ii() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ii() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5iiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x52,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ij()
	 *	@return  Returns true if isCee5ij() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ij() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ijTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x53,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x54,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ik()
	 *	@return  Returns true if isCee5ik() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x54,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ik() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x54,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x54,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ikTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x54,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x55,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5il()
	 *	@return  Returns true if isCee5il() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x55,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5il() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x55,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x55,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ilTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x55,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x56,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5im()
	 *	@return  Returns true if isCee5im() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x56,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5im() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x56,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x56,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5imTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x56,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x57,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5in()
	 *	@return  Returns true if isCee5in() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x57,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5in() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x57,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x57,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5inTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x57,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x58,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5io()
	 *	@return  Returns true if isCee5io() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x58,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5io() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x58,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x58,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ioTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x58,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ip()
	 *	@return  Returns true if isCee5ip() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ip() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ipTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x59,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5iq()
	 *	@return  Returns true if isCee5iq() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5iq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5iqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5A,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5is()
	 *	@return  Returns true if isCee5is() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5is() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5isTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x5C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5iu()
	 *	@return  Returns true if isCee5iu() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5iu() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5iuTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5iv()
	 *	@return  Returns true if isCee5iv() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5iv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ivTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x5F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x60,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j0()
	 *	@return  Returns true if isCee5j0() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x60,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j0() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x60,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x60,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j0True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x60,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j1()
	 *	@return  Returns true if isCee5j1() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x61,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j2()
	 *	@return  Returns true if isCee5j2() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x62,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j3()
	 *	@return  Returns true if isCee5j3() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x63,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j4()
	 *	@return  Returns true if isCee5j4() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x64,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j5()
	 *	@return  Returns true if isCee5j5() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x65,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j6()
	 *	@return  Returns true if isCee5j6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x66,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x67,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j7()
	 *	@return  Returns true if isCee5j7() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x67,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x67,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x67,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x67,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j8()
	 *	@return  Returns true if isCee5j8() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x68,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5j9()
	 *	@return  Returns true if isCee5j9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5j9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5j9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x69,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ja()
	 *	@return  Returns true if isCee5ja() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ja() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jb()
	 *	@return  Returns true if isCee5jb() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jc()
	 *	@return  Returns true if isCee5jc() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x6D,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jd()
	 *	@return  Returns true if isCee5jd() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x6D,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x6D,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x6D,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x6D,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5je()
	 *	@return  Returns true if isCee5je() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5je() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jeTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jf()
	 *	@return  Returns true if isCee5jf() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x6F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jg()
	 *	@return  Returns true if isCee5jg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x70,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x71,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jh()
	 *	@return  Returns true if isCee5jh() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x71,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x71,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x71,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jhTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x71,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x72,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ji()
	 *	@return  Returns true if isCee5ji() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x72,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ji() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x72,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x72,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x72,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x73,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jj()
	 *	@return  Returns true if isCee5jj() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x73,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x73,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x73,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x73,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x74,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jk()
	 *	@return  Returns true if isCee5jk() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x74,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x74,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x74,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jkTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x74,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x75,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jl()
	 *	@return  Returns true if isCee5jl() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x75,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jl() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x75,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x75,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jlTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x75,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jm()
	 *	@return  Returns true if isCee5jm() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jm() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x76,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x77,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5jn()
	 *	@return  Returns true if isCee5jn() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x77,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5jn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x77,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x77,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5jnTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x77,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x81,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5k1()
	 *	@return  Returns true if isCee5k1() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x81,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5k1() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x81,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x81,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5k1True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x81,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x82,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5k2()
	 *	@return  Returns true if isCee5k2() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x82,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5k2() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x82,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x82,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5k2True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x82,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x83,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5k3()
	 *	@return  Returns true if isCee5k3() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x83,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5k3() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x83,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x83,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5k3True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x83,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5k4()
	 *	@return  Returns true if isCee5k4() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5k4() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5k4True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x84,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5k5()
	 *	@return  Returns true if isCee5k5() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5k5() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5k5True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x85,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5k6()
	 *	@return  Returns true if isCee5k6() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5k6() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5k6True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x86,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x87,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5k7()
	 *	@return  Returns true if isCee5k7() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x87,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5k7() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x87,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x87,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5k7True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x87,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5k8()
	 *	@return  Returns true if isCee5k8() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5k8() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5k8True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x88,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5k9()
	 *	@return  Returns true if isCee5k9() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5k9() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5k9True() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x89,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ka()
	 *	@return  Returns true if isCee5ka() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ka() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kaTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kb()
	 *	@return  Returns true if isCee5kb() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kb() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kbTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8B,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kc()
	 *	@return  Returns true if isCee5kc() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kc() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kcTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8C,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kd()
	 *	@return  Returns true if isCee5kd() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kd() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kdTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8D,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ke()
	 *	@return  Returns true if isCee5ke() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ke() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5keTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kf()
	 *	@return  Returns true if isCee5kf() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kf() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kfTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x8F,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kg()
	 *	@return  Returns true if isCee5kg() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kg() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kgTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x90,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kh()
	 *	@return  Returns true if isCee5kh() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kh() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5khTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x91,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ki()
	 *	@return  Returns true if isCee5ki() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ki() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kiTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x92,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x93,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kj()
	 *	@return  Returns true if isCee5kj() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x93,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kj() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x93,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x93,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kjTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x93,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x94,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kk()
	 *	@return  Returns true if isCee5kk() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x94,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kk() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x94,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x94,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kkTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x94,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x95,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kl()
	 *	@return  Returns true if isCee5kl() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x95,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kl() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x95,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x95,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5klTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x95,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5km()
	 *	@return  Returns true if isCee5km() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5km() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kmTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x96,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x97,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kn()
	 *	@return  Returns true if isCee5kn() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x97,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kn() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x97,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x97,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5knTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x97,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x98,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ko()
	 *	@return  Returns true if isCee5ko() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x98,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ko() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x98,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x98,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5koTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x98,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x99,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kp()
	 *	@return  Returns true if isCee5kp() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x99,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kp() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x99,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x99,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kpTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x99,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kq()
	 *	@return  Returns true if isCee5kq() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kq() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kqTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9A,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kr()
	 *	@return  Returns true if isCee5kr() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kr() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5krTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9B,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ks()
	 *	@return  Returns true if isCee5ks() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ks() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ksTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9C,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kt()
	 *	@return  Returns true if isCee5kt() is new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kt() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5ktTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00,(byte)0x16,(byte)0x9D,(byte)0x41,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5ku()
	 *	@return  Returns true if isCee5ku() is new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5ku() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kuTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x03,(byte)0x16,(byte)0x9E,(byte)0x59,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x9F,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5} for isCee5kv()
	 *	@return  Returns true if isCee5kv() is new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x9F,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	 */
   public boolean isCee5kv() throws CFException {
      return (  compareChars( getConditionTokenValue() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x9F,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x9F,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5}
	*/
   	public void setCee5kvTrue() {  			
    	setConditionTokenValue( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x04,(byte)0x16,(byte)0x9F,(byte)0x61,(byte)0xC3,(byte)0xC5,(byte)0xC5})".toCharArray());
   	}

	
	
	

		public static int getFcFieldLength() {
			return FC_LENGTH;
		}

}
  
