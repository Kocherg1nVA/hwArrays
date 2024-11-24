package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class salesCalculateTest {

    @Test
    void minMonthTest() {
        salesCalculate service = new salesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

@Test
    void maxMonthTest(){
        salesCalculate service = new salesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
@Test
    void summaryTest() {
        salesCalculate service = new salesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.summary(sales);
        Assertions.assertEquals(expected, actual);
    }
@Test
    void averageSalesTest(){
        salesCalculate service = new salesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesValue(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsSalesOverAverageTest(){
        salesCalculate service = new salesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsSalesOverAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsSalesUnderAverageTest(){
        salesCalculate service = new salesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsSalesUnderAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}

