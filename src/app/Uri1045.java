package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		List<Double> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		Collections.sort(list);

		a = list.get(2);
		b = list.get(1);
		c = list.get(0);

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (a == b && c == b && a == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((b == c && a != b) || (a == c && b != a)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

		sc.close();

	}

}
