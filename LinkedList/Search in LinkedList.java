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
    public static int searchInLL(Node head, int k) {
        //Write your code here...
        while(head!=null){
            if(head.data == k){
                return 1;
            }
            head = head.next;
        }
        return 0;
        
    }
    
}
