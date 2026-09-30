class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        final int MAX_SIZE = 101;

        
        int max = 0;
        for (int [] interval : intervals) {
            if(max<interval[1]){
                max = interval[1];
            }
        }
        int[] starts = new int[max+1];
        int[] ends = new int[max+1];
        for (int [] interval : intervals) {
            starts[interval[0]] ++;
            ends[interval[1]] ++;
        }

        int ans = 0;
        int active = 0;
        
        for (int i = 0; i < max+1; i ++) {

            int startingNow = starts[i];

            ans += startingNow * active + startingNow * (startingNow - 1) / 2;

            active += startingNow - ends[i];
        }

        return ans;
    }
}