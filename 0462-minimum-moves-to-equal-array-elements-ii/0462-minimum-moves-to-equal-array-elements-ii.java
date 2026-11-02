class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        if (nums.length % 2 != 0) {
            a = nums[nums.length / 2];
        } else {
            a = nums[nums.length / 2 - 1];
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int b = Math.abs(nums[i] - a);
            count = count + b;
        }
        return count;
    }
}