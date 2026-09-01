class Solution {
    public int mirrorDistance(int n) {
        int a=0;
        int b=n;
        while(b>0){
            int d=b%10;
            a=a*10+d;
            b=b/10;
        }
        int ans=Math.abs(n-a);
        return ans;
    }
}