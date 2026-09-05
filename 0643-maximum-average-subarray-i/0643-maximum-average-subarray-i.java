class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;
        for(int j = 0; j <= nums.length - k; j++) {
            int sum = 0;
            for(int i = j; i < j + k; i++) {
                sum = sum + nums[i];
            }
            double avg = (double) sum / k;
            if(avg > max) {
                max = avg;
            }
        }
        return max;
    }
}