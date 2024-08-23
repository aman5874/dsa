import java.math.BigInteger;
import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 1; i <= T; i++) {
            BigInteger N = input.nextBigInteger();
            System.out.println(N + " can be fitted in: ");
            if (N.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && N.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println("* long");
                if (N.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && N.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    System.out.println("* int");
                    if (N.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && N.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                        System.out.println("* short");
                        if (N.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && N.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                            System.out.println("* byte");
                        }
                    }
                }
            } else {
                System.out.println(N + " can't be fitted anywhere.");
            }
        }
        input.close();
    }
}
