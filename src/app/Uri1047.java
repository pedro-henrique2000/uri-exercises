package app;

import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int hourA = sc.nextInt();
		int minuteA = sc.nextInt();
		int hourB = sc.nextInt();
		int minuteB = sc.nextInt();

		int totalHour = 0;
		int totalMinute = 0;

		if (hourB - hourA == 0 && minuteB - minuteA == 0) {
			totalHour = 24;
		}
		if (hourB > hourA && minuteB > minuteA) {
			totalHour = hourB - hourA;
			totalMinute = minuteB - minuteA;
		}
		if (hourA > hourB && minuteA > minuteB) {
			totalHour = 24 - (hourA - hourB);
			totalMinute = minuteA - minuteB;
		}
		if (hourA > hourB && minuteA < minuteB) {
			totalHour = 24 - (hourA - hourB);
			totalMinute = minuteB - minuteA;
		}
		if (hourA < hourB && minuteA > minuteB) {
			totalMinute = ((hourB - hourA) * 60) - (minuteA - minuteB);
			while (totalMinute >= 60) {
				totalHour++;
				totalMinute -= 60;
			}
		}
		if (hourA > hourB && minuteA == minuteB) {
			totalHour = hourA - hourB;
		}
		if (hourA < hourB && minuteA == minuteB) {
			totalHour = hourB - hourA;
		}

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totalHour, totalMinute);

		sc.close();

	}

}
