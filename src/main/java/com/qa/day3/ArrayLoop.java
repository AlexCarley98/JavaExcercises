package com.qa.day3;

import java.util.Arrays;

public class ArrayLoop{
    public static int num[] = new int[9];

    public static void main(String[] args) {
        for(int i = 0; i < num.length; i++) {
            num[i] = 2;
        }
        System.out.println(Arrays.toString(num));
        for(int i = 0; i < num.length; i++) {
            num[i] = num[i]*2;
        }
        System.out.println(Arrays.toString(num));
    }

}