class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=-1;
        int c=0;
        for(int i=0;i<=divisors.length-1;i++){
            int b=divisors[i];
            int count=0;
            for(int  j=0;j<nums.length;j++){
                int a=nums[j];
                if(a%b==0){
                    count++;
                }
            }
            if(count>max || (count == max && divisors[i] < c)){
                    max=count;
                    c=divisors[i];
                }
        }
        return c;
    }
}