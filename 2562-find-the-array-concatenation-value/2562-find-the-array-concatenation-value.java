class Solution {
    public long findTheArrayConcVal(int[] nums) {
       long ans=0;
       int i=0;
       int j=nums.length-1;
       StringBuilder arr=new StringBuilder();
       while(i<=j){
        if(arr.length()!=0){
            arr.setLength(0);
        }
        arr.append(nums[i]);
        if (i != j) {
            arr.append(nums[j]);
         }
        long a=Long.parseLong(arr.toString());
        ans=ans+a;
        i++;
        j--;
       } 
       return ans;
    }
}