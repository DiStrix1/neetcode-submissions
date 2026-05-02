class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();
            minHeap.offer(new int[]{freq, element});
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int index = 0;
        while(!minHeap.isEmpty()){
            int[] pair = minHeap.poll();
            result[index] = pair[1];
            index++;
        }
        return result;
    }
}
