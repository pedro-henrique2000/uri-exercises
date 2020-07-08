package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");

		int T = sc.nextInt();
		int PA = 0;
		int PB = 0;
		double G1 = 0;
		double G2 = 0;

		for (int i = 0; i < T; i++) {
			PA = sc.nextInt();
			PB = sc.nextInt();
			G1 = sc.nextDouble();
			G2 = sc.nextDouble();
			int years = 0;
			double porcent1 = (G1 / 100) + 1.00;
			double porcent2 = (G2 / 100) + 1.00;
			while (PB >= PA) {
				PA *= porcent1;
				PB *= porcent2;
				years++;
				if (years > 100)
					break;
			}

			if (years > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.printf("%d anos.%n", years);
			}

		}

		sc.close();

	}

}
