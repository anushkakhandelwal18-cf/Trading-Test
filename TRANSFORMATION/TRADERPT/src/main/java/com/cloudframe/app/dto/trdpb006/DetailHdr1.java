package com.cloudframe.app.dto.trdpb006;

/**
*  The class DetailHdr1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:39. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.trdpb006.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DetailHdr1 extends DetailHdr1Serialized { 
   




						private char[] dh1BuyerSeller = Field.fillLowValue(12);

















	
	/**
	* Constructor for DetailHdr1
	**/
    public DetailHdr1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("Trade ID  ").toCharArray()
             , getStartOffset() + 1
             ,10
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 11
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 24
             ,1
             );
       replaceValue( // serialize and save the value
             ("Exchange    ").toCharArray()
             , getStartOffset() + 25
             ,12
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 37
             ,1
             );
       replaceValue( // serialize and save the value
             ("FIGI ID     ").toCharArray()
             , getStartOffset() + 38
             ,12
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 50
             ,1
             );
       replaceValue( // serialize and save the value
             ("Security Symbol     ").toCharArray()
             , getStartOffset() + 51
             ,20
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 71
             ,1
             );
       replaceValue( // serialize and save the value
             ("Security Description                    ").toCharArray()
             , getStartOffset() + 72
             ,40
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 112
             ,1
             );
       replaceValue( // serialize and save the value
             ("Security Type  ").toCharArray()
             , getStartOffset() + 113
             ,15
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 128
             ,1
             );
       replaceValue( // serialize and save the value
             ("    Quantity").toCharArray()
             , getStartOffset() + 129
             ,12
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 141
             ,1
             );
       replaceValue( // serialize and save the value
             ("Cur").toCharArray()
             , getStartOffset() + 142
             ,3
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 145
             ,1
             );
       replaceValue( // serialize and save the value
             ("      Amount").toCharArray()
             , getStartOffset() + 146
             ,12
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 158
             ,1
             );
    }


 

	/**
	 *	Returns the value of dh1BuyerSeller
	 *	@return dh1BuyerSeller
	 */
   public char[] getDh1BuyerSeller() throws CFException{
     if (isDh1BuyerSellerModified()) { 
        dh1BuyerSeller = refreshDh1BuyerSeller();
     }
   		return dh1BuyerSeller;
   }

  
	/**
	*  set variable dh1BuyerSeller
	*  Corresponding COBOL Variable is WS-DH1-BUYER-SELLER
	*  @param value
	**/
   public void setDh1BuyerSeller(char[] value) {
      dh1BuyerSeller = checkDh1BuyerSellerConstraints(value);
      serializeDh1BuyerSeller(dh1BuyerSeller);
   } 

     /**
	 * 	Update Dh1BuyerSeller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDh1BuyerSeller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDh1BuyerSeller,dh1BuyerSeller.length);
   	
   }
   
   public void setDh1BuyerSeller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDh1BuyerSeller,dh1BuyerSeller.length);
   	
   }
   
     /**
	 * 	Update Dh1BuyerSeller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDh1BuyerSeller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDh1BuyerSeller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dh1BuyerSeller with another Field
	 *	@param value
	 */
   public void setDh1BuyerSeller(Field source) {
       replace(source,0,source.length(),beginDh1BuyerSeller,DH_1_BUYER_SELLER_LEN);
   	
   }  
   
     /**
	 * 	Update Dh1BuyerSeller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDh1BuyerSeller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDh1BuyerSeller,DH_1_BUYER_SELLER_LEN);
   	
   }
   
     /**
	 * 	Update Dh1BuyerSeller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDh1BuyerSeller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDh1BuyerSeller+targetIndex,targetLen);
    
   }
	char[] dh1Buyer8888Value = "Buyer       ".toCharArray();
	/**
	 *	Test condition "Buyer" for isDh1Buyer88()
	 *	@return  Returns true if isDh1Buyer88() is "Buyer"
	 */
   public boolean isDh1Buyer88() throws CFException {
      return (  compareChars( getDh1BuyerSeller() , dh1Buyer8888Value)  == 0  );
   }


	/**
	*  set values "Buyer"
	*/
   	public void setDh1Buyer88True() {  			
    	setDh1BuyerSeller( dh1Buyer8888Value);
   	}
	char[] dh1Seller8888Value = "Seller      ".toCharArray();
	/**
	 *	Test condition "Seller" for isDh1Seller88()
	 *	@return  Returns true if isDh1Seller88() is "Seller"
	 */
   public boolean isDh1Seller88() throws CFException {
      return (  compareChars( getDh1BuyerSeller() , dh1Seller8888Value)  == 0  );
   }


	/**
	*  set values "Seller"
	*/
   	public void setDh1Seller88True() {  			
    	setDh1BuyerSeller( dh1Seller8888Value);
   	}

	
	
	

		public static int getDetailHdr1FieldLength() {
			return DETAIL_HDR_1_LENGTH;
		}

}
  
