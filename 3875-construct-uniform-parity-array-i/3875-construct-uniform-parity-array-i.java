class Solution {
    public boolean uniformArray(int[] nums1) {
        ArrayList<Integer>nums2 = new ArrayList<>();

        // Even 
        for (int i=0;i<nums1.length;i++){
            if (nums1[i] % 2 == 0) nums2.add(nums1[i]);
            else {
                int j = i ;
                while (j < nums1.length && nums1[j] % 2 == 0) j++;
                if (j < nums1.length)
                nums2.add(nums1[i] - nums1[j]);
            }
        }

        if (nums2.size() == nums1.length) return true ;

        // Odd 
        for (int i=0;i<nums1.length;i++){
            if (nums1[i] % 2 != 0) nums2.add(nums1[i]);
            else {
                int j = i ;
                while (j < nums1.length && nums1[j] % 2 != 0) j++;
                if (j < nums1.length)
                nums2.add(nums1[i] - nums1[j]);
            }
        }

        if (nums2.size() == nums1.length) return true ;

        return false ;
    }
}