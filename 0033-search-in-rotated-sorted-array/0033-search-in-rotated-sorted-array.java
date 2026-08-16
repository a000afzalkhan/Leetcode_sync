class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int L = 0;
        int R = n-1;

        while(L<=R){
            int mid = L + (R-L)/2;
            if(target==nums[mid] )return mid;

            if(nums[L] <= nums[mid]){

                //Left side sort
            if(target>=nums[L] && target<nums[mid]){
                R = mid-1;
            }else{
                     L = mid+1;
        }
            }
            else{

                //Right side sort
            if(target>nums[mid] && target <=nums[R]){
                L = mid+1;
            
            }else {
                R = mid -1;
               }
            }

            
            
        }
        return -1;
    }
}