package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0000");
		double[] N = new double[100];
		double x = sc.nextDouble();
		N[0] = x;
		System.out.printf("N[%d] = %s%n", 0, format.format(N[0]));

		for (int i = 1; i < N.length; i++) {
			N[i] = N[i - 1] / 2;
			System.out.printf("N[%d] = %s%n", i, format.format(N[i]));
		}

		sc.close();
	}

}
