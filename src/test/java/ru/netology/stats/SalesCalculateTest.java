package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesCalculateTest {

    @Test
    void minMonthTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxMonthTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void summaryTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.summary(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageSalesTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSalesValue(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsSalesOverAverageTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsSalesOverAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsSalesUnderAverageTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsSalesUnderAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}

