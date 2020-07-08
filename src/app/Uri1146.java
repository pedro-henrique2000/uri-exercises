package app;

import java.util.Scanner;

public class Uri1146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			if (x == 0)
				break;
			System.out.print("1");

			for (int i = 2; i <= x; i++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

		sc.close();

	}

}
