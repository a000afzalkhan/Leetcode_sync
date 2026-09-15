class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        int count = 0;
        while((index = haystack.indexOf(needle, index)) != -1) {
            return index;
        }
        return -1;
    }
}