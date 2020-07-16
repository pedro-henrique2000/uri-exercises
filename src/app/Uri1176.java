package app;

import java.util.Scanner;

public class Uri1176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long[] Fib = new long[61];

		Fib[0] = 0;
		Fib[1] = 1;

		for (int i = 2; i < Fib.length; i++) {
			Fib[i] = Fib[i - 1] + Fib[i - 2];
		}

		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int x = sc.nextInt();
			System.out.printf("Fib(%d) = %d%n", x, Fib[x]);
		}

		sc.close();

	}

}
