import java.util.*;

/*
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/

public class Solution {
    public static Node deleteNodeWithValueX(Node head, int x) {
        //Write your code here...
        if (head == null)
            return head;
        if (x == head.data) {
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            if (x == temp.next.data) {
                Node n = temp.next;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
        
    }
    
}
