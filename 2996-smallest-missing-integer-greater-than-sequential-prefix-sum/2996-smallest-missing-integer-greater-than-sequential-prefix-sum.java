class Solution {
    public int missingInteger(int[] nums) {
        int count=0;
        int a=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a+i){
                count=count+nums[i];
            }
            else{
                break;
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(set.contains(count)){
            count++;
        }
        return count;
    }
}