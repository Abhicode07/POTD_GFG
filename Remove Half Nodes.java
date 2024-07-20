class Solution {
    // Return the root of the modified tree after removing all the half nodes.
    public Node find(Node root){
        if(root==null) return null;
        
        if(root.left==null && root.right==null) return root;
        
        Node left=find(root.left);
        Node right=find(root.right);
        
        root.left=left;
        root.right=right;
        
        
        if(left==null){
            return right;
        }
        else if(right==null){
            return left;
        }
        
        return root;
        
    }
    public Node RemoveHalfNodes(Node root) {
       find(root);
       if(root.left==null && root.right==null) return root;
       if(root.left==null) return root.right;
       if(root.right==null) return root.left;
       
       return root;
    }
}
