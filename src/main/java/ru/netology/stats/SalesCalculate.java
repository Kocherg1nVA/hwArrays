package ru.netology.stats;

public class SalesCalculate {


    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1;
    }

    public int summary(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i]; // суммируем количество продаж за каждый месяц
        }
        return (int) sum;
    }

    public int averageSalesValue(long[] sales) {

        long sum = summary(sales);
        long average = sum / sales.length; // вызываем метод summary и
        // рассчитываем среднее арифметическое значение продаж за все месяцы
        return (int) average;
    }

    public int monthsSalesOverAverage(long[] sales) {
        long count = 0; // счетчик месяцев, количество продаж в которых больше, чем среднее значение за год
        long average = averageSalesValue(sales); // среднее значение продаж за год

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > average) { // сравниваем среднее значение со значениями продаж в каждом месяце
                count++; // суммируем количество месяцев, продажи в которых больше среднего за год
            }
        }
        return (int) count;
    }

    public int monthsSalesUnderAverage(long[] sales) {
        long count = 0; // счетчик месяцев, количество продаж в которых меньше, чем среднее значение за год
        long average = averageSalesValue(sales); // среднее значение продаж за год

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < average) { //сравниваем среднее значение со значениями продаж в каждом месяце
                count++; // суммируем количество месяцев, продажи в которых меньше среднего за год
            }
        }
        return (int) count;
    }
}




