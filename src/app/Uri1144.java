package app;

import java.util.Scanner;

public class Uri1144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.printf("%d %d %d%n", i, i*i, i*i*i);
			System.out.printf("%d %d %d%n", i, i*i + 1, i*i*i + 1);
		}

		sc.close();

	}

}
