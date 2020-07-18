package app;

import java.util.Scanner;

public class Uri1435 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int x = 1;

		while (size > 0) {
			int[][] array = new int[size + 1][size + 1];
			for (int i = 1; i < array.length; i++) {
				for (int j = 1; array[i].length > j; j++) {
					x = i;
					if (j < x) {
						x = j;
					}
					if (size - j + 1 < x) {
						x = size - j + 1;
					}
					if (size - i + 1 < x) {
						x = size - i + 1;
					}

					array[i][j] = x;
				}
			}

			for (int i = 1; i < array.length; i++) {
				for (int j = 1; array[i].length > j; j++) {
					System.out.printf("%s%d", j == 1 ? "  " : "   ", array[i][j]);
				}
				System.out.println();
			}

			size = sc.nextInt();
		}

		sc.close();

	}

}
