class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
       int c=mat[0].length;
       int r=mat.length;
       k%=c;
       int a[][]=new int[r][c];
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
               int nc=(j-k+c)%c;
               a[i][nc]=mat[i][j];
           }
       }
       return a;
    }
}
