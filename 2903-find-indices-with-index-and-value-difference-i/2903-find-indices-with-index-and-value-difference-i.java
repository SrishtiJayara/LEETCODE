class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] arr=new int[2];
        for(int  i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        arr[0]=-1;
        arr[1]=-1;
        return arr;
    }
}