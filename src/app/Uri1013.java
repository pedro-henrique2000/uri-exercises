package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = a;
		if (maior < b) {
			maior = b;
		}
		if (maior < c) {
			maior = c;
		}
		
		System.out.printf("%d eh o maior%n", maior);
		sc.close();

	}

}
