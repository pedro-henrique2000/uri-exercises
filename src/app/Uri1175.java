package app;

import java.util.Scanner;

public class Uri1175 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] N = new int[20];

		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			int aux = N[i];
			N[i] = N[(N.length - 1) - i];
			N[(N.length - 1) - i] = aux;
		}

		int aux = N[9];
		N[9] = N[10];
		N[10] = aux;

		for (int i = 0; i < N.length; i++) {
			System.out.printf("N[%d] = %d%n", i, N[i]);
		}

		sc.close();

	}

}
