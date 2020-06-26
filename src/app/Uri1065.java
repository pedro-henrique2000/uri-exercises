package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");
		int count = 0;

		for (int i = 0; i < 5; i++) {
			if (sc.nextInt() % 2 == 0) {
				count++;
			}
		}

		System.out.println(count + " valores pares");

		sc.close();

	}

}
