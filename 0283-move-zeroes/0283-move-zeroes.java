class Solution {
    public void moveZeroes(int[] nums) {

        int[] nums2 = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) nums2[k++]=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=nums2[i];
        }

    }
}