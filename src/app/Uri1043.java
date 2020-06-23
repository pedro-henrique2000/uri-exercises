package app;

import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		boolean isTriangle;

		isTriangle = A + B > C && B + C > A && A + C > B ? true : false;

		if (isTriangle) {
			System.out.printf("Perimetro = %.1f%n", A + B + C);
		} else {
			System.out.printf("Area = %.1f%n", ((A + B) * C) / 2);
		}

		sc.close();

	}

}
