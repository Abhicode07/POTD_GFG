class Solution
{
    public int findPeakElement(List<Integer> a)
    {
        // Code here
        Collections.sort(a);
        int size =a.size();
        return a.get(size-1);
    }
}
