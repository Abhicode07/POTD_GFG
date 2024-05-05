class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        Queue<Pair> q=new LinkedList<>();
        Map<Integer, ArrayList<Integer>> hm=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
           int n=q.size();
          for(int i=0;i<n;i++){
           Pair p= q.poll();
           Node temp=p.root;
           int line=p.line;
           if(hm.containsKey(line)){
               ArrayList<Integer> list=hm.get(line);
               list.add(temp.data);
               hm.put(line,list);
           }else{
               ArrayList<Integer> list=new ArrayList<Integer>();
               list.add(temp.data);
               hm.put(line,list);
           }
           if(temp.left!=null){
               q.add(new Pair(temp.left,line-1));
           }
           if(temp.right!=null){
               q.add(new Pair(temp.right,line+1));
           }
           }
           
        }
       // System.out.println(hm);
        ArrayList<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> h: hm.entrySet()){
             res.add(sum(h.getValue()));
        }
        return res;
    }
    
    public int sum(ArrayList<Integer> list){
        int sum=0;
        for(int i:list)
          sum+=i;
         return sum; 
    }
}

class Pair{
    Node root;
    int line;
    Pair(Node root,int line){
        this.root=root;
        this.line=line;
    }
}
