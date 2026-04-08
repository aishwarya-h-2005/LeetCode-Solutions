class Solution {
    public String reverseWords(String s) {
      
        StringBuilder result=new StringBuilder();
        String[] words=s.split(" +");
        for(int i=words.length-1;i>=0;i--)
        { 
            result.append(words[i]);
            result.append(' '); 
        }      
        return result.toString().trim();
    }
}