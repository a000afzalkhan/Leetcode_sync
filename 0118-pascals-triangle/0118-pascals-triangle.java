class Solution {

    public List<Integer> generateRows(int i){
        List<Integer> ls = new ArrayList<>();
        int ans = 1;
        ls.add(ans);

        for(int j=1; j<i; j++){
            ans = ans * (i-j);
            ans = ans / j;
            ls.add(ans);
        }

        return ls;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();

        for(int i=1; i<=numRows; i++){
            ls.add(generateRows(i));
        }     

        return ls;
    }
}