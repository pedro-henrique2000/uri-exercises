package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n%i==0) System.out.println(i);
		}
		
		sc.close();
		
		

	}

}
