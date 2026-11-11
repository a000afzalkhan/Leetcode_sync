import java.util.*;

class Solution {

    public int minimumPairRemoval(int[] nums) {

        List<Integer> arr = new ArrayList<>();

        for (int x : nums) {
            arr.add(x);
        }

        int count = 0;

        while (!isNonDecreasing(arr)) {

            int minIndex = 0;

            int minSum = arr.get(0) + arr.get(1);

            for (int i = 1; i < arr.size() - 1; i++) {

                int sum = arr.get(i) + arr.get(i + 1);

                if (sum < minSum) {

                    minSum = sum;
                    minIndex = i;
                }
            }

            arr.set(minIndex, minSum);

            arr.remove(minIndex + 1);

            count++;
        }

        return count;
    }

    private boolean isNonDecreasing(List<Integer> arr) {

        for (int i = 1; i < arr.size(); i++) {

            if (arr.get(i) < arr.get(i - 1)) {
                return false;
            }
        }

        return true;
    }
}