class Solution 
{
    static int binarySearch(int mat1[][], int targetValue,int n)
    {
        int start=0;
        int end=n-1;
        while(start<n && end>=0)
        {
            if(mat1[start][end]==targetValue)
                return 1;
            else if(mat1[start][end]<targetValue)
                start++;
            else
                end--;
        }
        return 0;
        
    }
    
    int countPairs(int mat1[][], int mat2[][], int n, int x) 
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int targetValue=x-mat2[i][j];
                if(binarySearch(mat1,targetValue,n)==1)
                    count++;
            }
        }
        return count;
    }
}
