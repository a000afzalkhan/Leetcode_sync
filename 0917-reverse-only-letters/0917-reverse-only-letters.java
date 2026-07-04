class Solution {
    public String reverseOnlyLetters(String s) {
    char[]ans = s.toCharArray();
    int l = 0 ,r=s.length()-1;
    while (r>l){
        if(!Character.isLetter(ans[l])){
            l++;
        }
        else if(!Character.isLetter(ans[r])){
            r--;
        }

        else{
            char temp = ans[l];
            ans[l]=ans[r];
            ans[r]=temp ;
            l++;
            r--;
        }
    }
    return new String(ans);
}
}