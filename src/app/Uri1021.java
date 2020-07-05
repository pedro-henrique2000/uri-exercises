package app;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double value = sc.nextDouble();
		int cem = 0;
		int cinq = 0;
		int vinte = 0;
		int dez = 0;
		int cinco = 0;
		int dois = 0;

		int um = 0;
		int cinqCent = 0;
		int vinteeCinco = 0;
		int dezCent = 0;
		int cincoCent = 0;
		int umCent = 0;

		if (value >= 100) {
			cem = (int) (value / 100);
			value %= 100;
		}
		if (value >= 50) {
			cinq = (int) (value / 50);
			value %= 50;
		}
		if (value >= 20) {
			vinte = (int) (value / 20);
			value %= 20;
		}
		if (value >= 10) {
			dez = (int) (value / 10);
			value %= 10;
		}
		if (value >= 5) {
			cinco = (int) (value / 5);
			value %= 5;
		}
		if (value >= 2) {
			dois = (int) (value / 2);
			value %= 2;
		}
		if (value >= 1) {
			um = (int) (value / 1);
			value %= 1;
		}
		if (value >= 0.5) {
			cinqCent = (int) (value / 0.5);
			value %= 0.5;
		}
		if (value >= 0.25) {
			vinteeCinco = (int) (value / 0.25);
			value %= 0.25;
		}
		if (value >= 0.10) {
			dezCent = (int) (value / 0.10);
			value %= 0.10;
		}
		if (value >= 0.05) {
			cincoCent = (int) (value / 0.05);
			value %= 0.05;
		}
		if (value >= 0.01) {
			umCent = (int) (value / 0.01);
			value %= 0.01;
		}

		System.out.printf(
				"NOTAS:%n%d nota(s) de R$ 100.00%n%d nota(s) de R$ 50.00%n%d nota(s) de R$ 20.00%n%d nota(s) de R$ 10.00%n%d nota(s) de R$ 5.00%n%d nota(s) de R$ 2.00%nMOEDAS:%n%d moeda(s) de R$ 1.00%n%d moeda(s) de R$ 0.50%n%d moeda(s) de R$ 0.25%n%d moeda(s) de R$ 0.10%n%d moeda(s) de R$ 0.05%n%d moeda(s) de R$ 0.01",
				cem, cinq, vinte, dez, cinco, dois, um, cinqCent, vinteeCinco, dezCent, cincoCent, umCent);

		sc.close();

	}
}
