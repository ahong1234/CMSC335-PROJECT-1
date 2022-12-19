/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the square class.
 */
public class Square extends TwoDimensionalShape {

	double edge;
	
	
	
	Square(double d1) {
		super(d1,"Square");
		edge = d1;
		
		
	}
	
	@Override
	double area() {
		return edge * edge;
	}
	
	
}
