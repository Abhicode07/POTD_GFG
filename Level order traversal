class Solution
{
    //Function to return the level order traversal of a tree.
  

    // Function to return the level order traversal of a tree.
    static ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root); // Add the root to the queue

        while (!queue.isEmpty()) {
            Node current = queue.poll(); // Remove the front node from the queue
            result.add(current.data); // Add the current node's value to the result

            // Add the left child to the queue if it exists
            if (current.left != null) {
                queue.offer(current.left);
            }
            // Add the right child to the queue if it exists
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return result;
    }
}
