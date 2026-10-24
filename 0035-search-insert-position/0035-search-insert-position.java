class Solution {
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while(low<=high){
            mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                low = mid + 1;   
                System.out.println("mid:: "+mid);             
                //continue;
            }else if(nums[mid] > target){
                System.out.println("mid1 "+mid);
                high = mid - 1;
                //return mid;
                //continue;
            }
            /*if( && (low == high)){
                System.out.println("mid2 "+mid);
                return mid+1;
            }
            if(nums[mid] < target && (low == high)){
                System.out.println("mid: "+mid);
                return mid+1;
            }*/


        }
        if(nums[mid] < target){
            mid = mid + 1;
        }
        return mid;
        
    }
}