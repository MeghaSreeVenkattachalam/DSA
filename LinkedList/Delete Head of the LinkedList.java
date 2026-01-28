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
    public static Node deleteHead(Node head) {
        //Write your code here...
        if(head==null || head.next==null){
            return null;
        }
        return head.next;
    }
    
}
