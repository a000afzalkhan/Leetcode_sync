class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        long ans = 0;
        
        for (int k = 1; k <= n; k++) {
            if (n % k != 0)
                continue;
            boolean possible = true;
            for (int start = 0; start < n && possible; start += k) {
                int end = start + k;
                int descent = -1;

                for (int i = start; i < end - 1; i++) {
                    if (nums[i] > nums[i + 1]) {

                        if (descent != -1) {
                            possible = false;
                            break;
                        }
                        descent = i;
                    }
                }

                if (!possible)
                    break;

                int rotationStart;

                if (descent == -1) {
                    rotationStart = start;
                } else {
                    rotationStart = descent + 1;
                }

                for (int j = 0; j < k; j++) {

                    int originalIndex = rotationStart + j;
                    if (originalIndex >= end) {
                        originalIndex -= k;
                    }
                    if (nums[originalIndex] != sorted[start + j]) {
                        possible = false;
                        break;
                    }
                }
            }
            if (possible) {
                ans += k;
            }
        }
        return(int)ans;
    }
}