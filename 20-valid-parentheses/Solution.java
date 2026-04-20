class Solution {
    public boolean isValid(String s) {
        Stack<Character>result=new Stack<>();
        for(char c:s.toCharArray())
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
        return result.isEmpty();
    }
}
