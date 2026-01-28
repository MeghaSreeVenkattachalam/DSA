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
    public static int lengthofLL(Node head) {
        // Code here
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}
