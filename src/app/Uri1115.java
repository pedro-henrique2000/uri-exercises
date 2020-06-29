package app;

import java.util.Scanner;

public class Uri1115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while(X != 0 && Y != 0) {
			if(X > 0 && Y > 0) System.out.println("primeiro");
			if(X < 0 && Y > 0) System.out.println("segundo");
			if(X < 0 && Y < 0) System.out.println("terceiro");
			if(X > 0 && Y < 0) System.out.println("quarto");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		sc.close();

	}

}
