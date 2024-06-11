package Tasks.Task8;

import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;

    //Creating methods for every operation:
    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double divide(double num1, double num2){
        return num1 / num2;
    }


    public static void main(String[] args) {

        final Calculator obj = new Calculator();

        Scanner in = new Scanner(System.in);    //scanner for input int values

        System.out.print("Put number 1: " );
        obj.num1 = in.nextDouble();

        System.out.print("Put number 2: " );
        obj.num2 = in.nextDouble();

        System.out.println("(+) " + obj.add(obj.num1, obj.num2));
        System.out.println("(-) " + obj.subtract(obj.num1, obj.num2));
        System.out.println("(*) " + obj.multiply(obj.num1, obj.num2));
        System.out.println("(/) " + obj.divide(obj.num1, obj.num2));
    }
}
