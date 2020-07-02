package app;

import java.util.Scanner;

public class Uri1145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i = 0; i < y; i = i) {
			for (int j = 0; j < x; j++) {
				System.out.print(++i);
				if(j != x - 1) {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}

	}

}
