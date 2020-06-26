package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");
		
		double salary = sc.nextDouble();
		
		if(salary >= 0.00 && salary <= 2000) {
			System.out.println("Isento");
		}
		if(salary > 2000 && salary <= 3000) {
			System.out.println("R$ " + format.format((salary - 2000) * 0.08));
		}
		if(salary > 3000 && salary <= 4500) {
			System.out.println("R$ " + format.format(80 + ((salary - 3000) * 0.18)));
		}
		if(salary > 4500) {
			System.out.println("R$ " + format.format(80 + 270 + ((salary - 4500) * 0.28)));
		}
		
		
		sc.close();

	}

}
