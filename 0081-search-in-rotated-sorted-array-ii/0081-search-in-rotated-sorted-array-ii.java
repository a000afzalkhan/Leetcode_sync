
class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return true;

            // 判断哪一侧具有可利用的有序性
            if (nums[left] == nums[mid]) {
                left++;
            } else if (nums[left] < nums[mid]) {
                // 左半边严格有序
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                // 右半边有序
                if (nums[mid] < target && target <= nums[right - 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }

        return false;
    }
}