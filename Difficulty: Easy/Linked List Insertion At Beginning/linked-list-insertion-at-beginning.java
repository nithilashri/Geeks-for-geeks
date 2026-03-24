/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        //Node first = new Node();
        Node first = new Node(x);
        first.next = head;
        
        
       return first;
    }
}