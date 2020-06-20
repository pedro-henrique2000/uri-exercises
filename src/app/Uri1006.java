package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int weightA = 2;
		int weightB = 3;
		int weightC = 5;

		double gradeA = sc.nextDouble();
		double gradeB = sc.nextDouble();
		double gradeC = sc.nextDouble();

		double MEDIA = ((gradeA * weightA) + (gradeB * weightB) + (gradeC * weightC)) / (weightA + weightB + weightC);

		if (MEDIA > 10) {
			MEDIA = 10.0;
		}

		System.out.printf("MEDIA = %.1f%n", MEDIA);

		sc.close();

	}

}
