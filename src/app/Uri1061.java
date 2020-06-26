package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String day1_string = sc.nextLine();
		String day1Hour_string = sc.nextLine();
		String day2_string = sc.nextLine();
		String day2Hour_string = sc.nextLine();

		int totalDay = 0;
		int totalHours = 0;
		int totalMinutes = 0;
		int totalSeconds = 0;

		String[] day1 = day1_string.split(" ");
		String[] day1hour = day1Hour_string.split(" : ");
		int initDay = Integer.parseInt(day1[1]);
		int initHour = Integer.parseInt(day1hour[0]);
		int initMinute = Integer.parseInt(day1hour[1]);
		int initSeconds = Integer.parseInt(day1hour[2]);

//		System.out.println(initDay);
//		System.out.println(initHour);
//		System.out.println(initMinute);
//		System.out.println(initSeconds);

		String[] day2 = day2_string.split(" ");
		String[] day2hour = day2Hour_string.split(" : ");
		int finalDay = Integer.parseInt(day2[1]);
		int finalHour = Integer.parseInt(day2hour[0]);
		int finalMinute = Integer.parseInt(day2hour[1]);
		int finalSeconds = Integer.parseInt(day2hour[2]);

//		System.out.println(finalDay);
//		System.out.println(finalHour);
//		System.out.println(finalMinute);
//		System.out.println(finalSeconds);

		totalDay = finalDay - initDay;
		totalHours = finalHour - initHour;
		totalMinutes = finalMinute - initMinute;
		totalSeconds = finalSeconds - initSeconds;

		if (totalHours < 0) {
			totalDay--;
			totalHours += 24;
		}

		if (totalMinutes < 0) {
			totalHours--;
			totalMinutes += 60;
		}

		if (totalSeconds < 0) {
			totalMinutes--;
			totalSeconds += 60;
		}

		System.out.printf("%d dia(s)%n%d hora(s)%n%d minuto(s)%n%d segundo(s)%n", totalDay, totalHours, totalMinutes,
				totalSeconds);

		sc.close();

	}

}
