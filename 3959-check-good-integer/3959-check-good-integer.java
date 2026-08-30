class Solution {
    public boolean checkGoodInteger(int n) {
        int[] arr=new int[String.valueOf(n).length()];
        for(int i = arr.length - 1; i >= 0; i--){
            arr[i] = n % 10;
            n = n / 10;
        }
        int squaresum=0;
        int digitsum=0;
        for(int i=0;i<arr.length;i++){
            digitsum+=arr[i];
            squaresum+=Math.pow(arr[i],2);
        }
        if(squaresum-digitsum>=50){
            return true;
        }
        return false;
    }
}