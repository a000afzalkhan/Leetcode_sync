class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        String str = "";
        for(int i=0;i<nums.length;i++){
            if(str.equals("")){
                int index = i;
                while(index<nums.length-1 && nums[index]+1==nums[index+1])
                    index+=1;
                str = str.concat(Integer.toString(nums[i]));
                if(i!=index){
                    str+="->";
                    str = str.concat(Integer.toString(nums[index]));
                }
                i=index;
                list.add(str);
                str="";
            }
        }
        return list;
    }
}