package app;

import java.util.Scanner;

public class Uri1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = 0;
		int y = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			sum = 0;
			for (int j = 0; j < y; j++) {
				if (x % 2 != 0) {
					sum += x;
					x += 2;
				} else {
					x++;
					j--;
				}
				System.out.println(sum);
			}
			
		}
		sc.close();

	}

}
