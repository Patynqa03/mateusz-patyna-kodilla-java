package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StatisticEngine {


    Statistics statistics;
    private int userCount;
    private int postCount;
    private int commentCount;
    private double averagePostPerUser;
    private double averageCommentPerUser;
    private double averageCommentPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        averagePostPerUser = (double) userCount / postCount;
        averageCommentPerUser = (double) userCount / postCount;
        averageCommentPerPost = (double) postCount / commentCount;
    }

    public void showStatistics() {

        System.out.println("User count: " + userCount);
        System.out.println("Post count: " + postCount);
        System.out.println("Comment count: " + commentCount);
        System.out.println("Average post per user: " + averagePostPerUser);
        System.out.println("Average comment per user: " + averageCommentPerUser);
        System.out.println("Average comment per post: " + averageCommentPerPost);

    }



    public Statistics getStatistics() {
        return statistics;
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentPerUser() {
        return averageCommentPerUser;
    }

    public double getAverageCommentPerPost() {
        return averageCommentPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatisticEngine that = (StatisticEngine) o;

        if (userCount != that.userCount) return false;
        if (postCount != that.postCount) return false;
        if (commentCount != that.commentCount) return false;
        if (Double.compare(that.averagePostPerUser, averagePostPerUser) != 0) return false;
        if (Double.compare(that.averageCommentPerUser, averageCommentPerUser) != 0) return false;
        if (Double.compare(that.averageCommentPerPost, averageCommentPerPost) != 0) return false;
        return Objects.equals(statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = statistics != null ? statistics.hashCode() : 0;
        result = 31 * result + userCount;
        result = 31 * result + postCount;
        result = 31 * result + commentCount;
        temp = Double.doubleToLongBits(averagePostPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageCommentPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageCommentPerPost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "StatisticEngine{" +
                "statistics=" + statistics +
                ", userCount=" + userCount +
                ", postCount=" + postCount +
                ", commentCount=" + commentCount +
                ", averagePostPerUser=" + averagePostPerUser +
                ", averageCommentPerUser=" + averageCommentPerUser +
                ", averageCommentPerPost=" + averageCommentPerPost +
                '}';
    }
}


