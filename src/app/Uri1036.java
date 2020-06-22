package app;

import java.util.Scanner;

public class Uri1036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double divisor = A * 2;
		double squareRoot = Math.sqrt(Math.pow(B, 2) - 4 * A * C);

		if (divisor == 0 || Double.isNaN(squareRoot)) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f%nR2 = %.5f%n", (-B + squareRoot) / divisor, (-B - squareRoot) / divisor);
		}

	}

}
