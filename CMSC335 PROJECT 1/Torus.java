/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the torus class.
 */
public class Torus extends ThreeDimensionalShape {
	double majorRadius;
	double minorRadius;
	
	Torus(double maj, double min) {
		super(3, "Torus");
		majorRadius = maj;
		minorRadius = min;
	}
	
	@Override
	double volume() {
		return (Math.PI * (Math.pow(minorRadius, 2) * (2 * Math.PI * majorRadius)));
	}
}
