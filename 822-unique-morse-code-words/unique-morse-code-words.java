class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String str[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs=new HashSet<>();
        for(String s:words)
        {
            String sb="";
            int i=0;
            while(i<s.length())
            {
                char ch=s.charAt(i);
                int n=ch-'a';
                sb+=str[n];
                i++;
            }
            hs.add(sb);
        }
        return hs.size();
    }
}