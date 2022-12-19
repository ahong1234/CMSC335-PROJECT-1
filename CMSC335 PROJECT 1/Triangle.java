/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the triangle class.
 */
public class Triangle extends TwoDimensionalShape{
	

	double height;
	double width;
	
	Triangle(double d1, double d2) {
		super(d1, d2, "Triangle");
		height = d1;
		width = d2;
		
	}
	
	@Override
	double area() {
		return (height * width)/2;
	}
}
