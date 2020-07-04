package app;

import java.util.Scanner;

public class Uri1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;

		while (n <= 0) {
			n = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			sum += a;
			a++;
		}

		System.out.println(sum);
		sc.close();

	}

}
