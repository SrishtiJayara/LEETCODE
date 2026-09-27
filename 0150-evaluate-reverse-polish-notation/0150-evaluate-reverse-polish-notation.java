class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            if(Character.isDigit(tokens[i].charAt(0)) || tokens[i].length() > 1) {
                stack.push(Integer.parseInt(tokens[i]));
            }
            else {
                int b = stack.pop();
                int a = stack.pop();
                if(tokens[i].equals("+")) {
                    stack.push(a + b);
                }
                else if(tokens[i].equals("-")) {
                    stack.push(a - b);
                }
                else if(tokens[i].equals("/")) {
                    stack.push(a / b);
                }
                else if(tokens[i].equals("*")) {
                    stack.push(a * b);
                }
            }
        }
        return stack.pop();
    }
}