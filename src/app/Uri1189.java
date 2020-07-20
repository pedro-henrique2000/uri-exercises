package app;

import java.util.Scanner;

public class Uri1189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] array = new double[12][12];
		Scanner sc = new Scanner(System.in);
		double number;
		double total = 0.0;
		String op = sc.next();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				number = sc.nextDouble();
				array[i][j] = number;
			}
		}

		for (int i = 0; i < array.length - 2; i++) {
			for (int j = 1 + i; j < 11 - i; j++) {
				total += array[j][i];
			}
		}

		System.out.printf("%.1f%n", (op.equalsIgnoreCase("s") ? total : total / 30));

	}

}
