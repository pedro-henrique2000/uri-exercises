package app;

import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		int speed = sc.nextInt();
		double distance = speed * hours;
		sc.close();
		System.out.printf("%.3f%n", distance / 12);

	}

}
