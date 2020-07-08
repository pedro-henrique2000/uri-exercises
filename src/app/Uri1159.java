package app;

import java.util.Scanner;

public class Uri1159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int sum = 0;

		while (x != 0) {
			sum = 0;
			for (int i = 0; i < 5; i++) {
				if (x % 2 == 0) {
					sum += x;
					x += 2;
				} else {
					x++;
					i--;
				}
			}
			System.out.println(sum);
			x = sc.nextInt();
		}

		sc.close();

	}

}
