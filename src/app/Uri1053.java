package app;

import java.util.ArrayList;
import java.util.List;

public class Uri1053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> even = new ArrayList<>();
		for (int i = 2; i <= 100; i += 2) {
			even.add(i);
		}
		even.forEach(System.out::println);

	}

}
