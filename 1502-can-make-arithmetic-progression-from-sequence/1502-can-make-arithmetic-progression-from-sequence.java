class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int a=0;
        Arrays.sort(arr);
        a=arr[0]-arr[1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]-arr[i+1]!=a){
                return false;
            }
        }
        return true;
    }
}