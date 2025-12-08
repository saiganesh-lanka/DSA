class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                l--;
                r++;
            }
            String odd=s.substring(l+1,r);
            if(res.length()<odd.length())
            {
                res=odd;
            }
            int left=i-1;
            int right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }
            String even=s.substring(left+1,right);
            if(res.length()<even.length())
            {
                res=even;
            }
        }
        return res;
    }
}