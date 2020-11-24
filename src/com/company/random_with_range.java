package com.company;

import java.math.MathContext;

public class random_with_range {
    public static int Random(int min, int max) {
        int range = (max - min) +1;
        return (int)(Math.random() * range) + min;
    }
}