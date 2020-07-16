package app;

import java.util.Scanner;

public class Uri1177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] N = new int[1000];
		int x = sc.nextInt();
		int count = 0;

		while (count < 1000) {
			for (int i = 0; i < x; i++) {
				if (count >= 1000)
					break;
				N[count] = i;
				System.out.printf("N[%d] = %d%n", count, N[count]);
				count++;
			}
		}

		sc.close();

	}

}
