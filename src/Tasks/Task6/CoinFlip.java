package Tasks.Task6;

import java.util.Random;
import java.util.Scanner;

public final class CoinFlip {

    public static void main(final String[] args) {
        // create a new random number generator object
        Random rand = new Random();

        Scanner in = new Scanner(System.in);
        System.out.print("How many times will we toss the coin? Please put the number: ");
        int x = in.nextInt();

        // pick a random number between 0 and 1:
        for (int i = 0; i < x; i++) {
            int n = rand.nextInt(2);
            // System.out.println("Picked random value " + n);
            if(n == 1){
                System.out.println("Picked random value: \n" +
                        "  .-\"\"\"-.\n" +
                        "//       \\\\\n" +
                        "|| TAILS ||\n" +
                        "\\\\       //\n" +
                        "  '-...-' ");
            } else {
                System.out.println("Picked random value: \n" +
                        "  .-\"\"\"-.\n" +
                        "//       \\\\\n" +
                        "|| HEADS ||\n" +
                        "\\\\       //\n" +
                        "  '-...-' ");
            }
        }
    }
}