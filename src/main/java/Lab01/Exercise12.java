package Lab01;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter an exponent: ");
        int n = scanner.nextInt();
        double res = sum_pow(x, n);
        System.out.println("T(x, n) = " + res);

    }
    public static double sum_pow(int x, int n) {
        if(n == 1)
            return x;
        else
            return Math.pow(x, n) + sum_pow(x, n - 1);
    }
}
