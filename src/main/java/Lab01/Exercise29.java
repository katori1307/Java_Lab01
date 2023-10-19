package Lab01;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println("The total paths is: " + get_total_paths(n));
    }
    public static int get_total_paths(int n) {
        int total = 1;
        int i = 1;
        while(i * 2 <= n) {
            total += i + (n - i * 2);
            i++;
        }
        return total;
    }
}
