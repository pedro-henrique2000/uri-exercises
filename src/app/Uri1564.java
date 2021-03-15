package app;

import java.util.Scanner;

public class Uri1564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while(!input.equals("") && input != null) {
            int number = Integer.parseInt(input);
            if(number > 0)
                System.out.println("vai ter duas!");
            else
                System.out.println("vai ter copa!");

            input = sc.nextLine();
        }
    }
}
