class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;                                  // { 1 , 1 , 1 , 1 , 2 , 2 , 2 , 3 , 4 ,5}  unique element =5

        for(int i= 1; i < nums.length;i++){

            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }
        return k + 1;
    }
}