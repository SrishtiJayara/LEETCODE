class Solution {
    public int[] evenOddBit(int n) {
        int count1=0;
        int count2=0;
       StringBuilder arr=new StringBuilder();
       while(n!=0){
        arr.append(n%2);
        n=n/2;
       } 
       for(int i=0;i<arr.length();i++){
        if(arr.charAt(i)=='1'){
            if(i%2==0){
                count1++;
            }
            else{
                count2++;
            }
        }
       }
       int[] ans=new int[2];
       ans[0]=count1;
       ans[1]=count2;
       return ans ;
    }
}