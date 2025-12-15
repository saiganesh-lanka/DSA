class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String str[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs=new HashSet<>();
        for(String s:words)
        {
            StringBuilder sb=new StringBuilder();
            int i=0;
            while(i<s.length())
            {
                char ch=s.charAt(i);
                int n=ch-'a';
                sb.append(str[n]);
                i++;
            }
            hs.add(sb.toString());
        }
        return hs.size();
    }
}