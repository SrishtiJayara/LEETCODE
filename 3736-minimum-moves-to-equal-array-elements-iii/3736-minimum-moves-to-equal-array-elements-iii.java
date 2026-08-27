class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i++){
           int c=nums[nums.length-1]-nums[i];
           a=a+c;
        }
        return a;
    }
}