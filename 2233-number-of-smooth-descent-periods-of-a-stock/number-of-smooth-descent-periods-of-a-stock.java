class Solution {
    public long getDescentPeriods(int[] prices) {
        long count=1;
        int l=1;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]==prices[i-1]-1)
            {
                l++;
            }
            else
            {
                l=1;
            }
            count+=l;
        }
        return count;
    }
}