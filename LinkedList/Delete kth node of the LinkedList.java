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
    public static Node deleteKthNode(Node head, int k) {
        //Write your code here...
        if(head==null || head.next == null){
            return null;
        }
        int count = 0;
        Node temp = head;
        while(temp!=null){
            if(count==k-1){
                temp.next = temp.next.next;
                break;
            }
            count++;
            temp = temp.next;
        }
        return head;
    }
    
}
