/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the rectangle class.
 */
public class Rectangle extends TwoDimensionalShape{
	double length;
	double width;
	
	
	
	Rectangle(double d1, double d2) {
		super(d1, d2, "Rectangle");
		length = d1;
		width = d2;
		
	}
	
	@Override
	double area() {
		return length * width;
	}
}
