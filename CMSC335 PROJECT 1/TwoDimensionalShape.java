/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the 2 dimensional shape class.
 */
public class TwoDimensionalShape extends Shape {
	String type;
	double dim1;
	double dim2;
	
	// square, rectangle, and triangle constructor
	TwoDimensionalShape(double d1, double d2, String t) {
		super(2);
		dim1 = d1;
		dim2 = d2;
		type = t;
	}
	
	// circle constructor
	TwoDimensionalShape(double d1, String t) {
		super(2);
		dim1 = d1;	
		type = t;
	}
	
	// method to be overridden
	double area() {
		System.out.println("Area for 2d shape is undefined.");
		return 0;
	}
	
	// display the calculated area
	void displayArea() {
		System.out.println("Area of " + this.type + ": " + String.format("%.2f", this.area()));
		System.out.println();
	}
	
}
