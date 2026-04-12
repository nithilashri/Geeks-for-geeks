/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public static Node makeUnion(Node head1, Node head2) {
        // Code here
        Node merged = merge(head1, head2);
        Node sorted = sort(merged);
        return sorted;
    }
    private static Node merge(Node a , Node b){
        
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
            
        }
        Node ans = null;
        if(a.data<b.data){
            ans = a;
            ans.next = merge(a.next,b);
            
        }
        else if(b.data< a.data){
            ans = b;
             ans.next =merge(a, b.next);
        }else{
            ans= a;
             ans.next =merge(a.next, b.next);
        }
        
        return ans;
        
    }
    
    private static Node sort(Node head){
        
        if(head==null || head.next == null){
            return head;
        }
        Node fast = head.next ;
        Node slow = head;
        while(fast!=null && fast.next!=null){ //This technique is used to find the middle
            fast = fast.next.next;
            slow = slow.next;
        }
        
        Node mid = slow;
        Node midNext = mid.next;
        mid.next = null;
        
        Node first = sort(head);
        Node second = sort(midNext);
        
        Node ans = merge(first,second);
        return ans;
        
        
    }
}