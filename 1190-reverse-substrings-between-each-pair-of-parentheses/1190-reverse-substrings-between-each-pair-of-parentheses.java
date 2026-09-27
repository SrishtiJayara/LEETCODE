class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=')'){
                stack.push(ch);
            }
            else{
                StringBuilder arr =new StringBuilder();
                while(stack.peek()!='('){
                    arr.append(stack.pop());
                }
                stack.pop();
                for(int j=0;j<arr.length();j++){
                stack.push(arr.charAt(j));
            }
            }
        }
        StringBuilder p=new StringBuilder();
        while(!stack.isEmpty()){
            p.append(stack.pop());
        }
        return p.reverse().toString();
    }
}