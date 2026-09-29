class Solution {
    public int maxDifference(String s) {
        int min=Integer.MAX_VALUE;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2==0){
                int arr=entry.getValue();
                min=Math.min(min,arr);
            }
            else{
                int arr=entry.getValue();
                max=Math.max(max,arr);
            }
        }
        return max-min;
    }
}