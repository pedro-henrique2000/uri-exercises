package app;

import java.util.Scanner;

public class Uri1180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] array = new int[size];
		array[0] = sc.nextInt();
		int lowest = array[0];
		int address = 0;

		for (int i = 1; array.length > i; i++) {
			array[i] = sc.nextInt();
			if (array[i] < lowest) {
				lowest = array[i];
				address = i;
			}
		}

		System.out.printf("Menor valor: %d%nPosicao: %d%n", lowest, address);

		sc.close();

	}

}
