class Solution {
    public boolean isValid(String s) {

        Stack<Character>brockets=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i)

        if(c == '{' || c == '[' || c == '('){
        brockets.push(c);
        }
        else 
        {
            if(brockets.isEmpty()){
                return false;
            }
        
        char top=brockets.pop();
        
            if((c == '}' && top !='{')||(c == ']' && top !='[')||(c ==')' && top !='('))
            {
                return false;
            }
          }
        }
        return brockets.isEmpty();
     }
     public static void main(String[] args){
            Solution Sol=new Solution();
            System.out.println(Sol.isValid("("));
            System.out.println(Sol.isValid("()[]{}"));
            System.out.println(Sol.isValid("]"));
            System.out.println(Sol.isValid("[]"));
            System.out.println(Sol.isValid("["));   
    }
}
