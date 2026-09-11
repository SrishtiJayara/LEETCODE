class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> b = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s = (s * 2 + nums[i]) % 5;
            if (s == 0) {
                b.add(true);
            } else {
                b.add(false);
            }
        }
        return b;
    }
}