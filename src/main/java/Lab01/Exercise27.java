package Lab01;

import java.util.*;

public class Exercise27 {
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
        int[] res = findSingleValue(arr);
        Exercise25.print_arr(res);
    }
    public static int[] findSingleValue(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(!temp.contains(arr[i])) {
                temp.add(arr[i]);
            }
        }
        int[] res = new int[temp.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = temp.get(i);
        }
        return res;
    }


}
