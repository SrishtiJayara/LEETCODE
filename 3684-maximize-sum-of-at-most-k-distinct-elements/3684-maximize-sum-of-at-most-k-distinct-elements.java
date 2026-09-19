class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length && list.size() < k; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}