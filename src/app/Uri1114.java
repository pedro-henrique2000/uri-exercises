package app;

import java.util.Scanner;

public class Uri1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean isValid = false;

		while (!isValid) {
			if (sc.nextInt() == 2002) {
				isValid = true;
			} else {
				System.out.println("Senha invalida");
			}
		}

		System.out.println("Acesso permitido");

		sc.close();

	}

}
