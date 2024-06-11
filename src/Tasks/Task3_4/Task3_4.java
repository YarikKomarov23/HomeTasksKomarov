package Tasks.Task3_4;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create scanner for interactive input

        System.out.print("Input radius of the circle:(please use \".\" in fractional numbers) ");
        double radius = in.nextDouble();

        double areaCircle = Math.PI * Math.pow(radius, 2);

        System.out.printf("Are of the circle = " + "%.2f", areaCircle); //print 2 numbers after comma

    }
}
