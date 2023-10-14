package Lab01;

import java.util.Scanner;

public class Excercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n > 6): ");
        int n = scanner.nextInt();
        if(n <= 6) {
            System.out.println("Invalid input");
            return;
        }
        double res = factorial(n);
        System.out.println("1 * 2 * ... * n = " + res);
    }
    public static double factorial(int n) {
        if(n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
