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

		sc.close();

		int totalHour = hourB - hourA;
		int totalMinute = minuteB - minuteA;

		if (totalMinute < 0) {
			totalHour--;
			totalMinute += 60;
		}
		if (totalHour < 0) {
			totalHour += 24;
		}
		if (totalHour == 24 && totalMinute > 0) {
			totalHour--;
		}

		if (totalHour == 0 && totalMinute == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totalHour, totalMinute);
		}

	}

}
