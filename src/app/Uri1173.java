package app;

import java.util.Scanner;

public class Uri1173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] N = new int[10];
		int number = sc.nextInt();

		for (int i = 0; i < N.length; i++) {
			N[i] = number;
			number *= 2;
			System.out.printf("N[%d] = %d%n", i, N[i]);
		}

		sc.close();

	}

}
