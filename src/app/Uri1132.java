package app;

import java.util.Scanner;

public class Uri1132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;

		if (a < b) {
			for (int i = a; i <= b; i++) {
				if (i % 13 != 0) {
					sum += i;
				}
			}
		} else {
			for (int i = b; i <= a; i++) {
				if (i % 13 != 0) {
					sum += i;
				}
			}
		}

		if (a == b) {
			sum = a % 13 != 0 ? sum += a : sum;
		}

		System.out.println(sum);

	}

}
