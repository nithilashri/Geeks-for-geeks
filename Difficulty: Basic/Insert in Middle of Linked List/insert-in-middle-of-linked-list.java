/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
          Node newNode = new Node(x);
        if(head==null){
            return newNode;
        }
      
        
        int count = 0;
        Node currNode = head;
        while(currNode!=null){
            currNode= currNode.next;
            count++;
        }
        
        int mid = count%2==0?count/2:(count+1)/2;
        
        Node currNode1 = head;
        
        while(mid-- > 1){
            
            currNode1 = currNode1.next;
            
        }
        
        Node currNode2 = currNode1.next;
        currNode1.next = newNode;
        newNode.next = currNode2;
        
        return head;
        
    }
}