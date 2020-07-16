package app;

import java.util.Scanner;

public class Uri1164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			int sum = 0;
			for (int j = 1; j < number; j++) {
				if (number % j == 0) {
					sum += j;
				}
			}
			if (sum == number) {
				System.out.printf("%d eh perfeito%n", number);
			} else {
				System.out.printf("%d nao eh perfeito%n", number);
			}

		}
		sc.close();

	}

}
