package Lab01;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list's size: ");
        int size = scanner.nextInt();
        if(size < 1) {
            System.out.println("Invalid size");
            return;
        }
        initLinkedList(list, size);
        printList(list);
        System.out.print("Reversed list: ");
        printReverseList(list);
    }
    public static void initLinkedList(LinkedList<Integer> list, int size) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i++) {
            System.out.print("list[" + i + "] = ");
            list.add(scanner.nextInt());
        }
    }

    public static void printList(LinkedList<Integer> list) {
        for(int element: list)
            System.out.print(element+ "\t");
        System.out.println();
    }

    public static void printReverseList(LinkedList<Integer> list) {
        for(int i = list.size() - 1; i >= 0; i--)
            System.out.print(list.get(i) + "\t");
        System.out.println();
    }
}
