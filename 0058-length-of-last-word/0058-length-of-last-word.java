class Solution {
    public int lengthOfLastWord(String s) {
          int l =s.length();
        int countword=0;

        for (int i = l-1; i >=0 ; i--) {
            if(s.charAt(i)==' '&& countword==0){
                continue;
            }
            if(s.charAt(i)!=' '){
                countword++;
            }else {
                break;
            }
        }
        return countword;
    }
}