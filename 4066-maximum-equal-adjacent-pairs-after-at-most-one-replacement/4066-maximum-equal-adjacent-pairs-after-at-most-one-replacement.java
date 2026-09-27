class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int equalPair = 0;
        int maxGain = 0;

        Map<String , Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length - 1 ; i++ ){
            
            int a = nums[i];
            int b = nums[i + 1];

            if(a == b){
                equalPair++;
            }else{
                int min = Math.min(a,b);
                int max = Math.max(a,b);

                String key = min + "#" + max;

                int count = map.getOrDefault(key , 0) +1;
                map.put(key , count);

                maxGain = Math.max (maxGain , count );
            }
        }
        return equalPair  + maxGain;
    }
}