class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ans = 0;
        
        int[] stack = new int[n];
        int l=0;
        int r=-1;

        for(int i=0;i<n;i++){
            int curHeight = heights[i];
            while(r>=l && heights[stack[r]] >= curHeight){
                ans = Math.max(ans, heights[stack[r]]*(i- (r>=1 ? stack[r-1] : -1) - 1));
                r--;
            }
            stack[++r] = i;
        }
        while(r>=0){
            int curHeight = heights[stack[r]];
            ans = Math.max(ans, curHeight*(n - (r>=1 ? stack[r-1] : -1) - 1));
            r--;
        }

        return ans;
    }
}