class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] next = new int[n]; 
        next[n - 1] = n;
        int p = n;
        
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                p = i;
            }
            next[i] = p;
        }

        int ans = 0;

        for (int k = 1; k * k <= n; k++) {
            if (n % k == 0) {
                ans += solve(nums, next, k);
                if (k * k < n) {
                    ans += solve(nums, next, n / k);
                }
            }
        }

        return ans;
    }

    private int solve(int[] nums, int[] next, int k) {
        int lastMax = 0;
        for (int r = k - 1; r < nums.length; r += k) {
            int l = r - k + 1;
            int m = next[l];
            if (m >= r) {
                if (nums[l] < lastMax) {
                    return 0;
                }
                lastMax = nums[r];
            } else {
                if (next[m + 1] < r || nums[m + 1] < lastMax || nums[r] > nums[l]) {
                    return 0;
                }
                lastMax = nums[m];
            }
        }

        return k;
    }
}