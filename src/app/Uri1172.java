package app;

import java.util.Scanner;

public class Uri1172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			System.out.printf("X[%d] = %d%n", i, (array[i] <= 0 ? 1 : array[i]));
		}

		sc.close();

	}

}
