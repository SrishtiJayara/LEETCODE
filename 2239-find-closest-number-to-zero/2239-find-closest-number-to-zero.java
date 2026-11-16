class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            int a = Math.abs(nums[i]);
            if(a < min) {
                min = a;
                ans = nums[i];
            }
            else if(a == min && nums[i] > ans) {
                ans = nums[i];
            }
        }
        return ans;
    }
}
