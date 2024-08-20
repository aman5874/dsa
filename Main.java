import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int newNum = num+100;
        System.out.println("The new number is: " + newNum);
    }
}
