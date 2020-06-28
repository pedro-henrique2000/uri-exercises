package app;

import java.util.Scanner;

public class Uri1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + number + " = " + number * i);
		}

		sc.close();

	}

}
