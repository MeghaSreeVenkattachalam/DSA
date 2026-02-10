import java.util.*;

/*
class Node {
    int data;
    Node next;
    Node prev;
    
    public Node() {}
    public Node(int data) { this.data = data; this.next = null; this.prev = null;}
    public Node(int data, Node next) { this.data = data; this.next = next; this.prev = null;}
}
*/

public class Solution {
    public static List<Integer> convertToArray(Node head) {
        //Write your code here...
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.data);
            head = head.next;
        }
        return list;
        
    }

}
