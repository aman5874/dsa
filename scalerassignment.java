import java.util.Scanner;

public class scalerassignment {
    public static void main(String[] args) {
//        int rows = 10;
//        for (int i = 0; i < 4; i++) {
//            // Loop for each column
//            for (int j = 0; j < rows; j+=1) {
//                // Print '*' at the border rows and columns
//                if (i == 0 || i == 3 || j == 0 || j == rows - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(); // Move to the next line
//        }
//        Scanner sc = new Scanner(System.in);
//        int X=sc.nextInt();
//        X=((X*5)+10)/2;
//        System.out.println(X);

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2 = input.nextInt();
//        if (num1>= num2*2) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

//        Scanner sc = new Scanner(System.in);
//        int input1 = sc.nextInt();
//        int input2 = sc.nextInt();
//
//        if (input1 > input2) {
//            System.out.println(input1 + " is greater than " + input2);
//        } else {
//            System.out.println(input1 + " is not greater than " + input2);
//        }

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int currentage = sc.nextInt();
//         currentage = currentage + 5;
//         if ( currentage >=1 && currentage <= 120) {
//             if (currentage >= 18) {
//                 System.out.println("Congratulation your age will be "+currentage+" on 2029, and you are eligible.");
//             } else{
//                 System.out.println("You are not eligible");
//             }
//         } else {
//             System.out.println("Enter a valid age !!!");
//         }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int sum = side1 + side2 + side3;
        if(sum == 180){
            System.out.println(sum);
        }

    }
}
