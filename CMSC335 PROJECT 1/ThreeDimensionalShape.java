/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: Define the 3 dimensional shape class.
 */
public class ThreeDimensionalShape extends Shape {
	String type;
	double dim1;
	double dim2;
	double dim3;
	

	
	// cylinder, cone, torus constructor
	ThreeDimensionalShape(double d1, double d2, String t) {
		super(3);
		type = t;
		dim1 = d1;
		dim2 = d2;
		
	}
	
	// sphere constructor
	ThreeDimensionalShape(double d1, String t) {
		super(3);
		type = t;
		dim1 = d1;
	}
	
	double volume() {
		System.out.println("Area for 3d shape is undefined.");
		return 0;
	}
	
	void displayVolume() {
		System.out.println("Volume of " + this.type + ": " + String.format("%.2f", this.volume()));
		System.out.println();
	}
}
