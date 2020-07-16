package app;

import java.util.Scanner;

public class Uri1179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] par = new int[5];
		int[] impar = new int[5];
		int parCount = 0;
		int imparCount = 0;

		int x;

		for (int i = 0; i < 15; i++) {
			x = sc.nextInt();
			if (x % 2 == 0) {
				par[parCount] = x;
				parCount++;
			} else {
				impar[imparCount] = x;
				imparCount++;
			}
			if (parCount > 4) {
				for (int j = 0; j < par.length; j++) {
					System.out.printf("par[%d] = %d%n", j, par[j]);
					parCount = 0;
				}
			} else if (imparCount > 4) {
				for (int j = 0; j < impar.length; j++) {
					System.out.printf("impar[%d] = %d%n", j, impar[j]);
					imparCount = 0;
				}
			}

		}

		for (int j = 0; j < imparCount; j++) {
			System.out.printf("impar[%d] = %d%n", j, impar[j]);

		}

		for (int j = 0; j < parCount; j++) {
			System.out.printf("par[%d] = %d%n", j, par[j]);

		}

		sc.close();

	}

}
