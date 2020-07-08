package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double a = 0;
		double b = 0;

		for (int i = 0; i <= number; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			if (b != 0) {
				System.out.printf("%.1f%n", a / b);
			} else {
				System.out.println("divisao impossivel");
			}
		}

		sc.close();

	}

}
