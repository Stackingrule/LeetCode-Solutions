class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res = new ArrayList<>();
        if(S == null || S.length() == 0){
            return res;
        }

        dfs(S, 0, res);
        return res;
    }

    private boolean dfs(String s, int start, List<Integer> res){
        if(start == s.length() && res.size() > 2){
            return true;
        }

        for(int i = start; i<s.length(); i++){
            if(s.charAt(start) == '0' && i > start){
                return false;
            }

            long candidate = Long.valueOf(s.substring(start, i+1));
            if(candidate > Integer.MAX_VALUE){
                return false;
            }

            int size = res.size();
            if(size >= 2 && candidate > res.get(size-1)+res.get(size-2)){
                return false;
            }

            if(size < 2 || candidate == res.get(size-1)+res.get(size-2)){
                res.add((int)candidate);
                if(dfs(s, i+1, res)){
                    return true;
                }

                res.remove(res.size()-1);
            }
        }

        return false;
    }
}