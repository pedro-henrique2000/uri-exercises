package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00;");

		int number = sc.nextInt();
		sc.nextLine();
		double total = 0;
		double bunny = 0;
		double rat = 0;
		double frog = 0;
		double aux = 0;

		for (int i = 0; i < number; i++) {
			String data = sc.nextLine();
			String[] fields = data.split(" ");
			aux = Integer.parseInt(fields[0]);
			total += aux;
			switch (fields[1]) {
			case "C":
				bunny += aux;
				break;
			case "S":
				frog += aux;
				break;
			case "R":
				rat += aux;
				break;
			}
			
		}

		System.out.printf("Total: %.0f cobaias%nTotal de coelhos: %.0f%nTotal de ratos: %.0f%nTotal de sapos: %.0f%n", total,
				bunny, rat, frog);
		System.out.println("Percentual de coelhos: "+ format.format(bunny * 100 / total) + " % ");
		System.out.println("Percentual de ratos: "+ format.format(rat * 100 / total) + " % ");
		System.out.println("Percentual de sapos: "+ format.format(frog * 100 / total) + " % ");
		sc.close();

	}

}
