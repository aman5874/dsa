import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
//       ************ Question 1 ****************
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int x;
//        if(n%k == 0){
//           x =n+k;
//        } else {
//            x = n + (k-(n%k));
//        }
//        System.out.println(x);


//        ************ Question 2 ****************

//        Scanner sc = new Scanner(System.in);
//        int x = 0;
//        int y = sc.nextInt();
////        int a = 1;
////        int b = 2;
////        int c = 3;
////        int d = 4;
////        int e = 5;
//        if (  ){
//
//        }


        //        ************ Question 3 ****************

//                Scanner scanner = new Scanner(System.in);
//
//                String fyodor = scanner.nextLine();
//                String matroskin = scanner.nextLine();
//                String sharik = scanner.nextLine();
//
//                if (fyodor.equals(matroskin) && fyodor.equals(sharik)) {
//                    // All gestures are the same
//                    System.out.println("?");
//                } else if (fyodor.equals(matroskin)) {
//                    // Fyodor and Matroskin have the same gesture
//                    if (beats(sharik, fyodor)) {
//                        System.out.println("S");
//                    } else {
//                        System.out.println("?");
//                    }
//                } else if (fyodor.equals(sharik)) {
//                    // Fyodor and Sharik have the same gesture
//                    if (beats(matroskin, fyodor)) {
//                        System.out.println("M");
//                    } else {
//                        System.out.println("?");
//                    }
//                } else if (matroskin.equals(sharik)) {
//                    // Matroskin and Sharik have the same gesture
//                    if (beats(fyodor, matroskin)) {
//                        System.out.println("F");
//                    } else {
//                        System.out.println("?");
//                    }
//                } else {
//                    // All gestures are different
//                    System.out.println("?");
//                }
//            }
//
//            // Helper method to check if one gesture beats another
//            private static boolean beats(String gesture1, String gesture2) {
//                return (gesture1.equals("R") && gesture2.equals("S")) ||
//                        (gesture1.equals("S") && gesture2.equals("P")) ||
//                        (gesture1.equals("P") && gesture2.equals("R"));


//                ************ Question 4 ****************

//        Scanner sc = new Scanner(System.in);


//                        Scanner scanner = new Scanner(System.in);

//                        int m = scanner.nextInt();
//                        int d = scanner.nextInt();
//
//                        int daysInMonth = getDaysInMonth(m);
//                        int firstWeekDays = 8 - d;
//
//                        int remainingDays = daysInMonth - firstWeekDays;
//
//                        int columns = 1; // Start with one column for the first week
//                        if (remainingDays > 0) {
//                            columns += (remainingDays + 6) / 7;
//                        }
//
//                        System.out.println(columns);
//                    }
//
//                    private static int getDaysInMonth(int month) {
//                        switch (month) {
//                            case 1: return 31; // January
//                            case 2: return 28; // February (non-leap year)
//                            case 3: return 31; // March
//                            case 4: return 30; // April
//                            case 5: return 31; // May
//                            case 6: return 30; // June
//                            case 7: return 31; // July
//                            case 8: return 31; // August
//                            case 9: return 30; // September
//                            case 10: return 31; // October
//                            case 11: return 30; // November
//                            case 12: return 31; // December
//                            default: return 0;  // Invalid month
//                        }

//                       ************ Question 4 ****************

//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//
//        if (num != 0) {
//            if (num % 2 == 0) {
//                if (num >0) {
//                    if (num % 4 == 0) {
//                        System.out.println("Special Even");
//                    } else if (num < 10) {
//                        System.out.println("Small Even");
//                    } else {
//                        System.out.println("Large Even");
//                    }
//                }
//                if (num < 0) {
//                    if (num % 4 == 0) {
//                        System.out.println("Special Negative Even");
//                    } else if (num > -10) {
//                        System.out.println("Small Negative Even");
//                    } else {
//                        System.out.println("Large Negative Even");
//                    }
//                }
//
//
//            }  else {
//                if (num >0) {
//                    if (num % 3 == 0) {
//                        System.out.println("Special Odd");
//                    } else if (num < 10) {
//                        System.out.println("Small Odd");
//                    } else {
//                        System.out.println("Large Odd");
//                    }
//                }
//                if (num < 0) {
//                    if (num % 3 == 0) {
//                        System.out.println("Special Negative Odd");
//                    } else if (num > -10) {
//                        System.out.println("Small Negative Odd");
//                    } else {
//                        System.out.println("Large Negative Odd");
//                    }
//                }
//            }
//        } else {
//            System.out.println("Zero");
//        }

        //                       ************ Question 5 ****************



//        int n = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        // Calculate the number of valid positions
//        int result = Math.min(n - a, b + 1);
//
//        // Output the result
//        System.out.println(result);

//        if (a>40 && a<100){
//            System.out.println("A");
//        } else if ( a>100) {
//            System.out.println("B");
//        } else if (a<60) {
//            System.out.println("C");
//        } if (a<80) {
//            System.out.println("D");
//        }

//   Q fIZZ bUZZ
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n % 3 == 0 && n % 5 == 0) {
//            System.out.println("Fizz-Buzz");
//        } else if (n % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (n % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println("Not divisible by 3, 5 or both");
//        }


////        Another syntax
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
////        String result = (n % 3 == 0 && n % 5 == 0) ? "Fizz-Buzz" :
////                (n % 3 == 0) ? "Fizz" :
////                        (n % 5 == 0) ? "Buzz" :
////                                "Not divisible by 3, 5 or both";
////
////        System.out.println(result);


//        ***********************Question*****************
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int K = scanner.nextInt();


//
//        if (0 <= K && K < N) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }





    }
}




