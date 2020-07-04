package app;

import java.text.DecimalFormat;

public class Uri1155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat format = new DecimalFormat("0.00");
		double s = 0.00;

		for (double i = 1.00; i <= 100; i++) {
			s += (1.00 / i);
		}

		System.out.println(format.format(s));

	}

}
