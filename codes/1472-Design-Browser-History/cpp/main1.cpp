class BrowserHistory
{
public:
    int n, cur;
    vector<string> urls;

    BrowserHistory(string homepage)
    {
        urls.push_back(homepage);
        n = cur = 0;
    }

    void visit(string url)
    {
        cur++;
        if (urls.size() == cur)
            urls.push_back(url);
        else
            urls[cur] = url;

        n = cur;
    }

    string back(int steps)
    {
        cur = max(cur - steps, 0);
        return urls[cur];
    }

    string forward(int steps)
    {
        cur = min(cur + steps, n);
        return urls[cur];
    }
};

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory* obj = new BrowserHistory(homepage);
 * obj->visit(url);
 * string param_2 = obj->back(steps);
 * string param_3 = obj->forward(steps);
 */