package Lab01;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int n = scanner.nextInt();
        double res = sum_fraction_9(x, n);
        System.out.println("S(x, n) = " + res);
    }
    public static double sum_fraction_9(int x, int n) {
        if(n == 1)
            return x;
        else
            return (x*n / Exercise09.factorial(n)) + sum_fraction_9(x, n - 1);
    }
}
