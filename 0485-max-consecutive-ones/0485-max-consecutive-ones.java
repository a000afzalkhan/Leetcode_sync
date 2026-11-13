class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr=0;
        int maximum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) curr++;
            else {
                maximum=Math.max(maximum,curr);
                curr=0;
            }
        }
        maximum=Math.max(maximum,curr);
        return maximum;
    }
}