package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageSum(long[] sales) {
        long sum = calculateSum(sales);
        long averageSum = sum / sales.length;

        return averageSum;
    }

    public int calculateMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateMonthSaleBelowAverange(long[] sales) {
        long currentMin = 0;
        long averageSum = calculateAverageSum(sales);
        for (long sale : sales) {
            if (sale < averageSum) {
                currentMin = currentMin + 1;
            }
        }
        return (int) currentMin;
    }

    public int calculateMonthSaleMoreAveange(long[] sales) {
        long currentMax = 0;
        long averageSum = calculateAverageSum(sales);
        for (long sale : sales) {
            if (sale > averageSum) {
                currentMax = currentMax + 1;
            }
        }
        return (int) currentMax;

    }
}


