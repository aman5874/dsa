import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        /*

        if (boolean expression T or F){
           //body
           } else {
           //do this
           }
        */
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ( num > 5000){
           num += 2000;
        } else if ( num > 2000){
            num += 500;
        } else {
            num += 1000;
        }
     System.out.println("The number is: " + num);

    }
}
