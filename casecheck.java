import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double num1 = input.nextDouble();
        input.nextLine();   // This reads the leftover "\n" and discards it.
        String str = input.nextLine();
        System.out.println("String: " + str);
        System.out.println("Double: " + num1);
        System.out.println("Int: " + num);
//        char ch = sc.next().trim().charAt(0);
//
//        if (ch>='a' && ch<='z') {
//            System.out.println("Lowercase");
//
//        } else{
//            System.out.println("Uppercase");
//        }
//        int num = sc.nextInt();
//        if (num % 2 != 0) {
//            System.out.println("Weird");
//        } else if ( num >= 2 && num <= 5 ){
//            System.out.println("Not Weird");
//        } else if (num >=6 && num <=20){
//            System.out.println("Weird");
//        } else {
//            System.out.println("Not Weird");
//        }



    }
}
