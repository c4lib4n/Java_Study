package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double areaX, areaY;
		Triangle  x,y;
		x = new Triangle();
		y = new Triangle();
		
		
		
		System.out.println("Enter the mesure for the triangule X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the mesure for the triangule Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("Triangule X area: %.4f%n", areaX);
		System.out.printf("Triangule Y area: %.4f%n", areaY);
		
		if(areaX > areaY){
			System.out.println("Large area X: " + areaX);
		}else{
			System.out.println("Large area Y: " + areaY);
		}
		
		
		
		sc.close();
	}

}
