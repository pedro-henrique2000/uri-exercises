package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		System.out.printf(
				"TRIANGULO: %.3f%n" + "CIRCULO: %.3f%n" + "TRAPEZIO: %.3f%n" + "QUADRADO: %.3f%n" + "RETANGULO: %.3f%n",
				(A * C) / 2, 3.14159 * Math.pow(C, 2), ((A + B) * C) / 2, Math.pow(B, 2), A * B);

		sc.close();

	}

}
