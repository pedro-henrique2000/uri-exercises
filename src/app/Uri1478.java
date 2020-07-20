package app;

import java.util.Scanner;

public class Uri1478 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int x = 0;

		while (size > 0) {
			int[][] array = new int[size][size];
			for (int i = 0; i < array.length; i++) {
				x = i + 1;
				int count = 0;
				for (int j = 0; array[i].length > j; j++) {

					if (array[i][0] == 1) {
						x++;
					} else if (j > 0) {
						if (array[i][j - 1] > 1 && count == 0) {
							x--;
							if (x == 1) {
								count++;
							}
						} else {
							x++;
						}
					}

					array[i][j] = x;
				}
			}

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; array[i].length > j; j++) {
					System.out.printf("%s%d", j == 0 ? "  " : "   ", array[i][j]);
				}
				System.out.println();
			}

			size = sc.nextInt();
		}

		sc.close();

	}

}
