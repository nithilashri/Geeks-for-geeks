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
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node newNode = new Node(val);
        if(pos==1){
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            if(temp==null){
                return head;
            }
            temp = temp.next;
        }
        if(temp==null){
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}