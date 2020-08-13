package com.qa.day2;

public class Calculator{
    public static void main(String[]args){
        int num1 = 4;
        int num2 = 2;
        System.out.println(addition(num1, num2));
        System.out.println(multiplication(num1, num2));
        System.out.println(subtraction(num1, num2));
        if(num1 >= num2) {
            System.out.println(division(num1, num2));
            }
        else {
            System.out.println("Division can't be performed");
            }
        }

    public static int multiplication(int num1, int num2){
        return num1*num2;
    }
    public static int subtraction(int num1, int num2){
        return num1-num2;
    }
    public static double division(double num1, double num2){
            return num1/num2;
    }
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
}
