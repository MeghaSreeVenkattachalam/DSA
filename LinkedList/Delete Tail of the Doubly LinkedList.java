import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Main {
    public static void printDLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

   public static Node deleteTail(Node head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            head = null;
            return head;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node tail = temp.next;
        temp.next = null;
        tail.prev = null;
        return head;
    }

    public static Node arrayToDLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Node head = arrayToDLL(arr);
        head = deleteTail(head);
        printDLL(head);
    }
}
