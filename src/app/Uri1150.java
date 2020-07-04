package app;

import java.util.Scanner;

public class Uri1150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int z = sc.nextInt();
		int count = 0;
		int sum = 0;

		while (z <= x) {
			z = sc.nextInt();
		}

		while (sum < z) {
			sum += x;
			count++;
			x++;
		}

		System.out.println(count);

		sc.close();

	}

}
