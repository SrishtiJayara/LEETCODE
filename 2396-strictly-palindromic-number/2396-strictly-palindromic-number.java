class Solution {
    public boolean isStrictlyPalindromic(int n) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<=n;i++){
            while(n==0){
            a.append(n%i);
            }
            int b=0;
            int c=a.length();
            while(b<c){
                if(a.charAt(b)==a.charAt(c)){
                    b++;
                    c--;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
}