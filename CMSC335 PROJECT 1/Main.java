/*
 * FileName: Main.java
 * Due Date: 08/30/22
 * Author: Alex Hong
 * Description: The driver class to run the program, define the prompts 
 * for the input. 
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void makeCircle() {
		Double radius;
			System.out.print("\nenter the radius of the circle: ");
			radius = getInput("enter the radius of the circle: ");
			Circle newCirc = new Circle(radius);
			newCirc.displayArea();
			cont();
	}
	
	public static void makeRectangle() {
		Double length;
		Double width;
			System.out.print("\nenter the length of the rectangle: ");
			length = getInput("enter the length of the rectangle: ");
			System.out.print("enter the width of the rectangle: ");
			width = getInput("enter the width of the rectangle: ");
			Rectangle newRect = new Rectangle(length, width);
			newRect.displayArea();
			cont();
	}
	
	public static void makeSquare() {
		Double edge;
			System.out.print("\nenter the length of the square: ");
			edge = getInput("enter the edge length of the square: ");
			
			Square newSquare = new Square(edge);
			newSquare.displayArea();
			cont();
	}
	
	public static void makeTriangle() {
		Double height;
		Double width;
			System.out.print("\nenter the height of the triangle: ");
			height = getInput("enter the height of the triangle: ");
			System.out.print("enter the base of the triangle: ");
			width = getInput("enter the base of the triangle: ");
			Triangle newTriangle = new Triangle(height, width);
			newTriangle.displayArea();
			cont();
	}
	
	public static void makeSphere() {
		Double radius;
			System.out.print("\nenter the radius of the sphere: ");
			radius = getInput("enter the radius of the sphere: ");
			
			Sphere newSphere = new Sphere(radius);
			newSphere.displayVolume();
			cont();
	}
	
	public static void makeCube() {
		Double edge;
		
		System.out.print("\nenter the edge length of the cube: ");
		edge = getInput("enter the edge length of the cube: ");
			
		Cube newCube = new Cube(edge);
		newCube.displayVolume();
		cont();
}
	
	public static void makeCone() {
			Double radius;
			Double height;
			System.out.print("\nenter the radius of the cone: ");
			radius = getInput("enter the radius of the cone ");
			System.out.print("enter the height of the cone: ");
			height = getInput("enter the height of the cone: ");	
			Cone newCone = new Cone(radius, height);
			newCone.displayVolume();
			cont();
	}
	
	public static void makeCylinder() {
		Double radius;
		Double height;
		System.out.print("\nenter the radius of the cylinder: ");
		radius = getInput("enter the radius of the cylinder: ");
		System.out.print("enter the height of the cylinder: ");
		height = getInput("enter the height of the cylinder: ");	
		Cylinder newCylinder = new Cylinder(radius, height);
		newCylinder.displayVolume();
		cont();
	}
	
	public static void makeTorus() {
		Double majorRadius;
		Double minorRadius;
		boolean flag = false;
		while (!flag) {
			System.out.print("\nenter the major radius of the torus: ");
			majorRadius = getInput("enter the major radius of the torus: ");
			System.out.print("enter the minor radius of the torus: ");
			minorRadius = getInput("enter the minor radius of the torus: ");	
			if (minorRadius >= majorRadius) {
				System.out.println("minor radius can't be bigger than or equal to major radius. try again");
			}
			else {
				Torus newTorus = new Torus(majorRadius, minorRadius);
				newTorus.displayVolume();
				break;
			}
		}
		cont();
	}
	
	// define how to get input from scanner
	public static Double getInput(String measurement) {
		double output = 0;
		boolean flag = false;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!flag) {
			try {		
				output = sc.nextDouble();
				if (output > 0) {
				flag = true;
				}
				else {
					System.out.print("number must be above 0. " + measurement);
				}
			
			}
			catch (InputMismatchException e) {
				System.out.print("invalid input (numbers only). " + measurement);
				sc.nextLine();
			}
		}
		return output;
	}
	
	// ask the user if they want to continue or exit
	public static void cont() {
		@SuppressWarnings("resource")
		Scanner contScan = new Scanner(System.in);
		boolean flag = false;
		String choice;
		while (!flag) {
			System.out.println("Do you want to continue? Y/N");
			choice = contScan.next();
			choice = choice.toUpperCase();
			if (choice.equals("Y")) {
				System.out.println();
				break;
			}
			else if (choice.equals("N")) {
				//contScan.close();
				SimpleDateFormat formatter= new SimpleDateFormat("MMM dd 'at' HH:mm a");
				Date date = new Date(System.currentTimeMillis());
				System.out.println("Thank you for using the program. Today is " + formatter.format(date));
				System.exit(0);
			}
			else {
				System.out.println("invalid input. ");
			}
		}
		
	}
	
	// show the choices for the user
	public static void displayMenu() {
		System.out.println("********* SHAPE MAKER *********");
		System.out.println("Select a shape: ");
		System.out.println("1. Make a Circle\n"
						 + "2. Make a Rectangle\n"
						 + "3. Make a Square\n"
						 + "4. Make a Triangle\n"
						 + "5. Make a Sphere\n"
						 + "6. Make a Cube\n"
						 + "7. Make a Cone\n"
						 + "8. Make a Cylinder\n"
						 + "9. Make a Torus\n"
						 + "10. Exit the program\n");
		System.out.print("Enter your selection: ");
	}
	
	// process the user choice and create the corresponding object
	public static void processChoice(int s) {
		
			switch (s) {
				case 1:
					makeCircle();
					break;
				case 2:
					makeRectangle();
					break;
				case 3:
					makeSquare();
					break;
				case 4:
					makeTriangle();
					break;
				case 5:
					makeSphere();
					break;
				case 6:
					makeCube();
					break;
				case 7:
					makeCone();
					break;
				case 8:
					makeCylinder();
					break;
				case 9:
					makeTorus();
					break;
			}
		}
		
	// run the menu and take user input
	// process the exit choice
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		boolean flag = false;
		int selection;
		while (!flag) {
			displayMenu();
			try {
				selection = stdin.nextInt();
				if (selection == 10) {
					SimpleDateFormat formatter= new SimpleDateFormat("MMM dd 'at' HH:mm a");
					Date date = new Date(System.currentTimeMillis());
					System.out.println("Thank you for using the program. Today is " + formatter.format(date));
					System.exit(0);
					
				}
				processChoice(selection);
			}
			catch (InputMismatchException e) {
				System.out.println("invalid choice. please enter a # between 1 and 10.\n");
				stdin.nextLine();
			}
		}
		stdin.close();	
		
		
	}
}
