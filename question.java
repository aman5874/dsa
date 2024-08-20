import java.util.Scanner;

//Q. Find the largest of 3 number?
public class question {
    public static void main(String[] args) {
        Scanner largest = new Scanner(System.in);
      int a= largest.nextInt();
      int b= largest.nextInt();
      int c= largest.nextInt();

       int max = a;
        if (b >max) {
            max = b;

        }
        if (c >max) {
            max = c;
        }
        System.out.println(max);

    }
}
