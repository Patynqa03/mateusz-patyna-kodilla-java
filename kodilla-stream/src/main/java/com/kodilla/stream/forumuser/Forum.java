package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {

        forumUserList.add(new ForumUser(1,"Agatka",'F', LocalDate.of(1975,5,18),5));
        forumUserList.add(new ForumUser(2,"Olek",'M',LocalDate.of(1988,3,20),55));
        forumUserList.add(new ForumUser(3,"Agnieszka",'F',LocalDate.of(1995,6,12),250));
        forumUserList.add(new ForumUser(4,"Lukasz",'M',LocalDate.of(1986,9,20),2));
        forumUserList.add(new ForumUser(5,"Mateusz",'M',LocalDate.of(2003,2,13),3));
        forumUserList.add(new ForumUser(6,"Ola",'F',LocalDate.of(2005,8,2),8));
        forumUserList.add(new ForumUser(7,"Ula",'F',LocalDate.of(2008,1,3),5));



    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
