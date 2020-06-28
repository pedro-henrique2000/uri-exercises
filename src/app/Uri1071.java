package app;

import java.util.Scanner;

public class Uri1071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int total = 0;
		
		if(B % 2 == 0) B+=1;
		else B+=2;
		
		while(A > B) {
			total += B;
			B+=2;
		}
		
		
		
	
		System.out.println(total);
		
		
//		System.out.println(total);
		
		
		sc.close();

	}

}
