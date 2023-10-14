package Lab01;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        double res = sum_fraction_7(n);
        System.out.println("S(n) = " + res);
    }
    public static double sum_fraction_7(int n) {
        if(n == 1)
            return 1;
        else
            return 1.0f / sum_1_n(n) + sum_fraction_7(n - 1);
    }
    public static int sum_1_n(int n) {
        if(n == 1)
            return 1;
        else
            return n + sum_1_n(n - 1);
    }
}
