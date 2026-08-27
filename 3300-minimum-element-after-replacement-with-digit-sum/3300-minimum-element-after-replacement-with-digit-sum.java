class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int b=0;
            while(nums[i]>9){
                int a=nums[i]%10;
                 b=b+a;
                nums[i]=nums[i]/10;
            }
            b=b+nums[i];
            nums[i]=b;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}