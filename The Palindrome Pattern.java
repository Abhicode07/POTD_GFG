class Solution {
    public String pattern(int[][] arr) {
        // Code here
        int n = arr.length;
        for(int i =0; i<n;i++){
            int k =0;
            int l = n-1;
            while(k < l){
                if(arr[i][k] != arr[i][l]){
                    break;
                }
                k++;
                l--;
            }
            if(k >= l) return i+" R";
        }
            for(int i =0; i<n;i++){
                int k =0;
                int l = n-1;
                while(k < l){
                    if(arr[k][i] != arr[l][i]){
                        break;
                    }
                    k++;
                    l--;
                }
                if(k >= l) return i+" C";
            }
        return "-1";
        
    }
}
