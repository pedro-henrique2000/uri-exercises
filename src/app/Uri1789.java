package app;

import java.util.Scanner;

public class Uri1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSlugs = sc.nextInt();
        int level = 1;
        int[] slugs;

        while(sc.hasNext()) {

            slugs = new int[numberOfSlugs];

            for (int i = 0; i < numberOfSlugs; i++) {
                int speed = sc.nextInt();
                slugs[i] = speed;

                if (speed >= 10 && speed < 20 && level < 2)
                    level = 2;

                if (speed >= 20 && level < 3)
                    level = 3;
            }
            System.out.println(level);
            numberOfSlugs = sc.nextInt();
        }

    }
}
