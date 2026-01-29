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
    static Node insertKth(Node head, int k, int value) {
        if (head == null) {
            if (k == 0) {
                return new Node(value);
            } else {
                return null;
            }
        }
        if (k == 0) {
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        for (int i = 0; i < k - 1; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return head;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int data = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Node head = arrayToLL(arr);
        head = insertKth(head, k, data);
        printLL(head);
    }
}
