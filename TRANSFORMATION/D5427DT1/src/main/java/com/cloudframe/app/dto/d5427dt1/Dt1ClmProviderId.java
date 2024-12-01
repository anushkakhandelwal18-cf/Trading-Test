package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1ClmProviderId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1ClmProviderId extends Dt1ClmProviderIdSerialized { 
   

								private int dt1ClmProviderPrefix;

								private long dt1ClmProviderTin;

								private long dt1ClmProviderSuffix;
	
	/**
	* Constructor for Dt1ClmProviderId
	**/
    public Dt1ClmProviderId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1ClmProviderId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmProviderId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dt1ClmProviderPrefix
	 *	@return dt1ClmProviderPrefix
	 */
	public int getDt1ClmProviderPrefix() throws CFException {
       if (isDt1ClmProviderPrefixModified()) { 
           dt1ClmProviderPrefix = refreshDt1ClmProviderPrefix();
        }
   		return dt1ClmProviderPrefix;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmProviderPrefix with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-PROVIDER-PREFIX
	 *	@param number
	 */
	public void setDt1ClmProviderPrefix(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmProviderPrefix = checkDt1ClmProviderPrefixMaxLimit(number); 
		serializeDt1ClmProviderPrefix(dt1ClmProviderPrefix);
	}
	

	public void setDt1ClmProviderPrefix(long number) {
	    number = checkDt1ClmProviderPrefixMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1ClmProviderPrefix((int)number);
	}
	
	/**
	 * 	Update Dt1ClmProviderPrefix with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmProviderPrefix(char[] value) throws CFException {
		 dt1ClmProviderPrefix = serializeDt1ClmProviderPrefix(value);
	}
	/**
	 * 	Update Dt1ClmProviderPrefix with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmProviderPrefixString(char[] value) throws CFException {
		 setDt1ClmProviderPrefix(value);
	}
	/**
	 *	Returns the value of dt1ClmProviderTin
	 *	@return dt1ClmProviderTin
	 */
	public long getDt1ClmProviderTin() throws CFException {
       if (isDt1ClmProviderTinModified()) { 
           dt1ClmProviderTin = refreshDt1ClmProviderTin();
        }
   		return dt1ClmProviderTin;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmProviderTin with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-PROVIDER-TIN
	 *	@param number
	 */
	public void setDt1ClmProviderTin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmProviderTin = checkDt1ClmProviderTinMaxLimit(number); 
		serializeDt1ClmProviderTin(dt1ClmProviderTin);
	}
	

	/**
	 * 	Update Dt1ClmProviderTin with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmProviderTin(char[] value) throws CFException {
		 dt1ClmProviderTin = serializeDt1ClmProviderTin(value);
	}
	/**
	 * 	Update Dt1ClmProviderTin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmProviderTinString(char[] value) throws CFException {
		 setDt1ClmProviderTin(value);
	}
	/**
	 *	Returns the value of dt1ClmProviderSuffix
	 *	@return dt1ClmProviderSuffix
	 */
	public long getDt1ClmProviderSuffix() throws CFException {
       if (isDt1ClmProviderSuffixModified()) { 
           dt1ClmProviderSuffix = refreshDt1ClmProviderSuffix();
        }
   		return dt1ClmProviderSuffix;
	}
	

	
	   
	/**
	 * 	Update Dt1ClmProviderSuffix with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-PROVIDER-SUFFIX
	 *	@param number
	 */
	public void setDt1ClmProviderSuffix(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1ClmProviderSuffix = checkDt1ClmProviderSuffixMaxLimit(number); 
		serializeDt1ClmProviderSuffix(dt1ClmProviderSuffix);
	}
	

	/**
	 * 	Update Dt1ClmProviderSuffix with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1ClmProviderSuffix(char[] value) throws CFException {
		 dt1ClmProviderSuffix = serializeDt1ClmProviderSuffix(value);
	}
	/**
	 * 	Update Dt1ClmProviderSuffix with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1ClmProviderSuffixString(char[] value) throws CFException {
		 setDt1ClmProviderSuffix(value);
	}

	
	
	
	/**
	 * 	initializes Dt1ClmProviderId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1ClmProviderPrefix(0);
                     setDt1ClmProviderTin(0);
                     setDt1ClmProviderSuffix(0);
   }

		public static int getDt1ClmProviderIdFieldLength() {
			return DT_1_CLM_PROVIDER_ID_LENGTH;
		}

}
  
