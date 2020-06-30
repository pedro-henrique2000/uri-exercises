package app;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Uri1117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		double count = 0;
		double number = 0;
		double total = 0;

		while (count < 2) {
			number = sc.nextDouble();
			if (number >= 0 && number <= 10) {
				total += number;
				count++;
			} else
				System.out.println("nota invalida");
		}

		System.out.println("media = " + format.format(total / count));

		sc.close();
		

	}

}
