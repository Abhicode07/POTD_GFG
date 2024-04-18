//User function template for JAVA

class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        ArrayList<Integer>list=new ArrayList<>();
     
        
        int []count=new int[n+1];
        
        for(int i=0;i<arr.length;i++){
            if(count[arr[i]]>0){
                list.add(arr[i]);
            }
            else{
                count[arr[i]]++;
            }
        }
        
        int[] ans=new int[list.size()];
        int t=0;
        for(int a:list){
            ans[t]=a;
            t++;
        }
        
        return ans;
    }
    
}
