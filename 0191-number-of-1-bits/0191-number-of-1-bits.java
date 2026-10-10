class Solution {
    public int hammingWeight(int n) {
        StringBuilder arr=new StringBuilder();
        int count=0;
        while(n!=0){
            arr.append(n%2);
            n=n/2;
        }
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}