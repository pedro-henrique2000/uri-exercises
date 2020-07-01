package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		int interWins = 0;
		int gremioWins = 0;
		int draw = 0;
		int count = 0;
		int choice = 0;

		do {
			choice = 0;
			count++;
			int interGoals = sc.nextInt();
			int gremioGoals = sc.nextInt();

			if (interGoals > gremioGoals)
				interWins++;
			if (gremioGoals > interGoals)
				gremioWins++;
			if (gremioGoals == interGoals)
				draw++;

			while (choice != 1 && choice != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				choice = sc.nextInt();
			}

		} while (choice == 1);

		System.out.printf("%d grenais%nInter:%d%nGremio:%d%nEmpates: %d%n", count, interWins, gremioWins, draw);

		if (gremioWins > interWins)
			System.out.println("Gremio venceu mais");
		if (gremioWins < interWins)
			System.out.println("Inter venceu mais");

		else
			System.out.println("Não houce vencedor");
		sc.close();

	}

}
