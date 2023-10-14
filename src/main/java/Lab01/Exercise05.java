package Lab01;
import java.util.Scanner;
public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n >= 2): ");
        int n = scanner.nextInt();
        if(n < 2) {
            System.out.println("Invalid input");
            return;
        }
        float res = sum_fraction_3(n);
        System.out.println("1 + 1/3 + 1/5 + ... + 1/" + (2*n + 1) + " = " + res);
    }
    public static float sum_fraction_3(int n) {
        if(n == 0)
            return 1;
        else
            return 1.0f/(2*n + 1) + sum_fraction_3(n - 1);
    }
}
