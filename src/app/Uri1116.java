package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");
		int number = sc.nextInt();
		int a = 0;
		int b = 0;

		for (int i = 0; i <= number; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (b == 0)
				System.out.println("divisao impossivel");
			else {
				double result = (double) a / b;
				System.out.println(format.format(result));
			}
		}

		sc.close();

	}

}
