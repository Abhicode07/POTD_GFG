class Solution {
    public static int findNumberOfGoodComponent(int e, int v, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList();
        int cnt=0;    // count no. of good component

 // Adjecency list
        for(int i=0; i<=v; i++) adj.add(new ArrayList());
        
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
            int vis[] = new int[v+1];    // visited array

    // add ith vertex in adjceneny list of ith vertex means for example in adjecency list of vertex 1, 1 should also include
    
          for(int i=1; i<=v; i++)
          {
       // if vertex is disconnected(its adjecency list is empty) it means it is an good component so no need to add anything in its adjencey list
            if(adj.get(i).isEmpty())   
            {
                vis[i] = 1;     // mark that vertex visited
                cnt++;               
            }
            else{       // if th vertex how adjecency list of size > 0, add ith vertex on its adj list
                adj.get(i).add(i);
            }
        }
    
         
    // sort adjecency list of all the vertex    
        for(ArrayList<Integer> al : adj){
              Collections.sort(al);
        }
                
      
         ArrayList<Integer> x = new ArrayList();   // we use it to compare two list
    
    // traverse in each vertex
        for(int i=1; i<=v; i++)
        {
            if(vis[i] == 0)     // if vertex not visited yet
            {
                ArrayList<Integer> list = adj.get(i);   // store its adjecncy list in list 
               

                vis[i] = 1;     // mark it visited
                int flag = 0;       // to indicate good component
                
        // go to each vertex which are in adjecency list of ith vertex
                for(int j=0; j<list.size(); j++)
                {
                    int vtx = list.get(j);     // get vertex which are in adj list of ith vertex
                    x = adj.get(vtx);       // get adj list of vertex vtx

        // as we already sorted adjecency list of each vertex so we directly check is adj list of vertex i is equal to adj list of vertex vtx so if any vertex vtx if list are not equal it means they are not a good component
                    if(list.equals(x) == false) // if 'list' and 'x' are not same it means they are not good  component
                    {
                        flag = 1;      // indicates not a good component
                        break;
                    }
                    vis[vtx] = 1;       // mark that vtx visited
                }
                if(flag == 0){            // indicates good component
                    cnt++;
                } 
            }
        }
        
        return cnt;
    }
}
