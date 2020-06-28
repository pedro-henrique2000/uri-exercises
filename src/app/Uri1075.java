package app;

import java.util.Scanner;

public class Uri1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for(int i = 1; i <= 10000 ; i++) {
			if (i % N == 2) System.out.println(i); 
		}
		

	}

}
