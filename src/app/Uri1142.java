package app;

import java.util.Scanner;

public class Uri1142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int value = 0;
		
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(++value + " ");
			}
			value += 1;
			System.out.println("PUM");
		}
		

	}

}
