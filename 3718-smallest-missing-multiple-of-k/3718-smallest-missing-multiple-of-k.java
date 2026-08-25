class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<=101;i++){
            int a=k*i;
            if(!map.containsKey(a)){
                return a;
            }
        }
        return 0;
    }
}