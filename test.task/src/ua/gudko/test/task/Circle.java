package ua.gudko.test.task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Circle extends Shape implements Interface_Circle {
	private double r;
	
	public Circle(){
	}
	
	public void setR(double r){
		this.r = r;
	}
	
	public double Perimeter() throws NumberFormatException, IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введіть радіус круга: ");
		setR(Double.parseDouble(reader.readLine()));
		
		P = 2*3.14*r;
		return P;
	}
}
