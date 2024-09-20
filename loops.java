import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

//        Print numbers from 1 to 5

//        for loop
//        for ( initialisation; condition; increment/decrement){
//            body
//        }

//      Q: Print number upto the 10th number that is given?
//        System.out.print("Enter a number: ");
//        Scanner input = new Scanner(System.in);
//        int startnum = input.nextInt();
//
//        for( int num = startnum; num <= startnum +10;  num++ ) {
//            System.out.println(num);
//        }

//        while loop
        /*
         Syntax:
         while(condition){
           body }
        */
//        int num = 1;
//        while( num <= startnum +10 ) {
//            System.out.println(num);
//            num++;
//        }

//        Use while loop when its not known how many time loop will run

        //do while loop
        /*
        do {
        } while (condition);
         */

//        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//        } while(n <= startnum +10);


        /**************** Print hollow sqr pattern of size N *N *******/
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 1; i <= N ; i++) {
//            for (int j = 1; j <=N ; j++) {
//                if (j == 1 || j == N || i == 1 || i == N) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//        System.out.println();
//        }


        /*    Number Triangle Pattern    */

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 1; i <=N; i++) {
//            for (int j = 1; j <= N-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        /*    Inverted Number Triangle Pattern    */

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        /* Number increasing reverse pattern */
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = N; i >=1 ; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+"");
//            }
//            System.out.println();
//        }

        /* NUmber changing pyramid pattern */
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int num =1;
//        for (int i = 1; i <=N ; i++) {
//
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }


        /********** Zero-One Triangle Pattern *****/

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 1; i <=N ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                if((i+j) % 2 == 0) {
//                    System.out.print("1 ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j + " ");
//            }
//            for (int j = 2; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        /********************* Palindrome ********************/
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
////        int iteration = 0;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <= 2*(n-i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >=1 ; j--) {
//                System.out.print(j+" ");
//            }
//            for (int j = 2; j <=i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
////            iteration++;
//        }
////        System.out.println("Number of iterations: "+iteration);


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = n; i >=1 ; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=n ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for(int i =1; i<=N; i++){
//            for (int j = 1; j <=i ; j+=2) {
//                System.out.print(j);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
////        int M = sc.nextInt();
//
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//            System.out.println();
//            }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(j%2 == 0) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        }
    }
