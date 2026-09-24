class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Make a list of unique numbers
        List<Integer> keys = new ArrayList<>(countMap.keySet());

        // Step 3: Sort the numbers by their frequency (most frequent first)
        keys.sort((a, b) -> countMap.get(b) - countMap.get(a));

        // Step 4: Pick the first k numbers
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

        return result;
    }
}