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
    public static Node insertionAtHead(Node head, int a) {
        //Write your code here...
        Node newNode = new Node(a);
        newNode.next = head;
        head = newNode;
        return head;
        
    }
    
}
