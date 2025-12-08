class Solution {
    public int reverse(int x) {
        //int res=0;
        long rem=0;
        while(x!=0)
        {
            int temp=x%10;
            rem=(rem*10)+temp;
            x=x/10;
        }
        if(rem<=Integer.MIN_VALUE || rem>=Integer.MAX_VALUE)
        {
            return 0;
        }
        return (int)rem;
    }
}