class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
    // Your code here
    if(k==1) return null;
    Node head1=new Node(0);
    Node temp1=head1;
     Node temp=head;
     int x=1;
     while(temp!=null){
         if(x==k){
             temp=temp.next;
             x=1;
         }
        else {
                temp1.next = temp; 
                temp1 = temp1.next; 
                temp = temp.next; 
                x++; 
            }
     }
     temp1.next=null;
     return head1.next;
    }
}

