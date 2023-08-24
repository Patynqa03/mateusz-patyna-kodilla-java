package com.kodilla.patterns.prototype.library;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        Book book1 = new Book("book1","author1",1);
        Book book2 = new Book("book2","author2",2);
        Book book3 = new Book("book3","author3",3);

        Library library = new Library("Asia");
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        assertEquals(3,library.books.size());
        assertEquals(library.books,deepClonedLibrary.getBooks());
        assertEquals(3,clonedLibrary.getBooks().size());
    }

}
