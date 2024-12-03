package com.cloudframe.app.dto.trdpb006;

/**
*  The class PageHeader is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:37. using version 5.0.0.162
**/


import com.cloudframe.app.dto.serialize.trdpb006.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PageHeader extends PageHeaderSerialized { 
   


						private char[] phHeaderFlg = Field.fillLowValue(32);

						private char[] phCustomer = Field.fillLowValue(12);


						private char[] phCustomerDesc = Field.fillLowValue(30);



								private char[] phPagenum = Field.fillLowValue(3);
	
	/**
	* Constructor for PageHeader
	**/
    public PageHeader() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(55)
             , getStartOffset() + 0
             ,55
             );
       replaceValue( // serialize and save the value
             (" : ").toCharArray()
             , getStartOffset() + 99
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 132
             ,17
             );
       replaceValue( // serialize and save the value
             ("Page : ").toCharArray()
             , getStartOffset() + 149
             ,7
             );
    }


 

	/**
	 *	Returns the value of phHeaderFlg
	 *	@return phHeaderFlg
	 */
   public char[] getPhHeaderFlg() throws CFException{
     if (isPhHeaderFlgModified()) { 
        phHeaderFlg = refreshPhHeaderFlg();
     }
   		return phHeaderFlg;
   }

  
	/**
	*  set variable phHeaderFlg
	*  Corresponding COBOL Variable is WS-PH-HEADER-FLG
	*  @param value
	**/
   public void setPhHeaderFlg(char[] value) {
      phHeaderFlg = checkPhHeaderFlgConstraints(value);
      serializePhHeaderFlg(phHeaderFlg);
   } 

     /**
	 * 	Update PhHeaderFlg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPhHeaderFlg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPhHeaderFlg,phHeaderFlg.length);
   	
   }
   
   public void setPhHeaderFlg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPhHeaderFlg,phHeaderFlg.length);
   	
   }
   
     /**
	 * 	Update PhHeaderFlg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPhHeaderFlg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPhHeaderFlg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PhHeaderFlg with another Field
	 *	@param value
	 */
   public void setPhHeaderFlg(Field source) {
       replace(source,0,source.length(),beginPhHeaderFlg,PH_HEADER_FLG_LEN);
   	
   }  
   
     /**
	 * 	Update PhHeaderFlg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPhHeaderFlg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPhHeaderFlg,PH_HEADER_FLG_LEN);
   	
   }
   
     /**
	 * 	Update PhHeaderFlg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPhHeaderFlg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPhHeaderFlg+targetIndex,targetLen);
    
   }
	char[] phBuyOrders8888Value = " Buy Orders Report for Client : ".toCharArray();
	/**
	 *	Test condition " Buy Orders Report for Client : " for isPhBuyOrders88()
	 *	@return  Returns true if isPhBuyOrders88() is " Buy Orders Report for Client : "
	 */
   public boolean isPhBuyOrders88() throws CFException {
      return (  compareChars( getPhHeaderFlg() , phBuyOrders8888Value)  == 0  );
   }


	/**
	*  set values " Buy Orders Report for Client : "
	*/
   	public void setPhBuyOrders88True() {  			
    	setPhHeaderFlg( phBuyOrders8888Value);
   	}
	char[] phSellOrders8888Value = "Sell Orders Report for Client : ".toCharArray();
	/**
	 *	Test condition "Sell Orders Report for Client : " for isPhSellOrders88()
	 *	@return  Returns true if isPhSellOrders88() is "Sell Orders Report for Client : "
	 */
   public boolean isPhSellOrders88() throws CFException {
      return (  compareChars( getPhHeaderFlg() , phSellOrders8888Value)  == 0  );
   }


	/**
	*  set values "Sell Orders Report for Client : "
	*/
   	public void setPhSellOrders88True() {  			
    	setPhHeaderFlg( phSellOrders8888Value);
   	}
	/**
	 *	Returns the value of phCustomer
	 *	@return phCustomer
	 */
   public char[] getPhCustomer() throws CFException{
     if (isPhCustomerModified()) { 
        phCustomer = refreshPhCustomer();
     }
   		return phCustomer;
   }

  
	/**
	*  set variable phCustomer
	*  Corresponding COBOL Variable is WS-PH-CUSTOMER
	*  @param value
	**/
   public void setPhCustomer(char[] value) {
      phCustomer = checkPhCustomerConstraints(value);
      serializePhCustomer(phCustomer);
   } 

     /**
	 * 	Update PhCustomer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPhCustomer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPhCustomer,phCustomer.length);
   	
   }
   
   public void setPhCustomer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPhCustomer,phCustomer.length);
   	
   }
   
     /**
	 * 	Update PhCustomer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPhCustomer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPhCustomer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PhCustomer with another Field
	 *	@param value
	 */
   public void setPhCustomer(Field source) {
       replace(source,0,source.length(),beginPhCustomer,PH_CUSTOMER_LEN);
   	
   }  
   
     /**
	 * 	Update PhCustomer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPhCustomer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPhCustomer,PH_CUSTOMER_LEN);
   	
   }
   
     /**
	 * 	Update PhCustomer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPhCustomer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPhCustomer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of phCustomerDesc
	 *	@return phCustomerDesc
	 */
   public char[] getPhCustomerDesc() throws CFException{
     if (isPhCustomerDescModified()) { 
        phCustomerDesc = refreshPhCustomerDesc();
     }
   		return phCustomerDesc;
   }

  
	/**
	*  set variable phCustomerDesc
	*  Corresponding COBOL Variable is WS-PH-CUSTOMER-DESC
	*  @param value
	**/
   public void setPhCustomerDesc(char[] value) {
      phCustomerDesc = checkPhCustomerDescConstraints(value);
      serializePhCustomerDesc(phCustomerDesc);
   } 

     /**
	 * 	Update PhCustomerDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPhCustomerDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPhCustomerDesc,phCustomerDesc.length);
   	
   }
   
   public void setPhCustomerDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPhCustomerDesc,phCustomerDesc.length);
   	
   }
   
     /**
	 * 	Update PhCustomerDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPhCustomerDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPhCustomerDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PhCustomerDesc with another Field
	 *	@param value
	 */
   public void setPhCustomerDesc(Field source) {
       replace(source,0,source.length(),beginPhCustomerDesc,PH_CUSTOMER_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update PhCustomerDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPhCustomerDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPhCustomerDesc,PH_CUSTOMER_DESC_LEN);
   	
   }
   
     /**
	 * 	Update PhCustomerDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPhCustomerDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPhCustomerDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of phPagenum
	 *	@return phPagenum
	 */
   public char[] getPhPagenum() throws CFException{
     if (isPhPagenumModified()) { 
        phPagenum = refreshPhPagenum();
     }
   		return phPagenum;
   }

  
	/**
	*  set variable phPagenum
	*  Corresponding COBOL Variable is WS-PH-PAGENUM
	*  @param value
	**/
   public void setPhPagenum(char[] value) {
      phPagenum = checkPhPagenumConstraints(value);
      serializePhPagenum(phPagenum);
   } 

     /**
	 * 	Update PhPagenum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPhPagenum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPhPagenum,phPagenum.length);
   	
   }
   
   public void setPhPagenum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPhPagenum,phPagenum.length);
   	
   }
   
     /**
	 * 	Update PhPagenum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPhPagenum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPhPagenum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PhPagenum with another Field
	 *	@param value
	 */
   public void setPhPagenum(Field source) {
       replace(source,0,source.length(),beginPhPagenum,PH_PAGENUM_LEN);
   	
   }  
   
     /**
	 * 	Update PhPagenum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPhPagenum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPhPagenum,PH_PAGENUM_LEN);
   	
   }
   
     /**
	 * 	Update PhPagenum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPhPagenum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPhPagenum+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPageHeaderFieldLength() {
			return PAGE_HEADER_LENGTH;
		}

}
  
