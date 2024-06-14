class Solution {
    static String armstrongNumber(int n) {
        // code here
        int sum =0;
        int temp = n;
        
        int a = n%10;
        n = n/10;
        sum+=a*a*a;
        
        a = n%10;
        n = n/10;
        sum+=a*a*a;
        
        a = n%10;
        n = n/10;
        sum+=a*a*a;
        
        if(sum==temp){
            return "true";
        }
        
        return "false";// code here
    }
}
