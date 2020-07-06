package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double value = sc.nextDouble();
		int qntd = 0;
		double[] notes = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00 };
		double[] coins = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };
		value += 0.001;

		System.out.println("NOTAS:");
		for (double x : notes) {
			qntd = (int) (value / x);
			System.out.printf("%d nota(s) de R$ %.2f%n", qntd, x);
			value %= x;
		}

		System.out.println("MOEDAS:");
		for (double x : coins) {
			qntd = (int) (value / x);
			System.out.printf("%d moeda(s) de R$ %.2f%n", qntd, x);
			value %= x;
		}

		sc.close();

	}
}
