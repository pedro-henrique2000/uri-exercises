package app;

import java.util.Scanner;

public class Uri1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = 0;
		int c = 0;

		while (a != 0) {
			b = sc.nextInt();
			c = sc.nextInt();
			int size = 100 * a * b / c;
			System.out.println((int) Math.sqrt(size));

			a = sc.nextInt();

		}

		sc.close();

	}

}
