class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        return isBSTUtil(root, null, null);
    }
    
    // Helper function
    private boolean isBSTUtil( Node root, Integer min, Integer max){
        if(root == null){
            return true;
        }
        
        if( min != null && root.data <= min || max != null && root.data >= max){
            return false;
        }
        
        return isBSTUtil(root.left, min, root.data) && isBSTUtil(root.right, root.data, max);
    }
}
