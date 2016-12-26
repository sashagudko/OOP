package ua.gudko.test.task;

import java.io.IOException;

public class Main {
	
	public static double countP(Shape i) throws NumberFormatException, IOException {
	     return i.Perimeter();
	    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		Shape square = new Square();
		
		System.out.println("Периметр круга: " + countP(circle));
		System.out.println("Периметр трикутника: " + countP(triangle));
		System.out.println("Периметр квадрата: " + countP(square));
		
		
		
	}
}