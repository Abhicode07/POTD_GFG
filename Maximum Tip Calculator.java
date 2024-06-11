class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
        int[][] diff = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            diff[i][0] = Math.abs(arr[i] - brr[i]);
            diff[i][1] = arr[i];
            diff[i][2] = brr[i];
        }

        // Sort by the absolute difference in descending order
        Arrays.sort(diff, (a, b) -> b[0] - a[0]);

        long totalTips = 0;
        int countA = 0;
        int countB = 0;

        // Distribute orders to maximize tips
        for (int i = 0; i < n; i++) {
            if ((diff[i][1] >= diff[i][2] && countA < x) || countB >= y) {
                totalTips += diff[i][1];
                countA++;
            } else {
                totalTips += diff[i][2];
                countB++;
            }
        }

        return totalTips;
    }
}
