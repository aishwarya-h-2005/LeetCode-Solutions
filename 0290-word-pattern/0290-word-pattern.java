class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[]word=s.split(" ");
        HashMap<Character,String>map=new HashMap<>();
        if(pattern.length()!=word.length)
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char original=pattern.charAt(i);
            String copied=word[i];
            if(!map.containsKey(original))
            {
                if(map.containsValue(copied))
                {
                    return false;
                }
                
                map.put (original,copied);
            }
            else
            {
                String aishu=map.get(original);
                
                    if(!aishu.equals(copied))
                    {
                        return false;
                    }
            } 
        }
        return true;
    }
}