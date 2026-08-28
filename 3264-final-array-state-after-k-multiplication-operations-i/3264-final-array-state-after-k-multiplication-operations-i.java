class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0; i < k; i++) {
            int min = nums[0];
            int index = 0;
            for(int m = 1; m < nums.length; m++) {
                if(nums[m] < min) {
                    min = nums[m];
                    index = m;
                }
            }
            nums[index] = nums[index] * multiplier;
        }
        return nums;
    }
}