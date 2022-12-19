/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the sphere class.
 */
public class Sphere extends ThreeDimensionalShape {
	double radius;
	
	Sphere (double r) {
		super(3, "Sphere");
		radius = r;
	}
	
	@Override
	double volume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}
	
}
