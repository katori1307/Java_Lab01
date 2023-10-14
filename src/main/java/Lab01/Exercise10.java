package Lab01;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int x = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int n = scanner.nextInt();
        double res = power(x, n);
        System.out.println(x + "^" + n + " = " + res);
    }
    public static double power(int x, int n) {
        if(n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }
}
