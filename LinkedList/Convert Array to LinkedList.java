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
    public static Node arrayToLL(int n, int[] arr) {
        // Write Your Code Here...
      if(n==0){
          return null;
      }
      
      Node head = new Node(arr[0]);
      Node curr = head;
      for(int i=1;i<n;i++){
          Node temp = new Node(arr[i]);
          curr.next = temp;
          curr = curr.next;
      }
      return head;
    }
}
