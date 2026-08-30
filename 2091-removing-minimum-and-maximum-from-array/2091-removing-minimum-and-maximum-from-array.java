class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int n = nums.length;
        int max = 0;
        int min = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] < nums[min]){
                min = i;
            }
        }
        int first = Math.min(min, max);
        int second = Math.max(min, max);
        int a = second + 1;
        int b = n - first;
        int c = (first + 1) + (n - second);
        return Math.min(a, Math.min(b, c));
    }
}