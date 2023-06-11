package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.awt.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]
//
//        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();

        Map<Integer,ForumUser> forumMap = forum.getForumUserList().stream().filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() > 2003)
                .filter(forumUser -> forumUser.getPostCount() > 1)
                .collect(Collectors.toMap(ForumUser::getUniqueUserId, ForumUser -> ForumUser));

        forumMap.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}