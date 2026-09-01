class Solution {
    public int digitFrequencyScore(int n) {
        int a=0;
        String b=String.valueOf(n);
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int d=(entry.getKey()-'0')*entry.getValue();
            a=a+d;
        }
        return a;
    }
}