package com.qa.day2;

public class Results{

    public static void main(String[] args) {
   int total = marks(87,60,110);
    }
    public static int marks(int Biol, int Phys, int Chem){
        System.out.println(Biol);
        System.out.println(Phys);
        System.out.println(Chem);
        int total = Biol+Phys+Chem;
        System.out.println(total);
        return total;
    }
    public static void percentage(int total){

    }
}
