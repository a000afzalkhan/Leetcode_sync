class Solution {
    public int[] sortArrayByParity(int[] nums) {
            int n = nums.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            if (nums[l] % 2 == 0) {
                l++;
            } else if (nums[r] % 2 != 0) {
                r--;
            } else {
                int tem = nums[r];
                nums[r] = nums[l];
                nums[l] = tem;

                l++;
                r--;
            }
        }
        return nums;

    }
}