class BrowserHistory {

    int n, cur;
    List<String> urls;

    public BrowserHistory(String homepage) {
        n = 0;
        cur = 0;
        urls = new ArrayList<>();
        urls.add(homepage);
    }
    
    public void visit(String url) {
        cur++;
        if (urls.size() == cur) {
            urls.add(url);
        } else {
            urls.add(cur, url);
        }
        n = cur;
    }
    
    public String back(int steps) {
        cur = Math.max(cur - steps, 0);
        return urls.get(cur);
    }
    
    public String forward(int steps) {
        cur = Math.min(cur + steps, n);
        return urls.get(cur);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */