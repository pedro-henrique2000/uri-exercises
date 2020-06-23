package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");
		double weigthA = 2.0;
		double weigthB = 3.0;
		double weigthC = 4.0;
		double weigthD = 1.0;

		double gradeA = sc.nextDouble();
		double gradeB = sc.nextDouble();
		double gradeC = sc.nextDouble();
		double gradeD = sc.nextDouble();

		double result = ((gradeA * weigthA) + (gradeB * weigthB) + (gradeC * weigthC) + (gradeD * weigthD))
				/ (weigthA + weigthB + weigthC + weigthD);
		System.out.println("Media: " + format.format(result));

		if (result >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		if (result < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		if (result >= 5.0 && result < 7) {
			System.out.println("Aluno em exame.");
			double examResult = sc.nextDouble();
			System.out.println("Nota do exame: " + format.format(examResult));
			double finalResult = (result + examResult) / 2.0;
			if (finalResult >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado");
			}
			System.out.printf("Media final: " + format.format(finalResult));
		}

		sc.close();

	}

}
