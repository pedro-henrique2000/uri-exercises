package app;

import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] prices = { 4.00, 4.5, 5.0, 2.0, 1.5 };
		int code = sc.nextInt();
		int quantity = sc.nextInt();
		double total = prices[code - 1] * quantity;
		System.out.printf("Total: R$ %.2f", total);

		sc.close();

	}

}
