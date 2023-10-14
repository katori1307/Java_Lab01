package Lab01;
import java.util.Scanner;
public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n > 5): ");
        int n = scanner.nextInt();
        if(n <= 5) {
            System.out.println("Invalid input");
            return;
        }
        float res = sum_fraction_6(n);
        System.out.println("1/2 + 3/4 + ... + 2n+1/2n+2 = " + res);
    }
    public static float sum_fraction_6(int n) {
        if(n == 0)
            return 1.0f/2;
        else
            return (2*n + 1) * 1.0f/(2*n + 2) + sum_fraction_6(n - 1);
    }
}
