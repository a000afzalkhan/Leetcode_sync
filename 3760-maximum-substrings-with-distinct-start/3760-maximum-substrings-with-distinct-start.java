class Solution {
    public int maxDistinct(String s) {
         boolean[] seen = new boolean[26];
        int ans = 0;

        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            if (!seen[idx]) {
                seen[idx] = true;
                ans++;
            }
        }

        return ans;

        
    }
}

/*

class Solution {
    public int maxDistinct(String s) {
        return (int) s.chars().distinct().count();
    }
}

*/