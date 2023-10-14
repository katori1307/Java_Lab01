package Lab01;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n >= 7): ");
        int n = scanner.nextInt();
        if(n < 7) {
            System.out.println("Invalid input");
            return;
        }
        float res = sum_fraction(n);
        System.out.println("1 + 1/2 + ... + 1/" + n + " = " + res);
    }

    public  static float sum_fraction(int n) {
        if(n == 1)
            return 1;
        else
            return 1.0f / n + sum_fraction(n -1);
    }

}
