class Solution {
    public int lastStoneWeight(int[] stones) {
        while(stones.length>1){
            Arrays.sort(stones);
            int a=stones[stones.length-1];
            int b=stones[stones.length-2];
            if(a==b){
                stones=Arrays.copyOf(stones,stones.length-2);
            }
            else{
                stones=Arrays.copyOf(stones,stones.length-1);
                stones[stones.length-1]=a-b;
            }
        }
        if(stones.length==0){
            return 0;
        }
        return stones[0];
    }
}