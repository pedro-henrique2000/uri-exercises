package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] array = new double[12][12];
		DecimalFormat format = new DecimalFormat("0.0");
		Scanner sc = new Scanner(System.in);
		double number;
		int column = sc.nextInt();
		String op = sc.next();
		double total = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				number = sc.nextDouble();
				array[i][j] = number;
			}
		}

		for (int i = 0; i < array.length; i++) {
			total += array[i][column];
		}

		System.out.printf("%.1f%n", (op.equalsIgnoreCase("s") ? total : total / array.length));

		sc.close();

	}

}
