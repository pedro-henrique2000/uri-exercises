package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double weightA = 3.5;
		double weightB = 7.5;
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		double MEDIA = ((a * weightA) + (b * weightB)) / (weightA + weightB);

		if (MEDIA > 10) {
			MEDIA = 10.00000;
		}

		System.out.printf("MEDIA = %.5f %n", MEDIA);

		sc.close();
	}

}
