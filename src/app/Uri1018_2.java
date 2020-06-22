package app;

import java.util.Scanner;

public class Uri1018_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// utilizando modulo
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(number);
		System.out.println(number / 100 + " nota(s) de R$ 100,00");
		number %= 100;
		System.out.println(number / 50 + " nota(s) de R$ 50,00");
		number %= 50;
		System.out.println(number / 20 + " nota(s) de R$ 20,00");
		number %= 20;
		System.out.println(number / 10 + " nota(s) de R$ 10,00");
		number %= 10;
		System.out.println(number / 5 + " nota(s) de R$ 5,00");
		number %= 5;
		System.out.println(number / 2 + " nota(s) de R$ 2,00");
		number %= 2;
		System.out.println(number / 1 + " nota(s) de R$ 1,00");
		sc.close();
	}

}
