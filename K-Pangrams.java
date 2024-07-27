class Solution {
    boolean kPangram(String str, int k) {
        // code here
        str=str.replaceAll("\\s", "");
        int n=str.length();
        if(n<26) return false;
        if(n>=26 && k==25) return true;
        
        int freq[]=new int[26];
        for(int i=0;i<n;i++) {
            char ch=str.charAt(i);
            freq[ch - 'a']++;
        }
        
        int count=0;
        for(int i=0;i<26;i++) {
            if(freq[i]==0)
            {
                count++;
            }
        }
        
        return k>=count;
    }
}

