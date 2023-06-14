package com.kodilla.stream.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {

    @Test
    void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> bookList = bookDirectory.getList();

        //Then
        int numberOfBooksPublishedAfter2007 = 0;
        for(Book book: bookList) {

            if(book.getYearOfPublication() > 2007) {

                numberOfBooksPublishedAfter2007++;
            }

        }

        Assertions.assertEquals(3, numberOfBooksPublishedAfter2007);


    }

    @Test
    void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> theList = bookDirectory.getList();

        //Then

        int numberOfBooksPublishedAfter2007 = IntStream.range(0, theList.size()).filter(n -> theList.get(n).getYearOfPublication() > 2007)
                .map(n -> 1).sum();

        Assertions.assertEquals(3, numberOfBooksPublishedAfter2007);
    }
}
