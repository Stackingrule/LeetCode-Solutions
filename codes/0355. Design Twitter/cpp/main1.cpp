class Twitter
{
public:
    Twitter()
    {
        time = 0;
    }

    void postTweet(int userId, int tweetId)
    {
        follow(userId, userId);
        tweets[userId].insert({time++, tweetId});
    }

    vector<int> getNewsFeed(int userId)
    {
        vector<int> res;
        map<int, int> top10;
        for (auto id : friends[userId])
        {
            for (auto a : tweets[id])
            {
                top10.insert({a.first, a.second});
                if (top10.size() > 10)
                    top10.erase(top10.begin());
            }
        }
        for (auto a : top10)
        {
            res.insert(res.begin(), a.second);
        }
        return res;
    }

    void follow(int followerId, int followeeId)
    {
        friends[followerId].insert(followeeId);
    }

    void unfollow(int followerId, int followeeId)
    {
        if (followerId != followeeId)
        {
            friends[followerId].erase(followeeId);
        }
    }

private:
    int time;
    unordered_map<int, unordered_set<int>> friends;
    unordered_map<int, map<int, int>> tweets;
};