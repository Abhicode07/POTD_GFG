class Solution {
    // Function to find the maximum occurred integer in all ranges.
   public static int maxOccured(int n, int l[], int r[], int maxx) {
        // Create an array to store the differences
        int[] diff = new int[maxx + 2]; // We use maxx+2 to handle range endpoints correctly

        // Apply the difference array concept
        for (int i = 0; i < n; i++) {
            diff[l[i]] += 1;
            diff[r[i] + 1] -= 1;
        }

        // Calculate the prefix sum and find the maximum occurred integer
        int maxFreq = 0;
        int maxOccurInt = 0;
        int currFreq = 0;
        
        for (int i = 0; i <= maxx; i++) {
            currFreq += diff[i];
            if (currFreq > maxFreq) {
                maxFreq = currFreq;
                maxOccurInt = i;
            }
        }

        return maxOccurInt;
    }
}
