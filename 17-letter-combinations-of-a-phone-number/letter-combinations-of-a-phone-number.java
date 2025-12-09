class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> al=new ArrayList<>();
String str[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     if(digits.length()==0)
     {
        return al;
     }
     Find(0,al,digits,new StringBuilder(),str);
     return al;
    }
    public static void Find(int st,List<String> al,String digits,StringBuilder sb,String str[])
    {
        if(sb.length()==digits.length())
        {
            al.add(sb.toString());
            return;
        }
        char ch=digits.charAt(st);
        String s=str[ch-'0'];
        for(char c:s.toCharArray())
        {
            sb.append(c);
            Find(st+1,al,digits,sb,str);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}