class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            int n = nums[i];
            int rev = 0;
            while (n != 0) {
                rev = rev * 10 + n % 10;
                n = n / 10;
            }
            set.add(rev);
        }
        return set.size();
    }
}