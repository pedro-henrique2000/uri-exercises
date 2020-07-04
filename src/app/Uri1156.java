package app;

import java.text.DecimalFormat;

public class Uri1156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat format = new DecimalFormat("0.00");

		double s = 1.00;
		double mult = 2.00;

		for (int i = 3; i <= 39; i += 2) {
			s += (i / mult);
			mult *= 2;
		}
		System.out.println(format.format(s));
	}

}
