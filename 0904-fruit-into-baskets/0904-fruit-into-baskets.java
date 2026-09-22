class Solution {
    public int totalFruit(int[] a) {
        int r=0,l=0;

        Map<Integer,Integer> map = new HashMap<>();

        int max = 0;

        while(r<a.length)
        {
            
            if(map.containsKey(a[r]))
            {
                int old = map.get(a[r]);
                  map.put(a[r],old+1);
            }
            else
            {
                
                 map.put(a[r],1);
            }

        while(map.size()>2)
        {
            int num = map.get(a[l]);
            if(num==1)
            {
                map.remove(a[l]);
            }
            else
            {
                map.put(a[l],num-1);
            }
            l++;
         }
         max = Math.max(max,r-l+1);
        r++;
       }  

       return max;

        
    }
}