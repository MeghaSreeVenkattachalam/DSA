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
    public static Node insertionAtTail(Node head, int a) {
        //Write your code here...
        if(head==null){
            return new Node(a);
        }
        
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(a);
        return head;
        
    }
    
}
