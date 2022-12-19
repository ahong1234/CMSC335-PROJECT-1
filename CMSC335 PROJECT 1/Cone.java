/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the Cone class.
 */
public class Cone extends ThreeDimensionalShape {
	double radius;
	double height;
	
	// constructor
	Cone (double r, double h) {
		super(3, "Cone");
		radius = r;
		height = h;
	}
	
	@Override
	double volume() {
		return  Math.PI * Math.pow(radius, 2) * (height / 3.0);
	}
}
