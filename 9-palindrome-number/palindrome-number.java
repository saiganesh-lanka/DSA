class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int rem=0;
        int ori=x;
        while(x!=0)
        {
            int temp=x%10;
            rem=(rem*10)+temp;
            x=x/10;
        }
        return rem==ori;
    }
}