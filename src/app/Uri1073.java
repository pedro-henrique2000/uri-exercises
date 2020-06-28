package app;

import java.util.Scanner;

public class Uri1073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		for (int i = 2; i <= number; i += 2) {
			System.out.println(i +"^2 = "+ (int) Math.pow(i, 2));
		}

	}

}
