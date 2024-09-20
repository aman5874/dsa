import java.util.Arrays;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     int testCases = input.nextInt();
//
//    for (int t = 0; t < testCases; t++) {
//    int count_zeros = input.nextInt();
//    int count = 0;
//    for (int i = 5; count_zeros / i >= 1; i *= 5) {
//        count += count_zeros / i;
//    }
//    System.out.println(count);
//}


//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for (int i = 1; i <= N; i++) {
//            int n = (int) ('1' + i - 1);
//            for (int j = 1; j <= i; j++) {
//                if (j == 1) {
//                    System.out.print(n);
//                } else {
//                    System.out.print(" " + n);
//                }
//            }
//            System.out.println();
//        }


        /************************* Prime Factorization ****************************************/

//Scanner prime_factorization = new Scanner(System.in);
//int N = prime_factorization.nextInt();
//int iterations = 0;
//for (int i = 2; i * i <= N; i++) {
//    while (N % i == 0) {
//        System.out.print(i + " ");
//        N /= i;
//        iterations++;
//    }
//}
//if (N > 1) {
//    System.out.print(N + " ");
//    iterations++;
//}
//System.out.println("Number of iterations: " + iterations);

/*************  Optimized Code ***************/

//Scanner sc = new Scanner(System.in);
//int N = sc.nextInt();
//sc.close();
//int iterations = 0;
//int loopCount = 0;
//
//while (N % 2 == 0) {
//    System.out.print(2 + " ");
//    N /= 2;
//    iterations++;
//    loopCount++;
//}
//
//for (int i = 3; i <= Math.sqrt(N); i += 2) {
//    while (N % i == 0) {
//        System.out.print(i + " ");
//        N /= i;
//        iterations++;
//        loopCount++;
//    }
//}
//
//if (N > 2) {
//    System.out.print(N + " ");
//    iterations++;
//}
//
//System.out.println("\nNumber of iterations: " + iterations);
//System.out.println("Number of loops run: " + loopCount);


        /************************* Marks Grade ****************************************/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 5 numbers marks - seperated by space: ");
//        int marks[] = new int [5];
//        double total = 0;
//        if (marks.length == 0) {
//            System.out.println("No marks entered.");
//        } else {
//            for (int i = 0; i < marks.length; i++) {
//                marks[i] = sc.nextInt();
//            }
//            for (int i = 0; i < marks.length; i++) {
//                if (marks[i] >= 95 && marks[i] <= 100) {
//                    System.out.println("A*");
//                } else if (marks[i] >= 90 && marks[i] < 95) {
//                    System.out.println("B*");
//                } else if (marks[i] >= 85 && marks[i] < 90) {
//                    System.out.println("C*");
//                } else if (marks[i] >= 80 && marks[i] < 85) {
//                    System.out.println("D*");
//                } else {
//                    System.out.println("Laude Laag gai");
//                }
//            }
//
//            for (int i = 0; i < marks.length; i++) {
//                total += marks[i];
//            }
//            System.out.println("Average: " + Math.round(total / marks.length));
//
//        }



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = N; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
