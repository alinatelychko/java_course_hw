package OOP_HW7.task3;

public class Calculator {
    public double sum (double a, double b){
        return a+b;
    }

    public double sub (double a, double b){
        return a-b;
    }

    public double mul  (double a, double b){
        return a*b;
    }

    public double div (double a, double b){
       double res;

        if (b!=0){
            res = a/b;
        } else {
            System.out.println("No solution");
            return Double.NaN;
        }

        return res;
    }
}
