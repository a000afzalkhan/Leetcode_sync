class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i) != ' '){
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    length = 1;  
                } else {
                    length++;
                }
            }
            
        }
        return length;    
    }
}