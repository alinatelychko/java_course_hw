package HW7;

public class Calculator {
    public static void main(String[] args) {
        int a =2, b=4, c=7;
        System.out.println("Середнє арифметичне чисел " + a +", " + b +" та " + c+ " дорівнює: " + calculate(a,b,c));
    }

    static double calculate (int a, int b, int c){

        double result =  (a+b+c)/3;
        return result;

    }
}
