package Lab01;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        double res = sum_factorial(n);
        System.out.println("1 + 1*2 + ... + 1*2*...*n = " + res);
    }
    public static double factorial(int n) {
        if(n == 1)
            return 1;
        else
            return n * factorial(n -1);
    }
    public static double sum_factorial(int n) {
        if(n == 1)
            return 1;
        else
            return factorial(n) + sum_factorial(n - 1);
    }
}
