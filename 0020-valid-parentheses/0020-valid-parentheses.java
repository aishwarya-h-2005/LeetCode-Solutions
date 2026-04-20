class Solution {
    public boolean isValid(String s) {
        Stack<Character>result=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
        {
            if(c=='(')
            {
            result.push(')');
            }
            else if(c=='[')
            {
                result.push(']');
            }
            else if(c=='{')
            {
                result.push('}');
            }
            else if(result.isEmpty() || result.pop()!=c)
            {
                return false;
            }
        }
        }
        return result.isEmpty();
    }
}