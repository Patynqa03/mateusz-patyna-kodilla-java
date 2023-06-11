package com.kodilla.stream.immutable;

public class ForumUser {

    private final String username;
    private final String realName;

    private ForumUser(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    private String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
