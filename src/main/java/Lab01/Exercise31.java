package Lab01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        if(onlyContainIdenticalChar(str))
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static boolean onlyContainIdenticalChar(String str) {
        List<Character> check_list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            if(check_list.contains(str.charAt(i)))
                return false;
            check_list.add(str.charAt(i));
        }
        return true;
    }
}
