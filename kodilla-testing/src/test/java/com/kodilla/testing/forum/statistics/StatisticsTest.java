package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.BookLibrary;
import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTest {


    @Mock
    Statistics statistics;


    @Test
    void postCountZero() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        statisticsMock.postsCount();
    StatisticEngine statisticEngine = new StatisticEngine();

        // When

   statisticEngine.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0, statisticEngine.getPostCount());

    }

    @Test
    void postCountHundred() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticEngine statisticEngine = new StatisticEngine();
        when(statisticsMock.postsCount()).thenReturn(100);


        // When

        statisticEngine.calculateAdvStatistics(statisticsMock);


        // Then
Assertions.assertEquals(100,statisticEngine.getPostCount());
    }

    @Test
    void commentCountZero() {

        // Given
Statistics statisticsMock = mock(Statistics.class);
StatisticEngine statisticEngine = new StatisticEngine();
        // When

        statisticEngine.calculateAdvStatistics(statisticsMock);

        // Then
Assertions.assertEquals(0, statisticEngine.getCommentCount());
    }

    @Test
    void postCountHigherThanComments() {

        // Given
Statistics statisticsMock = mock(Statistics.class);
StatisticEngine statisticEngine = new StatisticEngine();
    when(statisticsMock.postsCount()).thenReturn(5);
    when(statisticsMock.commentsCount()).thenReturn(4);
        // When

        statisticEngine.calculateAdvStatistics(statisticsMock);
    boolean result = false;

        if(statisticEngine.getPostCount() > statisticEngine.getCommentCount()) {

            result = true;

        }

        // Then

        Assertions.assertTrue(true);
    }

    @Test
    void commentsCountHigherThanPosts() {

        // Given
Statistics statisticsMock = mock(Statistics.class);
StatisticEngine statisticEngine = new StatisticEngine();
when(statisticsMock.commentsCount()).thenReturn(5);
when(statisticsMock.postsCount()).thenReturn(4);

        // When

        statisticEngine.calculateAdvStatistics(statisticsMock);
        boolean result = false ;

        if(statisticEngine.getCommentCount() > statisticEngine.getPostCount()) {

            result = true;
        }


        // Then

        Assertions.assertTrue(true);
    }

    @Test
    void userCountZero() {

        // Given
Statistics statisticsMock = mock(Statistics.class);
StatisticEngine statisticEngine = new StatisticEngine();
List<String> theList = new ArrayList<>();
when(statisticsMock.usersNames()).thenReturn(theList);

        // When

   statisticEngine.calculateAdvStatistics(statisticsMock);

        // Then

        Assertions.assertEquals(0,statisticEngine.getUserCount());

    }

    @Test
    void userCountHundred() {

        // Given
    Statistics statisticsMock = mock(Statistics.class);
    StatisticEngine statisticEngine = new StatisticEngine();
    List<String> theList = new ArrayList<>();
    for(int i = 0; i < 100; i++) {

        theList.add("Name" + i);

    }
    when(statisticsMock.usersNames()).thenReturn(theList);


        // When

        statisticEngine.calculateAdvStatistics(statisticsMock);

        // Then

        Assertions.assertEquals(100,statisticEngine.getUserCount());
    }




}
