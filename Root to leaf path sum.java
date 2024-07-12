class Solution {
    boolean hasPathSum(Node root, int target) {
        // Your code here
        if (root == null) {
            return false;
        }

        // Check if we are at a leaf node and the target sum is achieved
        if (root.left == null && root.right == null && root.data == target) {
            return true;
        }

        // Recur for left and right subtrees with updated target
         return hasPathSum(root.left, target - root.data) || hasPathSum(root.right, target - root.data);
    }
}
