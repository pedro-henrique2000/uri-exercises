package app;

import java.text.DecimalFormat;

public class Uri1098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat format = new DecimalFormat("0.0");

		double j = 1;

		for (double i = 0; i <= 2; i += 0.2) {
			j = 1 + i;
			for (int n = 0; n < 3; n++) {
				System.out.println("I=" + format.format(i) + " J=" + format.format(j));
				j += 1;
			}
		}

	}

}
