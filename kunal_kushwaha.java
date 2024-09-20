import java.util.Arrays;
import java.util.Scanner;

public class kunal_kushwaha {
    public static void main(String[] args) {
        /******************* Q1) Input a year and find whether it is a leap year or not. ***********************/
       /* Scanner leap_year = new Scanner(System.in);
        int year = leap_year.nextInt();
        if (year >2000) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap Year");
                    } else {
                        System.out.println("Not a Leap Year");
                    }
                } else {
                    System.out.println("Leap Year");
                }
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Invalid Year");

        } */


        /******************* Q2) Take two numbers and print the sum of both. ***********************/
      /*  Scanner sum = new Scanner(System.in);
        int A = sum.nextInt();
        int B = sum.nextInt();
        System.out.println(A + B); */


        /******************* Q3) Take a number as input and print the multiplication table for it.***********************/
     /*   Scanner table = new Scanner(System.in);
        int N = table.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(N + " x " + i + " = " + N*i);
        }
          */

        /* ******************* Q4) Take a number as input and print the factorial of it. ***********************/
      /*  Scanner factorial = new Scanner(System.in);
        int N = factorial.nextInt();
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }
        System.out.println(fact);*/

        /* ******************* Q5) To calculate Fibonacci Series up to n numbers.***********************/
        
    /*    Scanner fibonacci = new Scanner(System.in);
        int N = fibonacci.nextInt();
        int fibo = 0;
        for (int i = 1; i < N ; i++) {
            fibo += fibo +i;
            
        } */


        /**********************Area Of Triangle***************************/

      /*  Scanner input = new Scanner(System.in);
        System.out.print("Enter the base in cm: ");
        int base = input.nextInt();
        System.out.print("Enter the height in cm: ");
        int height = input.nextInt();
        System.out.print("The area of triangle: " + 0.5 * base * height);*/


        /* ******************* Q6) Take a number as input and print the sum of all the digits. ***********************/
 /*       Scanner sum = new Scanner(System.in);
        int N = sum.nextInt();
        int sumOfDigits = 0;
        while (N > 0) {
            sumOfDigits += N % 10;
            N = N / 10;
        }
        System.out.println(sumOfDigits);*/


        /* ******************* Q7) Shuffle the Array ***********************/

// Scanner arr = new Scanner(System.in);
//int num[] = new int[arr.nextInt()];
//for (int i = 0; i < num.length; i++) {
//    num[i] = arr.nextInt();
//}
//int a = num.length;
//if (a % 2 == 0) {
//    int mid = a / 2;
//    int shuffled[] = new int[a];
//    for (int i = 0; i < mid; i++) {
//        shuffled[i * 2] = num[i];
//        shuffled[i * 2 + 1] = num[mid + i];
//    }
//    System.out.println(Arrays.toString(shuffled));
//}

        /* ******************* Q8) ***********************/
//        Scanner arr = new Scanner(System.in);
//        int num[] = new int[arr.nextInt()];
//        int pair_count = 0;
//        for (int i = 0; i < num.length; i++) {
//            num[i] = arr.nextInt();
//        }
//        for (int i = 0; i < num.length; i++) {
//            for (int j = i +1; j < num.length; j++) {
//                if (num[i] == num[j] && i != j) {
//                    pair_count++;
//                }
//            }
//        }
//            System.out.println(pair_count);

            /* ******************* Q9) ***********************/

//        Scanner arr = new Scanner(System.in);
//        int num[] = new int[arr.nextInt()];
//        int even_count = 0;
//        for (int i = 0; i < num.length; i++) {
//            num[i] = arr.nextInt();
//        }
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 0) {
//                even_count++;
//            }
//        }
//        System.out.println(even_count);

        /* ******************* Q10) Given 2 arrays of same size. Check if it is identical or not***********************/
//        Scanner arr = new Scanner(System.in);
//        int num1[] = new int[arr.nextInt()];
//        int num2[] = new int[num1.length];
//        boolean isIdentical = true;
//        for (int i = 0; i < num1.length; i++) {
//            num1[i] = arr.nextInt();
//        }
//        for (int i = 0; i < num2.length; i++) {
//            num2[i] = arr.nextInt();
//        }
//        for (int i = 0; i < num1.length; i++) {
//            if (num1[i] != num2[i]) {
//                isIdentical = false;
//                break;
//            }
//        }
//        if (isIdentical) {
//            System.out.println("Identical");
//        } else {
//            System.out.println("Not Identical");
//        }

        /* ******************* Q11) Reverse of given array ***********************/
//        Scanner arr = new Scanner(System.in);
//        int nums[] = new int[arr.nextInt()];
//        boolean isPalindrome = true;
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = arr.nextInt();
//        }
//        int start = 0;
//        int end = nums.length - 1;
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(nums));


        /**********************************************************************************************/

//        Scanner arr = new Scanner(System.in);
//        System.out.print("Enter the size of array: ");
//        int nums[] = new int[arr.nextInt()];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = arr.nextInt();
//        }
//        System.out.print("Enter the value of K: ");
//        int K = arr.nextInt();
//        int sum;
//        int count_pairs = 0;
//        int iterations = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                sum = nums[i] + nums[j];
//                if (sum == K) {
//                    count_pairs++;
//                }
//            }
//              iterations++;
//        }
//            System.out.println(count_pairs);
//        System.out.println("Number of iterations: " + iterations);



     /* ******************* Optimized code ***********************/
//        Scanner arr = new Scanner(System.in);
//        System.out.print("Enter the size of array: ");
//        int nums[] = new int[arr.nextInt()];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = arr.nextInt();
//        }
//        System.out.print("Enter the value of K: ");
//        int K = arr.nextInt();
//        arr.close();
//
//        Arrays.sort(nums);
//        int left = 0;
//        int right = nums.length - 1;
//        int count_pairs = 0;
//        int iterations = 0;
//
//        while (left < right) {
//            int sum = nums[left] + nums[right];
//            if (sum == K) {
//                count_pairs++;
//                left++;
//                right--;
//            } else if (sum < K) {
//                left++;
//            } else {
//                right--;
//            }
//            iterations++;
//        }
//
//        System.out.println(count_pairs);
//        System.out.println("Number of iterations: " + iterations);

        /************************** Given array print only the unique numbers in that array. *************************/
        Scanner arr = new Scanner(System.in);
        int testcase = arr.nextInt();
        for (int i = 0; i < testcase; i++) {
            int nums[] = new int[arr.nextInt()];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = arr.nextInt();
            }
            Arrays.sort(nums);
        for (int k = 0; k < nums.length; k++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (k != j && nums[k] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }
          if (isUnique) {
              System.out.print(nums[k]+" ");
          }
}
            System.out.println();
        }

//
//
//
            /***********************************************************/

//            Scanner arr = new Scanner(System.in);
//            int nums[] = new int[arr.nextInt()];
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = arr.nextInt();
//            }
//            int count = 0;
//            int iterations = 0;
//              for (int i = 0; i < nums.length; i++) {
//                  for (int j = i + 1; j < nums.length; j++) {
//                      for (int k = j+1; k < nums.length; k++) {
//                          int sum = nums[i] + nums[j] + nums[k];
//                          if (sum % 2 == 0) {
//                              System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
//                              count++;
//                          }
//                      }
//                  }
//
//                          iterations++;
//              }
//        System.out.println("Number of triplets: " + count);
//        System.out.println("Number of iterations: " + iterations);


        /*************************************************/

//Scanner sc = new Scanner(System.in);
//int testcase = sc.nextInt(); // Number of test cases
//
//for (int i = 1; i <= testcase; i++) {
//    int length = sc.nextInt();
//    int arr[] = new int[length];
//    for (int j = 0; j < length; j++) {
//        arr[j] = sc.nextInt();
//    }
//
//    for (int j = 0; j < length; j++) {
//        if (arr[j] % 2 != 0) {
//            System.out.print(arr[j] + " ");
//        }
//    }
//    System.out.println();
//    for (int j = 0; j < length; j++) {
//        if (arr[j] % 2 == 0) {
//            System.out.print(arr[j] + " ");
//        }
//    }
//    System.out.println();
//}

//
//        Scanner sc = new Scanner(System.in);
//        int testcase = sc.nextInt(); // Number of test cases







    }
}
