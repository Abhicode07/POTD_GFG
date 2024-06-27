class Solution {
    /*You are required to complete this method*/
    boolean isToeplitz(int mat[][]) {
        // Your code here
        int n=mat.length;
        int m=mat[0].length;
        if(n==1 || m== 1) return true;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]!=mat[i-1][j-1])
                return false;
            }
        }
        return true;
    }
}
