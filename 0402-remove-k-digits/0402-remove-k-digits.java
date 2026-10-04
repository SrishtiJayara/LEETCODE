class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int x = num.charAt(i) - '0';
            while (!stack.isEmpty() && k > 0 && stack.peek() > x) {
                stack.pop();
                k--;
            }
            stack.push(x);
        }
        while (k--> 0 && !stack.isEmpty()){
            stack.pop();
        }    
        StringBuilder ans = new StringBuilder();
        for (int x : stack){
            ans.append(x);
        }    
        while (ans.length() > 1 && ans.charAt(0) == '0'){
            ans.deleteCharAt(0);
        }    
        if(ans.length()==0){
            return "0";
        }    
        return ans.toString();
    }
}