package Lab01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string's size: ");
        int size = scanner.nextInt();
        if(size < 1) {
            System.out.println("Invalid size");
            return;
        }
        String[] arr = new String[size];
        init_string_arr(arr);
//        String[] arr = {"cat", "flag", "green", "country", "w3resource" };
        String[] res = find_longest_str(arr);
        for(String str: res)
            System.out.print(str + "\t");

    }
    public static void init_string_arr(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = scanner.nextLine();
        }
    }

    public static String[] find_longest_str(String[] arr) {
        int max = arr[0].length();
        List<String> list = new ArrayList<>();
        for(String str: arr) {
            if(str.length() > max)
                max = str.length();
        }
        for(String str: arr) {
            if(str.length() == max)
                list.add(str);
        }
        String[] res = new String[list.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
