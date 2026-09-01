class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<9){
                if(nums[i]==i){
                    return i;
                }
            }
            else{
                int a=0;
                int b=nums[i];
                while(b!=0){
                    int c=b%10;
                    a=a+c;
                    b=b/10;
                }
                if(a==i){
                    return i;
                }
            }
        }
        return -1;
    }
}