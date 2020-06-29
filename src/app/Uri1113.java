package app;

import java.util.Scanner;

public class Uri1113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a != b) {
			if(a > b) System.out.println("Decrescente");
			else System.out.println("Crescente");
			
			a = sc.nextInt();
			b = sc.nextInt();
		}
	
		
		sc.close();

	}

}
