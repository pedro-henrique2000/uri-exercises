package app;

import java.util.Scanner;

public class Uri1134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;

		do {
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				alcohol++;
				break;
			case 2:
				gasoline++;
				break;
			case 3:
				diesel++;
				break;
			default:
				continue;
			}
		} while (choice != 4);

		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alcohol, gasoline, diesel);

		sc.close();

	}

}
