//User function Template for Java



class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {   
        
        ArrayList<Integer> list = new ArrayList<>();
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<m; i++){
            set.add(b[i]);
        }
        
        for(int i=0; i<n; i++){
            if(!set.contains(a[i])){
                list.add(a[i]);
            }
        }
        
        return list;
        
    }
}
