class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            sum=sum+nums[i];
        }
        int a=sum/nums.length;
        int b=(int) a;
        if(b<0){
            b=0;
        }
        for(int i=b+1;i<=100+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}