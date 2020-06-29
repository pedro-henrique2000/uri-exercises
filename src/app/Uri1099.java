package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = 0;
			List<Integer> oddList = new ArrayList<>();
			a = sc.nextInt();
			b = sc.nextInt();

			while (a > b) {
				b++;
				if (b % 2 != 0 && b != a)
					oddList.add(b);
			}

			while (b > a) {
				a++;
				if (a % 2 != 0 && a != b)
					oddList.add(a);
			}

			for (Integer x : oddList) {
				sum += x;
			}

			System.out.println(sum);

		}

		sc.close();

	}

}
