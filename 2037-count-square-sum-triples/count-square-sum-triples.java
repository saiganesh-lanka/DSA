class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int c=i*i+j*j;
                int c1=(int)Math.sqrt(c);
                if(c1*c1==c && c1<=n)
                {
                    count++;
                }
            }
        }

        return count;
    }
}