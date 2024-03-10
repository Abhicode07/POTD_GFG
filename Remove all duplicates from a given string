
class Solution {
    String removeDuplicates(String str) {
        
        if(str.length()==0 || str.length()==1) return str;
        Set<Character> set = new LinkedHashSet();
        for(int i=0; i<str.length(); i++)
        {
            set.add(str.charAt(i));
        }
        str = "";
        for(Character ch : set)
        {
            str+=ch;
        }
        return str;
    }
}
