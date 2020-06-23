package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uri1042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(A);
		list.add(B);
		list.add(C);
		Collections.sort(list);
		list.forEach(System.out::println);
		System.out.printf("%n%d%n%d%n%d%n", A, B, C);
	}

}
