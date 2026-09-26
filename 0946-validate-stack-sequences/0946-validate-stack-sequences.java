class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int a=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[a]) {
                stack.pop();
                a++;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}