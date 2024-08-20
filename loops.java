import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

//        Print numbers from 1 to 5

//        for loop
//        for ( initialisation; condition; increment/decrement){
//            body
//        }

//      Q: Print number upto the 10th number that is given?
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int startnum = input.nextInt();

        for( int num = startnum; num <= startnum +10;  num++ ) {
            System.out.println(num);
        }

//        while loop
        /*
         Syntax:
         while(condition){
           body }
        */
        int num = 1;
        while( num <= startnum +10 ) {
            System.out.println(num);
            num++;
        }

//        Use while loop when its not known how many time loop will run

        //do while loop
        /*
        do {
        } while (condition);
         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while(n <= startnum +10);
    }
}
