class Solution {
    public long findMaxProduct(List<Integer> arr) {
        if (arr.size() == 1) return arr.get(0);
        
        long prod = 1;
        int zeroCount = 0, nonZeroCount = 0;
        int maxNegative = Integer.MIN_VALUE;
        final int MOD = 1000000007;

        for (int num : arr) {
            if (num != 0) {
                prod = (prod * num) % MOD;
                nonZeroCount = 1;
            } else {
                zeroCount = 1;
            }
            if (num < 0 && num > maxNegative) {
                maxNegative = num;
            }
        }

        if (nonZeroCount != 1) return 0;
        if (arr.size() == 2 && zeroCount == 1 && prod < 0) return 0;
        if (prod < 0) prod /= maxNegative;
        
        return prod;
    }
}
