package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		double a = 0.00;
		int count = 0;
		double total = 0.00;
		int choice = 0;

		do {
			while (count < 2) {
				a = sc.nextDouble();
				if (a > 10 || a < 0) {
					System.out.println("nota invalida");
				} else {
					count++;
					total += a;
				}

				if (count == 2)
					System.out.println("media = " + format.format(total / 2.0));
			}
			choice = 0;
			count = 0;
			total = 0;
			while (choice > 2 || choice < 1) {
				System.out.println("novo calculo (1-sim 2-nao)");
				choice = sc.nextInt();
			}

		} while (choice == 1);

	}
}
