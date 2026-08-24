class Solution {
    public String triangleType(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if(a+b>c){
        if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
            return "equilateral";
        }
        else if(nums[i]==nums[i+1] && nums[i+1]!=nums[i+2] || nums[i]!=nums[i+1] && nums[i+1]==nums[i+2] || nums[i]==nums[i+2] && nums[i]!=nums[i+1]){
            return "isosceles";
        }
        return "scalene";
        }
        else{
            return "none";
        }
    }
}