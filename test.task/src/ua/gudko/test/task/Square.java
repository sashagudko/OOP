package ua.gudko.test.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Square extends Shape implements Interface_Square {
	private double a;
	
	public Square(){
		this.a = 0;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public double Perimeter() throws NumberFormatException, IOException{
		
		System.out.println("Введіть довжину сторони квадрату: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		setA(Double.parseDouble(reader.readLine()));
		
		P = (a*4);
		return P;
	}	
	
}