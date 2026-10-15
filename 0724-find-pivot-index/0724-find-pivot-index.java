
class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < j; i++) {
                sum1 = sum1 + nums[i];
            }
            for (int k = j + 1; k < nums.length; k++) {
                sum2 = sum2 + nums[k];
            }
            if (sum1 == sum2) {
                return j;
            }
            sum1 = 0;
            sum2 = 0;
        }
        return -1;
    }
}
