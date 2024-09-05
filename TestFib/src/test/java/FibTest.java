import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FibTest {
    static int range;
    static Fib fib;

    @BeforeAll
    public static void setUpBeforeClass() {
        fib = new Fib(0);
    }

    @Test
    public void TestgetFibSerieWhenRange_1_ThenResult_NotEmpty() {
        //Arrange
        fib.range = 1;
        //Act
        List<Integer> list_await = fib.getFibSeries();
        //Assert
        Assertions.assertFalse(list_await.isEmpty());
    }

    @Test
    public void TestgetFibSerieWhenRange_1_ThenResult_ListContains_0() {
        //Arrange
        fib.range = 1;
        //Act
        int int_await = 0;
        //Assert
        Assertions.assertTrue(fib.getFibSeries().contains(int_await));
    }

    @Test
    public void TestgetFibSerieWhenRange_6_ThenResult_ListContains_3() {
        //Arrange
        fib.range = 6;
        //Act
        int int_await = 3;
        //Assert
        Assertions.assertTrue(fib.getFibSeries().contains(int_await));
    }

    @Test
    public void TestgetFibSerieWhenRange_6_ThenResult_ListNotContains_4() {
        //Arrange
        fib.range = 6;
        //Act
        int int_not_await = 3;
        //Assert
        Assertions.assertFalse(fib.getFibSeries().contains(int_not_await));
    }

    @Test
    public void TestgetFibSerieWhenRange_6_ThenResult_ContainsList_0_1_1_2_3_5() {
        //Arrange
        fib.range = 6;
        //Act
        List<Integer> list_await = new ArrayList<>();
        list_await.add(0);
        list_await.add(1);
        list_await.add(1);
        list_await.add(2);
        list_await.add(3);
        list_await.add(5);
        //Assert
        Assertions.assertEquals(fib.getFibSeries(), list_await);
    }

    @Test
    public void TestgetFibSerieWhenRange_6_ThenResult_Ordered(){
        //Arrange
        fib.range = 6;
        //Act

        //Assert
        Assertions.assertEquals(fib.getFibSeries(), fib.getFibSeries().stream().sorted());

    }
}
