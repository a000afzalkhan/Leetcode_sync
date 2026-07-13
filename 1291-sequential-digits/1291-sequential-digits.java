class Solution {
  public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String master = "123456789";
        
        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();
        
        for (int length = lowLen; length <= highLen; length++) {
            
            for (int start = 0; start <= 9 - length; start++) {
                
                String subStr = master.substring(start, start + length);
                
                int num = Integer.parseInt(subStr);
                
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        
        return result;
    }
}