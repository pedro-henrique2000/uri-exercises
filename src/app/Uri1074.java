package app;

import java.util.Scanner;

public class Uri1074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int number = 0;
		int n = sc.nextInt();
		String numberData = "";

		for (int i = 0; i < n; i++) {
			numberData = "";
			number = sc.nextInt();
			if (number == 0)
				numberData = "NULL";
			if (number % 2 == 0 && number != 0)
				numberData += "EVEN";
			else if(number != 0)
				numberData += "ODD";

			if (number > 0)
				numberData += " POSITIVE";
			else if(number != 0)
				numberData += " NEGATIVE";

			System.out.println(numberData);
		}

		sc.close();

	}

}
