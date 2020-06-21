package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int radius = sc.nextInt();
		double VOLUME = 4 * 3.14159 * Math.pow(radius, 3) / 3;
		System.out.printf("VOLUME = %.3f%n", VOLUME);

		sc.close();

	}

}
