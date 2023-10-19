package Lab01;

import java.util.ArrayList;
import java.util.List;

public class Exercise28 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 3, 2, 4};
        int[] res = remove_identical_value(arr);
        Exercise25.print_arr(res);

    }
    public static int[] remove_identical_value(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        for(int value: arr) {
            if(!temp.contains(value))
                temp.add(value);
        }
        int[] res = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++)
            res[i] = temp.get(i);
        return res;
    }


}
