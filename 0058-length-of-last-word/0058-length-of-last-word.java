class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int last_word=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                last_word++;
            }
            else
            {
                break;
            }
        }
        return last_word;
        
    }
}