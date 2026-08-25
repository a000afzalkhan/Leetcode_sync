class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int s : nums) {
            res ^= s; 
        }
        return res;
    }
}