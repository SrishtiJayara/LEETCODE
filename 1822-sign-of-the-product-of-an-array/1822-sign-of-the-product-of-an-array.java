class Solution {
    public int arraySign(int[] nums) {
        int a=1;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                b=-1;
            }
            else if(nums[i]==0){
                b=0;
            }
            else{
                b=1;
            }
            a=a*b;
        }
        return a;
    }
}