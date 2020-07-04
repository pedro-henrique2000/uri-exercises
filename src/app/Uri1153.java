package app;

import java.util.Scanner;

public class Uri1153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = x - 1; i > 0; i--) {
			x *= i;
		}
		
		System.out.println(x);

		sc.close();

	}

}
