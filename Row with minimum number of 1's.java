


class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int min1 = Integer.MAX_VALUE, count = 0;
        int idx = -1;
        for(int i=0; i<n; i++) {
            count  = 0;
            for(int j=0; j<m; j++) {
                if(a[i][j] == 1)
                    count++;
            }
            if(count < min1) {
                min1 = count;
                idx = i;
            }
        }
        
        return idx+1;
    }
};
