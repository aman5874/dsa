import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int count_zeros = input.nextInt();
        int count = 0;
        for (int i = 5; count_zeros / i >= 1; i *= 5) {
            count += count_zeros / i;
        }
        System.out.println(count);
    }
}
