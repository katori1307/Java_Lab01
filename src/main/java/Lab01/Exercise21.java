package Lab01;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = scanner.nextInt();
        if(m < 1 || n < 1) {
            System.out.println("Invalid input");
            return;
        }
        int[][] arr = new int[m][n];
        init_2d_array(arr, m, n);
        print_2d_array(arr);
        System.out.println("Max element: " + findMax(arr));
        System.out.println("Min element: " + findMin(arr));
        System.out.print("Enter an integer to find its position in 2d_array: ");
        int target = scanner.nextInt();
        if(getIndex(arr, target) == -1) {
            System.out.println("Element does not exist");
        }
    }
    public static void init_2d_array(int[][] arr, int m, int n) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
    }
    public static void print_2d_array(int[][] arr) {
        for(int[] row: arr) {
            for (int element : row)
                System.out.print(element + "\t");
            System.out.println();
        }
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for(int[] row: arr) {
            for(int element: row) {
                max = Math.max(max, element);
            }
        }
        return max;
    }

    public static int findMin(int[][] arr) {
        int min = arr[0][0];
        for(int[] row: arr) {
            for(int element: row) {
                min = Math.min(min, element);
            }
        }
        return min;
    }

    public static int getIndex(int[][] arr, int key) {
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
                if(arr[i][j] == key) {
                    System.out.println(key + " is at index: " + "[" + i + "][" + j + "]");
                    return 1;
                }
        return -1;
    }
}
