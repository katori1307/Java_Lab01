package Lab01;
import java.util.Scanner;
import java.lang.Math;

public class Exercise02 {
    public  static  void main(String ...args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if(n < 5 || n > 20)
        {
            System.out.println("Invalid input");
            return;
        }
        double res = sum_n_square(n);
        System.out.println("1^2 + 2^2 + ... + " + n + "^2 = " + res);
    }
    public static double sum_n_square(int n) {
        if(n == 1)
            return 1;
        else
            return  Math.pow(n, 2) + sum_n_square(n - 1);
    }
}
