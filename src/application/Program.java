package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

/*
 * Iremos resolver um problema sem POO. Depois modificaremos para que utilize POO.
 * "Fazer um programa para ler as medidas dos lados de dois triangulos X e Y (suponha medidas validas). Em seguida mostrar o valor
 * das areas dos dois triangulos e dizer qual dos dois triangulos possui a maior area.
 * A formula para calcular a area de um triangulo a partir das medidas de seus lados a, b e c é a seguinte (formula
 * de Heron):
 * area = raiz quadrada (p *(p -a)*(p-b)*(p-c)), onde p = (a+b+c)/2
 * 
 * 
 * 
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if ( areaX >  areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");

		}

		sc.close();
	}

}
