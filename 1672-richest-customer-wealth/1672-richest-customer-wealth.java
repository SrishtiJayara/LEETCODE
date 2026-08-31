class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int a=0;
            for(int j=0;j<accounts[0].length;j++){
                a=a+accounts[i][j];
            }
            if(a>max){
                max=a;
            }
        }
        return max;
    }
}