package app;

import java.util.Scanner;

public class Uri1095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int i = 1;
		int j = 60;

		while (j >= 0) {
			System.out.println("I=" + i + " J=" + j);
			i += 3;
			j -= 5;
		}

		sc.close();

	}

}
