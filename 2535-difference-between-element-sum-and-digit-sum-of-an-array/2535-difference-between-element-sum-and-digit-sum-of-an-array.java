class Solution {
    public int differenceOfSum(int[] nums) {
        int count = 0;
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            count=count+nums[i];
            int n = nums[i];
            while (n > 0) {
                a=a+n%10;
                n=n/10;
            }
        }
        return Math.abs(count - a);
    }
}