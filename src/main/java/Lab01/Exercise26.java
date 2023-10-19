package Lab01;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] arr = { 10, 2, 38, 23, 38, 23, 21};
        System.out.print("Enter array's size: ");
        int size = scanner.nextInt();
        if(size < 1) {
            System.out.println("Invalid size");
            return;
        }
        int[] arr = new int[size];
        Exercise25.init_arr(arr);
        System.out.print("The most average number in arr: " + findTheMostAverageValue(arr));

    }

    public static float getAverage(int[] arr) {
        float res = 0;
        for(int value: arr)
            res += value;
        return res / arr.length;
    }

    public static int findTheMostAverageValue(int[] arr) {
        int res = arr[0];
        float avg = getAverage(arr);
        float min_diff = Math.abs(arr[0] - avg);
        for(int i: arr) {
            if(i == avg)
                return i;
            if(Math.abs(i - avg) < min_diff) {
                res = i;
                min_diff = Math.abs(i - avg);
            }
        }
        return res;
    }
}
