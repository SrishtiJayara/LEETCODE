class Solution {
    public double minimumAverage(int[] nums) {
        int a=nums.length/2;
        double[] avg=new double[a];
        int b=0;
        int c=nums.length-1;
        int i=0;
        Arrays.sort(nums);
        while(b<c){
            double d=(nums[b]+nums[c])/2.0;
            avg[i]=d;
            b++;
            c--;
            i++;
        }
        Arrays.sort(avg);
        return avg[0];
    }
}