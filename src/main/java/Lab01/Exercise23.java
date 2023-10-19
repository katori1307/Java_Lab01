package Lab01;

import java.util.Scanner;
import java.util.LinkedList;

public class Exercise23 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list's size: ");
        int size = scanner.nextInt();
        if(size < 1) {
            System.out.println("Invalid size");
            return;
        }
        Exercise22.initLinkedList(list, size);
        Exercise22.printList(list);
//        list.add(-2);
//        list.add(1);
//        list.add(-3);
//        list.add(4);
//        list.add(-1);
//        list.add(2);
//        list.add(1);
//        list.add(-5);
//        list.add(4);
        LinkedList<Integer> res = findMaxSubArr(list);
        if(!res.isEmpty())
            Exercise22.printList(res);
        else
            System.out.println("Empty list");
    }

    public static LinkedList<Integer> findMaxSubArr(LinkedList<Integer> list) {
        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<Integer> temp_list = new LinkedList<>();
        int max = list.get(0);
        int temp = list.get(0);
        temp_list.add(temp);
        for(int i = 1; i < list.size(); i++) {
            if(temp + list.get(i) < list.get(i)) {
                temp = list.get(i);
                temp_list.clear();
                temp_list.add(temp);
            }
            else {
                temp += list.get(i);
                temp_list.add(list.get(i));
            }
            if(temp > max) {
                max = temp;
                res = new LinkedList<>(temp_list);
            }
        }
        return res;
    }

}
