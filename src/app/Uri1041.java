package app;

import java.util.Scanner;

public class Uri1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double X = sc.nextDouble();
		double Y = sc.nextDouble();

		if (X == 0.0 && Y == 0.0) {
			System.out.println("Origem");
		}
		if (X < 0 && Y > 0) {
			System.out.println("Q2");
		}
		if (X > 0 && Y > 0) {
			System.out.println("Q1");
		}
		if (X < 0 && Y < 0) {
			System.out.println("Q3");
		}
		if (X > 0 && Y < 0) {
			System.out.println("Q4");
		}

		sc.close();

	}

}
