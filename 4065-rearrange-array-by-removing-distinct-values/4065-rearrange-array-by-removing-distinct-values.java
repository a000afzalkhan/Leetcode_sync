class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer , Integer> map = new TreeMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) +1);
        }

        int[]ans = new int [nums.length];
        int index = 0;

        while(!map.isEmpty()){
            List<Integer>keys = new ArrayList<>(map.keySet());

            for(int key : keys){
                ans[index++] = key;

                if(map.get(key) == 1){
                    map.remove(key);
                }else{
                    map.put(key , map.get(key)- 1);
                    
                }
            }
        }
        return ans;
    }
}