package Lab01;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter an exponent: ");
        int n = scanner.nextInt();
        double res = sum_pow_2(x, n);
        System.out.println("T(x, n) = " + res);

    }
    public static double sum_pow_2(int x, int n) {
        if(n == 1)
            return Math.pow(x, 2 * n);
        else
            return Math.pow(x, 2 * n) + sum_pow_2(x, n - 1);
    }
}
