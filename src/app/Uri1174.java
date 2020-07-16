package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] A = new double[100];
		DecimalFormat format = new DecimalFormat("0.0");

		for (int i = 0; A.length > i; i++) {
			A[i] = sc.nextDouble();
			if (A[i] <= 10) {
				System.out.printf("A[%d] = %s%n", i, format.format(A[i]));
			}
		}

		sc.close();

	}

}
