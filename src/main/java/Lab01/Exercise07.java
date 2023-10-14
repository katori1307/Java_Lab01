package Lab01;
import java.util.Scanner;
public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n >= 1): ");
        int n = scanner.nextInt();
        if(n < 1) {
            System.out.println("Invalid input");
            return;
        }
        float res = sum_fraction_5(n);
        System.out.println("1/2 + 2/3 + ... + n/n+1 = " + res);
    }
    public static float sum_fraction_5(int n) {
        if(n == 1)
            return 1.0f/2;
        else
            return n * 1.0f/(n + 1) + sum_fraction_5(n - 1);
    }
}
