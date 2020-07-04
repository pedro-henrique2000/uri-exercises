package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		int age = sc.nextInt();
		int count = 0;
		double total = 0;

		while (age > 0) {
			count++;
			total += age;
			age = sc.nextInt();
		}

		System.out.println(format.format(total / count));

	}

}
