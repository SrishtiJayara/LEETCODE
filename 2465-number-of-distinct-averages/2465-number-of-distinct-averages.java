class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> set = new HashSet<>();
        int a = 0;
        int b = nums.length - 1;
        while (a < b) {
            Double avg = (nums[a] + nums[b]) / 2.0;
            set.add(avg);
            a++;
            b--;
        }
        return set.size();
    }
}