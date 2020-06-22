package app;

import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// utilizando while
		int seconds = sc.nextInt();
		int hours = 0;
		int minutes = 0;

		while (seconds >= 3600) {
			hours++;
			seconds -= 3600;
		}
		while (seconds >= 60) {
			minutes++;
			seconds -= 60;
		}
		System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

		sc.close();

	}

}
