package leetcode_design_twitter_355;

import java.util.*;

public class Twitter {

    private final HashMap<Integer, TreeSet<Integer>> followerSet;

    private final HashMap<Integer, LinkedList<Integer>> posts;

    private final HashMap<Integer, LinkedList<Integer>> newsFeed;




    public Twitter() {
        followerSet = new HashMap<>();
        posts = new HashMap<>();
        newsFeed = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        LinkedList<Integer> postList;

        if(!posts.containsKey(userId)) {
            postList = new LinkedList<>();
            posts.put(userId, postList);
        } else {
            postList = posts.get(userId);
        }

        postList.add(tweetId);

        LinkedList<Integer> newsList;

        if(!newsFeed.containsKey(userId)) {
            newsList = new LinkedList<>();
            newsFeed.put(userId, postList);
        } else {
            newsList = newsFeed.get(userId);
        }

        newsList.add(tweetId);

        Iterator<Integer> followers = followerSet.get(userId).iterator();


        while (followers.hasNext()) {

        }
    }

    public void updateNewsFeed() {

    }

    public List<Integer> getNewsFeed(int userId) {
        return new ArrayList<>();
    }

    public void follow(int followerId, int follweeId) {
        if(followerSet.containsKey(follweeId)) {
            followerSet.get(follweeId).add(followerId);
        } else {
            TreeSet<Integer> treeSet = new TreeSet<>();
            treeSet.add(followerId);
            followerSet.put(follweeId, treeSet);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        followerSet.get(followeeId).remove(followerId);
    }

    public static void main(String[] args) {

    }
}
