class Solution {
    public int maxLength(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            int gcd = nums[i];
            int lcm = nums[i];
            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];
                gcd = findGcd(gcd, nums[j]);
                lcm = (lcm * nums[j]) / findGcd(lcm, nums[j]);
                if (prod == gcd * lcm) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
    public int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
