package Tasks.Task7;

import java.util.LinkedList;
import java.util.Scanner;

public class Task7 {
    int number;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    //scanner for input int value
        System.out.print("Input \"number\" :");
        PrintFactors(in.nextInt());
    }

    public static void PrintFactors(int number){
        int possibleFactor = 1;
        LinkedList<Integer>ourLinkedList = new LinkedList<>();      //creating the instance of LinkedList
        while (possibleFactor <= number) {
            if (number % possibleFactor == 0){
                // System.out.println(String.valueOf(possibleFactor) + " is a factor of " + String.valueOf(number) + ".");
                ourLinkedList.add(possibleFactor);
            }
            possibleFactor++;
        }
        System.out.println("Print possible factors from LinkedList: " + ourLinkedList);
        System.out.println("And that's all the factors of " + String.valueOf(number) + ".");
    }
}
