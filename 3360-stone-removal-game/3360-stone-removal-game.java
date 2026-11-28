class Solution {
    public boolean canAliceWin(int n) {
        int turn = 10;
        while( n > 0 ){
            if(n - turn >= 0 ){
                n = n - turn;
                turn = turn - 1;

            }
            else {
                break;
            }
        }
        System.out.println(n+" "+turn);
        if(turn % 2 == 0){
            return false;
        }
        return true;
        
    }
}