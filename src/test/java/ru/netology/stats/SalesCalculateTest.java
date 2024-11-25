package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesCalculateTest {

    @Test
    void minMonthTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxMonthTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void summaryTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.summary(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageSalesTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesValue(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsSalesOverAverageTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsSalesOverAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsSalesUnderAverageTest() {
        SalesCalculate service = new SalesCalculate();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsSalesUnderAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}

