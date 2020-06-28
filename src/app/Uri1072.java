package app;

import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		int value = 0;
		
		for(int i = 0 ; i < n ; i++) {
			value = sc.nextInt();
			if(value <= 20 && value >= 0) in++;
			else out++;
		}
		
		System.out.printf("%d in%n%d out%n", in , out);

	}

}
