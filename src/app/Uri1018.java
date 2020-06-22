package app;

import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int notaCem = 0;
		int notaCinquenta = 0;
		int notaVinte = 0;
		int notaDez = 0;
		int notaCinco = 0;
		int notaDois = 0;
		int notaUm = 0;
		
		System.out.println(number);

		while (number >= 100) {
			notaCem++;
			number -= 100;
		}
		while (number >= 50) {
			notaCinquenta++;
			number -= 50;
		}
		while (number >= 20) {
			notaVinte++;
			number -= 20;
		}
		while (number >= 10) {
			notaDez++;
			number -= 10;
		}
		while (number >= 5) {
			notaCinco++;
			number -= 5;
		}
		while (number >= 2) {
			notaDois++;
			number -= 2;
		}
		while (number == 1) {
			notaUm++;
			number -= 1;
		}

		System.out.printf(
				"%d nota(s) de R$ 100,00%n%d nota(s) de R$ 50,00%n%d nota(s) de R$ 20,00%n%d nota(s) de R$ 10,00%n%d nota(s) de R$ 5,00%n%d nota(s) de R$ 2,00%n%d nota(s) de R$ 1,00%n",
				notaCem, notaCinquenta, notaVinte, notaDez, notaCinco, notaDois, notaUm);

		sc.close();
	}

}
