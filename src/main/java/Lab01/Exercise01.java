package Lab01;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (3 <= n <= 50): ");
        int n = scanner.nextInt();
        if(n < 3 || n > 50)
        {
            System.out.println("Invalid input number");
            return;
        }
        int res = sum_1_n(n);
        System.out.println("S = 1 + 2 + 3 + ... + " + n + " = " + res);
    }
    public static int sum_1_n(int n) {
        if(n == 1)
            return 1;
        else
            return n + sum_1_n(n-1);
    }
}
