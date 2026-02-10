import java.util.*;
class Node {
    public
        int data;
        Node next;
        Node prev;
        Node (int value, Node nextAddress, Node prevAddress) {
            data = value;
            next = nextAddress;
            prev = prevAddress;
        }
        Node(int value){
            data = value;
            next = null;
            prev = null;
        }
}
public class Main {
    public static Node arrayToDLL(int[] arr, int n) {
        if (n == 0) return null;
        Node head = new Node(arr[0]);
        Node cur = head;
        for (int i = 1; i < n; i++) {
            Node temp = new Node(arr[i]);
            temp.prev = cur;
            cur.next = temp;
            cur = temp;
        }
        return head;
    }
    public static void printDLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Node head = arrayToDLL(arr, n);
        printDLL(head);
    }
}


