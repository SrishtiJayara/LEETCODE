class Solution {
    public int averageValue(int[] nums) {
        int a=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(nums[i]%3==0){
                    a=a+nums[i];
                    n=n+1;
                }
            }
        }
        if(n==0){
            return 0;
        }
        int b=a/n;
        return b;
    }
}