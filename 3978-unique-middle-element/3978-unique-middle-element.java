class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int a=nums[nums.length/2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==a){
                if(nums[i+1]==a){
                    return false;
                }
            }
        }
        return true;
    }
}