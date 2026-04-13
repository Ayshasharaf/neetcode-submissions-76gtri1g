class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frq = new HashMap<>();
        
        for (int num : nums) {
        frq.put(num, frq.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> keys= new ArrayList<>(frq.keySet());
        keys.sort((a,b) -> frq.get(b) - frq.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }return result; 
    }
}
        

