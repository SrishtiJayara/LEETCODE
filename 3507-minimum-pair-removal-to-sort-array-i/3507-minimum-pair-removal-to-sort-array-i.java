class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        int count = 0;

        while(true) {
            boolean sorted = true;

            for(int i = 0; i < arr.size() - 1; i++) {
                if(arr.get(i) > arr.get(i + 1)) {
                    sorted = false;
                    break;
                }
            }

            if(sorted) {
                break;
            }

            int min = Integer.MAX_VALUE;
            int index = 0;

            for(int i = 0; i < arr.size() - 1; i++) {
                int sum = arr.get(i) + arr.get(i + 1);

                if(sum < min) {
                    min = sum;
                    index = i;
                }
            }

            arr.set(index, min);
            arr.remove(index + 1);

            count++;
        }

        return count;
    }
}