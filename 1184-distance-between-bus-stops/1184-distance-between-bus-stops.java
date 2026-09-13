class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int s = 0;
        int a = 0;

        if(start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }

        for(int i = start; i < destination; i++){
            s = s + distance[i];
        }

        for(int j = destination; j < distance.length; j++){
            a = a + distance[j];
        }

        for(int j = 0; j < start; j++){
            a = a + distance[j];
        }

        if(s < a){
            return s;
        }

        return a;
    }
}