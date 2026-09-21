class Solution {
    static final long MOD=1000000007;
    public int sumDecoded(long[] nums) {
        long ans=0;
        for(long n:nums){
            int width=(int)(n%10);
            long d=n/10;
            long temp=d;
            int digits=0;
            while(temp>0){
                digits++;
                temp/=10;
            }
            long divisor=1;
            for(int i=0;i<digits-width;i++){
                divisor*=10;
                
            }
            long x=d/divisor;
            long y=d%divisor;
            ans=(ans+power(x,y))%MOD;
            
        }
        return (int)ans;
    }
    private long power(long x,long y){
        long result=1;
        x%=MOD;
        while(y>0){
            if((y&1)==1){
                result=(result*x)%MOD;
            }
            x=(x*x)%MOD;
            y>>=1;
        }
        return result;
    }
}