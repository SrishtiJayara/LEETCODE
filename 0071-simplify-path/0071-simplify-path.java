class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals(".")) {
                continue;
            }
            else if (arr[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(arr[i]);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String s : stack) {
            ans.append("/").append(s);
        }
        if (ans.length() == 0) {
            return "/";
        }
        return ans.toString();
    }
}