class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        List<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }

        for (char c : t.toCharArray()) {
            if (!list.remove((Character) c)) { 
                return false;
            }
        }

        return true;
    }
}