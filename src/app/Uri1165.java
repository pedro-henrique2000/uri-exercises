package app;

import java.util.Scanner;

public class Uri1165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			if (isPrime(number)) {
				System.out.printf("%d eh primo%n", number);
			} else {
				System.out.printf("%d nao eh primo%n", number);
			}

		}

		sc.close();

	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;

	}

}
