class Solution {
    public int[] FindExitPoint(int n, int m, int[][] mat) {
        // code here
        int r[] = {0,1,0,-1};
        int c[] = {1,0,-1,0};
        int res[] = new int[2];
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m && i >= 0 && j >= 0)
        {
            if(mat[i][j] == 1)
            {
                mat[i][j] = 0;
                k = (k+1)%(4);
            }
            res[0] = i;
            res[1]  = j;
            i = i + r[k];
            j = j + c[k];
        }
        
        return res;
    }
}

