package com.qa.day4;
import java.util.List;

public class porridge{
    public static int[] seatStrength ={30, 130, 90, 150, 120, 200, 110};
    public static int[] porridgeTemp ={50, 60, 80, 40, 100, 80, 50};
    public static void main(String[] args) {
    seatCheck(100,80);
    }
    public static void seatCheck(int weight, int temp){
        for(int i = 0; i < seatStrength.length; i++) {
            if(weight<seatStrength[i] && temp> porridgeTemp[i]){
                System.out.println("Seat number: "+(i+1));
            }
        }
    }
}