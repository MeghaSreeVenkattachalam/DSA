import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Main {
    static Node arrayToLL(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node insertX(Node head, int x, int a) {
        if (head == null) {
            return null;
        }
        if (head.data == x) {
            Node newNode = new Node(a);
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == x) {
                Node newNode = new Node(a);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int data = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Node head = arrayToLL(arr);
        head = insertX(head, x, data);
        printLL(head);
    }
}
