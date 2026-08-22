class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int d=0;
        int c=1;
        while(n!=0){
             d=d+n%10;
             c=c*(n%10);
             n=n/10;
        }
        int result=d+c;
        return a%result==0;
    }
}