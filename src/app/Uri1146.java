package app;

import java.util.Scanner;

public class Uri1146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while (x != 0) {
			for (int i = 1; i <= x; i++) {
				System.out.print(i);
				if (i != x)
					System.out.print(" ");
			}
			System.out.println();
			x = sc.nextInt();
		}

		sc.close();

	}

}
