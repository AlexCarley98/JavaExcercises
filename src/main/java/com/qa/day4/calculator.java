package com.qa.day4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculator{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       System.out.println(calc1(1,1,2,3));

    }
    public static String calc1(double a, double b, double c, double d){
        List<String> operators = new ArrayList<>();
        operators.add("*");
        operators.add("/");
        operators.add("+");
        operators.add("-");

        String result = "";;
        for(int i = 0; i <operators.size(); i++){
            if (operators.get(i) == "+"){
                String op1 = "+";
                double calc1 = a+b;
                result=(calc2(a,b,calc1,c,d,op1));
            }
            if (operators.get(i) == "-"){
                String op1 = "-";
                double calc1 = a-b;
                result=(calc2(a,b,calc1,c,d,op1));
            }
            if (operators.get(i) == "*"){
                String op1 = "*";
                double calc1 = a*b;
                result=(calc2(a,b,calc1,c,d,op1));
            }
            if (operators.get(i) == "/"){
                String op1 = "/";
                double calc1 = a/b;
                result = (calc2(a,b,calc1,c,d,op1));
            }
            if(result !=""){break;};
        }
        return result;

    }
    public static String calc2(double a, double b, double calc1, double c, double d, String op1){
        String result;
        if(calc1 + c == d){
            result = (a+op1+b+"+"+c+"="+d);
        }
        else if(calc1 - c == d){
            result = (a+op1+b+"-"+c+"="+d);

        }
        else if(calc1 * c == d){
            result = (a+op1+b+"*"+c+"="+d);
        }
        else if(calc1 / c == d){
            result = (a+op1+b+"/"+c+"="+d);
        }
        else{ result = "";}
        return result;
    }

}

