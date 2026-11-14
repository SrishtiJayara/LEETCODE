class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int a=0;
            for(int j=i+1;j<nums.length;j++){
             a=nums[j]-nums[i];
            if(a>0 && ans<a){
                ans=a;
            }
            }
        }
        return ans;
    }
}