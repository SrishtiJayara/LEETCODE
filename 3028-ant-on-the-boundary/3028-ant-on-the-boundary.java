class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int a = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            a = a + nums[i];
            if(a == 0) {
                count++;
            }
        }
        return count;
    }
}