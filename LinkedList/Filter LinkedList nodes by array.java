import java.util.*;

/*
class Node {
    int data;
    Node next;

    public Node() {}
    public Node(int data) { this.data = data; this.next = null;}
    public Node(int data, Node next) { this.data = data; this.next = next; }
}
*/

public class Solution {
    public static Node deleteNodes(Node head, int[] arr) {
        //Write your code here...
        Set<Integer> toDelete = new HashSet<>();
        for (int num : arr) {
            toDelete.add(num);
        }
        while (head != null && toDelete.contains(head.data)) {
            head = head.next;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (toDelete.contains(temp.next.data)) {
                // Skip the next node
                temp.next = temp.next.next;
            } else {
                // Only move forward if we didn't delete a node
                temp = temp.next;
            }
        }

        return head;
        
    }

}
