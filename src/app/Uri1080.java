package app;

import java.util.Scanner;

public class Uri1080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int address = 0;
		int number = 0;
		int highest = 0;

		for (int i = 1; i <= 100; i++) {
			number = sc.nextInt();
			if (number > highest) {
				address = i;
				highest = number;
			}
		}

		System.out.printf("%d%n%d%n", highest, address);

		sc.close();

	}

}
