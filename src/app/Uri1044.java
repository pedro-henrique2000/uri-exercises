package app;

import java.util.Scanner;

public class Uri1044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean isMultiple;

		isMultiple = A % B == 0 || B % A == 0 ? true : false;

		if (isMultiple) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}

}
