class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int a=n*n;
        int count=0;
        for(int i=1;i<=a;i++){
            if((i*w)<=maxWeight){
                count++;
            }
        }
        return count;
    }
}