package com.company;

import java.math.MathContext;

/* Method to generate a random number within specified range. */
public class random_within_range {
    public static int Random(int min, int max) {
        int range = (max - min) +1;
        return (int)(Math.random() * range) + min;
    }
}