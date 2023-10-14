package Lab01;
import java.util.Scanner;
public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n > 6): ");
        int n = scanner.nextInt();
        if(n <= 6) {
            System.out.println("Invalid input");
            return;
        }
        float res = sum_fraction_4(n);
        System.out.println("1/1*2 + 1/2*3 + ... + 1/n*(n+1) = " + res);
    }
    public static float sum_fraction_4(int n) {
        if(n == 1)
            return 1.0f/2;
        else
            return 1.0f/(n*(n + 1)) + sum_fraction_4(n - 1);
    }
}
