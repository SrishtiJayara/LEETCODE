class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int letter='z'-s.charAt(i)+1;
            sum=sum+letter*(i+1);
        }
        return sum;
    }
}