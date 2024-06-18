class Solution{
    int rectanglesInCircle(int r){
        int ans=0;
        int r1 = 4*r*r;
        for(int i=1;i<2*r;i++){
            ans += Math.abs(Math.sqrt(r1 - i*i));
        }
        return ans;
    }
};
