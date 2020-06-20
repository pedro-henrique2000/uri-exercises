package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.printf("DIFERENCA = %d%n", ((sc.nextInt() * sc.nextInt()) - (sc.nextInt() * sc.nextInt())));

		sc.close();

	}

}
