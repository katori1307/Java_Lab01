package Lab01;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int n = scanner.nextInt();
        double res = sum_fraction_11(x, n);
        System.out.println("S(x, n) = " + res);
    }
    public static double sum_fraction_11(int x, int n) {
        if(n == 0)
            return 1;
        else
            return (x*(2*n + 1) / Exercise09.factorial(2*n + 1)) + sum_fraction_11(x, n - 1);
    }
}
