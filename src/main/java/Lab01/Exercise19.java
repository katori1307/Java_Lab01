package Lab01;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int n = scanner.nextInt();
        double res = sum_fraction_10(x, n);
        System.out.println("S(x, n) = " + res);
    }
    public static double sum_fraction_10(int x, int n) {
        if(n == 1)
            return 1;
        else
            return (x*2*n / Exercise09.factorial(2*n)) + sum_fraction_10(x, n - 1);
    }
}
