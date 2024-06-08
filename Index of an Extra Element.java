class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
             int low = 0;
        int high = arr2.length;  // or arr1.length - 1

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr1[mid] == arr2[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    
    }
}
