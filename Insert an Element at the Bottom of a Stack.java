


class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
        Stack<Integer>stack = new Stack<>();
        
        while(!st.isEmpty())
        {
            stack.push(st.pop());
        }
        stack.push(x);
        
        while(!stack.isEmpty())
        {
            st.push(stack.pop());
        }
        return st;
        
    }
    
}
