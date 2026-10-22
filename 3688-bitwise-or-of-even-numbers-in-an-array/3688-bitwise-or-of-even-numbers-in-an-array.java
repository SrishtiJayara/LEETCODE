class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
            }
            j++;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans|arr[i];
        }
        return ans;
    }
}