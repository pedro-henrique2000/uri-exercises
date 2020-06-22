package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double value = sc.nextDouble();
		int value1 = (int) value;
		double decimalPart = value - value1;
		int coins = 0;
		System.out.println("NOTAS:");
		System.out.println(value1 / 100 + " nota(s) de R$ 100.00");
		value1 %= 100;
		System.out.println(value1 / 50 + " nota(s) de R$ 50.00");
		value1 %= 50;
		System.out.println(value1 / 20 + " nota(s) de R$ 20.00");
		value1 %= 20;
		System.out.println(value1 / 10 + " nota(s) de R$ 10.00");
		value1 %= 10;
		System.out.println(value1 / 5 + " nota(s) de R$ 5.00");
		value1 %= 5;
		System.out.println(value1 / 2 + " nota(s) de R$ 2.00");
		value1 %= 2;
		
		
		System.out.println("MOEDAS: ");
		int moedaUm = value1 == 1 ? 1 : 0;
		System.out.println(moedaUm + " moeda(s) de R$ 1.00");
		coins = (int) (decimalPart / 0.5);
		System.out.printf("%d moeda(s) de R$ 0.50%n", coins);
		decimalPart %= 0.5;
		coins = (int) (decimalPart / 0.25);
		System.out.printf("%d moeda(s) de R$ 0.25%n", coins);
		decimalPart %= 0.25;
		coins = (int) (decimalPart / 0.10);
		System.out.printf("%d moeda(s) de R$ 0.10%n", coins);
		decimalPart %= 0.10;
		coins = (int) (decimalPart / 0.05);
		System.out.printf("%d moeda(s) de R$ 0.05%n", coins);
		decimalPart %= 0.05;
		coins = (int) (decimalPart / 0.01);
		System.out.printf("%d moeda(s) de R$ 0.01%n", coins);
		sc.close();
	}
}
