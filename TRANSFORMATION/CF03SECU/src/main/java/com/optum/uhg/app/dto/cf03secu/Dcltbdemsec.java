package com.optum.uhg.app.dto.cf03secu;

/**
*  The class Dcltbdemsec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 20:31. using version 5.0.0.161
**/


import com.optum.uhg.app.dto.serialize.cf03secu.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbdemsec extends DcltbdemsecSerialized { 
   

						private char[] isin = Field.fillLowValue(12);

						private char[] sedol = Field.fillLowValue(8);

						private char[] ric = Field.fillLowValue(10);

						private char[] intlkey = Field.fillLowValue(8);

						private char[] company = Field.fillLowValue(40);

						private char[] country = Field.fillLowValue(2);

						private char[] industry = Field.fillLowValue(40);

						private char[] sector = Field.fillLowValue(40);

								private int ffmcapmilusd;

						private char[] sectorweight = Field.fillLowValue(8);
	
	/**
	* Constructor for Dcltbdemsec
	**/
    public Dcltbdemsec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException{
     if (isIsinModified()) { 
        isin = refreshIsin();
     }
   		return isin;
   }

  
	/**
	*  set variable isin
	*  Corresponding COBOL Variable is ISIN
	*  @param value
	**/
   public void setIsin(char[] value) {
      isin = checkIsinConstraints(value);
      serializeIsin(isin);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsin,isin.length);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsin,isin.length);
   	
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsin+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
       replace(source,0,source.length(),beginIsin,ISIN_LEN);
   	
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsin,ISIN_LEN);
   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsin+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException{
     if (isSedolModified()) { 
        sedol = refreshSedol();
     }
   		return sedol;
   }

  
	/**
	*  set variable sedol
	*  Corresponding COBOL Variable is SEDOL
	*  @param value
	**/
   public void setSedol(char[] value) {
      sedol = checkSedolConstraints(value);
      serializeSedol(sedol);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSedol,sedol.length);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSedol,sedol.length);
   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSedol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
       replace(source,0,source.length(),beginSedol,SEDOL_LEN);
   	
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSedol,SEDOL_LEN);
   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSedol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException{
     if (isRicModified()) { 
        ric = refreshRic();
     }
   		return ric;
   }

  
	/**
	*  set variable ric
	*  Corresponding COBOL Variable is RIC
	*  @param value
	**/
   public void setRic(char[] value) {
      ric = checkRicConstraints(value);
      serializeRic(ric);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRic,ric.length);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRic,ric.length);
   	
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRic+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
       replace(source,0,source.length(),beginRic,RIC_LEN);
   	
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRic,RIC_LEN);
   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRic+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException{
     if (isIntlkeyModified()) { 
        intlkey = refreshIntlkey();
     }
   		return intlkey;
   }

  
	/**
	*  set variable intlkey
	*  Corresponding COBOL Variable is INTLKEY
	*  @param value
	**/
   public void setIntlkey(char[] value) {
      intlkey = checkIntlkeyConstraints(value);
      serializeIntlkey(intlkey);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIntlkey,intlkey.length);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIntlkey,intlkey.length);
   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIntlkey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
       replace(source,0,source.length(),beginIntlkey,INTLKEY_LEN);
   	
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIntlkey,INTLKEY_LEN);
   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIntlkey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException{
     if (isCompanyModified()) { 
        company = refreshCompany();
     }
   		return company;
   }

  
	/**
	*  set variable company
	*  Corresponding COBOL Variable is COMPANY
	*  @param value
	**/
   public void setCompany(char[] value) {
      company = checkCompanyConstraints(value);
      serializeCompany(company);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompany,company.length);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompany,company.length);
   	
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompany+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
       replace(source,0,source.length(),beginCompany,COMPANY_LEN);
   	
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompany,COMPANY_LEN);
   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompany+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException{
     if (isCountryModified()) { 
        country = refreshCountry();
     }
   		return country;
   }

  
	/**
	*  set variable country
	*  Corresponding COBOL Variable is COUNTRY
	*  @param value
	**/
   public void setCountry(char[] value) {
      country = checkCountryConstraints(value);
      serializeCountry(country);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCountry,country.length);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCountry,country.length);
   	
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
       replace(source,0,source.length(),beginCountry,COUNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCountry,COUNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException{
     if (isIndustryModified()) { 
        industry = refreshIndustry();
     }
   		return industry;
   }

  
	/**
	*  set variable industry
	*  Corresponding COBOL Variable is INDUSTRY
	*  @param value
	**/
   public void setIndustry(char[] value) {
      industry = checkIndustryConstraints(value);
      serializeIndustry(industry);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIndustry,industry.length);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIndustry,industry.length);
   	
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndustry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
       replace(source,0,source.length(),beginIndustry,INDUSTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIndustry,INDUSTRY_LEN);
   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndustry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException{
     if (isSectorModified()) { 
        sector = refreshSector();
     }
   		return sector;
   }

  
	/**
	*  set variable sector
	*  Corresponding COBOL Variable is SECTOR
	*  @param value
	**/
   public void setSector(char[] value) {
      sector = checkSectorConstraints(value);
      serializeSector(sector);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSector,sector.length);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSector,sector.length);
   	
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSector+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
       replace(source,0,source.length(),beginSector,SECTOR_LEN);
   	
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSector,SECTOR_LEN);
   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSector+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {
        if (isFfmcapmilusdModified()) { 
           ffmcapmilusd = refreshFfmcapmilusd();
        }
   		return ffmcapmilusd;
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *  Corresponding COBOL Variable is FFMCAPMILUSD
	 *	@param number
	 */
	public void setFfmcapmilusd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ffmcapmilusd = checkFfmcapmilusdMaxLimit(number); 
		serializeFfmcapmilusd(ffmcapmilusd);
	}


	public void setFfmcapmilusd(long number) {
	    number = checkFfmcapmilusdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFfmcapmilusd((int)number);
	}
	
	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException{
     if (isSectorweightModified()) { 
        sectorweight = refreshSectorweight();
     }
   		return sectorweight;
   }

  
	/**
	*  set variable sectorweight
	*  Corresponding COBOL Variable is SECTORWEIGHT
	*  @param value
	**/
   public void setSectorweight(char[] value) {
      sectorweight = checkSectorweightConstraints(value);
      serializeSectorweight(sectorweight);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSectorweight,sectorweight.length);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSectorweight,sectorweight.length);
   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSectorweight+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
       replace(source,0,source.length(),beginSectorweight,SECTORWEIGHT_LEN);
   	
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSectorweight,SECTORWEIGHT_LEN);
   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSectorweight+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbdemsecFieldLength() {
			return DCLTBDEMSEC_LENGTH;
		}

}
  
