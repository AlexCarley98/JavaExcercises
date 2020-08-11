package com.qa.day3;

public class LoopFlowchart2{
    public static void main(String[] args) {
        loopChart();
    }
    public static void loopChart(){
        int A = 100;
        do{
            if(A%2 == 0){
                System.out.println("-");
            }
            else{
                System.out.println("*");
            }
            A++;
        } while(A<=200);
    }
        }