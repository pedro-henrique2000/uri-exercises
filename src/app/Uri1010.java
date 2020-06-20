package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int codeA = sc.nextInt();
		int qntdA = sc.nextInt();
		double priceA = sc.nextDouble();

		int codeB = sc.nextInt();
		int qntdB = sc.nextInt();
		double priceB = sc.nextDouble();

		System.out.printf("VALOR A PAGAR: R$ %.2f", (qntdA * priceA) + (qntdB * priceB));

		sc.close();

	}

}
