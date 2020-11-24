package com.company;


import static com.company.random_with_range.*;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        double y = 0.00;

        while(x < 1000) {
            int number = Random(1, 99);
            if (number < 4) {
                System.out.println("smaller than 4");
                y += 1;
            }
            x += 1;
        }
        System.out.println("Out of a thousand tries total below 4 is: "+ y);
        double percentage = y / 1000 * 100;
        double roundOff = Math.round(percentage*100.0)/100.0;
        System.out.println("Which is a percentage of: "+ roundOff +"%");
    }
}
