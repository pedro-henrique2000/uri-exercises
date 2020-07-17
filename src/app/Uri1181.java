package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] array = new double[12][12];
		DecimalFormat format = new DecimalFormat("0.0");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		String c = sc.next();
		double total = 0.0;
		double number = 0.0;

		for (int i = 0; array.length > i; i++) {
			for (int j = 0; j < array[i].length; j++) {
				number = sc.nextDouble();
				array[i][j] = number;
			}
		}

		for (double x : array[line]) {
			total += x;
		}

		switch (c) {
		case "S":
			System.out.println(total);
			break;
		case "M":
			System.out.println(format.format(total / array[line].length));
			break;
		}

		sc.close();

	}

}
