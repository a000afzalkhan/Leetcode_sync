class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int count=0;
        int sub=10;
        while(n>=sub){
            n-=sub;
            sub--;
            count++;
        }
        if(count%2==0){
            return false;
        }else{
            return true;
        }
        
    }
}