class Solution {
    public String largestTimeFromDigits(int[] a) {
        String ret = dfs(a, 0, "", "");
        if(ret.length() > 0) {
            return ret.substring(0,2) + ":" + ret.substring(2);
        }
        return ret;
    }
    
    public String dfs(int[] a, int from, String cur, String cmax) {
        if(from == a.length) {
            int hour = Integer.valueOf(cur.substring(0,2));
            int minute = Integer.valueOf(cur.substring(2));
            if(hour >= 24 || minute >= 60 || cur.compareTo(cmax) < 0) {
                return cmax;
            }
            return cur;
        }
        for(int i = from; i < a.length; ++i) {
            swap(a, from, i);
            String oneret = dfs(a, from+1, cur + a[from], cmax);
            if(oneret.compareTo(cmax) > 0) {
                cmax = oneret;
            }
            swap(a, from, i);
        }
        return cmax;
    }
    
    void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}