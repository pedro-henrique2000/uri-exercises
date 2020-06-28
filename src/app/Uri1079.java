package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");

		int n = sc.nextInt();
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;

		for (int i = 0; i < n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			System.out.println(format.format(((a * 2) + (b * 3) + (c* 5)) / 10));
		}

		sc.close();

	}

}
