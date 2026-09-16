class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == 1) {
                list.add(arr[i]);
            }
        }
        if(list.size() < k) {
            return "";
        }
        return list.get(k - 1);
    }
}