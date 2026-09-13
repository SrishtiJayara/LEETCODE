class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        if(n%2==0){
            for(int i=0;i<n;i++){
                arr[i]=i+1;
                arr[i+1]=-arr[i];
                i++;
            }
        }
        else{
            arr[0]=0;
            for(int i=1;i<n;i++){
                arr[i]=i+1;
                arr[i+1]=-arr[i];
                i++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}