package com.cloudframe.app.dto.o529351u;

/**
*  The class Point is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Point extends PointSerialized { 
   

								private int point1;

								private int point2;

								private int point3;

								private int point4;
	
	/**
	* Constructor for Point
	**/
    public Point() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Point. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Point(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of point1
	 *	@return point1
	 */
	public int getPoint1() throws CFException {
       if (isPoint1Modified()) { 
           point1 = refreshPoint1();
        }
   		return point1;
	}
	

	
	   
	/**
	 * 	Update Point1 with the passed value
	 *  Corresponding COBOL Variable is WS-POINT-1
	 *	@param number
	 */
	public void setPoint1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    point1 = checkPoint1MaxLimit(number); 
		serializePoint1(point1);
	}
	

	public void setPoint1(long number) {
	    number = checkPoint1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPoint1((int)number);
	}
	
	/**
	 * 	Update Point1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPoint1(char[] value) throws CFException {
		 point1 = serializePoint1(value);
	}
	/**
	 * 	Update Point1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPoint1String(char[] value) throws CFException {
		 setPoint1(value);
	}
	/**
	 *	Returns the value of point2
	 *	@return point2
	 */
	public int getPoint2() throws CFException {
       if (isPoint2Modified()) { 
           point2 = refreshPoint2();
        }
   		return point2;
	}
	

	
	   
	/**
	 * 	Update Point2 with the passed value
	 *  Corresponding COBOL Variable is WS-POINT-2
	 *	@param number
	 */
	public void setPoint2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    point2 = checkPoint2MaxLimit(number); 
		serializePoint2(point2);
	}
	

	public void setPoint2(long number) {
	    number = checkPoint2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPoint2((int)number);
	}
	
	/**
	 * 	Update Point2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPoint2(char[] value) throws CFException {
		 point2 = serializePoint2(value);
	}
	/**
	 * 	Update Point2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPoint2String(char[] value) throws CFException {
		 setPoint2(value);
	}
	/**
	 *	Returns the value of point3
	 *	@return point3
	 */
	public int getPoint3() throws CFException {
       if (isPoint3Modified()) { 
           point3 = refreshPoint3();
        }
   		return point3;
	}
	

	
	   
	/**
	 * 	Update Point3 with the passed value
	 *  Corresponding COBOL Variable is WS-POINT-3
	 *	@param number
	 */
	public void setPoint3(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    point3 = checkPoint3MaxLimit(number); 
		serializePoint3(point3);
	}
	

	public void setPoint3(long number) {
	    number = checkPoint3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPoint3((int)number);
	}
	
	/**
	 * 	Update Point3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPoint3(char[] value) throws CFException {
		 point3 = serializePoint3(value);
	}
	/**
	 * 	Update Point3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPoint3String(char[] value) throws CFException {
		 setPoint3(value);
	}
	/**
	 *	Returns the value of point4
	 *	@return point4
	 */
	public int getPoint4() throws CFException {
       if (isPoint4Modified()) { 
           point4 = refreshPoint4();
        }
   		return point4;
	}
	

	
	   
	/**
	 * 	Update Point4 with the passed value
	 *  Corresponding COBOL Variable is WS-POINT-4
	 *	@param number
	 */
	public void setPoint4(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    point4 = checkPoint4MaxLimit(number); 
		serializePoint4(point4);
	}
	

	public void setPoint4(long number) {
	    number = checkPoint4MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPoint4((int)number);
	}
	
	/**
	 * 	Update Point4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPoint4(char[] value) throws CFException {
		 point4 = serializePoint4(value);
	}
	/**
	 * 	Update Point4 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPoint4String(char[] value) throws CFException {
		 setPoint4(value);
	}

	
	
	

		public static int getPointFieldLength() {
			return POINT_LENGTH;
		}

}
  
