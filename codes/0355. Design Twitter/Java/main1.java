class Twitter {

    /** Initialize your data structure here. */

    Map<Integer, Set<Integer>> following;
    Map<Integer, List<Tweet>> message;
    Queue<Tweet> feeds;
    int time;
    static final int maxNumber = 10;

    class Tweet{
        int id;
        int timestamp;
        public Tweet(int id, int timestamp){
            this.id = id;
            this.timestamp = timestamp;
        }
    }

    public Twitter() {
        following = new HashMap<>();
        message = new HashMap<>();
        feeds = new PriorityQueue<>((a,b)->(a.timestamp - b.timestamp));
        time = 0;
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        List<Tweet> tweets = message.get(userId);
        if (tweets == null){
            tweets = new ArrayList<Tweet>();
            message.put(userId, tweets);
        }
        tweets.add(new Tweet(tweetId, time++));
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        feeds.clear();
        List<Integer> users = new ArrayList<>();
        users.add(userId);
        Set<Integer> followed = following.get(userId);
        if  (followed != null) users.addAll(followed);

        for (Integer id : users) {
            List<Tweet> tweets = message.get(id);
            if (tweets == null) continue;
            for(Tweet tweet: tweets){
                if (feeds.size() >= maxNumber && tweet.timestamp <= feeds.peek().timestamp) continue;
                while (feeds.size() >= maxNumber ) feeds.poll();
                feeds.offer(tweet);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!feeds.isEmpty()) result.add(feeds.poll().id);
        Collections.reverse(result);
        return result;
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        Set<Integer> followed = following.get(followerId);
        if (followed == null){
            followed = new HashSet<>();
            following.put(followerId, followed);
        }
        if (followeeId != followerId) followed.add(followeeId);
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followed = following.get(followerId);
        if (followed == null) return;
        followed.remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */