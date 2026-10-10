class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        StringBuilder arr1=new StringBuilder();
        StringBuilder arr2=new StringBuilder();
        while(x!=0){
            arr1.append(x%2);
            x=x/2;
        }
        while(y!=0){
            arr2.append(y%2);
            y=y/2;
        }
         int len = Math.max(arr1.length(), arr2.length());

        while (arr1.length() < len) {
            arr1.append('0');
        }
        while (arr2.length() < len) {
            arr2.append('0');
        }
        for(int i=0;i<len;i++){
            if(arr1.charAt(i)!=arr2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}