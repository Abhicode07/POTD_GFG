
class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int[] ans = new int[q];
        int max = a[0];
        for (int x : a) {
            max = Math.max(max, x);
        }
        int[] hash = new int[max+1];
        for (int x : b) {
            if (x <= max) {
                hash[x]++;
            }
        }
        //prefix sum
        for (int i = 1; i <= max; i++) {
            hash[i] += hash[i-1];
        }
        for (int i = 0; i < q; i++) {
            ans[i] = hash[a[query[i]]];
        }
        return ans;
    }
}
