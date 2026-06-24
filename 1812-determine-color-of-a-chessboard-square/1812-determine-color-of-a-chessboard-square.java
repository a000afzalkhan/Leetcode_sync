class Solution {
    public boolean squareIsWhite(String s) {

        int x = s.charAt(0) - 'a' + 1;
        int y = s.charAt(1) -'0';

        if((x+y)%2 == 0)return false;

        return true;

        
    }
}