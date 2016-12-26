package ua.gudko.test.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle extends Shape implements Interface_Triangle{
	
	private double a,b,c;
	
	public Triangle(){
			this.a = 0;
			this.b = 0;
			this.c = 0;
	}
	
	public void setSide(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double Perimeter()  throws NumberFormatException, IOException{
		
		System.out.println("Введіть довжину сторін трикутника: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		setSide(Double.parseDouble(reader.readLine()), Double.parseDouble(reader.readLine()), Double.parseDouble(reader.readLine()));
		P = (a+b+c);
		return P;
	}		
}
