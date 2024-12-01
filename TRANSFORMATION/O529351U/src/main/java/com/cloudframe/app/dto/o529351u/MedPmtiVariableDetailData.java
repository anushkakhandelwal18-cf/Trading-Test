package com.cloudframe.app.dto.o529351u;

/**
*  The class MedPmtiVariableDetailData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MedPmtiVariableDetailData extends MedPmtiVariableDetailDataSerialized { 
   
				private MedPmtiProvX medPmtiProvX = new MedPmtiProvX();

								private long medPmtiProvTin;
				private MedPmtiSpecPayeeX medPmtiSpecPayeeX = new MedPmtiSpecPayeeX();

								private long medPmtiSpecPayeeTin;
	
	/**
	* Constructor for MedPmtiVariableDetailData
	**/
    public MedPmtiVariableDetailData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MedPmtiVariableDetailData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MedPmtiVariableDetailData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			medPmtiProvX.setParent(this,getStartOffset() + 33);
	       			medPmtiSpecPayeeX.setParent(this,getStartOffset() + 119);
    } 

	/**
	 *	Returns the value of medPmtiProvX
	 *	@return medPmtiProvX
	 */   
	 public MedPmtiProvX getMedPmtiProvX() {
   	return medPmtiProvX;
   }
   /**
	* 	Update MedPmtiProvX with the passed value
	*   Corresponding COBOL Variable is MED-PMTI-PROV-X
	*	@param value
	*/
   public void setMedPmtiProvX(char[] value) {
      medPmtiProvX.setString(value); 
   }   
    
     /**
	 * 	Update MedPmtiProvX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMedPmtiProvX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,medPmtiProvX.begin,medPmtiProvX.length());
   }
   
     /**
	 * 	Update MedPmtiProvX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMedPmtiProvX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,medPmtiProvX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MedPmtiProvX with another Field
	 *	@param value
	 */
   public void setMedPmtiProvX(Field source) {
   	replace(source,0,source.length(),medPmtiProvX.begin,medPmtiProvX.length());
   }  
   
     /**
	 * 	Update MedPmtiProvX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMedPmtiProvX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,medPmtiProvX.begin,medPmtiProvX.length());
   }
   
     /**
	 * 	Update MedPmtiProvX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMedPmtiProvX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,medPmtiProvX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of medPmtiProvTin
	 *	@return medPmtiProvTin
	 */
	public long getMedPmtiProvTin() throws CFException {
       if (isMedPmtiProvTinModified()) { 
           medPmtiProvTin = refreshMedPmtiProvTin();
        }
   		return medPmtiProvTin;
	}
	

	
	   
	/**
	 * 	Update MedPmtiProvTin with the passed value
	 *  Corresponding COBOL Variable is MED-PMTI-PROV-TIN
	 *	@param number
	 */
	public void setMedPmtiProvTin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    medPmtiProvTin = checkMedPmtiProvTinMaxLimit(number); 
		serializeMedPmtiProvTin(medPmtiProvTin);
	}
	

	/**
	 * 	Update MedPmtiProvTin with the passed value
	 *	@param value (String or char[])
	 */
	public void setMedPmtiProvTin(char[] value) throws CFException {
		 medPmtiProvTin = serializeMedPmtiProvTin(value);
	}
	/**
	 * 	Update MedPmtiProvTin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMedPmtiProvTinString(char[] value) throws CFException {
		 setMedPmtiProvTin(value);
	}
	/**
	 *	Returns the value of medPmtiSpecPayeeX
	 *	@return medPmtiSpecPayeeX
	 */   
	 public MedPmtiSpecPayeeX getMedPmtiSpecPayeeX() {
   	return medPmtiSpecPayeeX;
   }
   /**
	* 	Update MedPmtiSpecPayeeX with the passed value
	*   Corresponding COBOL Variable is MED-PMTI-SPEC-PAYEE-X
	*	@param value
	*/
   public void setMedPmtiSpecPayeeX(char[] value) {
      medPmtiSpecPayeeX.setString(value); 
   }   
    
     /**
	 * 	Update MedPmtiSpecPayeeX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMedPmtiSpecPayeeX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,medPmtiSpecPayeeX.begin,medPmtiSpecPayeeX.length());
   }
   
     /**
	 * 	Update MedPmtiSpecPayeeX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMedPmtiSpecPayeeX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,medPmtiSpecPayeeX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MedPmtiSpecPayeeX with another Field
	 *	@param value
	 */
   public void setMedPmtiSpecPayeeX(Field source) {
   	replace(source,0,source.length(),medPmtiSpecPayeeX.begin,medPmtiSpecPayeeX.length());
   }  
   
     /**
	 * 	Update MedPmtiSpecPayeeX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMedPmtiSpecPayeeX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,medPmtiSpecPayeeX.begin,medPmtiSpecPayeeX.length());
   }
   
     /**
	 * 	Update MedPmtiSpecPayeeX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMedPmtiSpecPayeeX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,medPmtiSpecPayeeX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of medPmtiSpecPayeeTin
	 *	@return medPmtiSpecPayeeTin
	 */
	public long getMedPmtiSpecPayeeTin() throws CFException {
       if (isMedPmtiSpecPayeeTinModified()) { 
           medPmtiSpecPayeeTin = refreshMedPmtiSpecPayeeTin();
        }
   		return medPmtiSpecPayeeTin;
	}
	

	
	   
	/**
	 * 	Update MedPmtiSpecPayeeTin with the passed value
	 *  Corresponding COBOL Variable is MED-PMTI-SPEC-PAYEE-TIN
	 *	@param number
	 */
	public void setMedPmtiSpecPayeeTin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    medPmtiSpecPayeeTin = checkMedPmtiSpecPayeeTinMaxLimit(number); 
		serializeMedPmtiSpecPayeeTin(medPmtiSpecPayeeTin);
	}
	

	/**
	 * 	Update MedPmtiSpecPayeeTin with the passed value
	 *	@param value (String or char[])
	 */
	public void setMedPmtiSpecPayeeTin(char[] value) throws CFException {
		 medPmtiSpecPayeeTin = serializeMedPmtiSpecPayeeTin(value);
	}
	/**
	 * 	Update MedPmtiSpecPayeeTin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMedPmtiSpecPayeeTinString(char[] value) throws CFException {
		 setMedPmtiSpecPayeeTin(value);
	}

	
	
	

		public static int getMedPmtiVariableDetailDataFieldLength() {
			return MED_PMTI_VARIABLE_DETAIL_DATA_LENGTH;
		}

}
  
