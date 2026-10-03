class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++) {
            if(asteroids[i] > 0) {
                stack.push(asteroids[i]);
            }
            else {
                boolean destroyed = false;
                while(!stack.isEmpty() && stack.peek() > 0) {
                    if(stack.peek() == -asteroids[i]) {
                        stack.pop();
                        destroyed = true;
                        break;
                    }
                    else if(stack.peek() > -asteroids[i]) {
                        destroyed = true;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
                if(!destroyed) {
                    stack.push(asteroids[i]);
                }
            }
        }
        int[] ans = new int[stack.size()];
        for(int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}