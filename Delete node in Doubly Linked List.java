
class Solution {
    public Node deleteNode(Node head, int x) {
        //Write code here.
        Node temp=head;
        Node temp1=null;
        if(x==1){
            head=temp.next;
            temp.next.prev=null;
            temp.next=null;
          
            return head;
        }
        
        while(temp.next!=null && x>1){
            temp1=temp;
            temp=temp.next;
            x--;
        }
        if(temp.next==null){
            temp1.next=null;
            return head;
        }
        
        temp1.next=temp.next;
        temp.next.prev=temp1;
        return head;
    }
}

