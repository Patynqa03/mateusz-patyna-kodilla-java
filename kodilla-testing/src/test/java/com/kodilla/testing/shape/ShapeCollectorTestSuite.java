package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

        public static int l = 0;
    @BeforeAll
    public static void beforeAllTests() {System.out.println("Starting testing process");}

    @AfterAll
    public static void AfterAll() {System.out.println("Ending testing process");}

    @BeforeEach
    public void beforeEveryTest() {
        l++;
        System.out.println("test number " + l);
    }

    @Nested
    @DisplayName("Testing Figures")
    class TestFigures {

        @Test
        void addFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Cyrcle cyrcle = new Cyrcle("Kolo",25);

            //When

            shapeCollector.addFigure(cyrcle);


            //Then

            Assertions.assertEquals(cyrcle, shapeCollector.getFigure(0));


        }

        @Test
        void removeFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("Trojkat",14);
            shapeCollector.addFigure(triangle);
            //When

            shapeCollector.removeFigure(triangle);

            //Then

            Assertions.assertEquals(null, shapeCollector.getFigure(0));

        }



        @Test
        void showFigures(){


            //Given
            List<Shape> lista = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("Trojkat",14);
            shapeCollector.addFigure(triangle);


            //When

            lista.add(triangle);


            //Then

           Assertions.assertEquals(shapeCollector.showFigures(), lista);

        }
        @Test
        void getFigure() {


            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("Trojkat",14);
            shapeCollector.addFigure(triangle);


            //When

           Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(result,triangle);

        }
    }

}
