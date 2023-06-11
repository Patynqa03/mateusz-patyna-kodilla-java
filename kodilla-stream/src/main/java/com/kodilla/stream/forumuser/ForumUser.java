package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {

    private int uniqueUserId;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int postCount;

    public ForumUser(int uniqueUserId, String userName, char sex, LocalDate dateOfBirth, int postCount) {
        this.uniqueUserId = uniqueUserId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    public int getUniqueUserId() {
        return uniqueUserId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserId=" + uniqueUserId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (uniqueUserId != forumUser.uniqueUserId) return false;
        if (sex != forumUser.sex) return false;
        if (postCount != forumUser.postCount) return false;
        if (!Objects.equals(userName, forumUser.userName)) return false;
        return Objects.equals(dateOfBirth, forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = uniqueUserId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + postCount;
        return result;
    }
}
