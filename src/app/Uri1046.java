package app;

import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int begin = sc.nextInt();
		int end = sc.nextInt();
		int hours = 0;
		
		if(begin <= 24 && begin > 12) {
			hours = (24 - begin) + end;
		}
		if(begin <= 12 && begin > 0) {
			hours = end - begin;
		}
		if(begin == 0 && end == 0) {
			hours = 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", hours);
		
		
		sc.close();

	}

}
