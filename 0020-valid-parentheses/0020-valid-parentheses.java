class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack=new Stack<>();
       if(s.length()==1){
        return false;
       }
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            stack.push('(');
        }
        else if (s.charAt(i)==')' &&!stack.isEmpty() && stack.peek()=='('){
            stack.pop();
        }
        else if (s.charAt(i)=='['){
            stack.push('[');
        }
        else if (s.charAt(i)==']' &&!stack.isEmpty() && stack.peek()=='['){
            stack.pop();
        }
        else if (s.charAt(i)=='{'){
            stack.push('{');
        }
        else if (s.charAt(i)=='}'&&!stack.isEmpty() && stack.peek()=='{'){
            stack.pop();
        }
        else{
            return false;
        }
       }
       return stack.isEmpty();
    }
}