package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double number = 0;
		int count = 0;

		for (int i = 0; i < 6; i++) {
			number = sc.nextDouble();
			count += number >= 0 ? 1 : 0;
		}

		System.out.println(count + " valores positivos");

		sc.close();

	}

}
