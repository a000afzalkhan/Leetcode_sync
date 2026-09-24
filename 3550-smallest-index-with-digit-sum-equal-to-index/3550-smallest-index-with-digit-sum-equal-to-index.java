class Solution {
    public int ds(int n){
        int ans = 0;
        while(n!=0){
            ans += n%10;
            n /= 10;
        }
        return ans;
    }
    public int smallestIndex(int[] nums) {
        int x = nums.length;
        for(int i=0;i<x;i++){
            if(ds(nums[i])==i){
                return i;
            }
        }
        return -1;
        
    }
}