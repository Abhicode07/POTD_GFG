class Solution {
    Node node = new Node(-1);
    public void populateNext(Node root) {
        if(root == null) return;
        populateNext(root.left);
        node.next = root;
        node = root;
        populateNext(root.right);
    }
}
