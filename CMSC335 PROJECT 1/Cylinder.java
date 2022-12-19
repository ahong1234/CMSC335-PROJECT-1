/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the cylinder class.
 */
public class Cylinder extends ThreeDimensionalShape {
	double radius;
	double height;
	
	// constructor
	Cylinder(double r, double h) {
		super(3, "Cylinder");
		radius = r;
		height = h;
	}
	
	@Override
	double volume() {
		return (Math.PI * Math.pow(radius, 2) * height);
	}
}
