import java.lang.reflect.Type;
import java.util.Scanner;

public class scalerassignment {
    public static void main(String[] args) {
////        int rows = 10;
////        for (int i = 0; i < 4; i++) {
////            // Loop for each column
////            for (int j = 0; j < rows; j+=1) {
////                // Print '*' at the border rows and columns
////                if (i == 0 || i == 3 || j == 0 || j == rows - 1) {
////                    System.out.print("*");
////                } else {
////                    System.out.print(" ");
////                }
////            }
////            System.out.println(); // Move to the next line
////        }
////        Scanner sc = new Scanner(System.in);
////        int X=sc.nextInt();
////        X=((X*5)+10)/2;
////        System.out.println(X);
//
////        Scanner input = new Scanner(System.in);
////        System.out.print("Enter number 1: ");
////        int num1 = input.nextInt();
////        System.out.print("Enter number 2: ");
////        int num2 = input.nextInt();
////        if (num1>= num2*2) {
////            System.out.println("True");
////        } else {
////            System.out.println("False");
////        }
//
////        Scanner sc = new Scanner(System.in);
////        int input1 = sc.nextInt();
////        int input2 = sc.nextInt();
////
////        if (input1 > input2) {
////            System.out.println(input1 + " is greater than " + input2);
////        } else {
////            System.out.println(input1 + " is not greater than " + input2);
////        }
//
////         Scanner sc = new Scanner(System.in);
////         System.out.print("Enter your age: ");
////         int currentage = sc.nextInt();
////         currentage = currentage + 5;
////         if ( currentage >=1 && currentage <= 120) {
////             if (currentage >= 18) {
////                 System.out.println("Congratulation your age will be "+currentage+" on 2029, and you are eligible.");
////             } else{
////                 System.out.println("You are not eligible");
////             }
////         } else {
////             System.out.println("Enter a valid age !!!");
////         }
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the sides: ");
////        int side1 = sc.nextInt();
////        int side2 = sc.nextInt();
////        int side3 = sc.nextInt();
////        int sum = side1 + side2 + side3;
////        if(sum == 180){
////            System.out.println("1");
////        } else{
////            System.out.println("0");
////        }
//
////        Scanner sc = new Scanner(System.in);
////        int N = sc.nextInt();
////        if (N > 0){
////            if(N%2==0){
////                System.out.println("Even-Positive");
////            } else {
////                System.out.println("Odd-Positive");
////            }
////        } else {
////            if(N%2==0){
////                System.out.println("Even-Negative");
////            } else {
////                System.out.println("Odd-Negative");
////            }
////        }
//
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        System.out.println(Math.max(a,b));
//
////    Scanner sc = new Scanner(System.in);
////    int age = sc.nextInt();
////    if (age>=0 && age<=12){
////      System.out.println("Child");
////      } else if (age>=13 && age<=19){
////        System.out.println("Teenager");
////        } else if (age>=20 && age<=40){
////        System.out.println("Young");
////    }  else if (age>=41 && age<=60){
////        System.out.println("Middle-Aged");
////    } else if (age>=60){
////        System.out.println("Senior-Citizen");
////    }
//
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int c = sc.nextInt();
////
////        if ( a== b && a==c ){
////            System.out.println("equilateral");
////        } else if ( a==b || a==c || b==c) {
////            System.out.println("isosceles");
////        } else {
////            System.out.println("scalene");
////        }
//
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int gold = 5*(10^5);
////        int platinum = 10^6;
////        int diamond = 10^7;
////        if ( n>=gold && n<platinum){
////            System.out.println("gold");
////        } else if (n>=platinum && n<diamond) {
////            System.out.println("platinum");
////        } else if (n>diamond) {
////            System.out.println("diamond");
////        } else {
////            System.out.println("None");
////        }
//
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int c = sc.nextInt();
////
////        int g = Math.max(a, b);
////        g = Math.max(g, c);
////        System.out.println(g);
//
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int type = sc.nextInt();
////        int b = sc.nextInt();
////        if (type == 1) {
////            System.out.println(a+b);
////        } else if (type == 2 && a>b){
////            System.out.println(a-b);
////        } else if (b>a){
////            System.out.println("Insufficient Funds");
////        }
//
//
////        Scanner sc = new Scanner(System.in);
////
////        int n = sc.nextInt();
////        int lastThreeDigit = n % 1000;
////
////        int digit1 = lastThreeDigit % 10;
////        int digit2 = (lastThreeDigit / 10) % 10;
////        int digit3 = lastThreeDigit / 100;
////
////        if(digit1 % 2 ==0 && digit2 % 2 ==0 && digit3 % 2 ==0) {
////             System.out.println("C1");
////        } else if(digit1 % 2 ==0 && digit2 % 2 ==0) {
////            System.out.println("C2");
////        }
//
////           Scanner sc = new Scanner(System.in);
////           int N = sc.nextInt();
////           if (N>0){
////               if (N%2==0){
////                   System.out.println("Number is Positive and Even");
////               } else {
////                   System.out.println("Number is Positive and Odd");
////               }
////           } else if(N%2==0) {
////               System.out.println("Number is Negative and Even");
////           } else {
////               System.out.println("Number is Negative and Odd");
////           }
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int m = sc.nextInt();
////
////        if (n % 2 == 0) {
////            n++;
////        }
////        for (int i = n; i <= m; i += 2) {
////            System.out.println(i);
////        }
//
//
//
//
////        Given a number n check if it prime or not?
//                Scanner sc = new Scanner(System.in);
//                String s = sc.nextLine();
//                int a = sc.nextInt();
//
//                if (a>=13){
//                    System.out.println("You can ride the roller coaster!");
//                }else {
//                    System.out.println("You can't ride the roller coaster.");
//                }

//
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int sum = 0;
//        while (N > 0) {
//            int S  = N%10;
//            sum += S;
//            N/=10;
//        }
//        System.out.println(sum);


//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int reverse = 0;
//
//        while(N != 0) {
//            int remainder = N % 10;
//            reverse = reverse * 10 + remainder;
//            N /= 10;
//        }
//
//        System.out.println(reverse*2);

//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        for (int i = 0; i < T; i++) {
//            int N = sc.nextInt();
//            int sum = 0;
//
//            while (N > 0) {
//                sum += N % 10;
//                N /= 10;
//            }
//            System.out.println(sum);
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int y = sc.nextInt();
//        for (int i = n; i <= y; i++)
//        {
//            System.out.println(i+" ");
//        }

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int sum = 0;
//        if (N%2 != 0){
//            for(int i = 1; i<=N; i+=2){
//                sum += i;
//            }
//
//        } else{
//            for(int i = 1; i<N; i+=2){
//                sum += i;
//            }
//        }
//
//        System.out.println(sum);


//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int sum_x = 0, sum_y = 0;
//        while (N > 0) {
//            int digit = N % 10; // Extract the last digit
//            if (digit % 2 == 0) {
//                sum_x += digit;
//            } else {
//                sum_y += digit;
//            }
//
//            N = N / 10;
//        }
//
//        System.out.println("Sum of Odd Digit : " + sum_x);
//        System.out.println("Sum of Even Digit : " + sum_y);


        /************************* MORE OPTIMISED CODE **************************/
//        Scanner sc = new Scanner(System.in);
//        int A = Math.abs(sc.nextInt());
//        int B = Math.abs(sc.nextInt());
//        int min_value = Math.min(A, B);
//        for (int i = min_value; i >= 1; i--) {
//            if (A % i == 0 && B % i == 0) {
//                 common_value = i;
////                System.out.println(i);
//                break;
//            }
//        }

        /************************* LESS OPTIMISED CODE **************************/
//        Scanner sc = new Scanner(System.in);
//        int A = Math.abs(sc.nextInt());
//        int B = Math.abs(sc.nextInt());
//        int min_value = Math.min(A, B);
//        int common_value = 0;
//        for (int i = 1; i <= min_value; i++) {
//            if (A % i == 0 && B % i == 0) {
//                common_value = i;
//            }
//        }
//        System.out.println(common_value);


//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        int count = 0;
//        while(N!=1){
//            N/=2;
//            count++;
//        }
//        System.out.println(count);

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 1; i <=N; i++) {
//            int sum = 0;
//            int temp = i;
//            while (temp > 0) {
//                int digit = temp % 10;
//                sum += Math.pow(digit, 3);
//                temp /= 10;
//            }
//            if (sum == i) {
//                System.out.println(i);
//            }
//
//        }


//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for (int i = 2; i <= N; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;


    /************************* FIND HCF **************************/
//        Scanner HCF = new Scanner(System.in);
//        int A = HCF.nextInt();
//        int B = HCF.nextInt();
//        int min_value = Math.min(A, B);
//        int common_value = 0;
//        for (int i = 1; i <= min_value; i++) {
//            if (A % i == 0 && B % i == 0) {
//                common_value = i;
//            }
//        }
//        System.out.println(common_value);


       /* ************************* FIND LCM **************************/
//        Scanner LCM = new Scanner(System.in);
//        int A = LCM.nextInt();
//        int B = LCM.nextInt();
//        int max_value = Math.max(A, B);
//        int common_value = 0;
//        for (int i = max_value; i <= A * B; i++) {
//            if (i % A == 0 && i % B == 0) {
//                common_value = i;
//                break;
//            }
//        }
//        System.out.println(common_value);



}

}
