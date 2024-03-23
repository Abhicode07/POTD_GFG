class GFG
{
	public ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
	    Queue<Node> q = new LinkedList<>();
	    boolean leftToRight = true;
	    q.add(root);
	    
	    while(!q.isEmpty()){
	        ArrayList<Integer> temp = new ArrayList<>();
	        int n = q.size();
	        for(int i=0;i<n;i++){
	            Node curr = q.poll();
	            if(curr.left!=null){
	                q.add(curr.left);
	            }
	            if(curr.right!=null){
	                q.add(curr.right);
	            }
	            temp.add(curr.data);
	        }
	        if(!leftToRight){
	            Collections.reverse(temp);
	        }
	        for(int i=0;i<temp.size();i++){
	            ans.add(temp.get(i));
	        }
	        leftToRight = !leftToRight;
	    }
	    return ans;
	}
}
