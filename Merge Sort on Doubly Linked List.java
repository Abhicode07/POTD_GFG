class Solution {
    static Node sortDoubly(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        // Find the middle of the list
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        nextOfMiddle.prev = null;
        
        // Recursively sort both halves
        Node left = sortDoubly(head);
        Node right = sortDoubly(nextOfMiddle);
        
        // Merge the sorted halves
        return merge(left, right);
    }
    
    // Function to find the middle node of the doubly linked list
    static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        
        Node slow = head;
        Node fast = head.next;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    // Function to merge two sorted doubly linked lists
    static Node merge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        
        if (right == null) {
            return left;
        }
        
        if (left.data <= right.data) {
            left.next = merge(left.next, right);
            left.next.prev = left;
            left.prev = null;
            return left;
        } else {
            right.next = merge(left, right.next);
            right.next.prev = right;
            right.prev = null;
            return right;
        }
    }
}
