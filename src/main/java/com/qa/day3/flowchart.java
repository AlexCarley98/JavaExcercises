public class flowchart {

    public static void main(String[] args) {
    System.out.println(input(2,3,false));
    }
    public static int input(int num1, int num2, boolean TF){
        if(TF){
            return num1+num2;
        }
        else {
            return num1*num2;

        }
    }
}