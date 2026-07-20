class Solution {
    static ArrayList<String> ans = new ArrayList<>();
    public void work(int n, int open, int close, String s)
    {
        if(s.length() == 2*n) 
        {
            ans.add(s);
            return;
        }

        if(open < n) work(n, open+1, close, s+'(');
        if(close < open) work(n, open, close+1, s+')');
    }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        work(n, 0, 0, "");
        return ans;
    }
}
