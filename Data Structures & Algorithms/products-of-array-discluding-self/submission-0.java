class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Integer Producttotal=1;
        int zeroCount = 0;
        for(int i : nums){
            if (i == 0) zeroCount++;
            else Producttotal*=i;
        }
        for(int i = 0 ; i< nums.length ; i++){
            if (zeroCount > 1) {
                result[i] = 0;
            } else if (zeroCount == 1) {
                result[i] = (nums[i] == 0) ? Producttotal : 0;
            } else {
                result[i] = Producttotal/nums[i];
            }
        }
        return result;
    }
}