package Lab01;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter an exponent: ");
        int n = scanner.nextInt();
        double res = sum_pow_3(x, n);
        System.out.println("S(n) = " + res);
    }
    public static double sum_pow_3(int x, int n) {
        if(n == 1)
            return x;
        else
            return Math.pow(x, 2*n + 1) + sum_pow_3(x, n - 1);
    }
}
