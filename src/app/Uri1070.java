package app;

import java.util.Scanner;

public class Uri1070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		number = number % 2 == 0 ? number += 1 : number;
		
		for(int i = 0; i < 6 ; i++) {
			System.out.println(number);
			number += 2;
		}

		sc.close();

	}

}
