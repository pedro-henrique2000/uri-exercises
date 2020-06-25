package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		double salary = sc.nextDouble();
		double newSalary = 0.00;
		int percentage = 0;

		if (salary >= 0 && salary <= 400.00) {
			percentage = 15;
			newSalary = salary * 1.15;
		}
		if (salary > 400 && salary <= 800.00) {
			percentage = 12;
			newSalary = salary * 1.12;
		}
		if (salary > 800 && salary <= 1200.00) {
			percentage = 10;
			newSalary = salary * 1.10;
		}
		if (salary > 1200 && salary <= 2000.00) {
			percentage = 7;
			newSalary = salary * 1.07;
		}
		if (salary > 2000) {
			percentage = 4;
			newSalary = salary * 1.04;
		}

		System.out.println("Novo salario: " + format.format(newSalary));
		System.out.println("Reajuste Ganho: " + format.format(newSalary - salary));
		System.out.println("Porcentagem: " + percentage + " % ");
		sc.close();

	}

}
