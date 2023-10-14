package Lab01;
import java.util.Scanner;
public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n > 9): ");
        int n = scanner.nextInt();
        if(n <= 9)
        {
            System.out.println("Invalid input");
            return;
        }
        float res = sum_fraction_2(n);
        System.out.println("1/2 + 1/4 + ... + 1/" + 2*n + " = " + res);
    }
    public static float sum_fraction_2(int n) {
        if(n == 1)
            return 1.0f/ (2*n);
        else
            return 1.0f / (2*n) + sum_fraction_2(n - 1);
    }
}
