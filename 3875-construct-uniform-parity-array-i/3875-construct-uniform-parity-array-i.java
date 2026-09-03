class Solution {
    public boolean uniformArray(int[] nums1) {
          int n =nums1.length;
        int even = 0;
        int  odd = 0;

        for(int a : nums1){
            if(a%2==0){
                even++;
            }
            else{
                odd++;
            }

        }
        if(even == n || odd ==n){
            return true;
        }
        return true;
    }
}