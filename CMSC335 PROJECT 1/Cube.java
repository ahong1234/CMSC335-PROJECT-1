/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the Cube class.
 */
public class Cube extends ThreeDimensionalShape {
	double edge;
	
	Cube(double e){
		super(3, "Cube");
		edge = e;
	}
	
	
	@Override
	double volume() {
		return Math.pow(edge, 3);
	}
}
