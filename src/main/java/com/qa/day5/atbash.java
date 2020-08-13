package com.qa.day5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class atbash{
    static Scanner scan = new Scanner(System.in);
    static String  word;
    public static void main(String[] args) {
        word = scan.nextLine();
        convert(word);
    }
    public static void convert(String word){
        String convertedWord = "";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] let = letters.toCharArray();
        String reverse = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        char[] rev = reverse.toCharArray();


    for(char str : word.toCharArray()){
        for(int i = 0; i < let.length; i++){
            if(let[i] == str){
                convertedWord = convertedWord+rev[i];
                break;

            }
            }
        }
    System.out.println(convertedWord);
    }
}