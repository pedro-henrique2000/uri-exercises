package app;

import java.util.Scanner;

public class Uri1066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int even = 0;
		int odd = 0;
		int positive = 0;
		int negative = 0;
		

		for (int i = 0; i < 5; i++) {
			int number = sc.nextInt();
			if (number % 2 == 0)
				even++;
			else
				odd++;

			if (number > 0)
				positive++;
			else if(number != 0)
				negative++;
		}

		System.out.printf(
				"%d valor(es) par(es)%n%d valor(es) impar(es)%n%d valor(es) positivo(s)%n%d valor(es) negativo(s)",
				even, odd, positive, negative);

		sc.close();

	}

}
