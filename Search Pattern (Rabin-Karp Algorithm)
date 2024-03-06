class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String str = "";
        int n = pattern.length();
        for(int i=0;i<=text.length()-n;i++){
            str = text.substring(i,i+n);
            if(str.equals(pattern)){
                arr.add(i+1);
            }
        }
       return arr; 
    }
}
