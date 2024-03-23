class Solution{
    public int sumOfLongRootToLeafPath(Node root)
    {
        if(root==null){
            return 0;
        }
        int depth = findDepth(root);
        return findLongestPathSum(root, depth);
    }
    
    public int findDepth(Node node){
        if(node==null){
            return 0;
        } 
        return 1+ Math.max(findDepth(node.left),findDepth(node.right));
    }
    
    public int findLongestPathSum(Node node, int depth){
        
        if(node==null){
            return Integer.MIN_VALUE;
        } else if(depth==1){
            return node.data;
        } else {
            return node.data+
            Math.max(findLongestPathSum(node.left,depth-1),findLongestPathSum(node.right,depth-1));
        }
    }
}
