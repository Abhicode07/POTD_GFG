class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        
        for(int i = 0; i < str.length() ;i++){
            
            if(str.charAt(i) == '(' ){
                list.add(count);
                stack.push(count);
                count++;
            }
            
            if(str.charAt(i) == ')'){
                list.add(stack.pop());
            }
        }
        
        return list;
    }
};

