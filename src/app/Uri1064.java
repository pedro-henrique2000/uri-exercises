package app;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");
		int count = 0;
		double total = 0;

		List<Double> list = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			list.add(sc.nextDouble());
		}

		for (Double number : list) {
			if (number > 0) {
				count++;
				total += number;
			}
		}

		System.out.println(count + " valores positivos");
		System.out.println(format.format(total / count));

		sc.close();

	}

}
