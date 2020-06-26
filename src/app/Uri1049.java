package app;

import java.util.Scanner;

public class Uri1049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String txt1 = sc.next();
		String txt2 = sc.next();
		String txt3 = sc.next();

		boolean isVertebrate = txt1.equals("vertebrado") ? true : false;
		boolean isMammal = txt2.equals("mamifero") ? true : false;
		boolean isOmnivorous = txt3.equals("onivoro") ? true : false;
		boolean isInsect = txt2.equals("inseto") ? true : false;
		boolean isHematofago = txt3.equals("hematofago") ? true : false;

		if (isVertebrate) {
			if (isMammal) {
				if (isOmnivorous) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}

			} else {
				if (isOmnivorous) {
					System.out.println("pomba");
				} else {
					System.out.println("aguia");
				}
			}
		} else {
			if (isInsect) {
				if (isHematofago) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (isHematofago) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}

		sc.close();

	}

}
