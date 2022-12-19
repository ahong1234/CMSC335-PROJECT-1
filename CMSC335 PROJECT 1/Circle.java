/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the circle class.
 */
public class Circle extends TwoDimensionalShape {
	
	double radius;
	
	// constructor
	Circle(double r) {
		super(r, "Circle");
		radius = r;
	}
	
	@Override
	double area() {
		return Math.PI * (Math.pow(radius, 2));
	}
	
	
	
	
}
