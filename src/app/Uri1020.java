package app;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int totalDays = sc.nextInt();
		int years = totalDays / 365;
		totalDays %= 365;
		int months = totalDays / 30;
		totalDays %= 30;

		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", years, months, totalDays);

		sc.close();

	}

}
