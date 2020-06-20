package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", sc.nextInt(), sc.nextDouble() * sc.nextDouble());
		sc.close();

	}

}
