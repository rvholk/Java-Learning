package com.company;


import static com.company.random_within_range.*;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        double y = 0.00;
        double z = 0.00;

        while (x < 100000) {
            int number = Random(1, 99);
            if (number < 50) {
                y += 1;
            }
            if (number == 99) {
                z += 1;
            }
            x += 1;
        }
        System.out.println("Out of one hundred thousand tries total below 50 is: " + y);
        System.out.println("Out of one hundred thousand tries total times 99: " + z);
        double percentage = y / 100000 * 100;
        double roundOff = Math.round(percentage * 100.0) / 100.0;
        System.out.println("Percentage of below 50: " + roundOff + "%");
    }
}
