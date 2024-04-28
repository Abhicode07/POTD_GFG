class Solution {
    Node deleteMid(Node head) {
        if(head.next==null) return head.next;
        int len=0;
        Node temp =head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int mid=len/2;
        len=1;
        temp=head;
        while(mid!=len){
            len++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
