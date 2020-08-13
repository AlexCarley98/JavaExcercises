package com.qa.day4;
import java.util.ArrayList;
import java.util.List;

public class calculator{
    public static List<String> operators = new ArrayList<>();
    public static void main(String[] args) {
        operators.add("*");
        operators.add("/");
        operators.add("+");
        operators.add("-");
        calc1(2,4,6,3);

    }
    public static void calc1(double a, double b, double c, double d){
        for(int i = 0; i <operators.size(); i++){
            if (operators.get(i) == "+"){
                String op1 = "+";
                double calc1 = a+b;
                calc2(a,b,calc1,c,d,op1);
            }
            if (operators.get(i) == "-"){
                String op1 = "-";
                double calc1 = a-b;
                calc2(a,b,calc1,c,d,op1);
            }
            if (operators.get(i) == "*"){
                String op1 = "*";
                double calc1 = a*b;
                calc2(a,b,calc1,c,d,op1);
            }
            if (operators.get(i) == "/"){
                String op1 = "/";
                double calc1 = a/b;
                calc2(a,b,calc1,c,d,op1);
            }
        }

    }
    public static void calc2(double a, double b, double calc1, double c, double d, String op1){
        if(calc1 + c == d){
            System.out.println(a+op1+b+"+"+c+"="+d);
        }
        if(calc1 - c == d){
            System.out.println(a+op1+b+"-"+c+"="+d);
        }
        if(calc1 * c == d){
            System.out.println(a+op1+b+"*"+c+"="+d);
        }
        if(calc1 / c == d){
            System.out.println(a+op1+b+"/"+c+"="+d);
        }
    }

}

