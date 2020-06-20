package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String name = sc.next();
		System.out.printf("TOTAL = R$ %.2f%n", sc.nextDouble() + (sc.nextDouble() * 0.15));
		sc.close();
	}

}
