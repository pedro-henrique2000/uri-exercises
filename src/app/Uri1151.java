package app;

import java.util.Scanner;

public class Uri1151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = 0;
		int y = 1;
		int sum = 0;

		System.out.print(x + " " + y + " ");

		for (int i = 0; i < n - 2; i++) {
			sum = x + y;
			x = y;
			y = sum;
			System.out.print(sum);
			if (i != n - 3) {
				System.out.print(" ");
			}
		}

		sc.close();

	}

}
