class Solution {
    public int totalFruit(int[] fruits) {

        int left = 0;
        int distinct = 0;
        int max = 0;

        int n = fruits.length;
        int[] freq = new int[n];

        for (int right = 0; right < n; right++) {

            int index = fruits[right];

            if (freq[index] == 0) {
                distinct++;
            }

            freq[index]++;

            while (distinct > 2) {

                int leftIndex = fruits[left];

                freq[leftIndex]--;

                if (freq[leftIndex] == 0) {
                    distinct--;
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}