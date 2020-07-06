package app;

import java.text.DecimalFormat;

public class Uri1098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat format = new DecimalFormat("0.0");
		DecimalFormat format2 = new DecimalFormat("0");
		double j = 0;

		for (double i = 0; i <= 2; i += 0.2) {
			j = i;
			for (int n = 0; n < 3; n++) {
				j += 1;
				if (i == 0 || i == 1 || Math.floor(i + 0.1) == 2.00) {
					System.out.println("I=" + format2.format(i) + " J=" + format2.format(j));
				} else {
					System.out.println("I=" + format.format(i) + " J=" + format.format(j));
				}

			}

		}
	}

}
