package Tasks.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    //scanner for input int value
        System.out.print("Input \"x\" :");
        int x = in.nextInt();
        boolean result = evenInRange(x);        //created function for checking interval 24...32 without odd integers
        System.out.println(result);
        
    }

    public static boolean evenInRange(int x){
        if(x >= 24 & x <=32 ){                  //interval
            if(x % 2 == 0){                     //excluding odd integers
                return true;
            }
        }
        return false;
    }
}
