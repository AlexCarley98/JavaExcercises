package com.qa.day2;

public class Results{

    public static void main(String[] args) {
        int Biol = 147;
        int Phys = 15;
        int Chem = 11;
        int Fails = 0;
        int total = marks(Biol,Phys,Chem);
        boolean BiolP = CheckPass(Biol);
        if (!BiolP){
            Fails++;
        }
        boolean PhysP = CheckPass(Phys);
        if (!PhysP){
            Fails++;
        }
        boolean ChemP = CheckPass(Chem);
        if (!ChemP){
            Fails++;
        }
        percentage(total,BiolP,PhysP,ChemP,Fails);
    }
    public static int marks(int Biol, int Phys, int Chem){
        System.out.println(Biol);
        System.out.println(Phys);
        System.out.println(Chem);
        int total = Biol+Phys+Chem;
        System.out.println(total);
        return total;
    }
    public static boolean CheckPass (double Result) {
        if (((Result * 100) / 150) >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public static void percentage(double total,boolean BiolP, boolean PhysP, boolean ChemP, int Fails){
    double totalP = (total*100)/450;
    if(BiolP && PhysP && ChemP){
        System.out.println("Overall grade of "+totalP+" (Pass)");
    }
    else{
        System.out.println("Overall grade of "+totalP+" (Failed: "+Fails+")");
    }
    }
}
