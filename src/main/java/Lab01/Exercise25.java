package Lab01;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print("Enter array's size: ");
        int size = scanner.nextInt();
        if(size < 1) {
            System.out.println("Invalid size");
            return;
        }
        int[] arr = new int[size];
        init_arr(arr);
        print_arr(arr);
        Arrays.sort(arr);
        System.out.println("Arrays after sorted: ");
        print_arr(arr);
        System.out.print("Enter a number to find: ");
        int key = scanner.nextInt();
        int idx = getIndex(arr, key);
        if(idx < 0) {
            System.out.println("Value does not exist");
            System.out.println("Array after added value: ");
            int[] new_arr = add_value_to_array(arr, key);
            Arrays.sort(new_arr);
            print_arr(new_arr);
        }
        else
            System.out.println("Value is at index " + idx);
    }
    public static void print_arr(int[] arr) {
        for(int i: arr)
            System.out.print(i + "\t");
        System.out.println();
    }

    public static int getIndex(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == key)
                return i;
        return -1;
    }

    public static int[] add_value_to_array(int[] arr, int value) {
        int[] new_arr = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++)
            new_arr[i] = arr[i];
        new_arr[arr.length] = value;
        return new_arr;
    }

    public static void init_arr(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i +"] = ");
            arr[i] = scanner.nextInt();
        }
    }







}
