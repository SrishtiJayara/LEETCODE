class Solution {
    public int minOperations(int n) {
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(2*i)+1;
        }
        int a=n;
        for(int i=0;i<n/2;i++){
            while(arr[i]!=a){
                arr[i]++;
                arr[n-1-i]--;
                count++;
            }
        }
        return count;
    }
}